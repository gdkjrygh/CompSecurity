// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class kcd
{

    final kce a = new kce(this);
    final Set b = new HashSet();
    int c;
    boolean d;
    IBinder e;
    final kcc f;
    ComponentName g;
    final kcb h;

    public kcd(kcb kcb1, kcc kcc1)
    {
        h = kcb1;
        super();
        f = kcc1;
        c = 2;
    }

    public final void a(ServiceConnection serviceconnection, String s)
    {
        kcb.c(h).a(kcb.b(h), serviceconnection, s, f.a(), 3);
        b.add(serviceconnection);
    }

    public final void a(String s)
    {
        d = kcb.c(h).a(kcb.b(h), s, f.a(), a, 129);
        if (d)
        {
            c = 3;
            return;
        }
        try
        {
            kcb.c(h).a(kcb.b(h), a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public final boolean a()
    {
        return b.isEmpty();
    }

    public final boolean a(ServiceConnection serviceconnection)
    {
        return b.contains(serviceconnection);
    }
}
