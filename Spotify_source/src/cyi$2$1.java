// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.mixpanel.android.surveys.CardCarouselLayout;

final class g.Object
    implements Runnable
{

    private String a;
    private g.String b;

    public final void run()
    {
        CardCarouselLayout.a(b.b.c).a(b.b.a, a);
    }

    g.String( , String s)
    {
        b = ;
        a = s;
        super();
    }

    // Unreferenced inner class cyi$2

/* anonymous class */
    final class cyi._cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final cyi a;

        public final void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (CardCarouselLayout.a(a.c) != null)
            {
                adapterview = adapterview.getItemAtPosition(i).toString();
                a.c.postDelayed(new cyi._cls2._cls1(this, adapterview), 165L);
            }
        }

            
            {
                a = cyi1;
                super();
            }
    }

}
