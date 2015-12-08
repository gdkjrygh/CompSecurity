// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;

final class hbb
    implements hbf
{

    hbb(hba hba)
    {
    }

    public final void a(hae hae1)
    {
        if (hae1.a != null && ((RecyclerView) (hae1.a)).d == null)
        {
            hae1.a.a(hae1.b);
            if (hae1.c != null)
            {
                hae1.c.b();
            }
        }
    }
}
