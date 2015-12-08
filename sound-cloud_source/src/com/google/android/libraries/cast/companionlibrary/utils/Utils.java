// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.Toast;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.n;
import com.google.android.gms.cast.o;
import com.google.android.gms.cast.q;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.utils:
//            LogUtils

public final class Utils
{

    public static final boolean IS_ICS_OR_ABOVE;
    public static final boolean IS_KITKAT_OR_ABOVE;
    public static final boolean IS_LOLLIPOP_OR_ABOVE;
    private static final String KEY_CONTENT_TYPE = "content-type";
    private static final String KEY_CUSTOM_DATA = "custom-data";
    private static final String KEY_IMAGES = "images";
    private static final String KEY_STREAM_DURATION = "stream-duration";
    private static final String KEY_STREAM_TYPE = "stream-type";
    private static final String KEY_TRACKS_DATA = "track-data";
    private static final String KEY_TRACK_CONTENT_ID = "track-custom-id";
    private static final String KEY_TRACK_CUSTOM_DATA = "track-custom-data";
    private static final String KEY_TRACK_ID = "track-id";
    private static final String KEY_TRACK_LANGUAGE = "track-language";
    private static final String KEY_TRACK_NAME = "track-name";
    private static final String KEY_TRACK_SUBTYPE = "track-subtype";
    private static final String KEY_TRACK_TYPE = "track-type";
    private static final String KEY_URL = "movie-urls";
    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/utils/Utils);

    private Utils()
    {
    }

    public static m bundleToMediaInfo(Bundle bundle)
    {
        Object obj;
        Object obj3;
        Object obj4;
        n n1;
        obj3 = null;
        obj = null;
        if (bundle == null)
        {
            return null;
        }
        n1 = new n(1);
        n1.a("com.google.android.gms.cast.metadata.SUBTITLE", bundle.getString("com.google.android.gms.cast.metadata.SUBTITLE"));
        n1.a("com.google.android.gms.cast.metadata.TITLE", bundle.getString("com.google.android.gms.cast.metadata.TITLE"));
        n1.a("com.google.android.gms.cast.metadata.STUDIO", bundle.getString("com.google.android.gms.cast.metadata.STUDIO"));
        Object obj1 = bundle.getStringArrayList("images");
        if (obj1 != null && !((ArrayList) (obj1)).isEmpty())
        {
            for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); n1.a(new WebImage(Uri.parse((String)((Iterator) (obj1)).next())))) { }
        }
        obj4 = bundle.getString("custom-data");
        if (TextUtils.isEmpty(((CharSequence) (obj4)))) goto _L2; else goto _L1
_L1:
        Object obj2 = new JSONObject(((String) (obj4)));
