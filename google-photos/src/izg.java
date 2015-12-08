// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.List;

final class izg
    implements ert
{

    private List a;
    private int b;
    private byte c[][];
    private izf d;

    izg(izf izf1, List list, int i, byte abyte0[][])
    {
        d = izf1;
        a = list;
        b = i;
        c = abyte0;
        super();
    }

    public final Cursor a(int i, int j)
    {
        List list = a.subList(j, j + i);
        return (new euj()).a(new String[] {
            "protobuf"
        }).a(list).a(izf.a(d), b);
    }

    public final boolean a(Cursor cursor, int i)
    {
        while (cursor.moveToNext()) 
        {
            c[i] = cursor.getBlob(cursor.getColumnIndex("protobuf"));
            i++;
        }
        return true;
    }
}
