// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class nui extends mtf
{

    public int a;
    private final int b;
    private final String c = null;
    private final String j;
    private final String k;
    private final nul l;

    private nui(Context context, int i, String s, String s1, String s2, nul nul1)
    {
        super(context, "CopyPhotosToAlbumTask");
        b = i;
        j = s1;
        k = s2;
        l = nul1;
    }

    public static nui a(Context context, int i, String s, nul nul1)
    {
        p.a(s, "newAlbumTitle must not be empty");
        return new nui(context, i, null, null, s, nul1);
    }

    public static nui b(Context context, int i, String s, nul nul1)
    {
        p.a(s, "albumMediaKey must not be empty");
        return new nui(context, i, null, s, null, nul1);
    }

    private boolean f()
    {
        return !TextUtils.isEmpty(c);
    }

    protected final mue a()
    {
        boolean flag = true;
        Object obj = d();
        Object obj1 = (nxv)olm.a(((Context) (obj)), nxv);
        boolean flag1;
        if (!f())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (j != null)
        {
            ArrayList arraylist = new ArrayList();
            Object obj2 = l;
            d();
            obj2 = ((nul) (obj2)).a().iterator();
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                num num1 = (num)((Iterator) (obj2)).next();
                if (num1.a())
                {
                    arraylist.add(num1.b());
                }
            } while (true);
            obj = new nuk(((Context) (obj)), b);
            obj.a = j;
            obj.b = k;
            obj.c = arraylist;
            obj.d = a;
            obj = ((nuk) (obj)).a();
        } else
        {
            ArrayList arraylist1 = new ArrayList();
            Object obj3 = l;
            d();
            obj3 = ((nul) (obj3)).a().iterator();
            do
            {
                if (!((Iterator) (obj3)).hasNext())
                {
                    break;
                }
                num num2 = (num)((Iterator) (obj3)).next();
                if (num2.d())
                {
                    arraylist1.add(Long.toString(num2.c()));
                }
            } while (true);
            obj = new nuj(((Context) (obj)), b, c, k, arraylist1, a);
        }
        ((nxv) (obj1)).a(((nxx) (obj)));
        if (((nuj) (obj)).l())
        {
            return new mue(((nxx) (obj)).l, ((nxx) (obj)).n, null);
        }
        obj1 = new mue(true);
        Bundle bundle = ((mue) (obj1)).a();
        int i;
        if (((nuj) (obj)).a == null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (((nuj) (obj)).b != null)
        {
            flag = false;
        }
        p.a(i ^ flag, "Exactly one of legacyPhotoIds and mediaKeys must be set.");
        if (((nuj) (obj)).a != null)
        {
            i = ((nuj) (obj)).a.size();
        } else
        {
            i = ((nuj) (obj)).b.size();
        }
        obj = ((nuj) (obj)).e;
        bundle.putBoolean("is_new_album", flag1);
        bundle.putInt("num_photos_added", i);
        bundle.putString("media_key", ((qfz) (obj)).a.a);
        return ((mue) (obj1));
    }

    public final String e()
    {
        Context context = d();
        int i;
        if (f())
        {
            i = b.GS;
        } else
        {
            i = b.GT;
        }
        return context.getString(i);
    }
}
