// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.squareup.otto.Bus;

final class lang.Object
    implements android.view.OnClickListener
{

    private xh a;

    public final void onClick(View view)
    {
        xh.b(a).a(new My(a.a, xh.a(a), false, a));
    }

    >(xh xh1)
    {
        a = xh1;
        super();
    }
}
