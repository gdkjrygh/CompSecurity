// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableList;
import java.util.Collection;

public final class gdw
{

    public static ImmutableList a(Collection collection)
    {
        if (collection == null)
        {
            return ImmutableList.d();
        } else
        {
            return ImmutableList.a(collection);
        }
    }
}
