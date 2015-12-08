// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;


// Referenced classes of package com.soundcloud.android.creators.record:
//            CreateWaveDisplay

private class position
{

    int position;
    final CreateWaveDisplay this$0;
    long timestamp;

    public boolean hasMovedFrom(position position1)
    {
        return position1 != null && position1.position != position;
    }

    public I(long l, int i)
    {
        this$0 = CreateWaveDisplay.this;
        super();
        timestamp = l;
        position = i;
    }
}
