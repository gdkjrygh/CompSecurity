// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.CommandLine;
import org.xwalk.core.internal.extension.BuiltinXWalkExtensions;

// Referenced classes of package org.xwalk.core.internal:
//            ReflectionHelper, MixedContext, XWalkInternalResources, XWalkViewDelegate, 
//            XWalkContent, XWalkClient, XWalkWebChromeClient, XWalkUIClientInternal, 
//            XWalkResourceClientInternal, XWalkDownloadListenerImpl, XWalkNavigationHandlerImpl, XWalkNotificationServiceImpl, 
//            XWalkPathHelper, XWalkPreferencesInternal, XWalkNavigationHistoryInternal, XWalkSettings, 
//            DownloadListener, XWalkNavigationHandler, XWalkNotificationService

public class XWalkViewInternal extends FrameLayout
{
    private class XWalkActivityStateListener
        implements org.chromium.base.ApplicationStatus.ActivityStateListener
    {

        WeakReference mXWalkViewRef;
        final XWalkViewInternal this$0;

        public void onActivityStateChange(Activity activity, int i)
        {
            XWalkViewInternal xwalkviewinternal = (XWalkViewInternal)mXWalkViewRef.get();
            if (xwalkviewinternal == null)
            {
                return;
            } else
            {
                xwalkviewinternal.onActivityStateChange(activity, i);
                return;
            }
        }

        XWalkActivityStateListener(XWalkViewInternal xwalkviewinternal1)
        {
            this$0 = XWalkViewInternal.this;
            super();
            mXWalkViewRef = new WeakReference(xwalkviewinternal1);
        }
    }


    static final boolean $assertionsDisabled;
    public static final int INPUT_FILE_REQUEST_CODE = 1;
    static final String PLAYSTORE_DETAIL_URI = "market://details?id=";
    public static final int RELOAD_IGNORE_CACHE = 1;
    public static final int RELOAD_NORMAL = 0;
    private static final String TAG = org/xwalk/core/internal/XWalkViewInternal.getSimpleName();
    private Activity mActivity;
    private XWalkActivityStateListener mActivityStateListener;
    private String mCameraPhotoPath;
    private XWalkContent mContent;
    private Context mContext;
    private ValueCallback mFilePathCallback;
    private boolean mIsHidden;

    public XWalkViewInternal(Context context, Activity activity)
    {
        super(convertContext(context), null);
        checkThreadSafety();
        mActivity = activity;
        mContext = getContext();
        init(mContext, null);
    }

    public XWalkViewInternal(Context context, AttributeSet attributeset)
    {
        super(convertContext(context), attributeset);
        checkThreadSafety();
        mActivity = (Activity)context;
        mContext = getContext();
        init(mContext, attributeset);
    }

