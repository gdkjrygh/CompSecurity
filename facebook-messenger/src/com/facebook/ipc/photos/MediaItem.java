// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ipc.photos;

import android.os.Parcelable;
import java.util.Comparator;

// Referenced classes of package com.facebook.ipc.photos:
//            b

public abstract class MediaItem
    implements Parcelable
{

    public static final Comparator a = new b(null);
    private final long b;
    private final String c;
    private final String d;
    private final long e;
    private final String f;

    public long a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public long c()
    {
        return e;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MediaItem(").append(b).append(",").append(c).append(",").append(d).append(",").append(f).append(",").append(e).append(")").toString();
    }

}
