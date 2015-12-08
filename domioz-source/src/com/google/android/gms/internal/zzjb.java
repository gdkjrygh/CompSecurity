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
import java.util.zip.CRC32;

// Referenced classes of package com.google.android.gms.internal:
//            gt, gj, zzir, gr, 
//            zzip, zzin

public class zzjb
    implements SafeParcelable
{

    public static final gt CREATOR = new gt();
    final int a;
    final zzip b;
    final long c;
    final int d;
    public final String e;
    final zzin f;
    final boolean g;
    int h;

    zzjb(int i, zzip zzip1, long l, int j, String s, zzin zzin, 
            boolean flag, int k)
    {
        a = i;
        b = zzip1;
        c = l;
        d = j;
        e = s;
        f = zzin;
        g = flag;
        h = k;
    }

    public zzjb(zzip zzip1, long l, int i, zzin zzin, boolean flag)
    {
        this(1, zzip1, l, i, null, zzin, flag, -1);
    }

    public static gj a(Intent intent, String s, Uri uri, String s1)
    {
        gj gj1 = new gj();
        gj1.a(new zzir(s, (new gr("title")).a(1).b().b("name").c(), "text1"));
        if (uri != null)
        {
            gj1.a(new zzir(uri.toString(), (new gr("web_url")).a(4).a().b("url").c()));
        }
        s = intent.getAction();
        if (s != null)
        {
            gj1.a(a("intent_action", s));
        }
        s = intent.getDataString();
        if (s != null)
        {
            gj1.a(a("intent_data", s));
        }
        s = intent.getComponent();
        if (s != null)
        {
            gj1.a(a("intent_activity", s.getClassName()));
        }
        intent = intent.getExtras();
        if (intent != null)
        {
            intent = intent.getString("intent_extra_data_key");
            if (intent != null)
            {
                gj1.a(a("intent_extra_data", ((String) (intent))));
            }
        }
        return gj1.a(s1).a();
    }

    public static zzip a(String s, Intent intent)
    {
        return new zzip(s, "", a(intent));
    }

    private static zzir a(String s, String s1)
    {
        return new zzir(s1, (new gr(s)).a().c(), s);
    }

    private static String a(Intent intent)
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
        return 0;
    }

    public String toString()
    {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d]", new Object[] {
            b, Long.valueOf(c), Integer.valueOf(d)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gt.a(this, parcel, i);
    }

}
