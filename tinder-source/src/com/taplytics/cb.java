// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.taplytics:
//            ci, gj, gs, ca

final class cb
    implements android.view.View.OnLayoutChangeListener
{

    final ca a;

    cb(ca ca)
    {
        a = ca;
        super();
    }

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        if (ci.b().v.getFragmentManager().findFragmentById(view.getId()) == null || !(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        Object obj;
        String s;
        ViewGroup viewgroup;
        Throwable throwable;
        Fragment fragment;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (i + k == 0 || l + j == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i1 + k1 == 0 || l1 + j1 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L3
_L11:
        fragment = ci.b().v.getFragmentManager().findFragmentById(view.getId());
        if (fragment == null) goto _L2; else goto _L4
_L4:
        obj = fragment.getTag();
        if (obj != null) goto _L6; else goto _L5
_L5:
        s = fragment.getClass().getSimpleName();
_L9:
        obj = fragment.getView();
        if (obj == null) goto _L2; else goto _L7
_L7:
        flag2 = obj instanceof ViewGroup;
        if (!flag2) goto _L2; else goto _L8
_L8:
        if (!(obj instanceof RecyclerView))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        viewgroup = (ViewGroup)((View) (obj)).getParent();
        obj = viewgroup;
        break MISSING_BLOCK_LABEL_134;
_L6:
        s = obj.toString();
          goto _L9
_L10:
        try
        {
            gj.a((ViewGroup)view, (ViewGroup)obj, fragment.getId(), (String)s, fragment.getClass().getSimpleName(), flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            gs.b("F Ex, reg, lc: ", view);
        }
        return;
        throwable;
        if (true) goto _L10; else goto _L3
_L3:
        if (true) goto _L11; else goto _L2
_L2:
    }
}
