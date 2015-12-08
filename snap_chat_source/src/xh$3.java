// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.squareup.otto.Bus;

final class lang.Object
    implements android.view.OnLongClickListener
{

    private xh a;

    public final boolean onLongClick(View view)
    {
        if (xh.a(a) != null)
        {
            xh.b(a).a(new My(a.a, xh.a(a)));
        }
        return true;
    }

    >(xh xh1)
    {
        a = xh1;
        super();
    }
}
