// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.rendering;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ParseException;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.inmobi.commons.a.b;
import com.inmobi.commons.core.network.NetworkRequest;
import com.inmobi.commons.core.utilities.Logger;
import com.inmobi.commons.core.utilities.info.DisplayInfo;
import com.inmobi.commons.core.utilities.info.c;
import com.inmobi.rendering.mraid.MraidMediaProcessor;
import com.inmobi.rendering.mraid.d;
import com.inmobi.rendering.mraid.l;
import com.inmobi.rendering.mraid.m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.inmobi.rendering:
//            RenderView, InMobiAdActivity, RenderingProperties

public class a
{

    static final String a[] = {
        "tel", "sms", "calendar", "storePicture", "inlineVideo"
    };
    private static final String b = com/inmobi/rendering/a.getSimpleName();
    private RenderView c;
    private RenderingProperties d;
    private l e;
    private Context f;
    private DownloadManager g;
    private BroadcastReceiver h;

    public a(RenderView renderview, RenderingProperties renderingproperties)
    {
        f = renderview.getRenderViewContext();
        c = renderview;
        d = renderingproperties;
    }

    static int a(String s)
    {
        return d(s);
    }

    static RenderView a(a a1)
    {
        return a1.c;
    }

    static String a()
    {
        return b;
    }

    static void a(a a1, String s)
    {
        a1.b(s);
    }

    static void a(a a1, String s, String s1)
    {
        a1.a(s, s1);
    }

    private void a(String s, String s1)
    {
        if (g == null)
        {
            g = (DownloadManager)com.inmobi.commons.a.a.b().getSystemService("download");
        }
        try
        {
            s1 = Uri.parse(s1);
            android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(s1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, s1.getLastPathSegment());
            registerBroadcastListener(s);
            long l1 = g.enqueue(request);
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("Download enqueued with ID: ").append(l1).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("Invalid URL provided to storePicture ").append(s1.getMessage()).toString());
        }
        c.a(s, "Invalid URL", "storePicture");
    }

    static DownloadManager b(a a1)
    {
        return a1.g;
    }

    static void b(a a1, String s)
    {
        a1.c(s);
    }

    private void b(String s)
    {
        Uri uri = f.getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new ContentValues());
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uri);
        int i = InMobiAdActivity.a(intent, new _cls6(uri, s));
        s = new Intent(f, com/inmobi/rendering/InMobiAdActivity);
        s.putExtra("com.inmobi.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 103);
        s.putExtra("id", i);
        if (!(f instanceof Activity))
        {
            s.setFlags(0x10000000);
        }
        f.startActivity(s);
        c.getListener().g(c);
    }

    static Context c(a a1)
    {
        return a1.f;
    }

    private void c(String s)
    {
        int i = InMobiAdActivity.a(new Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI), new _cls8(s));
        s = new Intent(f, com/inmobi/rendering/InMobiAdActivity);
        s.putExtra("com.inmobi.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 103);
        s.putExtra("id", i);
        if (!(f instanceof Activity))
        {
            s.setFlags(0x10000000);
        }
        f.startActivity(s);
        c.getListener().g(c);
    }

    private static int d(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return 0xfffe7961;
        }
        return i;
    }

    public void asyncPing(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("asyncPing called: ").append(s1).toString());
        if (!URLUtil.isValidUrl(s1))
        {
            c.a(s, "Invalid url", "asyncPing");
            return;
        } else
        {
            s = new NetworkRequest(com.inmobi.commons.core.network.NetworkRequest.RequestType.GET, s1, false, null);
            s.a(false);
            (new com.inmobi.commons.core.network.a(s, new _cls9())).a();
            return;
        }
    }

    public void cancelSaveContent(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("cancelSaveContent called. mediaId:").append(s1).toString());
        c.f(s1);
    }

    public void close(String s)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "close called");
        (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls37());
    }

    public void closeVideo(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: closeVideo (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls14(s, s1));
            return;
        }
    }

    public void createCalendarEvent(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        }
        if (!c.g("calendar"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "createCalendarEvent called even when it is not supported");
            return;
        }
        if (s2 == null || s2.trim().length() == 0 || s3 == null || s3.trim().length() == 0)
        {
            c.a(s, "Mandatory parameter(s) start and/or end date not supplied", "createCalendarEvent");
            return;
        }
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("createCalendarEvent called with parameters: \nevent ID: ").append(s1).append("; startDate: ").append(s2).append("; endDate: ").append(s3).append("; location: ").append(s4).append("; description: ").append(s5).append("; summary: ").append(s6).append("; status: ").append(s7).append("; transparency: ").append(s8).append("; recurrence: ").append(s9).append("; reminder: ").append(s10).toString());
        if (android.os.Build.VERSION.SDK_INT >= 23 && (com.inmobi.commons.a.a.b().checkSelfPermission("android.permission.WRITE_CALENDAR") != 0 || com.inmobi.commons.a.a.b().checkSelfPermission("android.permission.READ_CALENDAR") != 0))
        {
            s = new _cls4(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
            InMobiAdActivity.a(new String[] {
                "android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"
            }, s);
            return;
        } else
        {
            c.a(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
            return;
        }
    }

    public void disableBackButton(String s, boolean flag)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            c.setDisableBackButton(flag);
            return;
        }
    }

    public void disableCloseRegion(String s, boolean flag)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls27(flag));
            return;
        }
    }

    public void expand(String s, String s1)
    {
label0:
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("expand called. Url:").append(s1).toString());
            if (d.a() != RenderingProperties.PlacementType.FULL_SCREEN)
            {
                if (c != null)
                {
                    break label0;
                }
                Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            }
            return;
        }
        if (c.a())
        {
            if (s1 != null && s1.length() != 0 && !s1.startsWith("http"))
            {
                c.a(s, "Invalid URL", "expand");
                return;
            } else
            {
                (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls33(s, s1));
                return;
            }
        } else
        {
            c.a(s, "Creative is not visible. Ignoring request.", "expand");
            return;
        }
    }

    public void fireAdFailed(String s)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "fireAdFailed called.");
        c.getListener().b(c);
    }

    public void fireAdReady(String s)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "fireAdReady called.");
        c.getListener().a(c);
    }

    public int getAudioVolume(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: getAudioVolume (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return 0;
        } else
        {
            return c.e(s, s1);
        }
    }

    public String getCurrentPosition(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return "";
        }
        s = ((String) (c.getCurrentPositionMonitor()));
        s;
        JVM INSTR monitorenter ;
        c.setCurrentPositionLock();
        (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls32());
