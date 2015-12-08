// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

// Referenced classes of package com.millennialmedia.android:
//            MMSDK, MMAdImpl, MMLog, MMException, 
//            HttpGetRequest, RequestListener

static class _cls7.val.error
{

    public static final String INTENT_CALENDAR_EVENT = "calendar";
    public static final String INTENT_EMAIL = "email";
    public static final String INTENT_EXTERNAL_BROWSER = "browser";
    public static final String INTENT_MAPS = "geo";
    public static final String INTENT_MARKET = "market";
    public static final String INTENT_PHONE_CALL = "tel";
    public static final String INTENT_STREAMING_VIDEO = "streamingVideo";
    public static final String INTENT_TXT_MESSAGE = "sms";
    private static final String KEY_ERROR = "error";
    static final String KEY_INTENT_TYPE = "intentType";
    static final String KEY_INTERNAL_ID = "internalId";
    static final String KEY_PACKAGE_NAME = "packageName";
    protected static final String TAG = com/millennialmedia/android/MMSDK$Event.getName();

    static void adSingleTap(MMAdImpl mmadimpl)
    {
        if (mmadimpl != null)
        {
            MMSDK.runOnUiThread(new Runnable(mmadimpl) {

                final MMAdImpl val$adImpl;

                public void run()
                {
                    if (adImpl == null || adImpl.requestListener == null)
                    {
                        break MISSING_BLOCK_LABEL_36;
                    }
                    adImpl.requestListener.onSingleTap(adImpl.getCallingAd());
                    return;
                    Exception exception;
                    exception;
                    MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                    return;
                }

            
            {
                adImpl = mmadimpl;
                super();
            }
            });
            if (MMSDK.access$000())
            {
                sendIntent(mmadimpl.getContext(), new Intent("millennialmedia.action.ACTION_OVERLAY_TAP"), mmadimpl.internalId);
                sendIntent(mmadimpl.getContext(), new Intent("millennialmedia.action.ACTION_AD_SINGLE_TAP"), mmadimpl.internalId);
                return;
            }
        }
    }

    static void displayStarted(MMAdImpl mmadimpl)
    {
        if (mmadimpl == null)
        {
            MMLog.w("MMSDK", "No Context in the listener: ");
            return;
        }
        if (MMSDK.access$000())
        {
            sendIntent(mmadimpl.getContext(), new Intent("millennialmedia.action.ACTION_DISPLAY_STARTED"), mmadimpl.internalId);
        }
        overlayOpened(mmadimpl);
    }

    static void fetchStartedCaching(MMAdImpl mmadimpl)
    {
        if (mmadimpl == null)
        {
            MMLog.w("MMSDK", "No Context in the listener: ");
        } else
        {
            MMSDK.runOnUiThread(new Runnable(mmadimpl) {

                final MMAdImpl val$adImpl;

                public void run()
                {
                    if (adImpl == null || adImpl.requestListener == null)
                    {
                        break MISSING_BLOCK_LABEL_36;
                    }
                    adImpl.requestListener.MMAdRequestIsCaching(adImpl.getCallingAd());
                    return;
                    Exception exception;
                    exception;
                    MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                    return;
                }

            
            {
                adImpl = mmadimpl;
                super();
            }
            });
            if (MMSDK.access$000())
            {
                sendIntent(mmadimpl.getContext(), new Intent("millennialmedia.action.ACTION_FETCH_STARTED_CACHING"), mmadimpl.internalId);
                return;
            }
        }
    }

    static void intentStarted(Context context, String s, long l)
    {
        if (MMSDK.access$000() && s != null)
        {
            sendIntent(context, (new Intent("millennialmedia.action.ACTION_INTENT_STARTED")).putExtra("intentType", s), l);
        }
    }

    protected static void logEvent(String s)
    {
        MMLog.d("Logging event to: %s", s);
        Utils.execute(new Runnable(s) {

            final String val$logString;

            public void run()
            {
                HttpGetRequest httpgetrequest = new HttpGetRequest();
                try
                {
                    httpgetrequest.get(logString);
                    return;
                }
                catch (Exception exception)
                {
                    MMLog.e(MMSDK.Event.TAG, "Error logging event: ", exception);
                }
            }

            
            {
                logString = s;
                super();
            }
        });
    }

