// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public abstract class dzr extends dzu
{

    private Cursor k;

    public dzr(Context context)
    {
        super(context);
    }

    public abstract Cursor a(ContentResolver contentresolver, Uri uri);

    public abstract Object a(Cursor cursor);

    public final void a(Object obj)
    {
        if (k != null && !k.isClosed())
        {
            k.close();
        }
    }

    public final void b(Object obj)
    {
        if (k())
        {
            if (k != null)
            {
                k.close();
            }
        } else
        if (j())
        {
            super.b(obj);
            return;
        }
    }

    public final Object d()
    {
        Cursor cursor = k;
        k = a(i().getContentResolver(), s());
        if (cursor != null && cursor != k && !cursor.isClosed())
        {
            cursor.close();
        }
        return a(k);
    }

    protected final void h()
    {
        super.h();
        if (k != null && !k.isClosed())
        {
            k.close();
        }
        k = null;
    }
}
