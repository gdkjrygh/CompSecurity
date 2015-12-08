// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class gab
    implements mti, omb, opv
{

    public int a;
    public mtj b;
    private final gac c;
    private noz d;

    public gab(opd opd1, gac gac1)
    {
        this(opd1, gac1, (byte)0);
    }

    private gab(opd opd1, gac gac1, byte byte0)
    {
        p.a(opd1);
        p.a(gac1);
        c = gac1;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = ((mmr)olm1.a(mmr)).d();
        b = ((mtj)olm1.a(mtj)).a(this);
        d = noz.a(context, 3, "MediaEditCaptionMixin", new String[0]);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        while (!"com.google.android.apps.photos.mediadetails.mediacaption.PhotosEditCaptionTask".equals(s) || mue1 != null && !mue1.c()) 
        {
            return;
        }
        if (mue1 == null)
        {
            s = null;
        } else
        {
            s = mue1.c;
        }
        mue1 = mue1.a().getString("photos_mediadetails_mediacaption_caption");
        c.a(s, mue1);
    }
}
