// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.extractor.ExtractorInput;

interface EbmlReaderOutput
{

    public abstract int a(int i);

    public abstract void a(int i, double d);

    public abstract void a(int i, int j, ExtractorInput extractorinput);

    public abstract void a(int i, long l);

    public abstract void a(int i, long l, long l1);

    public abstract void a(int i, String s);

    public abstract void b(int i);
}
