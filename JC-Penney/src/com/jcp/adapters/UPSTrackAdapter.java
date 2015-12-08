// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jcp.model.trackorder.Carrier;
import com.jcp.model.trackorder.ShipmentActivity;
import com.jcp.model.trackorder.ShipmentLocation;
import com.jcp.model.trackorder.ShipmentPackage;
import com.jcp.pojo.TrackShipment;
import com.jcp.util.ae;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// Referenced classes of package com.jcp.adapters:
//            de

public class UPSTrackAdapter extends BaseExpandableListAdapter
{

    private static final String a = com/jcp/adapters/UPSTrackAdapter.getName();
    private static Activity b;
    private final LayoutInflater c;
    private Carrier d;
    private ShipmentPackage e[];
    private SparseBooleanArray f;

    public UPSTrackAdapter(Activity activity, TrackShipment trackshipment)
    {
        b = activity;
        e = trackshipment.getPackages();
        d = trackshipment.getCarrier();
        c = (LayoutInflater)b.getSystemService("layout_inflater");
        f = new SparseBooleanArray();
    }

    private int a(ShipmentPackage shipmentpackage)
    {
        String s;
        int k;
        k = 0x7f0201f4;
        s = shipmentpackage.getStatus();
        if (s == null) goto _L2; else goto _L1
_L1:
        s.hashCode();
        JVM INSTR lookupswitch 6: default 76
    //                   -2026635966: 197
    //                   -1750699932: 183
    //                   -1022350277: 169
    //                   1053377373: 127
    //                   1301036185: 155
    //                   1354900154: 141;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        int i = -1;
_L18:
        int j = k;
        i;
        JVM INSTR tableswitch 0 5: default 120
    //                   0 124
    //                   1 211
    //                   2 214
    //                   3 217
    //                   4 220
    //                   5 223;
           goto _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L11:
        break MISSING_BLOCK_LABEL_124;
_L10:
        j = k;
_L25:
        return j;
_L7:
        if (!s.equals("ORDER_PROCESSED")) goto _L3; else goto _L17
_L17:
        i = 0;
          goto _L18
_L9:
        if (!s.equals("PICKED_UP")) goto _L3; else goto _L19
_L19:
        i = 1;
          goto _L18
_L8:
        if (!s.equals("IN_TRANSIT")) goto _L3; else goto _L20
_L20:
        i = 2;
          goto _L18
_L6:
        if (!s.equals("OUT_FOR_DELIVERY")) goto _L3; else goto _L21
_L21:
        i = 3;
          goto _L18
_L5:
        if (!s.equals("DELIVERED")) goto _L3; else goto _L22
_L22:
        i = 4;
          goto _L18
_L4:
        if (!s.equals("DELAYED")) goto _L3; else goto _L23
_L23:
        i = 5;
          goto _L18
_L12:
        return 0x7f0201f5;
_L13:
        return 0x7f0201f6;
_L14:
        return 0x7f0201f7;
_L15:
        return 0x7f0201f8;
_L16:
        i = b(shipmentpackage);
        j = i;
        if (-1 != i) goto _L25; else goto _L24
_L24:
        return 0x7f0200ea;
_L2:
        return -1;
          goto _L18
    }

    static Activity a()
    {
        return b;
    }

    static SparseBooleanArray a(UPSTrackAdapter upstrackadapter)
    {
        return upstrackadapter.f;
    }

