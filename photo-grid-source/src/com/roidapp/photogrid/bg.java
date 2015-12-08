// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid:
//            ba, bf

final class bg extends BaseAdapter
{

    bf a;
    final ba b;
    private LayoutInflater c;

    public bg(ba ba1, Context context)
    {
        b = ba1;
        super();
        c = LayoutInflater.from(context);
    }

    public final int getCount()
    {
        byte byte0;
        byte byte1;
        byte1 = 7;
        byte0 = byte1;
        if (!ba.a(b)) goto _L2; else goto _L1
_L1:
        if (ba.d(b) == 1 || ba.e(b) == 1) goto _L4; else goto _L3
_L3:
        byte0 = 8;
_L2:
        return byte0;
_L4:
        if (ba.d(b) == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = byte1;
        if (ba.e(b) == 1) goto _L2; else goto _L5
_L5:
        return ba.d(b) != 1 || ba.e(b) == 1 ? 0 : 9;
    }

    public final Object getItem(int i)
    {
        return null;
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = c.inflate(0x7f0300fc, null);
        }
        if (viewgroup.getTag() != null)
        {
            a = (bf)viewgroup.getTag();
        } else
        {
            a = new bf();
            a.a = (TextView)viewgroup.findViewById(0x7f0d03f7);
            a.b = (ImageView)viewgroup.findViewById(0x7f0d03f8);
            viewgroup.setTag(a);
        }
        if (ba.g(b))
        {
            switch (i)
            {
            default:
                return viewgroup;

            case 0: // '\0'
                a.a.setText(ba.h(b)[0]);
                a.b.setVisibility(8);
                return viewgroup;

            case 1: // '\001'
                a.a.setText(ba.h(b)[1]);
                a.b.setVisibility(8);
                return viewgroup;

            case 2: // '\002'
                a.a.setText(ba.h(b)[2]);
                a.b.setVisibility(8);
                return viewgroup;

            case 3: // '\003'
                a.a.setText(ba.h(b)[3]);
                a.b.setVisibility(8);
                return viewgroup;

            case 4: // '\004'
                a.a.setText(ba.h(b)[4]);
                a.b.setVisibility(8);
                return viewgroup;

            case 5: // '\005'
                a.a.setText(ba.h(b)[5]);
                if (ba.i(b))
                {
                    a.b.setVisibility(0);
                    return viewgroup;
                } else
                {
                    a.b.setVisibility(8);
                    return viewgroup;
                }

            case 6: // '\006'
                a.a.setText(ba.h(b)[6]);
                a.b.setVisibility(8);
                return viewgroup;

            case 7: // '\007'
                a.a.setText(ba.h(b)[7]);
                a.b.setVisibility(8);
                return viewgroup;

            case 8: // '\b'
                a.a.setText(ba.h(b)[8]);
                a.b.setVisibility(8);
                return viewgroup;

            case 9: // '\t'
                a.a.setText(ba.h(b)[9]);
                a.b.setVisibility(8);
                return viewgroup;
            }
        }
        switch (i)
        {
        default:
            return viewgroup;

        case 0: // '\0'
            a.a.setText(ba.h(b)[0]);
            return viewgroup;

        case 1: // '\001'
            a.a.setText(ba.h(b)[1]);
            return viewgroup;

        case 2: // '\002'
            a.a.setText(ba.h(b)[4]);
            return viewgroup;

        case 3: // '\003'
            a.a.setText(ba.h(b)[5]);
            return viewgroup;

        case 4: // '\004'
            a.a.setText(ba.h(b)[6]);
            return viewgroup;

        case 5: // '\005'
            a.a.setText(ba.h(b)[7]);
            break;
        }
        return viewgroup;
    }
}
