// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSession;

public final class evb extends LruCache
{

    public evb()
    {
        super(10);
    }

    protected final void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        obj = (String)obj;
        obj1 = (PlayerSession)obj1;
        super.entryRemoved(flag, obj, obj1, (PlayerSession)obj2);
        ((PlayerSession) (obj1)).destroy();
    }
}
