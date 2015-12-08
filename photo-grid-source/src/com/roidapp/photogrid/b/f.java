// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.b;

import com.cm.kinfoc.s;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.b:
//            g, e

public final class f
{

    private static g a;

    public static String a()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.a();
        }
    }

    public static void a(g g1)
    {
        a = g1;
    }

    public static void a(String s1)
    {
        s1 = String.format("gallery_name=%s", new Object[] {
            s1
        });
        e.a();
        s.a().a("grid_gallery_list", s1);
    }

    public static void a(String s1, int i)
    {
        s1 = String.format("single_edit_button=%s&single_edit_button_index=%s", new Object[] {
            (new StringBuilder("Single_")).append(s1).toString(), Integer.valueOf(i)
        });
        e.a();
        s.a().a("grid_single_edit_button", s1);
    }

    public static void a(String s1, int i, int j)
    {
        s1 = String.format("card_name=%s&action_type=%s&ads_type=%s", new Object[] {
            s1, Integer.valueOf(i), Integer.valueOf(j)
        });
        e.a();
        s.a().a("grid_cards_ads", s1);
    }

    public static void a(String s1, String s2)
    {
        String s3 = s2;
        if (a != null)
        {
            s3 = (new StringBuilder()).append(a.a()).append(s2).toString();
        }
        s1 = String.format("page_name=%s&from_page=%s&times=%s&uptime=%s", new Object[] {
            s1, s3, Integer.valueOf(1), Long.toString(System.currentTimeMillis() / 1000L)
        });
        e.a();
        s.a().a("grid_page_view", s1);
    }

    public static void a(String s1, String s2, int i, int j)
    {
        if (az.q != 5)
        {
            return;
        }
        byte byte0;
        if (s1.equalsIgnoreCase("SingleFilter"))
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (s1.equalsIgnoreCase("SingleRetouch"))
        {
            byte0 = 2;
        }
        if (s1.equalsIgnoreCase("SingleSave"))
        {
            byte0 = 3;
        }
        s1 = String.format("single_edit_button=%s&single_edit_apply=%s&single_edit_save=%s&single_edit_code=%s", new Object[] {
            Integer.valueOf(byte0), s2, Integer.valueOf(i), Integer.valueOf(Math.abs(j))
        });
        e.a();
        s.a().a("grid_single_filterretouch", s1);
    }

    public static void b(String s1, int i)
    {
        s1 = String.format("grid_edit_button=%s&grid_edit_button_index=%s", new Object[] {
            (new StringBuilder("Grid_")).append(s1).toString(), Integer.valueOf(i)
        });
        e.a();
        s.a().a("grid_grid_edit_button", s1);
    }

    public static void b(String s1, String s2)
    {
        s1 = String.format("single_button_save=%s&distinct_code=%s", new Object[] {
            s1, s2
        });
        e.a();
        s.a().a("grid_single_save", s1);
    }

    public static void c(String s1, int i)
    {
        s1 = String.format("mainpage_button_name=%s&mainpage_button_index=%s", new Object[] {
            (new StringBuilder("Main_")).append(s1).toString(), Integer.valueOf(i)
        });
        e.a();
        s.a().a("grid_mainpage_button", s1);
    }

    public static void c(String s1, String s2)
    {
        s1 = String.format("single_button_share=%s&distinct_code=%s", new Object[] {
            s1, s2
        });
        e.a();
        s.a().a("grid_single_share", s1);
    }
}
