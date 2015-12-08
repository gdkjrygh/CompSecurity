// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class ibu extends omp
    implements nzu
{

    private Intent a;

    public ibu()
    {
        new nzt(this, af);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = (Intent)super.q.getParcelable("photos_stats_intent");
    }

    public final void r()
    {
        (new oac(ad)).a("Library statistics", a);
    }
}
