// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.graphics.Canvas;

abstract class <init>
{

    <init> next;

    abstract boolean forward();

    abstract String getName();

    abstract boolean isFinished();

    abstract void render(Canvas canvas);

    abstract void reset();

    private ()
    {
    }

    ( )
    {
        this();
    }
}
