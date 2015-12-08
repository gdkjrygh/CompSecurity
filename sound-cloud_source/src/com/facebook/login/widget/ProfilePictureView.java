// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.G;
import com.facebook.internal.E;
import com.facebook.internal.H;
import com.facebook.internal.K;
import com.facebook.internal.Y;
import com.facebook.p;
import java.util.Locale;

// Referenced classes of package com.facebook.login.widget:
//            e

public class ProfilePictureView extends FrameLayout
{
    public static interface a
    {
    }


    public static final String a = com/facebook/login/widget/ProfilePictureView.getSimpleName();
    private String b;
    private int c;
    private int d;
    private boolean e;
    private Bitmap f;
    private ImageView g;
    private int h;
    private com.facebook.internal.G i;
    private a j;
    private Bitmap k;

    public ProfilePictureView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0;
        d = 0;
        e = true;
        h = -1;
        k = null;
        a(context);
        a(attributeset);
    }

    public ProfilePictureView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        c = 0;
        d = 0;
        e = true;
        h = -1;
        k = null;
        a(context);
        a(attributeset);
    }

    private void a(Context context)
    {
        removeAllViews();
        g = new ImageView(context);
        context = new android.widget.FrameLayout.LayoutParams(-1, -1);
        g.setLayoutParams(context);
        g.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        addView(g);
    }

    private void a(Bitmap bitmap)
    {
        if (g != null && bitmap != null)
        {
            f = bitmap;
            g.setImageBitmap(bitmap);
        }
    }

    private void a(AttributeSet attributeset)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, com.facebook.O.h.com_facebook_profile_picture_view);
        int l = attributeset.getInt(com.facebook.O.h.com_facebook_profile_picture_view_com_facebook_preset_size, -1);
        switch (l)
        {
        default:
            throw new IllegalArgumentException("Must use a predefined preset size");

        case -4: 
        case -3: 
        case -2: 
        case -1: 
            h = l;
            break;
        }
        requestLayout();
        e = attributeset.getBoolean(com.facebook.O.h.com_facebook_profile_picture_view_com_facebook_is_cropped, true);
        attributeset.recycle();
    }

    static void a(ProfilePictureView profilepictureview, H h1)
    {
        if (h1.a != profilepictureview.i) goto _L2; else goto _L1
_L1:
        Bitmap bitmap;
        Exception exception;
        profilepictureview.i = null;
        bitmap = h1.d;
        exception = h1.b;
        if (exception == null) goto _L4; else goto _L3
_L3:
        if (profilepictureview.j == null) goto _L6; else goto _L5
_L5:
        new p((new StringBuilder("Error in downloading profile picture for profileId: ")).append(profilepictureview.b).toString(), exception);
_L2:
        return;
_L6:
        K.a(G.a, 6, a, exception.toString());
        return;
_L4:
        if (bitmap != null)
        {
            profilepictureview.a(bitmap);
            if (h1.c)
            {
                profilepictureview.b(false);
                return;
            }
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    private void a(boolean flag)
    {
        boolean flag1 = a();
        if (b != null && b.length() != 0 && (d != 0 || c != 0)) goto _L2; else goto _L1
_L1:
        if (i != null)
        {
            E.b(i);
        }
        if (k != null) goto _L4; else goto _L3
_L3:
        int l;
        if (e)
        {
            l = com.facebook.O.c.com_facebook_profile_picture_blank_square;
        } else
        {
            l = com.facebook.O.c.com_facebook_profile_picture_blank_portrait;
        }
        a(BitmapFactory.decodeResource(getResources(), l));
_L6:
        return;
_L4:
        a();
        a(Bitmap.createScaledBitmap(k, d, c, false));
        return;
_L2:
        if (flag1 || flag)
        {
            b(true);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean a()
    {
        boolean flag = false;
        int l = getHeight();
        int j1 = getWidth();
        if (j1 <= 0 || l <= 0)
        {
            return false;
        }
        int i1 = c(false);
        if (i1 != 0)
        {
            l = i1;
        } else
        {
            i1 = j1;
        }
        if (i1 <= l)
        {
            if (e)
            {
                l = i1;
            } else
            {
                l = 0;
            }
        } else
        if (e)
        {
            i1 = l;
        } else
        {
            i1 = 0;
        }
        if (i1 != d || l != c)
        {
            flag = true;
        }
        d = i1;
        c = l;
        return flag;
    }

    private void b(boolean flag)
    {
        Object obj = getContext();
        Object obj1 = b;
        int i1 = d;
        int l = c;
        Y.a(((String) (obj1)), "userId");
        i1 = Math.max(i1, 0);
        l = Math.max(l, 0);
        if (i1 == 0 && l == 0)
        {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        obj1 = (new android.net.Uri.Builder()).scheme("https").authority("graph.facebook.com").path(String.format(Locale.US, "%s/picture", new Object[] {
            obj1
        }));
        if (l != 0)
        {
            ((android.net.Uri.Builder) (obj1)).appendQueryParameter("height", String.valueOf(l));
        }
        if (i1 != 0)
        {
            ((android.net.Uri.Builder) (obj1)).appendQueryParameter("width", String.valueOf(i1));
        }
        ((android.net.Uri.Builder) (obj1)).appendQueryParameter("migration_overrides", "{october_2012:true}");
        obj = new com.facebook.internal.G.a(((Context) (obj)), ((android.net.Uri.Builder) (obj1)).build());
        obj.d = flag;
        obj.e = this;
        obj.c = new e(this);
        obj = new com.facebook.internal.G(((com.facebook.internal.G.a) (obj)), (byte)0);
        if (i != null)
        {
            E.b(i);
        }
        i = ((com.facebook.internal.G) (obj));
        E.a(((com.facebook.internal.G) (obj)));
    }

    private int c(boolean flag)
    {
        h;
        JVM INSTR tableswitch -4 -1: default 36
    //                   -4 58
    //                   -3 51
    //                   -2 38
    //                   -1 65;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return 0;
_L4:
        int l = com.facebook.O.b.com_facebook_profilepictureview_preset_size_small;
_L7:
        return getResources().getDimensionPixelSize(l);
_L3:
        l = com.facebook.O.b.com_facebook_profilepictureview_preset_size_normal;
        break; /* Loop/switch isn't completed */
_L2:
        l = com.facebook.O.b.com_facebook_profilepictureview_preset_size_large;
        break; /* Loop/switch isn't completed */
_L5:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = com.facebook.O.b.com_facebook_profilepictureview_preset_size_normal;
        if (true) goto _L7; else goto _L6
_L6:
        if (true) goto _L1; else goto _L8
_L8:
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        i = null;
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        super.onLayout(flag, l, i1, j1, k1);
        a(false);
    }

    protected void onMeasure(int l, int i1)
    {
        boolean flag1 = true;
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        boolean flag2 = false;
        int i2 = android.view.View.MeasureSpec.getSize(i1);
        int l1 = android.view.View.MeasureSpec.getSize(l);
        int k1 = i2;
        boolean flag = flag2;
        int j1 = i1;
        if (android.view.View.MeasureSpec.getMode(i1) != 0x40000000)
        {
            k1 = i2;
            flag = flag2;
            j1 = i1;
            if (layoutparams.height == -2)
            {
                k1 = c(true);
                j1 = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000);
                flag = true;
            }
        }
        if (android.view.View.MeasureSpec.getMode(l) != 0x40000000 && layoutparams.width == -2)
        {
            i1 = c(true);
            l = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            flag = flag1;
        } else
        {
            i1 = l1;
        }
        if (flag)
        {
            setMeasuredDimension(i1, k1);
            measureChildren(l, j1);
            return;
        } else
        {
            super.onMeasure(l, j1);
            return;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable.getClass() != android/os/Bundle)
        {
            super.onRestoreInstanceState(parcelable);
        } else
        {
            parcelable = (Bundle)parcelable;
            super.onRestoreInstanceState(parcelable.getParcelable("ProfilePictureView_superState"));
            b = parcelable.getString("ProfilePictureView_profileId");
            h = parcelable.getInt("ProfilePictureView_presetSize");
            e = parcelable.getBoolean("ProfilePictureView_isCropped");
            d = parcelable.getInt("ProfilePictureView_width");
            c = parcelable.getInt("ProfilePictureView_height");
            a((Bitmap)parcelable.getParcelable("ProfilePictureView_bitmap"));
            if (parcelable.getBoolean("ProfilePictureView_refresh"))
            {
                a(true);
                return;
            }
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        Parcelable parcelable = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", parcelable);
        bundle.putString("ProfilePictureView_profileId", b);
        bundle.putInt("ProfilePictureView_presetSize", h);
        bundle.putBoolean("ProfilePictureView_isCropped", e);
        bundle.putParcelable("ProfilePictureView_bitmap", f);
        bundle.putInt("ProfilePictureView_width", d);
        bundle.putInt("ProfilePictureView_height", c);
        boolean flag;
        if (i != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("ProfilePictureView_refresh", flag);
        return bundle;
    }

}
