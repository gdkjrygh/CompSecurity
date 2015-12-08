// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            MMLog, Base64, MMActivity, AdViewOverlayActivity

class Utils
{
    static class HttpUtils
    {

        static void executeUrl(String s)
        {
            ThreadUtils.execute(new Runnable(s) {

                final String val$url;

                public void run()
                {
                    try
                    {
                        (new DefaultHttpClient()).execute(new HttpGet(url));
                        MMLog.d("Utils", (new StringBuilder()).append("Executed Url :\"").append(url).append("\"").toString());
                        return;
                    }
                    catch (IOException ioexception)
                    {
                        MMLog.e("Utils", "Exception with HttpUtils: ", ioexception);
                    }
                }

            
            {
                url = s;
                super();
            }
            });
        }

        HttpUtils()
        {
        }
    }

    static class IntentUtils
    {

        private static void fixDataAndTypeForVideo(Context context, Intent intent)
        {
            context = intent.getData();
            if (context != null)
            {
                context = context.getLastPathSegment();
                if (TextUtils.isEmpty(intent.getStringExtra("class")) && !TextUtils.isEmpty(context) && (context.endsWith(".mp4") || context.endsWith(".3gp") || context.endsWith(".mkv") || context.endsWith("content.once")))
                {
                    intent.setDataAndType(intent.getData(), "video/*");
                }
            }
        }

