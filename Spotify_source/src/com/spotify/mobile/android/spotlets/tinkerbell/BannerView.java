// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.tinkerbell;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import fjk;

// Referenced classes of package com.spotify.mobile.android.spotlets.tinkerbell:
//            BannerItem

public class BannerView extends RelativeLayout
{

    public fjk a;
    public BannerItem b;
    private final TextView c = (TextView)findViewById(0x7f11026e);
    private final TextView d = (TextView)findViewById(0x7f1102a3);
    private final Button e = (Button)findViewById(0x7f11046c);
    private float f;

    public BannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(0x7f03013c, this);
        a(false, ((Animation) (null)));
        setPadding(0, getResources().getDimensionPixelOffset(0x7f0c015a), 0, getResources().getDimensionPixelOffset(0x7f0c0159));
        e.setOnClickListener(new android.view.View.OnClickListener() {

            private BannerView a;

            public final void onClick(View view)
            {
                BannerView.a(a);
            }

            
            {
                a = BannerView.this;
                super();
            }
        });
        findViewById(0x7f1102b9).setOnClickListener(new android.view.View.OnClickListener() {

            private BannerView a;

            public final void onClick(View view)
            {
                BannerView.b(a);
            }

            
            {
                a = BannerView.this;
                super();
            }
        });
    }

    static float a(BannerView bannerview, float f1)
    {
        bannerview.f = f1;
        return f1;
    }

    static void a(BannerView bannerview)
    {
        if (bannerview.b != null && bannerview.a != null)
        {
            bannerview.a.a(bannerview.b);
        }
        if (bannerview.b != null && bannerview.b.e != null)
        {
            android.content.Intent intent = bannerview.b.e;
            String s;
            if (bannerview.b.f)
            {
                s = "service";
            } else
            {
                s = "activity";
            }
            if (bannerview.b.f)
            {
                bannerview.getContext().startService(intent);
            } else
            {
                bannerview.getContext().startActivity(intent);
            }
        }
        if (bannerview.b != null && bannerview.b.g)
        {
            bannerview.a(1000L);
        }
    }

    private void a(boolean flag, long l)
    {
        Object obj;
        Object obj1;
        int i;
        long l1;
        if (flag)
        {
            obj = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
        } else
        {
            obj = ValueAnimator.ofFloat(new float[] {
                1.0F, 0.0F
            });
        }
        ((ValueAnimator) (obj)).setStartDelay(l);
        if (flag)
        {
            l1 = 800L;
        } else
        {
            l1 = 300L;
        }
        ((ValueAnimator) (obj)).setDuration(l1);
        if (flag)
        {
            obj1 = new BounceInterpolator();
        } else
        {
            obj1 = new AnticipateInterpolator();
        }
        ((ValueAnimator) (obj)).setInterpolator(((android.animation.TimeInterpolator) (obj1)));
        ((ValueAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            private BannerView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                BannerView.a(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
                a.requestLayout();
            }

            
            {
                a = BannerView.this;
                super();
            }
        });
        ((ValueAnimator) (obj)).start();
        if (flag)
        {
            obj = new AlphaAnimation(0.0F, 1.0F);
        } else
        {
            obj = new AlphaAnimation(1.0F, 0.0F);
        }
        if (flag)
        {
            i = 600;
        } else
        {
            i = 0;
        }
        ((Animation) (obj)).setStartOffset((long)i + l);
        ((Animation) (obj)).setDuration(100L);
        a(flag, ((Animation) (obj)));
    }

    private void a(boolean flag, Animation animation)
    {
        int k = getChildCount();
        int i = 0;
        while (i < k) 
        {
            View view = getChildAt(i);
            if (view.getVisibility() == 8)
            {
                continue;
            }
            int j;
            if (flag)
            {
                j = 0;
            } else
            {
                j = 4;
            }
            view.setVisibility(j);
            if (animation != null)
            {
                view.startAnimation(animation);
            }
            i++;
        }
    }

    private void b(BannerItem banneritem)
    {
        b = banneritem;
        if (banneritem != null)
        {
            c.setText(banneritem.b);
            d.setText(banneritem.c);
            Button button = e;
            byte byte0;
            if (TextUtils.isEmpty(banneritem.d))
            {
                byte0 = 8;
            } else
            {
                byte0 = 4;
            }
            button.setVisibility(byte0);
            e.setText(banneritem.d);
            setBackgroundColor(banneritem.h);
        }
    }

    static void b(BannerView bannerview)
    {
        if (bannerview.b != null && bannerview.a != null)
        {
            bannerview.a.b(bannerview.b);
        }
        bannerview.a(0L);
    }

    public final void a(long l)
    {
        if (b == null)
        {
            return;
        } else
        {
            BannerItem banneritem = b;
            b = null;
            a(false, l);
            return;
        }
    }

    public final void a(BannerItem banneritem)
    {
        if (b != null)
        {
            banneritem = b;
            return;
        } else
        {
            b(banneritem);
            a(true, 1000L);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        setMeasuredDimension(getMeasuredWidth(), (int)((float)getMeasuredHeight() * f));
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            parcelable = (SavedState)parcelable;
            BannerItem banneritem = ((SavedState) (parcelable)).b;
            super.onRestoreInstanceState(((SavedState) (parcelable)).a);
            b(((SavedState) (parcelable)).b);
            if (b != null)
            {
                f = 1.0F;
                a(true, ((Animation) (null)));
            }
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        return new SavedState(super.onSaveInstanceState(), b);
    }

    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        public final Parcelable a;
        public final BannerItem b;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeParcelable(a, i);
            parcel.writeParcelable(b, i);
        }


        public SavedState(Parcel parcel)
        {
            a = parcel.readParcelable(android/os/Parcelable.getClassLoader());
            b = (BannerItem)parcel.readParcelable(com/spotify/mobile/android/spotlets/tinkerbell/BannerItem.getClassLoader());
        }

        public SavedState(Parcelable parcelable, BannerItem banneritem)
        {
            a = parcelable;
            b = banneritem;
        }
    }

}
