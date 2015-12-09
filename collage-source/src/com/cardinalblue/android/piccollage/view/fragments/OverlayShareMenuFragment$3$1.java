// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.text.TextUtils;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.e;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class a
    implements i
{

    final a a;

    public Void a(j j1)
        throws Exception
    {
        new e(a.a.getActivity());
        StringBuilder stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(OverlayShareMenuFragment.d(a.a)))
        {
            stringbuilder.append(OverlayShareMenuFragment.d(a.a)).append(" ");
        }
        stringbuilder.append("#piccollage");
        j1 = e.a(OverlayShareMenuFragment.f(a.a), (File)j1.e());
        j1.putExtra("android.intent.extra.TEXT", stringbuilder.toString());
        a.a.startActivityForResult(j1, 115);
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/view/fragments/OverlayShareMenuFragment$3

/* anonymous class */
    class OverlayShareMenuFragment._cls3
        implements i
    {

        final OverlayShareMenuFragment a;

        public Void a(j j1)
            throws Exception
        {
            k.a(a.getActivity(), new OverlayShareMenuFragment._cls3._cls2(j1), a.getString(0x7f070277)).c(new OverlayShareMenuFragment._cls3._cls1(this), j.b);
            return null;
        }

        public Object then(j j1)
            throws Exception
        {
            return a(j1);
        }

            
            {
                a = overlaysharemenufragment;
                super();
            }

        // Unreferenced inner class com/cardinalblue/android/piccollage/view/fragments/OverlayShareMenuFragment$3$2

/* anonymous class */
        class OverlayShareMenuFragment._cls3._cls2
            implements Callable
        {

            final j a;
            final OverlayShareMenuFragment._cls3 b;

            public File a()
                throws Exception
            {
                File file = com.cardinalblue.android.piccollage.model.k.b((File)a.e(), b.a.getActivity());
                if (file == null || !file.exists())
                {
                    throw new IOException((new StringBuilder()).append("fail to copy file to cache : ").append(file).toString());
                } else
                {
                    OverlayShareMenuFragment.c(b.a);
                    return file;
                }
            }

            public Object call()
                throws Exception
            {
                return a();
            }

                    
                    {
                        b = OverlayShareMenuFragment._cls3.this;
                        a = j1;
                        super();
                    }
        }

    }

}
