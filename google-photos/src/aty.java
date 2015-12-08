// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

public final class aty
    implements atm
{

    private final atm a;
    private final Resources b;

    public aty(Context context, atm atm1)
    {
        this(context.getResources(), atm1);
    }

    private aty(Resources resources, atm atm1)
    {
        b = resources;
        a = atm1;
    }

    private Uri a(Integer integer)
    {
        Object obj;
        try
        {
            obj = String.valueOf("android.resource://");
            String s = String.valueOf(b.getResourcePackageName(integer.intValue()));
            String s1 = String.valueOf(b.getResourceTypeName(integer.intValue()));
            String s2 = String.valueOf(b.getResourceEntryName(integer.intValue()));
            obj = Uri.parse((new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(s).length() + String.valueOf(s1).length() + String.valueOf(s2).length())).append(((String) (obj))).append(s).append("/").append(s1).append("/").append(s2).toString());
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            if (Log.isLoggable("ResourceLoader", 5))
            {
                integer = String.valueOf(integer);
                Log.w("ResourceLoader", (new StringBuilder(String.valueOf(integer).length() + 30)).append("Received invalid resource id: ").append(integer).toString(), notfoundexception);
            }
            return null;
        }
        return ((Uri) (obj));
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        obj = a((Integer)obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return a.a(obj, i, j, ani);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
