// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;


final class j
{

    static final int a[];

    static 
    {
        a = new int[GestureRecognizer.Gesture.values().length];
        try
        {
            a[GestureRecognizer.Gesture.NOT_A_GESTURE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[GestureRecognizer.Gesture.GEST_IGNORE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[GestureRecognizer.Gesture.GEST_BACKSPACE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[GestureRecognizer.Gesture.GEST_SPACE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[GestureRecognizer.Gesture.GEST_NEW_WORD.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[GestureRecognizer.Gesture.GEST_FLING_FROM_LEFT.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