    private String a(String s)
    {
        try
        {
            s = (new SimpleDateFormat("MM/dd/yyyy")).parse(s);
            s = (new SimpleDateFormat("MM/yy")).format(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (s.getMessage() != null)
            {
                s = s.getMessage();
            } else
            {
                s = "";
            }
            ae.a(a, s);
            return "";
        }
        return s;
    }

    private void a(int i, ExpandableListView expandablelistview)
    {
        expandablelistview.expandGroup(i);
    }

    private void a(ShipmentPackage shipmentpackage, PackageItemViewHolder packageitemviewholder)
    {
        int i = a(shipmentpackage);
        packageitemviewholder.shipmentProgressView.setBackground(b.getResources().getDrawable(i));
    }

    private int b(ShipmentPackage shipmentpackage)
    {
        int i = shipmentpackage.getProgress();
        if (i >= 25)
        {
            if (i >= 25 && i < 50)
            {
                return 0x7f0200eb;
            }
            if (i >= 50 && i < 75)
            {
                return 0x7f0200ec;
            }
            if (i >= 75 && i < 100)
            {
                return 0x7f0200ed;
            }
            if (i >= 100)
            {
                return 0x7f0200ee;
            }
        }
        return 0x7f0200ea;
    }

    public ShipmentActivity a(int i, int j)
    {
        if (e != null && e[i].getActivity()[j] != null)
        {
            return e[i].getActivity()[j];
        } else
        {
            return null;
        }
    }

    public ShipmentPackage a(int i)
    {
        if (e != null && e[i] != null)
        {
            return e[i];
        } else
        {
            return null;
        }
    }

    public Object getChild(int i, int j)
    {
        return a(i, j);
    }

    public long getChildId(int i, int j)
    {
        return (long)j;
    }

    public View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup)
    {
        Object obj = a(i, j);
        if (view == null)
        {
            view = c.inflate(0x7f0300b1, viewgroup, false);
            viewgroup = new ActivityViewHolder(view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ActivityViewHolder)view.getTag();
        }
        if (obj != null)
        {
            ShipmentLocation shipmentlocation;
            if (!f.get(i, false))
            {
                ((ActivityViewHolder) (viewgroup)).chevronImageView.setImageDrawable(b.getResources().getDrawable(0x7f02018f));
            } else
            {
                ((ActivityViewHolder) (viewgroup)).chevronImageView.setImageDrawable(b.getResources().getDrawable(0x7f020190));
            }
            ((ActivityViewHolder) (viewgroup)).shippingStatus.setText(((ShipmentActivity) (obj)).getDescription());
            if (j == 0)
            {
                ((ActivityViewHolder) (viewgroup)).deliveredDateAndTime.setTypeface(null, 1);
            } else
            {
                ((ActivityViewHolder) (viewgroup)).deliveredDateAndTime.setTypeface(null, 0);
            }
            ((ActivityViewHolder) (viewgroup)).deliveredDateAndTime.setText((new StringBuilder()).append(((ShipmentActivity) (obj)).getDate()).append(", ").append(((ShipmentActivity) (obj)).getLocalTime()).toString());
            shipmentlocation = ((ShipmentActivity) (obj)).getLocation();
            obj = "";
            if (!TextUtils.isEmpty(shipmentlocation.getCity()))
            {
                obj = (new StringBuilder()).append("").append(shipmentlocation.getCity()).append(", ").toString();
            }
            obj = (new StringBuilder()).append(((String) (obj))).append(shipmentlocation.getCountry()).toString();
            ((ActivityViewHolder) (viewgroup)).deliveredLocation.setText(((CharSequence) (obj)));
        }
        ((ActivityViewHolder) (viewgroup)).chevronImageView.setOnClickListener(new de(this, i));
        if (flag)
        {
            ((ActivityViewHolder) (viewgroup)).chevronLayout.setVisibility(0);
            obj = a(i);
            ((ActivityViewHolder) (viewgroup)).additionalInfoLayout.setVisibility(0);
            ((ActivityViewHolder) (viewgroup)).shippingService.setText(((ShipmentPackage) (obj)).getService());
            ((ActivityViewHolder) (viewgroup)).type.setText(((ShipmentPackage) (obj)).getType());
            ((ActivityViewHolder) (viewgroup)).weight.setText((new StringBuilder()).append(((ShipmentPackage) (obj)).getWeight()).append(" ").append(((ShipmentPackage) (obj)).getWeightUnitOfMeasure()).toString());
            if (d != null)
            {
                ((ActivityViewHolder) (viewgroup)).contactNumber.setText(d.getPhoneNumber());
            }
            return view;
        } else
        {
            ((ActivityViewHolder) (viewgroup)).chevronLayout.setVisibility(8);
            ((ActivityViewHolder) (viewgroup)).additionalInfoLayout.setVisibility(8);
            return view;
        }
    }

