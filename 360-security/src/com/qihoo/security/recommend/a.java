// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.recommend;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.qihoo.security.widget.RatioImageView;

// Referenced classes of package com.qihoo.security.recommend:
//            RecommendHelper

public class com.qihoo.security.recommend.a
{
    public static interface a
    {

        public abstract void a(RecommendHelper.RecommendType recommendtype);

        public abstract void b(RecommendHelper.RecommendType recommendtype);
    }


    private a a;
    private View b;
    private RatioImageView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private RecommendHelper.RecommendType h;
    private Context i;
    private boolean j;

    public com.qihoo.security.recommend.a()
    {
    }

    static a a(com.qihoo.security.recommend.a a1)
    {
        return a1.a;
    }

    static RecommendHelper.RecommendType b(com.qihoo.security.recommend.a a1)
    {
        return a1.h;
    }

    public void a(View view)
    {
        b = view;
        c = (RatioImageView)b.findViewById(0x7f0b021a);
        d = (TextView)b.findViewById(0x7f0b021b);
        e = (TextView)b.findViewById(0x7f0b021d);
        f = (TextView)b.findViewById(0x7f0b021c);
        g = (TextView)b.findViewById(0x7f0b021e);
        i = b.getContext();
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final com.qihoo.security.recommend.a a;

            public void onClick(View view1)
            {
                if (com.qihoo.security.recommend.a.a(a) != null)
                {
                    com.qihoo.security.recommend.a.a(a).b(com.qihoo.security.recommend.a.b(a));
                }
                RecommendHelper.a().b(com.qihoo.security.recommend.a.b(a));
            }

            
            {
                a = com.qihoo.security.recommend.a.this;
                super();
            }
        });
        e.setOnClickListener(new android.view.View.OnClickListener() {

            final com.qihoo.security.recommend.a a;

            public void onClick(View view1)
            {
                RecommendHelper.a().b(com.qihoo.security.recommend.a.b(a));
                if (com.qihoo.security.recommend.a.a(a) != null)
                {
                    com.qihoo.security.recommend.a.a(a).a(com.qihoo.security.recommend.a.b(a));
                }
            }

            
            {
                a = com.qihoo.security.recommend.a.this;
                super();
            }
        });
    }

    public void a(RecommendHelper.RecommendType recommendtype, String s)
    {
        h = recommendtype;
        c.setImageResource(h.iconRes);
        d.setText(h.titleRes);
        f.setText(s);
        g.setText(h.okRes);
    }

    public void a(a a1)
    {
        a = a1;
    }

    public void a(boolean flag)
    {
        j = flag;
    }

    public boolean a()
    {
        return j;
    }
}
