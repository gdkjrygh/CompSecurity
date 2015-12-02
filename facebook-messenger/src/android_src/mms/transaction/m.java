// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.Context;
import android.content.Intent;
import java.io.OutputStream;
import org.apache.http.entity.ByteArrayEntity;

public class m extends ByteArrayEntity
{

    private final Context a;
    private final byte b[];
    private final long c;

    public m(Context context, long l, byte abyte0[])
    {
        super(abyte0);
        a = context;
        b = abyte0;
        c = l;
    }

    private void a(int i)
    {
        if (c > 0L)
        {
            Intent intent = new Intent("com.android.mms.PROGRESS_STATUS");
            intent.putExtra("progress", i);
            intent.putExtra("token", c);
            a.sendBroadcast(intent);
        }
    }

    public void writeTo(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        int l;
        a(-1);
        l = b.length;
        int i = 0;
          goto _L1
_L5:
        int j;
        outputstream.write(b, i, j);
        outputstream.flush();
        i = j + i;
        a((i * 100) / l);
          goto _L1
_L3:
        a(100);
        return;
        outputstream;
        a(-2);
        throw outputstream;
_L1:
        if (i >= l) goto _L3; else goto _L2
_L2:
        int k = l - i;
        j = k;
        if (k > 4096)
        {
            j = 4096;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}
