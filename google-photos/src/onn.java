// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

final class onn
    implements oof, oog, opv
{

    private final Activity a;

    public onn(Activity activity, opd opd1)
    {
        a = activity;
        opd1.a(this);
    }

    public final boolean a(int i)
    {
        return i == 82;
    }

    public final boolean b(int i)
    {
        if (i == 82)
        {
            a.openOptionsMenu();
            return true;
        } else
        {
            return false;
        }
    }
}
