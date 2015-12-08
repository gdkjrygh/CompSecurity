// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cy

class arB
    implements android.os.er.Callback
{

    final cy arB;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && cy.ee().equals(message.obj))
        {
            arB.dispatch();
            if (cy.b(arB) > 0 && !cy.c(arB))
            {
                cy.d(arB).sendMessageDelayed(cy.d(arB).obtainMessage(1, cy.ee()), cy.b(arB));
            }
        }
        return true;
    }

    (cy cy1)
    {
        arB = cy1;
        super();
    }
}
