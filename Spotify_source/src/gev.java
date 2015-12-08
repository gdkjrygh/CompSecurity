// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class gev
    implements dmx
{

    public gev()
    {
    }

    public static Reader a()
    {
        return new BufferedReader(new InputStreamReader(new FileInputStream((new StringBuilder("/proc/")).append(Process.myPid()).append("/cmdline").toString()), "iso-8859-1"));
    }
}
