// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.util.Assertion;

final class ang.Object
    implements an
{

    private ekw a;

    public final da a(Bundle bundle)
    {
        return new cu(a.k(), dtt.a(ekw.b(a)), ekw.a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst() && ((Cursor) (obj)).getString(1) == null)
        {
            Assertion.a("Playlist name is null while getting playlist", ekw.b(a));
        }
    }

    (ekw ekw1)
    {
        a = ekw1;
        super();
    }
}
