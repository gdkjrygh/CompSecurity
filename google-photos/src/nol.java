// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public final class nol extends noj
{

    private static final String a = nol.getSimpleName();

    public nol()
    {
    }

    public final Intent a(Uri uri, int i)
    {
        throw new UnsupportedOperationException("G+ must call MovieMakerProvider.setInstance() to provide the actual implementation");
    }

    public final Intent a(boolean flag, boolean flag1, int i)
    {
        throw new UnsupportedOperationException("G+ must call MovieMakerProvider.setInstance() to provide the actual implementation");
    }

    public final Uri a(Uri uri)
    {
        return uri;
    }

    public final Parcelable a(int i, List list)
    {
        return null;
    }

    public final Parcelable a(Context context, int i, String s)
    {
        return null;
    }

    public final String a(String s, String s1)
    {
        return null;
    }

    public final List a(Context context, Intent intent)
    {
        return Collections.emptyList();
    }

    public final List a(Intent intent)
    {
        return Collections.emptyList();
    }

    public final Map a(int i, Collection collection)
    {
        if (Log.isLoggable(a, 4))
        {
            String.format("Dummy: getMediaWithUris(%s)", new Object[] {
                collection
            });
        }
        return Collections.emptyMap();
    }

    public final mtf a(Parcelable parcelable)
    {
        return null;
    }

    public final nns a(int i, String s)
    {
        if (Log.isLoggable(a, 4))
        {
            String.format("Dummy: getStoryboard(%s, %s)", new Object[] {
                Integer.valueOf(i), s
            });
        }
        return new nok();
    }

    public final okf a(Context context, int i, String s, okj okj)
    {
        return null;
    }

    public final void a(Context context)
    {
    }

    public final void a(Context context, Parcelable parcelable)
    {
        throw new UnsupportedOperationException("G+ must call MovieMakerProvider.setInstance() to provide the actual implementation");
    }

    public final void a(Context context, String s)
    {
    }

    public final void a(String s, Uri uri)
    {
    }

    public final void a(olm olm)
    {
    }

    public final boolean a()
    {
        return true;
    }

    public final boolean a(int i)
    {
        return false;
    }

    public final Uri b(Context context, int i, String s)
    {
        return null;
    }

    public final List b()
    {
        return Collections.emptyList();
    }

    public final Map b(int i)
    {
        return Collections.emptyMap();
    }

    public final mtf b(Context context)
    {
        return null;
    }

    public final int c(Context context)
    {
        return 0;
    }

    public final Future c(Context context, int i, String s)
    {
        return null;
    }

    public final boolean c()
    {
        return false;
    }

    public final boolean d()
    {
        return false;
    }

    public final boolean d(Context context, int i, String s)
    {
        return false;
    }

    public final String e()
    {
        return "";
    }

    public final void f()
    {
    }

}
