// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            ContentChangedListener, TimelineMonitor

class this._cls0
    implements ContentChangedListener
{

    final TimelineMonitor this$0;

    public void onChanged(int i, long l)
    {
        TimelineMonitor.access$000(TimelineMonitor.this, i, l);
    }

    ener()
    {
        this$0 = TimelineMonitor.this;
        super();
    }
}
