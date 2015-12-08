// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;

public final class bix extends biw
{

    private final Context a;

    public bix(Context context, AdRequestInfoParcel adrequestinfoparcel, biu biu)
    {
        super(adrequestinfoparcel, biu);
        a = context;
    }

    public final bje d()
    {
        Object obj = cbb.a;
        obj = new cau((String)bkv.n().a(((cax) (obj))));
        Context context = a;
        new ciq();
        cav cav1 = new cav();
        new cel();
        new cgo();
        cir cir1 = new cir();
        new cip();
        new cio();
        return cif.a(context, ((cau) (obj)), new cie(cav1, cir1));
    }

    public final void e_()
    {
    }
}
