// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//            db, dl, cy, do

class de extends db
{

    de()
    {
    }

    public final void a(cy cy, View view, do do1)
    {
        if (do1 != null)
        {
            view.animate().setListener(new dl(do1, view));
            return;
        } else
        {
            view.animate().setListener(null);
            return;
        }
    }
}
