// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import com.facebook.debug.log.b;
import com.facebook.r;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c
{

    private static int A = -1;
    private static int B = 4;
    private static boolean C = false;
    private static int D = 2;
    private static int E = 48;
    private static int F = 40;
    private static boolean a = false;
    private static int b = 1;
    private static int c = 0x96000;
    private static String d = "Android-Mms/2.0";
    private static String e = "x-wap-profile";
    private static String f = null;
    private static String g = null;
    private static String h = null;
    private static String i = null;
    private static int j = 1200;
    private static int k = 1600;
    private static int l = 0x7fffffff;
    private static int m = 500;
    private static int n = 50;
    private static int o = 2;
    private static int p = 5000;
    private static int q = 60000;
    private static int r = 7;
    private static boolean s = false;
    private static boolean t = true;
    private static int u = 4;
    private static boolean v = true;
    private static boolean w = true;
    private static boolean x = true;
    private static boolean y = true;
    private static boolean z = true;

    public c()
    {
    }

    public static void a(Context context)
    {
        b(context);
        if ("htc first".equals(Build.MODEL.toLowerCase(Locale.US)) || "mystul".equals(Build.MODEL.toLowerCase(Locale.US)))
        {
            p();
        }
    }

    public static final void a(XmlPullParser xmlpullparser)
    {
        int i1;
        do
        {
            i1 = xmlpullparser.next();
        } while (i1 != 2 && i1 != 1);
    }

    public static final void a(XmlPullParser xmlpullparser, String s1)
    {
        int i1;
        do
        {
            i1 = xmlpullparser.next();
        } while (i1 != 2 && i1 != 1);
        if (i1 != 2)
        {
            throw new XmlPullParserException("No start tag found");
        }
        if (!xmlpullparser.getName().equals(s1))
        {
            throw new XmlPullParserException((new StringBuilder()).append("Unexpected start tag: found ").append(xmlpullparser.getName()).append(", expected ").append(s1).toString());
        } else
        {
            return;
        }
    }

    public static boolean a()
    {
        return b == 1;
    }

    public static int b()
    {
        return c;
    }

    private static void b(Context context)
    {
        XmlResourceParser xmlresourceparser = context.getResources().getXml(r.mms_config);
        a(xmlresourceparser, "mms_config");
_L4:
        String s1;
        a(xmlresourceparser);
        s1 = xmlresourceparser.getName();
        if (s1 != null) goto _L2; else goto _L1
_L1:
        xmlresourceparser.close();
_L9:
        String s2;
        String s3;
        int i1;
        if (a() && f == null)
        {
            context = "uaProfUrl";
        } else
        {
            context = null;
        }
        if (context != null)
        {
            com.facebook.debug.log.b.e("MmsConfig", String.format("MmsConfig.loadMmsSettings mms_config.xml missing %s setting", new Object[] {
                context
            }));
        }
        return;
_L2:
        s2 = xmlresourceparser.getAttributeName(0);
        s3 = xmlresourceparser.getAttributeValue(0);
        if (xmlresourceparser.next() != 4)
        {
            break MISSING_BLOCK_LABEL_971;
        }
        context = xmlresourceparser.getText();
_L22:
        com.facebook.debug.log.b.a("MmsConfig", (new StringBuilder()).append("tag: ").append(s1).append(" value: ").append(s3).append(" - ").append(context).toString());
        if (!"name".equalsIgnoreCase(s2)) goto _L4; else goto _L3
_L3:
        if (!"bool".equals(s1)) goto _L6; else goto _L5
_L5:
        if (!"enabledMMS".equalsIgnoreCase(s3)) goto _L8; else goto _L7
_L7:
        if ("true".equalsIgnoreCase(context))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        b = i1;
          goto _L4
        context;
        com.facebook.debug.log.b.d("MmsConfig", "loadMmsSettings caught ", context);
        xmlresourceparser.close();
          goto _L9
_L8:
        if (!"enabledTransID".equalsIgnoreCase(s3))
        {
            break MISSING_BLOCK_LABEL_272;
        }
        a = "true".equalsIgnoreCase(context);
          goto _L4
        context;
        com.facebook.debug.log.b.d("MmsConfig", "loadMmsSettings caught ", context);
        xmlresourceparser.close();
          goto _L9
        if (!"enabledNotifyWapMMSC".equalsIgnoreCase(s3))
        {
            break MISSING_BLOCK_LABEL_315;
        }
        s = "true".equalsIgnoreCase(context);
          goto _L4
        context;
        com.facebook.debug.log.b.d("MmsConfig", "loadMmsSettings caught ", context);
        xmlresourceparser.close();
          goto _L9
        if (!"aliasEnabled".equalsIgnoreCase(s3))
        {
            break MISSING_BLOCK_LABEL_348;
        }
        C = "true".equalsIgnoreCase(context);
          goto _L4
        context;
        xmlresourceparser.close();
        throw context;
label0:
        {
            if (!"allowAttachAudio".equalsIgnoreCase(s3))
            {
                break label0;
            }
            t = "true".equalsIgnoreCase(context);
        }
          goto _L4
label1:
        {
            if (!"enableMultipartSMS".equalsIgnoreCase(s3))
            {
                break label1;
            }
            v = "true".equalsIgnoreCase(context);
        }
          goto _L4
label2:
        {
            if (!"enableSlideDuration".equalsIgnoreCase(s3))
            {
                break label2;
            }
            w = "true".equalsIgnoreCase(context);
        }
          goto _L4
label3:
        {
            if (!"enableMMSReadReports".equalsIgnoreCase(s3))
            {
                break label3;
            }
            x = "true".equalsIgnoreCase(context);
        }
          goto _L4
        if (!"enableSMSDeliveryReports".equalsIgnoreCase(s3)) goto _L11; else goto _L10
_L10:
        y = "true".equalsIgnoreCase(context);
          goto _L4
_L11:
        if (!"enableMMSDeliveryReports".equalsIgnoreCase(s3)) goto _L4; else goto _L12
_L12:
        z = "true".equalsIgnoreCase(context);
          goto _L4
_L6:
        if (!"int".equals(s1)) goto _L14; else goto _L13
_L13:
        if (!"maxMessageSize".equalsIgnoreCase(s3))
        {
            break MISSING_BLOCK_LABEL_523;
        }
        c = Integer.parseInt(context);
          goto _L4
label4:
        {
            if (!"maxImageHeight".equalsIgnoreCase(s3))
            {
                break label4;
            }
            j = Integer.parseInt(context);
        }
          goto _L4
label5:
        {
            if (!"maxImageWidth".equalsIgnoreCase(s3))
            {
                break label5;
            }
            k = Integer.parseInt(context);
        }
          goto _L4
label6:
        {
            if (!"defaultSMSMessagesPerThread".equalsIgnoreCase(s3))
            {
                break label6;
            }
            m = Integer.parseInt(context);
        }
          goto _L4
label7:
        {
            if (!"defaultMMSMessagesPerThread".equalsIgnoreCase(s3))
            {
                break label7;
            }
            n = Integer.parseInt(context);
        }
          goto _L4
label8:
        {
            if (!"minMessageCountPerThread".equalsIgnoreCase(s3))
            {
                break label8;
            }
            o = Integer.parseInt(context);
        }
          goto _L4
label9:
        {
            if (!"maxMessageCountPerThread".equalsIgnoreCase(s3))
            {
                break label9;
            }
            p = Integer.parseInt(context);
        }
          goto _L4
label10:
        {
            if (!"recipientLimit".equalsIgnoreCase(s3))
            {
                break label10;
            }
            l = Integer.parseInt(context);
            if (l < 0)
            {
                l = 0x7fffffff;
            }
        }
          goto _L4
label11:
        {
            if (!"httpSocketTimeout".equalsIgnoreCase(s3))
            {
                break label11;
            }
            q = Integer.parseInt(context);
        }
          goto _L4
label12:
        {
            if (!"minimumSlideElementDuration".equalsIgnoreCase(s3))
            {
                break label12;
            }
            r = Integer.parseInt(context);
        }
          goto _L4
label13:
        {
            if (!"maxSizeScaleForPendingMmsAllowed".equalsIgnoreCase(s3))
            {
                break label13;
            }
            B = Integer.parseInt(context);
        }
          goto _L4
label14:
        {
            if (!"aliasMinChars".equalsIgnoreCase(s3))
            {
                break label14;
            }
            D = Integer.parseInt(context);
        }
          goto _L4
label15:
        {
            if (!"aliasMaxChars".equalsIgnoreCase(s3))
            {
                break label15;
            }
            E = Integer.parseInt(context);
        }
          goto _L4
label16:
        {
            if (!"smsToMmsTextThreshold".equalsIgnoreCase(s3))
            {
                break label16;
            }
            u = Integer.parseInt(context);
        }
          goto _L4
        if (!"maxMessageTextSize".equalsIgnoreCase(s3)) goto _L16; else goto _L15
_L15:
        A = Integer.parseInt(context);
          goto _L4
_L16:
        if (!"maxSubjectLength".equalsIgnoreCase(s3)) goto _L4; else goto _L17
_L17:
        F = Integer.parseInt(context);
          goto _L4
_L14:
        if (!"string".equals(s1)) goto _L4; else goto _L18
_L18:
        if (!"userAgent".equalsIgnoreCase(s3))
        {
            break MISSING_BLOCK_LABEL_877;
        }
        d = context;
          goto _L4
label17:
        {
            if (!"uaProfTagName".equalsIgnoreCase(s3))
            {
                break label17;
            }
            e = context;
        }
          goto _L4
label18:
        {
            if (!"uaProfUrl".equalsIgnoreCase(s3))
            {
                break label18;
            }
            f = context;
        }
          goto _L4
label19:
        {
            if (!"httpParams".equalsIgnoreCase(s3))
            {
                break label19;
            }
            g = context;
        }
          goto _L4
        if (!"httpParamsLine1Key".equalsIgnoreCase(s3)) goto _L20; else goto _L19
_L19:
        h = context;
          goto _L4
_L20:
        if (!"emailGatewayNumber".equalsIgnoreCase(s3)) goto _L4; else goto _L21
_L21:
        i = context;
          goto _L4
        context = null;
          goto _L22
    }

    public static boolean c()
    {
        return a;
    }

    public static String d()
    {
        return d;
    }

    public static String e()
    {
        return e;
    }

    public static String f()
    {
        return f;
    }

    public static String g()
    {
        return g;
    }

    public static String h()
    {
        return h;
    }

    public static int i()
    {
        return j;
    }

    public static int j()
    {
        return k;
    }

    public static int k()
    {
        return q;
    }

    public static boolean l()
    {
        return s;
    }

    public static boolean m()
    {
        return C;
    }

    public static int n()
    {
        return D;
    }

    public static int o()
    {
        return E;
    }

    private static void p()
    {
        d = "HTC_PM33100";
        f = "http://www.htcmms.com.tw/Android/ATT/PM331/ua-profile.xml";
    }

}