_L1:
        boolean flag = c.c();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        c.getCurrentPositionMonitor().wait();
          goto _L1
        Object obj;
        obj;
        ((InterruptedException) (obj)).printStackTrace();
          goto _L1
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
        s;
        JVM INSTR monitorexit ;
        return c.getCurrentPosition();
    }

    public String getDefaultPosition(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return (new JSONObject()).toString();
        }
        s = ((String) (c.getDefaultPositionMonitor()));
        s;
        JVM INSTR monitorenter ;
        c.setDefaultPositionLock();
        (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls23());
_L1:
        boolean flag = c.b();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        c.getDefaultPositionMonitor().wait();
          goto _L1
        Object obj;
        obj;
        ((InterruptedException) (obj)).printStackTrace();
          goto _L1
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
        s;
        JVM INSTR monitorexit ;
        return c.getDefaultPosition();
    }

    public String getExpandProperties(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return "";
        } else
        {
            return c.getExpandProperties().c();
        }
    }

    public void getGalleryImage(String s)
    {
        if (!c.g("getGalleryImage"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "getGalleryImage called even when it is not supported");
            return;
        }
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "getGalleryImage called ");
        if (android.os.Build.VERSION.SDK_INT >= 23 && com.inmobi.commons.a.a.b().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0)
        {
            s = new _cls7(s);
            InMobiAdActivity.a(new String[] {
                "android.permission.READ_EXTERNAL_STORAGE"
            }, s);
            return;
        } else
        {
            c(s);
            return;
        }
    }

    public String getMaxSize(String s)
    {
        Object obj;
        int i;
        int j;
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "getMaxSize called");
        Activity activity = c.getFullScreenActivity();
        obj = activity;
        if (activity == null)
        {
            if (!(c.getRenderViewContext() instanceof Activity))
            {
                return getScreenSize(s);
            }
            obj = (Activity)c.getRenderViewContext();
        }
        obj = (FrameLayout)(FrameLayout)((Activity) (obj)).findViewById(0x1020002);
        j = DisplayInfo.a(((FrameLayout) (obj)).getWidth());
        i = DisplayInfo.a(((FrameLayout) (obj)).getHeight());
        if (c.getFullScreenActivity() == null || j != 0 && i != 0) goto _L2; else goto _L1
