// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;


// Referenced classes of package com.google.android.gms.wearable.internal:
//            QueueEntryBufferImpl

private static final class refuseCode
{

    public final int refuseCode;
    public final int state;

    public final String toString()
    {
        return (new StringBuilder("EntryMetadata{state=")).append(state).append(", refuseCode=").append(refuseCode).append("}").toString();
    }

    public Q(int i, int j)
    {
        state = QueueEntryBufferImpl.access$000(i);
        refuseCode = j;
    }
}
