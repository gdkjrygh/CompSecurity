// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;

public class egf
    implements omb, opv
{

    public amh a;
    private mmr b;
    private ayt c;

    public egf(opd opd1)
    {
        opd1.a(this);
    }

    public egf(opd opd1, byte byte0)
    {
        opd1.a(this);
    }

    public final egf a(olm olm1)
    {
        olm1.a(egf, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (mmr)olm1.a(mmr);
        a = (amh)olm1.a(amh);
        c = (ayt)((ayt)((fli)olm1.a(fli)).b().a(context, new avj(context))).a(b.la);
    }

    public final void a(String s, ImageView imageview)
    {
        amh amh1 = a;
        if (TextUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            s = new gat(s, b.d());
        }
        amh1.a(s).a(c).a(imageview);
    }
}
