// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.a.c;

// Referenced classes of package com.bumptech.glide.load.c:
//            s

public class u
    implements s
{

    private final s a;
    private final Resources b;

    public u(Context context, s s1)
    {
        this(context.getResources(), s1);
    }

    private u(Resources resources, s s1)
    {
        b = resources;
        a = s1;
    }

    private c a(Integer integer, int i, int j)
    {
        c c = null;
        Uri uri = Uri.parse((new StringBuilder("android.resource://")).append(b.getResourcePackageName(integer.intValue())).append('/').append(b.getResourceTypeName(integer.intValue())).append('/').append(b.getResourceEntryName(integer.intValue())).toString());
        integer = uri;
_L2:
        if (integer != null)
        {
            c = a.a(integer, i, j);
        }
        return c;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        if (Log.isLoggable("ResourceLoader", 5))
        {
            Log.w("ResourceLoader", (new StringBuilder("Received invalid resource id: ")).append(integer).toString(), notfoundexception);
        }
        integer = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final volatile c a(Object obj, int i, int j)
    {
        return a((Integer)obj, i, j);
    }
}
