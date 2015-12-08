// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Intent;
import java.util.UUID;

public class PandoraIntent extends Intent
{

    public static final String a;

    public PandoraIntent(String s)
    {
        super(a(s));
    }

    public static String a(String s)
    {
        return (new StringBuilder(s)).append("_").append(a).toString();
    }

    static 
    {
        String s = UUID.randomUUID().toString();
        a = s.substring(s.length() - 8, s.length());
    }
}
