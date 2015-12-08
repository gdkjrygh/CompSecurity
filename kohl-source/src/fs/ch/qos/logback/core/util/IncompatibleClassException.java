// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.util;


public class IncompatibleClassException extends Exception
{

    Class obtainedClass;
    Class requestedClass;

    IncompatibleClassException(Class class1, Class class2)
    {
        requestedClass = class1;
        obtainedClass = class2;
    }
}
