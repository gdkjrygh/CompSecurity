// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.net.Uri;

public class ao
{

    final Integer a;
    final Uri b;
    final Integer c;
    final android.view.View.OnClickListener d;

    public ao(Integer integer, Uri uri, Integer integer1, android.view.View.OnClickListener onclicklistener)
    {
        a = integer;
        b = uri;
        c = integer1;
        d = onclicklistener;
    }

    public ao(Integer integer, android.view.View.OnClickListener onclicklistener)
    {
        this(integer, null, null, onclicklistener);
    }
}
