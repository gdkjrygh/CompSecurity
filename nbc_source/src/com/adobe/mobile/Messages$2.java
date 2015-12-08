// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.adobe.mobile:
//            Messages, MobileConfig, Message

static final class g
    implements Runnable
{

    public void run()
    {
        Object obj = MobileConfig.getInstance().getInAppMessages();
        if (obj != null && ((ArrayList) (obj)).size() > 0)
        {
            obj = ((ArrayList) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((Message)((Iterator) (obj)).next()).isVisible = false;
            }
        }
    }

    g()
    {
    }
}
