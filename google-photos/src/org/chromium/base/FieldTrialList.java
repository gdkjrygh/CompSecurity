// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


public class FieldTrialList
{

    private FieldTrialList()
    {
    }

    private static native String nativeFindFullName(String s);

    private static native boolean nativeTrialExists(String s);
}
