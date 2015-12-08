// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;

// Referenced classes of package kik.android.widget:
//            PagerIconTabs

final class ct
    implements android.view.View.OnClickListener
{

    final PagerIconTabs a;

    ct(PagerIconTabs pagericontabs)
    {
        a = pagericontabs;
        super();
    }

    public final void onClick(View view)
    {
        PagerIconTabs.a(a, ((Integer)view.getTag()).intValue());
    }
}
