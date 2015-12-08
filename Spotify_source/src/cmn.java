// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.WeakReference;

final class cmn extends cmt
{

    private WeakReference a;

    cmn(cmk cmk1)
    {
        a = new WeakReference(cmk1);
    }

    public final void a()
    {
        cmk cmk1 = (cmk)a.get();
        if (cmk1 == null)
        {
            return;
        } else
        {
            cmk.a(cmk1);
            return;
        }
    }
}
