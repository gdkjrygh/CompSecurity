// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;


final class u
{

    static final int a[];

    static 
    {
        a = new int[com.google.android.libraries.handwriting.gui.UndoButtonInterface.UndoButtonState.values().length];
        try
        {
            a[com.google.android.libraries.handwriting.gui.UndoButtonInterface.UndoButtonState.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.libraries.handwriting.gui.UndoButtonInterface.UndoButtonState.BACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.libraries.handwriting.gui.UndoButtonInterface.UndoButtonState.UNDO.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
