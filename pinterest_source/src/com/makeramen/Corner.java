// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.makeramen;

import java.lang.annotation.Annotation;

public interface Corner
    extends Annotation
{

    public static final int BOTTOM_LEFT = 3;
    public static final int BOTTOM_RIGHT = 2;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
}
