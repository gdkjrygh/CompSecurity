// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import java.io.IOException;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

abstract class nmv
{

    final ConditionVariable b = new ConditionVariable();
    final nyb c;
    int d;
    long e;
    byte f[];
    IOException g;
    boolean h;
    public final HttpUrlRequestListener i = new nmw(this);

    protected nmv(nyb nyb)
    {
        c = nyb;
    }

    public abstract void a();

    protected abstract void a(HttpUrlRequest httpurlrequest);

    protected abstract HttpUrlRequest b();

    public final void c()
    {
        b.close();
        b().g();
        b.block();
    }
}
