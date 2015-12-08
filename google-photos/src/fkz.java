// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public final class fkz
{

    public final Set a;

    fkz(Set set)
    {
        a = Collections.unmodifiableSet((Set)p.a(set));
    }

    public final boolean a(String s)
    {
        return a.contains(s);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof fkz)
        {
            obj = (fkz)obj;
            return a.equals(((fkz) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("FolderState{enabledBucketIds=");
        String s1 = String.valueOf(Arrays.toString(a.toArray(new String[a.size()])));
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }
}
