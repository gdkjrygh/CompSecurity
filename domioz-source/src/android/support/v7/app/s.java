// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.c.a;
import android.support.v7.internal.view.d;
import android.support.v7.internal.view.e;
import android.view.ActionMode;

// Referenced classes of package android.support.v7.app:
//            p, r, AppCompatDelegateImplV7, y, 
//            ActionBar

final class s extends p
{

    final r b;

    s(r r1, android.view.Window.Callback callback)
    {
        b = r1;
        super(r1, callback);
    }

    public final ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        if (android.support.v7.app.r.a(b))
        {
            callback = new e(b.a, callback);
            Object obj = b;
            if (((AppCompatDelegateImplV7) (obj)).j != null)
            {
                ((AppCompatDelegateImplV7) (obj)).j.c();
            }
            y y1 = new y(((AppCompatDelegateImplV7) (obj)), callback);
            ActionBar actionbar = ((AppCompatDelegateImplV7) (obj)).a();
            if (actionbar != null)
            {
                obj.j = actionbar.a(y1);
            }
            if (((AppCompatDelegateImplV7) (obj)).j == null)
            {
                obj.j = ((AppCompatDelegateImplV7) (obj)).a(y1);
            }
            obj = ((AppCompatDelegateImplV7) (obj)).j;
            if (obj != null)
            {
                obj = new d(b.a, ((a) (obj)));
                callback.a(((d) (obj)));
                return ((ActionMode) (obj));
            } else
            {
                return null;
            }
        } else
        {
            return super.onWindowStartingActionMode(callback);
        }
    }
}
