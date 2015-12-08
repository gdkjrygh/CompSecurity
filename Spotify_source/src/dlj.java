// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import com.spotify.mobile.android.connect.DiscoveryClient;

public final class dlj
    implements gfk
{

    public final String a[] = {
        "offline_mode"
    };
    private int b;
    private DiscoveryClient c;

    private dlj(DiscoveryClient discoveryclient)
    {
        c = discoveryclient;
        super();
    }

    public dlj(DiscoveryClient discoveryclient, byte byte0)
    {
        this(discoveryclient);
    }

    public final void a(gfi gfi, Cursor cursor)
    {
        boolean flag = false;
        int i;
        if (cursor.moveToFirst())
        {
            i = gcw.b(cursor, "offline_mode");
        } else
        {
            i = 0;
        }
        if (i != b)
        {
            int j = b;
            gfi = c;
            if (i == 1)
            {
                flag = true;
            }
            DiscoveryClient.b(gfi, flag);
        }
        b = i;
    }
}
