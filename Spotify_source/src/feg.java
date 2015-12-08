// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.running.model.ContentBucket;
import java.util.Map;

final class feg
    implements hfw
{

    private final int a;

    feg(int i)
    {
        a = i;
    }

    public final Object call(Object obj)
    {
        int i = a;
        return (String)((ContentBucket)obj).tracklists.get(Integer.valueOf(i));
    }
}
