// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;

public class cal extends mtf
{

    public static final String a = cal.getSimpleName();
    private final noj b;
    private final int c;
    private final String j;
    private final Uri k;

    public cal(noj noj1, int i, String s, Uri uri)
    {
        super(a);
        b = (noj)b.a(noj1, "provider", null);
        c = i;
        j = (String)b.a(s, "mediaKey", null);
        k = (Uri)b.a(uri, "video", null);
    }

    public static Parcelable a(String s, mue mue1)
    {
        if (!a.equals(s) || mue1.c())
        {
            return null;
        } else
        {
            return mue1.a().getParcelable("media");
        }
    }

    protected final mue a(Context context)
    {
        b.a(j, k);
        context = b.a(context, c, j);
        mue mue1 = new mue(true);
        mue1.a().putParcelable("media", context);
        return mue1;
    }

}
