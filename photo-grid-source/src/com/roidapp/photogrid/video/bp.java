// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.view.DraggableGridView;
import com.roidapp.baselib.view.d;
import com.roidapp.baselib.view.r;
import com.roidapp.baselib.view.u;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.common.bn;
import com.roidapp.photogrid.common.bo;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.y;
import com.roidapp.photogrid.release.PhotoGridActivity;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import com.roidapp.photogrid.release.rf;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.video:
//            bx, VideoPictureEditActivity, ca, cb, 
//            br, bt, bs, bu, 
//            bw, bv, bq, by, 
//            bz

public final class bp extends Fragment
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.widget.AdapterView.OnItemClickListener, d, u
{

    private static int l;
    private static int m;
    private static boolean n[];
    private VideoPictureEditActivity a;
    private DraggableGridView b;
    private ca c;
    private ig d[];
    private r e;
    private TextView f;
    private TextView g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private String o[];
    private boolean p;
    private RelativeLayout q;
    private TextView r;
    private boolean s;
    private ImageView t;

    public bp()
    {
        i = true;
        j = false;
        k = false;
        o = null;
        p = false;
        s = false;
        t = null;
    }

    private String a(Uri uri, String s1, String as[])
    {
        uri = getActivity().getContentResolver().query(uri, new String[] {
            "_data"
        }, s1, as, null);
        if (uri == null) goto _L2; else goto _L1
_L1:
        uri.moveToFirst();
        s1 = uri.getString(uri.getColumnIndex("_data"));
_L5:
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                uri.printStackTrace();
                return s1;
            }
        }
        return s1;
        s1;
        uri = null;
_L3:
        s1.printStackTrace();
        s1 = null;
        continue; /* Loop/switch isn't completed */
        s1;
        if (true) goto _L3; else goto _L2
