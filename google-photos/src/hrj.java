// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.search.SearchActivity;

public final class hrj
    implements ojl
{

    private SearchActivity a;

    public hrj(SearchActivity searchactivity)
    {
        a = searchactivity;
        super();
    }

    public final void a(ojm ojm1)
    {
    }

    public final void b(ojm ojm1)
    {
        if (ojm1 == ojm.b)
        {
            a.setResult(0);
            a.finish();
        }
    }
}