_L6:
        if (bundle.getString("track-data") == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj4 = new JSONArray(bundle.getString("track-data"));
        obj = new ArrayList();
        if (((JSONArray) (obj4)).length() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int i = 0;
_L4:
        if (i >= ((JSONArray) (obj4)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = (JSONObject)((JSONArray) (obj4)).get(i);
        obj3 = new com.google.android.gms.cast.q.a(jsonobject.getLong("track-id"), jsonobject.getInt("track-type"));
        if (jsonobject.has("track-name"))
        {
            ((com.google.android.gms.cast.q.a) (obj3)).b(jsonobject.getString("track-name"));
        }
        if (jsonobject.has("track-subtype"))
        {
            ((com.google.android.gms.cast.q.a) (obj3)).a(jsonobject.getInt("track-subtype"));
        }
        if (jsonobject.has("track-custom-id"))
        {
            ((com.google.android.gms.cast.q.a) (obj3)).a(jsonobject.getString("track-custom-id"));
        }
        if (jsonobject.has("track-language"))
        {
            String s = jsonobject.getString("track-language");
            ((com.google.android.gms.cast.q.a) (obj3)).a.e = s;
        }
        if (jsonobject.has("track-data"))
        {
            jsonobject = new JSONObject(jsonobject.getString("track-data"));
            ((com.google.android.gms.cast.q.a) (obj3)).a.g = jsonobject;
        }
        ((List) (obj)).add(((com.google.android.gms.cast.q.a) (obj3)).a);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        break; /* Loop/switch isn't completed */
        obj2;
        LogUtils.LOGE(TAG, (new StringBuilder("Failed to deserialize the custom data string: custom data= ")).append(((String) (obj4))).toString());
_L2:
        obj2 = null;
        if (true) goto _L6; else goto _L5
        jsonexception;
        obj = obj3;
        obj3 = jsonexception;
_L7:
        LogUtils.LOGE(TAG, "Failed to build media tracks from the wrapper bundle", ((Throwable) (obj3)));
_L5:
        obj3 = (new com.google.android.gms.cast.m.a(bundle.getString("movie-urls"))).a(bundle.getInt("stream-type")).a(bundle.getString("content-type")).a(n1);
        ((com.google.android.gms.cast.m.a) (obj3)).a.g = ((JSONObject) (obj2));
        ((com.google.android.gms.cast.m.a) (obj3)).a.f = ((List) (obj));
        if (bundle.containsKey("stream-duration") && bundle.getLong("stream-duration") >= 0L)
        {
            long l = bundle.getLong("stream-duration");
            bundle = ((com.google.android.gms.cast.m.a) (obj3)).a;
            JSONException jsonexception;
            if (l < 0L && l != -1L)
            {
                throw new IllegalArgumentException("Invalid stream duration");
            }
            bundle.e = l;
        }
        return ((com.google.android.gms.cast.m.a) (obj3)).a();
        obj3;
          goto _L7
    }

    public static boolean checkGooglePlayServices(final Activity activity)
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity);
        switch (i)
        {
        default:
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(i, activity, 0);
            dialog.setOnCancelListener(new _cls1());
            dialog.show();
            return false;

        case 0: // '\0'
            return true;
        }
    }

    public static int convertDpToPixel(Context context, float f)
    {
        return (int)TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static String formatMillis(int i)
    {
        int j = i / 1000;
        i = j / 3600;
        int k = j % 3600;
        j = k / 60;
        k %= 60;
        if (i > 0)
        {
            return String.format("%d:%02d:%02d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            });
        } else
        {
            return String.format("%d:%02d", new Object[] {
                Integer.valueOf(j), Integer.valueOf(k)
            });
        }
    }

    public static Uri getImageUri(m m1, int i)
    {
        m1 = m1.d;
        if (m1 != null && ((n) (m1)).a.size() > i)
        {
            return ((WebImage)((n) (m1)).a.get(i)).getUrl();
        } else
        {
            return null;
        }
    }

    public static String getImageUrl(m m1, int i)
    {
        m1 = getImageUri(m1, i);
        if (m1 != null)
        {
            return m1.toString();
        } else
        {
            return null;
        }
    }

    public static String getWifiSsid(Context context)
    {
        context = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo();
        if (context != null)
        {
            return context.getSSID();
        } else
        {
            return null;
        }
    }

    public static Bundle mediaInfoToBundle(m m1)
    {
        Bundle bundle;
        if (m1 == null)
        {
            return null;
        }
        Object obj = m1.d;
        bundle = new Bundle();
        bundle.putString("com.google.android.gms.cast.metadata.TITLE", ((n) (obj)).a("com.google.android.gms.cast.metadata.TITLE"));
        bundle.putString("com.google.android.gms.cast.metadata.SUBTITLE", ((n) (obj)).a("com.google.android.gms.cast.metadata.SUBTITLE"));
        bundle.putString("movie-urls", m1.a);
        bundle.putString("com.google.android.gms.cast.metadata.STUDIO", ((n) (obj)).a("com.google.android.gms.cast.metadata.STUDIO"));
        bundle.putString("content-type", m1.c);
        bundle.putInt("stream-type", m1.b);
        bundle.putLong("stream-duration", m1.e);
        if (!((n) (obj)).a.isEmpty())
        {
            ArrayList arraylist = new ArrayList();
            for (obj = ((n) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((WebImage)((Iterator) (obj)).next()).getUrl().toString())) { }
            bundle.putStringArrayList("images", arraylist);
        }
        JSONObject jsonobject = m1.g;
        if (jsonobject != null)
        {
            bundle.putString("custom-data", jsonobject.toString());
        }
        if (m1.f == null || m1.f.isEmpty()) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray;
        jsonarray = new JSONArray();
        JSONObject jsonobject1;
        for (m1 = m1.f.iterator(); m1.hasNext(); jsonarray.put(jsonobject1))
        {
            q q1 = (q)m1.next();
            jsonobject1 = new JSONObject();
            jsonobject1.put("track-name", q1.d);
            jsonobject1.put("track-custom-id", q1.c);
            jsonobject1.put("track-id", q1.a);
            jsonobject1.put("track-language", q1.e);
            jsonobject1.put("track-type", q1.b);
            if (q1.f != -1)
            {
                jsonobject1.put("track-subtype", q1.f);
            }
            if (q1.g != null)
            {
                jsonobject1.put("track-custom-data", q1.g.toString());
            }
        }

          goto _L3
_L2:
        return bundle;
_L3:
        try
        {
            bundle.putString("track-data", jsonarray.toString());
        }
        // Misplaced declaration of an exception variable
        catch (m m1)
        {
            LogUtils.LOGE(TAG, "mediaInfoToBundle(): Failed to convert Tracks data to json", m1);
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static o[] rebuildQueue(List list)
    {
        if (list == null || list.isEmpty())
        {
            return null;
        }
        o ao[] = new o[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            ao[i] = rebuildQueueItem((o)list.get(i));
        }

        return ao;
    }

    public static o[] rebuildQueueAndAppend(List list, o o1)
    {
        if (list == null || list.isEmpty())
        {
            return (new o[] {
                o1
            });
        }
        o ao[] = new o[list.size() + 1];
        for (int i = 0; i < list.size(); i++)
        {
            ao[i] = rebuildQueueItem((o)list.get(i));
        }

        ao[list.size()] = o1;
        return ao;
    }

    public static o rebuildQueueItem(o o1)
    {
        o1 = new com.google.android.gms.cast.o.a(o1);
        ((com.google.android.gms.cast.o.a) (o1)).a.b = 0;
        return o1.a();
    }

    public static Bitmap scaleAndCenterCropBitmap(Bitmap bitmap, int i, int j)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            int k = bitmap.getWidth();
            int l = bitmap.getHeight();
            float f1 = Math.max((float)j / (float)k, (float)i / (float)l);
            float f = (float)k * f1;
            f1 = (float)l * f1;
            float f2 = ((float)j - f) / 2.0F;
            float f3 = ((float)i - f1) / 2.0F;
            RectF rectf = new RectF(f2, f3, f + f2, f1 + f3);
            Bitmap bitmap1 = Bitmap.createBitmap(j, i, bitmap.getConfig());
            (new Canvas(bitmap1)).drawBitmap(bitmap, null, rectf, null);
            return bitmap1;
        }
    }

    public static void showToast(Context context, int i)
    {
        Toast.makeText(context, context.getString(i), 1).show();
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_KITKAT_OR_ABOVE = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_LOLLIPOP_OR_ABOVE = flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        IS_ICS_OR_ABOVE = flag;
    }

    private class _cls1
        implements android.content.DialogInterface.OnCancelListener
    {

        final Activity val$activity;

        public final void onCancel(DialogInterface dialoginterface)
        {
            activity.finish();
        }

        _cls1()
        {
            activity = activity1;
            super();
        }
    }

}
