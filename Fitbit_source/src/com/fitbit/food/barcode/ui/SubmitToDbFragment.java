// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.bl.ga;
import com.fitbit.food.barcode.a.h;
import com.fitbit.food.barcode.a.i;
import com.fitbit.ui.fragments.FitbitFragment;
import com.fitbit.util.ad;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            SubmitToDbFragment_, UploadPhotoFrame, UploadPhotoView

public class SubmitToDbFragment extends FitbitFragment
    implements h
{

    public static final String a = "com.fitbit.food.barcode.ui.SubmitCompletedFragment.EXTRA_URI_LIST";
    public static final String b = "com.fitbit.food.barcode.ui.SubmitToDbFragment.ACTION_TAKE_PICTURE";
    private static final String i = "SubmitToDbFragment";
    protected int c;
    protected ArrayList d;
    protected String e;
    protected View f;
    protected LinearLayout g;
    protected TextView h;
    private List j;
    private i k;

    public SubmitToDbFragment()
    {
        c = 1;
        d = new ArrayList();
        j = new ArrayList();
    }

    public static SubmitToDbFragment a(ArrayList arraylist, String s, i l)
    {
        arraylist = SubmitToDbFragment_.d().a(arraylist).a(s).a();
        arraylist.a(l);
        return arraylist;
    }

    public static void a(FragmentManager fragmentmanager, String s, i l)
    {
        fragmentmanager = (SubmitToDbFragment)fragmentmanager.findFragmentByTag(s);
        if (fragmentmanager != null)
        {
            fragmentmanager.a(l);
        }
    }

    private void b(Uri uri)
    {
        if (d.size() >= c)
        {
            d.set(c - 1, uri);
            return;
        }
        for (int l = d.size(); l < Math.max(0, c - 1); l++)
        {
            d.add(null);
        }

        d.add(uri);
    }

    private void d()
    {
        Object obj = getActivity();
        int l;
        boolean flag;
        boolean flag1;
        if (d.size() == j.size())
        {
            l = 1;
        } else
        {
            l = 0;
        }
        flag1 = false;
        flag = l;
        l = ((flag1) ? 1 : 0);
        while (flag && l < d.size()) 
        {
            boolean flag2;
            if (d.get(l) != null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            flag &= flag2;
            l++;
        }
        if (flag && obj != null)
        {
            Log.d("SubmitToDbFragment", "Sending files");
            ((FragmentActivity) (obj)).startService(ga.a(((android.content.Context) (obj)), d));
            ad.a(((FragmentActivity) (obj)), this, 4099);
            obj = new Intent("com.fitbit.food.barcode.ui.SubmitToDbFragment.ACTION_TAKE_PICTURE");
            ((Intent) (obj)).putParcelableArrayListExtra("com.fitbit.food.barcode.ui.SubmitCompletedFragment.EXTRA_URI_LIST", d);
            z.a(((Intent) (obj)));
        }
    }

    private void f()
    {
label0:
        {
            if (c - 1 < j.size() - 1)
            {
                c = c + 1;
                if (g().c() != null)
                {
                    f();
                    return;
                }
                break label0;
            }
            Iterator iterator = j.iterator();
            UploadPhotoFrame uploadphotoframe;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                uploadphotoframe = (UploadPhotoFrame)iterator.next();
            } while (uploadphotoframe.c() != null);
            c = uploadphotoframe.a();
        }
        K_();
    }

    private UploadPhotoFrame g()
    {
        return (UploadPhotoFrame)j.get(c - 1);
    }

    protected void K_()
    {
        UploadPhotoFrame uploadphotoframe = g();
        h.setText(uploadphotoframe.a(getActivity()));
        int i1 = g.getChildCount();
        int l = 0;
        while (l < i1) 
        {
            UploadPhotoView uploadphotoview = (UploadPhotoView)g.getChildAt(l);
            if (l < d.size())
            {
                uploadphotoview.a((Uri)d.get(l));
            }
            boolean flag;
            if (uploadphotoview.a() == uploadphotoframe)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            uploadphotoview.setSelected(flag);
            l++;
        }
    }

    protected void a()
    {
        UploadPhotoFrame uploadphotoframe = new UploadPhotoFrame(UploadPhotoFrame.UploadPhotoFrameType.a, 1);
        j.add(uploadphotoframe);
        uploadphotoframe = new UploadPhotoFrame(UploadPhotoFrame.UploadPhotoFrameType.b, 2);
        j.add(uploadphotoframe);
        uploadphotoframe = new UploadPhotoFrame(UploadPhotoFrame.UploadPhotoFrameType.c, 3);
        j.add(uploadphotoframe);
        UploadPhotoView uploadphotoview;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); g.addView(uploadphotoview))
        {
            UploadPhotoFrame uploadphotoframe1 = (UploadPhotoFrame)iterator.next();
            if (d.size() > 0 && j.size() <= d.size())
            {
                uploadphotoframe1.a((Uri)d.get(j.indexOf(uploadphotoframe1)));
            }
            uploadphotoview = UploadPhotoView.a(getActivity());
            uploadphotoview.a(uploadphotoframe1);
            uploadphotoview.setOnClickListener(new _cls1());
        }

        K_();
    }

    public void a(Uri uri)
    {
        if (isAdded())
        {
            if (uri != null)
            {
                b(uri);
                f();
                d();
            }
            f.setEnabled(true);
        }
    }

    public void a(i l)
    {
        k = l;
    }

    public void c()
    {
        f.setEnabled(false);
        if (k != null)
        {
            k.a(this, g().a(e));
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public void onPause()
    {
        f.setEnabled(true);
        super.onPause();
    }

    /* member class not found */
    class _cls1 {}

}
