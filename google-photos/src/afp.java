// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class afp extends kc
{

    private afo b;

    afp(afo afo1)
    {
        b = afo1;
        super();
    }

    public final void a(View view, pa pa)
    {
        super.a(view, pa);
        if (!b.a() && b.b.e != null)
        {
            b.b.e.onInitializeAccessibilityNodeInfoForItem(view, pa);
        }
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
        {
            return true;
        }
        if (!b.a() && b.b.e != null)
        {
            return b.b.e.performAccessibilityActionForItem(view, i, bundle);
        } else
        {
            return false;
        }
    }
}
