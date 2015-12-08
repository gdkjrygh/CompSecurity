// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class heb extends al
{

    public heb()
    {
    }

    public static heb b(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("errorCode", i);
        heb heb1 = new heb();
        heb1.f(bundle);
        return heb1;
    }

    public final Dialog c(Bundle bundle)
    {
        return ((lzn)olm.a(O_(), lzn)).a(super.q.getInt("errorCode"), O_(), 0, null);
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        dialoginterface = O_();
        if (dialoginterface != null)
        {
            dialoginterface.finish();
        }
    }
}
