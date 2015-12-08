// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import com.google.android.libraries.handwriting.base.RecognitionResult;

public interface a
    extends com.google.android.libraries.a.a
{

    public abstract boolean a();

    public abstract RecognitionResult getCurrentResult();

    public abstract void setResult(RecognitionResult recognitionresult, boolean flag);
}
