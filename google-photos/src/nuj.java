// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class nuj extends nzc
{

    Collection a;
    Collection b;
    public List c;
    public List d;
    qfz e;
    private final String r;
    private final int s;
    private String t;
    private String u;

    nuj(Context context, int i, String s1, String s2, String s3, Collection collection, Collection collection1, 
            int j)
    {
        super(context, new nyg(context, i), "copyphotosbyshare", new pan(), new pao());
        String s4;
        String s5;
        boolean flag;
        boolean flag1;
        if (TextUtils.isEmpty(s1) == TextUtils.isEmpty(s2))
        {
            if (TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s3))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        } else
        {
            flag1 = TextUtils.isEmpty(s3);
        }
        context = String.valueOf("Exactly one of legacyAlbumId, album media key, or albumTitle must be set. Set legacyAlbumId/album media key if we're copying to an existing album. Set albumTitle if we're copying to a new album.\nAlbum ID: ");
        p.a(flag1, (new StringBuilder(String.valueOf(context).length() + 32 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(context).append(s1).append("\nAlbum media key: ").append(s2).append("\nAlbum title: ").append(s3).toString());
        if (collection1 == null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (collection == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = String.valueOf("Exactly one of legacyPhotoIds or mediaKeys must be set.\nPhoto IDs: ");
        s4 = String.valueOf(collection1);
        s5 = String.valueOf(collection);
        p.a(flag ^ i, (new StringBuilder(String.valueOf(context).length() + 13 + String.valueOf(s4).length() + String.valueOf(s5).length())).append(context).append(s4).append("\nMedia keys: ").append(s5).toString());
        t = s1;
        u = s2;
        r = s3;
        b = collection;
        a = collection1;
        s = j;
    }

    public nuj(Context context, int i, String s1, String s2, Collection collection, int j)
    {
        this(context, i, s1, null, s2, null, collection, j);
    }

    protected final void a(qlw qlw)
    {
        qlw = (pan)qlw;
        qlw.a = new pje();
        qlw = ((pan) (qlw)).a;
        if (TextUtils.isEmpty(t) && TextUtils.isEmpty(u))
        {
            qlw.g = r;
        } else
        {
            qlw.c = t;
            qlw.d = u;
        }
        if (a != null)
        {
            qlw.a = (String[])a.toArray(new String[a.size()]);
        } else
        {
            qlw.b = (String[])b.toArray(new String[b.size()]);
        }
        qlw.i = new qga();
        if (s == nuh.b)
        {
            qlw.f = 3;
            qlw.k = Boolean.valueOf(true);
        } else
        if (s == nuh.a)
        {
            qlw.f = 1;
            return;
        }
    }

    protected final void b(qlw qlw)
    {
        qlw = ((pao)qlw).a;
        if (TextUtils.isEmpty(t))
        {
            t = ((pjf) (qlw)).a;
        }
        c = Arrays.asList(((pjf) (qlw)).b);
        e = ((pjf) (qlw)).d;
        if (((pjf) (qlw)).c != null)
        {
            d = Arrays.asList(((pjf) (qlw)).c);
        }
    }
}
