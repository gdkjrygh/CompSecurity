// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.BaseToast;
import com.pinterest.activity.task.toast.PinnedToast;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.PApplication;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.kit.notification.NotificationHelper;
import com.pinterest.kit.utils.IOUtils;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.pushnotification.PushNotification;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.service:
//            PinterestWorkerService

public class PinUploader
{

    private static final int CSR_TOAST_DURATION = 5000;
    private PinterestWorkerService _hostService;
    private final Object _lock = new Object();
    private int _retryCount;
    private boolean _uploadInProgress;
    private List _uploads;
    private com.pinterest.api.remote.PinApi.PinApiResponse onPinUpload;

    public PinUploader(PinterestWorkerService pinterestworkerservice)
    {
        _uploadInProgress = false;
        onPinUpload = new _cls2();
        _hostService = pinterestworkerservice;
    }

    private void delayedRetry()
    {
        (new Timer()).schedule(new _cls3(), _retryCount * 10000);
    }

    public static String getPendingJSONFolder()
    {
        File file = new File(PApplication.context().getFilesDir(), "pending");
        if (!file.exists())
        {
            file.mkdir();
        }
        return file.getAbsolutePath();
    }

    public static File getPendingJsonFile()
    {
        String s = String.format("%s/%d", new Object[] {
            getPendingJSONFolder(), Long.valueOf(System.currentTimeMillis() / 1000L)
        });
        File file = new File(s);
        if (!file.exists())
        {
            try
            {
                file.createNewFile();
            }
            catch (IOException ioexception) { }
        }
        return new File(s);
    }

