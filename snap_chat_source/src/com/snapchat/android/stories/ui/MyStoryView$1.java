// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import Em;
import Ge;
import Og;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.notification.AndroidNotificationManager;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.stories.ui:
//            MyStoryView

final class a
    implements android.view.stener
{

    final MyStoryView a;

    public final void onClick(View view)
    {
        Object obj = SnapchatApplication.get().getResources();
        view = ((Resources) (obj)).getString(0x7f0800f9);
        String s = ((Resources) (obj)).getString(0x7f0800fb);
        obj = ((Resources) (obj)).getString(0x7f08007f);
        (new Ge(MyStoryView.a(a), view, s, ((String) (obj))) {

            final MyStoryView._cls1 a;

            protected final void a()
            {
                MyStoryView.e(a.a).a(MyStoryView.b(a.a), new Em.a(this) {

                    private _cls1 a;

                    public final void a()
                    {
                        String s = MyStoryView.a(a.a.a).getResources().getString(0x7f0800f8);
                        MyStoryView.c(a.a.a).a(MyStoryView.a(s, 0xff000000));
                    }

                    public final void b()
                    {
                    }

                    public final void c()
                    {
                        String s = MyStoryView.a(a.a.a).getResources().getString(0x7f0800fa);
                        MyStoryView.c(a.a.a).a(MyStoryView.a(s, 0xff000000));
                        MyStoryView.d(a.a.a).c();
                    }

                    public final void d()
                    {
                        String s = MyStoryView.a(a.a.a).getResources().getString(0x7f0800f6);
                        MyStoryView.c(a.a.a).a(MyStoryView.a(s, AndroidNotificationManager.a));
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                MyStoryView.c(a.a).a(new Og(false));
            }

            protected final void b()
            {
                MyStoryView.c(a.a).a(new Og(false));
            }

            public final void cancel()
            {
                super.cancel();
                MyStoryView.c(a.a).a(new Og(false));
            }

            
            {
                a = MyStoryView._cls1.this;
                super(context, s, s1, s2);
            }
        }).show();
    }

    _cls1.a(MyStoryView mystoryview)
    {
        a = mystoryview;
        super();
    }
}
