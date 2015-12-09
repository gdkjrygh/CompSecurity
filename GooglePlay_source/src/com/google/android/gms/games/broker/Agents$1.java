// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.database.Cursor;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.broker:
//            Agents

static final class oColumnMapper
    implements oColumnMapper
{

    public final void put(Map map, Cursor cursor)
    {
        map.put(cursor.getString(0), Long.valueOf(cursor.getLong(1)));
    }

    oColumnMapper()
    {
    }
}
