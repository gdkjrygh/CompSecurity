// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.jni;


// Referenced classes of package com.facebook.jni:
//            CppException

public class UnknownCppException extends CppException
{

    public UnknownCppException()
    {
        super("Unknown");
    }

    public UnknownCppException(String s)
    {
        super(s);
    }
}
