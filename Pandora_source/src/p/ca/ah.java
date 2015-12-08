// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.pandora.radio.data.ArtistSearchData;
import java.util.Iterator;
import java.util.List;

public class ah extends ArrayAdapter
{

    public ah(Context context)
    {
        super(context, 0x7f040071, 0x1020014);
    }

    private void b(List list)
    {
        for (list = list.iterator(); list.hasNext(); add((ArtistSearchData)list.next())) { }
    }

    public boolean a(List list)
    {
        clear();
        if (list == null || list.size() <= 0)
        {
            notifyDataSetInvalidated();
            return false;
        } else
        {
            b(list);
            notifyDataSetChanged();
            return true;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        ((TextView)view.findViewById(0x1020014)).setText(((ArtistSearchData)getItem(i)).b());
        return view;
    }
}
