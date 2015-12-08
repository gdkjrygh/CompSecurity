// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.annotation:
//            JsonAppend

public static interface 
    extends Annotation
{

    public abstract com.fasterxml.jackson.annotation.ude include();

    public abstract String name();

    public abstract String namespace();

    public abstract boolean required();

    public abstract Class type();

    public abstract Class value();
}
