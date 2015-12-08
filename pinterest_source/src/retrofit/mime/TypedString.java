// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.mime;

import java.io.UnsupportedEncodingException;

// Referenced classes of package retrofit.mime:
//            TypedByteArray

public class TypedString extends TypedByteArray
{

    public TypedString(String s)
    {
        super("text/plain; charset=UTF-8", convertToBytes(s));
    }

    private static byte[] convertToBytes(String s)
    {
        try
        {
            s = s.getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public String toString()
    {
        String s;
        try
        {
            s = (new StringBuilder("TypedString[")).append(new String(getBytes(), "UTF-8")).append("]").toString();
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError("Must be able to decode UTF-8");
        }
        return s;
    }
}
