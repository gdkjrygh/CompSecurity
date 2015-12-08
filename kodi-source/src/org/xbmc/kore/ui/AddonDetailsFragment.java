// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.melnykov.fab.FloatingActionButton;
import com.melnykov.fab.ObservableScrollView;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

public class AddonDetailsFragment extends Fragment
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/AddonDetailsFragment);
    private String addonId;
    private Handler callbackHandler;
    ImageButton enabledButton;
    ImageButton fabButton;
    private HostInfo hostInfo;
    private HostManager hostManager;
    ImageView mediaArt;
    TextView mediaAuthor;
    TextView mediaDescription;
    ScrollView mediaPanel;
    ImageView mediaPoster;
    TextView mediaTitle;
    TextView mediaUndertitle;
    TextView mediaVersion;

    public AddonDetailsFragment()
    {
        callbackHandler = new Handler();
    }

    private void displayAddonDetails(org.xbmc.kore.jsonrpc.type.AddonType.Details details)
    {
        mediaTitle.setText(details.name);
        mediaUndertitle.setText(details.summary);
        mediaAuthor.setText(details.author);
        mediaVersion.setText(details.version);
        mediaDescription.setText(details.description);
        Resources resources = getActivity().getResources();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i = resources.getDimensionPixelOffset(0x7f080025);
        int j = displaymetrics.widthPixels;
        if (!TextUtils.isEmpty(details.fanart))
        {
            int k = resources.getDimensionPixelOffset(0x7f080010);
            int i1 = resources.getDimensionPixelOffset(0x7f08000f);
            mediaPoster.setVisibility(0);
            UIUtils.loadImageIntoImageview(hostManager, details.thumbnail, mediaPoster, k, i1);
            UIUtils.loadImageIntoImageview(hostManager, details.fanart, mediaArt, j, i);
        } else
        {
            mediaPoster.setVisibility(8);
            UIUtils.loadImageIntoImageview(hostManager, details.thumbnail, mediaArt, j, i);
            i = mediaTitle.getPaddingRight();
            j = mediaTitle.getPaddingRight();
            int l = mediaTitle.getPaddingTop();
            int j1 = mediaTitle.getPaddingBottom();
            mediaTitle.setPadding(i, l, j, j1);
            mediaUndertitle.setPadding(i, l, j, j1);
        }
        setupEnableButton(details.enabled.booleanValue());
    }

    public static AddonDetailsFragment newInstance(String s)
    {
        AddonDetailsFragment addondetailsfragment = new AddonDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("addon_id", s);
        addondetailsfragment.setArguments(bundle);
        return addondetailsfragment;
    }

    private void setupEnableButton(boolean flag)
    {
        if (flag)
        {
            TypedArray typedarray = getActivity().getTheme().obtainStyledAttributes(new int[] {
                0x7f010106
            });
            enabledButton.setColorFilter(typedarray.getColor(0, 0x7f0d0004));
            typedarray.recycle();
            fabButton.setVisibility(0);
        } else
        {
            enabledButton.clearColorFilter();
            fabButton.setVisibility(8);
        }
        enabledButton.setTag(Boolean.valueOf(flag));
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setHasOptionsMenu(false);
        (new org.xbmc.kore.jsonrpc.method.Addons.GetAddonDetails(addonId, new String[] {
            "name", "version", "summary", "description", "path", "author", "thumbnail", "disclaimer", "fanart", "rating", 
            "enabled"
        })).execute(hostManager.getConnection(), new ApiCallback() {

            final AddonDetailsFragment this$0;

            public void onError(int i, String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    Toast.makeText(getActivity(), String.format(getString(0x7f07003e), new Object[] {
                        s
                    }), 0).show();
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((org.xbmc.kore.jsonrpc.type.AddonType.Details)obj);
            }

            public void onSuccess(org.xbmc.kore.jsonrpc.type.AddonType.Details details)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    displayAddonDetails(details);
                    return;
                }
            }

            
            {
                this$0 = AddonDetailsFragment.this;
                super();
            }
        }, callbackHandler);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        addonId = getArguments().getString("addon_id", null);
        if (viewgroup == null || addonId == null)
        {
            return null;
        } else
        {
            layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030026, viewgroup, false);
            ButterKnife.inject(this, layoutinflater);
            hostManager = HostManager.getInstance(getActivity());
            hostInfo = hostManager.getHostInfo();
            int i = getActivity().getResources().getDimensionPixelSize(0x7f080074);
            mediaPanel.getViewTreeObserver().addOnScrollChangedListener(new android.view.ViewTreeObserver.OnScrollChangedListener() {

                final AddonDetailsFragment this$0;
                final int val$pixelsToTransparent;

                public void onScrollChanged()
                {
                    float f = Math.min(1.0F, Math.max(0.0F, 1.0F - (float)mediaPanel.getScrollY() / (float)pixelsToTransparent));
                    mediaArt.setAlpha(f);
                }

            
            {
                this$0 = AddonDetailsFragment.this;
                pixelsToTransparent = i;
                super();
            }
            });
            ((FloatingActionButton)fabButton).attachToScrollView((ObservableScrollView)mediaPanel);
            return layoutinflater;
        }
    }

    public void onEnabledClicked(final View isEnabled)
    {
        boolean flag1 = false;
        String s;
        boolean flag;
        if (isEnabled.getTag() == null)
        {
            flag = false;
        } else
        {
            flag = ((Boolean)isEnabled.getTag()).booleanValue();
        }
        isEnabled = Boolean.valueOf(flag);
        s = addonId;
        flag = flag1;
        if (!isEnabled.booleanValue())
        {
            flag = true;
        }
        (new org.xbmc.kore.jsonrpc.method.Addons.SetAddonEnabled(s, flag)).execute(hostManager.getConnection(), new ApiCallback() {

            final AddonDetailsFragment this$0;
            final Boolean val$isEnabled;

            public void onError(int i, String s1)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    Toast.makeText(getActivity(), String.format(getString(0x7f070048), new Object[] {
                        s1
                    }), 0).show();
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s1)
            {
                boolean flag2 = false;
                if (!isAdded())
                {
                    return;
                }
                int i;
                if (!isEnabled.booleanValue())
                {
                    i = 0x7f07001b;
                } else
                {
                    i = 0x7f07001a;
                }
                Toast.makeText(getActivity(), i, 0).show();
                s1 = AddonDetailsFragment.this;
                if (!isEnabled.booleanValue())
                {
                    flag2 = true;
                }
                s1.setupEnableButton(flag2);
            }

            
            {
                this$0 = AddonDetailsFragment.this;
                isEnabled = boolean1;
                super();
            }
        }, callbackHandler);
    }

    public void onFabClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Addons.ExecuteAddon(addonId)).execute(hostManager.getConnection(), new ApiCallback() {

            final AddonDetailsFragment this$0;

            public void onError(int i, String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    Toast.makeText(getActivity(), 0x7f0700a2, 0).show();
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
            }

            
            {
                this$0 = AddonDetailsFragment.this;
                super();
            }
        }, callbackHandler);
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }



}
