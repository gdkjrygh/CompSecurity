// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.util.api.Api16Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.netflix.mediaclient.util:
//            AndroidUtils, StringUtils

public class ViewUtils
{
    public static class ViewComparator
        implements Comparable
    {

        public static final Comparator REVERSE_SORT_BY_TOP = new Comparator() {

            public int compare(ViewComparator viewcomparator, ViewComparator viewcomparator1)
            {
                viewcomparator = ViewUtils.getRect(viewcomparator.getView(), true);
                viewcomparator1 = ViewUtils.getRect(viewcomparator1.getView(), true);
                if (((Rect) (viewcomparator)).top < ((Rect) (viewcomparator1)).top)
                {
                    return 1;
                }
                return ((Rect) (viewcomparator)).top <= ((Rect) (viewcomparator1)).top ? 0 : -1;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((ViewComparator)obj, (ViewComparator)obj1);
            }

        };
        public static final Comparator SORT_BY_BOTTOM = new Comparator() {

            public int compare(ViewComparator viewcomparator, ViewComparator viewcomparator1)
            {
                byte byte0 = 1;
                viewcomparator = ViewUtils.getRect(viewcomparator.getView(), true);
                viewcomparator1 = ViewUtils.getRect(viewcomparator1.getView(), true);
                if (((Rect) (viewcomparator)).bottom < ((Rect) (viewcomparator1)).bottom)
                {
                    byte0 = -1;
                } else
                if (((Rect) (viewcomparator)).bottom <= ((Rect) (viewcomparator1)).bottom)
                {
                    return 0;
                }
                return byte0;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((ViewComparator)obj, (ViewComparator)obj1);
            }

        };
        public static final Comparator SORT_BY_TOP = new Comparator() {

            public int compare(ViewComparator viewcomparator, ViewComparator viewcomparator1)
            {
                byte byte0 = 1;
                viewcomparator = ViewUtils.getRect(viewcomparator.getView(), true);
                viewcomparator1 = ViewUtils.getRect(viewcomparator1.getView(), true);
                if (((Rect) (viewcomparator)).top < ((Rect) (viewcomparator1)).top)
                {
                    byte0 = -1;
                } else
                if (((Rect) (viewcomparator)).top <= ((Rect) (viewcomparator1)).top)
                {
                    return 0;
                }
                return byte0;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((ViewComparator)obj, (ViewComparator)obj1);
            }

        };
        private final View mView;

        public int compareTo(ViewComparator viewcomparator)
        {
            byte byte0 = 1;
            Rect rect = ViewUtils.getRect(mView, true);
            viewcomparator = ViewUtils.getRect(viewcomparator.getView(), true);
            if (rect.bottom < ((Rect) (viewcomparator)).bottom)
            {
                byte0 = -1;
            } else
            if (rect.bottom <= ((Rect) (viewcomparator)).bottom)
            {
                return 0;
            }
            return byte0;
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((ViewComparator)obj);
        }

        public View getView()
        {
            return mView;
        }


        public ViewComparator(View view)
        {
            if (view == null)
            {
                throw new IllegalArgumentException("View can not be null");
            } else
            {
                mView = view;
                return;
            }
        }
    }

    public static final class Visibility extends Enum
    {

        private static final Visibility $VALUES[];
        public static final Visibility GONE;
        public static final Visibility INVISIBLE;
        public static final Visibility VISIBLE;

        public static Visibility valueOf(String s)
        {
            return (Visibility)Enum.valueOf(com/netflix/mediaclient/util/ViewUtils$Visibility, s);
        }

        public static Visibility[] values()
        {
            return (Visibility[])$VALUES.clone();
        }

        static 
        {
            VISIBLE = new Visibility("VISIBLE", 0);
            INVISIBLE = new Visibility("INVISIBLE", 1);
            GONE = new Visibility("GONE", 2);
            $VALUES = (new Visibility[] {
                VISIBLE, INVISIBLE, GONE
            });
        }

