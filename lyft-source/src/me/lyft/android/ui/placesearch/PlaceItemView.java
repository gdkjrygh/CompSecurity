// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            IPlaceItemViewModel

public class PlaceItemView extends FrameLayout
{

    View placeEditButton;
    ImageView placeIconImageView;
    private IPlaceItemViewModel placeItem;
    TextView placeSubtitleTextView;
    TextView placeTitleTextView;

    public PlaceItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void setPlaceItem(final IPlaceItemViewModel placeItem)
    {
        int i = 0;
        this.placeItem = placeItem;
        placeTitleTextView.setText(placeItem.getTitle());
        Object obj = placeItem.getSubtitle();
        placeSubtitleTextView.setText(((CharSequence) (obj)));
        if (Strings.isNullOrBlank(((String) (obj))))
        {
            placeSubtitleTextView.setVisibility(8);
        } else
        {
            placeSubtitleTextView.setVisibility(0);
        }
        placeIconImageView.setImageResource(placeItem.getIconResourceId());
        obj = placeEditButton;
        if (!placeItem.isEditVisible())
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        placeEditButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PlaceItemView this$0;
            final IPlaceItemViewModel val$placeItem;

            public void onClick(View view)
            {
                placeItem.onEdit();
            }

            
            {
                this$0 = PlaceItemView.this;
                placeItem = iplaceitemviewmodel;
                super();
            }
        });
        setOnClickListener(new android.view.View.OnClickListener() {

            final PlaceItemView this$0;
            final IPlaceItemViewModel val$placeItem;

            public void onClick(View view)
            {
                placeItem.onSelected();
            }

            
            {
                this$0 = PlaceItemView.this;
                placeItem = iplaceitemviewmodel;
                super();
            }
        });
    }
}
