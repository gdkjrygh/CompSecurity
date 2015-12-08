// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.NbcDate;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.content.ContentState;
import com.phunware.nbc.sochi.fragments.DetailActionDialogFragment;
import com.phunware.nbc.sochi.fragments.PlayerActionDialogFragment;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetViewModel

public class DefaultItemView extends RelativeLayout
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    com.nbcsports.liveextra.library.configuration.Configuration configuration;
    TextView detail;
    View favoriteButton;
    FavoriteService favorites;
    private FragmentManager fragmentManager;
    ImageView image;
    private AssetViewModel model;
    View overflowButton;
    private com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageInfo;
    Picasso picasso;
    View playButton;
    ImageView providerImage;
    TextView sport;
    TextView title;

    public DefaultItemView(Context context)
    {
        this(context, null);
    }

    public DefaultItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DefaultItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (isInEditMode())
        {
            return;
        } else
        {
            MainNavigationContentActivity.component().inject(this);
            return;
        }
    }

    private void setDate(AssetViewModel assetviewmodel)
    {
        NbcDate nbcdate = assetviewmodel.asset().getStart();
        LocalDateTime localdatetime = nbcdate.getDateTime().toLocalDateTime();
        LocalDateTime localdatetime1 = DateTime.now().toLocalDateTime();
        java.util.Locale locale;
        boolean flag;
        if (localdatetime.year() == localdatetime1.year() && localdatetime.monthOfYear() == localdatetime1.monthOfYear() && localdatetime.dayOfMonth() == localdatetime1.dayOfMonth())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        locale = getResources().getConfiguration().locale;
        if (localdatetime1.isAfter(localdatetime) && assetviewmodel.asset().isLive())
        {
            detail.setText((new StringBuilder()).append(getContext().getString(0x7f070191)).append(" ").append(nbcdate.getDisplayDateTime(locale)).toString());
            detail.setTypeface(Typeface.DEFAULT_BOLD);
            return;
        }
        if (assetviewmodel.asset().isFuture() && flag)
        {
            detail.setTypeface(Typeface.DEFAULT_BOLD);
            return;
        } else
        {
            detail.setText(assetviewmodel.asset().getStart().getDisplayDateTime(locale));
            detail.setTypeface(Typeface.DEFAULT);
            return;
        }
    }

    private void setFavorite(AssetViewModel assetviewmodel)
    {
        if (favoriteButton == null)
        {
            return;
        } else
        {
            favoriteButton.setSelected(favorites.isFavorite(assetviewmodel.asset().getCoalescedEventId()));
            return;
        }
    }

    private void setImage(AssetViewModel assetviewmodel)
    {
        Object obj = assetviewmodel.getThumbnailImageUri(configuration.getImagesBaseURL());
        picasso.load(((android.net.Uri) (obj))).placeholder(0x7f020132).error(0x7f020132).into(image);
        obj = image;
        int i;
        if (assetviewmodel.isLive())
        {
            i = 0x7f0200b8;
        } else
        {
            i = 0x7f0200ba;
        }
        ((ImageView) (obj)).setBackgroundResource(i);
    }

    private void setProviderImage(AssetViewModel assetviewmodel)
    {
        int i = assetviewmodel.getProviderThumbnail();
        if (i < 0)
        {
            providerImage.setVisibility(4);
            return;
        } else
        {
            providerImage.setImageResource(i);
            providerImage.setVisibility(0);
            return;
        }
    }

    private void setSport(AssetViewModel assetviewmodel)
    {
        assetviewmodel = assetviewmodel.getSportName(configuration.getSports());
        if (assetviewmodel != null)
        {
            sport.setText(assetviewmodel);
            sport.setVisibility(0);
            return;
        } else
        {
            sport.setVisibility(4);
            return;
        }
    }

    public void bind(AssetViewModel assetviewmodel, com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageinfo)
    {
        model = assetviewmodel;
        pageInfo = pageinfo;
        if (image != null)
        {
            title.setText(assetviewmodel.asset().getTitle());
            setImage(assetviewmodel);
            setProviderImage(assetviewmodel);
            setDate(assetviewmodel);
            setSport(assetviewmodel);
            setFavorite(assetviewmodel);
            if (playButton != null)
            {
                pageinfo = playButton;
                byte byte0;
                if (assetviewmodel.asset().isFuture())
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                pageinfo.setVisibility(byte0);
                return;
            }
        }
    }

    public boolean hasOverflow()
    {
        return overflowButton != null;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            fragmentManager = ((FragmentActivity)getContext()).getSupportFragmentManager();
            ButterKnife.bind(this);
            if (model != null)
            {
                bind(model, pageInfo);
                setOnLongClickListener(this);
                setOnClickListener(this);
                return;
            }
        }
    }

    public void onClick(View view)
    {
        onInfoClick();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        picasso.cancelRequest(image);
        picasso.cancelRequest(providerImage);
        ButterKnife.unbind(this);
    }

    public void onFavoriteClick()
    {
        favorites.toggle(model.asset());
    }

    public void onInfoClick()
    {
        DetailActionDialogFragment.getInstance(model.asset(), pageInfo).show(fragmentManager, "detail_fragment");
    }

    public boolean onLongClick(View view)
    {
        if (hasOverflow())
        {
            onOverflowClick(view);
            return true;
        } else
        {
            return false;
        }
    }

    public void onOverflowClick(final View popup)
    {
        popup = new PopupMenu(getContext(), popup);
        popup.getMenuInflater().inflate(0x7f100005, popup.getMenu());
        Object obj = ContentState.isLive(model.asset().getStatus());
        int i;
        if (obj != com.phunware.nbc.sochi.content.ContentState.EventState.LIVE && obj != com.phunware.nbc.sochi.content.ContentState.EventState.VOD)
        {
            popup.getMenu().findItem(0x7f0f0204).setVisible(false);
        } else
        {
            popup.getMenu().findItem(0x7f0f0206).setVisible(false);
        }
        obj = popup.getMenu().findItem(0x7f0f0206);
        if (favorites.isFavorite(model.asset().getCoalescedEventId()))
        {
            i = 0x7f070173;
        } else
        {
            i = 0x7f070046;
        }
        ((MenuItem) (obj)).setTitle(i);
        popup.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {

            final DefaultItemView this$0;
            final PopupMenu val$popup;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                int j;
                popup.dismiss();
                j = menuitem.getItemId();
                if (j != 0x7f0f0205) goto _L2; else goto _L1
_L1:
                DetailActionDialogFragment.getInstance(model.asset(), pageInfo).show(fragmentManager, "df");
_L4:
                return true;
_L2:
                if (j == 0x7f0f0206)
                {
                    favorites.toggle(model.asset());
                } else
                if (j == 0x7f0f0204)
                {
                    PlayerActionDialogFragment.getInstance(model.asset(), pageInfo).show(fragmentManager, "dialog");
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = DefaultItemView.this;
                popup = popupmenu;
                super();
            }
        });
        postDelayed(new Runnable() {

            final DefaultItemView this$0;
            final PopupMenu val$popup;

            public void run()
            {
                popup.dismiss();
            }

            
            {
                this$0 = DefaultItemView.this;
                popup = popupmenu;
                super();
            }
        }, 3000L);
        popup.show();
    }

    public void onPlayClick()
    {
        if (model.asset().isFuture())
        {
            return;
        } else
        {
            PlayerActionDialogFragment.getInstance(model.asset(), pageInfo).show(fragmentManager, "dialog");
            return;
        }
    }



}
