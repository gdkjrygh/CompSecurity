// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appindexing.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzny, zzgv

public class zzgu
{

    private static DocumentSection zza(String s, zzkb.zzc zzc)
    {
        s = (new com.google.android.gms.appdatasearch.RegisterSectionInfo.zza(s)).zzJ(true).zzbe(s).zzbd("blob").zzjG();
        return new DocumentSection(zzny.zzf(zzc), s);
    }

    public static UsageInfo zza(Action action, long l, String s, int i)
    {
        boolean flag = false;
        Bundle bundle = new Bundle();
        bundle.putAll(action.zzjJ());
        Object obj = bundle.getBundle("object");
        String s1;
        String s2;
        byte byte0;
        if (((Bundle) (obj)).containsKey("id"))
        {
            action = Uri.parse(((Bundle) (obj)).getString("id"));
        } else
        {
            action = null;
        }
        s1 = ((Bundle) (obj)).getString("name");
        s2 = ((Bundle) (obj)).getString("type");
        obj = zzgv.zza(s, Uri.parse(((Bundle) (obj)).getString("url")));
        action = UsageInfo.zza(((android.content.Intent) (obj)), s1, action, s2, null);
        if (bundle.containsKey(".private:ssbContext"))
        {
            action.zza(DocumentSection.zzf(bundle.getByteArray(".private:ssbContext")));
            bundle.remove(".private:ssbContext");
        }
        if (bundle.containsKey(".private:accountName"))
        {
            action.zza(new Account(bundle.getString(".private:accountName"), "com.google"));
            bundle.remove(".private:accountName");
        }
        if (bundle.containsKey(".private:isContextOnly") && bundle.getBoolean(".private:isContextOnly"))
        {
            byte0 = 4;
            bundle.remove(".private:isContextOnly");
        } else
        {
            byte0 = 0;
        }
        if (bundle.containsKey(".private:isDeviceOnly"))
        {
            flag = bundle.getBoolean(".private:isDeviceOnly", false);
            bundle.remove(".private:isDeviceOnly");
        }
        action.zza(zza(".private:action", zze(bundle)));
        return (new com.google.android.gms.appdatasearch.UsageInfo.zza()).zza(UsageInfo.zza(s, ((android.content.Intent) (obj)))).zzu(l).zzac(byte0).zza(action.zzjD()).zzL(flag).zzad(i).zzjH();
    }

    static zzkb.zzc zze(Bundle bundle)
    {
        zzkb.zzc zzc = new zzkb.zzc();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = bundle.keySet().iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            Object obj = bundle.get(s);
            zzkb.zzb zzb = new zzkb.zzb();
            zzb.name = s;
            zzb.zzapd = new zzkb.zzd();
            if (obj instanceof String)
            {
                zzb.zzapd.zzUw = (String)obj;
            } else
            if (obj instanceof Bundle)
            {
                zzb.zzapd.zzapi = zze((Bundle)obj);
            } else
            {
                Log.e("AppDataSearchClient", (new StringBuilder()).append("Unsupported value: ").append(obj).toString());
            }
            arraylist.add(zzb);
        }
        if (bundle.containsKey("type"))
        {
            zzc.type = bundle.getString("type");
        }
        zzc.zzape = (zzkb.zzb[])arraylist.toArray(new zzkb.zzb[arraylist.size()]);
        return zzc;
    }
}
