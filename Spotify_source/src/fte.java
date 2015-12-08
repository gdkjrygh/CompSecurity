// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.android.paste.widget.NavigationItemView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class fte extends ArrayAdapter
{

    private ftc a;

    public fte(Context context, ftc ftc1)
    {
        super(context, 0);
        a = ftc1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = null;
        if (view instanceof NavigationItemView)
        {
            viewgroup = (NavigationItemView)view;
        }
        if (viewgroup == null) goto _L2; else goto _L1
_L1:
        view = a;
        if (viewgroup == null) goto _L4; else goto _L3
_L3:
        int j;
        if (((Boolean)((ftc) (view)).a.a(fys.y)).booleanValue())
        {
            j = 0x7f1100cf;
        } else
        {
            j = 0x7f1100ce;
        }
        if (j == viewgroup.b()) goto _L4; else goto _L5
_L5:
        j = 1;
_L6:
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_251;
        }
_L2:
        view = a;
        viewgroup = getContext();
        if (((Boolean)((ftc) (view)).a.a(fys.y)).booleanValue())
        {
            view = NavigationItemView.a(viewgroup).b(0x7f1100cf);
        } else
        {
            view = (new NavigationItemView(viewgroup)).b(0x7f1100ce);
        }
_L7:
        viewgroup = (ftd)getItem(i);
        view.a();
        view.setId(((ftd) (viewgroup)).a);
        if (((ftd) (viewgroup)).j)
        {
            view.a(((ftd) (viewgroup)).c);
        }
        if (((ftd) (viewgroup)).i)
        {
            view.a(getContext().getString(((ftd) (viewgroup)).g));
        }
        view.a(((ftd) (viewgroup)).d);
        if (((ftd) (viewgroup)).h && ((ftd) (viewgroup)).k > 0 && ((ftd) (viewgroup)).b == com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.g)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            view.a(((ftd) (viewgroup)).k);
        }
        return view;
_L4:
        j = 0;
          goto _L6
        view = viewgroup;
          goto _L7
    }
}
