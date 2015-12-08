// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.models.BitmapCache;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.MyImageView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.accuweather.android.fragments:
//            TableFragment

public class MapsImageFragment extends TableFragment
{
    public static interface IMapsListFragmentListener
        extends Serializable
    {

        public abstract void onMapsItemSelected(String s);
    }


    private static final String IS_LAST_UPDATE_KEY = "isLastUpdate";
    private List keys;
    private boolean mIsLastUpdate;

    public MapsImageFragment()
    {
    }

    private View buildAddLocationView(LayoutInflater layoutinflater)
    {
        layoutinflater = layoutinflater.inflate(com.accuweather.android.R.layout.map_tile_add_location, null);
        Utilities.setTypeFace(layoutinflater, Data.getRobotoCondensed());
        Utilities.setTextColor(layoutinflater, getResources().getColor(com.accuweather.android.R.color.secondary_text));
        return layoutinflater;
    }

    private View buildMapCellView(int i, LayoutInflater layoutinflater)
    {
        layoutinflater = layoutinflater.inflate(com.accuweather.android.R.layout.map_tile, null);
        View view = layoutinflater.findViewById(com.accuweather.android.R.id.tap_on_location_container);
        MyImageView myimageview = (MyImageView)layoutinflater.findViewById(com.accuweather.android.R.id.image_tile);
        TextView textview = (TextView)layoutinflater.findViewById(com.accuweather.android.R.id.tap_on_location);
        TextView textview1 = (TextView)layoutinflater.findViewById(com.accuweather.android.R.id.to_see_full_view);
        if (i == 0)
        {
            myimageview.setDefaultImageToDraw(com.accuweather.android.R.drawable.image_map);
            myimageview.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            view.setVisibility(0);
            Utilities.setTypeFace(textview, Data.getRobotoBoldCondensed());
            Utilities.setTypeFace(textview1, Data.getRobotoCondensed());
        } else
        {
            myimageview.setDefaultImageToDraw(com.accuweather.android.R.drawable.map_location_icon_full);
            view.setVisibility(8);
        }
        if (isHomeLocation(i))
        {
            showHomeLocationIcon(layoutinflater);
        }
        updateLocationName(i, layoutinflater);
        return layoutinflater;
    }

    private BitmapCache getBitmapCache(int i)
    {
        if (i > keys.size() - 1)
        {
            return null;
        } else
        {
            String s = (String)keys.get(i);
            return (BitmapCache)BitmapCache.getMapHashMap().get(s);
        }
    }

    private boolean isBitmapValid(BitmapCache bitmapcache)
    {
        if (bitmapcache == null)
        {
            return false;
        } else
        {
            return bitmapcache.isImageValid(getActivity());
        }
    }

    private boolean isGpsLocation(int i)
    {
        Object obj = Data.getInstance(getActivity());
        if (i <= keys.size() - 1)
        {
            LocationModel locationmodel = ((Data) (obj)).getLocationFromKey((String)keys.get(i));
            obj = ((Data) (obj)).getCurrentFollowMeLocation();
            if (obj != null && locationmodel != null && ((LocationModel) (obj)).equals(locationmodel))
            {
                return true;
            }
        }
        return false;
    }

    private boolean isHomeLocation(int i)
    {
        Object obj = Data.getInstance(getActivity());
        if (i <= keys.size() - 1)
        {
            if ((obj = ((Data) (obj)).getLocationFromKey((String)keys.get(i))) != null)
            {
                return ((LocationModel) (obj)).isHome();
            }
        }
        return false;
    }

    public static MapsImageFragment newInstance(boolean flag)
    {
        MapsImageFragment mapsimagefragment = new MapsImageFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isLastUpdate", flag);
        mapsimagefragment.setArguments(bundle);
        return mapsimagefragment;
    }

    private void setMapsFragmentListener(final IMapsListFragmentListener listener)
    {
        setOnItemSelectedListener(new TableFragment.OnItemSelectedListener() {

            final MapsImageFragment this$0;
            final IMapsListFragmentListener val$listener;

            public void onItemSelected(int i)
            {
                String s;
                if (keys.size() - 1 >= i)
                {
                    s = (String)keys.get(i);
                } else
                {
                    s = null;
                }
                listener.onMapsItemSelected(s);
            }

            
            {
                this$0 = MapsImageFragment.this;
                listener = imapslistfragmentlistener;
                super();
            }
        });
    }

    private void showHomeLocationIcon(View view)
    {
        ((ImageView)view.findViewById(com.accuweather.android.R.id.home_location_icon)).setVisibility(0);
    }

    private void updateLocationName(int i, View view)
    {
        view = (TextView)view.findViewById(com.accuweather.android.R.id.location_name_text);
        view.setText(getTitleText(i));
        if (i == 0)
        {
            Utilities.setTypeFace(view, Data.getRobotoBoldCondensed());
        } else
        {
            view.setText(getTitleText(i));
            Utilities.setTypeFace(view, Data.getRobotoCondensed());
        }
        view.setTextColor(getResources().getColor(com.accuweather.android.R.color.secondary_text));
    }

    protected View buildCellView(int i, float f, LayoutInflater layoutinflater)
    {
        if (i > keys.size() - 1)
        {
            return buildAddLocationView(layoutinflater);
        } else
        {
            return buildMapCellView(i, layoutinflater);
        }
    }

    protected Bitmap getBitmap(int i)
    {
        BitmapCache bitmapcache = getBitmapCache(i);
        if (bitmapcache == null)
        {
            return null;
        } else
        {
            return bitmapcache.getBitmap();
        }
    }

    protected String getImageUrl(int i)
    {
        return null;
    }

    protected int getNumberOfCells()
    {
        return 5;
    }

    protected String getTitleText(int i)
    {
        Object obj = Data.getInstance(getActivity());
        if (i > keys.size() - 1)
        {
            return getString(com.accuweather.android.R.string.AddLocation);
        }
        obj = ((Data) (obj)).getLocationFromKey((String)keys.get(i));
        if (obj == null)
        {
            return "";
        } else
        {
            return ((LocationModel) (obj)).getAliasedName();
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (getActivity() instanceof IMapsListFragmentListener)
        {
            setMapsFragmentListener((IMapsListFragmentListener)getActivity());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        boolean flag;
        if (getArguments() != null)
        {
            flag = getArguments().getBoolean("isLastUpdate");
        } else
        {
            flag = false;
        }
        mIsLastUpdate = flag;
        mTitle = getString(com.accuweather.android.R.string.Maps).toUpperCase(getResources().getConfiguration().locale);
    }

    public void onReceive(Intent intent)
    {
label0:
        {
            if (intent.getAction().equals("accuwx.intent.action.UPDATE_FRAGMENT"))
            {
                intent = ((Intent) (intent.getExtras().get("fragment_payload")));
                if (!(intent instanceof Boolean))
                {
                    break label0;
                }
                mIsLastUpdate = ((Boolean)intent).booleanValue();
                updateView();
            }
            return;
        }
        updateView();
    }

    public void updateView()
    {
        if (!isInitialized())
        {
            return;
        } else
        {
            keys = Data.getInstance(getActivity()).getSortedKeysForMaps();
            setTitle(mTitle);
            super.updateView();
            return;
        }
    }

}
