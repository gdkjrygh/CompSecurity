// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.ui.adapter.SettingsAdapter;

final class ang.Object
    implements an
{

    private fyk a;

    public final da a(Bundle bundle)
    {
        bundle = dtx.a;
        return new cu(a.k(), bundle, fyk.b, null, null);
    }

    public final void a()
    {
        fyk.b(a).a(null);
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            fyk.b(a).a(((Cursor) (obj)));
            a.Z = true;
            a.J();
        }
    }

    (fyk fyk1)
    {
        a = fyk1;
        super();
    }
}
