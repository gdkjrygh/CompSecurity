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
import java.util.Comparator;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//            MediaRouterThemeHelper

public class MediaRouteChooserDialog extends Dialog
{
    private final class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
    {

        final MediaRouteChooserDialog this$0;

        public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            refreshRoutes();
        }

        public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            refreshRoutes();
        }

        public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            refreshRoutes();
        }

        public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
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

        public boolean areAllItemsEnabled()
        {
            return false;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            Object obj = view;
            view = ((View) (obj));
            if (obj == null)
            {
                view = mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_media_route_list_item, viewgroup, false);
            }
            viewgroup = (android.support.v7.media.MediaRouter.RouteInfo)getItem(i);
            Object obj1 = (TextView)view.findViewById(0x1020014);
            obj = (TextView)view.findViewById(0x1020015);
            ((TextView) (obj1)).setText(viewgroup.getName());
            obj1 = viewgroup.getDescription();
            if (TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                ((TextView) (obj)).setVisibility(8);
                ((TextView) (obj)).setText("");
            } else
            {
                ((TextView) (obj)).setVisibility(0);
                ((TextView) (obj)).setText(((CharSequence) (obj1)));
            }
            view.setEnabled(viewgroup.isEnabled());
            return view;
        }

        public boolean isEnabled(int i)
        {
            return ((android.support.v7.media.MediaRouter.RouteInfo)getItem(i)).isEnabled();
        }

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = (android.support.v7.media.MediaRouter.RouteInfo)getItem(i);
            if (adapterview.isEnabled())
            {
                adapterview.select();
                dismiss();
            }
        }

        public void update()
        {
            clear();
            List list = mRouter.getRoutes();
            int j = list.size();
            for (int i = 0; i < j; i++)
            {
                android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)list.get(i);
                if (onFilterRoute(routeinfo))
                {
                    add(routeinfo);
                }
            }

            sort(RouteComparator.sInstance);
            notifyDataSetChanged();
        }

        public RouteAdapter(Context context)
        {
            this$0 = MediaRouteChooserDialog.this;
            super(context, 0);
            mInflater = LayoutInflater.from(context);
        }
    }

    private static final class RouteComparator
        implements Comparator
    {

        public static final RouteComparator sInstance = new RouteComparator();

        public int compare(android.support.v7.media.MediaRouter.RouteInfo routeinfo, android.support.v7.media.MediaRouter.RouteInfo routeinfo1)
        {
            return routeinfo.getName().compareTo(routeinfo1.getName());
        }

        public volatile int compare(Object obj, Object obj1)
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
    private MediaRouteSelector mSelector;

    public MediaRouteChooserDialog(Context context)
    {
        this(context, 0);
    }

    public MediaRouteChooserDialog(Context context, int i)
    {
        super(MediaRouterThemeHelper.createThemedContext(context, true), i);
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
        mAdapter = new RouteAdapter(getContext());
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

    public void refreshRoutes()
    {
        if (mAttachedToWindow)
        {
            mAdapter.update();
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
