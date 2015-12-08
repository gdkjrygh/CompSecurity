// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.app.AlertDialog;
import android.database.Cursor;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;
import com.bricolsoftconsulting.geocoderplus.Address;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.thetransitapp.droid.BaseMapScreen;
import com.thetransitapp.droid.controller.FeedManager;
import com.thetransitapp.droid.model.RoutingRequest;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.service.GeocoderTask;
import com.thetransitapp.droid.service.ReverseGeocoderTask;
import com.thetransitapp.droid.service.ServiceCallback;
import java.text.NumberFormat;
import java.util.Date;

// Referenced classes of package com.thetransitapp.droid.widget:
//            PlacesAutoCompleteAdapter, SuggestionTextView, DateTimeDialog

public class RoutingSearch extends BaseMapScreen
    implements com.google.android.gms.maps.GoogleMap.OnMapLongClickListener, com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener, DateTimeDialog.OnDateTimePickedListener, android.widget.AdapterView.OnItemClickListener
{
    public static interface RoutingSearchDelegate
    {

        public abstract void routeButtonStatusChange(boolean flag, boolean flag1, boolean flag2);

        public abstract void shouldClearItineraries();
    }


    private boolean arriveBy;
    private RoutingSearchDelegate _flddelegate;
    private MarkerOptions end;
    private PlacesAutoCompleteAdapter endAutoComplete;
    private Marker endMarker;
    private BitmapDescriptor endPin;
    private SuggestionTextView endSearch;
    private FeedManager feedManager;
    private MarkerOptions start;
    private PlacesAutoCompleteAdapter startAutoComplete;
    private Marker startMarker;
    private BitmapDescriptor startPin;
    private SuggestionTextView startSearch;
    private Date tripDate;

    public RoutingSearch()
    {
        startPin = null;
        endPin = null;
        tripDate = null;
    }

    private SimplePlacemark getPlace(MarkerOptions markeroptions)
    {
        Object obj = null;
        SimplePlacemark simpleplacemark = obj;
        if (markeroptions != null)
        {
            simpleplacemark = obj;
            if (markeroptions.getPosition().latitude != 0.0D)
            {
                simpleplacemark = new SimplePlacemark(markeroptions.getPosition());
                simpleplacemark.setName(markeroptions.getSnippet());
            }
        }
        return simpleplacemark;
    }

    private boolean shouldEnableRouteButton()
    {
        return start != null && start.getPosition().latitude != 0.0D && end != null && end.getPosition().latitude != 0.0D;
    }

    private void showMarkers(boolean flag)
    {
        if (super.getMap() != null)
        {
            Object obj = LatLngBounds.builder();
            int i = 0;
            if (start.getPosition().latitude != 0.0D)
            {
                Object obj1;
                int j;
                if (startMarker != null)
                {
                    startMarker.setPosition(start.getPosition());
                } else
                {
                    startMarker = getMap().addMarker(start);
                    startMarker.setSnippet(null);
                }
                ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).include(start.getPosition());
                i = 0 + 1;
            }
            j = i;
            if (end.getPosition().latitude != 0.0D)
            {
                if (endMarker != null)
                {
                    endMarker.setPosition(end.getPosition());
                } else
                {
                    endMarker = getMap().addMarker(end);
                    endMarker.setSnippet(null);
                }
                ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).include(end.getPosition());
                j = i + 1;
            }
            if (j > 0)
            {
                obj = ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).build();
                obj1 = ((LatLngBounds) (obj)).getCenter();
                startAutoComplete.setLocation(((LatLng) (obj1)));
                endAutoComplete.setLocation(((LatLng) (obj1)));
                if (flag)
                {
                    obj1 = new DisplayMetrics();
                    super.getActivity().getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj1)));
                    i = ((DisplayMetrics) (obj1)).heightPixels;
                    j = startSearch.getMeasuredHeight();
                    super.centerMap(((LatLngBounds) (obj)), false, ((DisplayMetrics) (obj1)).widthPixels, i - j * 6);
                    return;
                }
            }
        }
    }

    public RoutingSearchDelegate getDelegate()
    {
        return _flddelegate;
    }

    public MarkerOptions getEnd()
    {
        return end;
    }

    public RoutingRequest getRoutingRequest()
    {
        SimplePlacemark simpleplacemark = getPlace(start);
        SimplePlacemark simpleplacemark1 = getPlace(end);
        Object obj = null;
        RoutingRequest routingrequest = obj;
        if (simpleplacemark != null)
        {
            routingrequest = obj;
            if (simpleplacemark1 != null)
            {
                routingrequest = new RoutingRequest();
                if (tripDate == null)
                {
                    routingrequest.setDate(new Date());
                } else
                {
                    routingrequest.setDate(tripDate);
                    routingrequest.setArriveBy(arriveBy);
                }
                routingrequest.setStart(simpleplacemark);
                routingrequest.setEnd(simpleplacemark1);
            }
        }
        return routingrequest;
    }

    public MarkerOptions getStart()
    {
        return start;
    }

    public void onAddressReceived(View view, Address address)
    {
        if (address != null && isVisible())
        {
            address = new SimplePlacemark(address.getLatitude(), address.getLongitude());
            if (view == startSearch)
            {
                start.position(address.toLatLng());
                feedManager.refresh(address.toLocation(), view.getContext());
            } else
            {
                end.position(address.toLatLng());
            }
            if (_flddelegate != null)
            {
                boolean flag = shouldEnableRouteButton();
                if (flag)
                {
                    super.hideKeyboard();
                }
                _flddelegate.routeButtonStatusChange(flag, false, true);
            }
            showMarkers(true);
        } else
        if (isVisible() && getActivity() != null)
        {
            view = (new android.app.AlertDialog.Builder(view.getContext())).create();
            view.setTitle(getText(0x7f0a005a));
            view.setMessage(getText(0x7f0a0059));
            view.setButton(-1, getText(0x7f0a002f), null);
            view.show();
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return super.createViewIfNeeded(layoutinflater, viewgroup, 0x7f030025);
    }

    public void onDateTimePicked(Date date, boolean flag)
    {
        tripDate = date;
        arriveBy = flag;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (super.getMap() != null)
        {
            final SuggestionTextView textView;
            int j;
            if (adapterview.getAdapter() == startAutoComplete)
            {
                adapterview = startAutoComplete.getCursor();
                textView = startSearch;
                view = start;
            } else
            {
                adapterview = endAutoComplete.getCursor();
                textView = endSearch;
                view = end;
            }
            adapterview.moveToPosition(i);
            i = adapterview.getColumnIndex("suggest_text_1");
            j = adapterview.getColumnIndex("suggest_text_2");
            view.snippet(adapterview.getString(i));
            textView.setText(view.getSnippet(), false);
            (new GeocoderTask(super.getActivity(), new com.thetransitapp.droid.service.GeocoderTask.GeocoderTaskCallback() {

                final RoutingSearch this$0;
                private final SuggestionTextView val$textView;

                public void onAddressReceived(Address address)
                {
                    RoutingSearch.this.onAddressReceived(textView, address);
                }

            
            {
                this$0 = RoutingSearch.this;
                textView = suggestiontextview;
                super();
            }
            })).execute(new String[] {
                adapterview.getString(j)
            });
        }
    }

    public void onMapLongClick(LatLng latlng)
    {
        if (!startSearch.hasFocus()) goto _L2; else goto _L1
_L1:
        start.position(latlng);
        reverseGeocode(startSearch, start);
        feedManager.refresh((new SimplePlacemark(latlng)).toLocation(), super.getActivity());
_L4:
        super.hideKeyboard();
        showMarkers(false);
        _flddelegate.routeButtonStatusChange(shouldEnableRouteButton(), false, false);
        return;
_L2:
        if (endSearch.hasFocus())
        {
            end.position(latlng);
            reverseGeocode(endSearch, end);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0)
        {
            onSwitchClick();
        } else
        if (menuitem.getItemId() == 1)
        {
            menuitem = new DateTimeDialog();
            menuitem.setDateTimePickedListener(this);
            menuitem.setArriveBy(arriveBy);
            if (tripDate != null)
            {
                menuitem.setDate(tripDate);
            }
            menuitem.show(super.getFragmentManager(), "dateTimePicker");
            return true;
        }
        return true;
    }

    public void onPause()
    {
        super.onPause();
        if (_flddelegate != null)
        {
            _flddelegate.routeButtonStatusChange(shouldEnableRouteButton(), true, false);
        }
        if (super.getMap() != null)
        {
            super.getMap().setOnMapLongClickListener(null);
            if (startMarker != null)
            {
                startMarker.remove();
                startMarker = null;
            }
            if (endMarker != null)
            {
                endMarker.remove();
                endMarker = null;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        if (super.getMap() != null)
        {
            Bundle bundle = super.getArguments();
            if (_flddelegate != null && (bundle == null || !bundle.getBoolean("oldDirectionLoaded", false)))
            {
                _flddelegate.shouldClearItineraries();
                _flddelegate.routeButtonStatusChange(shouldEnableRouteButton(), false, false);
                super.getMap().setOnMapLongClickListener(this);
                Object obj1 = start;
                SuggestionTextView suggestiontextview = startSearch;
                Object obj = bundle.getString("from");
                String s = bundle.getString("to");
                if (obj != null && !((String) (obj)).equals("myl"))
                {
                    String as[] = ((String) (obj)).split("@");
                    if (as.length > 1)
                    {
                        start.snippet(as[0]);
                        String as1[] = as[1].split(",");
                        if (as1.length == 2)
                        {
                            start.position(new LatLng(Double.parseDouble(as1[0]), Double.parseDouble(as1[1])));
                            start.snippet(as[0]);
                            startSearch.setText(as[0], false);
                        }
                    }
                }
                MarkerOptions markeroptions = ((MarkerOptions) (obj1));
                as = suggestiontextview;
                if (s != null)
                {
                    if (!s.equals("myl"))
                    {
                        String as2[] = s.split("@");
                        markeroptions = ((MarkerOptions) (obj1));
                        as = suggestiontextview;
                        if (as2.length > 1)
                        {
                            end.snippet(as2[0]);
                            String as3[] = as2[1].split(",");
                            markeroptions = ((MarkerOptions) (obj1));
                            as = suggestiontextview;
                            if (as3.length == 2)
                            {
                                end.position(new LatLng(Double.parseDouble(as3[0]), Double.parseDouble(as3[1])));
                                end.snippet(as2[0]);
                                endSearch.setText(as2[0], false);
                                as = suggestiontextview;
                                markeroptions = ((MarkerOptions) (obj1));
                            }
                        }
                    } else
                    {
                        markeroptions = end;
                        as = endSearch;
                    }
                }
                obj1 = super.getLastLocation();
                if (obj1 != null)
                {
                    startAutoComplete.setCurrent(new LatLng(((Location) (obj1)).getLatitude(), ((Location) (obj1)).getLongitude()));
                    endAutoComplete.setCurrent(new LatLng(((Location) (obj1)).getLatitude(), ((Location) (obj1)).getLongitude()));
                }
                if (markeroptions == null || markeroptions.getPosition().latitude == 0.0D)
                {
                    if (obj1 != null)
                    {
                        markeroptions.position(new LatLng(((Location) (obj1)).getLatitude(), ((Location) (obj1)).getLongitude()));
                        reverseGeocode(as, markeroptions);
                        if (as == startSearch)
                        {
                            endSearch.requestFocus();
                            as = endSearch;
                        } else
                        {
                            startSearch.requestFocus();
                            as = startSearch;
                        }
                    } else
                    {
                        as.setText(markeroptions.getSnippet(), false);
                        as.requestFocus();
                    }
                    super.showKeyboard(as);
                }
            }
            showMarkers(false);
            if (bundle != null)
            {
                bundle.putBoolean("oldDirectionLoaded", false);
            }
        }
        super.getSherlockActivity().getSupportActionBar().setHomeButtonEnabled(false);
    }

    public void onStart()
    {
        super.onStart();
        super.getSherlockActivity().getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        if (super.getMap() != null)
        {
            if (startPin == null || endPin == null)
            {
                startPin = BitmapDescriptorFactory.defaultMarker(120F);
                endPin = BitmapDescriptorFactory.defaultMarker(0.0F);
            }
            if (start == null)
            {
                start = (new MarkerOptions()).icon(startPin).position(new LatLng(0.0D, 0.0D)).snippet("");
            }
            if (end == null)
            {
                end = (new MarkerOptions()).icon(endPin).position(new LatLng(0.0D, 0.0D)).snippet("");
                return;
            }
        }
    }

    public void onSwitchClick()
    {
        if (start != null && end != null)
        {
            LatLng latlng = start.getPosition();
            String s = start.getSnippet();
            start.position(end.getPosition());
            start.snippet(end.getSnippet());
            end.position(latlng);
            end.snippet(s);
            startSearch.setText(start.getSnippet(), false);
            endSearch.setText(end.getSnippet(), false);
            showMarkers(false);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        startAutoComplete = new PlacesAutoCompleteAdapter(super.getSherlockActivity().getSupportActionBar().getThemedContext(), 0x1090003);
        startSearch.setAdapter(startAutoComplete);
        startSearch.setOnItemClickListener(this);
        endAutoComplete = new PlacesAutoCompleteAdapter(super.getSherlockActivity().getSupportActionBar().getThemedContext(), 0x1090003);
        endSearch.setAdapter(endAutoComplete);
        endSearch.setOnItemClickListener(this);
    }

    public void reverseGeocode(final SuggestionTextView textView, final MarkerOptions options)
    {
        NumberFormat numberformat = NumberFormat.getNumberInstance();
        numberformat.setMaximumFractionDigits(6);
        textView.setText((new StringBuilder(String.valueOf(numberformat.format(options.getPosition().latitude)))).append(", ").append(numberformat.format(options.getPosition().longitude)).toString(), false);
        options.snippet("");
        (new ReverseGeocoderTask(super.getActivity(), new ServiceCallback() {

            final RoutingSearch this$0;
            private final MarkerOptions val$options;
            private final SuggestionTextView val$textView;

            public void onError(String s, Exception exception)
            {
            }

            public volatile void onResult(Object obj)
            {
                onResult((String)obj);
            }

            public void onResult(String s)
            {
                if (s != null && textView != null)
                {
                    textView.setText(s, false);
                    textView.dismissDropDown();
                    options.snippet(s);
                    boolean flag = shouldEnableRouteButton();
                    if (flag)
                    {
                        hideKeyboard();
                        _flddelegate.routeButtonStatusChange(flag, false, true);
                    }
                }
            }

            
            {
                this$0 = RoutingSearch.this;
                textView = suggestiontextview;
                options = markeroptions;
                super();
            }
        })).execute(new LatLng[] {
            options.getPosition()
        });
    }

    public void setDelegate(RoutingSearchDelegate routingsearchdelegate)
    {
        _flddelegate = routingsearchdelegate;
    }


}
