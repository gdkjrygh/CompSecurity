// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import com.facebook.common.stringformat.StringFormatUtil;

public class extra extends Exception
{

    public final int extra;
    public final int what;

    public (int i, int j)
    {
        super(StringFormatUtil.a("MediaPlayer exception: %d (extra info: %d)", Integer.valueOf(i), Integer.valueOf(j)));
        what = i;
        extra = j;
    }
}
