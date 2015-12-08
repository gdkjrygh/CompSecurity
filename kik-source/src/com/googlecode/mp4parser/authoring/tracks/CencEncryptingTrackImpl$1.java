// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            CencEncryptingTrackImpl

class this._cls0 extends HashMap
{

    final CencEncryptingTrackImpl this$0;

    public volatile Object put(Object obj, Object obj1)
    {
        return put((GroupEntry)obj, (long[])obj1);
    }

    public long[] put(GroupEntry groupentry, long al[])
    {
        if (groupentry instanceof CencSampleEncryptionInformationGroupEntry)
        {
            throw new RuntimeException("Please supply CencSampleEncryptionInformationGroupEntries in the constructor");
        } else
        {
            return (long[])super.put(groupentry, al);
        }
    }

    onInformationGroupEntry(Map map)
    {
        this$0 = CencEncryptingTrackImpl.this;
        super(map);
    }
}
