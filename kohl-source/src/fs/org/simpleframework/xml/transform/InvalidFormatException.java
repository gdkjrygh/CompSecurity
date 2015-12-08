// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;


// Referenced classes of package fs.org.simpleframework.xml.transform:
//            TransformException

public class InvalidFormatException extends TransformException
{

    public transient InvalidFormatException(String s, Object aobj[])
    {
        super(String.format(s, aobj), new Object[0]);
    }
}
