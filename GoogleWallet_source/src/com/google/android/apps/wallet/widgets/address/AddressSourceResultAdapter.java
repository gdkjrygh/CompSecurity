// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.widgets.address:
//            AddressField, AddressSourceResult, AddressFormatter, AddressSource

public class AddressSourceResultAdapter extends BaseAdapter
    implements Filterable
{
    final class AddressSourceResultFilter extends Filter
    {

        final AddressSourceResultAdapter this$0;

        private static boolean contains(char ac[], char c)
        {
            if (ac != null)
            {
                int j = ac.length;
                int i = 0;
                while (i < j) 
                {
                    if (ac[i] == c)
                    {
                        return true;
                    }
                    i++;
                }
            }
            return false;
        }

        private boolean containsAllRemainingRequiredFields(com.google.location.country.NanoPostaladdress.PostalAddress postaladdress)
        {
            if (requiredFields != null)
            {
                char ac[] = requiredFields;
                int j = ac.length;
                int i = 0;
                while (i < j) 
                {
                    char c1 = ac[i];
                    char c = c1;
                    if (c1 == 'A')
                    {
                        c = '1';
                    }
                    if (contains(remainingFields, c) && TextUtils.isEmpty(AddressFormatter.formatAddressValue(postaladdress, c)))
                    {
                        return false;
                    }
                    i++;
                }
            }
            return true;
        }

        private boolean isBadAddress(com.google.location.country.NanoPostaladdress.PostalAddress postaladdress)
        {
            if (requiredFields != null && postaladdress.addressLine.length != 0) goto _L2; else goto _L1
_L1:
            boolean flag1 = false;
_L4:
            return flag1;
_L2:
            char ac[];
            int i;
            int j;
            boolean flag;
            flag = false;
            ac = requiredFields;
            j = ac.length;
            i = 0;
_L6:
            flag1 = flag;
            if (i >= j) goto _L4; else goto _L3
_L3:
            char c = ac[i];
            boolean flag2 = flag;
            switch (c)
            {
            default:
                flag2 = flag;
                if (AddressField.exists(c))
                {
                    flag2 = true;
                    if (!TextUtils.isEmpty(AddressFormatter.formatAddressValue(postaladdress, c)))
                    {
                        return false;
                    }
                }
                // fall through

            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 65: // 'A'
            case 78: // 'N'
                i++;
                flag = flag2;
                break;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        private ArrayList performFilteringForValues(CharSequence charsequence)
        {
            if (charsequence == null) goto _L2; else goto _L1
_L1:
            Iterator iterator = addressSources.iterator();
_L3:
            Object obj;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            obj = (AddressSource)iterator.next();
            List list = ((AddressSource) (obj)).getAddresses(charsequence, addressField, remainingFields, countryCode, languageCode);
            obj = processAddressSourceResults(list, ((AddressSource) (obj)).getName());
            if (obj != null && !((ArrayList) (obj)).isEmpty())
            {
                return ((ArrayList) (obj));
            }
            continue; /* Loop/switch isn't completed */
            Throwable throwable;
            throwable;
            String s = AddressSourceResultAdapter.TAG;
            obj = String.valueOf(((AddressSource) (obj)).getName());
            if (((String) (obj)).length() != 0)
            {
                obj = "Could not fetch addresses from ".concat(((String) (obj)));
            } else
            {
                obj = new String("Could not fetch addresses from ");
            }
            WLog.e(s, ((String) (obj)), throwable);
            if (true) goto _L3; else goto _L2
_L2:
            return new ArrayList();
        }

        private ArrayList processAddressSourceResults(List list, String s)
        {
            if (list != null) goto _L2; else goto _L1
_L1:
            list = null;
_L4:
            return list;
_L2:
            ArrayList arraylist = new ArrayList();
            Object obj = new LinkedHashMap();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Object obj1 = (AddressSourceResult)list.next();
                if (((AddressSourceResult) (obj1)).getAddress() != null)
                {
                    if (isBadAddress(((AddressSourceResult) (obj1)).getAddress()))
                    {
                        continue;
                    }
                    if (!containsAllRemainingRequiredFields(((AddressSourceResult) (obj1)).getAddress()))
                    {
                        obj1 = ((AddressSourceResult) (obj1)).getMatchingTerm();
                        if (!TextUtils.isEmpty(((CharSequence) (obj1))) && !((LinkedHashMap) (obj)).containsKey(obj1))
                        {
                            ((LinkedHashMap) (obj)).put(obj1, Integer.valueOf(arraylist.size()));
                        }
                        continue;
                    }
                }
                if (!TextUtils.isEmpty(((AddressSourceResult) (obj1)).getDescription()))
                {
                    arraylist.add(obj1);
                    if (!TextUtils.isEmpty(((AddressSourceResult) (obj1)).getMatchingTerm()))
                    {
                        ((LinkedHashMap) (obj)).put(((AddressSourceResult) (obj1)).getMatchingTerm(), Integer.valueOf(-1));
                    }
                }
            } while (true);
            list = arraylist;
            if (((LinkedHashMap) (obj)).isEmpty())
            {
                continue;
            }
            int i = 0;
            obj = ((LinkedHashMap) (obj)).entrySet().iterator();
            do
            {
                list = arraylist;
                if (!((Iterator) (obj)).hasNext())
                {
                    continue;
                }
                list = (java.util.Map.Entry)((Iterator) (obj)).next();
                int j = ((Integer)list.getValue()).intValue();
                if (j != -1)
                {
                    arraylist.add(j + i, new AddressSourceResult((String)list.getKey(), s));
                    i++;
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        private void publishResults(CharSequence charsequence, ArrayList arraylist)
        {
            lastPublishedConstraint = charsequence;
            addressSourceResults = arraylist;
            if (addressSourceResults != null && !addressSourceResults.isEmpty())
            {
                notifyDataSetChanged();
                return;
            } else
            {
                notifyDataSetInvalidated();
                return;
            }
        }

        public final CharSequence convertResultToString(Object obj)
        {
            if (obj instanceof AddressSourceResult)
            {
                return ((AddressSourceResult)obj).getMatchingTerm();
            } else
            {
                return super.convertResultToString(obj);
            }
        }

        protected final android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
        {
            charsequence = performFilteringForValues(charsequence);
            android.widget.Filter.FilterResults filterresults = new android.widget.Filter.FilterResults();
            filterresults.values = charsequence;
            filterresults.count = charsequence.size();
            return filterresults;
        }

        protected final void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
        {
            publishResults(charsequence, (ArrayList)filterresults.values);
        }

        AddressSourceResultFilter()
        {
            this$0 = AddressSourceResultAdapter.this;
            super();
        }
    }


    private static final String TAG = com/google/android/apps/wallet/widgets/address/AddressSourceResultAdapter.getSimpleName();
    private final char addressField;
    ArrayList addressSourceResults;
    private final List addressSources;
    private final String countryCode;
    private AddressSourceResultFilter filter;
    private final LayoutInflater inflater;
    private final String languageCode;
    CharSequence lastPublishedConstraint;
    final char remainingFields[];
    private final char requiredFields[];
    private final int textViewResourceId;

    public AddressSourceResultAdapter(Context context, int i, String s, String s1, char c, char ac[], String s2, 
            List list)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (ac != null && ac.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "remainingFields are required");
        if (list != null && !list.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "addressSources are required");
        textViewResourceId = i;
        countryCode = s;
        languageCode = s1;
        addressField = c;
        remainingFields = checkValidAddressFieldsAndCopy(ac);
        if (s2 != null)
        {
            s = s2.toCharArray();
        } else
        {
            s = null;
        }
        requiredFields = s;
        addressSources = new ArrayList(list);
        inflater = LayoutInflater.from(context);
        addressSourceResults = new ArrayList();
    }

    private static final char[] checkValidAddressFieldsAndCopy(char ac[])
    {
        int i;
        for (i = 0; i < ac.length && !AddressField.exists(ac[i]); i++) { }
        if (i < ac.length)
        {
            return Arrays.copyOfRange(ac, i, ac.length);
        } else
        {
            throw new IllegalArgumentException("fields must contain at least one valid field");
        }
    }

    private View getCustomView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = inflater.inflate(textViewResourceId, viewgroup, false);
        }
        view = getItem(i);
        ((TextView)view1.findViewById(0x1020014)).setText(view.getDescription());
        return view1;
    }

    private AddressSourceResult getItem(int i)
    {
        return (AddressSourceResult)addressSourceResults.get(i);
    }

    public int getCount()
    {
        return addressSourceResults.size();
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return getCustomView(i, view, viewgroup);
    }

    public Filter getFilter()
    {
        if (filter == null)
        {
            filter = new AddressSourceResultFilter();
        }
        return filter;
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return getCustomView(i, view, viewgroup);
    }







}
