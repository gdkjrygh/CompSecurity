// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.net.Uri;
import com.microsoft.onlineid.h;
import java.util.Iterator;
import java.util.List;

public final class i
{
    public static final class a
    {

        private final android.net.Uri.Builder a = new android.net.Uri.Builder();

        public final Uri a()
        {
            return a.build();
        }

        public final a a(h h1)
        {
            a.appendPath("options");
            if (h1 == null)
            {
                a.appendPath("null");
                return this;
            } else
            {
                return a(h1.b());
            }
        }

        public final a a(String s)
        {
            a.appendPath("str").appendPath(s);
            return this;
        }

        public final a a(List list)
        {
            a.appendPath("list");
            if (list != null)
            {
                String s;
                for (list = list.iterator(); list.hasNext(); a.appendPath(s))
                {
                    s = (String)list.next();
                }

            } else
            {
                a.appendPath("null");
            }
            return this;
        }

        public a()
        {
            a.scheme("extras");
        }
    }

}
