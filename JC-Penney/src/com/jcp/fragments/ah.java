// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.jcp.activities.MainActivity;
import com.jcp.adapters.aw;
import com.jcp.productcategories.modal.Modal;
import com.jcp.util.bt;
import com.jcp.util.g;
import com.jcp.views.ExpandableHeightGridView;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            s

public class ah extends s
    implements android.widget.AdapterView.OnItemClickListener
{

    private List a;

    public ah()
    {
    }

    protected String T()
    {
        return "Mobile|Welcome";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030066, viewgroup, false);
    }

    protected String a()
    {
        return "Welcome";
    }

    public void a(View view, Bundle bundle)
    {
        view = (ExpandableHeightGridView)view.findViewById(0x7f0e026b);
        view.setExpanded(true);
        i().findViewById(0x7f0e0164).setVisibility(0);
        a = g.a().a("depth0");
        view.setAdapter(new aw(i(), a));
        view.setOnItemClickListener(this);
    }

    public void b()
    {
        a(true);
        a(j().getString(0x7f070165));
        super.b();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (Modal)a.get(i);
        if (adapterview != null)
        {
            view = i();
            if (bt.a(view))
            {
                ((MainActivity)view).a(adapterview.getId(), adapterview.getName());
            }
        }
    }
}
