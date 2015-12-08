// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.translate;


public interface BrailleTranslator
{

    public abstract String backTranslate(byte abyte0[]);

    public abstract byte[] translate(String s);
}
