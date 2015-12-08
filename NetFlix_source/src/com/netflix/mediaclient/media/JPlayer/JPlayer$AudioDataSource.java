// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.util.Log;
import java.nio.ByteBuffer;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            JPlayer

public class this._cls0
    implements taSource
{

    static final boolean $assertionsDisabled;
    final JPlayer this$0;

    public taSource.BufferMeta onRequestData(ByteBuffer bytebuffer)
    {
        taSource.BufferMeta buffermeta = new taSource.BufferMeta();
        taSource.BufferMeta buffermeta1 = new it>(JPlayer.this);
        int i;
        if (bytebuffer.isDirect())
        {
            i = JPlayer.access$000(JPlayer.this, bytebuffer, true, buffermeta1);
        } else
        {
            Log.e("NF_JPlayer", "WITH NON-DIRECT BYTEBUFFER");
            byte abyte0[] = bytebuffer.array();
            if (abyte0 == null)
            {
                buffermeta.size = 0;
                buffermeta.flags = 256;
                Log.e("NF_JPlayer", "can't get bytearray");
                return buffermeta;
            }
            i = JPlayer.access$100(JPlayer.this, abyte0, true, buffermeta1);
        }
        if (!$assertionsDisabled && i != buffermeta1.taSize)
        {
            throw new AssertionError();
        } else
        {
            buffermeta.timestamp = buffermeta1.meStamp;
            buffermeta.flags = buffermeta1.ags;
            buffermeta.size = buffermeta1.taSize;
            bytebuffer.limit(buffermeta1.taSize);
            bytebuffer.position(0);
            return buffermeta;
        }
    }

    static 
    {
        boolean flag;
        if (!com/netflix/mediaclient/media/JPlayer/JPlayer.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    public taSource.BufferMeta()
    {
        this$0 = JPlayer.this;
        super();
    }
}
