// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.snapchat.android.SnapchatApplication;

public final class FS
{
    final class a extends Zk
    {

        private FS a;

        public final boolean a(Zi zi)
        {
            return true;
        }

        public final Zk.a b(Zi zi)
        {
            zi = TextUtils.split(zi.d.toString(), "/");
            return new Zk.a(FS.a(a).b(zi[0], zi[1]), Zf.c.b);
        }

        private a()
        {
            a = FS.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static FS a = null;
    private final YY b;
    private final FO c;
    private Zf d;

    FS()
    {
        this(((Context) (SnapchatApplication.get())), FO.a());
    }

    private FS(Context context, FO fo)
    {
        c = fo;
        b = new YY(Math.min(((((ActivityManager)context.getSystemService("activity")).getMemoryClass() * 25) / 100) * 0x100000, 0x9e3400));
    }

    static FO a(FS fs)
    {
        return fs.c;
    }

    public static FS a()
    {
        if (a == null)
        {
            a = new FS();
        }
        return a;
    }

    public final Zf b()
    {
        this;
        JVM INSTR monitorenter ;
        Zf zf;
        if (d == null)
        {
            d = (new Zf.a(SnapchatApplication.get())).a(b).a(new a((byte)0)).a();
        }
        zf = d;
        this;
        JVM INSTR monitorexit ;
        return zf;
        Exception exception;
        exception;
        throw exception;
    }

}
