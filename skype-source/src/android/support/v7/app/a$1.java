// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;

// Referenced classes of package android.support.v7.app:
//            a

final class a
    implements android.view..OnClickListener
{

    final a a;

    public final void onClick(View view)
    {
        if (a.access$000(a))
        {
            a.access$100(a);
        } else
        if (a.access$200(a) != null)
        {
            a.access$200(a).onClick(view);
            return;
        }
    }

    stener(a a1)
    {
        a = a1;
        super();
    }
}
