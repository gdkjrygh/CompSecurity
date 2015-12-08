// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui;

import android.support.v7.app.ActionBar;
import android.view.View;
import fnx;
import fnz;
import fog;
import fok;
import gay;
import ggi;
import java.util.ArrayList;

// Referenced classes of package com.spotify.mobile.android.ui:
//            ActionBarManager

final class a
    implements gay
{

    private ActionBarManager a;

    public final void a(boolean flag)
    {
        ActionBarManager actionbarmanager = a;
        ActionBar actionbar = actionbarmanager.b;
        Object obj;
        if (flag)
        {
            obj = actionbarmanager.e;
        } else
        {
            obj = actionbarmanager.d;
        }
        actionbar.a(((android.graphics.drawable.Drawable) (obj)));
        if (flag)
        {
            obj = ate.a;
        } else
        {
            obj = ate.b;
        }
        actionbarmanager.k = ((ate) (obj));
        actionbarmanager.j.a(flag);
    }

    public final boolean a(View view)
    {
        Object obj;
        int i;
        obj = a.i;
        i = ((fog) (obj)).c.size() - 1;
_L9:
        if (i < 0) goto _L2; else goto _L1
_L1:
        fok fok1 = (fok)((fog) (obj)).c.get(i);
        if (fok1.a() == 0) goto _L2; else goto _L3
_L3:
        if (fok1.b() != view) goto _L5; else goto _L4
_L4:
        view = fok1.c();
_L7:
        obj = a.a;
        if (obj == null || view == null)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L5:
        i--;
        continue; /* Loop/switch isn't completed */
_L2:
        view = null;
        if (true) goto _L7; else goto _L6
_L6:
        view = (fnx)view.getAnnotation(fnx);
        if (view != null)
        {
            boolean flag;
            if (ggi.b(((android.content.Context) (obj))) && view.b() || ggi.a(((android.content.Context) (obj))) && view.a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    ate(ActionBarManager actionbarmanager)
    {
        a = actionbarmanager;
        super();
    }
}
