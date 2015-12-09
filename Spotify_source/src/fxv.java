// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;

public final class fxv extends fxt
{

    public fxv(Context context, String s, fxu fxu)
    {
        super(context, s, fxu);
    }

    protected final Cursor a(Context context, String s)
    {
        return context.getContentResolver().query(dtt.a(s), dny.a, "uri=?", new String[] {
            s
        }, null);
    }

    protected final Object a(Cursor cursor)
    {
        dny dny1 = new dny();
        dny1.a(cursor, "");
        return fxr.a(dny1.a(), dny1.b, dny1);
    }
}
