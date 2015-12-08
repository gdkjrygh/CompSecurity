// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.accuweather.android.models.FragmentPayload;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.ImageUtils;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.MyImageView;
import com.nostra13.universalimageloader.core.ImageLoader;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.fragments:
//            WeatherFragment

public abstract class TableFragment extends WeatherFragment
{
    public static interface OnItemSelectedListener
    {

        public abstract void onItemSelected(int i);
    }

    private final class TableCellOnClickListener
        implements android.view.View.OnClickListener
    {

        int itemIndex;
        final TableFragment this$0;

        public void onClick(View view)
        {
            if (mListener != null)
            {
                mListener.onItemSelected(itemIndex);
            }
        }

        public TableCellOnClickListener(int i)
        {
            this$0 = TableFragment.this;
            super();
            itemIndex = i;
        }
    }


    private static final float PRIMARY_CELL_HEIGHT;
    private static final float SECONDARY_CELL_HEIGHT;
    private List imageViews;
    protected LinearLayout mLinearLayout;
    private OnItemSelectedListener mListener;

    public TableFragment()
    {
        imageViews = new ArrayList();
    }

    private final void addImageView(MyImageView myimageview)
    {
        imageViews.add(myimageview);
    }

    private final void addLeftHandCellForTableRow(LinearLayout linearlayout, float f, View view)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, (int)(SECONDARY_CELL_HEIGHT * f));
        layoutparams.weight = 0.5F;
        layoutparams.rightMargin = (int)(4F * f);
        linearlayout.addView(view, layoutparams);
    }

    private final void addPrimaryCellForTableRow(LinearLayout linearlayout, float f, View view)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, (int)(PRIMARY_CELL_HEIGHT * f));
        layoutparams.weight = 1.0F;
        linearlayout.addView(view, layoutparams);
    }

    private final void addRightHandCellForTableRow(LinearLayout linearlayout, float f, View view)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, (int)(SECONDARY_CELL_HEIGHT * f));
        layoutparams.weight = 0.5F;
        layoutparams.leftMargin = (int)(4F * f);
        linearlayout.addView(view, layoutparams);
    }

    private void addTouchListenerToCell(int i, View view)
    {
        view.findViewById(com.accuweather.android.R.id.touch_overlay).setOnClickListener(new TableCellOnClickListener(i));
    }

    private LinearLayout buildTableRow(float f)
    {
        LinearLayout linearlayout = new LinearLayout(getActivity());
        linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        return linearlayout;
    }

    private void cleanup()
    {
        for (int i = imageViews.size() - 1; i >= 0; i--)
        {
            ((MyImageView)imageViews.get(i)).setImageBitmap(null);
            ((ViewGroup)((MyImageView)imageViews.get(i)).getParent()).removeAllViews();
        }

        imageViews.clear();
    }

    private void init()
    {
        mLinearLayout = (LinearLayout)getView().findViewById(com.accuweather.android.R.id.table);
        updateView();
    }

    private void loadImageIntoView(String s, ImageView imageview)
    {
        com.nostra13.universalimageloader.core.DisplayImageOptions displayimageoptions = (new com.nostra13.universalimageloader.core.DisplayImageOptions.Builder()).showImageForEmptyUri(com.accuweather.android.R.drawable.news_video_image_placeholder).showImageOnFail(com.accuweather.android.R.drawable.news_video_image_placeholder).cacheOnDisc(true).cacheInMemory(true).build();
        ImageLoader.getInstance().displayImage(s, imageview, displayimageoptions);
    }

    protected View buildCellView(int i, float f, LayoutInflater layoutinflater)
    {
        layoutinflater = layoutinflater.inflate(com.accuweather.android.R.layout.news_and_video_item, null);
        Utilities.setTypeFace(layoutinflater, Data.getRobotoCondensed());
        ((TextView)layoutinflater.findViewById(com.accuweather.android.R.id.title_text)).setText(getTitleText(i));
        MyImageView myimageview = (MyImageView)layoutinflater.findViewById(com.accuweather.android.R.id.thumbnail);
        addImageView(myimageview);
        ImageView imageview = (ImageView)layoutinflater.findViewById(com.accuweather.android.R.id.play_overlay);
        if (!showPlayOverlay(i))
        {
            imageview.setVisibility(8);
        }
        if (getImageUrl(i) != null)
        {
            loadImageIntoView(getImageUrl(i), myimageview);
        } else
        if (getBitmap(i) != null)
        {
            loadImageIntoView(getBitmap(i), myimageview);
            return layoutinflater;
        }
        return layoutinflater;
    }

    protected abstract Bitmap getBitmap(int i);

    protected abstract String getImageUrl(int i);

    protected abstract int getNumberOfCells();

    protected abstract String getTitleText(int i);

    protected final void loadImageIntoView(Bitmap bitmap, ImageView imageview)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            imageview.setImageBitmap(ImageUtils.getCroppedBitmap(imageview, bitmap));
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        init();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.accuweather.android.R.layout.table_fragment, null);
    }

    public void onReceive(Intent intent)
    {
        if (intent.getAction().equals("accuwx.intent.action.UPDATE_FRAGMENT"))
        {
            intent = ((Intent) (intent.getExtras().get("fragment_payload")));
            if (intent instanceof FragmentPayload)
            {
                intent = ((FragmentPayload)intent).getLocationKey();
                if (intent != null)
                {
                    intent = getData().getWeatherDataModelFromCode(intent);
                    if (intent != null)
                    {
                        mWeatherDataModel = intent;
                        updateView();
                    }
                }
            }
        }
    }

    public void onStop()
    {
        super.onStop();
        cleanup();
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onitemselectedlistener)
    {
        mListener = onitemselectedlistener;
    }

    protected void setTitle(String s)
    {
        TextView textview;
        if (!TextUtils.isEmpty(s))
        {
            if ((textview = (TextView)getView().findViewById(com.accuweather.android.R.id.title)) != null)
            {
                textview.setText(s);
                return;
            }
        }
    }

    protected boolean showPlayOverlay(int i)
    {
        return true;
    }

    public void updateView()
    {
        if (!isInitialized() || getNumberOfCells() == 0)
        {
            return;
        }
        cleanup();
        mLinearLayout.removeAllViews();
        LayoutInflater layoutinflater = (LayoutInflater)getActivity().getSystemService("layout_inflater");
        float f = getResources().getDisplayMetrics().density;
        LinearLayout linearlayout = null;
        int i = 0;
        while (i < getNumberOfCells()) 
        {
            View view = buildCellView(i, f, layoutinflater);
            if (i == 0)
            {
                linearlayout = buildTableRow(f);
                mLinearLayout.addView(linearlayout);
                addPrimaryCellForTableRow(linearlayout, f, view);
            } else
            if (i % 2 == 1)
            {
                linearlayout = buildTableRow(f);
                mLinearLayout.addView(linearlayout);
                addLeftHandCellForTableRow(linearlayout, f, view);
            } else
            {
                addRightHandCellForTableRow(linearlayout, f, view);
            }
            addTouchListenerToCell(i, view);
            i++;
        }
        if (getNumberOfCells() % 2 == 0)
        {
            addRightHandCellForTableRow(linearlayout, f, new View(getActivity()));
        }
        setTitle(mTitle);
    }

    static 
    {
        float f;
        if (Utilities.shouldTabletBeTreatedAsPhone())
        {
            f = 400F;
        } else
        {
            f = 216F;
        }
        PRIMARY_CELL_HEIGHT = f;
        if (Utilities.shouldTabletBeTreatedAsPhone())
        {
            f = 240F;
        } else
        {
            f = 130F;
        }
        SECONDARY_CELL_HEIGHT = f;
    }

}
