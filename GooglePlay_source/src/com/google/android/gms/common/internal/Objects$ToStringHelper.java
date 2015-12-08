// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            Objects, Preconditions

public static final class <init>
{

    private final List mFieldStrings;
    private final Object mInstance;

    public final <init> add(String s, Object obj)
    {
        mFieldStrings.add((new StringBuilder()).append((String)Preconditions.checkNotNull(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(mInstance.getClass().getSimpleName()).append('{');
        int j = mFieldStrings.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)mFieldStrings.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }

    private (Object obj)
    {
        mInstance = Preconditions.checkNotNull(obj);
        mFieldStrings = new ArrayList();
    }

    mFieldStrings(Object obj, byte byte0)
    {
        this(obj);
    }
}
