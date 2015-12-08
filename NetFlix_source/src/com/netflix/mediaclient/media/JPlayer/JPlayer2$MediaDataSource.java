// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import com.netflix.mediaclient.Log;
import java.nio.ByteBuffer;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            JPlayer2

public class mIsAudio
    implements aSource
{

    static final boolean TYPE_AUDIO = true;
    static final boolean TYPE_VIDEO = false;
    private boolean mIsAudio;
    final JPlayer2 this$0;

    public aSource.BufferMeta onRequestData(ByteBuffer bytebuffer)
    {
        aSource.BufferMeta buffermeta = new aSource.BufferMeta();
        buffermeta.size = 0;
        buffermeta.flags = 0;
        if (bytebuffer.isDirect())
        {
            JPlayer2.access$000(JPlayer2.this, bytebuffer, mIsAudio, buffermeta);
        } else
        {
            Log.e("NF_JPlayer2", "WITH NON-DIRECT BYTEBUFFER");
            byte abyte0[] = bytebuffer.array();
            if (abyte0 == null)
            {
                buffermeta.size = 0;
                buffermeta.flags = 4;
                Log.e("NF_JPlayer2", "can't get bytearray");
                return buffermeta;
            }
            JPlayer2.access$100(JPlayer2.this, abyte0, mIsAudio, buffermeta);
        }
        bytebuffer.limit(buffermeta.size);
        bytebuffer.position(0);
        return buffermeta;
    }

    aSource.BufferMeta(boolean flag)
    {
        this$0 = JPlayer2.this;
        super();
        mIsAudio = flag;
    }
}
