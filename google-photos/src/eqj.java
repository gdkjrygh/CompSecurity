// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.List;

public final class eqj
    implements jcp, mti, omb
{

    public static final android.os.Parcelable.Creator CREATOR = new eqk();
    private static final ekk a = (new ekm()).a(hpg).a();
    private final epf b;
    private final epd c;
    private Context d;
    private mtj e;
    private mmr f;
    private hfy g;
    private eqs h;

    eqj(Parcel parcel)
    {
        b = (epf)parcel.readParcelable(epf.getClassLoader());
        c = (epd)parcel.readParcelable(epd.getClassLoader());
    }

    public eqj(epf epf1, epd epd1)
    {
        boolean flag;
        if (epf1 != null && !epf1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must specify a valid bundleType");
        b = epf1;
        c = epd1;
    }

    public final ekk a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = context;
        e = ((mtj)olm1.a(mtj)).a(this);
        f = (mmr)olm1.a(mmr);
        g = (hfy)olm1.a(hfy);
        h = (eqs)olm1.a(eqs);
    }

    public final void a(String s, mue mue1, mua mua)
    {
label0:
        {
            if ("CreateMediaBundleTask".equals(s))
            {
                s = mue1.a();
                if (mue1 != null && !mue1.c())
                {
                    break label0;
                }
                if (mue1 == null)
                {
                    s = null;
                } else
                {
                    s = mue1.c;
                }
                b.a(d, s);
            }
            return;
        }
        boolean flag;
        if (b.c() && s.getBoolean("async_result"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            mue1 = s.getString("hint_message");
            if (mue1 != null)
            {
                mue1 = mue1.trim();
                Toast.makeText(d, mue1, 1).show();
            }
        }
        mue1 = new Intent();
        if (b.a())
        {
            mua = (ekp)s.getParcelable("com.google.android.apps.photos.core.media");
            s = (ekq)s.getParcelable("com.google.android.apps.photos.core.media_collection");
            mue1.putExtra("com.google.android.apps.photos.core.media", mua);
            mue1.putExtra("com.google.android.apps.photos.core.media_collection", s);
        } else
        if (b.c())
        {
            if (flag)
            {
                mue1.putExtra("async_result", true);
            } else
            {
                mua = (ekq)s.getParcelable("com.google.android.apps.photos.core.media_collection");
                s = s.getString("collection_media_key");
                if (!TextUtils.isEmpty(s))
                {
                    h.a(s, f.d());
                    mue1.putExtra("collection_type", esm.c);
                }
                mue1.putExtra("com.google.android.apps.photos.core.media_collection", mua);
                s = (new iup(d, mua, f.d())).a();
                d.startActivity(s);
            }
        } else
        {
            mue1.putExtra("com.google.android.apps.photos.core.media_collection", (ekq)s.getParcelable("com.google.android.apps.photos.core.media_collection"));
        }
        b.a(d, mue1);
    }

    public final void a(List list)
    {
        e.a(new eqa(f.d(), b, list, c));
        int i;
        if (b.c())
        {
            i = b.nh;
        } else
        if (b.d())
        {
            i = b.nd;
        } else
        {
            i = b.ne;
        }
        g.a(d.getString(i));
        g.a(true);
    }

    public final void b()
    {
        e.b("CreateMediaBundleTask");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
    }

}
