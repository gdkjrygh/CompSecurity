// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import java.io.ByteArrayInputStream;
import java.io.IOException;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class val.dataToInject
    implements Runnable
{

    final AmobeeView this$0;
    private final String val$dataToInject;
    private final ByteArrayInputStream val$is;

    public void run()
    {
        AmobeeView.access$10(AmobeeView.this, val$is, val$dataToInject);
        try
        {
            val$is.close();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    ()
    {
        this$0 = final_amobeeview;
        val$is = bytearrayinputstream;
        val$dataToInject = String.this;
        super();
    }
}
