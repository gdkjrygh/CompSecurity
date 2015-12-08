// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//            MediaRouterThemeHelper

public class MediaRouteChooserDialog extends Dialog
{
    private final class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
    {

        final MediaRouteChooserDialog this$0;

        public final void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            refreshRoutes();
        }

        public final void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            refreshRoutes();
        }

        public final void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            refreshRoutes();
        }

        public final void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            dismiss();
        }

        private MediaRouterCallback()
        {
            this$0 = MediaRouteChooserDialog.this;
            super();
        }

    }

    private final class RouteAdapter extends ArrayAdapter
        implements android.widget.AdapterView.OnItemClickListener
    {

        private final LayoutInflater mInflater;
        final MediaRouteChooserDialog this$0;

        public final boolean areAllItemsEnabled()
        {
            return false;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_media_route_list_item, viewgroup, false);
            }
            view = (android.support.v7.media.MediaRouter.RouteInfo)getItem(i);
            Object obj = (TextView)view1.findViewById(0x1020014);
            viewgroup = (TextView)view1.findViewById(0x1020015);
            ((TextView) (obj)).setText(view.getName());
            obj = view.getDescription();
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                viewgroup.setVisibility(8);
                viewgroup.setText("");
            } else
            {
                viewgroup.setVisibility(0);
                viewgroup.setText(((CharSequence) (obj)));
            }
            view1.setEnabled(view.isEnabled());
            return view1;
        }

        public final boolean isEnabled(int i)
        {
            return ((android.support.v7.media.MediaRouter.RouteInfo)getItem(i)).isEnabled();
        }

        public final void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = (android.support.v7.media.MediaRouter.RouteInfo)getItem(i);
            if (adapterview.isEnabled())
            {
                adapterview.select();
                dismiss();
            }
        }

        public RouteAdapter(Context context, List list)
        {
            this$0 = MediaRouteChooserDialog.this;
            super(context, 0, list);
            mInflater = LayoutInflater.from(context);
        }
    }

    private static final class RouteComparator
        implements Comparator
    {

        public static final RouteComparator sInstance = new RouteComparator();

        public final int compare(android.support.v7.media.MediaRouter.RouteInfo routeinfo, android.support.v7.media.MediaRouter.RouteInfo routeinfo1)
        {
            return routeinfo.getName().compareTo(routeinfo1.getName());
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((android.support.v7.media.MediaRouter.RouteInfo)obj, (android.support.v7.media.MediaRouter.RouteInfo)obj1);
        }


        private RouteComparator()
        {
        }
    }


    private RouteAdapter mAdapter;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private ListView mListView;
    private final MediaRouter mRouter;
    private ArrayList mRoutes;
    private MediaRouteSelector mSelector;

    public MediaRouteChooserDialog(Context context)
    {
        this(context, 0);
    }

    public MediaRouteChooserDialog(Context context, int i)
    {
        super(MediaRouterThemeHelper.createThemedContext(context), i);
        mSelector = MediaRouteSelector.EMPTY;
        mRouter = MediaRouter.getInstance(getContext());
        mCallback = new MediaRouterCallback();
    }

    public MediaRouteSelector getRouteSelector()
    {
        return mSelector;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mAttachedToWindow = true;
        mRouter.addCallback(mSelector, mCallback, 1);
        refreshRoutes();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().requestFeature(3);
        setContentView(android.support.v7.mediarouter.R.layout.mr_media_route_chooser_dialog);
        setTitle(android.support.v7.mediarouter.R.string.mr_media_route_chooser_title);
        getWindow().setFeatureDrawableResource(3, MediaRouterThemeHelper.getThemeResource(getContext(), android.support.v7.mediarouter.R.attr.mediaRouteOffDrawable));
        mRoutes = new ArrayList();
        mAdapter = new RouteAdapter(getContext(), mRoutes);
        mListView = (ListView)findViewById(android.support.v7.mediarouter.R.id.media_route_list);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(mAdapter);
        mListView.setEmptyView(findViewById(0x1020004));
    }

    public void onDetachedFromWindow()
    {
        mAttachedToWindow = false;
        mRouter.removeCallback(mCallback);
        super.onDetachedFromWindow();
    }

    public boolean onFilterRoute(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        return !routeinfo.isDefault() && routeinfo.isEnabled() && routeinfo.matchesSelector(mSelector);
    }

    public void onFilterRoutes(List list)
    {
        int i = list.size();
        do
        {
            int j = i - 1;
            if (i > 0)
            {
                if (!onFilterRoute((android.support.v7.media.MediaRouter.RouteInfo)list.get(j)))
                {
                    list.remove(j);
                    i = j;
                } else
                {
                    i = j;
                }
            } else
            {
                return;
            }
        } while (true);
    }

    public void refreshRoutes()
    {
        if (mAttachedToWindow)
        {
            mRoutes.clear();
            mRoutes.addAll(mRouter.getRoutes());
            onFilterRoutes(mRoutes);
            Collections.sort(mRoutes, RouteComparator.sInstance);
            mAdapter.notifyDataSetChanged();
        }
    }

    public void setRouteSelector(MediaRouteSelector mediarouteselector)
    {
        if (mediarouteselector == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (!mSelector.equals(mediarouteselector))
        {
            mSelector = mediarouteselector;
            if (mAttachedToWindow)
            {
                mRouter.removeCallback(mCallback);
                mRouter.addCallback(mediarouteselector, mCallback, 1);
            }
            refreshRoutes();
        }
    }
}
