// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.SnapchatApplication;
import java.io.File;
import org.chromium.net.CronetEngine;

public final class KY
    implements afw
{

    static final boolean $assertionsDisabled;
    private final KS module;

    private KY(KS ks)
    {
        if (!$assertionsDisabled && ks == null)
        {
            throw new AssertionError();
        } else
        {
            module = ks;
            return;
        }
    }

    public static afw a(KS ks)
    {
        return new KY(ks);
    }

    public final Object get()
    {
        Object obj = (new org.chromium.net.CronetEngine.Builder(SnapchatApplication.get())).a("ENABLE_QUIC", true).a("ENABLE_SPDY", true).a("ENABLE_SDCH", true).a("app.snapchat.com").a("storage.googleapis.com").a("geofilter.storage.googleapis.com");
        if (Bm.a().a("QUIC_CACHE", "IN_MEMORY", false))
        {
            ((org.chromium.net.CronetEngine.Builder) (obj)).a(1, 0x100000L);
        } else
        {
            String s = Kl.sInternalCacheDirectory.getAbsolutePath();
            if (!(new File(s)).isDirectory())
            {
                throw new IllegalArgumentException("Storage path must be set to existing directory");
            }
            ((org.chromium.net.CronetEngine.Builder) (obj)).a("STORAGE_PATH", s).a(3, 0x100000L);
        }
        obj = CronetEngine.a(((org.chromium.net.CronetEngine.Builder) (obj)));
        if (obj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return obj;
        }
    }

    static 
    {
        boolean flag;
        if (!KY.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
