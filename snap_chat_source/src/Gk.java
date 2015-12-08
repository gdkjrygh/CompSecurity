// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import com.snapchat.android.SnapchatApplication;
import java.io.IOException;

public final class Gk
{
    final class a extends Zk
    {

        private Gk a;

        public final boolean a(Zi zi)
        {
            return true;
        }

        public final Zk.a b(Zi zi)
        {
            zi = zi.d.toString();
            Zk.a a1;
            try
            {
                a1 = new Zk.a(Gk.a(a).a(zi), Zf.c.b);
            }
            catch (IOException ioexception)
            {
                Gk.b(a).a(new lC(zi, ioexception.toString()));
                throw ioexception;
            }
            return a1;
        }

        private a()
        {
            a = Gk.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final Gk b = new Gk();
    public final YY a;
    private final Gh c;
    private final LB d;
    private Zf e;

    private Gk()
    {
        this(((Context) (SnapchatApplication.get())), Gh.a(), new LB());
    }

    private Gk(Context context, Gh gh, LB lb)
    {
        c = gh;
        d = lb;
        a = new YY(Math.min(((((ActivityManager)context.getSystemService("activity")).getMemoryClass() * 25) / 100) * 0x100000, 0x9e3400));
    }

    static Gh a(Gk gk)
    {
        return gk.c;
    }

    public static Gk a()
    {
        return b;
    }

    static LB b(Gk gk)
    {
        return gk.d;
    }

    public final void a(Go go)
    {
        int i = ((a.b() / 10368) * 33) / 100;
        int k = Math.min(go.a(), i);
        Zf zf = b();
        for (int j = 0; j < k; j++)
        {
            zf.a(go.a(j)).a(Gi.a).b();
        }

    }

    public final Zf b()
    {
        this;
        JVM INSTR monitorenter ;
        Zf zf;
        if (e == null)
        {
            e = (new Zf.a(SnapchatApplication.get())).a(a).a(new a((byte)0)).a();
        }
        zf = e;
        this;
        JVM INSTR monitorexit ;
        return zf;
        Exception exception;
        exception;
        throw exception;
    }

}
