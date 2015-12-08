// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class iyh extends mtf
{

    private final mmv a;

    public iyh(mmv mmv1)
    {
        super("LocalTrashCleanupTask");
        a = mmv1;
    }

    protected final mue a(Context context)
    {
        Iterator iterator = a.a().iterator();
_L2:
        Object obj;
        HashSet hashset;
        int i;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        i = ((Integer)iterator.next()).intValue();
        if (!a.d(i))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new mvu(mvj.b(context, i));
        obj.a = "local_media";
        obj.b = (new String[] {
            "dedup_key"
        });
        obj.c = etk.a;
        obj = ((mvu) (obj)).a();
        hashset = new HashSet();
        int j = ((Cursor) (obj)).getColumnIndexOrThrow("dedup_key");
        for (; ((Cursor) (obj)).moveToNext(); hashset.add(((Cursor) (obj)).getString(j))) { }
        break MISSING_BLOCK_LABEL_153;
        context;
        ((Cursor) (obj)).close();
        throw context;
        ((Cursor) (obj)).close();
        if (!hashset.isEmpty())
        {
            (new hcn(hashset)).a(context, i);
        }
        if (true) goto _L2; else goto _L1
_L1:
        return new mue(true);
    }
}
