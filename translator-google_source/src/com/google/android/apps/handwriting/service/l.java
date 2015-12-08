// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.Intent;
import android.os.IInterface;
import com.google.android.libraries.handwriting.base.RecognitionResult;

public interface l
    extends IInterface
{

    public abstract void a(int i, int j, Intent intent);

    public abstract void a(int i, Intent intent);

    public abstract void a(int i, RecognitionResult recognitionresult);

    public abstract void a(String s);
}
