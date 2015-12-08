// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public final class ai extends ak.a
{
    public static final class a
    {

        public CharSequence a;
        private final String b;
        private CharSequence c[];
        private boolean d;
        private Bundle e;

        public final ai a()
        {
            return new ai(b, a, c, d, e);
        }

        public a(String s)
        {
            d = true;
            e = new Bundle();
            b = s;
        }
    }

    static interface b
    {

        public abstract Bundle a(Intent intent);
    }

    static final class c
        implements b
    {

        public final Bundle a(Intent intent)
        {
            return RemoteInput.getResultsFromIntent(intent);
        }

        c()
        {
        }
    }

    static final class d
        implements b
    {

        public final Bundle a(Intent intent)
        {
            Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
            return null;
        }

        d()
        {
        }
    }

    static final class e
        implements b
    {

        public final Bundle a(Intent intent)
        {
            intent = intent.getClipData();
            if (intent != null)
            {
                ClipDescription clipdescription = intent.getDescription();
                if (clipdescription.hasMimeType("text/vnd.android.intent") && clipdescription.getLabel().equals("android.remoteinput.results"))
                {
                    return (Bundle)intent.getItemAt(0).getIntent().getExtras().getParcelable("android.remoteinput.resultsData");
                }
            }
            return null;
        }

        e()
        {
        }
    }


    public static final ak.a.a a = new ak.a.a() {

        public final ak.a a(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
        {
            return new ai(s, charsequence, acharsequence, flag, bundle);
        }

        public final volatile ak.a[] a(int i)
        {
            return new ai[i];
        }

    };
    private static final b g;
    private final String b;
    private final CharSequence c;
    private final CharSequence d[];
    private final boolean e;
    private final Bundle f;

    ai(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
    {
        b = s;
        c = charsequence;
        d = acharsequence;
        e = flag;
        f = bundle;
    }

    public static Bundle a(Intent intent)
    {
        return g.a(intent);
    }

    public final String a()
    {
        return b;
    }

    public final CharSequence b()
    {
        return c;
    }

    public final CharSequence[] c()
    {
        return d;
    }

    public final boolean d()
    {
        return e;
    }

    public final Bundle e()
    {
        return f;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            g = new c();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            g = new e();
        } else
        {
            g = new d();
        }
    }
}
