// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;


// Referenced classes of package com.apptentive.android.sdk.storage:
//            VersionHistoryStore

public static class versionName
{

    public Double seconds;
    public Integer versionCode;
    public String versionName;

    public String toString()
    {
        return (new StringBuilder()).append(String.valueOf(seconds)).append("--").append(String.valueOf(versionCode)).append("--").append(versionName).toString();
    }

    public (Double double1, Integer integer, String s)
    {
        seconds = double1;
        versionCode = integer;
        versionName = s;
    }

    public versionName(String s)
    {
        if (s != null)
        {
            s = s.replace("__", "").split("--");
            seconds = Double.valueOf(s[0]);
            versionCode = Integer.valueOf(Integer.parseInt(s[1]));
            versionName = s[2];
        }
    }
}
