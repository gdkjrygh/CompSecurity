// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class ang.Object
    implements an
{

    private Uri a;
    private String b[];
    private fkz c;
    private fkx d;

    public final da a(Bundle bundle)
    {
        Object obj = d.a;
        bundle = a;
        String as[] = b;
        obj = (Context)((fks) (obj)).a.get();
        if (obj == null)
        {
            return null;
        } else
        {
            return new cu(((Context) (obj)), bundle, as, null, null);
        }
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst() && c != null)
        {
            c.a(((Cursor) (obj)));
        }
    }

    (fkx fkx1, Uri uri, String as[], fkz fkz1)
    {
        d = fkx1;
        a = uri;
        b = as;
        c = fkz1;
        super();
    }
}
