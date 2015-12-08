// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.content.Context;
import android.view.inputmethod.InputConnection;

public interface al
{

    public abstract void a(char c1);

    public abstract void c();

    public abstract Context getContext();

    public abstract InputConnection getCurrentInputConnection();
}
