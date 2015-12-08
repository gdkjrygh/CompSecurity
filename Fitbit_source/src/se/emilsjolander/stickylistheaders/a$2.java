// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.view.View;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            a, h

class a
    implements android.view..OnClickListener
{

    final int a;
    final a b;

    public void onClick(View view)
    {
        if (se.emilsjolander.stickylistheaders.a.d(b) != null)
        {
            long l = b.a.a(a);
            se.emilsjolander.stickylistheaders.a.d(b).a(view, a, l);
        }
    }

    (a a1, int i)
    {
        b = a1;
        a = i;
        super();
    }
}
