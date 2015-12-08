// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.quickaction;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.quickaction:
//            CustomPopupWindow, ActionItem

public class QuickAction extends CustomPopupWindow
{

    protected static final int ANIM_AUTO = 5;
    protected static final int ANIM_GROW_FROM_CENTER = 3;
    protected static final int ANIM_GROW_FROM_LEFT = 1;
    protected static final int ANIM_GROW_FROM_RIGHT = 2;
    protected static final int ANIM_REFLECT = 4;
    private ArrayList actionList;
    private int animStyle;
    private final Context context;
    private final LayoutInflater inflater;
    private final ImageView mArrowDown;
    private final ImageView mArrowUp;
    private ViewGroup mTrack;
    private final View root;
    private ScrollView scroller;

    public QuickAction(View view)
    {
        super(view);
        actionList = new ArrayList();
        context = view.getContext();
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
        root = (ViewGroup)inflater.inflate(0x7f030028, null);
        setContentView(root);
        mArrowDown = (ImageView)root.findViewById(0x7f0e00c2);
        mArrowUp = (ImageView)root.findViewById(0x7f0e00c1);
        mTrack = (ViewGroup)root.findViewById(0x7f0e00c0);
        scroller = (ScrollView)root.findViewById(0x7f0e00bf);
        animStyle = 5;
    }

    private void createActionList()
    {
        int i = 0;
        do
        {
            if (i >= actionList.size())
            {
                return;
            }
            View view = getActionItem(((ActionItem)actionList.get(i)).getTitle(), ((ActionItem)actionList.get(i)).getIcon(), ((ActionItem)actionList.get(i)).getListener());
            view.setPadding(0, 0, 0, 0);
            view.setFocusable(true);
            view.setClickable(true);
            mTrack.addView(view);
            i++;
        } while (true);
    }

    private View getActionItem(String s, Drawable drawable, android.view.View.OnClickListener onclicklistener)
    {
        drawable = (RelativeLayout)inflater.inflate(0x7f030000, null);
        Object obj = (ImageView)drawable.findViewById(0x7f0e001f);
        obj = (TextView)drawable.findViewById(0x7f0e0020);
        if (s != null)
        {
            ((TextView) (obj)).setText(s);
        }
        if (onclicklistener != null)
        {
            drawable.setOnClickListener(onclicklistener);
        }
        return drawable;
    }

    private void setAnimationStyle(int i, int j, boolean flag)
    {
        int k = 0x7f0a0031;
        int l = 0x7f0a0030;
        int i1 = 0x7f0a002d;
        j -= mArrowUp.getMeasuredWidth() / 2;
        switch (animStyle)
        {
        default:
            return;

        case 1: // '\001'
            PopupWindow popupwindow = window;
            if (!flag)
            {
                k = 0x7f0a002c;
            }
            popupwindow.setAnimationStyle(k);
            return;

        case 2: // '\002'
            PopupWindow popupwindow1 = window;
            if (flag)
            {
                i = 0x7f0a0032;
            } else
            {
                i = 0x7f0a002d;
            }
            popupwindow1.setAnimationStyle(i);
            return;

        case 3: // '\003'
            PopupWindow popupwindow2 = window;
            if (flag)
            {
                i = 0x7f0a0030;
            } else
            {
                i = 0x7f0a002b;
            }
            popupwindow2.setAnimationStyle(i);
            return;

        case 4: // '\004'
            PopupWindow popupwindow3 = window;
            if (flag)
            {
                i = 0x7f0a0033;
            } else
            {
                i = 0x7f0a002e;
            }
            popupwindow3.setAnimationStyle(i);
            return;

        case 5: // '\005'
            break;
        }
        if (j <= i / 4)
        {
            PopupWindow popupwindow4 = window;
            if (!flag)
            {
                k = 0x7f0a002c;
            }
            popupwindow4.setAnimationStyle(k);
            return;
        }
        if (j > i / 4 && j < (i / 4) * 3)
        {
            PopupWindow popupwindow5 = window;
            if (flag)
            {
                i = l;
            } else
            {
                i = 0x7f0a002b;
            }
            popupwindow5.setAnimationStyle(i);
            return;
        }
        PopupWindow popupwindow6 = window;
        i = i1;
        if (flag)
        {
            i = 0x7f0a0032;
        }
        popupwindow6.setAnimationStyle(i);
    }

    private void showArrow(int i, int j)
    {
        ImageView imageview;
        ImageView imageview1;
        if (i == 0x7f0e00c1)
        {
            imageview = mArrowUp;
        } else
        {
            imageview = mArrowDown;
        }
        if (i == 0x7f0e00c1)
        {
            imageview1 = mArrowDown;
        } else
        {
            imageview1 = mArrowUp;
        }
        i = mArrowUp.getMeasuredWidth();
        imageview.setVisibility(0);
        ((android.view.ViewGroup.MarginLayoutParams)imageview.getLayoutParams()).leftMargin = j - i / 2;
        imageview1.setVisibility(4);
    }

    public void addActionItem(ActionItem actionitem)
    {
        actionList.add(actionitem);
    }

    public void setAnimStyle(int i)
    {
        animStyle = i;
    }

    public void show()
    {
        preShow();
        int ai[] = new int[2];
        anchor.getLocationOnScreen(ai);
        Rect rect = new Rect(ai[0], ai[1], ai[0] + anchor.getWidth(), ai[1] + anchor.getHeight());
        createActionList();
        root.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        root.measure(-2, -2);
        int i1 = root.getMeasuredHeight();
        int i = root.getMeasuredWidth();
        int l = windowManager.getDefaultDisplay().getWidth();
        int j = windowManager.getDefaultDisplay().getHeight();
        int k;
        int j1;
        boolean flag;
        if (rect.left + i > l)
        {
            i = rect.left - (i - anchor.getWidth());
        } else
        if (anchor.getWidth() > i)
        {
            i = rect.centerX() - i / 2;
        } else
        {
            i = rect.left;
        }
        k = rect.top;
        j1 = j - rect.bottom;
        if (k > j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (i1 > k)
            {
                j = 15;
                scroller.getLayoutParams().height = k - anchor.getHeight();
            } else
            {
                j = (rect.top - i1) + 15;
            }
        } else
        {
            k = rect.bottom - 10;
            j = k;
            if (i1 > j1)
            {
                scroller.getLayoutParams().height = j1;
                j = k;
            }
        }
        if (flag)
        {
            k = 0x7f0e00c2;
        } else
        {
            k = 0x7f0e00c1;
        }
        showArrow(k, rect.centerX() - i);
        setAnimationStyle(l, rect.centerX(), flag);
        window.showAtLocation(anchor, 0, i, j);
    }
}
