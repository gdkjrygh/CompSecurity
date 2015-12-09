// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package ly.kite.address:
//            AddressSearchRequestListener, AddressSearchRequest, Country, Address, 
//            AddressEditActivity

public class AddressSearchActivity extends Activity
    implements android.app.ActionBar.OnNavigationListener, AddressSearchRequestListener
{
    private static class AddressSearchResultAdapter extends BaseAdapter
    {

        private List addresses;

        public int getCount()
        {
            if (addresses == null)
            {
                return 0;
            } else
            {
                return addresses.size();
            }
        }

        public Object getItem(int i)
        {
            return addresses.get(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = ((LayoutInflater)viewgroup.getContext().getSystemService("layout_inflater")).inflate(ly.kite.R.layout.address_search_result_list_item, null);
            }
            view = (Address)getItem(i);
            ((TextView)view1.findViewById(0x1020014)).setText(view.toString());
            return view1;
        }

        public void setAddresses(List list)
        {
            addresses = list;
            notifyDataSetInvalidated();
        }

        private AddressSearchResultAdapter()
        {
        }

    }


    private static final int REQUEST_CODE_ADDRESS = 0;
    private static final String STATE_SELECTED_NAVIGATION_ITEM = "selected_navigation_item";
    private AddressSearchRequest inProgressAddressSearchReq;
    private SearchView searchView;

    public AddressSearchActivity()
    {
    }

    private void searchForAddressDetails(Address address)
    {
        if (inProgressAddressSearchReq != null)
        {
            inProgressAddressSearchReq.cancelSearch();
            inProgressAddressSearchReq = null;
        }
        final ProgressDialog dialog = new ProgressDialog(this);
        dialog.setTitle("Fetching Details");
        dialog.setMessage("Fetching address details");
        dialog.show();
        dialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final AddressSearchActivity this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                if (inProgressAddressSearchReq != null)
                {
                    inProgressAddressSearchReq.cancelSearch();
                    inProgressAddressSearchReq = null;
                }
            }

            
            {
                this$0 = AddressSearchActivity.this;
                super();
            }
        });
        inProgressAddressSearchReq = new AddressSearchRequest();
        inProgressAddressSearchReq.search(this, address, new AddressSearchRequestListener() {

            final AddressSearchActivity this$0;
            final ProgressDialog val$dialog;

            public void onError(AddressSearchRequest addresssearchrequest, Exception exception)
            {
                dialog.dismiss();
                AddressSearchActivity.this.onError(addresssearchrequest, exception);
            }

            public void onMultipleChoices(AddressSearchRequest addresssearchrequest, List list)
            {
                dialog.dismiss();
                AddressSearchActivity.this.onMultipleChoices(addresssearchrequest, list);
            }

            public void onUniqueAddress(AddressSearchRequest addresssearchrequest, Address address1)
            {
                dialog.dismiss();
                addresssearchrequest = new Intent(AddressSearchActivity.this, ly/kite/address/AddressEditActivity);
                addresssearchrequest.putExtra("ly.kite.EXTRA_ADDRESS", address1);
                startActivityForResult(addresssearchrequest, 0);
            }

            
            {
                this$0 = AddressSearchActivity.this;
                dialog = progressdialog;
                super();
            }
        });
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 0 && j == -1)
        {
            setResult(j, intent);
            finish();
        }
    }

    protected void onCreate(final Bundle addressSearchResults)
    {
        super.onCreate(addressSearchResults);
        setContentView(ly.kite.R.layout.screen_address_search);
        addressSearchResults = getActionBar();
        addressSearchResults.setDisplayShowTitleEnabled(false);
        addressSearchResults.setNavigationMode(1);
        addressSearchResults.setListNavigationCallbacks(new ArrayAdapter(this, ly.kite.R.layout.spinner_item_country, 0x1020014, Country.values()), this);
        addressSearchResults.setSelectedNavigationItem(Country.getInstance(Locale.getDefault()).ordinal());
        addressSearchResults.setDisplayHomeAsUpEnabled(true);
        addressSearchResults = (ListView)findViewById(ly.kite.R.id.list_view_address_search_results);
        addressSearchResults.setAdapter(new AddressSearchResultAdapter());
        addressSearchResults.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final AddressSearchActivity this$0;
            final ListView val$addressSearchResults;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (Address)addressSearchResults.getAdapter().getItem((int)l);
                if (adapterview.isSearchRequiredForFullDetails())
                {
                    searchForAddressDetails(adapterview);
                    return;
                } else
                {
                    view = new Intent(AddressSearchActivity.this, ly/kite/address/AddressEditActivity);
                    view.putExtra("ly.kite.EXTRA_ADDRESS", adapterview);
                    startActivityForResult(view, 0);
                    return;
                }
            }

            
            {
                this$0 = AddressSearchActivity.this;
                addressSearchResults = listview;
                super();
            }
        });
        TextView textview = (TextView)findViewById(ly.kite.R.id.empty);
        addressSearchResults.setEmptyView(textview);
        textview.setText(ly.kite.R.string.address_search_prompt);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(ly.kite.R.menu.address_search, menu);
        searchView = (SearchView)menu.findItem(ly.kite.R.id.search).getActionView();
        menu = Country.values()[getActionBar().getSelectedNavigationIndex()];
        searchView.setQueryHint((new StringBuilder()).append("Search ").append(menu.displayName()).toString());
        searchView.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener() {

            final AddressSearchActivity this$0;

            public boolean onQueryTextChange(String s)
            {
                if (inProgressAddressSearchReq != null)
                {
                    inProgressAddressSearchReq.cancelSearch();
                    inProgressAddressSearchReq = null;
                }
                if (s.trim().length() == 0)
                {
                    ((AddressSearchResultAdapter)((ListView)findViewById(ly.kite.R.id.list_view_address_search_results)).getAdapter()).setAddresses(null);
                    ((TextView)findViewById(ly.kite.R.id.empty)).setText("Search for addresses above");
                    return true;
                } else
                {
                    inProgressAddressSearchReq = new AddressSearchRequest();
                    Country country = Country.values()[getActionBar().getSelectedNavigationIndex()];
                    inProgressAddressSearchReq.search(AddressSearchActivity.this, s, country, AddressSearchActivity.this);
                    return true;
                }
            }

            public boolean onQueryTextSubmit(String s)
            {
                return true;
            }

            
            {
                this$0 = AddressSearchActivity.this;
                super();
            }
        });
        return true;
    }

    public void onError(AddressSearchRequest addresssearchrequest, Exception exception)
    {
        addresssearchrequest = new android.app.AlertDialog.Builder(this);
        addresssearchrequest.setTitle("Oops!").setMessage(exception.getMessage()).setPositiveButton("OK", null);
        addresssearchrequest.create().show();
    }

    public void onMultipleChoices(AddressSearchRequest addresssearchrequest, List list)
    {
        if (list.size() == 0)
        {
            ((TextView)findViewById(ly.kite.R.id.empty)).setText("No results found");
        }
        ((AddressSearchResultAdapter)((ListView)findViewById(ly.kite.R.id.list_view_address_search_results)).getAdapter()).setAddresses(list);
    }

    public boolean onNavigationItemSelected(int i, long l)
    {
        Country country = Country.values()[(int)l];
        if (searchView != null)
        {
            searchView.setQueryHint((new StringBuilder()).append("Search ").append(country.displayName()).toString());
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        if (bundle.containsKey("selected_navigation_item"))
        {
            getActionBar().setSelectedNavigationItem(bundle.getInt("selected_navigation_item"));
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putInt("selected_navigation_item", getActionBar().getSelectedNavigationIndex());
    }

    public void onUniqueAddress(AddressSearchRequest addresssearchrequest, Address address)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(address);
        onMultipleChoices(addresssearchrequest, arraylist);
    }




/*
    static AddressSearchRequest access$202(AddressSearchActivity addresssearchactivity, AddressSearchRequest addresssearchrequest)
    {
        addresssearchactivity.inProgressAddressSearchReq = addresssearchrequest;
        return addresssearchrequest;
    }

*/
}
