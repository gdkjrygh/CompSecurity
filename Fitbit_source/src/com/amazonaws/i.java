// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws;

import java.util.concurrent.atomic.AtomicInteger;

public class i
{

    public static final String a = "com.amazonaws.sdk.disableCertChecking";
    public static final String b = "com.amazonaws.sdk.enableDefaultMetrics";
    public static final String c = "aws.accessKeyId";
    public static final String d = "aws.secretKey";
    public static final String e = "com.amazonaws.sdk.ec2MetadataServiceEndpointOverride";
    public static final String f = "com.amazonaws.regions.RegionUtils.fileOverride";
    public static final String g = "com.amazonaws.regions.RegionUtils.disableRemote";
    public static final String h = "com.amazonaws.services.s3.enableV4";
    public static final String i = "com.amazonaws.services.s3.enforceV4";
    public static final String j = "com.amazonaws.sdk.s3.defaultStreamBufferSize";
    public static final String k = "com.amazonaws.sdk.enableRuntimeProfiling";
    public static final String l = "AWS_ACCESS_KEY_ID";
    public static final String m = "AWS_ACCESS_KEY";
    public static final String n = "AWS_SECRET_KEY";
    public static final String o = "AWS_SECRET_ACCESS_KEY";
    public static final String p = "AWS_SESSION_TOKEN";
    private static final AtomicInteger q = new AtomicInteger(0);

    public i()
    {
    }

    public static int a()
    {
        return q.get();
    }

    public static void a(int i1)
    {
        q.set(i1);
    }

}
