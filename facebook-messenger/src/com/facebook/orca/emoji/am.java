// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.net.Uri;
import java.util.List;

public class am
{

    final String a;
    final Integer b;
    final Uri c;
    final List d;

    public am(String s, Integer integer, Uri uri, List list)
    {
        a = s;
        b = integer;
        c = uri;
        d = list;
    }

    public am(String s, Integer integer, List list)
    {
        this(s, integer, null, list);
    }
}
