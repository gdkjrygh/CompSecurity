// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bp;

import android.content.res.Resources;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Iterator;

public final class c
{

    public final Resources a;
    public final TextView b;

    public c(Resources resources, TextView textview)
    {
        a = resources;
        b = textview;
    }

    public static String a(HashSet hashset)
    {
        if (hashset.size() == 0)
        {
            return "";
        }
        hashset = hashset.iterator();
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = true;
        while (hashset.hasNext()) 
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            } else
            {
                flag = false;
            }
            stringbuilder.append((String)hashset.next());
        }
        return stringbuilder.toString();
    }

    // Unreferenced inner class com/google/android/m4b/maps/bp/c$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private String a;
        private c b;

        public final void run()
        {
            b.b.setText(a);
        }

            public 
            {
                b = c.this;
                a = s;
                super();
            }
    }

}
