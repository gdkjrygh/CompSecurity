// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ActionMode;

class ta extends sx
{

    private sz a;

    ta(sz sz1, android.view.Window.Callback callback)
    {
        a = sz1;
        super(sz1, callback);
    }

    final ActionMode a(android.view.ActionMode.Callback callback)
    {
        callback = new vf(a.a, callback);
        aav aav = a.a(callback);
        if (aav != null)
        {
            return callback.b(aav);
        } else
        {
            return null;
        }
    }

    public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        if (a.o)
        {
            return a(callback);
        } else
        {
            return super.onWindowStartingActionMode(callback);
        }
    }
}
