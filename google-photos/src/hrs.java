// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;

public final class hrs
    implements omb, opv
{

    private amh a;
    private ayt b;

    public hrs(opd opd1)
    {
        opd1.a(this);
    }

    public final hrs a(olm olm1)
    {
        olm1.a(hrs, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (amh)olm1.a(amh);
        context = (ayt)((ayt)(new ayt()).b(context, avk.b, new avj(context))).a(((fli)olm.a(context, fli)).a(), hsp.a);
        context.s = true;
        b = (ayt)context;
    }

    public final void a(ImageView imageview)
    {
        a.a(imageview);
    }

    public final void a(ImageView imageview, String s, int i)
    {
        if (s != null && !TextUtils.isEmpty(s))
        {
            s = new gat(s, i);
            a.a(s).a(b).a(imageview);
            return;
        } else
        {
            a(imageview);
            return;
        }
    }
}
