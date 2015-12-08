// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class iea
    implements emr, gfz, iet
{

    private List a;
    private boolean b;
    private idu c;

    iea(idu idu1)
    {
        c = idu1;
        super();
    }

    private void b()
    {
        if (idu.k(c) != null && a != null && b)
        {
            idu.v(c).a(iwg.a(new ieu(idu.t(c), idu.u(c))).b(new iev()).b(new ifb()), a);
        }
    }

    public final void a()
    {
        b = true;
        b();
    }

    public final void a(List list)
    {
        a = list;
        b();
    }

    public final void b(elb elb1)
    {
        try
        {
            idu.a(c, new ArrayList());
            idu.k(c).addAll((Collection)elb1.a());
            elb1 = idu.q(c);
            ArrayList arraylist = idu.k(c);
            dhx dhx = idu.o(c);
            int i = idu.p(c).d();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("com.google.android.apps.photos.share.mediaList", arraylist);
            bundle.putInt("account_id", i);
            bundle.putParcelable("com.google.android.apps.photos.share.ShareMethodConstraints", dhx);
            elb1.a(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1) { }
        if (idu.r(c).a())
        {
            idu.r(c);
        }
        Toast.makeText(idu.s(c), b.yK, 1).show();
        c.O_().finish();
    }
}
