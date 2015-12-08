// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.util.NoSuchElementException;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            Languages

static final class nguageSet extends nguageSet
{

    public boolean contains(String s)
    {
        return false;
    }

    public String getAny()
    {
        throw new NoSuchElementException("Can't fetch any language from the empty language set.");
    }

    public boolean isEmpty()
    {
        return true;
    }

    public boolean isSingleton()
    {
        return false;
    }

    public nguageSet restrictTo(nguageSet nguageset)
    {
        return this;
    }

    public String toString()
    {
        return "NO_LANGUAGES";
    }

    nguageSet()
    {
    }
}
