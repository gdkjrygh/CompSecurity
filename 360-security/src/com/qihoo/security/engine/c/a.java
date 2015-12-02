// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.c;

import android.os.Environment;
import java.io.File;

public class a
{

    public static File a()
    {
        File file = new File(Environment.getExternalStorageDirectory(), "360/CrashLog");
        file.mkdirs();
        return file;
    }
}
