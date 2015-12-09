// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.music.spotlets.common.AbstractContentFragment;

public abstract class gnp extends AbstractContentFragment
{

    public DeferredResolver Z;

    public gnp()
    {
    }

    public final void B()
    {
        super.B();
        Z.destroy();
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        Z = Cosmos.getResolver(k());
    }

    public void c()
    {
        super.c();
        Z.connect();
    }

    public void d()
    {
        super.d();
        Z.disconnect();
    }
}
