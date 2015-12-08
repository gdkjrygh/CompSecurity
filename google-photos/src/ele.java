// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

public final class ele extends mtf
{

    private final ekq a;
    private final ekw b;
    private final ekk c;

    public ele(ekq ekq1, ekw ekw, ekk ekk, int i)
    {
        this(ekq1, ekw, ekk, a(i));
    }

    public ele(ekq ekq1, ekw ekw, ekk ekk, String s)
    {
        super(s);
        a = ekq1;
        b = ekw;
        c = ekk;
    }

    public static String a(int i)
    {
        String s = String.valueOf("CoreMediaLoadTask:");
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }

    protected final mue a(Context context)
    {
        Object obj = (elw)olm.a(context, elw);
        try
        {
            context = new ArrayList();
            context.addAll((Collection)((ekv)((elw) (obj)).a(a.a())).a(a, b, c).a());
            obj = new mue(true);
            ((mue) (obj)).a().putParcelableArrayList("com.google.android.apps.photos.core.media_list", context);
            ((mue) (obj)).a().putParcelable("com.google.android.apps.photos.core.media_collection", a);
            ((mue) (obj)).a().putParcelable("com.google.android.apps.photos.core.query_options", b);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return ((mue) (obj));
    }
}
