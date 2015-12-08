// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.Annotation;

public interface JsonDeserialize
    extends Annotation
{

    public abstract Class as();

    public abstract Class builder();

    public abstract Class contentAs();

    public abstract Class contentConverter();

    public abstract Class contentUsing();

    public abstract Class converter();

    public abstract Class keyAs();

    public abstract Class keyUsing();

    public abstract Class using();
}
