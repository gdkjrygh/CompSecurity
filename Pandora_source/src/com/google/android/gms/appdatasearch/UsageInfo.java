// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzny;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.zip.CRC32;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzj, DocumentSection, DocumentId, DocumentContents

public class UsageInfo
    implements SafeParcelable
{
    public static final class zza
    {

        private String zzEa;
        private DocumentId zzJL;
        private long zzJM;
        private int zzJN;
        private DocumentContents zzJO;
        private boolean zzJP;
        private int zzJQ;
        private int zzJR;

        public zza zzL(boolean flag)
        {
            zzJP = flag;
            return this;
        }

        public zza zza(DocumentContents documentcontents)
        {
            zzJO = documentcontents;
            return this;
        }

        public zza zza(DocumentId documentid)
        {
            zzJL = documentid;
            return this;
        }

        public zza zzac(int i)
        {
            zzJN = i;
            return this;
        }

        public zza zzad(int i)
        {
            zzJR = i;
            return this;
        }

        public UsageInfo zzjH()
        {
            return new UsageInfo(zzJL, zzJM, zzJN, zzEa, zzJO, zzJP, zzJQ, zzJR);
        }

        public zza zzu(long l)
        {
            zzJM = l;
            return this;
        }

        public zza()
        {
            zzJM = -1L;
            zzJN = -1;
            zzJQ = -1;
            zzJP = false;
            zzJR = 0;
        }
    }


    public static final zzj CREATOR = new zzj();
    final DocumentId zzJL;
    final long zzJM;
    int zzJN;
    final DocumentContents zzJO;
    final boolean zzJP;
    int zzJQ;
    int zzJR;
    public final String zzqX;
    final int zzzH;

    UsageInfo(int i, DocumentId documentid, long l, int j, String s, DocumentContents documentcontents, 
            boolean flag, int k, int i1)
    {
        zzzH = i;
        zzJL = documentid;
        zzJM = l;
        zzJN = j;
        zzqX = s;
        zzJO = documentcontents;
        zzJP = flag;
        zzJQ = k;
        zzJR = i1;
    }

    private UsageInfo(DocumentId documentid, long l, int i, String s, DocumentContents documentcontents, boolean flag, 
            int j, int k)
    {
        this(1, documentid, l, i, s, documentcontents, flag, j, k);
    }

    UsageInfo(DocumentId documentid, long l, int i, String s, DocumentContents documentcontents, boolean flag, 
            int j, int k, _cls1 _pcls1)
    {
        this(documentid, l, i, s, documentcontents, flag, j, k);
    }

    public UsageInfo(String s, Intent intent, String s1, Uri uri, String s2, List list, int i)
    {
        this(1, zza(s, intent), System.currentTimeMillis(), 0, ((String) (null)), zza(intent, s1, uri, s2, list).zzjD(), false, -1, i);
    }

    public static DocumentContents.zza zza(Intent intent, String s, Uri uri, String s1, List list)
    {
        DocumentContents.zza zza1 = new DocumentContents.zza();
        zza1.zza(zzbf(s));
        if (uri != null)
        {
            zza1.zza(zzh(uri));
        }
        if (list != null)
        {
            zza1.zza(zzi(list));
        }
        s = intent.getAction();
        if (s != null)
        {
            zza1.zza(zzo("intent_action", s));
        }
        s = intent.getDataString();
        if (s != null)
        {
            zza1.zza(zzo("intent_data", s));
        }
        s = intent.getComponent();
        if (s != null)
        {
            zza1.zza(zzo("intent_activity", s.getClassName()));
        }
        intent = intent.getExtras();
        if (intent != null)
        {
            intent = intent.getString("intent_extra_data_key");
            if (intent != null)
            {
                zza1.zza(zzo("intent_extra_data", intent));
            }
        }
        return zza1.zzbb(s1).zzI(true);
    }

    public static DocumentId zza(String s, Intent intent)
    {
        return zzn(s, zzg(intent));
    }

    private static DocumentSection zzbf(String s)
    {
        return new DocumentSection(s, (new RegisterSectionInfo.zza("title")).zzaa(1).zzK(true).zzbe("name").zzjG(), "text1");
    }

    private static String zzg(Intent intent)
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

    private static DocumentSection zzh(Uri uri)
    {
        return new DocumentSection(uri.toString(), (new RegisterSectionInfo.zza("web_url")).zzaa(4).zzJ(true).zzbe("url").zzjG());
    }

    private static DocumentSection zzi(List list)
    {
        com.google.android.gms.internal.zzkb.zza zza1 = new com.google.android.gms.internal.zzkb.zza();
        com.google.android.gms.internal.zzkb.zza.zza azza[] = new com.google.android.gms.internal.zzkb.zza.zza[list.size()];
        for (int i = 0; i < azza.length; i++)
        {
            azza[i] = new com.google.android.gms.internal.zzkb.zza.zza();
            com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink appindexinglink = (com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink)list.get(i);
            azza[i].zzapa = appindexinglink.appIndexingUrl.toString();
            azza[i].viewId = appindexinglink.viewId;
            if (appindexinglink.webUrl != null)
            {
                azza[i].zzapb = appindexinglink.webUrl.toString();
            }
        }

        zza1.zzaoY = azza;
        return new DocumentSection(zzny.zzf(zza1), (new RegisterSectionInfo.zza("outlinks")).zzJ(true).zzbe(".private:outLinks").zzbd("blob").zzjG());
    }

    private static DocumentId zzn(String s, String s1)
    {
        return new DocumentId(s, "", s1);
    }

    private static DocumentSection zzo(String s, String s1)
    {
        return new DocumentSection(s1, (new RegisterSectionInfo.zza(s)).zzJ(true).zzjG(), s);
    }

    public int describeContents()
    {
        zzj zzj1 = CREATOR;
        return 0;
    }

    public String toString()
    {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[] {
            zzJL, Long.valueOf(zzJM), Integer.valueOf(zzJN), Integer.valueOf(zzJR)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj zzj1 = CREATOR;
        zzj.zza(this, parcel, i);
    }

}
