// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.g;

import android.content.Context;
import android.view.ActionMode;
import android.view.MenuInflater;
import p.h.a;

// Referenced classes of package p.g:
//            d

public class b extends a
{

    final MenuInflater a;
    final ActionMode b;

    public b(Context context, ActionMode actionmode)
    {
        b = actionmode;
        a = new d(context);
    }

    public void a()
    {
        b.finish();
    }
}
