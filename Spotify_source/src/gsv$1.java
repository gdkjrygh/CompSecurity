// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

final class ang.String extends gsh
{

    private gsw a;
    private gsv b;

    public final void b()
    {
        try
        {
            gst.f(b.a).a(a);
            return;
        }
        catch (IOException ioexception)
        {
            gsf.a.log(Level.INFO, (new StringBuilder("StreamHandler failure for ")).append(gst.a(b.a)).toString(), ioexception);
        }
        try
        {
            a.a(ErrorCode.b);
            return;
        }
        catch (IOException ioexception1)
        {
            return;
        }
    }

    transient (gsv gsv1, String s, Object aobj[], gsw gsw1)
    {
        b = gsv1;
        a = gsw1;
        super(s, aobj);
    }
}
