// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gdj
    implements gcs
{

    final Context a;
    final geu b;

    public gdj(Context context, geu geu1)
    {
        a = context;
        b = geu1;
    }

    public final gcx a(String s)
    {
        s = (geh)geh.a(a, b.a()).a(new gdk(this, s)).a;
        s.o();
        return new gcx(s);
    }

    public final String toString()
    {
        String s = String.valueOf("InitialAllPhotosFetcher, accountId: ");
        int i = b.d();
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }
}