    private static void checkThreadSafety()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new RuntimeException(new Throwable((new StringBuilder()).append("Warning: A XWalkViewInternal method was called on thread '").append(Thread.currentThread().getName()).append("'. ").append("All XWalkViewInternal methods must be called on the UI thread. ").toString()));
        } else
        {
            return;
        }
    }

    private static Context convertContext(Context context)
    {
        Context context1 = ReflectionHelper.getBridgeContext();
        if (context1 == null || context == null || context1.getPackageName().equals(context.getPackageName()))
        {
            return context;
        } else
        {
            return new MixedContext(context1, context);
        }
    }

    private File createImageFile()
        throws IOException
    {
        String s = (new SimpleDateFormat("yyyyMMdd_HHmmss")).format(new Date());
        return File.createTempFile((new StringBuilder()).append("JPEG_").append(s).append("_").toString(), ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    private void init(Context context, AttributeSet attributeset)
    {
        XWalkInternalResources.resetIds(context);
        try
        {
            XWalkViewDelegate.init(this);
            mActivityStateListener = new XWalkActivityStateListener(this);
            ApplicationStatus.registerStateListenerForActivity(mActivityStateListener, getActivity());
        }
        catch (final Object err)
        {
            attributeset = ((AttributeSet) (err));
            do
            {
                if (attributeset == null)
                {
                    throw new RuntimeException(((Throwable) (err)));
                }
                if (attributeset instanceof UnsatisfiedLinkError)
                {
                    err = (UnsatisfiedLinkError)attributeset;
                    final Activity activity = getActivity();
                    final String packageName = context.getPackageName();
                    if (XWalkViewDelegate.isRunningOnIA())
                    {
                        attributeset = "Intel";
                    } else
                    {
                        attributeset = "ARM";
                    }
                    context = context.getString(R.string.cpu_arch_mismatch_message, new Object[] {
                        attributeset
                    });
                    attributeset = new android.app.AlertDialog.Builder(activity);
                    attributeset.setTitle(R.string.cpu_arch_mismatch_title).setMessage(context).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                        final XWalkViewInternal this$0;
                        final Activity val$activity;

                        public void onCancel(DialogInterface dialoginterface)
                        {
                            activity.finish();
                        }

            
            {
                this$0 = XWalkViewInternal.this;
                activity = activity1;
                super();
            }
                    }).setPositiveButton(R.string.goto_store_button_label, new android.content.DialogInterface.OnClickListener() {

                        final XWalkViewInternal this$0;
                        final Activity val$activity;
                        final String val$packageName;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(packageName).toString())));
                            activity.finish();
                        }

            
            {
                this$0 = XWalkViewInternal.this;
                activity = activity1;
                packageName = s;
                super();
            }
                    }).setNeutralButton(R.string.report_feedback_button_label, new android.content.DialogInterface.OnClickListener() {

                        final XWalkViewInternal this$0;
                        final Activity val$activity;
                        final UnsatisfiedLinkError val$err;
                        final String val$packageName;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface = new ApplicationErrorReport();
                            dialoginterface.type = 1;
                            Object obj = packageName;
                            dialoginterface.processName = ((String) (obj));
                            dialoginterface.packageName = ((String) (obj));
                            obj = new android.app.ApplicationErrorReport.CrashInfo();
                            obj.exceptionClassName = err.getClass().getSimpleName();
                            obj.exceptionMessage = "CPU architecture mismatch";
                            Object obj1 = new StringWriter();
                            PrintWriter printwriter = new PrintWriter(((java.io.Writer) (obj1)));
                            err.printStackTrace(printwriter);
                            obj.stackTrace = ((StringWriter) (obj1)).toString();
                            obj1 = err.getStackTrace()[0];
                            obj.throwClassName = ((StackTraceElement) (obj1)).getClassName();
                            obj.throwFileName = ((StackTraceElement) (obj1)).getFileName();
                            obj.throwLineNumber = ((StackTraceElement) (obj1)).getLineNumber();
                            obj.throwMethodName = ((StackTraceElement) (obj1)).getMethodName();
                            dialoginterface.crashInfo = ((android.app.ApplicationErrorReport.CrashInfo) (obj));
                            dialoginterface.systemApp = false;
                            dialoginterface.time = System.currentTimeMillis();
                            obj = new Intent("android.intent.action.APP_ERROR");
                            ((Intent) (obj)).putExtra("android.intent.extra.BUG_REPORT", dialoginterface);
                            activity.startActivity(((Intent) (obj)));
                            activity.finish();
                        }

            
            {
                this$0 = XWalkViewInternal.this;
                packageName = s;
                err = unsatisfiedlinkerror;
                activity = activity1;
                super();
            }
                    });
                    attributeset.create().show();
                    return;
                }
                if (attributeset.getCause() == null || attributeset.getCause().equals(attributeset))
                {
                    throw new RuntimeException(((Throwable) (err)));
                }
                attributeset = attributeset.getCause();
            } while (true);
        }
        initXWalkContent(context, attributeset);
    }

    private void initXWalkContent(Context context, AttributeSet attributeset)
    {
        mIsHidden = false;
        mContent = new XWalkContent(context, attributeset, this);
        addView(mContent, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setXWalkClient(new XWalkClient(this));
        setXWalkWebChromeClient(new XWalkWebChromeClient(this));
        setUIClient(new XWalkUIClientInternal(this));
        setResourceClient(new XWalkResourceClientInternal(this));
        setDownloadListener(new XWalkDownloadListenerImpl(context));
        setNavigationHandler(new XWalkNavigationHandlerImpl(context));
        setNotificationService(new XWalkNotificationServiceImpl(context, this));
        if (!CommandLine.getInstance().hasSwitch("disable-xwalk-extensions"))
        {
            BuiltinXWalkExtensions.load(context, getActivity());
        } else
        {
            XWalkPreferencesInternal.setValue("enable-extensions", false);
        }
        XWalkPathHelper.initialize();
        XWalkPathHelper.setCacheDirectory(mContext.getApplicationContext().getCacheDir().getPath());
        context = Environment.getExternalStorageState();
        if ("mounted".equals(context) || "mounted_ro".equals(context))
        {
            context = mContext.getApplicationContext().getExternalCacheDir();
            if (context != null)
            {
                XWalkPathHelper.setExternalCacheDirectory(context.getPath());
            }
        }
    }

    private void onActivityStateChange(Activity activity, int i)
    {
        if (!$assertionsDisabled && getActivity() != activity)
        {
            throw new AssertionError();
        }
        switch (i)
        {
        default:
            return;

        case 2: // '\002'
            onShow();
            return;

        case 4: // '\004'
            pauseTimers();
            return;

        case 3: // '\003'
            resumeTimers();
            return;

        case 6: // '\006'
            onDestroy();
            return;

        case 5: // '\005'
            onHide();
            return;
        }
    }

    public void addJavascriptInterface(Object obj, String s)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.addJavascriptInterface(obj, s);
            return;
        }
    }

    boolean canGoBack()
    {
        if (mContent == null)
        {
            return false;
        } else
        {
            checkThreadSafety();
            return mContent.canGoBack();
        }
    }

    boolean canGoForward()
    {
        if (mContent == null)
        {
            return false;
        } else
        {
            checkThreadSafety();
            return mContent.canGoForward();
        }
    }

    public void clearCache(boolean flag)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.clearCache(flag);
            return;
        }
    }

    void clearHistory()
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.clearHistory();
            return;
        }
    }

    public void completeWindowCreation(XWalkViewInternal xwalkviewinternal)
    {
        XWalkContent xwalkcontent = mContent;
        if (xwalkviewinternal == null)
        {
            xwalkviewinternal = null;
        } else
        {
            xwalkviewinternal = xwalkviewinternal.mContent;
        }
        xwalkcontent.supplyContentsForPopup(xwalkviewinternal);
    }

    void destroy()
    {
        if (mContent == null)
        {
            return;
        } else
        {
            ApplicationStatus.unregisterActivityStateListener(mActivityStateListener);
            mActivityStateListener = null;
            mContent.destroy();
            disableRemoteDebugging();
            return;
        }
    }

    void disableRemoteDebugging()
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.disableRemoteDebugging();
            return;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && keyevent.getKeyCode() == 4)
        {
            if (hasEnteredFullscreen())
            {
                leaveFullscreen();
                return true;
            }
            if (canGoBack())
            {
                goBack();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyevent);
    }

    public void enableRemoteDebugging()
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.enableRemoteDebugging();
            return;
        }
    }

    public void evaluateJavascript(String s, ValueCallback valuecallback)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.evaluateJavascript(s, valuecallback);
            return;
        }
    }

    public String getAPIVersion()
    {
        return "4.1";
    }

    public Activity getActivity()
    {
        if (mActivity != null)
        {
            return mActivity;
        }
        if (getContext() instanceof Activity)
        {
            return (Activity)getContext();
        }
        if (!$assertionsDisabled)
        {
            throw new AssertionError();
        } else
        {
            return null;
        }
    }

    public int getContentID()
    {
        if (mContent == null)
        {
            return -1;
        } else
        {
            return mContent.getRoutingID();
        }
    }

    public XWalkNavigationHistoryInternal getNavigationHistory()
    {
        if (mContent == null)
        {
            return null;
        } else
        {
            checkThreadSafety();
            return mContent.getNavigationHistory();
        }
    }

    public String getOriginalUrl()
    {
        if (mContent == null)
        {
            return null;
        } else
        {
            checkThreadSafety();
            return mContent.getOriginalUrl();
        }
    }

    public Uri getRemoteDebuggingUrl()
    {
        if (mContent != null)
        {
            checkThreadSafety();
            String s = mContent.getRemoteDebuggingUrl();
            if (s != null && !s.isEmpty())
            {
                return Uri.parse(s);
            }
        }
        return null;
    }

    public XWalkSettings getSettings()
    {
        if (mContent == null)
        {
            return null;
        } else
        {
            checkThreadSafety();
            return mContent.getSettings();
        }
    }

    public String getTitle()
    {
        if (mContent == null)
        {
            return null;
        } else
        {
            checkThreadSafety();
            return mContent.getTitle();
        }
    }

    public String getUrl()
    {
        if (mContent == null)
        {
            return null;
        } else
        {
            checkThreadSafety();
            return mContent.getUrl();
        }
    }

    public Context getViewContext()
    {
        return mContext;
    }

    public String getXWalkVersion()
    {
        if (mContent == null)
        {
            return null;
        } else
        {
            return mContent.getXWalkVersion();
        }
    }

    void goBack()
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.goBack();
            return;
        }
    }

    void goForward()
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.goForward();
            return;
        }
    }

    public boolean hasEnteredFullscreen()
    {
        if (mContent == null)
        {
            return false;
        } else
        {
            checkThreadSafety();
            return mContent.hasEnteredFullscreen();
        }
    }

    boolean isOwnerActivityRunning()
    {
        return ApplicationStatus.getStateForActivity(getActivity()) != 6;
    }

    public void leaveFullscreen()
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.exitFullscreen();
            return;
        }
    }

    public void load(String s, String s1)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.loadUrl(s, s1);
            return;
        }
    }

    public void loadAppFromManifest(String s, String s1)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.loadAppFromManifest(s, s1);
            return;
        }
    }

    void navigateTo(int i)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            mContent.navigateTo(i);
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (mContent == null)
        {
            return;
        }
        if (i != 1 || mFilePathCallback == null) goto _L2; else goto _L1
