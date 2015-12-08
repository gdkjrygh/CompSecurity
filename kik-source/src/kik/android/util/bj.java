// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.app.Activity;
import android.net.Uri;
import com.kik.android.a;
import com.kik.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kik.a.h.j;
import kik.android.a.b;
import kik.android.chat.KikApplication;
import kik.android.chat.activity.k;

public final class bj
{

    public final String a = "kik-internal";
    private final int b = 0x7f02018e;
    private a c;

    public bj()
    {
    }

    private static int a(String s)
    {
        s.hashCode();
        JVM INSTR lookupswitch 19: default 168
    //                   -1693533772: 376
    //                   -1456833441: 361
    //                   -1192403953: 496
    //                   -1082234129: 332
    //                   -958726582: 290
    //                   -599897208: 318
    //                   -449382204: 511
    //                   -81857902: 481
    //                   3198785: 406
    //                   3373707: 276
    //                   96619420: 262
    //                   102851257: 451
    //                   108404047: 304
    //                   109627663: 466
    //                   874513490: 421
    //                   926873033: 391
    //                   1286305040: 526
    //                   1520677751: 346
    //                   1793855977: 436;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L1:
        byte byte0 = -1;
_L22:
        switch (byte0)
        {
        default:
            return -1;

        case 0: // '\0'
            return 0x7f0902b6;

        case 1: // '\001'
            return 0x7f0902da;

        case 2: // '\002'
            return 0x7f090069;

        case 3: // '\003'
            return 0x7f0902ff;

        case 4: // '\004'
            return 0x7f09028f;

        case 5: // '\005'
            return 0x7f0902b9;

        case 6: // '\006'
            return 0x7f090231;

        case 7: // '\007'
            return 0x7f09022e;

        case 8: // '\b'
            return 0x7f09022f;

        case 9: // '\t'
            return 0x7f0902f1;

        case 10: // '\n'
            return 0x7f0902c1;

        case 11: // '\013'
            return 0x7f0902d0;

        case 12: // '\f'
            return 0x7f0902b0;

        case 13: // '\r'
            return 0x7f0902cf;

        case 14: // '\016'
            return 0x7f09030b;

        case 15: // '\017'
            return 0x7f090322;

        case 16: // '\020'
            return 0x7f0902ce;

        case 17: // '\021'
            return 0x7f0902e6;

        case 18: // '\022'
            return 0x7f090297;
        }
_L12:
        if (!s.equals("email")) goto _L1; else goto _L21
_L21:
        byte0 = 0;
          goto _L22
_L11:
        if (!s.equals("name")) goto _L1; else goto _L23
_L23:
        byte0 = 1;
          goto _L22
_L6:
        if (!s.equals("change_password")) goto _L1; else goto _L24
_L24:
        byte0 = 2;
          goto _L22
_L14:
        if (!s.equals("reset")) goto _L1; else goto _L25
_L25:
        byte0 = 3;
          goto _L22
_L7:
        if (!s.equals("address_book_matching")) goto _L1; else goto _L26
_L26:
        byte0 = 4;
          goto _L22
_L5:
        if (!s.equals("enter_key_send")) goto _L1; else goto _L27
_L27:
        byte0 = 5;
          goto _L22
_L19:
        if (!s.equals("chat_bubble_color")) goto _L1; else goto _L28
_L28:
        byte0 = 6;
          goto _L22
_L3:
        if (!s.equals("auto_download_videos")) goto _L1; else goto _L29
_L29:
        byte0 = 7;
          goto _L22
_L2:
        if (!s.equals("autoplay_videos")) goto _L1; else goto _L30
_L30:
        byte0 = 8;
          goto _L22
_L17:
        if (!s.equals("privacy_policy")) goto _L1; else goto _L31
_L31:
        byte0 = 9;
          goto _L22
_L10:
        if (!s.equals("help")) goto _L1; else goto _L32
_L32:
        byte0 = 10;
          goto _L22
_L16:
        if (!s.equals("licenses")) goto _L1; else goto _L33
_L33:
        byte0 = 11;
          goto _L22
_L20:
        if (!s.equals("developers")) goto _L1; else goto _L34
_L34:
        byte0 = 12;
          goto _L22
_L13:
        if (!s.equals("legal")) goto _L1; else goto _L35
_L35:
        byte0 = 13;
          goto _L22
_L15:
        if (!s.equals("sound")) goto _L1; else goto _L36
_L36:
        byte0 = 14;
          goto _L22
_L9:
        if (!s.equals("vibration")) goto _L1; else goto _L37
_L37:
        byte0 = 15;
          goto _L22
_L4:
        if (!s.equals("LED_color")) goto _L1; else goto _L38
_L38:
        byte0 = 16;
          goto _L22
_L8:
        if (!s.equals("notify_new_people")) goto _L1; else goto _L39
_L39:
        byte0 = 17;
          goto _L22
_L18:
        if (!s.equals("block_list")) goto _L1; else goto _L40
_L40:
        byte0 = 18;
          goto _L22
    }

