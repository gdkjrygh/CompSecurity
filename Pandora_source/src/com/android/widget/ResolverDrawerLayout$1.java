// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.widget;


// Referenced classes of package com.android.widget:
//            ResolverDrawerLayout

class a
    implements android.view.hModeChangeListener
{

    final ResolverDrawerLayout a;

    public void onTouchModeChanged(boolean flag)
    {
        if (!flag && a.hasFocus() && ResolverDrawerLayout.a(a, a.getFocusedChild()))
        {
            ResolverDrawerLayout.a(a, 0, 0.0F);
        }
    }

    hangeListener(ResolverDrawerLayout resolverdrawerlayout)
    {
        a = resolverdrawerlayout;
        super();
    }
}
