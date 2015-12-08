// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class li
{

    private static final String TAG = "LensSwipeMetaData";
    public final Map mData = new HashMap();
    public lj mLastItem;

    public li()
    {
    }

    public final Collection a()
    {
        return mData.values();
    }
}
