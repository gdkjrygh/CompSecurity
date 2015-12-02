// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.os.Environment;
import java.io.File;

public final class q
{

    public static final String a = Environment.getExternalStorageDirectory().toString();
    public static final String b = (new StringBuilder()).append(a).append("/.mobvista/").toString();
    public static final String c = (new StringBuilder()).append(b).append("download/").toString();

}
