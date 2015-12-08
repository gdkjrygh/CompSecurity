// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.ImageButton;
import android.widget.Toast;

// Referenced classes of package kik.android.chat.fragment:
//            sk, sj, ViewPictureFragment

final class sm
    implements Runnable
{

    final sk a;

    sm(sk sk1)
    {
        a = sk1;
        super();
    }

    public final void run()
    {
        Toast.makeText(a.a.b._saveButton.getContext(), a.a.b.getString(0x7f090204), 0).show();
        a.a.b._saveButton.setClickable(true);
    }
}