    public int getChildrenCount(int i)
    {
        boolean flag = false;
        if (f.get(i, false))
        {
            int j = ((flag) ? 1 : 0);
            if (e != null)
            {
                j = ((flag) ? 1 : 0);
                if (e[i].getActivity() != null)
                {
                    j = e[i].getActivity().length;
                }
            }
            return j;
        } else
        {
            return 1;
        }
    }

    public Object getGroup(int i)
    {
        return a(i);
    }

    public int getGroupCount()
    {
        if (e != null)
        {
            return e.length;
        } else
        {
            return 0;
        }
    }

    public long getGroupId(int i)
    {
        return (long)i;
    }

    public View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup)
    {
        ShipmentPackage shipmentpackage = a(i);
        PackageItemViewHolder packageitemviewholder;
        View view1;
        if (view == null)
        {
            view1 = c.inflate(0x7f0300b3, viewgroup, false);
            packageitemviewholder = new PackageItemViewHolder(view1);
            view1.setTag(packageitemviewholder);
        } else
        {
            packageitemviewholder = (PackageItemViewHolder)view.getTag();
            view1 = view;
        }
        if (shipmentpackage != null)
        {
            packageitemviewholder.trackingNumber.setText(shipmentpackage.getTrackingNumber());
            String s = shipmentpackage.getStatus();
            String s1;
            if (s != null && s.equalsIgnoreCase(b.getString(0x7f070162)))
            {
                packageitemviewholder.scheduleLabel.setText(b.getString(0x7f070163));
            } else
            {
                packageitemviewholder.scheduleLabel.setText(b.getString(0x7f0701c0));
            }
            s1 = shipmentpackage.getDeliveryDayOfWeek();
            if (s != null && s.equalsIgnoreCase("OUT_FOR_DELIVERY"))
            {
                view = b.getString(0x7f070438);
            } else
            {
                String s2 = shipmentpackage.getDeliveryDate();
                view = s1;
                if (s1 != null)
                {
                    view = s1;
                    if (!TextUtils.isEmpty(s2))
                    {
                        view = (new StringBuilder()).append(s1).append(" ").append(a(s2)).toString();
                    }
                }
            }
            packageitemviewholder.deliveredDayAndDate.setText(view);
            if (s != null && s.equalsIgnoreCase("ORDER_PROCESSED"))
            {
                view = b.getString(0x7f070338);
            } else
            {
                view = s;
            }
            view = view.replace("_", " ");
            packageitemviewholder.status.setText(view);
            a(shipmentpackage, packageitemviewholder);
            s = shipmentpackage.getLeftAtPlace();
            if (!TextUtils.isEmpty(s))
            {
                view = s;
                if (!s.toLowerCase().startsWith(b.getString(0x7f07026b).toLowerCase()))
                {
                    view = (new StringBuilder()).append(b.getString(0x7f07026c)).append(" ").append(s).toString();
                }
            } else
            {
                view = "";
            }
            packageitemviewholder.leftAtPlace.setText(view);
        }
        a(i, (ExpandableListView)viewgroup);
        return view1;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isChildSelectable(int i, int j)
    {
        return false;
    }


    private class PackageItemViewHolder
    {

        protected TextView deliveredDayAndDate;
        protected TextView leftAtPlace;
        protected TextView scheduleLabel;
        protected ImageView shipmentProgressView;
        protected TextView status;
        protected TextView trackingNumber;

        public PackageItemViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }


    private class ActivityViewHolder
    {

        protected LinearLayout additionalInfoLayout;
        protected ImageView chevronImageView;
        protected LinearLayout chevronLayout;
        protected TextView contactNumber;
        protected TextView deliveredDateAndTime;
        protected TextView deliveredLocation;
        protected TextView shippingService;
        protected TextView shippingStatus;
        protected TextView type;
        protected TextView weight;

        void onPhoneClick()
        {
            k.a(contactNumber.getText().toString(), UPSTrackAdapter.a());
        }

        public ActivityViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
