// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.yume.android.sdk:
//            M, aq, C, D, 
//            g, h, k, q, 
//            ar, ax, YuMeSDKInterfaceImpl, ah, 
//            av

final class ap
{

    private M a;
    private HashMap b;
    private g c;

    public ap()
    {
        a = M.a();
    }

    public static C a(aq aq1, int i)
    {
        if (aq1 != null && aq1.h)
        {
            aq1 = aq1.h();
            if (aq1 != null)
            {
                return (C)aq1.get(Integer.valueOf(i));
            }
        }
        return null;
    }

    private static boolean a(aq aq1)
    {
        if (aq1 == null) goto _L2; else goto _L1
_L1:
        aq1 = aq1.h();
        if (aq1 == null) goto _L2; else goto _L3
_L3:
        aq1 = aq1.entrySet().iterator();
_L6:
        if (aq1.hasNext()) goto _L4; else goto _L2
_L2:
        return false;
_L4:
        C c1 = (C)((java.util.Map.Entry)aq1.next()).getValue();
        if (c1 != null)
        {
            String s = c1.b();
            if (s != null && s.equalsIgnoreCase("flip action") && c1.b == D.j)
            {
                return true;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static boolean b(aq aq1)
    {
        if (aq1 == null) goto _L2; else goto _L1
_L1:
        aq1 = aq1.h();
        if (aq1 == null) goto _L2; else goto _L3
_L3:
        aq1 = aq1.entrySet().iterator();
_L6:
        if (aq1.hasNext()) goto _L4; else goto _L2
_L2:
        return false;
_L4:
        Object obj = (C)((java.util.Map.Entry)aq1.next()).getValue();
        if (obj != null)
        {
            obj = ((C) (obj)).e();
            if (obj != null && (((String) (obj)).equalsIgnoreCase("top_left") || ((String) (obj)).equalsIgnoreCase("top_right") || ((String) (obj)).equalsIgnoreCase("bottom_left") || ((String) (obj)).equalsIgnoreCase("bottom_right")))
            {
                return true;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    final aq a()
    {
        Object obj = c.f;
        if (obj != null)
        {
            obj = ((h) (obj)).b();
            if (obj != null)
            {
                obj = (String)((ArrayList) (obj)).get(0);
            } else
            {
                obj = null;
            }
            if (b != null)
            {
                return (aq)b.get(obj);
            }
        }
        return null;
    }

    public final aq a(String s)
    {
        if (b != null)
        {
            s = (aq)b.get(s);
            if (s != null)
            {
                return s;
            }
        }
        return null;
    }

    public final void a(g g1)
    {
        c = g1;
        g1 = g1.f;
        if (g1 != null)
        {
            b = g1.a();
        }
        g1 = c.f;
        if (g1 == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int j;
        int l;
        arraylist = g1.b();
        l = arraylist.size();
        j = 0;
_L27:
        if (j < l) goto _L3; else goto _L2
_L2:
        return;
_L3:
        String s = (String)arraylist.get(j);
        if (s == null) goto _L5; else goto _L4
_L4:
        aq aq1 = a(s);
        if (aq1 == null) goto _L5; else goto _L6
_L6:
        if (b == null) goto _L8; else goto _L7
_L7:
        aq aq2 = (aq)b.get(s);
        if (aq2 == null) goto _L10; else goto _L9
_L9:
        g1 = aq2.c;
        ax ax1;
        int i;
        boolean flag;
        int i1;
        boolean flag1;
        if (g1 != null)
        {
            g1 = g1.a();
        } else
        {
            g1 = null;
        }
        if (g1 != null) goto _L12; else goto _L11
_L11:
        a.c("No appropriate logo url received in the playlist.");
        g1 = null;
_L28:
        if (!q.a(g1)) goto _L10; else goto _L13
_L13:
        aq2.d = g1;
        a.b((new StringBuilder("Selected Media Url (Slate Id: ")).append(aq2.a()).append("): ").append(aq2.d).toString());
        i = 1;
_L30:
        if (i == 0) goto _L15; else goto _L14
_L14:
        aq1.e = ar.b;
_L34:
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_686;
        }
        g1 = (aq)b.get(s);
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_686;
        }
        g1 = g1.b();
        if ("none".equals(g1) || b.get(g1) == null)
        {
            break MISSING_BLOCK_LABEL_686;
        }
        flag1 = true;
_L39:
        aq1.k = flag1;
        if (b == null) goto _L17; else goto _L16
_L16:
        g1 = (aq)b.get(s);
        if (g1 == null) goto _L17; else goto _L18
_L18:
        g1 = g1.e();
        if (g1 == null || !g1.toLowerCase().equals("swipe")) goto _L17; else goto _L19
_L19:
        flag1 = true;
_L36:
        aq1.g = flag1;
        if (b == null) goto _L21; else goto _L20
_L20:
        g1 = (aq)b.get(s);
        if (g1 == null) goto _L21; else goto _L22
_L22:
        g1 = g1.e();
        if (g1 == null || !g1.toLowerCase().equals("tap")) goto _L21; else goto _L23
_L23:
        flag1 = true;
_L37:
        aq1.f = flag1;
        if (aq1 == null) goto _L25; else goto _L24
_L24:
        g1 = aq1.h();
        if (g1 == null || g1.size() <= 0) goto _L25; else goto _L26
_L26:
        flag1 = true;
_L38:
        aq1.h = flag1;
        if (aq1.h)
        {
            aq1.i = a(aq1);
            aq1.j = b(aq1);
        }
_L5:
        j++;
          goto _L27
_L12:
        i1 = g1.size();
        i = 0;
_L29:
        if (i >= i1)
        {
            g1 = null;
        } else
        {
label0:
            {
                ax1 = (ax)g1.get(i);
                if (ax1 == null || !ax1.a().contains("image"))
                {
                    break label0;
                }
                g1 = ax1.c();
            }
        }
          goto _L28
        i++;
          goto _L29
_L10:
        i = 0;
          goto _L30
_L8:
        i = 0;
          goto _L30
_L15:
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_662;
        }
        g1 = (aq)b.get(s);
        if (g1 == null) goto _L32; else goto _L31
_L31:
        if (((aq) (g1)).d == null)
        {
            if (!c.h)
            {
                g1.d = YuMeSDKInterfaceImpl.j.a(((aq) (g1)).c);
            } else
            {
                g1.d = YuMeSDKInterfaceImpl.j.b(((aq) (g1)).c);
            }
            if (((aq) (g1)).d != null)
            {
                a.b((new StringBuilder("Selected Media Url (Slate Id: ")).append(g1.a()).append("): ").append(((aq) (g1)).d).toString());
            }
        }
        if (((aq) (g1)).d == null) goto _L32; else goto _L33
_L33:
        flag = true;
_L35:
        if (flag)
        {
            aq1.e = ar.c;
        }
          goto _L34
_L32:
        flag = false;
          goto _L35
        flag = false;
          goto _L35
_L17:
        flag1 = false;
          goto _L36
_L21:
        flag1 = false;
          goto _L37
_L25:
        flag1 = false;
          goto _L38
        flag1 = false;
          goto _L39
    }

    public final ar b(String s)
    {
        if (b != null)
        {
            s = (aq)b.get(s);
            if (s != null)
            {
                return ((aq) (s)).e;
            }
        }
        return ar.a;
    }

    public final String c(String s)
    {
        if (b != null)
        {
            s = (aq)b.get(s);
            if (s != null && ((aq) (s)).b != null)
            {
                s = ((aq) (s)).b.b();
                if (q.a(s))
                {
                    return s;
                }
            }
        }
        return null;
    }
}
