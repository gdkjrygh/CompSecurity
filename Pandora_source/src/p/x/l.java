// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.x;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import p.r.c;

// Referenced classes of package p.x:
//            j

public class l
    implements j
{

    private final j a;
    private final Resources b;

    public l(Context context, j j1)
    {
        this(context.getResources(), j1);
    }

    public l(Resources resources, j j1)
    {
        b = resources;
        a = j1;
    }

    public c a(Integer integer, int i, int k)
    {
        c c = null;
        Uri uri = Uri.parse((new StringBuilder()).append("android.resource://").append(b.getResourcePackageName(integer.intValue())).append('/').append(b.getResourceTypeName(integer.intValue())).append('/').append(b.getResourceEntryName(integer.intValue())).toString());
        integer = uri;
_L2:
        if (integer != null)
        {
            c = a.a(integer, i, k);
        }
        return c;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        if (Log.isLoggable("ResourceLoader", 5))
        {
            Log.w("ResourceLoader", (new StringBuilder()).append("Received invalid resource id: ").append(integer).toString(), notfoundexception);
        }
        integer = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile c a(Object obj, int i, int k)
    {
        return a((Integer)obj, i, k);
    }
}
