// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.photos.settings.DataStatsFragment;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class iaz extends fud
{

    private final int c;
    private final List d = Arrays.asList(new String[] {
        "local_media", "remote_media", "media"
    });
    private DataStatsFragment e;

    public iaz(DataStatsFragment datastatsfragment, ar ar, opd opd, int i, int j)
    {
        e = datastatsfragment;
        super(ar, opd, j);
        c = i;
    }

    public final ei a(int i, Bundle bundle)
    {
        return new iax(b, c, d);
    }

    public final void a(ei ei, Object obj)
    {
        ei = (Map)obj;
        DataStatsFragment.a(e, ei);
    }

    public final void b()
    {
        c(null);
    }
}
