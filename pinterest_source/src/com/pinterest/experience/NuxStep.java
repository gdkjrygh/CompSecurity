// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experience;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.AndroidView;

public class NuxStep
{

    public int a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public int j;
    public String k;
    public int l;
    public String m;
    public String n;
    public String o;
    public String p;
    public boolean q;
    public PinterestJsonObject r;
    public String s;
    public PinterestJsonArray t;
    public String u;

    public NuxStep(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject != null)
        {
            a = pinterestjsonobject.a("id", 0);
            b = pinterestjsonobject.a("title_text", "");
            c = pinterestjsonobject.a("detailed_text", "");
            d = pinterestjsonobject.a("step", 0);
            j = pinterestjsonobject.a("total_steps", 0);
            e = pinterestjsonobject.a("skip_confirm_btn_text", "");
            f = pinterestjsonobject.a("skip_cancel_btn_text", "");
            g = pinterestjsonobject.a("skip_text", "");
            h = pinterestjsonobject.a("skip_heading", "");
            i = pinterestjsonobject.a("no_skip_button").booleanValue();
            m = pinterestjsonobject.a("continue_button_text", "");
            k = pinterestjsonobject.a("follow_button_text", "");
            l = pinterestjsonobject.a("num_interests", 0);
            n = pinterestjsonobject.a("loading_text", "");
            o = pinterestjsonobject.a("no_friends_text", "");
            p = pinterestjsonobject.a("grid_footer_text", "");
            q = pinterestjsonobject.a("follow_all").booleanValue();
            r = pinterestjsonobject.c("images");
            s = pinterestjsonobject.a("board_name", "");
            t = pinterestjsonobject.e("choose_more_interests_text");
            u = pinterestjsonobject.a("pick_more_text", "");
        }
    }

    public final boolean a()
    {
        return a == AndroidView.NUX_INTRO.getValue();
    }

    public final boolean b()
    {
        return a == AndroidView.NUX_FRIEND_SELECTOR.getValue();
    }

    public final boolean c()
    {
        return a == AndroidView.NUX_INTEREST_SELECTOR.getValue() || a == AndroidView.NUX_GIFTWRAP_INTEREST_PICKER.getValue();
    }
}
