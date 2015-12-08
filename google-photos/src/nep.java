// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class nep
    implements nes
{

    private final Context a;

    nep(Context context)
    {
        a = context;
    }

    public final Object a(List list)
    {
        list = new MergeCursor((Cursor[])list.toArray(new Cursor[list.size()]));
        HashSet hashset = new HashSet();
        for (; list.moveToNext(); hashset.add(Integer.valueOf(list.getInt(0)))) { }
        if (hashset.isEmpty())
        {
            return null;
        } else
        {
            return new nec(true, new ArrayList(hashset), a.getString(b.Gh));
        }
    }
}
