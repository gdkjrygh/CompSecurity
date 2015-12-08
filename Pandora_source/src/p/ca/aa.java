// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pandora.android.util.SearchBox;
import com.pandora.android.util.SearchMusicLayout;
import com.pandora.radio.util.c;

// Referenced classes of package p.ca:
//            k

public class aa extends k
{

    private SearchBox a;
    private TextView b;
    private SearchMusicLayout c;
    private LinearLayout d;
    private boolean e;
    private int f;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener g;

    public aa()
    {
        g = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final aa a;

            public void onGlobalLayout()
            {
                Rect rect = new Rect();
                aa.a(a).getWindowVisibleDisplayFrame(rect);
                if (aa.a(a).getRootView().getHeight() - (rect.bottom - rect.top) > 250)
                {
                    if (!aa.b(a))
                    {
                        aa.a(a, true);
                        p.ca.aa.c(a).setVisibility(8);
                        aa.a(a).setGravity(0);
                    }
                } else
                if (aa.b(a))
                {
                    aa.a(a, false);
                    p.ca.aa.c(a).setVisibility(0);
                    aa.a(a).setGravity(16);
                    return;
                }
            }

            
            {
                a = aa.this;
                super();
            }
        };
    }

    public static Fragment a()
    {
        return new aa();
    }

    static LinearLayout a(aa aa1)
    {
        return aa1.d;
    }

    static boolean a(aa aa1, boolean flag)
    {
        aa1.e = flag;
        return flag;
    }

    static boolean b(aa aa1)
    {
        return aa1.e;
    }

    static TextView c(aa aa1)
    {
        return aa1.b;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreate(bundle);
        layoutinflater = layoutinflater.inflate(0x7f04006b, viewgroup, false);
        d = (LinearLayout)layoutinflater.findViewById(0x7f1001ba);
        viewgroup = getActivity().getWindow();
        f = viewgroup.getAttributes().softInputMode;
        viewgroup.setSoftInputMode(18);
        b = (TextView)d.findViewById(0x7f1001bb);
        a = (SearchBox)d.findViewById(0x7f1001bc);
        c = (SearchMusicLayout)d.findViewById(0x7f100126);
        c.a(a, 0x7f080056, false);
        c.setSearchResultConsumer(new c(null));
        d.getViewTreeObserver().addOnGlobalLayoutListener(g);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        getActivity().getWindow().setSoftInputMode(f);
        d.getViewTreeObserver().removeGlobalOnLayoutListener(g);
        super.onDestroyView();
    }
}
