// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.util.bf;
import kik.android.util.p;

// Referenced classes of package kik.android.chat.fragment:
//            KikPreferenceLaunchpad, ProgressDialogFragment

final class nv extends bf
{

    final byte a[];
    final KikPreferenceLaunchpad b;

    nv(KikPreferenceLaunchpad kikpreferencelaunchpad, byte abyte0[])
    {
        b = kikpreferencelaunchpad;
        a = abyte0;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        p.a().a(b.getActivity(), a);
        return null;
    }

    protected final void onPostExecute(Object obj)
    {
        b.a.dismiss();
        b.a = null;
    }
}
