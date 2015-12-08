// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.spotlets.running.model.ContentBucket;

public final class fef
    implements hfw
{

    private static final fef a = new fef();

    private fef()
    {
    }

    public static hfw a()
    {
        return a;
    }

    public final Object call(Object obj)
    {
        return Uri.parse(((ContentBucket)obj).imageUrl);
    }

}
