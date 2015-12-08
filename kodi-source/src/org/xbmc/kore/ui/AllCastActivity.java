// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import java.util.ArrayList;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.ui:
//            BaseActivity, NavigationDrawerFragment

public class AllCastActivity extends BaseActivity
{
    public static class CastArrayAdapter extends ArrayAdapter
    {

        private int artHeight;
        private int artWidth;
        private HostManager hostManager;

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = LayoutInflater.from(getContext()).inflate(0x7f03003a, viewgroup, false);
                if (artWidth == -1)
                {
                    view = getContext().getResources();
                    int j = view.getDimensionPixelSize(0x7f080096);
                    viewgroup = new DisplayMetrics();
                    ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getMetrics(viewgroup);
                    int k = view.getInteger(0x7f0b0000);
                    artWidth = (((DisplayMetrics) (viewgroup)).widthPixels - ((k + 2) - 1) * j) / k;
                    artHeight = (int)((double)artWidth * 1.5D);
                    LogUtils.LOGD(AllCastActivity.TAG, (new StringBuilder()).append("width: ").append(artWidth).toString());
                }
                view = new ViewHolder();
                view.roleView = (TextView)view1.findViewById(0x7f0e00b9);
                view.nameView = (TextView)view1.findViewById(0x7f0e00b6);
                view.pictureView = (ImageView)view1.findViewById(0x7f0e00b7);
                view1.setTag(view);
                view1.getLayoutParams().width = artWidth;
                view1.getLayoutParams().height = artHeight;
            }
            view = (ViewHolder)view1.getTag();
            viewgroup = (org.xbmc.kore.jsonrpc.type.VideoType.Cast)getItem(i);
            ((ViewHolder) (view)).roleView.setText(((org.xbmc.kore.jsonrpc.type.VideoType.Cast) (viewgroup)).role);
            ((ViewHolder) (view)).nameView.setText(((org.xbmc.kore.jsonrpc.type.VideoType.Cast) (viewgroup)).name);
            UIUtils.loadImageWithCharacterAvatar(getContext(), hostManager, ((org.xbmc.kore.jsonrpc.type.VideoType.Cast) (viewgroup)).thumbnail, ((org.xbmc.kore.jsonrpc.type.VideoType.Cast) (viewgroup)).name, ((ViewHolder) (view)).pictureView, artWidth, artHeight);
            view.castName = ((org.xbmc.kore.jsonrpc.type.VideoType.Cast) (viewgroup)).name;
            return view1;
        }

        public CastArrayAdapter(Context context, ArrayList arraylist)
        {
            super(context, 0, arraylist);
            artWidth = -1;
            artHeight = -1;
            hostManager = HostManager.getInstance(context);
        }
    }

    private static class ViewHolder
    {

        String castName;
        TextView nameView;
        ImageView pictureView;
        TextView roleView;

        private ViewHolder()
        {
        }

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/AllCastActivity);
    private ArrayList castArrayList;
    GridView castGridView;
    TextView emptyView;
    private String movie_tvshow_title;
    NavigationDrawerFragment navigationDrawerFragment;

    public AllCastActivity()
    {
    }

    public static Intent buildLaunchIntent(Context context, String s, ArrayList arraylist)
    {
        return (new Intent(context, org/xbmc/kore/ui/AllCastActivity)).putExtra("EXTRA_TITLE", s).putParcelableArrayListExtra("EXTRA_CAST_LIST", arraylist);
    }

    private void setupActionBar(String s)
    {
        setSupportActionBar((Toolbar)findViewById(0x7f0e00d8));
        ActionBar actionbar = getSupportActionBar();
        if (actionbar == null)
        {
            return;
        }
        actionbar.setDisplayHomeAsUpEnabled(true);
        navigationDrawerFragment.setDrawerIndicatorEnabled(false);
        if (s != null)
        {
            s = (new StringBuilder()).append(getResources().getString(0x7f070023)).append(" - ").append(s).toString();
        } else
        {
            s = getResources().getString(0x7f070023);
        }
        actionbar.setTitle(s);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030019);
        ButterKnife.inject(this);
        navigationDrawerFragment = (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(0x7f0e0052);
        navigationDrawerFragment.setUp(0x7f0e0052, (DrawerLayout)findViewById(0x7f0e0050));
        if (bundle == null)
        {
            movie_tvshow_title = getIntent().getStringExtra("EXTRA_TITLE");
            castArrayList = getIntent().getParcelableArrayListExtra("EXTRA_CAST_LIST");
        } else
        {
            movie_tvshow_title = bundle.getString("EXTRA_TITLE");
            castArrayList = bundle.getParcelableArrayList("EXTRA_CAST_LIST");
        }
        castGridView.setEmptyView(emptyView);
        castGridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final AllCastActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                Utils.openImdbForPerson(AllCastActivity.this, ((ViewHolder)view.getTag()).castName);
            }

            
            {
                this$0 = AllCastActivity.this;
                super();
            }
        });
        bundle = new CastArrayAdapter(this, castArrayList);
        castGridView.setAdapter(bundle);
        setupActionBar(movie_tvshow_title);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            super.onBackPressed();
            break;
        }
        return true;
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("EXTRA_TITLE", movie_tvshow_title);
        bundle.putParcelableArrayList("EXTRA_CAST_LIST", castArrayList);
    }


}
