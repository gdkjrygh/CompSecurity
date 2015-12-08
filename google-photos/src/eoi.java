// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import java.util.Arrays;
import java.util.List;

final class eoi
    implements emj
{

    private eod a;

    eoi(eod eod1)
    {
        a = eod1;
        super();
    }

    public final void a(elb elb1)
    {
        try
        {
            eod.a(a, (List)elb1.a());
            eod.h(a).a(iwg.a(new enz(Arrays.asList(new esm[] {
                esm.b
            }))).b(new eny(eod.e(a), eod.f(a).d())), eod.g(a));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            Toast.makeText(eod.d(a), b.mt, 1).show();
        }
    }
}
