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
//            ht, hi, pn, hg, 
//            he

public class hs
    implements SafeParcelable
{

    public static final ht CREATOR = new ht();
    final int BR;
    final hg CD;
    final long CE;
    final int CF;
    final he CG;
    public final String oT;

    hs(int k, hg hg1, long l, int i1, String s, he he)
    {
        BR = k;
        CD = hg1;
        CE = l;
        CF = i1;
        oT = s;
        CG = he;
    }

    public hs(hg hg1, long l, int k)
    {
        this(1, hg1, l, k, null, ((he) (null)));
    }

    public hs(String s, Intent intent, String s1, Uri uri, String s2, List list)
    {
        this(1, a(s, intent), System.currentTimeMillis(), 0, null, a(intent, s1, uri, s2, list).fj());
    }

    public static he.a a(Intent intent, String s, Uri uri, String s1, List list)
    {
        he.a a1 = new he.a();
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
            a1.a(j("intent_action", s));
        }
        s = intent.getDataString();
        if (s != null)
        {
            a1.a(j("intent_data", s));
        }
        s = intent.getComponent();
        if (s != null)
        {
            a1.a(j("intent_activity", s.getClassName()));
        }
        intent = intent.getExtras();
        if (intent != null)
        {
            intent = intent.getString("intent_extra_data_key");
            if (intent != null)
            {
                a1.a(j("intent_extra_data", intent));
            }
        }
        return a1.ar(s1).D(true);
    }

    public static hg a(String s, Intent intent)
    {
        return i(s, g(intent));
    }

    private static hi av(String s)
    {
        return new hi(s, (new hq.a("title")).P(1).F(true).au("name").fm(), "text1");
    }

    private static hi b(List list)
    {
        ll.a a1 = new ll.a();
        ll.a.a aa[] = new ll.a.a[list.size()];
        for (int k = 0; k < aa.length; k++)
        {
            aa[k] = new ll.a.a();
            com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink appindexinglink = (com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink)list.get(k);
            aa[k].adG = appindexinglink.appIndexingUrl.toString();
            aa[k].adH = appindexinglink.webUrl.toString();
            aa[k].viewId = appindexinglink.viewId;
        }

        a1.adE = aa;
        return new hi(pn.f(a1), (new hq.a("outlinks")).E(true).au(".private:outLinks").at("blob").fm());
    }

    private static hi f(Uri uri)
    {
        return new hi(uri.toString(), (new hq.a("web_url")).P(4).E(true).au("url").fm());
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

    private static hg i(String s, String s1)
    {
        return new hg(s, "", s1);
    }

    private static hi j(String s, String s1)
    {
        return new hi(s1, (new hq.a(s)).E(true).fm(), s);
    }

    public int describeContents()
    {
        ht ht1 = CREATOR;
        return 0;
    }

    public String toString()
    {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d]", new Object[] {
            CD, Long.valueOf(CE), Integer.valueOf(CF)
        });
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        ht ht1 = CREATOR;
        ht.a(this, parcel, k);
    }

}
