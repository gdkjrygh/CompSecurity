// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.ad;
import c.f;
import c.n;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            NameValueBlockReader

class this._cls0 extends n
{

    final NameValueBlockReader this$0;

    public long read(f f, long l)
    {
        if (NameValueBlockReader.access$000(NameValueBlockReader.this) != 0)
        {
            if ((l = super.read(f, Math.min(l, NameValueBlockReader.access$000(NameValueBlockReader.this)))) != -1L)
            {
                NameValueBlockReader.access$002(NameValueBlockReader.this, (int)((long)NameValueBlockReader.access$000(NameValueBlockReader.this) - l));
                return l;
            }
        }
        return -1L;
    }

    (ad ad)
    {
        this$0 = NameValueBlockReader.this;
        super(ad);
    }
}
