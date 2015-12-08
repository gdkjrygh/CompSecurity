// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.NbcDate;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.ui.core.BaseFragment;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.content.ContentState;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.lang.reflect.Field;
import java.util.Locale;
import org.joda.time.DateTime;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            DetailActionDialogFragment

public class ShowcaseFragment extends BaseFragment
{

    private Asset asset;
    Configuration config;
    TextView date;
    ImageView icon;
    TextView live;
    private Locale locale;
    Picasso picasso;
    ImageView playIcon;
    ImageView posterArt;
    TextView sport;
    TextView title;
    private AssetViewModel viewModel;

    public ShowcaseFragment()
    {
    }

    public static ShowcaseFragment getInstance(Asset asset1, int i)
    {
        ShowcaseFragment showcasefragment = new ShowcaseFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("asset", asset1);
        bundle.putInt("index", i);
        showcasefragment.setArguments(bundle);
        return showcasefragment;
    }

    private void updateView()
    {
        if (title != null && asset != null && viewModel != null)
        {
            if (viewModel.getProviderThumbnail() < 0)
            {
                icon.setVisibility(8);
            }
            title.setText(asset.getTitle());
            Object obj = viewModel.getSportName(config.getSports());
            if ((viewModel.getStreamUrl() == null || viewModel.getStreamUrl().contains("launchExternal")) && viewModel.getFailoverStreamUrl() == null)
            {
                playIcon.setVisibility(8);
            } else
            {
                playIcon.setVisibility(0);
            }
            if (obj != null && !((String) (obj)).isEmpty())
            {
                sport.setText(((CharSequence) (obj)));
            } else
            {
                sport.setVisibility(8);
            }
            obj = DateTime.now();
            if (asset.getStart().getDateTime().isAfter(((org.joda.time.ReadableInstant) (obj))))
            {
                date.setText(asset.getStart().getDisplayDate(locale));
            } else
            {
                date.setText(asset.getStart().getDisplayDateTime(locale));
            }
            if (asset.isLive())
            {
                date.setText(asset.getStart().getDisplayDate(locale));
            }
            if (live != null && ContentState.isLive(asset.getStatus()) == com.phunware.nbc.sochi.content.ContentState.EventState.LIVE)
            {
                live.setVisibility(0);
            }
            if (DateTime.now().isAfter(asset.getStart().getDateTime()) && asset.isLive())
            {
                Locale locale1 = Locale.US;
                if ("nbclive".equals("telemundo"))
                {
                    locale1 = new Locale("es");
                }
                date.setText((new StringBuilder()).append(getString(0x7f070191)).append(" ").append(asset.getStart().getDisplayTime(locale1)).toString());
                return;
            }
            if (asset.isVod())
            {
                if ("nbclive".equals("telemundo"))
                {
                    locale = new Locale("es");
                }
                date.setText(asset.getStart().getDisplayDateTime(locale));
                return;
            }
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (getActivity() == null || getActivity().isFinishing())
        {
            return;
        } else
        {
            MainNavigationContentActivity.component().inject(this);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        asset = (Asset)getArguments().getParcelable("asset");
        viewModel = new AssetViewModel(asset);
        locale = getResources().getConfiguration().locale;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040042, viewgroup, false);
        ButterKnife.bind(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroy()
    {
        if (picasso != null && posterArt != null)
        {
            picasso.cancelRequest(posterArt);
        }
        super.onDestroy();
    }

    public void onDetach()
    {
        super.onDetach();
        try
        {
            Field field = android/support/v4/app/Fragment.getDeclaredField("mChildFragmentManager");
            field.setAccessible(true);
            field.set(this, null);
            return;
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new RuntimeException(nosuchfieldexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException(illegalaccessexception);
        }
    }

    public void onResume()
    {
        super.onResume();
        updateView();
        picasso.load(viewModel.getShowcaseImageUri(config.getImagesBaseURL())).placeholder(0x7f020132).into(posterArt);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final ShowcaseFragment this$0;

            public void onClick(View view1)
            {
                if (getActivity() == null || getActivity().isFinishing())
                {
                    return;
                }
                String s = asset.getStreamUrl();
                view1 = s;
                if (s == null)
                {
                    view1 = asset.getBackupUrl();
                }
                boolean flag = false;
                if (view1 != null)
                {
                    flag = Boolean.parseBoolean(Uri.parse(view1).getQueryParameter("launchExternal"));
                }
                if (flag)
                {
                    view1 = new Intent("android.intent.action.VIEW", Uri.parse(view1));
                    startActivity(view1);
                    return;
                } else
                {
                    view1 = new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Showcase:List", "Showcase", null, null);
                    DetailActionDialogFragment.getInstance(asset, view1).show(getActivity().getSupportFragmentManager(), "detailfragment");
                    return;
                }
            }

            
            {
                this$0 = ShowcaseFragment.this;
                super();
            }
        });
    }

}
