// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

public final class mmk extends omn
{

    public mmk()
    {
    }

    public static mmk a(Context context, mmm mmm1, String s)
    {
        Object obj = mmm1.a();
        mmm1 = new int[((jz) (obj)).size()];
        String as[] = new String[((jz) (obj)).size() + 1];
        for (int i = 0; i < ((jz) (obj)).size(); i++)
        {
            mmm1[i] = ((Integer)((jz) (obj)).b(i)).intValue();
            as[i] = (String)((jz) (obj)).c(i);
        }

        context = context.getResources();
        as[((jz) (obj)).size()] = context.getString(b.DO);
        context = new mmk();
        obj = new Bundle();
        ((Bundle) (obj)).putIntArray("idsTag", mmm1);
        ((Bundle) (obj)).putCharSequenceArray("actionsTag", as);
        ((Bundle) (obj)).putString("dialogIdTag", s);
        context.f(((Bundle) (obj)));
        return context;
    }

    public final Dialog c(Bundle bundle)
    {
        Bundle bundle1 = super.q;
        bundle = new android.app.AlertDialog.Builder(O_());
        CharSequence acharsequence[] = bundle1.getCharSequenceArray("actionsTag");
        bundle.setTitle(af.getResources().getString(b.DP)).setItems(acharsequence, (android.content.DialogInterface.OnClickListener)ag.a(mml));
        return bundle.create();
    }
}
