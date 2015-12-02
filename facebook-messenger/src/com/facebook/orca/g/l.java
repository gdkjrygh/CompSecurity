// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.orca.threads.FolderName;

public class l
{

    public l()
    {
    }

    public static String a(FolderName foldername)
    {
        return (new StringBuilder()).append("first_").append(foldername.b()).toString();
    }
}
