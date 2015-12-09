// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal.loaders;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

// Referenced classes of package dagger.internal.loaders:
//            ReflectiveAtInjectBinding

public static class <init>
{

    private final Constructor constructor;
    private final Field fields[];
    private final String keys[];
    private final String membersKey;
    private final int parameterCount;
    private final String provideKey;
    private final boolean singleton;
    private final Class supertype;
    private final Class type;

    public final ReflectiveAtInjectBinding create(boolean flag)
    {
        if (flag && constructor == null && fields.length == 0)
        {
            throw new dagger.internal.nit>(type.getName(), "has no injectable members. Do you want to add an injectable constructor?");
        } else
        {
            return new ReflectiveAtInjectBinding(provideKey, membersKey, singleton, type, fields, constructor, parameterCount, supertype, keys, null);
        }
    }

    private (String s, String s1, boolean flag, Class class1, Field afield[], Constructor constructor1, int i, 
            Class class2, String as[])
    {
        provideKey = s;
        membersKey = s1;
        singleton = flag;
        type = class1;
        fields = afield;
        constructor = constructor1;
        parameterCount = i;
        supertype = class2;
        keys = as;
    }

    keys(String s, String s1, boolean flag, Class class1, Field afield[], Constructor constructor1, int i, 
            Class class2, String as[], keys keys1)
    {
        this(s, s1, flag, class1, afield, constructor1, i, class2, as);
    }
}
