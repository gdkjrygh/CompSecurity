// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class iae
    implements omb, opt, opu, opv
{

    private final Activity a;
    private did b;
    private hyy c;
    private hzh d;
    private Bundle e;
    private final nug f = new iaf(this);
    private final nug g = new iag(this);

    public iae(Activity activity, opd opd1)
    {
        a = activity;
        opd1.a(this);
    }

    static void a(iae iae1, boolean flag)
    {
        Object obj;
        String s;
        int l;
        boolean flag1;
        l = 0x7fffffff;
        s = null;
        obj = null;
        flag1 = false;
        if (!iae1.b.d()) goto _L2; else goto _L1
_L1:
        int i;
        Object obj2 = iae1.b.a;
        if (((String) (obj2)).equals("com.google.android.apps.photos.actionbar.modes.contextual_multi_select_mode") || ((String) (obj2)).equals("com.google.android.apps.photos.actionbar.modes.multi_select_mode") || ((String) (obj2)).equals("com.google.android.apps.photos.actionbar.modes.single_select_mode"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L3; else goto _L2
_L2:
        obj2 = iae1.d;
        i = iae1.c.b;
        if (i == 2 || i == 1 || ((hzh) (obj2)).b() > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0 && !flag) goto _L5; else goto _L4
_L4:
        if (!iae1.b.d()) goto _L7; else goto _L6
_L6:
        iae1.b.e();
_L3:
        return;
_L7:
        int j = iae1.c.b;
        if (j == 2)
        {
            if (iae1.e != null)
            {
                obj = iae1.e.getString("com.google.android.apps.photos.selection.cabmode.extra_selection_title");
            }
            obj = iaj.a(((String) (obj)));
            iae1.b.a("com.google.android.apps.photos.actionbar.modes.single_select_mode", ((Bundle) (obj)));
            return;
        }
        if (j == 1)
        {
            Object obj1;
            int k;
            if (iae1.e != null)
            {
                obj1 = iae1.e.getString("com.google.android.apps.photos.selection.cabmode.extra_selection_title");
            } else
            {
                obj1 = null;
            }
            k = ((flag1) ? 1 : 0);
            if (iae1.e != null)
            {
                k = iae1.e.getInt("com.google.android.apps.photos.selection.cabmode.extra_min_selection_count", 0);
            }
            if (iae1.e != null)
            {
                l = iae1.e.getInt("com.google.android.apps.photos.selection.cabmode.extra_max_selection_count", 0x7fffffff);
            }
            if (iae1.e != null)
            {
                s = iae1.e.getString("com.google.android.apps.photos.selection.cabmode.extra_selection_button_text");
            }
            obj1 = iad.a(((String) (obj1)), k, l, s);
            iae1.b.a("com.google.android.apps.photos.actionbar.modes.multi_select_mode", ((Bundle) (obj1)));
            return;
        } else
        {
            iae1.b.a("com.google.android.apps.photos.actionbar.modes.contextual_multi_select_mode", new Bundle());
            return;
        }
_L5:
        if (iae1.b.d())
        {
            iae1.b.f();
            return;
        }
        if (true) goto _L3; else goto _L8
_L8:
    }

    public final void V_()
    {
        d.a.a(f);
        c.a.a(g);
    }

    public final void X_()
    {
        e = a.getIntent().getExtras();
        d.a.a(f, true);
        c.a.a(g, true);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (did)olm1.a(did);
        c = (hyy)olm1.a(hyy);
        d = (hzh)olm1.a(hzh);
    }
}
