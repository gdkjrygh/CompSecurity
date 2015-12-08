// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bmb
{

    private final List a;
    public final bww c;
    public boolean d;

    public bmb(bmb bmb1)
    {
        a = new ArrayList();
        bmb1.a.add(this);
        c = bmb1.c;
    }

    public bmb(bww bww)
    {
        a = new ArrayList();
        c = bww;
    }

    public void C_()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((bmb)iterator.next()).C_()) { }
        c();
        d = false;
    }

    public final void b(Bundle bundle)
    {
        if (this instanceof bru)
        {
            ((bru)this).a(bundle);
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((bmb)iterator.next()).b(bundle)) { }
    }

    public final void c()
    {
        if (!d)
        {
            String s = String.valueOf(this);
            throw c.a((new StringBuilder(String.valueOf(s).length() + 23)).append("controller not inited: ").append(s).toString());
        } else
        {
            return;
        }
    }

    public void e()
    {
        if (d)
        {
            String s = String.valueOf(this);
            throw c.a((new StringBuilder(String.valueOf(s).length() + 27)).append("controller already inited: ").append(s).toString());
        }
        d = true;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((bmb)iterator.next()).e()) { }
    }
}