    static void overlayClosed(MMAdImpl mmadimpl)
    {
        if (mmadimpl == null)
        {
            MMLog.w("MMSDK", "No Context in the listener: ");
        } else
        {
            MMSDK.runOnUiThread(new Runnable(mmadimpl) {

                final MMAdImpl val$adImpl;

                public void run()
                {
                    if (adImpl == null)
                    {
                        break MISSING_BLOCK_LABEL_44;
                    }
                    adImpl.isOverlayLaunched = false;
                    if (adImpl.requestListener == null)
                    {
                        break MISSING_BLOCK_LABEL_44;
                    }
                    adImpl.requestListener.MMAdOverlayClosed(adImpl.getCallingAd());
                    return;
                    Exception exception;
                    exception;
                    MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                    return;
                }

            
            {
                adImpl = mmadimpl;
                super();
            }
            });
            if (MMSDK.access$000() && mmadimpl.getContext() != null)
            {
                sendIntent(mmadimpl.getContext(), new Intent("millennialmedia.action.ACTION_OVERLAY_CLOSED"), mmadimpl.internalId);
                return;
            }
        }
    }

    static void overlayOpened(MMAdImpl mmadimpl)
    {
        if (mmadimpl == null)
        {
            MMLog.w("MMSDK", "No Context in the listener: ");
            return;
        } else
        {
            MMSDK.runOnUiThread(new Runnable(mmadimpl) {

                final MMAdImpl val$adImpl;

                public void run()
                {
                    if (adImpl == null)
                    {
                        break MISSING_BLOCK_LABEL_44;
                    }
                    adImpl.isOverlayLaunched = true;
                    if (adImpl.requestListener == null)
                    {
                        break MISSING_BLOCK_LABEL_44;
                    }
                    adImpl.requestListener.MMAdOverlayLaunched(adImpl.getCallingAd());
                    return;
                    Exception exception;
                    exception;
                    MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                    return;
                }

            
            {
                adImpl = mmadimpl;
                super();
            }
            });
            overlayOpenedBroadCast(mmadimpl.getContext(), mmadimpl.internalId);
            return;
        }
    }

    static void overlayOpenedBroadCast(Context context, long l)
    {
        if (MMSDK.access$000())
        {
            sendIntent(context, new Intent("millennialmedia.action.ACTION_OVERLAY_OPENED"), l);
        }
    }

    static void requestCompleted(MMAdImpl mmadimpl)
    {
        if (mmadimpl == null)
        {
            MMLog.w("MMSDK", "No Context in the listener: ");
        } else
        {
            MMSDK.runOnUiThread(new Runnable(mmadimpl) {

                final MMAdImpl val$adImpl;

                public void run()
                {
                    if (adImpl == null || adImpl.requestListener == null)
                    {
                        break MISSING_BLOCK_LABEL_36;
                    }
                    adImpl.requestListener.requestCompleted(adImpl.getCallingAd());
                    return;
                    Exception exception;
                    exception;
                    MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                    return;
                }

            
            {
                adImpl = mmadimpl;
                super();
            }
            });
            if (MMSDK.access$000())
            {
                String s = mmadimpl.getRequestCompletedAction();
                sendIntent(mmadimpl.getContext(), new Intent(s), mmadimpl.internalId);
                return;
            }
        }
    }

    static void requestFailed(MMAdImpl mmadimpl, MMException mmexception)
    {
        if (mmadimpl == null)
        {
            MMLog.w("MMSDK", "No Context in the listener: ");
        } else
        {
            MMSDK.runOnUiThread(new Runnable(mmadimpl, mmexception) {

                final MMAdImpl val$adImpl;
                final MMException val$error;

                public void run()
                {
                    if (adImpl == null || adImpl.requestListener == null)
                    {
                        break MISSING_BLOCK_LABEL_40;
                    }
                    adImpl.requestListener.requestFailed(adImpl.getCallingAd(), error);
                    return;
                    Exception exception;
                    exception;
                    MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                    return;
                }

            
            {
                adImpl = mmadimpl;
                error = mmexception;
                super();
            }
            });
            if (MMSDK.access$000())
            {
                String s = mmadimpl.getRequestFailedAction();
                sendIntent(mmadimpl.getContext(), (new Intent(s)).putExtra("error", mmexception), mmadimpl.internalId);
                return;
            }
        }
    }

    private static final void sendIntent(Context context, Intent intent, long l)
    {
        if (context != null)
        {
            intent.addCategory("millennialmedia.category.CATEGORY_SDK");
            if (l != -4L)
            {
                intent.putExtra("internalId", l);
            }
            intent.putExtra("packageName", context.getPackageName());
            String s = intent.getStringExtra("intentType");
            if (!TextUtils.isEmpty(s))
            {
                s = String.format(" Type[%s]", new Object[] {
                    s
                });
            } else
            {
                s = "";
            }
            MMLog.v("MMSDK", (new StringBuilder()).append(" @@ Intent: ").append(intent.getAction()).append(" ").append(s).append(" for ").append(l).toString());
            context.sendBroadcast(intent);
        }
    }


    _cls7.val.error()
    {
    }
}
