// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzv;

public class Thing
{
    public static class Builder
    {

        final Bundle zzKa = new Bundle();

        public Thing build()
        {
            return new Thing(zzKa);
        }

        public Builder put(String s, Thing thing)
        {
            zzv.zzr(s);
            if (thing != null)
            {
                zzKa.putParcelable(s, thing.zzJZ);
            }
            return this;
        }

        public Builder put(String s, String s1)
        {
            zzv.zzr(s);
            if (s1 != null)
            {
                zzKa.putString(s, s1);
            }
            return this;
        }

        public Builder setDescription(String s)
        {
            put("description", s);
            return this;
        }

        public Builder setId(String s)
        {
            if (s != null)
            {
                put("id", s);
            }
            return this;
        }

        public Builder setName(String s)
        {
            zzv.zzr(s);
            put("name", s);
            return this;
        }

        public Builder setType(String s)
        {
            put("type", s);
            return this;
        }

        public Builder setUrl(Uri uri)
        {
            zzv.zzr(uri);
            put("url", uri.toString());
            return this;
        }

        public Builder()
        {
        }
    }


    final Bundle zzJZ;

    Thing(Bundle bundle)
    {
        zzJZ = bundle;
    }

    public Bundle zzjJ()
    {
        return zzJZ;
    }
}
