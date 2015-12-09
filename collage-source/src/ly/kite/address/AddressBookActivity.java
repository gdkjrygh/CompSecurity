// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;
import ly.kite.journey.AKiteActivity;

// Referenced classes of package ly.kite.address:
//            Address, AddressSearchActivity, AddressEditActivity

public class AddressBookActivity extends AKiteActivity
{
    private static class AddressBookListAdaptor extends BaseAdapter
    {

        private List mAddressList;

        public int getCount()
        {
            return mAddressList.size();
        }

        public Object getItem(int i)
        {
            return mAddressList.get(i);
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
                view1 = ((LayoutInflater)viewgroup.getContext().getSystemService("layout_inflater")).inflate(ly.kite.R.layout.address_book_list_item, null);
            }
            view = (Address)getItem(i);
            ((TextView)view1.findViewById(0x1020014)).setText(view.getRecipientName());
            ((TextView)view1.findViewById(0x1020015)).setText(view.getDisplayAddressWithoutRecipient());
            return view1;
        }

        AddressBookListAdaptor(Context context)
        {
            mAddressList = Address.getAddressBook(context);
        }
    }


    public static final String EXTRA_ADDRESS = "ly.kite.EXTRA_ADDRESS";
    private static final String LOG_TAG = "AddressBookActivity";
    private static final int REQUEST_CODE_ADD_ADDRESS = 0;
    private AddressBookListAdaptor mAddressBookListAdaptor;
    private ListView mAddressBookListView;
    private TextView mEmptyMessageTextView;

    public AddressBookActivity()
    {
    }

    private void updateScreen()
    {
        mAddressBookListAdaptor = new AddressBookListAdaptor(this);
        mAddressBookListView.setAdapter(mAddressBookListAdaptor);
        if (mAddressBookListAdaptor.getCount() > 0)
        {
            mEmptyMessageTextView.setVisibility(8);
        } else
        {
            mEmptyMessageTextView.setVisibility(0);
        }
        mAddressBookListView.setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() {

            final AddressBookActivity this$0;

            public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
            {
                Object obj = (Address)mAddressBookListAdaptor.getItem((int)l);
                adapterview = new android.app.AlertDialog.Builder(AddressBookActivity.this);
                view = adapterview.setTitle(((Address) (obj)).toString());
            /* block-local class not found */
            class _cls1 {}

                obj = new _cls1(((Address) (obj)));
                view.setItems(new String[] {
                    "Edit Address", "Delete Address"
                }, ((android.content.DialogInterface.OnClickListener) (obj)));
                adapterview.create().show();
                return true;
            }

            
            {
                this$0 = AddressBookActivity.this;
                super();
            }
        });
        mAddressBookListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final AddressBookActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (Address)mAddressBookListAdaptor.getItem((int)l);
                view = new Intent();
                view.putExtra("ly.kite.EXTRA_ADDRESS", adapterview);
                setResult(-1, view);
                finish();
            }

            
            {
                this$0 = AddressBookActivity.this;
                super();
            }
        });
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 0 && j == -1)
        {
            ((Address)intent.getParcelableExtra("ly.kite.EXTRA_ADDRESS")).saveToAddressBook(this);
            updateScreen();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(ly.kite.R.layout.screen_address_book);
        mAddressBookListView = (ListView)findViewById(ly.kite.R.id.address_book_list_view);
        mEmptyMessageTextView = (TextView)findViewById(ly.kite.R.id.empty_message_text_view);
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.setDisplayHomeAsUpEnabled(true);
        }
        updateScreen();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(ly.kite.R.menu.address_book, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == 0x102002c)
        {
            finish();
            return true;
        }
        if (i == ly.kite.R.id.search_for_address)
        {
            startActivityForResult(new Intent(this, ly/kite/address/AddressSearchActivity), 0);
            return true;
        }
        if (i == ly.kite.R.id.manual_add_address)
        {
            startActivityForResult(new Intent(this, ly/kite/address/AddressEditActivity), 0);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }


}