    private List getPendingPins()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new File(getPendingJSONFolder());
        if (((File) (obj)).exists())
        {
            obj = new LinkedHashSet(new ArrayList(Arrays.asList(((File) (obj)).listFiles())));
            if (((Set) (obj)).size() > 0)
            {
                arraylist.addAll(((java.util.Collection) (obj)));
                Collections.reverse(arraylist);
                ((Set) (obj)).clear();
            }
        }
        return Collections.synchronizedList(arraylist);
    }

    private Notification getRichNotification(String s, String s1, long l, Pin pin)
    {
        Object obj = new Navigation(Location.PIN, pin);
        Object obj1 = ActivityHelper.getHomeIntent(com.pinterest.base.Application.context());
        ((Intent) (obj1)).putExtra("com.pinterest.EXTRA_PENDING_TASK", ((android.os.Parcelable) (obj)));
        obj = PendingIntent.getActivity(_hostService, 0, ((Intent) (obj1)), 0x8000000);
        obj1 = (new android.support.v4.app.NotificationCompat.Builder(_hostService)).setContentTitle(s).setContentText(s1).setSmallIcon(0x7f0201f7).setOnlyAlertOnce(true).setContentIntent(((PendingIntent) (obj))).setAutoCancel(true);
        obj = ImageCache.getBitmapBlocking(pin.getBoard().getImageCoverThumbnail(), false);
        s = ((String) (obj));
        if (obj != null)
        {
            s = Bitmap.createScaledBitmap(((Bitmap) (obj)), PushNotification.a, PushNotification.a, true);
        }
        if (s != null)
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj1)).setLargeIcon(s);
        }
        obj = PushNotification.a(pin);
        if (TextUtils.isEmpty(pin.getImageLargeUrl()))
        {
            s = pin.getImageMediumUrl();
        } else
        {
            s = pin.getImageLargeUrl();
        }
        s = ImageCache.getBitmapBlocking(s, true, ((android.graphics.Rect) (obj)));
        if (s == null)
        {
            return ((android.support.v4.app.NotificationCompat.Builder) (obj1)).build();
        } else
        {
            return (new android.support.v4.app.NotificationCompat.BigPictureStyle(((android.support.v4.app.NotificationCompat.Builder) (obj1)))).setSummaryText(s1).bigPicture(s).build();
        }
    }

    private Thread newUploadThread()
    {
        return new Thread(new _cls1());
    }

    private void purgeCurrentPin()
    {
        synchronized (_lock)
        {
            ((File)_uploads.get(0)).delete();
            _uploads.remove(0);
            _uploadInProgress = false;
            _retryCount = 0;
            _lock.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void showNotification(int i)
    {
        Notification notification = NotificationHelper.getNotification(Resources.string(0x7f07005d), Resources.string(i));
        ((NotificationManager)com.pinterest.base.Application.context().getSystemService("notification")).notify(0, notification);
    }

    private void showNotification(Pin pin)
    {
        showNotification(pin, null);
    }

    private void showNotification(Pin pin, BaseToast basetoast)
    {
        Object obj = Resources.string(0x7f07005d);
        long l = System.currentTimeMillis();
        if (pin != null)
        {
            obj = getRichNotification(((String) (obj)), Resources.string(0x7f0703ae, new Object[] {
                pin.getBoard().getName()
            }), l, pin);
            if (basetoast == null)
            {
                Events.post(new ToastEvent(new PinnedToast(pin)));
                basetoast = ((BaseToast) (obj));
            } else
            {
                Events.post(new ToastEvent(basetoast));
                basetoast = ((BaseToast) (obj));
            }
        } else
        {
            basetoast = NotificationHelper.getNotification(((String) (obj)), Resources.string(0x7f07041e), l);
        }
        ((NotificationManager)com.pinterest.base.Application.context().getSystemService("notification")).notify(0, basetoast);
        Events.postSticky(new com.pinterest.events.FeedEvents.MadeNewPin(pin));
        purgeCurrentPin();
    }

    private boolean uploadJsonPin(File file)
    {
        com.pinterest.api.remote.PinApi.PinSubmitParams pinsubmitparams;
        pinsubmitparams = com.pinterest.api.remote.PinApi.PinSubmitParams.a(new PinterestJsonObject(IOUtils.loadFileString(file)));
        if (!StringUtils.isNotEmpty(pinsubmitparams.m))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        file = new CsrUploadHandlerWrapper(pinsubmitparams.m);
_L1:
        PinApi.a(pinsubmitparams, file);
        return true;
        try
        {
            file = onPinUpload;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
          goto _L1
    }

    public Runnable startContinuousUpload()
    {
        _uploads = getPendingPins();
        return newUploadThread();
    }



/*
    static List access$002(PinUploader pinuploader, List list)
    {
        pinuploader._uploads = list;
        return list;
    }

*/








/*
    static boolean access$202(PinUploader pinuploader, boolean flag)
    {
        pinuploader._uploadInProgress = flag;
        return flag;
    }

*/







/*
    static PinterestWorkerService access$702(PinUploader pinuploader, PinterestWorkerService pinterestworkerservice)
    {
        pinuploader._hostService = pinterestworkerservice;
        return pinterestworkerservice;
    }

*/



/*
    static int access$802(PinUploader pinuploader, int i)
    {
        pinuploader._retryCount = i;
        return i;
    }

*/


/*
    static int access$808(PinUploader pinuploader)
    {
        int i = pinuploader._retryCount;
        pinuploader._retryCount = i + 1;
        return i;
    }

*/

    private class _cls2 extends com.pinterest.api.remote.PinApi.PinApiResponse
    {

        final PinUploader this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            throwable = ((Throwable) (apiresponse.getData()));
            if ((throwable instanceof PinterestJsonObject) && ((PinterestJsonObject)throwable).a("param_name", "").equalsIgnoreCase("sdk_client_id"))
            {
                _retryCount = 10;
                com.pinterest.base.Application.showToast(0x7f0704c7);
                NotificationHelper.cancelNotifPinUpload();
                purgeCurrentPin();
                return;
            }
            if (_retryCount > 3)
            {
                PLog.log("Upload failed entirely, purging :(", new Object[0]);
                showNotification(0x7f0703ac);
                purgeCurrentPin();
                return;
            } else
            {
                delayedRetry();
                return;
            }
        }

        public void onStart()
        {
            super.onStart();
            int i = 
// JavaClassFileOutputException: get_constant: invalid tag

        public void onSuccess(Pin pin)
        {
            onSuccess(pin);
            Pinalytics.a(EventType.PIN_CREATE, pin.getUid());
            if (pin != null && pin.getBoard() != null)
            {
                (new ShowNotifTask(null)).execute(new Pin[] {
                    pin
                });
            }
        }

        _cls2()
        {
            this$0 = PinUploader.this;
            super();
        }

        private class ShowNotifTask extends AsyncTask
        {

            final PinUploader this$0;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Pin[])aobj);
            }

            protected transient Void doInBackground(Pin apin[])
            {
                showNotification(apin[0]);
                return null;
            }

            private ShowNotifTask()
            {
                this$0 = PinUploader.this;
                AsyncTask();
            }

            ShowNotifTask(_cls1 _pcls1)
            {
                ShowNotifTask();
            }
        }

    }


    private class _cls3 extends TimerTask
    {

        final PinUploader this$0;

        public void run()
        {
            _uploadInProgress = false;
            synchronized (_lock)
            {
                _lock.notifyAll();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls3()
        {
            this$0 = PinUploader.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final PinUploader this$0;

        public void run()
        {
            if (_uploads == null)
            {
                return;
            }
            PLog.log("Upload task started!", new Object[0]);
            Object obj = _lock;
            obj;
            JVM INSTR monitorenter ;
_L3:
            Exception exception;
            if (_uploads.size() <= 0)
            {
                break MISSING_BLOCK_LABEL_204;
            }
            if (_uploadInProgress)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            if (_uploads != null && _uploads.size() != 0)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            return;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            if (!uploadJsonPin((File)_uploads.get(0)))
            {
                break MISSING_BLOCK_LABEL_176;
            }
            _uploadInProgress = true;
_L1:
            boolean flag = _uploadInProgress;
            if (flag)
            {
                try
                {
                    PLog.log("Upload in progress, waiting...", new Object[0]);
                    _lock.wait();
                    _uploads = getPendingPins();
                }
                catch (Exception exception1) { }
                finally { }
            }
            continue; /* Loop/switch isn't completed */
            PLog.log("Upload failed entirely, purging :(", new Object[0]);
            showNotification(0x7f0703ac);
            purgeCurrentPin();
              goto _L1
            PLog.log("Upload task exiting and closing service! No more uploads!", new Object[0]);
            if (_hostService != null)
            {
                _hostService.onWorkerComplete();
                _hostService = null;
            }
            obj;
            JVM INSTR monitorexit ;
            return;
            if (true) goto _L3; else goto _L2
_L2:
        }

        _cls1()
        {
            this$0 = PinUploader.this;
            super();
        }
    }


    private class CsrUploadHandlerWrapper extends com.pinterest.api.remote.PinApi.PinApiResponse
    {

        private String _csrId;
        final PinUploader this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            onPinUpload.onFailure(throwable, apiresponse);
        }

        public void onStart()
        {
            onPinUpload.onStart();
        }

        public void onSuccess(final Pin pin)
        {
            super.onSuccess(pin);
            if (pin != null && pin.getBoard() != null)
            {
                HashMap hashmap = new HashMap();
                hashmap.put("csr_id", _csrId);
                Pinalytics.a(EventType.PIN_REPIN, pin.getUid(), hashmap);
                class _cls1 extends com.pinterest.api.remote.PinApi.PinFeedApiResponse
                {

                    final CsrUploadHandlerWrapper this$1;
                    final Pin val$pin;

                    public void onFailure(Throwable throwable, ApiResponse apiresponse)
                    {
                        super.onFailure(throwable, apiresponse);
                        (new ShowNotifTask(null)).execute(new Pin[] {
                            pin
                        });
                    }

                    public void onSuccess(Feed feed)
                    {
                        super.onSuccess(feed);
                        feed = new CsrNotificationTaskParams(pin, feed.getItems());
                        (new ShowCsrNotificationTask(null)).execute(new CsrNotificationTaskParams[] {
                            feed
                        });
                    }

                _cls1()
                {
                    this$1 = CsrUploadHandlerWrapper.this;
                    pin = pin1;
                    super();
                }

                    private class CsrNotificationTaskParams
                    {

                        public List domainPins;
                        public Pin pin;
                        final PinUploader this$0;

                        public CsrNotificationTaskParams(Pin pin1, List list)
                        {
                            this$0 = PinUploader.this;
                            super();
                            pin = pin1;
                            domainPins = list;
                        }
                    }


                    private class ShowCsrNotificationTask extends AsyncTask
                    {

                        final PinUploader this$0;

                        protected volatile Object doInBackground(Object aobj[])
                        {
                            return doInBackground((CsrNotificationTaskParams[])aobj);
                        }

                        protected transient Void doInBackground(CsrNotificationTaskParams acsrnotificationtaskparams[])
                        {
                            acsrnotificationtaskparams = acsrnotificationtaskparams[0];
                            CsrPinnedToast csrpinnedtoast = new CsrPinnedToast(((CsrNotificationTaskParams) (acsrnotificationtaskparams)).pin, ((CsrNotificationTaskParams) (acsrnotificationtaskparams)).domainPins);
                            csrpinnedtoast.setDuration(5000);
                            showNotification(((CsrNotificationTaskParams) (acsrnotificationtaskparams)).pin, csrpinnedtoast);
                            return null;
                        }

                        private ShowCsrNotificationTask()
                        {
                            this$0 = PinUploader.this;
                            super();
                        }

                        ShowCsrNotificationTask(_cls1 _pcls1)
                        {
                            this();
                        }
                    }

                }

                SiteApi.a(pin.getDomain(), new _cls1());
            }
        }

        public CsrUploadHandlerWrapper(String s)
        {
            this$0 = PinUploader.this;
            super();
            _csrId = s;
        }
    }

}
