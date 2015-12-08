// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.pin.view.PinCloseupImageView;
import com.pinterest.kit.application.Resources;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageGalleryAdapter extends PagerAdapter
{

    private Context _context;
    private List _dataSource;
    private android.view.View.OnClickListener _pinClickListener;
    private Map _positionMap;

    public ImageGalleryAdapter()
    {
        _positionMap = new HashMap();
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        ((PinCloseupImageView)obj).setOnPinClickListener(null);
        viewgroup.removeView((View)obj);
        _positionMap.remove(Integer.valueOf(i));
    }

    public int getCount()
    {
        if (_dataSource == null)
        {
            return 0;
        } else
        {
            return _dataSource.size();
        }
    }

    public PinCloseupImageView getViewAtPosition(int i)
    {
        return (PinCloseupImageView)_positionMap.get(Integer.valueOf(i));
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        PinCloseupImageView pincloseupimageview = new PinCloseupImageView(_context);
        if (_pinClickListener != null)
        {
            pincloseupimageview.setOnPinClickListener(_pinClickListener);
        }
        float f;
        boolean flag;
        int j;
        if (getCount() > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j = 0x7f0a0184;
        } else
        {
            j = 0x7f0a018a;
        }
        pincloseupimageview.setImageMargin(Resources.dimension(j));
        if (i == 0)
        {
            f = 1.0F;
        } else
        {
            f = 0.9F;
        }
        pincloseupimageview.setImageAlpha(f);
        viewgroup.addView(pincloseupimageview);
        pincloseupimageview.setGalleryItem((com.pinterest.api.model.Pin.GalleryItem)_dataSource.get(i));
        if (flag && i != 0)
        {
            pincloseupimageview.darken();
        }
        _positionMap.put(Integer.valueOf(i), pincloseupimageview);
        return pincloseupimageview;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void setContext(Context context)
    {
        _context = context;
    }

    public void setDataSource(List list)
    {
        _dataSource = list;
    }

    public void setPinClickListener(android.view.View.OnClickListener onclicklistener)
    {
        _pinClickListener = onclicklistener;
    }
}
