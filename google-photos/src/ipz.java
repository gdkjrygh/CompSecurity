// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;

final class ipz extends BaseAdapter
{

    private final ioj a[];
    private final Context b;

    public ipz(ioj aioj[], Context context)
    {
        a = aioj;
        b = context;
    }

    private ioj a(int i)
    {
        if (i == getCount() - 1)
        {
            return null;
        } else
        {
            return a[i];
        }
    }

    public final int getCount()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        return i + 1;
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemViewType(int i)
    {
        return i == getCount() - 1 ? 1 : 0;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        switch (getItemViewType(i))
        {
        default:
            throw new RuntimeException("Cannot resolve item type for list view when editing location.");

        case 0: // '\0'
            viewgroup = view;
            if (view == null)
            {
                viewgroup = LayoutInflater.from(b).inflate(b.AM, null);
            }
            view = a(i);
            viewgroup.setTag(s.bW, view);
            viewgroup.setTag(s.bV, Boolean.valueOf(false));
            MediaView mediaview = (MediaView)viewgroup.findViewById(s.aP);
            mediaview.d = 2;
            if (1 != mediaview.j)
            {
                mediaview.j = 1;
                mediaview.k.setEmpty();
                mediaview.invalidate();
            }
            i = b.getResources().getDimensionPixelSize(b.Ak);
            Object obj = b.a(view, i, i, b.getResources().getDisplayMetrics().density);
            obj = njr.a(b, ((String) (obj)), njx.a);
            if (mediaview.f == null || !mediaview.f.equals(obj) || !MediaView.a(mediaview.g, null))
            {
                mediaview.h = true;
                mediaview.g = null;
                mediaview.c();
                mediaview.f = ((njr) (obj));
                if (mediaview.f != null)
                {
                    mediaview.a = false;
                }
                mediaview.b();
                mediaview.invalidate();
            }
            ((TextView)viewgroup.findViewById(s.aQ)).setText(((ioj) (view)).d);
            ((TextView)viewgroup.findViewById(s.aO)).setText(((ioj) (view)).e);
            return viewgroup;

        case 1: // '\001'
            viewgroup = view;
            break;
        }
        if (view == null)
        {
            viewgroup = LayoutInflater.from(b).inflate(b.AL, null);
        }
        viewgroup.setTag(s.bV, Boolean.valueOf(true));
        return viewgroup;
    }

    public final int getViewTypeCount()
    {
        return 2;
    }
}
