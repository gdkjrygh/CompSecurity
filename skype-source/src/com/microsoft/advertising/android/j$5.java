// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            j, e, g

final class b
    implements Runnable
{

    final j a;
    private final List b;

    static j a(b b1)
    {
        return b1.a;
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
                    android.app.tDialog.Builder builder = new android.app.tDialog.Builder(a.getContext());
                    builder.setTitle("Advertisement");
                    builder.setCancelable(true);
                    builder.setItems(acharsequence, new android.content.DialogInterface.OnClickListener(b) {

                        final j._cls5 a;
                        private final List b;

                        public final void onClick(DialogInterface dialoginterface, int k)
                        {
                            ((e)b.get(k)).a(j._cls5.a(a).getContext());
                        }

            
            {
                a = j._cls5.this;
                b = list;
                super();
            }
                    });
                    builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                        final j._cls5 a;

                        public final void onCancel(DialogInterface dialoginterface)
                        {
                        }

            
            {
                a = j._cls5.this;
                super();
            }
                    });
                    j.a(a, builder.show());
                    j.i(a).setCanceledOnTouchOutside(false);
                    return;
                }
                acharsequence[i] = ((e)b.get(i)).toString();
                i++;
            } while (true);
        }
    }

    _cls2.a(j j1, List list)
    {
        a = j1;
        b = list;
        super();
    }
}
