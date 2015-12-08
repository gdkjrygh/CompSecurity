// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            e, j, g

final class b
    implements android.content.Interface.OnClickListener
{

    final ontext a;
    private final List b;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ((e)b.get(i)).a(b(a).getContext());
    }

    a(a a1, List list)
    {
        a = a1;
        b = list;
        super();
    }

    // Unreferenced inner class com/microsoft/advertising/android/j$5

/* anonymous class */
    final class j._cls5
        implements Runnable
    {

        final j a;
        private final List b;

        static j a(j._cls5 _pcls5)
        {
            return _pcls5.a;
        }

        public final void run()
        {
            if (b.size() == 1)
            {
                ((e)b.get(0)).a(a.getContext());
                j.f(a).l();
            } else
            if (b.size() > 1)
            {
                CharSequence acharsequence[] = new CharSequence[b.size()];
                int i = 0;
                do
                {
                    if (i >= b.size())
                    {
                        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a.getContext());
                        builder.setTitle("Advertisement");
                        builder.setCancelable(true);
                        builder.setItems(acharsequence, new j._cls5._cls1(this, b));
                        builder.setOnCancelListener(new j._cls5._cls2());
                        j.a(a, builder.show());
                        j.i(a).setCanceledOnTouchOutside(false);
                        return;
                    }
                    acharsequence[i] = ((e)b.get(i)).toString();
                    i++;
                } while (true);
            }
        }

            
            {
                a = j1;
                b = list;
                super();
            }

        // Unreferenced inner class com/microsoft/advertising/android/j$5$2

/* anonymous class */
        final class j._cls5._cls2
            implements android.content.DialogInterface.OnCancelListener
        {

            final j._cls5 a;

            public final void onCancel(DialogInterface dialoginterface)
            {
            }

                    
                    {
                        a = j._cls5.this;
                        super();
                    }
        }

    }

}
