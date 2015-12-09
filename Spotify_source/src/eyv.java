// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.widget.Button;
import android.widget.LinearLayout;
import com.spotify.android.paste.widget.StickyRecyclerView;
import com.spotify.mobile.android.spotlets.party.view.ModeTunerView;
import java.util.Locale;

public final class eyv
{

    public ModeTunerView a;
    private final StickyRecyclerView b;
    private Button c;

    public eyv(StickyRecyclerView stickyrecyclerview, eyx eyx, android.view.View.OnClickListener onclicklistener)
    {
        b = stickyrecyclerview;
        Object obj = b.getContext();
        stickyrecyclerview = new LinearLayout(((Context) (obj)));
        stickyrecyclerview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        stickyrecyclerview.setOrientation(1);
        stickyrecyclerview.setGravity(1);
        stickyrecyclerview.setBackgroundColor(0xff110033);
        Resources resources = ((Context) (obj)).getResources();
        int i = resources.getDimensionPixelSize(0x7f0c0117);
        int j = resources.getDimensionPixelSize(0x7f0c0103);
        int k = resources.getDimensionPixelSize(0x7f0c0104);
        a = new ModeTunerView(((Context) (obj)));
        a.b = k;
        Object obj1 = a;
        obj1.c = resources.getText(0x7f0803b4).toString().toUpperCase(Locale.getDefault());
        ((ModeTunerView) (obj1)).invalidate();
        obj1 = new android.widget.LinearLayout.LayoutParams(i, j);
        a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        stickyrecyclerview.addView(a);
        c = dgp.b(((Context) (obj)), stickyrecyclerview);
        obj = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj.gravity = 1;
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(0, resources.getDimensionPixelOffset(0x7f0c011a), 0, resources.getDimensionPixelOffset(0x7f0c0119));
        c.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        c.setText(resources.getText(0x7f0803b5).toString().toUpperCase(Locale.getDefault()));
        stickyrecyclerview.addView(c);
        b.c(-k);
        b.a(new dgw() {

            private eyv a;

            public final void a(int l, float f)
            {
                ModeTunerView modetunerview = a.a;
                modetunerview.g = f;
                modetunerview.invalidate();
            }

            
            {
                a = eyv.this;
                super();
            }
        });
        b.a(stickyrecyclerview);
        b.b(a);
        b.b();
        a.d = eyx;
        c.setOnClickListener(onclicklistener);
    }
}
