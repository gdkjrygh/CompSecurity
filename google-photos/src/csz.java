// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;

public final class csz
{

    public final Context a;
    public final cta b;
    public final cso c;
    public final css d;
    public final File e;
    public final csi f;

    public csz(Context context, cta cta1, cso cso1, css css1, File file, csi csi1)
    {
        a = (Context)b.a(context, "context", null);
        b = (cta)b.a(cta1, "settings", null);
        c = (cso)b.a(cso1, "cacheFactory", null);
        d = (css)b.a(css1, "detailCacheFactory", null);
        e = (File)b.a(file, "cacheFile", null);
        f = (csi)b.a(csi1, "localMusicDataFactory", null);
    }
}
