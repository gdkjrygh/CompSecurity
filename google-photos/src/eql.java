// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.widget.Toast;
import java.util.List;

public final class eql
    implements jcp, mti, omb
{

    public static final android.os.Parcelable.Creator CREATOR = new eqm();
    private static final ekk a = (new ekm()).a(hpg).a();
    private Context b;
    private mtj c;
    private mmr d;
    private hfy e;
    private eqs f;
    private noe g;
    private int h;
    private String i;
    private noq j;

    public eql(int k, String s)
    {
        h = k;
        i = s;
    }

    eql(Parcel parcel)
    {
        h = parcel.readInt();
        i = parcel.readString();
    }

    public final ekk a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = context;
        c = ((mtj)olm1.a(mtj)).a(this);
        d = (mmr)olm1.a(mmr);
        e = (hfy)olm1.a(hfy);
        j = (noq)olm1.a(noq);
        f = (eqs)olm1.a(eqs);
        g = (noe)olm1.a(noe);
    }

    public final void a(String s, mue mue1, mua mua)
    {
label0:
        {
            mua = null;
            boolean flag = false;
            if ("CreateMediaProjectTask".equals(s))
            {
                if (mue1 != null && !mue1.c())
                {
                    break label0;
                }
                s = mua;
                if (mue1 != null)
                {
                    s = mue1.c;
                    flag = mue1.a().getBoolean("show_error_message");
                }
                if (flag)
                {
                    Toast.makeText(b, b.getString(b.ng), 1).show();
                }
                b.a(b, s);
                j.b(19);
            }
            return;
        }
        s = mue1.a().getString("media_key");
        mue1 = (new nog(b)).a().a(s).a(h).b(i).b(d.d()).b();
        b.startActivity(mue1);
        j.a(19, null, false);
        f.a(s, d.d());
        s = new Intent();
        s.putExtra("collection_type", esm.d);
        b.a(b, s);
    }

    public final void a(List list)
    {
        c.a(new eqc(d.d(), list, g.c()));
        list = b.getString(b.nf);
        e.a(list);
        e.a(true);
    }

    public final void b()
    {
        c.b("CreateMediaProjectTask");
        j.b(19);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeInt(h);
        parcel.writeString(i);
    }

}
