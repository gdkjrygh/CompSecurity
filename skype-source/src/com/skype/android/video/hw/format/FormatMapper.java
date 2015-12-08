// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.format;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

// Referenced classes of package com.skype.android.video.hw.format:
//            SliqOmxMapping

class FormatMapper
{

    private final Map fromName = new HashMap();
    private final Map fromOmx = new HashMap();
    private final Map fromSliq = new HashMap();

    public FormatMapper(Enum aenum[])
    {
        int j = aenum.length;
        for (int i = 0; i < j; i++)
        {
            Enum enum = aenum[i];
            fromSliq.put(((SliqOmxMapping)enum).getSliqValue(), enum);
            fromOmx.put(((SliqOmxMapping)enum).getOmxValue(), enum);
            fromName.put(((SliqOmxMapping)enum).getName(), enum);
        }

    }

    public Enum fromName(String s)
    {
        Enum enum = (Enum)fromName.get(s);
        if (enum == null)
        {
            throw new NoSuchElementException(s);
        } else
        {
            return enum;
        }
    }

    public Enum fromOmx(Object obj)
    {
        Enum enum = (Enum)fromOmx.get(obj);
        if (enum == null)
        {
            throw new NoSuchElementException(String.valueOf(obj));
        } else
        {
            return enum;
        }
    }

    public Enum fromSliq(Object obj)
    {
        Enum enum = (Enum)fromSliq.get(obj);
        if (enum == null)
        {
            throw new NoSuchElementException(String.valueOf(obj));
        } else
        {
            return enum;
        }
    }
}
