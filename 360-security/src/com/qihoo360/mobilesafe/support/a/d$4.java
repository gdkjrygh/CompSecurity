// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;


// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            d

class  extends Thread
{

    public void run()
    {
        try
        {
            d.i.waitFor();
            d.i.destroy();
        }
        catch (Exception exception) { }
        d.i = null;
    }

    ()
    {
    }
}
