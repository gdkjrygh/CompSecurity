// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcelable;
import java.util.WeakHashMap;

public final class doi
{

    public final WeakHashMap a;

    private doi()
    {
        a = new WeakHashMap();
    }

    doi(byte byte0)
    {
        this();
    }

    public final Parcelable a(drf drf)
    {
        return (Parcelable)a.get(drf);
    }

    public final void a(drf drf, Parcelable parcelable)
    {
        a.put(drf, parcelable);
    }
}
