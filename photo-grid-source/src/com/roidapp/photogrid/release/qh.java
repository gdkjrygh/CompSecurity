// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            qg, Preference

final class qh extends BaseAdapter
{

    final Preference a;

    private qh(Preference preference)
    {
        a = preference;
        super();
    }

    qh(Preference preference, byte byte0)
    {
        this(preference);
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final int getCount()
    {
        return 21;
    }

    public final Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = LayoutInflater.from(a).inflate(0x7f030102, null);
        }
        if (viewgroup.getTag() != null)
        {
            view = (qg)viewgroup.getTag();
        } else
        {
            view = new qg();
            view.b = (LinearLayout)viewgroup.findViewById(0x7f0d03fd);
            view.c = (TextView)viewgroup.findViewById(0x7f0d03fe);
            view.a = (LinearLayout)viewgroup.findViewById(0x7f0d03ff);
            view.d = (TextView)viewgroup.findViewById(0x7f0d0401);
            view.e = (TextView)viewgroup.findViewById(0x7f0d0402);
            view.f = (CheckBox)viewgroup.findViewById(0x7f0d0403);
            viewgroup.setTag(view);
        }
        if (!isEnabled(i))
        {
            switch (i)
            {
            default:
                return viewgroup;

            case 0: // '\0'
                ((qg) (view)).b.setVisibility(0);
                ((qg) (view)).c.setText(0x7f070215);
                ((qg) (view)).a.setVisibility(8);
                return viewgroup;

            case 5: // '\005'
                ((qg) (view)).b.setVisibility(0);
                ((qg) (view)).c.setText(0x7f070227);
                ((qg) (view)).a.setVisibility(8);
                return viewgroup;

            case 8: // '\b'
                ((qg) (view)).b.setVisibility(0);
                ((qg) (view)).c.setText(0x7f070228);
                ((qg) (view)).a.setVisibility(8);
                return viewgroup;

            case 10: // '\n'
                ((qg) (view)).b.setVisibility(0);
                ((qg) (view)).c.setText(0x7f070020);
                ((qg) (view)).a.setVisibility(8);
                return viewgroup;

            case 12: // '\f'
                ((qg) (view)).b.setVisibility(0);
                break;
            }
            ((qg) (view)).c.setText(0x7f070216);
            ((qg) (view)).a.setVisibility(8);
            return viewgroup;
        }
        switch (i)
        {
        case 5: // '\005'
        case 8: // '\b'
        case 10: // '\n'
        case 12: // '\f'
        default:
            return viewgroup;

        case 1: // '\001'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f07021f);
            ((qg) (view)).e.setVisibility(8);
            ((qg) (view)).f.setChecked(Preference.v(a));
            ((qg) (view)).f.setVisibility(0);
            return viewgroup;

        case 2: // '\002'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f070199);
            ((qg) (view)).e.setVisibility(0);
            ((qg) (view)).e.setText(0x7f07019a);
            ((qg) (view)).f.setVisibility(8);
            return viewgroup;

        case 3: // '\003'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f070221);
            ((qg) (view)).e.setVisibility(8);
            ((qg) (view)).f.setChecked(Preference.w(a));
            ((qg) (view)).f.setVisibility(0);
            return viewgroup;

        case 4: // '\004'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f07020c);
            ((qg) (view)).e.setVisibility(8);
            ((qg) (view)).f.setChecked(Preference.x(a));
            ((qg) (view)).f.setVisibility(0);
            return viewgroup;

        case 6: // '\006'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f070226);
            ((qg) (view)).e.setVisibility(0);
            ((qg) (view)).e.setText(Preference.y(a));
            ((qg) (view)).f.setVisibility(8);
            return viewgroup;

        case 7: // '\007'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f070223);
            ((qg) (view)).e.setVisibility(8);
            ((qg) (view)).f.setChecked(Preference.z(a));
            ((qg) (view)).f.setVisibility(0);
            return viewgroup;

        case 9: // '\t'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f070229);
            ((qg) (view)).e.setVisibility(8);
            ((qg) (view)).f.setChecked(Preference.A(a));
            ((qg) (view)).f.setVisibility(0);
            return viewgroup;

        case 11: // '\013'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f070020);
            ((qg) (view)).e.setVisibility(0);
            ((qg) (view)).e.setText(0x7f0701b7);
            ((qg) (view)).f.setVisibility(8);
            return viewgroup;

        case 13: // '\r'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f0702fe);
            ((qg) (view)).e.setVisibility(0);
            ((qg) (view)).e.setText(0x7f0702ff);
            ((qg) (view)).f.setVisibility(8);
            return viewgroup;

        case 14: // '\016'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f070218);
            ((qg) (view)).e.setVisibility(0);
            ((qg) (view)).e.setText(0x7f070219);
            ((qg) (view)).f.setVisibility(8);
            return viewgroup;

        case 15: // '\017'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f07021a);
            ((qg) (view)).e.setVisibility(0);
            ((qg) (view)).e.setText(0x7f07021b);
            ((qg) (view)).f.setVisibility(8);
            return viewgroup;

        case 16: // '\020'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f070197);
            ((qg) (view)).e.setVisibility(0);
            ((qg) (view)).e.setText(0x7f070196);
            ((qg) (view)).f.setVisibility(8);
            return viewgroup;

        case 17: // '\021'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f070046);
            ((qg) (view)).e.setVisibility(0);
            ((qg) (view)).e.setText(0x7f070047);
            ((qg) (view)).f.setVisibility(8);
            return viewgroup;

        case 18: // '\022'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f070225);
            ((qg) (view)).e.setVisibility(0);
            ((qg) (view)).e.setText(0x7f070225);
            ((qg) (view)).f.setVisibility(8);
            return viewgroup;

        case 19: // '\023'
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f070149);
            ((qg) (view)).e.setVisibility(0);
            ((qg) (view)).e.setText(0x7f070149);
            ((qg) (view)).f.setVisibility(8);
            return viewgroup;

        case 20: // '\024'
            break;
        }
        if (a.a())
        {
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText((new StringBuilder()).append(a.getString(0x7f07021c)).append(" debug mode").toString());
            ((qg) (view)).e.setText(Preference.B(a));
        } else
        {
            ((qg) (view)).b.setVisibility(8);
            ((qg) (view)).a.setVisibility(0);
            ((qg) (view)).d.setText(0x7f07021c);
            ((qg) (view)).e.setText(Preference.B(a));
        }
        ((qg) (view)).e.setVisibility(0);
        ((qg) (view)).f.setVisibility(8);
        return viewgroup;
    }

    public final boolean isEnabled(int i)
    {
        boolean flag = false;
        switch (i)
        {
        default:
            flag = true;
            // fall through

        case 0: // '\0'
        case 5: // '\005'
        case 8: // '\b'
        case 10: // '\n'
        case 12: // '\f'
            return flag;
        }
    }
}
