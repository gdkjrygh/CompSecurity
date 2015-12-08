// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//            TabLayout

final class a
    implements android.view.Listener
{

    final TabLayout a;

    public final void onClick(View view)
    {
        ((a)view).b().e();
    }

    (TabLayout tablayout)
    {
        a = tablayout;
        super();
    }
}
