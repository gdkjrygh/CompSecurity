// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.statistic;

import java.io.File;

public class a
{

    public static final String X;
    public static final String Y[] = {
        "reissue=true"
    };

    static 
    {
        X = (new StringBuilder()).append(".UTSystemConfig").append(File.separator).append("Global").toString();
    }
}
