// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;


// Referenced classes of package com.quantcast.measurement.service:
//            QCEventHandler

class this._cls0
    implements android.os.Handler
{

    final QCEventHandler this$0;

    public boolean queueIdle()
    {
        if (QCEventHandler.access$000(QCEventHandler.this) != null)
        {
            QCEventHandler.access$000(QCEventHandler.this).release();
        }
        return true;
    }

    ()
    {
        this$0 = QCEventHandler.this;
        super();
    }
}
