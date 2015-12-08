// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import java.util.regex.Pattern;

public class VersionUtil
{

    private static final Pattern V_SEP = Pattern.compile("[-_./;:]");

    public static final void throwInternal()
    {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

}
