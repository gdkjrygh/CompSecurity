// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt.a;


// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt.a:
//            f

abstract class a
    implements f
{

    a()
    {
    }

    protected Class a(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }
}