_L1:
        Uri uri;
        Object obj;
        obj = null;
        uri = obj;
        if (-1 != j) goto _L4; else goto _L3
_L3:
        if (intent != null) goto _L6; else goto _L5
_L5:
        uri = obj;
        if (mCameraPhotoPath != null)
        {
            uri = Uri.parse(mCameraPhotoPath);
        }
_L4:
        mFilePathCallback.onReceiveValue(uri);
        mFilePathCallback = null;
        return;
_L6:
        intent = intent.getDataString();
        uri = obj;
        if (intent != null)
        {
            uri = Uri.parse(intent);
        }
        if (true) goto _L4; else goto _L2
_L2:
        mContent.onActivityResult(i, j, intent);
        return;
    }

    public void onDestroy()
    {
        destroy();
    }

    public void onHide()
    {
        if (mContent == null || mIsHidden)
        {
            return;
        } else
        {
            mContent.onPause();
            mIsHidden = true;
            return;
        }
    }

    public boolean onNewIntent(Intent intent)
    {
        if (mContent == null)
        {
            return false;
        } else
        {
            return mContent.onNewIntent(intent);
        }
    }

    public void onShow()
    {
        if (mContent == null || !mIsHidden)
        {
            return;
        } else
        {
            mContent.onResume();
            mIsHidden = false;
            return;
        }
    }

    public void pauseTimers()
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.pauseTimers();
            return;
        }
    }

    public void reload(int i)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.reload(i);
            return;
        }
    }

    public boolean restoreState(Bundle bundle)
    {
        while (mContent == null || mContent.restoreState(bundle) == null) 
        {
            return false;
        }
        return true;
    }

    public void resumeTimers()
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.resumeTimers();
            return;
        }
    }

    public boolean saveState(Bundle bundle)
    {
        if (mContent == null)
        {
            return false;
        } else
        {
            mContent.saveState(bundle);
            return true;
        }
    }

    public void setDownloadListener(DownloadListener downloadlistener)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.setDownloadListener(downloadlistener);
            return;
        }
    }

    public void setNavigationHandler(XWalkNavigationHandler xwalknavigationhandler)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.setNavigationHandler(xwalknavigationhandler);
            return;
        }
    }

    public void setNetworkAvailable(boolean flag)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.setNetworkAvailable(flag);
            return;
        }
    }

    public void setNotificationService(XWalkNotificationService xwalknotificationservice)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.setNotificationService(xwalknotificationservice);
            return;
        }
    }

    void setOverlayVideoMode(boolean flag)
    {
        mContent.setOverlayVideoMode(flag);
    }

    public void setResourceClient(XWalkResourceClientInternal xwalkresourceclientinternal)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.setResourceClient(xwalkresourceclientinternal);
            return;
        }
    }

    public void setUIClient(XWalkUIClientInternal xwalkuiclientinternal)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.setUIClient(xwalkuiclientinternal);
            return;
        }
    }

    public void setXWalkClient(XWalkClient xwalkclient)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.setXWalkClient(xwalkclient);
            return;
        }
    }

    public void setXWalkWebChromeClient(XWalkWebChromeClient xwalkwebchromeclient)
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.setXWalkWebChromeClient(xwalkwebchromeclient);
            return;
        }
    }

    public boolean showFileChooser(ValueCallback valuecallback, String s, String s1)
    {
        mFilePathCallback = valuecallback;
        s1 = new Intent("android.media.action.IMAGE_CAPTURE");
        valuecallback = s1;
        if (s1.resolveActivity(getActivity().getPackageManager()) == null) goto _L2; else goto _L1
_L1:
        valuecallback = null;
        s = createImageFile();
        valuecallback = s;
        s1.putExtra("PhotoPath", mCameraPhotoPath);
        valuecallback = s;
_L3:
        Intent intent;
        Intent intent1;
        if (valuecallback != null)
        {
            mCameraPhotoPath = (new StringBuilder()).append("file:").append(valuecallback.getAbsolutePath()).toString();
            s1.putExtra("output", Uri.fromFile(valuecallback));
            valuecallback = s1;
        } else
        {
            valuecallback = null;
        }
_L2:
        s = new Intent("android.intent.action.GET_CONTENT");
        s.addCategory("android.intent.category.OPENABLE");
        s.setType("*/*");
        intent = new Intent("android.media.action.VIDEO_CAPTURE");
        intent1 = new Intent("android.provider.MediaStore.RECORD_SOUND");
        s1 = new ArrayList();
        s1.add(valuecallback);
        s1.add(intent);
        s1.add(intent1);
        valuecallback = new Intent("android.intent.action.CHOOSER");
        valuecallback.putExtra("android.intent.extra.INTENT", s);
        valuecallback.putExtra("android.intent.extra.TITLE", "Choose an action");
        valuecallback.putExtra("android.intent.extra.INITIAL_INTENTS", (android.os.Parcelable[])s1.toArray(new Intent[0]));
        getActivity().startActivityForResult(valuecallback, 1);
        return true;
        s;
        Log.e(TAG, "Unable to create Image File", s);
          goto _L3
    }

    public void stopLoading()
    {
        if (mContent == null)
        {
            return;
        } else
        {
            checkThreadSafety();
            mContent.stopLoading();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!org/xwalk/core/internal/XWalkViewInternal.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

}
