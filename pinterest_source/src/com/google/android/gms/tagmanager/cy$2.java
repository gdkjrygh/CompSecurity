// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cy

class atK
    implements android.os.er.Callback
{

    final cy atK;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && cy.ez().equals(message.obj))
        {
            atK.dispatch();
            if (cy.b(atK) > 0 && !cy.c(atK))
            {
                cy.d(atK).sendMessageDelayed(cy.d(atK).obtainMessage(1, cy.ez()), cy.b(atK));
            }
        }
        return true;
    }

    (cy cy1)
    {
        atK = cy1;
        super();
    }
}
