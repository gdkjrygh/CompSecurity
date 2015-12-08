// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.ads:
//            h

final class 
    implements 
{

    public final String a()
    {
        return null;
    }

    public final String a(InputStream inputstream)
    {
        inputstream = h.a(inputstream);
        try
        {
            inputstream = new String(inputstream, "UTF8");
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return null;
        }
        return inputstream;
    }

    public final Object b()
    {
        return a();
    }

    public final Object b(InputStream inputstream)
    {
        return a(inputstream);
    }

    ()
    {
    }
}
