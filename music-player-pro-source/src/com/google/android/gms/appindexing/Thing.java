// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.jx;

public class Thing
{
    public static class Builder
    {

        final Bundle DJ = new Bundle();

        public Thing build()
        {
            return new Thing(DJ);
        }

        public Builder put(String s, Thing thing)
        {
            jx.i(s);
            if (thing != null)
            {
                DJ.putParcelable(s, thing.DI);
            }
            return this;
        }

        public Builder put(String s, String s1)
        {
            jx.i(s);
            if (s1 != null)
            {
                DJ.putString(s, s1);
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
            jx.i(s);
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
            jx.i(uri);
            put("url", uri.toString());
            return this;
        }

        public Builder()
        {
        }
    }


    final Bundle DI;

    Thing(Bundle bundle)
    {
        DI = bundle;
    }

    public Bundle fI()
    {
        return DI;
    }
}
