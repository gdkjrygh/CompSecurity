// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed.annotation;

import java.lang.annotation.Annotation;

public interface BlinkFeedPlugin
    extends Annotation
{

    public abstract int filterMode();

    public abstract Class filterProvider();

    public abstract int icon();

    public abstract Class identityProvider();

    public abstract String identityType();

    public abstract int label();

    public abstract String name();

    public abstract Class timelineProvider();
}
