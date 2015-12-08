// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.debug;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.android.apps.gsa.shared.util.m;
import com.google.common.base.p;
import com.google.common.collect.Lists;
import java.util.List;

// Referenced classes of package com.google.android.apps.gsa.shared.util.debug:
//            a

public final class c
{

    private final ContentResolver a;

    public final a a()
    {
        Object obj;
        try
        {
            obj = Uri.parse("content://com.google.android.velvet.util.statedumpprovider").buildUpon().appendQueryParameter("sensitive", Boolean.toString(true)).appendQueryParameter("reduced", Boolean.toString(true)).build();
            obj = com.google.android.apps.gsa.shared.util.debug.a.a((Cursor)p.a(a.query(((Uri) (obj)), null, null, null, null)));
        }
        catch (Exception exception)
        {
            L.a(5, "StateDumpRetriever", "Can't get state dump.", new Object[0]);
            java.util.ArrayList arraylist = Lists.a(m.a(null));
            arraylist.add(new Pair("state_dump_exception", "true"));
            return new a(null, null, arraylist);
        }
        return ((a) (obj));
    }
}
