// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class ffw
{

    public static final ffv a = new ffv(null, null, 0, 0, 0, false, false, false, "", 0);

    public ffw()
    {
    }

    public static ffv a(String s, com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType searchtype, int i, int j, boolean flag, boolean flag1, boolean flag2, String s1, 
            int k)
    {
        if (TextUtils.isEmpty(s))
        {
            return a;
        } else
        {
            return new ffv(s, searchtype, i, j, 4, flag, flag1, flag2, s1, k);
        }
    }

}
