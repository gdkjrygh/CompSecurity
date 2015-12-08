// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.util.Log;

public final class hbe
    implements hbf
{

    private int a;

    public hbe(hba hba, int i)
    {
        a = i;
        super();
    }

    public final void a(hae hae1)
    {
        int i;
label0:
        {
            i = a;
            hae1 = hae1.a;
            if (!((RecyclerView) (hae1)).j)
            {
                if (((RecyclerView) (hae1)).e != null)
                {
                    break label0;
                }
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            }
            return;
        }
        ((RecyclerView) (hae1)).e.smoothScrollToPosition(hae1, ((RecyclerView) (hae1)).v, i);
    }
}
