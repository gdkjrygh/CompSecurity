// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class nzf extends nzv
    implements olp
{

    public final olq a = new olq();
    public final olm b;
    private opi h;

    public nzf()
    {
        b = a.a;
    }

    public final Context G_()
    {
        return a;
    }

    public final void a(Activity activity)
    {
        olm olm1 = olm.a(activity, super.E);
        a.a(activity);
        a.a(olm1);
        c.a(activity);
        super.a(activity);
    }

    public final void a(Bundle bundle)
    {
        c(bundle);
        for (Iterator iterator = b.c(omw).iterator(); iterator.hasNext(); ((omw)iterator.next()).a(this, c, b)) { }
        b.a();
        h = c.a(new nzg(this, bundle));
        super.a(bundle);
    }

    public final olm ai_()
    {
        return b;
    }

    public final LayoutInflater b(Bundle bundle)
    {
        super.b(bundle);
        return LayoutInflater.from(a);
    }

    public void c(Bundle bundle)
    {
        b.a(new omv(this, c));
    }

    public final void n()
    {
        c.b(h);
        super.n();
    }
}
