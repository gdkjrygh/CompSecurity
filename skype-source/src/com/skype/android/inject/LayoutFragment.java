// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import java.lang.annotation.Annotation;

public interface LayoutFragment
    extends Annotation
{

    public static final String EXTRA_FRAGMENT_CLASS = "fragmentClass";

    public abstract String tag();

    public abstract Class value();
}
