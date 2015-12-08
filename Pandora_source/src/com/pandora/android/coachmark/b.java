// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import p.df.a;

public class b
{

    private ViewParent a;
    private Class b;
    private Class c;

    public b(ViewParent viewparent)
    {
        ViewParent viewparent1 = viewparent;
        if (!viewparent.getClass().getName().contains("ActionBarView"))
        {
            String s = viewparent.getClass().getName();
            viewparent = viewparent.getParent();
            String s1 = viewparent.getClass().getName();
            viewparent1 = viewparent;
            if (!viewparent.getClass().getName().contains("ActionBarView"))
            {
                throw new IllegalStateException((new StringBuilder()).append("Cannot find ActionBarView for Activity, instead found ").append(s).append(" and ").append(s1).toString());
            }
        }
        a = viewparent1;
        b = viewparent1.getClass();
        c = viewparent1.getClass().getSuperclass();
    }

    public View a()
    {
        Object obj;
        obj = b.getDeclaredField("mSpinner");
        ((Field) (obj)).setAccessible(true);
        obj = (View)((Field) (obj)).get(a);
        return ((View) (obj));
        Object obj1;
        obj1;
        p.df.a.b("ActionBarViewWrapper", "Failed to find actionbar spinner", ((Throwable) (obj1)));
_L2:
        return null;
        obj1;
        p.df.a.b("ActionBarViewWrapper", "Failed to access actionbar spinner", ((Throwable) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public View a(int i)
    {
        Object obj;
        Object obj2;
        obj = c.getDeclaredField("mActionMenuPresenter");
        ((Field) (obj)).setAccessible(true);
        obj = ((Field) (obj)).get(a);
        obj2 = obj.getClass().getSuperclass();
        if (obj2 == null)
        {
            return null;
        }
        obj2 = ((Class) (obj2)).getDeclaredField("mMenuView");
        ((Field) (obj2)).setAccessible(true);
        obj2 = ((Field) (obj2)).get(obj);
        if (!obj2.getClass().toString().contains("com.actionbarsherlock")) goto _L2; else goto _L1
_L1:
        obj = obj2.getClass().getSuperclass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField("mChildren");
_L7:
        int k;
        ((Field) (obj)).setAccessible(true);
        obj = ((Object) ((Object[])(Object[])((Field) (obj)).get(obj2)));
        k = obj.length;
        int j = 0;
_L8:
        if (j >= k) goto _L4; else goto _L3
_L3:
        obj2 = obj[j];
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        obj2 = (View)obj2;
        Object obj1;
        if (((View) (obj2)).getId() == i)
        {
            return ((View) (obj2));
        }
          goto _L6
_L2:
label0:
        {
            if (!obj2.getClass().toString().contains("android.support.v7"))
            {
                break label0;
            }
            obj = obj2.getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField("mChildren");
        }
          goto _L7
        obj = obj2.getClass().getSuperclass().getSuperclass().getDeclaredField("mChildren");
          goto _L7
        obj1;
        ((IllegalAccessException) (obj1)).printStackTrace();
_L4:
        return null;
        obj1;
        ((NoSuchFieldException) (obj1)).printStackTrace();
        if (true) goto _L4; else goto _L6
_L6:
        j++;
          goto _L8
    }

    public View b()
    {
        Object obj;
        obj = b.getDeclaredField("mTitleView");
        ((Field) (obj)).setAccessible(true);
        obj = (View)((Field) (obj)).get(a);
        return ((View) (obj));
        Object obj1;
        obj1;
        p.df.a.b("ActionBarViewWrapper", "Failed to find actionbar title", ((Throwable) (obj1)));
_L2:
        return null;
        obj1;
        p.df.a.b("ActionBarViewWrapper", "Failed to access actionbar title", ((Throwable) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public View c()
    {
        Object obj;
        obj = c.getDeclaredField("mActionMenuPresenter");
        ((Field) (obj)).setAccessible(true);
        obj = ((Field) (obj)).get(a);
        Field field = obj.getClass().getDeclaredField("mOverflowButton");
        field.setAccessible(true);
        obj = (View)field.get(obj);
        return ((View) (obj));
        Object obj1;
        obj1;
        ((IllegalAccessException) (obj1)).printStackTrace();
_L2:
        return null;
        obj1;
        ((NoSuchFieldException) (obj1)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }
}
