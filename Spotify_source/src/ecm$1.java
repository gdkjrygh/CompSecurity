// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.music.spotlets.radio.model.ThumbState;

final class nit> extends gpj
{

    private ecm a;

    public final void a(gpg gpg1)
    {
        a.a = (ThumbState)ctz.a(gpg1.a());
        a.d.post(a.b);
    }

    (ecm ecm1)
    {
        a = ecm1;
        super();
    }
}
