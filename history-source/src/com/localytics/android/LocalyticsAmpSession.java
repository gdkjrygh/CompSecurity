// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.localytics.android:
//            LocalyticsSession, AmpSessionHandler, AmpConstants, Constants, 
//            AmpDialogFragment, DatapointHelper, LocalyticsProvider, SessionHandler

public class LocalyticsAmpSession extends LocalyticsSession
{

    private static final String PUSH_API_URL_TEMPLATE = "http://pushapi.localytics.com/push_test?platform=android&type=prod&campaign=%s&creative=%s&token=%s&install_id=%s";

    public LocalyticsAmpSession(Context context)
    {
        this(context, null);
    }

    public LocalyticsAmpSession(Context context, String s)
    {
        this(context, s, null);
    }

    LocalyticsAmpSession(Context context, String s, String s1)
    {
        super(context, s, s1);
        sSessionHandlerThread.setName(com/localytics/android/AmpSessionHandler.getSimpleName());
        createLocalyticsDirectory(context);
    }

    private boolean createLocalyticsDirectory(Context context)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(context.getFilesDir().getAbsolutePath());
        stringbuilder.append(File.separator);
        stringbuilder.append(".localytics");
        context = new File(stringbuilder.toString());
        return context.mkdirs() || context.isDirectory();
    }

    public static boolean isTestModeEnabled()
    {
        return AmpConstants.isTestModeEnabled();
    }

    private static Bitmap scaleDownBitmap(Bitmap bitmap, float f)
    {
        int i = Math.max(bitmap.getWidth(), bitmap.getHeight());
        float f1 = (float)bitmap.getWidth() / (float)bitmap.getHeight();
        if ((float)i > f)
        {
            if (bitmap.getWidth() >= bitmap.getHeight())
            {
                bitmap = Bitmap.createScaledBitmap(bitmap, (int)f, (int)(f / f1 + 0.5F), true);
            } else
            {
                bitmap = Bitmap.createScaledBitmap(bitmap, (int)(f * f1 + 0.5F), (int)f, true);
            }
            if (bitmap == null && Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", String.format("Cannot scale down the new dismiss button image.", new Object[0]));
            }
            return bitmap;
        } else
        {
            return bitmap;
        }
    }

    public static void setDismissButtonImage(Resources resources, int i)
    {
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inPurgeable = true;
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        obj = BitmapFactory.decodeResource(resources, i, ((android.graphics.BitmapFactory.Options) (obj)));
        if (obj == null)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", String.format("Cannot load the new dismiss button image. Is the resource id corrected?", new Object[0]));
            }
            AmpDialogFragment.setDismissButtonImage(null);
            return;
        }
        resources = scaleDownBitmap(((Bitmap) (obj)), TypedValue.applyDimension(1, 40F, resources.getDisplayMetrics()));
        if (resources != obj)
        {
            ((Bitmap) (obj)).recycle();
        }
        AmpDialogFragment.setDismissButtonImage(resources);
    }

    public static void setDismissButtonImage(Resources resources, Bitmap bitmap)
    {
        Object obj = null;
        if (bitmap != null)
        {
            resources = scaleDownBitmap(bitmap, TypedValue.applyDimension(1, 40F, resources.getDisplayMetrics()));
            obj = resources;
            if (resources == bitmap)
            {
                obj = bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, false);
            }
        }
        AmpDialogFragment.setDismissButtonImage(((Bitmap) (obj)));
    }

    public static void setTestModeEnabled(boolean flag)
    {
        AmpConstants.setTestModeEnabled(flag);
    }

    public void ampTrigger(String s)
    {
        ampTrigger(s, null);
    }

    public void ampTrigger(final String eventString, final Map attributes)
    {
        eventString = String.format("%s:%s", new Object[] {
            mContext.getPackageName(), eventString
        });
        final TreeMap remappedAttributes = new TreeMap();
        if (attributes != null)
        {
            String s = mContext.getPackageName();
            java.util.Map.Entry entry;
            for (Iterator iterator = attributes.entrySet().iterator(); iterator.hasNext(); remappedAttributes.put(String.format("%s:%s", new Object[] {
    s, entry.getKey()
}), entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        final AmpSessionHandler handler = (AmpSessionHandler)getSessionHandler();
        handler.sendMessage(handler.obtainMessage(4, new Runnable() {

            final LocalyticsAmpSession this$0;
            final Map val$attributes;
            final String val$eventString;
            final AmpSessionHandler val$handler;
            final TreeMap val$remappedAttributes;

            public void run()
            {
                AmpSessionHandler ampsessionhandler = handler;
                AmpSessionHandler ampsessionhandler1 = handler;
                String s1 = eventString;
                Object obj;
                if (attributes == null)
                {
                    obj = null;
                } else
                {
                    obj = remappedAttributes;
                }
                ampsessionhandler.sendMessage(ampsessionhandler1.obtainMessage(13, ((Object) (new Object[] {
                    s1, obj
                }))));
            }

            
            {
                this$0 = LocalyticsAmpSession.this;
                handler = ampsessionhandler;
                eventString = s;
                attributes = map;
                remappedAttributes = treemap;
                super();
            }
        }));
    }

    public void attach(FragmentActivity fragmentactivity)
    {
        if (fragmentactivity == null)
        {
            throw new IllegalArgumentException("attached activity cannot be null");
        }
        AmpSessionHandler ampsessionhandler = (AmpSessionHandler)getSessionHandler();
        ampsessionhandler.setFragmentManager(fragmentactivity.getSupportFragmentManager());
        if (isTestModeEnabled())
        {
            ampsessionhandler.sendMessage(ampsessionhandler.obtainMessage(15));
        }
    }

    protected SessionHandler createSessionHandler(Context context, String s, Looper looper)
    {
        return new AmpSessionHandler(context, s, looper);
    }

    public void detach()
    {
        ((AmpSessionHandler)getSessionHandler()).setFragmentManager(null);
    }

    public void handleIntent(Intent intent)
    {
        handleIntent(intent, null);
    }

    public void handleIntent(final Intent campaign, final String apiKey)
    {
        Object obj = apiKey;
        if (campaign == null)
        {
            throw new IllegalArgumentException("intent cannot be null");
        }
        apiKey = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = DatapointHelper.getLocalyticsAppKeyOrNull(mContext);
            apiKey = ((String) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                throw new IllegalArgumentException("key cannot be null or empty");
            }
        }
        obj = campaign.getData();
        if (obj != null && ((Uri) (obj)).getScheme() != null && ((Uri) (obj)).getScheme().equals((new StringBuilder()).append("amp").append(apiKey).toString()))
        {
            campaign = ((Uri) (obj)).getPath().substring(1);
            obj = ((Uri) (obj)).getHost();
            String as[] = campaign.split("[/]");
            if (as != null && as.length != 0 && !TextUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).equalsIgnoreCase("testMode"))
            {
                if (as[0].equalsIgnoreCase("enabled"))
                {
                    setTestModeEnabled(true);
                    return;
                }
                if (as[0].equalsIgnoreCase("launch") && as[1].equalsIgnoreCase("push"))
                {
                    campaign = as[2];
                    final String creative = as[3];
                    final LocalyticsProvider provider = LocalyticsProvider.getInstance(mContext, apiKey);
                    if (!TextUtils.isEmpty(campaign) && !TextUtils.isEmpty(creative))
                    {
                        (new AsyncTask() {

                            final String pushRegID = getPushRegistrationID();
                            final LocalyticsAmpSession this$0;
                            final String val$apiKey;
                            final String val$campaign;
                            final String val$creative;
                            final LocalyticsProvider val$provider;

                            private String getPushRegistrationID()
                            {
                                return (String)provider.runBatchTransaction(new Callable() {

                                    final _cls3 this$1;

                                    public Object call()
                                        throws Exception
                                    {
                                        Cursor cursor;
                                        String s;
                                        cursor = null;
                                        s = null;
                                        Cursor cursor1 = provider.query("info", null, null, null, null);
                                        cursor = cursor1;
                                        if (!cursor1.moveToFirst())
                                        {
                                            break MISSING_BLOCK_LABEL_49;
                                        }
                                        cursor = cursor1;
                                        s = cursor1.getString(cursor1.getColumnIndexOrThrow("registration_id"));
                                        if (cursor1 != null)
                                        {
                                            cursor1.close();
                                        }
                                        return s;
                                        Exception exception;
                                        exception;
                                        if (cursor != null)
                                        {
                                            cursor.close();
                                        }
                                        throw exception;
                                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                                });
                            }

                            protected volatile Object doInBackground(Object aobj[])
                            {
                                return doInBackground((Void[])aobj);
                            }

                            protected transient Void doInBackground(Void avoid[])
                            {
                                provider.runBatchTransaction(new Runnable() {

                                    final _cls3 this$1;

                                    public void run()
                                    {
                                        String s;
                                        String s1;
                                        Object obj;
                                        if (TextUtils.isEmpty(pushRegID))
                                        {
                                            break MISSING_BLOCK_LABEL_204;
                                        }
                                        s = SessionHandler.getInstallationId(provider, apiKey);
                                        s1 = (String)provider.getUserIdAndType().get("id");
                                        obj = String.format("http://pushapi.localytics.com/push_test?platform=android&type=prod&campaign=%s&creative=%s&token=%s&install_id=%s", new Object[] {
                                            campaign, creative, pushRegID, s
                                        });
                                        Object obj1 = new BasicHttpParams();
                                        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj1)), 5000);
                                        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj1)), 5000);
                                        obj1 = new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj1)));
                                        obj = new HttpGet(((String) (obj)));
                                        ((HttpGet) (obj)).addHeader("x-install-id", s);
                                        ((HttpGet) (obj)).addHeader("x-app-id", apiKey);
                                        ((HttpGet) (obj)).addHeader("x-client-version", "androida_2.72");
                                        ((HttpGet) (obj)).addHeader("x-app-version", DatapointHelper.getAppVersion(mContext));
                                        ((HttpGet) (obj)).addHeader("x-customer-id", s1);
                                        ((HttpClient) (obj1)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
                                        return;
                                        IOException ioexception;
                                        ioexception;
                                        ioexception.printStackTrace();
                                        return;
                                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                                });
                                return null;
                            }

                            protected void onPreExecute()
                            {
                                String s;
                                if (!TextUtils.isEmpty(pushRegID))
                                {
                                    s = "Push Test Activated\nYou should receive a notification soon.";
                                } else
                                {
                                    s = "App isn't registered with GCM to receive push notifications. Please make sure that this.localyticsSession.registerPush(<PROJECT_ID>) has been called.";
                                }
                                Toast.makeText(mContext, s, 1).show();
                            }

            
            {
                this$0 = LocalyticsAmpSession.this;
                provider = localyticsprovider;
                apiKey = s;
                campaign = s1;
                creative = s2;
                super();
            }
                        }).execute(new Void[0]);
                        return;
                    }
                }
            }
        }
    }

    protected void uploadAnalytics()
    {
        final AmpSessionHandler handler = (AmpSessionHandler)getSessionHandler();
        handler.sendMessage(handler.obtainMessage(4, new Runnable() {

            final LocalyticsAmpSession this$0;
            final AmpSessionHandler val$handler;

            public void run()
            {
                handler.sendMessage(handler.obtainMessage(13, ((Object) (new Object[] {
                    "AMP Loaded", null
                }))));
            }

            
            {
                this$0 = LocalyticsAmpSession.this;
                handler = ampsessionhandler;
                super();
            }
        }));
    }
}
