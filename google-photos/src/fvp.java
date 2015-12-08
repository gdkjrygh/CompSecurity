// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

final class fvp
    implements ner
{

    private final fux a;
    private final ekk b;
    private final elp c;
    private final noz d;
    private final Context e;

    fvp(Context context, fux fux1, ekk ekk)
    {
        a = fux1;
        b = ekk;
        e = context;
        d = noz.a(context, "LocalMediaTransform", new String[0]);
        c = new elp(context, fvl);
    }

    private ekp a(nek nek1, Cursor cursor)
    {
        long l1 = cursor.getInt(0);
        elm elm;
        int i;
        long l;
        if (a.b())
        {
            l = cursor.getLong(1);
        } else
        {
            l = cursor.getLong(2);
        }
        i = a.d;
        elm = c.a(i, new fvm(nek1, cursor), b);
        if (!((gba)olm.a(e, gba)).a(ContentUris.withAppendedId(nek1.b, l1).toString()))
        {
            break MISSING_BLOCK_LABEL_133;
        }
        cursor = euv.e;
_L1:
        nek1 = new fuv(i, nek1.a, l1, l, a, cursor, elm);
        return nek1;
        try
        {
            cursor = euv.a(nek1.c);
        }
        // Misplaced declaration of an exception variable
        catch (nek nek1)
        {
            return null;
        }
          goto _L1
    }

    public final volatile Object a(nek nek1, Cursor cursor, boolean flag)
    {
        return a(nek1, cursor);
    }
}
