// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.inject:
//            c

final class e extends Enum
    implements c
{

    private static final e $VALUES[];
    public static final e INSTANCE;

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/google/inject/e, s);
    }

    public static e[] values()
    {
        return (e[])$VALUES.clone();
    }

    public Annotation getAnnotation()
    {
        return null;
    }

    public Class getAnnotationType()
    {
        return null;
    }

    public boolean hasAttributes()
    {
        return false;
    }

    public String toString()
    {
        return "[none]";
    }

    public c withoutAttributes()
    {
        throw new UnsupportedOperationException("Key already has no attributes.");
    }

    static 
    {
        INSTANCE = new e("INSTANCE", 0);
        $VALUES = (new e[] {
            INSTANCE
        });
    }
}
