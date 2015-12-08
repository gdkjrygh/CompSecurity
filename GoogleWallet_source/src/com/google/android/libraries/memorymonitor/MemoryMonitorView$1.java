// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.memorymonitor;


// Referenced classes of package com.google.android.libraries.memorymonitor:
//            MemoryMonitorView, AndroidMemorySnapshot

final class this._cls0
    implements dMemoryListener
{

    final MemoryMonitorView this$0;

    public final void onSnapshot(AndroidMemorySnapshot androidmemorysnapshot)
    {
        MemoryMonitorView.access$102(MemoryMonitorView.this, androidmemorysnapshot);
        postInvalidate();
    }

    t()
    {
        this$0 = MemoryMonitorView.this;
        super();
    }
}