_L1:
    /* block-local class not found */
    class a {}

        s = new a(((android.view.View) (obj)));
        ((FrameLayout) (obj)).getViewTreeObserver().addOnGlobalLayoutListener(s);
        obj = a.a(s);
        obj;
        JVM INSTR monitorenter ;
        a.a(s).wait();
_L3:
        j = com.inmobi.rendering.a.b(s);
        i = com.inmobi.rendering.a.c(s);
_L2:
        s = new JSONObject();
        InterruptedException interruptedexception;
        try
        {
            s.put("width", j);
            s.put("height", i);
        }
        catch (JSONException jsonexception)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Error while creating max size Json.", jsonexception);
        }
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("getMaxSize called:").append(s.toString()).toString());
        return s.toString();
        interruptedexception;
        interruptedexception.printStackTrace();
          goto _L3
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public double getMicIntensity(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return 4.9406564584124654E-324D;
        } else
        {
            return c.m();
        }
    }

    public String getOrientation(String s)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "getOrientation called");
        int i = DisplayInfo.b();
        if (i == com.inmobi.commons.core.utilities.info.DisplayInfo.ORIENTATION_VALUES.PORTRAIT.getValue())
        {
            return "0";
        }
        if (i == com.inmobi.commons.core.utilities.info.DisplayInfo.ORIENTATION_VALUES.LANDSCAPE.getValue())
        {
            return "90";
        }
        if (i == com.inmobi.commons.core.utilities.info.DisplayInfo.ORIENTATION_VALUES.REVERSE_PORTRAIT.getValue())
        {
            return "180";
        }
        if (i == com.inmobi.commons.core.utilities.info.DisplayInfo.ORIENTATION_VALUES.REVERSE_LANDSCAPE.getValue())
        {
            return "270";
        } else
        {
            return "-1";
        }
    }

    public String getOrientationProperties(String s)
    {
        s = e.a();
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("getOrientationProperties called: ").append(s).toString());
        return s;
    }

    public String getPlacementType(String s)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "getPlacementType called");
        if (d.a() == RenderingProperties.PlacementType.FULL_SCREEN)
        {
            return "interstitial";
        } else
        {
            return "inline";
        }
    }

    public String getPlatform(String s)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("getPlatform. Platform:").append(com.inmobi.commons.a.b.d()).toString());
        return com.inmobi.commons.a.b.d();
    }

    public String getPlatformVersion(String s)
    {
        s = Integer.toString(android.os.Build.VERSION.SDK_INT);
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("getPlatformVersion. Version:").append(s).toString());
        return s;
    }

    public String getResizeProperties(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return "";
        }
        s = c.getResizeProperties();
        if (s == null)
        {
            return "";
        } else
        {
            return s.a();
        }
    }

    public String getScreenSize(String s)
    {
        s = new JSONObject();
        try
        {
            s.put("width", DisplayInfo.a().b());
            s.put("height", DisplayInfo.a().a());
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        s = s.toString();
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("getScreenSize called:").append(s).toString());
        return s;
    }

    public String getSdkVersion(String s)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("getSdkVersion called. Version:").append(com.inmobi.commons.a.b.b()).toString());
        return com.inmobi.commons.a.b.b();
    }

    public String getState(String s)
    {
        s = c.getState().toString().toLowerCase(Locale.ENGLISH);
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("getState called:").append(s).toString());
        return s;
    }

    public String getVersion(String s)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("getVersion called. Version:").append(com.inmobi.commons.a.b.c()).toString());
        return com.inmobi.commons.a.b.c();
    }

    public int getVideoVolume(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: getVideoVolume (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return 0;
        } else
        {
            return c.e(s, s1);
        }
    }

    public void hideVideo(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: hideVideo (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls15(s, s1));
            return;
        }
    }

    public void incentCompleted(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("incentCompleted called. IncentData:").append(s1).toString());
        if (s1 == null)
        {
            c.getListener().a(c, null);
            return;
        }
        try
        {
            s = new JSONObject(s1);
            s1 = new HashMap();
            String s2;
            for (Iterator iterator = s.keys(); iterator.hasNext(); s1.put(s2, s.get(s2)))
            {
                s2 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            c.getListener().a(c, null);
            return;
        }
        c.getListener().a(c, s1);
        return;
    }

    public boolean isAudioMuted(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: isAudioMuted (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return false;
        } else
        {
            return c.f(s, s1);
        }
    }

    public boolean isBackButtonDisabled(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return false;
        } else
        {
            return c.f();
        }
    }

    public String isDeviceMuted(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return "false";
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "JavaScript called: isDeviceMuted()");
            return String.valueOf(c.getMediaProcessor().e());
        }
    }

    public String isHeadphonePlugged(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return "false";
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "JavaScript called: isHeadphonePlugged()");
            return String.valueOf(c.getMediaProcessor().h());
        }
    }

    public boolean isVideoMuted(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: isVideoMuted (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return false;
        } else
        {
            return c.f(s, s1);
        }
    }

    public boolean isViewable(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return false;
        } else
        {
            return c.a();
        }
    }

    public void log(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("Log called. Message:").append(s1).toString());
    }

    public void makeCall(String s, String s1)
    {
        if (!c.g("tel"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "makeCall called even when it is not supported");
            return;
        }
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("makeCall: ").append(s1).toString());
        if (TextUtils.isEmpty(s1))
        {
            s = null;
        } else
        {
            s = s1;
            if (!s1.startsWith("tel:"))
            {
                s = (new StringBuilder()).append("tel:").append(s1).toString();
            }
        }
        if (s != null)
        {
            s = new Intent("android.intent.action.VIEW", Uri.parse(s));
            s.addFlags(0x10000000);
            f.startActivity(s);
            c.getListener().g(c);
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "makeCall Unsuccesful: invalid number provided");
            return;
        }
    }

    public void muteAudio(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: muteAudio (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls24(s, s1));
            return;
        }
    }

    public void muteVideo(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: muteVideo (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls17(s, s1));
            return;
        }
    }

    public void onOrientationChange(String s)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, ">>> onOrientationChange() >>> This API is deprecated!");
    }

    public void onUserInteraction(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("onUserInteraction called. Params:").append(s1).toString());
        if (s1 == null)
        {
            c.getListener().b(c, null);
            return;
        }
        try
        {
            s = new JSONObject(s1);
            s1 = new HashMap();
            String s2;
            for (Iterator iterator = s.keys(); iterator.hasNext(); s1.put(s2, s.get(s2)))
            {
                s2 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            c.getListener().b(c, null);
            return;
        }
        c.getListener().b(c, s1);
        return;
    }

    public void open(String s, String s1)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls1(s, s1));
            return;
        }
    }

    public void openEmbedded(String s, String s1)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls12(s, s1));
            return;
        }
    }

    public void openExternal(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("openExternal called with url: ").append(s1).toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        }
        if (s1.startsWith("http") && !URLUtil.isValidUrl(s1))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("openExternal called with invalid url (").append(s1).append(")").toString());
            c.a(s, "Invalid URL", "openExternal");
            return;
        } else
        {
            c.b("openExternal", s, s1);
            return;
        }
    }

    public void pauseAudio(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: pauseAudio (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls22(s, s1));
            return;
        }
    }

    public void pauseVideo(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: pauseVideo (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls13(s, s1));
            return;
        }
    }

    public void ping(String s, String s1, boolean flag)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        }
        if (s1 == null || s1.trim().length() == 0 || !URLUtil.isValidUrl(s1))
        {
            c.a(s, (new StringBuilder()).append("Invalid URL:").append(s1).toString(), "ping");
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called ping() URL: >>> ").append(s1).append(" <<<").toString());
            com.inmobi.rendering.a.c.a().a(s1, flag);
            return;
        }
    }

    public void pingInWebView(String s, String s1, boolean flag)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        }
        if (s1 == null || s1.trim().length() == 0 || !URLUtil.isValidUrl(s1))
        {
            c.a(s, (new StringBuilder()).append("Invalid URL:").append(s1).toString(), "pingInWebView");
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called pingInWebView() URL: >>> ").append(s1).append(" <<<").toString());
            com.inmobi.rendering.a.c.a().b(s1, flag);
            return;
        }
    }

    public void playAudio(String s, String s1, boolean flag, boolean flag1, boolean flag2, String s2, String s3, 
            String s4)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: playAudio (").append(s1).append(", ").append(s4).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls20(s4, s1, s, flag, flag2, s2, s3, flag1));
            return;
        }
    }

    public void playVideo(String s, String s1)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        }
        if (s1 == null || s1.trim().length() == 0 || !s1.startsWith("http"))
        {
            c.a(s, "Null or empty or invalid media playback URL supplied", "playVideo");
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: playVideo (").append(s1).append(")").toString());
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls36(s, s1));
            return;
        }
    }

    public void playVideo(String s, String s1, boolean flag, boolean flag1, boolean flag2, boolean flag3, String s2, 
            String s3, String s4, String s5, String s6, String s7, String s8)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls10(s1, s8, s, s4, s5, flag1, flag3, s6, s7, s3, s2, flag, flag2));
            return;
        }
    }

    public void postToSocial(String s, int i, String s1, String s2, String s3)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("postToSocial called with parameters: socialType: ").append(i).append("; text: ").append(s1).append("; link: ").append(s2).append("; image URL: ").append(s3).toString());
            c.a(s, i, s1, s2, s3);
            return;
        }
    }

    public void registerBackButtonPressedEventListener(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            c.c(s);
            return;
        }
    }

    public void registerBroadcastListener(String s)
    {
        if (h == null)
        {
            h = new _cls3(s);
            com.inmobi.commons.a.a.b().registerReceiver(h, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
    }

    public void registerDeviceMuteEventListener(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            c.getMediaProcessor().a(s);
            return;
        }
    }

    public void registerDeviceVolumeChangeEventListener(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            c.getMediaProcessor().b(s);
            return;
        }
    }

    public void registerHeadphonePluggedEventListener(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            c.getMediaProcessor().c(s);
            return;
        }
    }

    public void registerMicListener(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        }
        if (!c.g("microphone"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "registerMicListener called even when it is not supported");
            return;
        }
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Register microphone intensity listener ...");
        if (android.os.Build.VERSION.SDK_INT >= 23 && com.inmobi.commons.a.a.b().checkSelfPermission("android.permission.RECORD_AUDIO") != 0)
        {
            s = new _cls30(s);
            InMobiAdActivity.a(new String[] {
                "android.permission.RECORD_AUDIO"
            }, s);
            return;
        } else
        {
            c.d(s);
            return;
        }
    }

    public void resize(String s)
    {
label0:
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "resize called");
            if (d.a() != RenderingProperties.PlacementType.FULL_SCREEN)
            {
                if (c != null)
                {
                    break label0;
                }
                Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            }
            return;
        }
        if (c.a())
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls34());
            return;
        } else
        {
            c.a(s, "Creative is not visible. Ignoring request.", "resize");
            return;
        }
    }

    public void saveContent(String s, String s1, String s2)
    {
        if (s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "saveContent called with invalid parameters");
            Object obj = new JSONObject();
            String s3 = s2;
            if (s2 == null)
            {
                s3 = "";
            }
            try
            {
                ((JSONObject) (obj)).put("url", s3);
                ((JSONObject) (obj)).put("reason", 1);
            }
            // Misplaced declaration of an exception variable
            catch (String s2)
            {
                s2.printStackTrace();
            }
            s3 = ((JSONObject) (obj)).toString().replace("\"", "\\\"");
            obj = (new StringBuilder()).append("sendSaveContentResult(\"saveContent_");
            s2 = s1;
            if (s1 == null)
            {
                s2 = "";
            }
            s1 = ((StringBuilder) (obj)).append(s2).append("\", 'failed', \"").append(s3).append("\");").toString();
            c.a(s, s1);
            return;
        } else
        {
            c.d(s, s1, s2);
            return;
        }
    }

    public void seekAudio(String s, String s1, int i)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: seekAudio (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls21(s, s1, i));
            return;
        }
    }

    public void seekVideo(String s, String s1, int i)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: seekVideo (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls11(s, s1, i));
            return;
        }
    }

    public void sendMail(String s, String s1, String s2, String s3)
    {
        if (!c.g("sendMail"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "sendMail called even when it is not supported");
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("sendMail recipient: ").append(s1).append("subject: ").append(s2).append(" message: ").append(s3).toString());
            s = new Intent("android.intent.action.SEND");
            s.setType("plain/text");
            s.putExtra("android.intent.extra.EMAIL", new String[] {
                s1
            });
            s.putExtra("android.intent.extra.SUBJECT", s2);
            s.putExtra("android.intent.extra.TEXT", s3);
            s.addFlags(0x10000000);
            s = Intent.createChooser(s, "Choose the Email Client.");
            f.startActivity(s);
            c.getListener().g(c);
            return;
        }
    }

    public void sendSMS(String s, String s1, String s2)
    {
        if (!c.g("sms"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "sendSMS called even when it is not supported");
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("sendSMS recipient: ").append(s1).append(" message: ").append(s2).toString());
            s = new Intent("android.intent.action.SENDTO", Uri.parse((new StringBuilder()).append("smsto:").append(Uri.encode(s1)).toString()));
            s.putExtra("sms_body", s2);
            s.addFlags(0x10000000);
            f.startActivity(s);
            c.getListener().g(c);
            return;
        }
    }

    public void setAudioVolume(String s, String s1, int i)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: setAudioVolume (").append(s1).append(", ").append(i).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls26(s, s1, i));
            return;
        }
    }

    public void setExpandProperties(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("setExpandProperties called. Params:").append(s1).toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        }
        if (c.getState() == RenderView.RenderViewState.EXPANDED)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "setExpandProperties can't be called on an already expanded ad.");
            return;
        } else
        {
            s = com.inmobi.rendering.mraid.d.a(s1, c.getExpandProperties(), c.getOrientationProperties());
            c.setExpandProperties(s);
            return;
        }
    }

    public void setOrientationProperties(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("setOrientationProperties called: ").append(s1).toString());
        e = l.a(s1, c.getOrientationProperties());
        c.setOrientationProperties(e);
    }

    public void setResizeProperties(String s, String s1)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        }
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("setResizeProperties called. Properties:").append(s1).toString());
        s1 = m.a(s1, c.getResizeProperties());
        if (s1 == null)
        {
            c.a(s, "setResizeProperties", "All mandatory fields are not present");
        }
        c.setResizeProperties(s1);
    }

    public void setVideoVolume(String s, String s1, int i)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: setVideoVolume (").append(s1).append(", ").append(i).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls19(s, s1, i));
            return;
        }
    }

    public void showAlert(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("showAlert: ").append(s1).toString());
    }

    public void showVideo(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: showVideo (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls16(s, s1));
            return;
        }
    }

    public void storePicture(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("storePicture called with URL: ").append(s1).toString());
        if (!c.g("storePicture"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "storePicture called despite the fact that it is not supported");
            return;
        }
        if (s1 == null || s1.length() == 0)
        {
            c.a(s, "Null or empty URL supplied", "storePicture");
            return;
        }
        if (!s1.startsWith("http") && !s1.startsWith("HTTP"))
        {
            c.a(s, "Invalid URL scheme - only HTTP(S) is supported", "storePicture");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 23 && com.inmobi.commons.a.a.b().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)
        {
            s = new _cls2(s, s1);
            InMobiAdActivity.a(new String[] {
                "android.permission.WRITE_EXTERNAL_STORAGE"
            }, s);
            return;
        } else
        {
            a(s, s1);
            return;
        }
    }

    public String supports(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("Checking support for: ").append(s1).toString());
        if (!Arrays.asList(a).contains(s1) && !c.g(s1))
        {
            return "false";
        } else
        {
            return String.valueOf(c.g(s1));
        }
    }

    public void takeCameraPicture(String s)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "takeCameraPicture called ");
        if (!c.g("takeCameraPicture"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "takeCameraPicture called even when it is not supported");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 23 && com.inmobi.commons.a.a.b().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)
        {
            s = new _cls5(s);
            InMobiAdActivity.a(new String[] {
                "android.permission.WRITE_EXTERNAL_STORAGE"
            }, s);
            return;
        } else
        {
            b(s);
            return;
        }
    }

    public void unMuteAudio(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: unMuteAudio (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls25(s, s1));
            return;
        }
    }

    public void unMuteVideo(String s, String s1)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("JavaScript called: unMuteVideo (").append(s1).append(")").toString());
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls18(s, s1));
            return;
        }
    }

    public void unRegisterBroadcastListener()
    {
        if (h != null)
        {
            com.inmobi.commons.a.a.b().unregisterReceiver(h);
            h = null;
        }
    }

    public void unregisterBackButtonPressedEventListener(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            c.g();
            return;
        }
    }

    public void unregisterDeviceMuteEventListener(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Unregister device mute event listener ...");
            c.getMediaProcessor().f();
            return;
        }
    }

    public void unregisterDeviceVolumeChangeEventListener(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Unregister device volume change listener ...");
            c.getMediaProcessor().g();
            return;
        }
    }

    public void unregisterHeadphonePluggedEventListener(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Unregister headphone plugged event listener ...");
            c.getMediaProcessor().i();
            return;
        }
    }

    public void unregisterMicListener(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        }
        if (!c.g("microphone"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "unRegisterMicListener called even when it is not supported");
            return;
        }
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Unregister microphone intensity listener ...");
        if (android.os.Build.VERSION.SDK_INT >= 23 && com.inmobi.commons.a.a.b().checkSelfPermission("android.permission.RECORD_AUDIO") != 0)
        {
            s = new _cls31(s);
            InMobiAdActivity.a(new String[] {
                "android.permission.RECORD_AUDIO"
            }, s);
            return;
        } else
        {
            c.n();
            return;
        }
    }

    public void useCustomClose(String s, boolean flag)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("useCustomClose called:").append(flag).toString());
        (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls35(flag));
    }

    public void vibrate(String s)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Vibrate called");
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls28(s));
            return;
        }
    }

    public void vibrate(String s, String s1, int i)
    {
        if (c == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, "Found a null instance of render view!");
            return;
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, b, (new StringBuilder()).append("Vibrate called with pattern ").append(s1).toString());
            (new Handler(c.getRenderViewContext().getMainLooper())).post(new _cls29(s, s1, i));
            return;
        }
    }


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls37 {}


    /* member class not found */
    class _cls14 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls27 {}


    /* member class not found */
    class _cls33 {}


    /* member class not found */
    class _cls32 {}


    /* member class not found */
    class _cls23 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls15 {}


    /* member class not found */
    class _cls24 {}


    /* member class not found */
    class _cls17 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls12 {}


    /* member class not found */
    class _cls22 {}


    /* member class not found */
    class _cls13 {}


    /* member class not found */
    class _cls20 {}


    /* member class not found */
    class _cls36 {}


    /* member class not found */
    class _cls10 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls30 {}


    /* member class not found */
    class _cls34 {}


    /* member class not found */
    class _cls21 {}


    /* member class not found */
    class _cls11 {}


    /* member class not found */
    class _cls26 {}


    /* member class not found */
    class _cls19 {}


    /* member class not found */
    class _cls16 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls25 {}


    /* member class not found */
    class _cls18 {}


    /* member class not found */
    class _cls31 {}


    /* member class not found */
    class _cls35 {}


    /* member class not found */
    class _cls28 {}


    /* member class not found */
    class _cls29 {}

}
