// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;


public class setTitleColorResource extends setTitleColorResource
{

    public (String s, String s1, String s2)
    {
        super(s2);
        setMessage(s);
        setSound(2);
        addPositiveButton(s1);
    }

    public addPositiveButton(String s, String s1, String s2, String s3)
    {
        this(s1, s2, s3);
        setTitle(s);
        setTitleColorResource(0x7f0c00b7);
    }
}
