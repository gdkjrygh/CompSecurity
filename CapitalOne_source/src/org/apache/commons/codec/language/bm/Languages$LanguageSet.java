// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.util.Set;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            Languages

public static abstract class s
{

    public static s from(Set set)
    {
        if (set.isEmpty())
        {
            return Languages.NO_LANGUAGES;
        } else
        {
            return new s(set, null);
        }
    }

    public abstract boolean contains(String s);

    public abstract String getAny();

    public abstract boolean isEmpty();

    public abstract boolean isSingleton();

    public abstract s restrictTo(s s);

    public s()
    {
    }
}
