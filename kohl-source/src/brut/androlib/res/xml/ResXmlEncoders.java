// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package brut.androlib.res.xml;


public final class ResXmlEncoders
{

    public static String escapeXmlChars(String s)
    {
        return s.replace("&", "&amp;").replace("<", "&lt;");
    }
}
