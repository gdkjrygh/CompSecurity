// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.test;

import com.google.a.a.s;
import com.google.a.c.l;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestUtil
{

    private static final String GRADLE_STATIC_RELATIVE_PATH = "src/test/";

    public TestUtil()
    {
    }

    public static File getFileFromPath(Object obj, String s1)
    {
        obj = obj.getClass().getClassLoader().getResource(s1);
        if (obj != null)
        {
            obj = ((URL) (obj)).getPath();
        } else
        {
            obj = (new StringBuilder("src/test/")).append(s1).toString();
        }
        return new File(((String) (obj)));
    }

    public static String getStringFromFile(Object obj, String s1)
    {
        try
        {
            obj = l.a(getFileFromPath(obj, s1), s.c);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return ((String) (obj));
    }
}
