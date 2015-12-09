// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Intent;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.repo.at;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, ez, ft, 
//            aq

public class fe extends e
{

    public static final String a = "com.fitbit.data.bl.SyncTimeZonesOperation.BROADCAST_ACTION";
    private static final String b = "SyncTimeZonesOperation";
    private static final long d = 0x1b7740L;

    public fe(bs bs1, boolean flag)
    {
        super(bs1, flag);
        bs1.c().a(Long.valueOf(0x1b7740L), c());
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        e().a(true);
        Object obj = ft.a().b();
        a1 = new TreeSet(new _cls1());
        a1.addAll(((Collection) (obj)));
        obj = aq.a().L();
        ((at) (obj)).clear(false);
        ((at) (obj)).addAll(new ArrayList(a1));
        e().a(false);
        z.a(new Intent("com.fitbit.data.bl.SyncTimeZonesOperation.BROADCAST_ACTION"));
        return;
        a1;
        e().a(false);
        throw a1;
    }

    public String c()
    {
        return "SyncTimeZonesOperation";
    }

    /* member class not found */
    class _cls1 {}

}
