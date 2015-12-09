// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.media.g;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            p

class a
    implements android.view..OnClickListener
{

    final p a;

    public void onClick(View view)
    {
        if (p.d(a).f())
        {
            p.e(a).b().n();
        }
        a.dismiss();
    }

    f(p p1)
    {
        a = p1;
        super();
    }
}
