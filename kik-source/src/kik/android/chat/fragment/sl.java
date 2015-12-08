// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.ImageButton;
import android.widget.Toast;

// Referenced classes of package kik.android.chat.fragment:
//            sk, sj, ViewPictureFragment

final class sl
    implements Runnable
{

    final sk a;

    sl(sk sk1)
    {
        a = sk1;
        super();
    }

    public final void run()
    {
        Toast.makeText(a.a.b._saveButton.getContext(), a.a.b.getString(0x7f090135), 0).show();
        a.a.b._saveButton.setImageResource(0x7f02024d);
        a.a.b._saveButton.setClickable(false);
    }
}