_L2:
        s1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(int i1)
    {
        Object obj = new android.app.AlertDialog.Builder(getActivity());
        ((android.app.AlertDialog.Builder) (obj)).setTitle(0x7f0702e7);
        ((android.app.AlertDialog.Builder) (obj)).setMessage(i1);
        ((android.app.AlertDialog.Builder) (obj)).setCancelable(false);
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(0x7f07032f, new bx(this));
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        ((AlertDialog) (obj)).setCancelable(false);
        ((AlertDialog) (obj)).setCanceledOnTouchOutside(false);
        ((AlertDialog) (obj)).show();
    }

    private void a(View view, Rect rect)
    {
        int ai[] = new int[2];
        b.getLocationOnScreen(ai);
        int k1 = ai[0];
        int i1 = ai[1];
        view.getLocationOnScreen(ai);
        int l1 = ai[0];
        int j1 = ai[1];
        k1 = l1 - k1;
        i1 = j1 - i1;
        rect.set(k1, i1, view.getMeasuredWidth() + k1, view.getMeasuredHeight() + i1);
    }

    private void a(ig ig1, int i1)
    {
        com.roidapp.photogrid.common.b.a("Video/SingleEdit");
        az.q = 9;
        ih ih1 = ih.C();
        ih1.k(1);
        ih1.j(null);
        ih1.b(d);
        ih1.i(0);
        boolean flag;
        if (ih1.av())
        {
            ih1.am();
        } else
        {
            ih1.al();
        }
        az.F = false;
        ig1.m = false;
        ig1.h = i1;
        if (p != ih1.ax())
        {
            f();
        }
        if (!ih1.ax())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ig1.B = flag;
        ig1.f();
        ih1.a(new ig[] {
            ig1
        });
        ig1 = new Intent();
        ig1.setClass(getActivity(), com/roidapp/photogrid/release/PhotoGridActivity);
        startActivity(ig1);
        getActivity().finish();
    }

    static void a(bp bp1)
    {
        bp1.d();
    }

    static void a(bp bp1, ig ig1, int i1)
    {
        bp1.a(ig1, i1);
    }

    static ig[] a(bp bp1, ig aig[])
    {
        bp1.d = aig;
        return aig;
    }

    static String[] a(bp bp1, String as[])
    {
        bp1.o = as;
        return as;
    }

    static ca b(bp bp1)
    {
        return bp1.c;
    }

    static ig[] c(bp bp1)
    {
        return bp1.d;
    }

    static boolean[] c()
    {
        return n;
    }

    static TextView d(bp bp1)
    {
        return bp1.f;
    }

    private void d()
    {
        if (!s)
        {
            s = true;
            e();
            ih.C().aj();
            if (a != null)
            {
                a.a();
                return;
            }
        }
    }

    private void e()
    {
        if (b != null)
        {
            b.a();
            b.setAdapter(null);
            b = null;
        }
        if (c != null)
        {
            c = null;
        }
        if (r != null && isAdded())
        {
            r.setText((new StringBuilder()).append(getResources().getString(0x7f0701a0)).append(" 10%").toString());
        }
        if (q != null)
        {
            q.setVisibility(0);
        }
    }

    static String[] e(bp bp1)
    {
        return bp1.o;
    }

    static int f(bp bp1)
    {
        return bp1.h;
    }

    private void f()
    {
        ig aig[] = d;
        int j1 = aig.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            aig[i1].f = null;
        }

    }

    private void g()
    {
        if (f != null)
        {
            f.setVisibility(0);
        }
        if (g != null)
        {
            g.setVisibility(0);
        }
        if (t != null)
        {
            t.setVisibility(8);
        }
    }

    public final void a()
    {
        g();
        if (d.length == 0)
        {
            d();
        }
    }

    public final void a(int i1, int j1)
    {
        if (i)
        {
            i = false;
        }
        c.a(i1, j1);
    }

    public final void a(View view)
    {
        j = true;
        if (f != null)
        {
            f.setVisibility(8);
        }
        if (g != null)
        {
            g.setVisibility(8);
        }
        if (t != null)
        {
            t.setVisibility(0);
        }
        if (view instanceof RelativeLayout)
        {
            view = (cb)view.getTag();
            if (view != null)
            {
                ((cb) (view)).b.setVisibility(4);
            }
        }
    }

    public final boolean a(View view, int i1)
    {
        Rect rect = new Rect();
        int ai[] = new int[2];
        view.getLocationInWindow(ai);
        view.getLocationOnScreen(ai);
        int ai1[] = new int[2];
        b.getLocationOnScreen(ai1);
        ai[0] = ai[0] - ai1[0];
        ai[1] = ai[1] - ai1[1];
        a(((View) (t)), rect);
        boolean flag = rect.contains(i1, ai[1] + view.getHeight(), i1, ai[1] + view.getHeight());
        if (flag)
        {
            view = getResources().getDrawable(0x7f020410);
            t.setImageDrawable(view);
            t.setBackgroundResource(0x7f020600);
            return flag;
        } else
        {
            view = getResources().getDrawable(0x7f02040f);
            t.setImageDrawable(view);
            t.setBackgroundColor(0xff000000);
            return flag;
        }
    }

    public final int[] a(View view, int i1, int ai[])
    {
        if (view instanceof RelativeLayout)
        {
            cb cb1 = (cb)view.getTag();
            if (!cb1.b.isShown())
            {
                cb1.b.setVisibility(0);
            }
        }
        Rect rect = new Rect();
        a(((View) (t)), rect);
        Object obj = null;
        if (view != null && rect.contains(ai[0], ai[1] + view.getHeight(), ai[0], ai[1] + view.getHeight()))
        {
            if (c != null)
            {
                n[i1] = false;
                c.a(i1);
            }
            view = new int[2];
            t.getLocationOnScreen(view);
            view[0] = view[0] + t.getMeasuredWidth() / 2;
            view[1] = view[1] + t.getMeasuredHeight() / 2;
        } else
        {
            g();
            c.a();
            view = obj;
        }
        j = false;
        k = false;
        i = true;
        return view;
    }

    public final void b()
    {
        boolean flag = true;
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        if (sharedpreferences.getBoolean("video_exit_tip", true))
        {
            View view = LayoutInflater.from(getActivity()).inflate(0x7f0300ed, null);
            if (view != null)
            {
                CheckBox checkbox = (CheckBox)view.findViewById(0x7f0d03c1);
                if (sharedpreferences.getBoolean("video_exit_tip", false))
                {
                    flag = false;
                }
                checkbox.setChecked(flag);
                view.findViewById(0x7f0d03c0).setOnClickListener(new br(this, checkbox));
                (new android.app.AlertDialog.Builder(getActivity())).setIcon(0x1080027).setTitle(0x7f070325).setView(view).setPositiveButton(0x7f070043, new bt(this, sharedpreferences, checkbox)).setNegativeButton(0x7f070044, new bs(this, sharedpreferences, checkbox)).show();
            }
            return;
        } else
        {
            d();
            return;
        }
    }

    public final void b(int i1, int j1)
    {
        i1;
        JVM INSTR lookupswitch 3: default 36
    //                   0: 51
    //                   1: 286
    //                   100: 37;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L4:
        k = true;
        b.a(j1);
        return;
_L2:
        if (j1 >= 0 && n != null && j1 < n.length && !n[j1])
        {
            n[j1] = true;
            m++;
        }
        ig ig1 = c.b(j1);
        if (ig1 != null)
        {
            if (ig1.e == null)
            {
                a(ig1, j1);
                return;
            }
            SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
            if (sharedpreferences.getBoolean("video_single_edit_tip", true))
            {
                View view = LayoutInflater.from(getActivity()).inflate(0x7f0300ed, null);
                if (view != null)
                {
                    CheckBox checkbox = (CheckBox)view.findViewById(0x7f0d03c1);
                    ((TextView)view.findViewById(0x7f0d03bf)).setText(0x7f07031a);
                    view.findViewById(0x7f0d03c0).setOnClickListener(new bu(this, checkbox));
                    (new android.app.AlertDialog.Builder(getActivity())).setIcon(0x1080027).setTitle(0x7f0702e7).setView(view).setPositiveButton(0x7f07016b, new bw(this, checkbox, sharedpreferences, ig1, j1)).setNegativeButton(0x7f07016a, new bv(this)).show();
                    return;
                }
            } else
            {
                a(ig1, j1);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        n[j1] = false;
        c.a(j1);
        if (d.length == 0)
        {
            d();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 43522 43522: default 20
    //                   43522 28;
           goto _L1 _L2
_L1:
        super.onActivityResult(i1, j1, intent);
_L4:
        return;
_L2:
        if (intent == null) goto _L4; else goto _L3
_L3:
        intent = intent.getData();
        if (intent == null) goto _L4; else goto _L5
_L5:
        if (intent.getAuthority() != null)
        {
            if ("com.google.android.apps.docs.storage".equals(intent.getAuthority()))
            {
                a(0x7f070181);
                return;
            }
            if ("com.google.android.apps.docs.files".equals(intent.getAuthority()))
            {
                a(0x7f070181);
                return;
            }
            if ("com.google.android.apps.photos.content".equals(intent.getAuthority()))
            {
                a(0x7f070181);
                return;
            }
        }
        if (!intent.toString().startsWith("file:///")) goto _L7; else goto _L6
_L6:
        intent = Uri.decode(intent.getEncodedPath());
_L9:
        if (intent == null)
        {
            a(0x7f070026);
            return;
        }
        break; /* Loop/switch isn't completed */
_L7:
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            bo.a();
            if (bo.a(getActivity(), intent))
            {
                if ("com.android.providers.media.documents".equals(intent.getAuthority()))
                {
                    bo.a();
                    intent = bo.a(intent).split(":")[1];
                    intent = a(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[] {
                        intent
                    });
                    continue; /* Loop/switch isn't completed */
                }
                if ("com.android.providers.downloads.documents".equals(intent.getAuthority()))
                {
                    bo.a();
                    intent = bo.a(intent);
                    intent = a(ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(intent).longValue()), ((String) (null)), ((String []) (null)));
                    continue; /* Loop/switch isn't completed */
                }
                if ("com.android.externalstorage.documents".equals(intent.getAuthority()))
                {
                    bo.a();
                    String as[] = bo.a(intent).split(":");
                    intent = as[0];
                    String s1 = as[1];
                    if ("primary".equalsIgnoreCase(intent))
                    {
                        intent = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/").append(s1).toString();
                        continue; /* Loop/switch isn't completed */
                    }
                    intent = (new File("/storage")).listFiles();
                    if (intent == null)
                    {
                        a(0x7f070026);
                        return;
                    }
                    i1 = 0;
                    do
                    {
                        if (i1 >= intent.length)
                        {
                            break;
                        }
                        if ((new File(intent[i1].getAbsolutePath(), s1)).exists())
                        {
                            intent = (new StringBuilder()).append(intent[i1].getAbsolutePath()).append("/").append(s1).toString();
                            continue; /* Loop/switch isn't completed */
                        }
                        i1++;
                    } while (true);
                    intent = null;
                } else
                {
                    try
                    {
                        bo.a();
                        intent = bo.a(intent);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Intent intent)
                    {
                        a(0x7f070181);
                        return;
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        intent = a(intent, ((String) (null)), ((String []) (null)));
        if (true) goto _L9; else goto _L8
_L8:
        String s2 = intent.toLowerCase(Locale.ENGLISH);
        if (s2.endsWith(".png") || s2.endsWith(".jpg") || s2.endsWith(".gif") || s2.endsWith(".bmp") || s2.endsWith(".jpeg") || s2.endsWith(".mpo") || bn.a(intent))
        {
            if (rf.b(intent))
            {
                intent = new ig(intent);
                c.a(intent);
                intent = new boolean[n.length + 1];
                System.arraycopy(n, 0, intent, 0, n.length);
                n = intent;
                l++;
                return;
            } else
            {
                a(0x7f070026);
                return;
            }
        } else
        {
            a(0x7f07015d);
            return;
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        a = (VideoPictureEditActivity)activity;
    }

    public final void onClick(View view)
    {
        if (!j) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (view.getId())
        {
        default:
            return;

        case 2131558632: 
            b();
            return;

        case 2131559637: 
            if (d.length == 0)
            {
                an.a(new WeakReference(getActivity()), getString(0x7f0701e9));
                return;
            }
            if (!rf.a(getActivity(), 15))
            {
                y.a(getActivity());
                return;
            }
            com.roidapp.photogrid.common.b.a("Video/Preview");
            az.q = 6;
            ih.C().e(true);
            ih.C().n(0);
            if (p != ih.C().ax())
            {
                f();
            }
            if (!s)
            {
                s = true;
                e();
                startActivity(new Intent(getActivity(), com/roidapp/photogrid/release/PhotoGridActivity));
                getActivity().finish();
                com.roidapp.photogrid.b.f.a("EditPage_View", "Sort_Edit");
                return;
            }
            break;

        case 2131559644: 
            int i1 = ((Integer)view.getTag()).intValue();
            (new android.app.AlertDialog.Builder(getActivity())).setMessage(getResources().getString(0x7f070177)).setPositiveButton(0x7f07032f, new bq(this, i1)).setNegativeButton(0x7f0701ec, new by(this)).show();
            return;

        case 2131559640: 
            if (d.length >= 50)
            {
                an.a(new WeakReference(getActivity()), String.format(getString(0x7f0701f7), new Object[] {
                    Integer.valueOf(50)
                }));
                return;
            }
            if (getActivity() != null && !getActivity().isFinishing())
            {
                view = new Intent("android.intent.action.GET_CONTENT");
                view.setType("image/*");
                try
                {
                    startActivityForResult(view, 43522);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    view.printStackTrace();
                }
                return;
            }
            break;

        case 2131559641: 
            if (ih.C().ax())
            {
                g.setText(0x7f070115);
                g.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f02038f, 0, 0);
                ih.C().l(false);
            } else
            {
                g.setText(0x7f07032c);
                g.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203cb, 0, 0);
                ih.C().l(true);
            }
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (c == null) goto _L1; else goto _L4
_L4:
        c.notifyDataSetChanged();
        return;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = ih.C().M();
        p = ih.C().ax();
        if (d == null)
        {
            com.roidapp.photogrid.common.c.a("210", getActivity());
            return;
        }
        bundle = PreferenceManager.getDefaultSharedPreferences(getActivity());
        if (bundle.getBoolean("first_in", false))
        {
            int i1 = d.length;
            l = i1;
            n = new boolean[i1];
            m = 0;
            bundle.edit().putBoolean("first_in", false).apply();
        }
        float f1 = getResources().getDimension(0x7f0900e3);
        h = (int)(((float)getResources().getDisplayMetrics().widthPixels - f1 * 2.0F) / 3F);
        if (o != null)
        {
            o = null;
        }
        o = new String[d.length];
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = layoutinflater.inflate(0x7f030130, viewgroup, false);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            com.roidapp.photogrid.common.c.a("211", getActivity());
            return null;
        }
        if (layoutinflater != null)
        {
            viewgroup = d;
            b = (DraggableGridView)layoutinflater.findViewById(0x7f0d0102);
            c = new ca(this, getActivity(), viewgroup);
            b.setAdapter(c);
            b.setOnItemClickListener(this);
            b.a(this);
            layoutinflater.findViewById(0x7f0d00e8).setOnClickListener(this);
            ((TextView)layoutinflater.findViewById(0x7f0d04d5)).setOnClickListener(this);
            t = (ImageView)layoutinflater.findViewById(0x7f0d04d7);
            f = (TextView)layoutinflater.findViewById(0x7f0d04d8);
            f.setOnClickListener(this);
            if (d != null && d.length >= 50)
            {
                f.setTextColor(getResources().getColor(0x7f0c00c0));
                viewgroup = getResources().getDrawable(0x7f0204e6);
                viewgroup.setAlpha(50);
                f.setCompoundDrawablesWithIntrinsicBounds(null, viewgroup, null, null);
            } else
            {
                f.setTextColor(getResources().getColor(0x7f0c00bf));
                viewgroup = getResources().getDrawable(0x7f0204e6);
                viewgroup.setAlpha(255);
                f.setCompoundDrawablesWithIntrinsicBounds(null, viewgroup, null, null);
            }
            g = (TextView)layoutinflater.findViewById(0x7f0d04d9);
            if (ih.C().ax())
            {
                g.setText(0x7f07032c);
                g.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203cb, 0, 0);
            } else
            {
                g.setText(0x7f070115);
                g.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f02038f, 0, 0);
            }
            g.setOnClickListener(this);
            q = (RelativeLayout)layoutinflater.findViewById(0x7f0d040d);
            r = (TextView)layoutinflater.findViewById(0x7f0d01ac);
            q.setVisibility(8);
        }
        return layoutinflater;
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        if (o != null)
        {
            o = null;
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (isDetached() || getActivity() == null || getActivity().isFinishing())
        {
            return;
        }
        if (e == null)
        {
            adapterview = getResources().getString(0x7f07013c);
            String s1 = getResources().getString(0x7f070126);
            bz bz1 = new bz(this, getActivity());
            e = new r(getActivity(), new String[] {
                adapterview, s1
            }, 1);
            e.a(this);
            e.a(bz1);
        }
        int j1 = view.getHeight() / 4;
        e.a(view, i1, 0, -j1);
    }

    public final void onResume()
    {
        super.onResume();
        if (d == null)
        {
            com.roidapp.photogrid.common.c.a("211", getActivity());
        }
    }

    public final void onStop()
    {
        if (b != null)
        {
            b.a();
        }
        super.onStop();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 0: default 24
    //                   0 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        int i1 = ((Integer)view.getTag()).intValue();
        k = true;
        b.a(i1);
        if (true) goto _L1; else goto _L3
_L3:
    }
}
