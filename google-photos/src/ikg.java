// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

public final class ikg
    implements emd
{

    private static final Set a = Collections.singleton("media_key");
    private final elp b;
    private final Context c;

    public ikg(Context context, elp elp1)
    {
        c = context;
        b = elp1;
    }

    private elm a(ikd ikd1, ekk ekk)
    {
        Object obj;
        obj = new mvu(mvj.b(c, ikd1.a));
        obj.a = "envelopes";
        obj.b = b.a(a, ekk);
        obj.c = "media_key = ?";
        obj.d = (new String[] {
            ikd1.b
        });
        obj = ((mvu) (obj)).a();
        if (!((Cursor) (obj)).moveToFirst())
        {
            throw new ekd(ikd1);
        }
        break MISSING_BLOCK_LABEL_93;
        ikd1;
        ((Cursor) (obj)).close();
        throw ikd1;
        ikd1 = b.a(ikd1.a, obj, ekk);
        ((Cursor) (obj)).close();
        return ikd1;
    }

    public final ekq a(ekq ekq, elm elm)
    {
        ekq = (ikd)ekq;
        return new ikd(((ikd) (ekq)).a, ((ikd) (ekq)).b, elm);
    }

    public final volatile elm a(ekq ekq, ekk ekk)
    {
        return a((ikd)ekq, ekk);
    }

    public final Class a()
    {
        return ikd;
    }

}
