// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class ixa extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private mmr ad;
    private List ae;
    private hyw ai;
    private List aj;
    private Class ak;

    public ixa()
    {
    }

    public static ixa a(hyw hyw1, List list, Class class1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("com.google.android.apps.photos.trash.not_deleted_uris", new ArrayList(list));
        bundle.putParcelable("com.google.android.apps.photos.trash.selected_medias", hyw1);
        bundle.putSerializable("com.google.android.apps.photos.trash.action_class", class1);
        hyw1 = new ixa();
        hyw1.f(bundle);
        return hyw1;
    }

    static olq a(ixa ixa1)
    {
        return ixa1.af;
    }

    public final Dialog c(Bundle bundle)
    {
        ak = (Class)super.q.getSerializable("com.google.android.apps.photos.trash.action_class");
        ai = (hyw)super.q.getParcelable("com.google.android.apps.photos.trash.selected_medias");
        ae = super.q.getParcelableArrayList("com.google.android.apps.photos.trash.not_deleted_uris");
        Object obj = new Intent();
        ((Intent) (obj)).setAction("android.intent.action.VIEW");
        Uri uri = (Uri)ae.get(0);
        if (b.g(uri))
        {
            bundle = "video/*";
        } else
        {
            bundle = "image/*";
        }
        ((Intent) (obj)).setType(bundle);
        ((Intent) (obj)).setData(uri);
        bundle = af.getPackageManager();
        bundle = b.a(af, ((Intent) (obj)), new ixb(this, bundle));
        if (bundle.isEmpty())
        {
            bundle = b.a(af, ((Intent) (obj)), new ixc(this));
        }
        aj = bundle;
        bundle = g().getQuantityString(b.Bo, ae.size(), new Object[] {
            Integer.valueOf(ae.size())
        });
        obj = g().getQuantityString(b.Bn, ae.size());
        bundle = (new android.app.AlertDialog.Builder(af)).setTitle(bundle).setMessage(((CharSequence) (obj))).setNegativeButton(0x1040000, null);
        if (aj.size() > 0)
        {
            bundle.setPositiveButton(b.Bv, this);
        }
        return bundle.create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (mmr)ag.a(mmr);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        dialoginterface = new ixd(ad.d(), ai.a, ak);
        mtj.a(af, dialoginterface);
        dialoginterface = Intent.createChooser((Intent)aj.remove(0), a(b.Bu));
        if (!aj.isEmpty())
        {
            dialoginterface.putExtra("android.intent.extra.INITIAL_INTENTS", (android.os.Parcelable[])aj.toArray(new Intent[0]));
        }
        a(dialoginterface);
    }
}
