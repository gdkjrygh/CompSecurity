// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import com.pandora.android.PandoraService;
import com.pandora.android.view.f;
import com.pandora.radio.provider.g;
import java.util.Iterator;
import p.bv.d;

// Referenced classes of package p.ca:
//            ap, ao

class Object
    implements com.pandora.android.view.vice
{

    final ap a;

    public void a(Parcelable parcelable)
    {
        Bundle bundle = (Bundle)parcelable;
        int i = bundle.getInt("deletedPosition");
        int j = p.ca.ap.d(a).a();
        if (j == 0)
        {
            parcelable = a.getResources().getString(0x7f0801ec);
        } else
        {
            parcelable = a.getResources().getQuantityString(0x7f110000, j, new Object[] {
                Integer.valueOf(j)
            });
        }
        p.ca.ap.d(a).a(parcelable);
        d.a(a.m_(), false);
        ap.a(a).a().d(i);
        if (bundle.getBoolean("isShuffleDeleted"))
        {
            ap.a(a).a().d(0);
        }
        ap.a(a).notifyDataSetChanged();
    }

    public void a(Iterator iterator)
    {
        for (; iterator.hasNext(); PandoraService.b(((Bundle)iterator.next()).getString("stationToken"))) { }
    }

    Iterator(ap ap1)
    {
        a = ap1;
        super();
    }
}
