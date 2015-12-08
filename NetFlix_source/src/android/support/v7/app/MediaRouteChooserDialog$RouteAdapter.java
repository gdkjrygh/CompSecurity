// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.support.v7.media.MediaRouter;
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

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = view;
        view = ((View) (obj));
        if (obj == null)
        {
            view = mInflater.inflate(android.support.v7.mediarouter.r, viewgroup, false);
        }
        viewgroup = (android.support.v7.media.em)getItem(i);
        Object obj1 = (TextView)view.findViewById(0x1020014);
        obj = (TextView)view.findViewById(0x1020015);
        ((TextView) (obj1)).setText(viewgroup.tItem());
        obj1 = viewgroup.tItem();
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            ((TextView) (obj)).setVisibility(8);
            ((TextView) (obj)).setText("");
        } else
        {
            ((TextView) (obj)).setVisibility(0);
            ((TextView) (obj)).setText(((CharSequence) (obj1)));
        }
        view.setEnabled(viewgroup.tItem());
        return view;
    }

    public boolean isEnabled(int i)
    {
        return ((android.support.v7.media.tItem)getItem(i)).tItem();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (android.support.v7.media.tItem)getItem(i);
        if (adapterview.tItem())
        {
            adapterview.tItem();
            dismiss();
        }
    }

    public void update()
    {
        clear();
        List list = MediaRouteChooserDialog.access$100(MediaRouteChooserDialog.this).getRoutes();
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            android.support.v7.media.tItem titem = (android.support.v7.media.is._cls0)list.get(i);
            if (onFilterRoute(titem))
            {
                add(titem);
            }
        }

        sort(or.sInstance);
        notifyDataSetChanged();
    }

    public or(Context context)
    {
        this$0 = MediaRouteChooserDialog.this;
        super(context, 0);
        mInflater = LayoutInflater.from(context);
    }
}
