// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            do, cy, bp

final class dc
    implements do
{

    cy a;

    dc(cy cy1)
    {
        a = cy1;
    }

    public final void a(View view)
    {
        if (cy.d(a) >= 0)
        {
            bp.a(view, 2, null);
        }
        if (cy.a(a) != null)
        {
            cy.a(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof do)
        {
            obj = (do)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((do) (obj)).a(view);
        }
    }

    public final void b(View view)
    {
        if (cy.d(a) >= 0)
        {
            bp.a(view, cy.d(a), null);
            cy.c(a);
        }
        if (cy.b(a) != null)
        {
            cy.b(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof do)
        {
            obj = (do)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((do) (obj)).b(view);
        }
    }

    public final void c(View view)
    {
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof do)
        {
            obj = (do)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((do) (obj)).c(view);
        }
    }
}
