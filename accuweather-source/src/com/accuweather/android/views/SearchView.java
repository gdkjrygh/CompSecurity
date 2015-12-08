// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Utilities;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;

// Referenced classes of package com.accuweather.android.views:
//            SimpleSearchView, SearchTextWatcher

public class SearchView extends SimpleSearchView
    implements android.view.View.OnTouchListener
{

    public SearchView(Context context)
    {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Utilities.setTypeFace(findViewById(com.accuweather.android.R.id.label), Data.getRobotoBoldCondensed());
        setOnTouchListener(this);
        setSearchTextWatcher(new SearchTextWatcher() {

            final SearchView this$0;

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                if (isInvalidLocationText(charsequence.toString()))
                {
                    mSearchAutoCompleteTextView.setText("");
                } else
                {
                    if (charsequence.length() == 0)
                    {
                        if (!isAddLocationLabelShowing())
                        {
                            showLabel();
                        }
                    } else
                    if (isAddLocationLabelShowing())
                    {
                        hideLabel();
                    }
                    if (mListener != null)
                    {
                        mListener.onQueryChanged(charsequence.toString());
                        return;
                    }
                }
            }

            
            {
                this$0 = SearchView.this;
                super();
            }
        });
    }

    private boolean isInvalidLocationText(String s)
    {
        return s.equals(getResources().getString(com.accuweather.android.R.string.NoLocationFound));
    }

    protected int getLayoutResourceId()
    {
        return com.accuweather.android.R.layout.search_view;
    }

    public void hideLabel()
    {
        final View v = findViewById(com.accuweather.android.R.id.label);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(v, "alpha", new float[] {
            1.0F, 0.0F
        }).setDuration(200L);
        objectanimator.addListener(new com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener() {

            final SearchView this$0;
            final View val$v;

            public void onAnimationCancel(Animator animator)
            {
                v.setVisibility(8);
            }

            public void onAnimationEnd(Animator animator)
            {
                v.setVisibility(8);
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = SearchView.this;
                v = view;
                super();
            }
        });
        objectanimator.start();
    }

    public boolean isAddLocationLabelShowing()
    {
        return findViewById(com.accuweather.android.R.id.label).getVisibility() == 0;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            requestQueryFocus(true);
        }
        return false;
    }

    public void showLabel()
    {
        View view = findViewById(com.accuweather.android.R.id.label);
        view.setVisibility(0);
        ObjectAnimator.ofFloat(view, "alpha", new float[] {
            0.0F, 1.0F
        }).setDuration(200L).start();
    }

}
