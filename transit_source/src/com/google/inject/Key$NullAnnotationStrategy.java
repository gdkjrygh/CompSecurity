// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.inject:
//            Key

static final class  extends Enum
    implements 
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/inject/Key$NullAnnotationStrategy, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
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

    public y_3B_.clone withoutAttributes()
    {
        throw new UnsupportedOperationException("Key already has no attributes.");
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
