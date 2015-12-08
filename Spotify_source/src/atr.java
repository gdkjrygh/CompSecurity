// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.SpeechCapabilities;
import java.util.Hashtable;
import java.util.Vector;

public final class atr
{

    public static awt a(SpeechCapabilities speechcapabilities, String s)
    {
        awt awt1 = new awt();
        if (speechcapabilities != null)
        {
            awt1.e.put("type", speechcapabilities);
        }
        if (s != null)
        {
            awt1.e.put("text", s);
        }
        return awt1;
    }

    public static Vector a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            Vector vector = new Vector();
            vector.add(a(SpeechCapabilities.a, s));
            return vector;
        }
    }
}
