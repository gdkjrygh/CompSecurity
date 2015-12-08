// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.photos.mediadetails.DetailsActivity;

final class gwy
    implements gpy
{

    private gwu a;

    gwy(gwu gwu1)
    {
        a = gwu1;
        super();
    }

    public final void a()
    {
        fyq fyq1 = new fyq();
        fyq1.a = gwu.g(a);
        fyq1.b = gwu.f(a).d();
        fyq1.c = gwu.e(a).b;
        p.a(fyq1.a);
        p.a(fyq1.c);
        Intent intent = new Intent(fyq1.a, com/google/android/apps/photos/mediadetails/DetailsActivity);
        intent.putExtra("account_id", fyq1.b);
        intent.putExtra("com.google.android.apps.photos.core.media", fyq1.c);
        a.a(intent);
    }
}