        static Intent getIntentForUri(HttpRedirection.RedirectionListenerImpl redirectionlistenerimpl)
        {
            if (redirectionlistenerimpl != null)
            {
                Object obj1 = null;
                Uri uri = redirectionlistenerimpl.destinationUri;
                Context context = (Context)redirectionlistenerimpl.weakContext.get();
                if (context != null)
                {
                    Object obj = obj1;
                    if (uri != null)
                    {
                        String s2 = uri.getScheme();
                        obj = obj1;
                        if (s2 != null)
                        {
                            if (s2.equalsIgnoreCase("market"))
                            {
                                MMLog.v("Utils", "Creating Android Market intent.");
                                obj = new Intent("android.intent.action.VIEW", uri);
                                MMSDK.Event.intentStarted(context, "market", redirectionlistenerimpl.creatorAdImplInternalId);
                            } else
                            if (s2.equalsIgnoreCase("rtsp"))
                            {
                                MMLog.v("Utils", "Creating streaming video player intent.");
                                obj = new Intent(context, com/millennialmedia/android/MMActivity);
                                ((Intent) (obj)).setData(uri);
                                ((Intent) (obj)).putExtra("class", "com.millennialmedia.android.VideoPlayerActivity");
                            } else
                            if (s2.equalsIgnoreCase("tel"))
                            {
                                MMLog.v("Utils", "Creating telephone intent.");
                                obj = new Intent("android.intent.action.DIAL", uri);
                                MMSDK.Event.intentStarted(context, "tel", redirectionlistenerimpl.creatorAdImplInternalId);
                            } else
                            if (s2.equalsIgnoreCase("sms"))
                            {
                                MMLog.v("Utils", "Creating txt message intent.");
                                s2 = uri.getSchemeSpecificPart();
                                String s = "";
                                int i = s2.indexOf("?body=");
                                obj = s;
                                if (i != -1)
                                {
                                    obj = s;
                                    if (s2.length() > i)
                                    {
                                        obj = s2.substring(0, i).replace(',', ';');
                                    }
                                }
                                obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("sms:").append(((String) (obj))).toString()));
                                if (i == -1)
                                {
                                    ((Intent) (obj)).putExtra("sms_body", s2.substring(i + 6));
                                }
                                MMSDK.Event.intentStarted(context, "sms", redirectionlistenerimpl.creatorAdImplInternalId);
                            } else
                            if (s2.equalsIgnoreCase("mailto"))
                            {
                                obj = new Intent("android.intent.action.VIEW", uri);
                                MMSDK.Event.intentStarted(context, "email", redirectionlistenerimpl.creatorAdImplInternalId);
                            } else
                            if (s2.equalsIgnoreCase("geo"))
                            {
                                MMLog.v("Utils", "Creating Google Maps intent.");
                                obj = new Intent("android.intent.action.VIEW", uri);
                                MMSDK.Event.intentStarted(context, "geo", redirectionlistenerimpl.creatorAdImplInternalId);
                            } else
                            if (s2.equalsIgnoreCase("https"))
                            {
                                MMLog.v("Utils", "Creating launch browser intent.");
                                obj = new Intent("android.intent.action.VIEW", uri);
                                MMSDK.Event.intentStarted(context, "browser", redirectionlistenerimpl.creatorAdImplInternalId);
                            } else
                            if (s2.equalsIgnoreCase("mmbrowser"))
                            {
                                String s1 = uri.toString().substring(12);
                                obj = s1;
                                if (s1 != null)
                                {
                                    obj = s1;
                                    if (!s1.contains("://"))
                                    {
                                        obj = s1.replaceFirst("//", "://");
                                    }
                                }
                                MMLog.v("Utils", "MMBrowser - Creating launch browser intent.");
                                obj = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))));
                                MMSDK.Event.intentStarted(context, "browser", redirectionlistenerimpl.creatorAdImplInternalId);
                            } else
                            if (s2.equalsIgnoreCase("http"))
                            {
                                if (uri.getLastPathSegment() != null && (uri.getLastPathSegment().endsWith(".mp4") || uri.getLastPathSegment().endsWith(".3gp")))
                                {
                                    MMLog.v("Utils", "Creating video player intent.");
                                    obj = new Intent(context, com/millennialmedia/android/MMActivity);
                                    ((Intent) (obj)).setData(uri);
                                    ((Intent) (obj)).putExtra("class", "com.millennialmedia.android.VideoPlayerActivity");
                                    MMSDK.Event.intentStarted(context, "streamingVideo", redirectionlistenerimpl.creatorAdImplInternalId);
                                } else
                                {
                                    if (redirectionlistenerimpl.canOpenOverlay())
                                    {
                                        MMLog.v("Utils", "Creating launch overlay intent.");
                                        redirectionlistenerimpl = new Intent(context, com/millennialmedia/android/MMActivity);
                                        redirectionlistenerimpl.putExtra("class", com/millennialmedia/android/AdViewOverlayActivity.getCanonicalName());
                                        redirectionlistenerimpl.setData(uri);
                                        return redirectionlistenerimpl;
                                    }
                                    MMLog.v("Utils", "Creating launch browser intent.");
                                    MMSDK.Event.intentStarted(context, "browser", redirectionlistenerimpl.creatorAdImplInternalId);
                                    obj = new Intent("android.intent.action.VIEW", uri);
                                }
                            } else
                            {
                                MMLog.v("Utils", String.format("Creating intent for unrecognized URI. %s", new Object[] {
                                    uri
                                }));
                                obj = new Intent("android.intent.action.VIEW", uri);
                            }
                        }
                    }
                    if (obj != null)
                    {
                        MMLog.v("Utils", String.format("%s resolved to Intent: %s", new Object[] {
                            uri, obj
                        }));
                        return ((Intent) (obj));
                    } else
                    {
                        MMLog.v("Utils", String.format("%s", new Object[] {
                            uri
                        }));
                        return ((Intent) (obj));
                    }
                }
            }
            return null;
        }

        static void startActionView(Context context, String s)
        {
            startActivity(context, new Intent("android.intent.action.VIEW", Uri.parse(s)));
        }

        static void startActivity(Context context, Intent intent)
        {
            if (!(context instanceof Activity))
            {
                intent.addFlags(0x10000000);
            }
            fixDataAndTypeForVideo(context, intent);
            context.startActivity(intent);
        }

        static void startAdViewOverlayActivity(Context context)
        {
            Intent intent = new Intent(context, com/millennialmedia/android/MMActivity);
            intent.putExtra("class", "com.millennialmedia.android.AdViewOverlayActivity");
            startActivity(context, intent);
        }

        static void startAdViewOverlayActivity(Context context, Intent intent)
        {
            intent.setClass(context, com/millennialmedia/android/MMActivity);
            intent.putExtra("class", "com.millennialmedia.android.AdViewOverlayActivity");
            startActivity(context, intent);
        }

        static void startAdViewOverlayActivityWithData(Context context, String s)
        {
            Intent intent = new Intent(context, com/millennialmedia/android/MMActivity);
            intent.putExtra("class", "com.millennialmedia.android.AdViewOverlayActivity");
            intent.setData(Uri.parse(s));
            startActivity(context, intent);
        }

        static void startCachedVideoPlayerActivity(Context context, Intent intent)
        {
            intent.setClass(context, com/millennialmedia/android/MMActivity);
            intent.putExtra("class", "com.millennialmedia.android.CachedVideoPlayerActivity");
            startActivity(context, intent);
        }

        static void startPickerActivity(Context context, File file, String s)
        {
            Intent intent = new Intent(context, com/millennialmedia/android/MMActivity);
            intent.setData(Uri.fromFile(file));
            intent.putExtra("type", s);
            intent.putExtra("class", "com.millennialmedia.android.BridgeMMMedia$PickerActivity");
            startActivity(context, intent);
        }

        static void startVideoPlayerActivityWithData(Context context, Uri uri)
        {
            Intent intent = new Intent(context, com/millennialmedia/android/MMActivity);
            intent.setData(uri);
            intent.putExtra("class", "com.millennialmedia.android.VideoPlayerActivity");
            startActivity(context, intent);
        }

        static void startVideoPlayerActivityWithData(Context context, File file)
        {
            startVideoPlayerActivityWithData(context, Uri.fromFile(file));
        }

        static void startVideoPlayerActivityWithData(Context context, String s)
        {
            startVideoPlayerActivityWithData(context, Uri.parse(s));
        }

        IntentUtils()
        {
        }
    }

    static class ThreadUtils
    {

        private static final ExecutorService cachedThreadExecutor = Executors.newCachedThreadPool();

        static void execute(Runnable runnable)
        {
            cachedThreadExecutor.execute(runnable);
        }


        ThreadUtils()
        {
        }
    }


    private static final String TAG = "Utils";

    Utils()
    {
    }

    static boolean getJSONBoolean(JSONObject jsonobject, String s, boolean flag)
    {
        boolean flag1;
        try
        {
            flag1 = jsonobject.getBoolean(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            MMLog.e("Utils", (new StringBuilder()).append("Unable to get boolean value from JSON object for key <").append(s).append(">").toString(), jsonobject);
            return flag;
        }
        return flag1;
    }

    static double getJSONDouble(JSONObject jsonobject, String s, double d)
    {
        double d1;
        try
        {
            d1 = jsonobject.getDouble(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            MMLog.e("Utils", (new StringBuilder()).append("Unable to get int value from JSON object for key <").append(s).append(">").toString(), jsonobject);
            return d;
        }
        return d1;
    }

    static int getJSONInt(JSONObject jsonobject, String s, int i)
    {
        int j;
        try
        {
            j = jsonobject.getInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            MMLog.e("Utils", (new StringBuilder()).append("Unable to get int value from JSON object for key <").append(s).append(">").toString(), jsonobject);
            return i;
        }
        return j;
    }

    static String getJSONString(JSONObject jsonobject, String s, String s1)
    {
        try
        {
            jsonobject = jsonobject.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            MMLog.e("Utils", (new StringBuilder()).append("Unable to get string value from JSON object for key <").append(s).append(">").toString(), jsonobject);
            return s1;
        }
        return jsonobject;
    }

    static JSONObject getViewDimensions(View view)
    {
        JSONObject jsonobject = new JSONObject();
        if (view == null)
        {
            MMLog.e("Utils", "Unable to calculate view dimensions for null view");
        } else
        {
            DisplayMetrics displaymetrics = view.getContext().getResources().getDisplayMetrics();
            if (displaymetrics != null)
            {
                int ai[] = new int[2];
                view.getLocationInWindow(ai);
                try
                {
                    jsonobject.put("x", (int)((float)ai[0] / displaymetrics.density));
                    jsonobject.put("y", (int)((float)ai[1] / displaymetrics.density));
                    jsonobject.put("width", (int)((float)view.getWidth() / displaymetrics.density));
                    jsonobject.put("height", (int)((float)view.getHeight() / displaymetrics.density));
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    MMLog.e("Utils", "Unable to build view dimensions", view);
                    return jsonobject;
                }
                return jsonobject;
            }
        }
        return jsonobject;
    }

    static BitmapDrawable loadEncodedBitmapDrawable(Context context, String s)
        throws IOException
    {
        s = Base64.decode(s);
        if (s != null);
        s = BitmapFactory.decodeStream(new ByteArrayInputStream(s));
        if (s == null)
        {
            throw new IOException("Unable to create bitmap from input stream");
        } else
        {
            return new BitmapDrawable(context.getResources(), s);
        }
    }
}
