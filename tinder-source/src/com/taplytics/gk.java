// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import android.support.v4.view.ViewPager;
import android.support.v4.view.t;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

// Referenced classes of package com.taplytics:
//            gj, ca, gs

final class gk
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ViewPager a;
    final t b;
    final ViewGroup c;

    gk(ViewPager viewpager, t t, ViewGroup viewgroup)
    {
        a = viewpager;
        b = t;
        c = viewgroup;
        super();
    }

    public final void onGlobalLayout()
    {
        int k = a.getCurrentItem();
        if (!(b instanceof o)) goto _L2; else goto _L1
_L1:
        Object obj = (o)b;
_L13:
        String s = "";
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((o) (obj)).a(k).getClass().getSimpleName();
_L8:
        s = (new StringBuilder()).append(((String) (obj))).append("_viewpager_").append(k).toString();
        if (c.findViewById(gj.a()) != null) goto _L6; else goto _L5
_L5:
        gj.a(gj.a(), c, s);
        gj.a(c.getId(), s, ((String) (obj)));
        gj.a(a, s);
_L11:
        return;
_L4:
        obj = s;
        if (ca.a().a != null) goto _L8; else goto _L7
_L7:
        int l;
        obj = b.getClass().getDeclaredMethods();
        l = obj.length;
        Method method;
        Class aclass[];
        int j;
        int i1;
        for (int i = 0; i >= l; i++)
        {
            break MISSING_BLOCK_LABEL_224;
        }

        method = obj[i];
        if (!method.getReturnType().equals(android/support/v4/app/Fragment) || method.getParameterTypes().length != 1)
        {
            break MISSING_BLOCK_LABEL_365;
        }
        aclass = method.getParameterTypes();
        i1 = aclass.length;
        for (j = 0; j < i1; j++)
        {
            try
            {
                if (aclass[j].equals(Integer.TYPE))
                {
                    ca.a().a = method;
                }
                continue;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            try
            {
                gs.b("problem getting viewpager", ((Exception) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                gs.b("frg", ((Exception) (obj)));
            }
            return;
        }

        break MISSING_BLOCK_LABEL_365;
        obj = s;
        if (ca.a().a == null) goto _L8; else goto _L9
_L9:
        obj = ca.a().a.invoke(b, new Object[] {
            Integer.valueOf(k)
        }).getClass().getSimpleName();
          goto _L8
_L6:
        if (c.findViewById(gj.a()).getTag().equals(s)) goto _L11; else goto _L10
_L10:
        c.findViewById(gj.a()).setTag(s);
        gj.a(c.getId());
        gj.a(c.getId(), s, ((String) (obj)));
        gj.a(a, s);
        return;
_L2:
        obj = null;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
