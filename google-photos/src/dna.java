// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class dna
    implements dkl
{

    private static final Set a = Collections.singleton("protobuf");
    private final noz b;

    dna(Context context)
    {
        b = noz.a(context, "PendingMediaFeatureFactory", new String[0]);
    }

    private ekf a(Cursor cursor)
    {
        cursor = cursor.getBlob(cursor.getColumnIndexOrThrow("protobuf"));
        if (cursor == null)
        {
            return new gsn(0);
        }
        cursor = (qgg)qgg.a(new qgg(), cursor);
        if (((qgg) (cursor)).e == null) goto _L2; else goto _L1
_L1:
        int i = ((qgg) (cursor)).e.c;
_L4:
        return new gsn(i);
        cursor;
_L2:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a((Cursor)obj);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return gsn;
    }

}
