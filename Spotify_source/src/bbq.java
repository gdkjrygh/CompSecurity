// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaDrm;

final class bbq
    implements android.media.MediaDrm.OnEventListener
{

    private bbo a;

    private bbq(bbo bbo1)
    {
        a = bbo1;
        super();
    }

    bbq(bbo bbo1, byte byte0)
    {
        this(bbo1);
    }

    public final void onEvent(MediaDrm mediadrm, byte abyte0[], int i, int j, byte abyte1[])
    {
        a.a.sendEmptyMessage(i);
    }
}
