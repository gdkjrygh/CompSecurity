// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;
import com.qihoo.security.locale.widget.AppLabelLocaleTextView;
import com.qihoo.security.widget.ImageView.FlashRemoteImageView;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import java.util.List;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GameBoosterActivity

private class <init> extends BaseAdapter
{

    final GameBoosterActivity a;

    private <init> a(View view)
    {
        ew ew = new <init>(null);
        ew.a = view;
        b(ew, view.findViewById(0x7f0b0109));
        a(ew, (FlashRemoteImageView)a(ew).findViewById(0x7f0b0049));
        a(ew, (AppLabelLocaleTextView)a(ew).findViewById(0x7f0b0136));
        c(ew, a(ew).findViewById(0x7f0b0084));
        d(ew, view.findViewById(0x7f0b010a));
        b(ew, (FlashRemoteImageView)b(ew).findViewById(0x7f0b0049));
        b(ew, (AppLabelLocaleTextView)b(ew).findViewById(0x7f0b0136));
        e(ew, b(ew).findViewById(0x7f0b0084));
        f(ew, view.findViewById(0x7f0b010b));
        c(ew, (FlashRemoteImageView)c(ew).findViewById(0x7f0b0049));
        c(ew, (AppLabelLocaleTextView)c(ew).findViewById(0x7f0b0136));
        g(ew, c(ew).findViewById(0x7f0b0084));
        h(ew, view.findViewById(0x7f0b010c));
        d(ew, (FlashRemoteImageView)d(ew).findViewById(0x7f0b0049));
        d(ew, (AppLabelLocaleTextView)d(ew).findViewById(0x7f0b0136));
        i(ew, d(ew).findViewById(0x7f0b0084));
        a(ew).setOnLongClickListener(a);
        b(ew).setOnLongClickListener(a);
        c(ew).setOnLongClickListener(a);
        d(ew).setOnLongClickListener(a);
        a(ew).setOnClickListener(a);
        b(ew).setOnClickListener(a);
        c(ew).setOnClickListener(a);
        d(ew).setOnClickListener(a);
        return ew;
    }

    private void a(int i, View view)
    {
        a(i).a((a)view.getTag());
    }

    public a a(int i)
    {
        return (a)GameBoosterActivity.d(a).get(i);
    }

    public int getCount()
    {
        return GameBoosterActivity.d(a).size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return a(i).a();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = null;
        if (view != null) goto _L2; else goto _L1
_L1:
        getItemViewType(i);
        JVM INSTR tableswitch 0 10: default 68
    //                   0 83
    //                   1 83
    //                   2 83
    //                   3 106
    //                   4 357
    //                   5 129
    //                   6 257
    //                   7 392
    //                   8 409
    //                   9 426
    //                   10 443;
           goto _L3 _L4 _L4 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
        view = null;
_L14:
        view.setTag(viewgroup);
_L2:
        a(i, view);
        return view;
_L4:
        view = GameBoosterActivity.c(a).inflate(0x7f03004b, null);
        viewgroup = a(view);
        continue; /* Loop/switch isn't completed */
_L5:
        view = GameBoosterActivity.c(a).inflate(0x7f03004c, null);
        viewgroup = a(view);
        continue; /* Loop/switch isn't completed */
_L7:
        view = GameBoosterActivity.c(a).inflate(0x7f03005c, null);
        viewgroup = new <init>(null);
        a(viewgroup, (RemoteImageView)view.findViewById(0x7f0b0141));
        a(viewgroup, (TextView)view.findViewById(0x7f0b0142));
        b(viewgroup, (TextView)view.findViewById(0x7f0b0075));
        a(viewgroup, (RatingBar)view.findViewById(0x7f0b00ad));
        c(viewgroup, (TextView)view.findViewById(0x7f0b0143));
        a(viewgroup, view.findViewById(0x7f0b0084));
        viewgroup.a = view.findViewById(0x7f0b0140);
        ((a) (viewgroup)).a.setOnClickListener(a);
        continue; /* Loop/switch isn't completed */
_L8:
        view = GameBoosterActivity.c(a).inflate(0x7f03005d, null);
        viewgroup = new <init>(null);
        a(viewgroup, (RemoteImageView)view.findViewById(0x7f0b0141));
        a(viewgroup, (TextView)view.findViewById(0x7f0b0142));
        b(viewgroup, (TextView)view.findViewById(0x7f0b0075));
        a(viewgroup, view.findViewById(0x7f0b0084));
        viewgroup.a = view.findViewById(0x7f0b0140);
        ((a) (viewgroup)).a.setOnClickListener(a);
        continue; /* Loop/switch isn't completed */
_L6:
        view = GameBoosterActivity.c(a).inflate(0x7f030061, null);
        viewgroup = new <init>(null);
        b(viewgroup, (TextView)view);
        continue; /* Loop/switch isn't completed */
_L9:
        view = GameBoosterActivity.c(a).inflate(0x7f03005e, null);
        continue; /* Loop/switch isn't completed */
_L10:
        view = GameBoosterActivity.c(a).inflate(0x7f030060, null);
        continue; /* Loop/switch isn't completed */
_L11:
        view = GameBoosterActivity.c(a).inflate(0x7f03005f, null);
        continue; /* Loop/switch isn't completed */
_L12:
        view = new View(a);
        view.setMinimumHeight(1);
        if (true) goto _L14; else goto _L13
_L13:
    }

    public int getViewTypeCount()
    {
        return 12;
    }

    private ew(GameBoosterActivity gameboosteractivity)
    {
        a = gameboosteractivity;
        super();
    }

    a(GameBoosterActivity gameboosteractivity, a a1)
    {
        this(gameboosteractivity);
    }
}
