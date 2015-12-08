// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.kohls.mcommerce.opal.wallet.fragment.DisplayActivityList;
import com.kohls.mcommerce.opal.wallet.rest.containers.FilterObj;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.util.ArrayList;

public class FilterActivity extends Activity
    implements android.widget.AdapterView.OnItemClickListener
{
    private class FilterAdapter extends BaseAdapter
    {

        private Context context;
        private ArrayList filters;
        private FilterViewHolder mHolder;
        final FilterActivity this$0;

        public int getCount()
        {
            return filters.size();
        }

        public Object getItem(int i)
        {
            return filters.get(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = (LayoutInflater)context.getSystemService("layout_inflater");
        /* block-local class not found */
        class FilterViewHolder {}

            String s;
            if (view == null)
            {
                mHolder = new FilterViewHolder();
                view = viewgroup.inflate(0x7f030068, null);
                FilterViewHolder.access._mth302(mHolder, (TextView)view.findViewById(0x7f0d023b));
                FilterViewHolder.access._mth402(mHolder, (TextView)view.findViewById(0x7f0d023c));
                FilterViewHolder.access._mth502(mHolder, (ImageView)view.findViewById(0x7f0d023d));
                view.setTag(mHolder);
            } else
            {
                mHolder = (FilterViewHolder)view.getTag();
            }
            viewgroup = ((FilterObj)filters.get(i)).getFilterName();
            s = ((FilterObj)filters.get(i)).getFilterValue();
            if (TextUtils.isEmpty(viewgroup))
            {
                FilterViewHolder.access._mth300(mHolder).setVisibility(8);
                if (getIntent().getStringExtra("filter").equalsIgnoreCase("type") && i == mTypeFilterPosition || getIntent().getStringExtra("filter").equalsIgnoreCase("view") && i == mViewFilterPosition)
                {
                    FilterViewHolder.access._mth500(mHolder).setVisibility(0);
                    FilterViewHolder.access._mth500(mHolder).setImageDrawable(getResources().getDrawable(0x7f0200f1));
                    FilterViewHolder.access._mth400(mHolder).setTypeface(WalletFontCache.getGothamBold(getApplicationContext()));
                } else
                {
                    FilterViewHolder.access._mth500(mHolder).setImageDrawable(null);
                    FilterViewHolder.access._mth400(mHolder).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
                }
            } else
            {
                FilterViewHolder.access._mth300(mHolder).setVisibility(0);
                FilterViewHolder.access._mth500(mHolder).setVisibility(0);
                FilterViewHolder.access._mth300(mHolder).setText(((FilterObj)filters.get(i)).getFilterName());
            }
            FilterViewHolder.access._mth400(mHolder).setText(s);
            return view;
        }

        public FilterAdapter(Context context1, ArrayList arraylist)
        {
            this$0 = FilterActivity.this;
            super();
            context = context1;
            filters = arraylist;
        }
    }


    private FilterAdapter mAdapter;
    private int mTypeFilterPosition;
    private int mViewFilterPosition;

    public FilterActivity()
    {
        mViewFilterPosition = 0;
        mTypeFilterPosition = 0;
    }

    private void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar == null) goto _L2; else goto _L1
_L1:
        if (!getIntent().getStringExtra("filter").equalsIgnoreCase("home_filter")) goto _L4; else goto _L3
_L3:
        actionbar.setTitle(getResources().getString(0x7f08050c));
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayUseLogoEnabled(false);
_L6:
        actionbar.show();
_L2:
        return;
_L4:
        if (getIntent().getStringExtra("filter").equalsIgnoreCase("view"))
        {
            actionbar.setTitle(getResources().getString(0x7f080132));
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
        } else
        if (getIntent().getStringExtra("filter").equalsIgnoreCase("type"))
        {
            actionbar.setTitle(getResources().getString(0x7f080131));
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onBackPressed()
    {
        if (!getIntent().getStringExtra("filter").equalsIgnoreCase("view")) goto _L2; else goto _L1
_L1:
        Intent intent = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/loyalty/FilterActivity);
        intent.putExtra("filter", "home_filter");
        intent.putExtra("view", mViewFilterPosition);
        intent.putExtra("type", mTypeFilterPosition);
        startActivity(intent);
_L4:
        finish();
        return;
_L2:
        if (getIntent().getStringExtra("filter").equalsIgnoreCase("type"))
        {
            Intent intent1 = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/loyalty/FilterActivity);
            intent1.putExtra("filter", "home_filter");
            intent1.putExtra("view", mViewFilterPosition);
            intent1.putExtra("type", mTypeFilterPosition);
            startActivity(intent1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03000f);
        setUpActionBar();
        bundle = (ListView)findViewById(0x7f0d005b);
        bundle.setOnItemClickListener(this);
        mViewFilterPosition = getIntent().getIntExtra("view", 0);
        mTypeFilterPosition = getIntent().getIntExtra("type", 0);
        if (!TextUtils.isEmpty(getIntent().getStringExtra("filter")) && getIntent().getStringExtra("filter").equalsIgnoreCase("view"))
        {
            ((Button)findViewById(0x7f0d005d)).setVisibility(8);
            ArrayList arraylist = new ArrayList();
            String as[] = Constants.viewArray;
            int k = as.length;
            for (int i = 0; i < k; i++)
            {
                String s = as[i];
                FilterObj filterobj1 = new FilterObj();
                filterobj1.setFilterName("");
                filterobj1.setFilterValue(s);
                arraylist.add(filterobj1);
            }

            mAdapter = new FilterAdapter(this, arraylist);
            bundle.setAdapter(mAdapter);
        } else
        {
            if (!TextUtils.isEmpty(getIntent().getStringExtra("filter")) && getIntent().getStringExtra("filter").equalsIgnoreCase("type"))
            {
                ((Button)findViewById(0x7f0d005d)).setVisibility(8);
                ArrayList arraylist1 = new ArrayList();
                String as1[] = Constants.activityArray;
                int l = as1.length;
                for (int j = 0; j < l; j++)
                {
                    String s1 = as1[j];
                    FilterObj filterobj2 = new FilterObj();
                    filterobj2.setFilterName("");
                    filterobj2.setFilterValue(s1);
                    arraylist1.add(filterobj2);
                }

                mAdapter = new FilterAdapter(this, arraylist1);
                bundle.setAdapter(mAdapter);
                return;
            }
            if (!TextUtils.isEmpty(getIntent().getStringExtra("filter")) && getIntent().getStringExtra("filter").equalsIgnoreCase("home_filter"))
            {
                if (getIntent().getStringExtra("filter").equalsIgnoreCase("home_filter"))
                {
                    Button button = (Button)findViewById(0x7f0d005d);
                    button.setVisibility(0);
                    button.setOnClickListener(new android.view.View.OnClickListener() {

                        final FilterActivity this$0;

                        public void onClick(View view)
                        {
                            view = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/DisplayActivityList);
                            view.putExtra("filter", "home_filter");
                            view.putExtra("view", mViewFilterPosition);
                            view.putExtra("type", mTypeFilterPosition);
                            startActivity(view);
                            finish();
                        }

            
            {
                this$0 = FilterActivity.this;
                super();
            }
                    });
                }
                ArrayList arraylist2 = new ArrayList();
                FilterObj filterobj = new FilterObj();
                filterobj.setFilterName("VIEW");
                filterobj.setFilterValue(Constants.viewArray[mViewFilterPosition]);
                arraylist2.add(filterobj);
                filterobj = new FilterObj();
                filterobj.setFilterName("ACTIVITY TYPE");
                filterobj.setFilterValue(Constants.activityArray[mTypeFilterPosition]);
                arraylist2.add(filterobj);
                mAdapter = new FilterAdapter(this, arraylist2);
                bundle.setAdapter(mAdapter);
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (getIntent().getStringExtra("filter").equalsIgnoreCase("home_filter"))
        {
            view = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/loyalty/FilterActivity);
            if (i == 0)
            {
                adapterview = "view";
            } else
            {
                adapterview = "type";
            }
            view.putExtra("filter", adapterview);
            view.putExtra("view", mViewFilterPosition);
            view.putExtra("type", mTypeFilterPosition);
            startActivity(view);
            finish();
            return;
        }
        if (!getIntent().getStringExtra("filter").equalsIgnoreCase("view")) goto _L2; else goto _L1
_L1:
        mViewFilterPosition = i;
_L4:
        mAdapter.notifyDataSetChanged();
        onBackPressed();
        return;
_L2:
        if (getIntent().getStringExtra("filter").equalsIgnoreCase("type"))
        {
            mTypeFilterPosition = i;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        onBackPressed();
        return true;
    }


}
