// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.zip.CRC32;

// Referenced classes of package com.google.android.gms.internal:
//            hs, hh, qw, hf, 
//            hd

public class hr
    implements SafeParcelable
{

    public static final hs CREATOR = new hs();
    final int CK;
    final hf Dw;
    final long Dx;
    final int Dy;
    final hd Dz;
    public final String pc;

    hr(int j, hf hf1, long l, int k, String s, hd hd)
    {
        CK = j;
        Dw = hf1;
        Dx = l;
        Dy = k;
        pc = s;
        Dz = hd;
    }

    public hr(hf hf1, long l, int j)
    {
        this(1, hf1, l, j, null, ((hd) (null)));
    }

    public hr(hf hf1, long l, int j, String s, hd hd)
    {
        this(1, hf1, l, j, s, hd);
    }

    public hr(String s, Intent intent, String s1, Uri uri, String s2, List list)
    {
        this(1, a(s, intent), System.currentTimeMillis(), 0, null, a(intent, s1, uri, s2, list).fD());
    }

    public static hd.a a(Intent intent, String s, Uri uri, String s1, List list)
    {
        hd.a a1 = new hd.a();
        a1.a(av(s));
        if (uri != null)
        {
            a1.a(f(uri));
        }
        if (list != null)
        {
            a1.a(b(list));
        }
        s = intent.getAction();
        if (s != null)
        {
            a1.a(i("intent_action", s));
        }
        s = intent.getDataString();
        if (s != null)
        {
            a1.a(i("intent_data", s));
        }
        s = intent.getComponent();
        if (s != null)
        {
            a1.a(i("intent_activity", s.getClassName()));
        }
        intent = intent.getExtras();
        if (intent != null)
        {
            intent = intent.getString("intent_extra_data_key");
            if (intent != null)
            {
                a1.a(i("intent_extra_data", intent));
            }
        }
        return a1.ar(s1).F(true);
    }

    public static hf a(String s, Intent intent)
    {
        return h(s, g(intent));
    }

    private static hh av(String s)
    {
        return new hh(s, (new hp.a("title")).Q(1).H(true).au("name").fG(), "text1");
    }

    private static hh b(List list)
    {
        mv.a a1 = new mv.a();
        mv.a.a aa[] = new mv.a.a[list.size()];
        for (int j = 0; j < aa.length; j++)
        {
            aa[j] = new mv.a.a();
            com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink appindexinglink = (com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink)list.get(j);
            aa[j].afw = appindexinglink.appIndexingUrl.toString();
            aa[j].viewId = appindexinglink.viewId;
            if (appindexinglink.webUrl != null)
            {
                aa[j].afx = appindexinglink.webUrl.toString();
            }
        }

        a1.afu = aa;
        return new hh(qw.f(a1), (new hp.a("outlinks")).G(true).au(".private:outLinks").at("blob").fG());
    }

    private static hh f(Uri uri)
    {
        return new hh(uri.toString(), (new hp.a("web_url")).Q(4).G(true).au("url").fG());
    }

    private static String g(Intent intent)
    {
        intent = intent.toUri(1);
        CRC32 crc32 = new CRC32();
        try
        {
            crc32.update(intent.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw new IllegalStateException(intent);
        }
        return Long.toHexString(crc32.getValue());
    }

    private static hf h(String s, String s1)
    {
        return new hf(s, "", s1);
    }

    private static hh i(String s, String s1)
    {
        return new hh(s1, (new hp.a(s)).G(true).fG(), s);
    }

    public int describeContents()
    {
        hs hs1 = CREATOR;
        return 0;
    }

    public String toString()
    {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d]", new Object[] {
            Dw, Long.valueOf(Dx), Integer.valueOf(Dy)
        });
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        hs hs1 = CREATOR;
        hs.a(this, parcel, j);
    }

}
