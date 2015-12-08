// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Message;

public class gpw
    implements dmx
{

    public gpw()
    {
    }

    public static void a(Uri uri)
    {
        Object obj = aci.a();
        if (((acm) (obj)).a())
        {
            long l = System.currentTimeMillis();
            obj = ((acm) (obj)).c;
            Message message = Message.obtain();
            message.arg1 = 0x11bbc;
            message.obj = new ach(uri, l);
            ((ace) (obj)).a.sendMessage(message);
        }
    }
}
