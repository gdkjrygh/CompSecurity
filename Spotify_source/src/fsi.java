// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Cosmos;

public class fsi
    implements dmx
{

    public fsi()
    {
    }

    public static fsg a(Context context)
    {
        return new fsg(new fso(Cosmos.getResolver(context), new fsn(context)));
    }
}
