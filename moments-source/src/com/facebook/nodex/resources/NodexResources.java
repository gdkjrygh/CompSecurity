// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.resources;

import android.content.Context;
import android.content.res.Resources;

public class NodexResources
{

    private final Resources a;
    private final String b;

    public NodexResources(Context context)
    {
        this(context.getResources(), context.getPackageName());
    }

    private NodexResources(Resources resources, String s)
    {
        a = resources;
        b = s;
    }

    public final int a(String s)
    {
        return a.getIdentifier(s, "layout", b);
    }

    public final int b(String s)
    {
        return a.getIdentifier(s, "id", b);
    }

    public final int c(String s)
    {
        return a.getIdentifier(s, "string", b);
    }
}
