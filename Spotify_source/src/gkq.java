// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.util.Pair;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class gkq
{

    public final Handler a;
    public final Map b = new com.spotify.mobile.android.video.drm.DrmSessionManagerRegistry._cls1(this);

    public gkq(Handler handler)
    {
        a = handler;
        dmz.a(gkt);
    }

    public final void a(HashSet hashset)
    {
        Iterator iterator = b.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (!hashset.contains(entry.getKey()))
            {
                ((gkr)((Pair)entry.getValue()).first).a();
                iterator.remove();
            }
        } while (true);
    }
}