        private Visibility(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int DIM_ALPHA = 64;
    public static final int NO_ALPHA = 255;
    public static final Comparator REVERSE_SORT_BY_BOTTOM = new Comparator() {

        public int compare(ViewComparator viewcomparator, ViewComparator viewcomparator1)
        {
            viewcomparator = ViewUtils.getRect(viewcomparator.getView(), true);
            viewcomparator1 = ViewUtils.getRect(viewcomparator1.getView(), true);
            if (((Rect) (viewcomparator)).bottom < ((Rect) (viewcomparator1)).bottom)
            {
                return 1;
            }
            return ((Rect) (viewcomparator)).bottom <= ((Rect) (viewcomparator1)).bottom ? 0 : -1;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((ViewComparator)obj, (ViewComparator)obj1);
        }

    };
    private static final String TAG = "nf_subtitles";

    private ViewUtils()
    {
    }

    public static void addActionBarPaddingView(ListView listview)
    {
        if (listview.getContext() instanceof NetflixActivity)
        {
            listview.addHeaderView(createActionBarDummyView((NetflixActivity)listview.getContext()));
        }
    }

    public static void addActionBarPaddingView(StickyListHeadersListView stickylistheaderslistview)
    {
        if (stickylistheaderslistview.getContext() instanceof NetflixActivity)
        {
            stickylistheaderslistview.addHeaderView(createActionBarDummyView((NetflixActivity)stickylistheaderslistview.getContext()));
        }
    }

    public static void clearShadow(TextView textview)
    {
        textview.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
    }

    public static View createActionBarDummyView(NetflixActivity netflixactivity)
    {
        View view = new View(netflixactivity);
        view.setId(0x7f070039);
        view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, netflixactivity.getActionBarHeight()));
        return view;
    }

    public static android.view.ViewGroup.LayoutParams createLayoutParams(View view, int i, int j)
    {
        view = view.getParent();
        if (view instanceof FrameLayout)
        {
            return new android.widget.FrameLayout.LayoutParams(i, j);
        }
        if (view instanceof RelativeLayout)
        {
            return new android.widget.RelativeLayout.LayoutParams(i, j);
        }
        if (view instanceof LinearLayout)
        {
            return new android.widget.LinearLayout.LayoutParams(i, j);
        } else
        {
            return new android.view.ViewGroup.LayoutParams(i, j);
        }
    }

