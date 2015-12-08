// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.yume.android.sdk.YuMeBSPException;
import com.yume.android.sdk.YuMeBSPInterface;
import com.yume.android.sdk.YuMeConnectionType;
import com.yume.android.sdk.YuMeDeviceInfo;
import com.yume.android.sdk.YuMeDeviceType;
import com.yume.android.sdk.YuMeSDKBSPInterface;
import com.yume.android.sdk.YuMeStorageMode;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.yume.android.bsp:
//            p, a, d, i, 
//            c, s, r, m, 
//            n

public class YuMeBSPInterfaceImpl
    implements YuMeBSPInterface
{

    static YuMeSDKBSPInterface a;
    static boolean b = false;
    static a c;
    private static p d = p.a();
    private static i e;
    private static d f = null;
    private static Context j = null;
    private int g;
    private int h;
    private int i;
    private String k;
    private String l;
    private String m;
    private String n;

    public YuMeBSPInterfaceImpl()
    {
        g = 5;
        h = 4;
        i = 60;
        k = null;
        l = null;
        m = null;
        n = null;
    }

    static Context a()
    {
        if (j != null) goto _L2; else goto _L1
_L1:
        if (a != null) goto _L4; else goto _L3
_L3:
        d.b("getApplicationContextFromSDK(): sdkInterface is NULL.");
_L2:
        return j;
_L4:
        Context context = a.YuMeSDKBSP_GetApplicationContext();
        j = context;
        if (context == null)
        {
            d.b("getApplicationContextFromSDK(): Invalid Application Context received from SDK.");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private String a(int i1, float f1, YuMeStorageMode yumestoragemode, boolean flag, boolean flag1)
    {
        if (i1 > i)
        {
            return (new StringBuilder("Invalid Ad Connection Timeout Value. It cannot exceed ")).append(i).append(".").toString();
        }
        c = new a();
        if (i1 < h)
        {
            c.a = g;
        } else
        {
            c.a = i1;
        }
        c.b = f1;
        c.e = flag;
        c.f = flag1;
        c.g = yumestoragemode;
        c();
        if (c.e)
        {
            d.a(a());
        }
        d.a(c.e);
        d.b(c.f);
        d.a("********** YUME BSP PARAMS - BEGIN **********");
        d.a((new StringBuilder("adTimeout: ")).append(c.a).toString());
        d.a((new StringBuilder("storageSize: ")).append(c.b).toString());
        d.a((new StringBuilder("storageMode: ")).append(c.g).toString());
        d.a("********** YUME BSP PARAMS - END **********");
        return "";
    }

    private static void a(String s1)
        throws YuMeBSPException
    {
        d.b(s1);
        throw new YuMeBSPException(s1);
    }

    static boolean b()
    {
        String s1 = Environment.getExternalStorageState();
        boolean flag;
        boolean flag1;
        if ("mounted".equals(s1))
        {
            flag = true;
            flag1 = true;
        } else
        if ("mounted_ro".equals(s1))
        {
            flag = false;
            flag1 = true;
        } else
        {
            flag = false;
            flag1 = false;
        }
        return flag1 && flag;
    }

    private boolean b(String s1)
    {
        d.a((new StringBuilder("Storage Dir Path: ")).append(s1).toString());
        s1 = new File((new StringBuilder(String.valueOf(s1))).append("/yume_android_sdk").toString());
        if (!s1.exists())
        {
            if (!s1.mkdir())
            {
                d.b("Error creating yume_android_sdk directory.");
                return false;
            }
        } else
        {
            d.a("yume_android_sdk directory already exists.");
        }
        m = (new StringBuilder(String.valueOf(s1.getAbsolutePath()))).append("/downloading_assets").toString();
        File file = new File(m);
        if (!file.exists())
        {
            if (!file.mkdir())
            {
                d.b("Error creating downloading_assets directory.");
                return false;
            }
        } else
        {
            d.a("downloading_assets directory already exists.");
        }
        n = (new StringBuilder(String.valueOf(s1.getAbsolutePath()))).append("/downloaded_assets").toString();
        s1 = new File(n);
        if (!s1.exists())
        {
            if (!s1.mkdir())
            {
                d.b("Error creating downloaded_assets directory.");
                return false;
            }
        } else
        {
            d.a("downloaded_assets directory already exists.");
        }
        return true;
    }

    private void c()
    {
        if (c.g == YuMeStorageMode.NONE) goto _L2; else goto _L1
_L1:
        if (c.g != YuMeStorageMode.EXTERNAL_STORAGE) goto _L4; else goto _L3
_L3:
        if (b()) goto _L6; else goto _L5
_L5:
        d.a("External Storage not accessible. Hence, not creating Asset Storage directory.");
_L8:
        c.c = m;
        c.d = n;
        if (f != null)
        {
            f.a(c.d);
        }
_L2:
        return;
_L6:
        Object obj = a();
        if (obj != null)
        {
            obj = ((Context) (obj)).getExternalFilesDir(null);
            if (obj != null)
            {
                k = ((File) (obj)).getAbsolutePath();
            }
            if (k == null)
            {
                File file = Environment.getExternalStorageDirectory();
                if (file != null)
                {
                    k = file.getAbsolutePath();
                }
            }
            if (k == null)
            {
                d.a("Error getting External Storage Path. Hence, not creating Asset Storage directory.");
            } else
            {
                b(k);
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (c.g == YuMeStorageMode.INTERNAL_STORAGE)
        {
            Object obj1 = a();
            if (obj1 != null)
            {
                obj1 = ((Context) (obj1)).getDir("data", 0);
                if (obj1 != null)
                {
                    l = ((File) (obj1)).getAbsolutePath();
                }
                if (l == null)
                {
                    d.a("Error getting Internal Storage Path. Hence, not creating Asset Storage directory.");
                } else
                {
                    b(l);
                }
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void YuMeBSP_AbortDownloads()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_AbortDownloads(): YuMe BSP is not Initialized.");
        }
        e.c();
    }

    public void YuMeBSP_ClearCookies()
        throws YuMeBSPException
    {
        i i1;
label0:
        {
            if (!b)
            {
                a("YuMeBSP_ClearCookies(): YuMe BSP is not Initialized.");
            }
            i1 = e;
            if (i1.c != null)
            {
                List list = i1.c.getCookies();
                if (list != null)
                {
                    if (!list.isEmpty())
                    {
                        break label0;
                    }
                    i1.a.a("No Cookies to be Cleared.");
                }
            }
            return;
        }
        i1.c.clear();
        i1.a.a("Cookies Cleared.");
    }

    public void YuMeBSP_DeInit()
        throws YuMeBSPException
    {
        d.a("YuMeBSP_DeInit(): Invoked.");
        if (!b)
        {
            a("YuMeBSP_DeInit(): YuMe BSP is not Initialized.");
        }
        if (e != null)
        {
            e.a();
            e = null;
        }
        f = null;
        b = false;
        d.a("YuMeBSP_DeInit(): Successful.");
    }

    public int YuMeBSP_GetAdConnectionTimeoutSec()
        throws YuMeBSPException
    {
        int i1 = 0;
        if (!b)
        {
            a("YuMeBSP_GetAdConnectionTimeoutSec(): YuMe BSP is not Initialized.");
        }
        if (c != null)
        {
            i1 = c.a;
        }
        return i1;
    }

    public String YuMeBSP_GetCity()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetCity(): YuMe BSP is not Initialized.");
        }
        return d.n;
    }

    public YuMeConnectionType YuMeBSP_GetConnectionType()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetConnectionType(): YuMe BSP is not Initialized.");
        }
        return f.c();
    }

    public String YuMeBSP_GetCountryCode()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetCountryCode(): YuMe BSP is not Initialized.");
        }
        return d.l;
    }

    public int YuMeBSP_GetDeviceDisplayHeight()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetDeviceDisplayHeight(): YuMe BSP is not Initialized.");
        }
        return f.g();
    }

    public int YuMeBSP_GetDeviceDisplayWidth()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetDeviceDisplayWidth(): YuMe BSP is not Initialized.");
        }
        return f.f();
    }

    public YuMeDeviceInfo YuMeBSP_GetDeviceInfo()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetDeviceInfo(): YuMe BSP is not Initialized.");
        }
        YuMeDeviceInfo yumedeviceinfo = new YuMeDeviceInfo();
        yumedeviceinfo.osPlatform = d.e;
        yumedeviceinfo.swVersion = d.f;
        yumedeviceinfo.hwVersion = d.i;
        yumedeviceinfo.make = d.c;
        yumedeviceinfo.model = d.d;
        yumedeviceinfo.countryCode = d.l;
        yumedeviceinfo.state = d.m;
        yumedeviceinfo.city = d.n;
        yumedeviceinfo.postalCode = d.o;
        yumedeviceinfo.serviceProvider = d.j;
        yumedeviceinfo.displayHeight = d.h;
        yumedeviceinfo.displayWidth = d.g;
        yumedeviceinfo.eType = d.p;
        yumedeviceinfo.supportedConnectionTypes = d.k;
        yumedeviceinfo.uuid = d.b;
        return yumedeviceinfo;
    }

    public String YuMeBSP_GetDeviceOrientation()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetDeviceOrientation(): YuMe BSP is not Initialized.");
        }
        return com.yume.android.bsp.d.e();
    }

    public YuMeDeviceType YuMeBSP_GetDeviceType()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetDeviceType(): YuMe BSP is not Initialized.");
        }
        return d.p;
    }

    public String YuMeBSP_GetDeviceUUID()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetDeviceUUID(): YuMe BSP is not Initialized.");
        }
        return d.b;
    }

    public float YuMeBSP_GetFreeRAMSizeMB()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetFreeRAMSizeMB(): YuMe BSP is not Initialized.");
        }
        return 0.0F;
    }

    public float YuMeBSP_GetFreeStorageSizeMB()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetFreeStorageSizeMB(): YuMe BSP is not Initialized.");
        }
        return f.j();
    }

    public String YuMeBSP_GetHardwareVersion()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetHardwareVersion(): YuMe BSP is not Initialized.");
        }
        return d.i;
    }

    public String YuMeBSP_GetLatitude()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetLatitude(): YuMe BSP is not Initialized.");
        }
        f.a(false);
        return com.yume.android.bsp.d.h();
    }

    public int YuMeBSP_GetLineSpeedKbps()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetLineSpeedKbps(): YuMe BSP is not Initialized.");
        }
        return 0;
    }

    public String YuMeBSP_GetLongitude()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetLongitude(): YuMe BSP is not Initialized.");
        }
        f.a(false);
        return com.yume.android.bsp.d.i();
    }

    public String YuMeBSP_GetMake()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetMake(): YuMe BSP is not Initialized.");
        }
        return d.c;
    }

    public float YuMeBSP_GetMaxPersistentStorageMB()
        throws YuMeBSPException
    {
        float f1 = 0.0F;
        if (!b)
        {
            a("YuMeBSP_GetMaxPersistentStorageMB(): YuMe BSP is not Initialized.");
        }
        if (c != null)
        {
            f1 = c.b;
        }
        return f1;
    }

    public String YuMeBSP_GetModel()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetModel(): YuMe BSP is not Initialized.");
        }
        return d.d;
    }

    public String YuMeBSP_GetOSPlatform()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetOSPlatform(): YuMe BSP is not Initialized.");
        }
        return d.e;
    }

    public String YuMeBSP_GetPersistentStoragePath()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetPersistentStoragePath(): YuMe BSP is not Initialized.");
        }
        String s1 = null;
        if (c != null)
        {
            s1 = c.d;
        }
        return s1;
    }

    public void YuMeBSP_GetPlaylist(String s1, JSONObject jsonobject, String s2, int i1)
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetPlaylist(): YuMe BSP is not Initialized.");
        }
        e.a(s1, jsonobject, s2, i1);
    }

    public String YuMeBSP_GetPostalCode()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetPostalCode(): YuMe BSP is not Initialized.");
        }
        return d.o;
    }

    public List YuMeBSP_GetPublicIPAddress()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetPublicIPAddress(): YuMe BSP is not Initialized.");
        }
        return com.yume.android.bsp.d.b();
    }

    public String YuMeBSP_GetServiceProvider()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetServiceProvider(): YuMe BSP is not Initialized.");
        }
        return d.j;
    }

    public String YuMeBSP_GetSoftwareVersion()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetSoftwareVersion(): YuMe BSP is not Initialized.");
        }
        return d.f;
    }

    public String YuMeBSP_GetState()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetState(): YuMe BSP is not Initialized.");
        }
        return d.m;
    }

    public YuMeStorageMode YuMeBSP_GetStorageMode()
        throws YuMeBSPException
    {
        d.a("YuMeBSP_GetStorageMode(): Invoked.");
        YuMeStorageMode yumestoragemode = null;
        if (!b)
        {
            a("YuMeBSP_GetStorageMode(): YuMe BSP is not Initialized.");
        }
        if (c != null)
        {
            yumestoragemode = c.g;
        }
        d.a("YuMeBSP_GetStorageMode(): Successful.");
        return yumestoragemode;
    }

    public List YuMeBSP_GetSupportedConnectionTypes()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetSupportedConnectionTypes(): YuMe BSP is not Initialized.");
        }
        return f.d();
    }

    public String YuMeBSP_GetTempStoragePath()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetTempStoragePath(): YuMe BSP is not Initialized.");
        }
        String s1 = null;
        if (c != null)
        {
            s1 = c.c;
        }
        return s1;
    }

    public float YuMeBSP_GetTotalRAMSizeMB()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetTotalRAMSizeMB(): YuMe BSP is not Initialized.");
        }
        return 0.0F;
    }

    public float YuMeBSP_GetTotalStorageSizeMB()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetTotalStorageSizeMB(): YuMe BSP is not Initialized.");
        }
        return d.q;
    }

    public String YuMeBSP_GetUserAgent()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_GetUserAgent(): YuMe BSP is not Initialized.");
        }
        return e.b();
    }

    public String YuMeBSP_GetVersion()
        throws YuMeBSPException
    {
        String s1 = s.a();
        d.a((new StringBuilder("YuMe BSP Version: ")).append(s1).toString());
        return s1;
    }

    public void YuMeBSP_HandleBroadcastEvent(String s1)
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_HandleBroadcastEvent(): YuMe BSP is not Initialized.");
        }
        if (s1 != null)
        {
            if (s1.equalsIgnoreCase("android.intent.action.MEDIA_REMOVED") || s1.equalsIgnoreCase("android.intent.action.MEDIA_UNMOUNTED") || s1.equalsIgnoreCase("android.intent.action.MEDIA_BAD_REMOVAL") || s1.equalsIgnoreCase("android.intent.action.MEDIA_EJECT") || s1.equalsIgnoreCase("android.intent.action.MEDIA_SHARED"))
            {
                d.b();
                d.a(false);
            } else
            if (s1.equalsIgnoreCase("android.intent.action.MEDIA_MOUNTED"))
            {
                c();
                if (c.e)
                {
                    d.a(true);
                    d.a(a());
                    return;
                }
            }
        }
    }

    public void YuMeBSP_Init(int i1, float f1, YuMeStorageMode yumestoragemode, boolean flag, boolean flag1, YuMeSDKBSPInterface yumesdkbspinterface)
        throws YuMeBSPException
    {
        d.a("YuMeBSP_Init(): Invoked.");
        if (b)
        {
            a("YuMeBSP_Init(): YuMe BSP is already Initialized.");
        }
        if (yumesdkbspinterface == null)
        {
            a("YuMeBSP_Init(): Invalid YuMe SDK Interface object.");
        }
        a = yumesdkbspinterface;
        yumestoragemode = a(i1, f1, yumestoragemode, flag, flag1);
        if (r.a(yumestoragemode))
        {
            a((new StringBuilder("YuMeBSP_Init(): ")).append(yumestoragemode).toString());
        }
        a();
        e = new i();
        yumestoragemode = new d();
        f = yumestoragemode;
        yumestoragemode.a(c.d);
        f.a();
        b = true;
        d.a("YuMeBSP_Init(): Successful.");
    }

    public boolean YuMeBSP_IsCallOperationSupported()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_IsCallOperationSupported(): YuMe BSP is not Initialized.");
        }
        boolean flag1 = false;
        boolean flag = flag1;
        if (d.p != YuMeDeviceType.TELEVISION)
        {
            Object obj = new Intent("android.intent.action.DIAL", Uri.parse("tel:0000000000"));
            Context context = a.YuMeSDKBSP_GetActivityContext();
            flag = flag1;
            if (context != null)
            {
                obj = ((Intent) (obj)).resolveActivity(context.getPackageManager());
                flag = flag1;
                if (obj != null)
                {
                    flag = flag1;
                    if (!((ComponentName) (obj)).toString().contains("com.android.phone.EmptyDialActivity"))
                    {
                        flag = flag1;
                        if (!((ComponentName) (obj)).toString().contains("com.android.contacts.activities.NonPhoneActivity"))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public void YuMeBSP_MakeCall(String s1)
        throws YuMeBSPException
    {
label0:
        {
            if (!b)
            {
                a("YuMeBSP_MakeCall(): YuMe BSP is not Initialized.");
            }
            if (r.a(s1))
            {
                s1 = new Intent("android.intent.action.DIAL", Uri.parse(s1));
                Context context = a.YuMeSDKBSP_GetActivityContext();
                if (context == null)
                {
                    break label0;
                }
                context.startActivity(s1);
            }
            return;
        }
        d.b("Call Operation cannot be accomplished.");
    }

    public void YuMeBSP_ModifyParams(int i1, float f1, YuMeStorageMode yumestoragemode, boolean flag, boolean flag1)
        throws YuMeBSPException
    {
        d.a("YuMeBSP_ModifyParams(): Invoked.");
        if (!b)
        {
            a("YuMeBSP_ModifyParams(): YuMe BSP is not Initialized.");
        }
        yumestoragemode = a(i1, f1, yumestoragemode, flag, flag1);
        if (r.a(yumestoragemode))
        {
            a((new StringBuilder("YuMeBSP_ModifyParams(): ")).append(yumestoragemode).toString());
        }
        d.a("YuMeBSP_ModifyParams(): Successful.");
    }

    public void YuMeBSP_PauseDownloads()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_PauseDownloads(): YuMe BSP is not Initialized.");
        }
        i i1 = e;
        if (i1.b != null)
        {
            i1.a.a("Pausing BSP Downloads...");
            (new Thread(new m(i1))).start();
        }
    }

    public void YuMeBSP_ResumeDownloads()
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_ResumeDownloads(): YuMe BSP is not Initialized.");
        }
        i i1 = e;
        if (i1.b != null)
        {
            i1.a.a("Resuming BSP Downloads...");
            (new Thread(new n(i1))).start();
        }
    }

    public void YuMeBSP_SendTracker(String s1, int i1)
        throws YuMeBSPException
    {
        if (!b)
        {
            a("YuMeBSP_SendTracker(): YuMe BSP is not Initialized.");
        }
        e.a(s1, i1);
    }

}
