// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.app.Activity;
import android.content.Context;
import com.pinterest.base.PermissionUtil;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.activity.BaseActivity;
import java.util.Map;

public class CommerceAddressManager
{

    private static final Map states = new _cls1();
    private final Activity activity;
    private final Context context;

    public CommerceAddressManager(Context context1, Activity activity1)
    {
        context = context1;
        activity = activity1;
    }

    public void acquireAddressBookPermission(final ContactPermissionChangedListener contactPermissionChangedListener)
    {
        if (contactPermissionChangedListener == null)
        {
            return;
        } else
        {
            PermissionUtil.checkPermissionAsync((BaseActivity)activity, "android.permission.READ_CONTACTS", 0x7f07011f, new _cls2());
            return;
        }
    }

    public void asyncFetchAddressItems(final AddressItemsFetchedListener addressItemsFetchedListener)
    {
        (new _cls3()).execute();
    }

    public boolean hasAddressBookPermission()
    {
        return PermissionUtil.checkPermission(context, "android.permission.READ_CONTACTS");
    }




    private class _cls2
        implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    {

        final CommerceAddressManager this$0;
        final ContactPermissionChangedListener val$contactPermissionChangedListener;

        public void onRequestPermissionsResult(int i, String as[], int ai[])
        {
            contactPermissionChangedListener.onContactPermissionChanged(hasAddressBookPermission());
        }

        _cls2()
        {
            this$0 = CommerceAddressManager.this;
            contactPermissionChangedListener = contactpermissionchangedlistener;
            super();
        }

        private class ContactPermissionChangedListener
        {

            public abstract void onContactPermissionChanged(boolean flag);
        }

    }


    private class _cls3 extends BackgroundTask
    {

        ArrayList contactAddressItems;
        final CommerceAddressManager this$0;
        final AddressItemsFetchedListener val$addressItemsFetchedListener;

        public void onFinish()
        {
            if (addressItemsFetchedListener != null)
            {
                addressItemsFetchedListener.onAddressItemsFetched(contactAddressItems);
            }
        }

        public void run()
        {
            contactAddressItems = ContactsProvider.getContactsWithAddress(context);
            Iterator iterator = contactAddressItems.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ContactAddressItem contactaddressitem = (ContactAddressItem)iterator.next();
                try
                {
                    if (!Strings.isNullOrEmpty(contactaddressitem.getStreetAddress1()) && Strings.isNullOrEmpty(contactaddressitem.getCity()) && Strings.isNullOrEmpty(contactaddressitem.getState()) && Strings.isNullOrEmpty(contactaddressitem.getZipCode()))
                    {
                        Object obj = (new Geocoder(context)).getFromLocationName(contactaddressitem.getStreetAddress1(), 1);
                        if (!((List) (obj)).isEmpty())
                        {
                            obj = (Address)((List) (obj)).get(0);
                            StringBuilder stringbuilder = new StringBuilder();
                            if (!Strings.isNullOrEmpty(((Address) (obj)).getSubThoroughfare()))
                            {
                                stringbuilder.append(((Address) (obj)).getSubThoroughfare()).append(" ");
                            }
                            if (!Strings.isNullOrEmpty(((Address) (obj)).getThoroughfare()))
                            {
                                stringbuilder.append(((Address) (obj)).getThoroughfare());
                            }
                            contactaddressitem.setStreetAddress1(stringbuilder.toString());
                            if (!Strings.isNullOrEmpty(((Address) (obj)).getLocality()))
                            {
                                contactaddressitem.setCity(((Address) (obj)).getLocality());
                            }
                            if (!Strings.isNullOrEmpty(((Address) (obj)).getAdminArea()))
                            {
                                contactaddressitem.setState((String)CommerceAddressManager.states.get(((Address) (obj)).getAdminArea().toLowerCase()));
                            }
                            if (!Strings.isNullOrEmpty(((Address) (obj)).getPostalCode()))
                            {
                                contactaddressitem.setZipCode(((Address) (obj)).getPostalCode());
                            }
                        }
                    }
                }
                catch (IOException ioexception) { }
                if (!Strings.isNullOrEmpty(contactaddressitem.getState()))
                {
                    if (contactaddressitem.getState().length() != 2)
                    {
                        contactaddressitem.setState((String)CommerceAddressManager.states.get(contactaddressitem.getState().toLowerCase()));
                    } else
                    {
                        contactaddressitem.setState(contactaddressitem.getState().toUpperCase());
                    }
                }
            } while (true);
        }

        _cls3()
        {
            this$0 = CommerceAddressManager.this;
            addressItemsFetchedListener = addressitemsfetchedlistener;
            super();
        }

        private class AddressItemsFetchedListener
        {

            public abstract void onAddressItemsFetched(ArrayList arraylist);
        }

    }


    private class _cls1 extends HashMap
    {

        _cls1()
        {
            put("alabama", "AL");
            put("alaska", "AK");
            put("alberta", "AB");
            put("american samoa", "AS");
            put("arizona", "AZ");
            put("arkansas", "AR");
            put("armed forces", "AE");
            put("armed forces (ae)", "AE");
            put("armed forces americas", "AA");
            put("armed forces pacific", "AP");
            put("british columbia", "BC");
            put("california", "CA");
            put("colorado", "CO");
            put("connecticut", "CT");
            put("delaware", "DE");
            put("district of columbia", "DC");
            put("florida", "FL");
            put("georgia", "GA");
            put("guam", "GU");
            put("hawaii", "HI");
            put("idaho", "ID");
            put("illinois", "IL");
            put("indiana", "IN");
            put("iowa", "IA");
            put("kansas", "KS");
            put("kentucky", "KY");
            put("louisiana", "LA");
            put("maine", "ME");
            put("manitoba", "MB");
            put("maryland", "MD");
            put("massachusetts", "MA");
            put("michigan", "MI");
            put("minnesota", "MN");
            put("mississippi", "MS");
            put("missouri", "MO");
            put("montana", "MT");
            put("nebraska", "NE");
            put("nevada", "NV");
            put("new brunswick", "NB");
            put("new hampshire", "NH");
            put("new jersey", "NJ");
            put("new mexico", "NM");
            put("new york", "NY");
            put("newfoundland", "NF");
            put("north carolina", "NC");
            put("north dakota", "ND");
            put("northwest territories", "NT");
            put("nova scotia", "NS");
            put("nunavut", "NU");
            put("ohio", "OH");
            put("oklahoma", "OK");
            put("ontario", "ON");
            put("oregon", "OR");
            put("pennsylvania", "PA");
            put("prince edward island", "PE");
            put("puerto rico", "PR");
            put("quebec", "PQ");
            put("rhode island", "RI");
            put("saskatchewan", "SK");
            put("south carolina", "SC");
            put("south dakota", "SD");
            put("tennessee", "TN");
            put("texas", "TX");
            put("utah", "UT");
            put("vermont", "VT");
            put("virgin islands", "VI");
            put("virginia", "VA");
            put("washington", "WA");
            put("west virginia", "WV");
            put("wisconsin", "WI");
            put("wyoming", "WY");
            put("yukon territory", "YT");
        }
    }

}
