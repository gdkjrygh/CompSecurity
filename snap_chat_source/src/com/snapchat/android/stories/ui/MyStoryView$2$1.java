// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import Em;
import PI;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.snapchat.android.notification.AndroidNotificationManager;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.stories.ui:
//            MyStoryView

final class a
    implements 
{

    private ationManager.a a;

    public final void a()
    {
        MyStoryView.f(a.a).a(0);
        MyStoryView.g(a.a).setVisibility(8);
        String s = MyStoryView.a(a.a).getResources().getString(0x7f080224);
        MyStoryView.c(a.a).a(MyStoryView.a(s, 0xff000000));
    }

    public final void b()
    {
        MyStoryView.f(a.a).a(8);
        MyStoryView.g(a.a).setVisibility(0);
    }

    public final void c()
    {
        String s = MyStoryView.a(a.a).getResources().getString(0x7f080228);
        MyStoryView.c(a.a).a(MyStoryView.a(s, 0xff000000));
    }

    public final void d()
    {
        String s = MyStoryView.a(a.a).getResources().getString(0x7f080223);
        MyStoryView.c(a.a).a(MyStoryView.a(s, AndroidNotificationManager.a));
    }

    ationManager(ationManager ationmanager)
    {
        a = ationmanager;
        super();
    }

    // Unreferenced inner class com/snapchat/android/stories/ui/MyStoryView$2

/* anonymous class */
    final class MyStoryView._cls2
        implements android.view.View.OnClickListener
    {

        final MyStoryView a;

        public final void onClick(View view)
        {
            MyStoryView.e(a).b(MyStoryView.b(a), new MyStoryView._cls2._cls1(this));
        }

            
            {
                a = mystoryview;
                super();
            }
    }

}
