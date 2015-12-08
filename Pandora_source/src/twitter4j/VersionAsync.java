// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.PrintStream;

public final class VersionAsync
{

    private static final String TITLE = "Twitter4J Async API";
    private static final String VERSION = "4.0.2";

    private VersionAsync()
    {
        throw new AssertionError();
    }

    public static String getVersion()
    {
        return "4.0.2";
    }

    public static void main(String args[])
    {
        System.out.println("Twitter4J Async API 4.0.2");
    }
}
