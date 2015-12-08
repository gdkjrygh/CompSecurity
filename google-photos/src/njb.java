// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

final class njb extends njc
{

    public int a;
    public String b;
    public boolean c;
    public boolean d;
    private niy h;

    njb(niy niy1)
    {
        h = niy1;
        super(niy1);
    }

    public final int a()
    {
        return 1;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return layoutinflater.inflate(b.Gz, viewgroup, false);
    }

    public final void a(View view, int i)
    {
        View view1;
        View view2;
        int j;
        boolean flag;
        j = 4;
        flag = false;
        view1 = view.findViewById(aa.R);
        view2 = view.findViewById(aa.O);
        view2.setTag(Integer.valueOf(i));
        view2.setOnClickListener(h);
        a;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 177
    //                   1 193
    //                   2 209
    //                   3 225;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_225;
_L6:
        view1 = view.findViewById(aa.T);
        if (c)
        {
            j = 0;
        }
        view1.setVisibility(j);
        view1 = view.findViewById(aa.P);
        if (d)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 8;
        }
        view1.setVisibility(j);
        ((TextView)view.findViewById(aa.Q)).setText(f);
        ((AvatarView)view.findViewById(aa.N)).a(null, g);
        view1.setTag(Integer.valueOf(i));
        view1.setOnClickListener(h);
        return;
_L2:
        view2.setBackgroundDrawable(niy.c());
        view1.setVisibility(4);
          goto _L6
_L3:
        view2.setBackgroundDrawable(niy.d());
        view1.setVisibility(0);
          goto _L6
_L4:
        view2.setBackgroundDrawable(niy.e());
        view1.setVisibility(0);
          goto _L6
        view2.setBackgroundDrawable(niy.f());
        view1.setVisibility(4);
          goto _L6
    }
}