    public static android.view.MenuItem.OnMenuItemClickListener createShowToastMenuClickListener(Activity activity)
    {
        return new android.view.MenuItem.OnMenuItemClickListener(activity) {

            final Activity val$activity;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                StringBuilder stringbuilder = new StringBuilder("Clicked on: ");
                if (StringUtils.isNotEmpty(menuitem.getTitle()))
                {
                    stringbuilder.append(menuitem.getTitle());
                } else
                {
                    stringbuilder.append(menuitem.getClass().getSimpleName());
                }
                Toast.makeText(activity, stringbuilder.toString(), 0).show();
                return true;
            }

            
            {
                activity = activity1;
                super();
            }
        };
    }

    public static android.view.View.OnClickListener createShowToastViewClickListener(Activity activity)
    {
        return new android.view.View.OnClickListener(activity) {

            final Activity val$activity;

            public void onClick(View view)
            {
                StringBuilder stringbuilder = new StringBuilder("Clicked on: ");
                if (StringUtils.isNotEmpty(view.getContentDescription()))
                {
                    stringbuilder.append(view.getContentDescription());
                } else
                {
                    stringbuilder.append(view.getClass().getSimpleName());
                }
                Toast.makeText(activity, stringbuilder.toString(), 0).show();
            }

            
            {
                activity = activity1;
                super();
            }
        };
    }

    public static Point getDisplaySize(Activity activity)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i = displaymetrics.heightPixels;
        return new Point(displaymetrics.widthPixels, i);
    }

    public static Point getEstimatedTextSize(float f, Typeface typeface, String s)
    {
        Typeface typeface1 = typeface;
        if (typeface == null)
        {
            typeface1 = Typeface.DEFAULT;
        }
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("fs: ").append(f).toString());
            Log.d("nf_subtitles", (new StringBuilder()).append("text: ").append(s).toString());
        }
        typeface = new Paint();
        Rect rect = new Rect();
        typeface.setTypeface(typeface1);
        typeface.setTextSize(f);
        typeface.getTextBounds(s, 0, s.length(), rect);
        f = typeface.measureText(s);
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("h: ").append(rect.height()).toString());
            Log.d("nf_subtitles", (new StringBuilder()).append("w: ").append(rect.width()).toString());
            Log.d("nf_subtitles", (new StringBuilder()).append("realW: ").append(f).toString());
        }
        return new Point((int)f, rect.height());
    }

    public static float getEstimatedTextWidth(float f, Typeface typeface, String s)
    {
        Typeface typeface1 = typeface;
        if (typeface == null)
        {
            typeface1 = Typeface.DEFAULT;
        }
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("fs: ").append(f).toString());
            Log.d("nf_subtitles", (new StringBuilder()).append("text: ").append(s).toString());
        }
        typeface = new Paint();
        typeface.setTypeface(typeface1);
        typeface.setTextSize(f);
        f = typeface.measureText(s);
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("realW: ").append(f).toString());
        }
        return f;
    }

    public static void getHitRect(View view, Rect rect)
    {
        rect.left = (int)view.getX();
        rect.top = (int)view.getY();
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
    }

    public static Rect getLocationOnScreen(View view)
    {
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        return new Rect(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
    }

    public static Rect getRect(View view, boolean flag)
    {
        Log.d("nf_subtitles", "getRect");
        if (flag)
        {
            Object obj = view.getTag();
            if (obj instanceof Rect)
            {
                Log.d("nf_subtitles", "Rectangle was known from before, use it");
                return (Rect)obj;
            } else
            {
                Log.d("nf_subtitles", "Rectangle was NOT known from before, calculate");
                Rect rect = new Rect();
                getHitRect(view, rect);
                view.setTag(rect);
                return rect;
            }
        } else
        {
            Rect rect1 = new Rect();
            getHitRect(view, rect1);
            return rect1;
        }
    }

    public static transient List getViewsById(View view, Integer ainteger[])
    {
        ArrayList arraylist = new ArrayList();
        int j = ainteger.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = ainteger[i];
            if (obj != null)
            {
                obj = view.findViewById(((Integer) (obj)).intValue());
                if (obj != null)
                {
                    arraylist.add(obj);
                }
            }
            i++;
        }
        return arraylist;
    }

    public static void removeGlobalLayoutListener(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        if (AndroidUtils.getAndroidVersion() < 16)
        {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(ongloballayoutlistener);
            return;
        } else
        {
            Api16Util.removeOnGlobalLayoutListener(view.getViewTreeObserver(), ongloballayoutlistener);
            return;
        }
    }

    public static void setBackgroundDrawableCompat(View view, Drawable drawable)
    {
        if (AndroidUtils.getAndroidVersion() >= 16)
        {
            view.setBackground(drawable);
            return;
        } else
        {
            view.setBackgroundDrawable(drawable);
            return;
        }
    }

    public static void setLongTapListenersRecursivelyToShowContentDescriptionToast(View view)
    {
        CharSequence charsequence = view.getContentDescription();
        if (StringUtils.isNotEmpty(charsequence))
        {
            view.setOnLongClickListener(new android.view.View.OnLongClickListener(view, charsequence) {

                final CharSequence val$desc;
                final View val$root;

                public boolean onLongClick(View view1)
                {
                    Toast.makeText(root.getContext(), desc, 0).show();
                    return true;
                }

            
            {
                root = view;
                desc = charsequence;
                super();
            }
            });
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i = 0; i < view.getChildCount(); i++)
            {
                setLongTapListenersRecursivelyToShowContentDescriptionToast(view.getChildAt(i));
            }

        }
    }

    public static void setTextViewSizeByRes(TextView textview, int i)
    {
        textview.setTextSize(0, textview.getResources().getDimensionPixelOffset(i));
    }

    public static void setTextViewToBold(TextView textview)
    {
        textview.setTypeface(textview.getTypeface(), 1);
    }

    public static void setVisibility(View view, Visibility visibility)
    {
        byte byte0;
        if (view == null || visibility == null)
        {
            return;
        }
        byte0 = 8;
        if (visibility != Visibility.VISIBLE) goto _L2; else goto _L1
_L1:
        byte0 = 0;
_L4:
        view.setVisibility(byte0);
        return;
_L2:
        if (visibility == Visibility.INVISIBLE)
        {
            byte0 = 4;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void setVisibility(View view, boolean flag)
    {
        Visibility visibility;
        if (flag)
        {
            visibility = Visibility.VISIBLE;
        } else
        {
            visibility = Visibility.GONE;
        }
        setVisibility(view, visibility);
    }

    public static void showViews(Collection collection)
    {
        if (collection != null)
        {
            collection = collection.iterator();
            while (collection.hasNext()) 
            {
                View view = (View)collection.next();
                if (view != null)
                {
                    view.setVisibility(0);
                }
            }
        }
    }

}
