// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.widget;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataBufferAdapter extends BaseAdapter
{

    private final int LR;
    private int LS;
    private final int LT;
    private final List LU;
    private final LayoutInflater LV;
    private boolean LW;
    private final Context mContext;

    public DataBufferAdapter(Context context, int i)
    {
        this(context, i, 0, ((List) (new ArrayList())));
    }

    public DataBufferAdapter(Context context, int i, int j)
    {
        this(context, i, j, ((List) (new ArrayList())));
    }

    public DataBufferAdapter(Context context, int i, int j, List list)
    {
        LW = true;
        mContext = context;
        LS = i;
        LR = i;
        LT = j;
        LU = list;
        LV = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public transient DataBufferAdapter(Context context, int i, int j, DataBuffer adatabuffer[])
    {
        this(context, i, j, Arrays.asList(adatabuffer));
    }

    public DataBufferAdapter(Context context, int i, List list)
    {
        this(context, i, 0, list);
    }

    public transient DataBufferAdapter(Context context, int i, DataBuffer adatabuffer[])
    {
        this(context, i, 0, Arrays.asList(adatabuffer));
    }

    private View a(int i, View view, ViewGroup viewgroup, int j)
    {
        if (view == null)
        {
            view = LV.inflate(j, viewgroup, false);
        }
        if (LT != 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        viewgroup = (TextView)view;
_L1:
        Object obj = getItem(i);
        if (obj instanceof CharSequence)
        {
            viewgroup.setText((CharSequence)obj);
            return view;
        } else
        {
            viewgroup.setText(obj.toString());
            return view;
        }
        try
        {
            viewgroup = (TextView)view.findViewById(LT);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.e("DataBufferAdapter", "You must supply a resource ID for a TextView");
            throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", view);
        }
          goto _L1
    }

    public void append(DataBuffer databuffer)
    {
        LU.add(databuffer);
        if (LW)
        {
            notifyDataSetChanged();
        }
    }

    public void clear()
    {
        for (Iterator iterator = LU.iterator(); iterator.hasNext(); ((DataBuffer)iterator.next()).close()) { }
        LU.clear();
        if (LW)
        {
            notifyDataSetChanged();
        }
    }

    public Context getContext()
    {
        return mContext;
    }

    public int getCount()
    {
        Iterator iterator = LU.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((DataBuffer)iterator.next()).getCount() + i) { }
        return i;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return a(i, view, viewgroup, LS);
    }

    public Object getItem(int i)
        throws CursorIndexOutOfBoundsException
    {
        Iterator iterator = LU.iterator();
        int j = i;
        while (iterator.hasNext()) 
        {
            DataBuffer databuffer = (DataBuffer)iterator.next();
            int k = databuffer.getCount();
            if (k <= j)
            {
                j -= k;
            } else
            {
                Object obj;
                try
                {
                    obj = databuffer.get(j);
                }
                catch (CursorIndexOutOfBoundsException cursorindexoutofboundsexception)
                {
                    throw new CursorIndexOutOfBoundsException(i, getCount());
                }
                return obj;
            }
        }
        throw new CursorIndexOutOfBoundsException(i, getCount());
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return a(i, view, viewgroup, LR);
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        LW = true;
    }

    public void setDropDownViewResource(int i)
    {
        LS = i;
    }

    public void setNotifyOnChange(boolean flag)
    {
        LW = flag;
    }
}
