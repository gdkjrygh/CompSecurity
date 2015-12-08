// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class jcz extends omn
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener
{

    private jda ad;

    public jcz()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = (new sr(af)).a(b.Ce);
        int j = b.Cd;
        ((sr) (bundle)).a.f = ((sr) (bundle)).a.a.getText(j);
        ((sr) (bundle)).a.l = this;
        return bundle.a(0x104000a, this).a();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (jda)ag.a(jda);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        ad.a();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        ad.a();
    }
}
