// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//            MediaRouteChooserDialog

private final class mInflater extends ArrayAdapter
    implements android.widget.Adapter
{

    private final LayoutInflater mInflater;
    final MediaRouteChooserDialog this$0;

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = mInflater.inflate(android.support.v7.mediarouter.r, viewgroup, false);
        }
        view = (android.support.v7.media.em)getItem(i);
        Object obj = (TextView)view1.findViewById(0x1020014);
        viewgroup = (TextView)view1.findViewById(0x1020015);
        ((TextView) (obj)).setText(view.tItem());
        obj = view.tItem();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            viewgroup.setVisibility(8);
            viewgroup.setText("");
        } else
        {
            viewgroup.setVisibility(0);
            viewgroup.setText(((CharSequence) (obj)));
        }
        view1.setEnabled(view.tItem());
        return view1;
    }

    public final boolean isEnabled(int i)
    {
        return ((android.support.v7.media.tItem)getItem(i)).tItem();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (android.support.v7.media.tItem)getItem(i);
        if (adapterview.tItem())
        {
            adapterview.tItem();
            dismiss();
        }
    }

    public A(Context context, List list)
    {
        this$0 = MediaRouteChooserDialog.this;
        super(context, 0, list);
        mInflater = LayoutInflater.from(context);
    }
}
