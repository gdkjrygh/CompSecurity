// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.View;
import com.snapchat.android.Timber;

final class lang.Object
    implements android.view.OnClickListener
{

    private yv a;
    private yw b;

    public final void onClick(View view)
    {
        if (TextUtils.equals(a.c, Bt.r()))
        {
            view = b;
            SN sn = a.a;
            if (TextUtils.equals(sn.a(), Bt.r()))
            {
                Timber.e("CollaboratorNameHolder", "Cannot remove story owner as collaborator from official MyStory", new Object[0]);
                return;
            } else
            {
                Gc gc = new Gc(((yw) (view)).l.getContext());
                gc.h = IC.a(0x7f0801b4, new Object[] {
                    sn.b()
                });
                gc.a(0x7f0801b6, new <init>(view, sn)).b(0x7f0801b5, null).b();
                return;
            }
        }
        view = b;
        String s = a.c;
        if (TextUtils.equals(s, Bt.r()))
        {
            Timber.e("CollaboratorNameHolder", "Cannot remove story owner as collaborator from official MyStory", new Object[0]);
            return;
        } else
        {
            Gc gc1 = new Gc(((yw) (view)).l.getContext());
            gc1.g = IC.a(0x7f0801bb, new Object[0]);
            gc1.b(0x7f0801ba).a(0x7f0801b6, new <init>(view, s)).b(0x7f0801b5, null).b();
            return;
        }
    }

    >(yw yw1, yv yv1)
    {
        b = yw1;
        a = yv1;
        super();
    }
}
