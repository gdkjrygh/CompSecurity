// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractSet;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            jf, jg

abstract class jl extends AbstractSet
{

    jl()
    {
    }

    abstract jf a();

    public void clear()
    {
        a().clear();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof jg)
        {
            obj = (jg)obj;
            break MISSING_BLOCK_LABEL_12;
        }
        do
        {
            return false;
        } while (((jg) (obj)).b() <= 0 || a().a(((jg) (obj)).a()) != ((jg) (obj)).b());
        return true;
    }

    public boolean remove(Object obj)
    {
        return contains(obj) && a().f().remove(((jg)obj).a());
    }
}
