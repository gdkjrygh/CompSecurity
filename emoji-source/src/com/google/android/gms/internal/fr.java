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
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;

// Referenced classes of package com.google.android.gms.internal:
//            fs, fg, fk, fi, 
//            me

public class fr
    implements SafeParcelable
{

    public static final fs CREATOR = new fs();
    public final String mP;
    final int xM;
    final fi yq;
    final long yr;
    final int ys;
    final fg yt;

    fr(int i, fi fi1, long l, int j, String s, fg fg1)
    {
        xM = i;
        yq = fi1;
        yr = l;
        ys = j;
        mP = s;
        yt = fg1;
    }

    public fr(fi fi1, long l, int i)
    {
        this(1, fi1, l, i, null, ((fg) (null)));
    }

    public fr(String s, Intent intent, String s1, Uri uri, String s2, List list)
    {
        this(1, a(s, intent), System.currentTimeMillis(), 0, null, a(intent, s1, uri, s2, list));
    }

    static fg a(Intent intent, String s, Uri uri, String s1, List list)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(ab(s));
        if (uri != null)
        {
            arraylist.add(f(uri));
        }
        if (list != null)
        {
            arraylist.add(a(list));
        }
        s = intent.getAction();
        if (s != null)
        {
            arraylist.add(f("intent_action", s));
        }
        s = intent.getDataString();
        if (s != null)
        {
            arraylist.add(f("intent_data", s));
        }
        s = intent.getComponent();
        if (s != null)
        {
            arraylist.add(f("intent_activity", s.getClassName()));
        }
        intent = intent.getExtras();
        if (intent != null)
        {
            intent = intent.getString("intent_extra_data_key");
            if (intent != null)
            {
                arraylist.add(f("intent_extra_data", intent));
            }
        }
        return new fg(s1, true, (fk[])arraylist.toArray(new fk[arraylist.size()]));
    }

    public static fi a(String s, Intent intent)
    {
        return new fi(s, "", f(intent));
    }

    private static fk a(List list)
    {
        iv.a a1 = new iv.a();
        iv.a.a aa[] = new iv.a.a[list.size()];
        for (int i = 0; i < aa.length; i++)
        {
            aa[i] = new iv.a.a();
            com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink appindexinglink = (com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink)list.get(i);
            aa[i].UA = appindexinglink.appIndexingUrl.toString();
            aa[i].UB = appindexinglink.webUrl.toString();
            aa[i].viewId = appindexinglink.viewId;
        }

        a1.Uy = aa;
        return new fk(me.d(a1), (new fp.a("outlinks")).w(true).aa(".private:outLinks").Z("blob").dQ());
    }

    private static fk ab(String s)
    {
        return new fk(s, (new fp.a("title")).I(1).x(true).aa("name").dQ(), "text1");
    }

    private static fk f(Uri uri)
    {
        return new fk(uri.toString(), (new fp.a("web_url")).I(4).w(true).aa("url").dQ());
    }

    private static fk f(String s, String s1)
    {
        return new fk(s1, (new fp.a(s)).w(true).dQ(), s);
    }

    private static String f(Intent intent)
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

    public int describeContents()
    {
        fs fs1 = CREATOR;
        return 0;
    }

    public String toString()
    {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d]", new Object[] {
            yq, Long.valueOf(yr), Integer.valueOf(ys)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fs fs1 = CREATOR;
        fs.a(this, parcel, i);
    }

}
