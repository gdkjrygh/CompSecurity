// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gde
    implements gcs
{

    final Context a;
    final geu b;
    final String c;

    public gde(Context context, geu geu1, String s)
    {
        a = context;
        b = geu1;
        c = s;
    }

    public final gcx a(String s)
    {
        s = (geh)geh.a(a, b.a()).a(new gdf(this, s)).a;
        s.o();
        return new gcx(s);
    }

    public final String toString()
    {
        String s = String.valueOf("DeltaAllPhotosPageFetcher, accountId: ");
        int i = b.d();
        String s1 = c;
        return (new StringBuilder(String.valueOf(s).length() + 24 + String.valueOf(s1).length())).append(s).append(i).append(", syncToken: ").append(s1).toString();
    }
}