    private static kik.android.chat.fragment.settings.KikPreferenceFragment.a a(int i)
    {
        kik.android.chat.fragment.settings.KikPreferenceFragment.a a1 = new kik.android.chat.fragment.settings.KikPreferenceFragment.a();
        a1.a(i).a().d();
        return a1;
    }

    public final void a(a a1)
    {
        c = a1;
    }

    public final boolean a(String s, Activity activity)
    {
        Object obj;
        Object obj2;
        boolean flag1;
        obj = Uri.parse(s);
        if (obj == null || ((Uri) (obj)).getScheme() == null || !((Uri) (obj)).getScheme().equals("kik-internal"))
        {
            return false;
        }
        obj2 = new ArrayList();
        ((ArrayList) (obj2)).add(((Uri) (obj)).getHost());
        ((ArrayList) (obj2)).addAll(((Uri) (obj)).getPathSegments());
        HashMap hashmap = new HashMap();
        String s1 = ((Uri) (obj)).getQuery();
        if (s1 != null)
        {
            String as[] = s1.split("&");
            int i1 = as.length;
            for (int i = 0; i < i1; i++)
            {
                String s2 = as[i];
                hashmap.put(s2, ((Uri) (obj)).getQueryParameter(s2));
            }

        }
        flag1 = hashmap.containsKey("callout");
        obj = (String)((ArrayList) (obj2)).get(0);
        ((String) (obj)).hashCode();
        JVM INSTR tableswitch 1434631203 1434631203: default 176
    //                   1434631203 370;
           goto _L1 _L2
_L1:
        int l = -1;
_L6:
        l;
        JVM INSTR tableswitch 0 0: default 200
    //                   0 385;
           goto _L3 _L4
_L3:
        obj = null;
        flag1 = false;
_L25:
        if (obj != null)
        {
            long l2 = j.b();
            Object obj1 = KikApplication.i();
            obj2 = new HashMap();
            ((Map) (obj2)).put("URI", s);
            ((Map) (obj2)).put("source", "contentMessage");
            HashMap hashmap1 = new HashMap();
            boolean flag;
            long l1;
            if (flag1)
            {
                l1 = 1L;
            } else
            {
                l1 = 0L;
            }
            hashmap1.put("calloutShown", Long.valueOf(l1));
            hashmap1.put("fromVerifiedAccount", Long.valueOf(1L));
            ((b) (obj1)).c().a(com.kik.d.b.a.k.X, ((Map) (obj2)), null, hashmap1, Long.valueOf(l2).longValue());
            c.b("Deep Link Tapped").a("Source", "contentMessage").a("URI", s).a("Callout Shown", flag1).a("From Verified Account", true).b();
            k.a(((an) (obj)), activity).f();
            return true;
        } else
        {
            return false;
        }
_L2:
        if (!((String) (obj)).equals("settings")) goto _L1; else goto _L5
_L5:
        l = 0;
          goto _L6
_L4:
        obj1 = new kik.android.chat.fragment.KikPreferenceLaunchpad.a();
        obj = obj1;
        if (((ArrayList) (obj2)).size() <= 1) goto _L8; else goto _L7
_L7:
        flag = false;
        obj = (String)((ArrayList) (obj2)).get(1);
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 7: default 488
    //                   -743596758: 631
    //                   -645136353: 663
    //                   81298382: 647
    //                   613285409: 599
    //                   928975893: 583
    //                   1272354024: 615
    //                   1904292169: 567;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L9:
        l = -1;
_L27:
        l;
        JVM INSTR tableswitch 0 6: default 536
    //                   0 680
    //                   1 722
    //                   2 740
    //                   3 784
    //                   4 828
    //                   5 931
    //                   6 975;
           goto _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L17:
        obj = null;
_L8:
        if ((obj instanceof kik.android.chat.fragment.settings.PreferenceFragment.a) && !((kik.android.chat.fragment.settings.PreferenceFragment.a)obj).c().equals(""))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L25
_L16:
        if (!((String) (obj)).equals("share_profile")) goto _L9; else goto _L26
_L26:
        l = 0;
          goto _L27
_L14:
        if (!((String) (obj)).equals("set_photo")) goto _L9; else goto _L28
_L28:
        l = 1;
          goto _L27
_L13:
        if (!((String) (obj)).equals("your_account")) goto _L9; else goto _L29
_L29:
        l = 2;
          goto _L27
_L15:
        if (!((String) (obj)).equals("notifications")) goto _L9; else goto _L30
_L30:
        l = 3;
          goto _L27
_L10:
        if (!((String) (obj)).equals("chat_settings")) goto _L9; else goto _L31
_L31:
        l = 4;
          goto _L27
_L12:
        if (!((String) (obj)).equals("help_about_us")) goto _L9; else goto _L32
_L32:
        l = 5;
          goto _L27
_L11:
        if (!((String) (obj)).equals("kik_code")) goto _L9; else goto _L33
_L33:
        l = 6;
          goto _L27
_L18:
        ((kik.android.chat.fragment.KikPreferenceLaunchpad.a)obj1).c();
        l = ((flag) ? 1 : 0);
        obj = obj1;
_L34:
        if (l > 0 && flag1)
        {
            ((kik.android.chat.fragment.settings.PreferenceFragment.a)obj).a(KikApplication.f(l));
        } else
        if (l < 0)
        {
            obj = null;
        }
          goto _L8
_L19:
        obj = (new kik.android.chat.fragment.KikPreferenceLaunchpad.a()).a();
        l = ((flag) ? 1 : 0);
          goto _L34
_L20:
        obj1 = a(0x7f070077);
        obj = obj1;
        l = ((flag) ? 1 : 0);
        if (((ArrayList) (obj2)).size() > 2)
        {
            l = a((String)((ArrayList) (obj2)).get(2));
            obj = obj1;
        }
          goto _L34
_L21:
        obj1 = a(0x7f07007a);
        obj = obj1;
        l = ((flag) ? 1 : 0);
        if (((ArrayList) (obj2)).size() > 2)
        {
            l = a((String)((ArrayList) (obj2)).get(2));
            obj = obj1;
        }
          goto _L34
_L22:
        obj1 = a(0x7f070078);
        obj = obj1;
        l = ((flag) ? 1 : 0);
        if (((ArrayList) (obj2)).size() > 2)
        {
            if (((String)((ArrayList) (obj2)).get(2)).equals("block_list") && ((ArrayList) (obj2)).size() > 3 && ((String)((ArrayList) (obj2)).get(3)).equals("select_user_to_block"))
            {
                obj = new kik.android.chat.fragment.KikAddToBlockFragment.a();
                l = ((flag) ? 1 : 0);
            } else
            {
                l = a((String)((ArrayList) (obj2)).get(2));
                obj = obj1;
            }
        }
          goto _L34
_L23:
        obj1 = a(0x7f070076);
        obj = obj1;
        l = ((flag) ? 1 : 0);
        if (((ArrayList) (obj2)).size() > 2)
        {
            l = a((String)((ArrayList) (obj2)).get(2));
            obj = obj1;
        }
          goto _L34
_L24:
        obj = (new kik.android.chat.fragment.ScanCodeTabFragment.a()).a(true).a(kik.android.chat.fragment.ScanCodeTabFragment.c.e);
        l = ((flag) ? 1 : 0);
          goto _L34
    }
}
