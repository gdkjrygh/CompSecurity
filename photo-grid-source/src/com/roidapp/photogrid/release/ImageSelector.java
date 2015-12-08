// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.d.a;
import com.roidapp.baselib.view.FixedDrawerLayout;
import com.roidapp.cloudlib.facebook.FbAlbumListActivity;
import com.roidapp.cloudlib.flickr.FlickrListCloud;
import com.roidapp.cloudlib.instagram.InstagramListCloud;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.filter.aa;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.cloud.DropBoxSelectorActivity;
import com.roidapp.photogrid.cloud.GoogleSearchSelectorActivity;
import com.roidapp.photogrid.cloud.TemplateSelectorActivity;
import com.roidapp.photogrid.common.al;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.bn;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.video.VideoPictureEditActivity;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity, ke, jm, jr, 
//            ig, kc, kd, jo, 
//            ih, la, kt, kb, 
//            ib, GridImageView, ia, jq, 
//            kf, js, ka, km, 
//            kg, kp, rf, ju, 
//            PhotoGridActivity, qx, FaceDetectorActivity, ImageEditFreeCropActivity, 
//            jw, jx, jp, jy, 
//            jz

public class ImageSelector extends ParentActivity
    implements android.view.View.OnClickListener
{

    private String A;
    private boolean B;
    private boolean C;
    private boolean D;
    private String E;
    private Uri F;
    private Bundle G;
    private kt H;
    private TextView I;
    private boolean J;
    private FixedDrawerLayout K;
    private LinearLayout L;
    private ListView M;
    private int N;
    private la O;
    private FrameLayout P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private kp T;
    private boolean U;
    private String V;
    private String W;
    private final ExecutorService X = Executors.newSingleThreadExecutor();
    private int Y;
    private Handler Z;
    public int a;
    private View aa;
    private al ab;
    private android.view.View.OnTouchListener ac;
    private String ad;
    public String b[];
    public int c[];
    private GridView d;
    private ia e;
    private LinearLayout f;
    private TextView g;
    private TextView h;
    private HorizontalScrollView i;
    private LinearLayout j;
    private RelativeLayout k;
    private ProgressBar l;
    private RelativeLayout m;
    private TextView n;
    private ImageButton o;
    private TextView p;
    private TextView q;
    private RelativeLayout r;
    private HashMap s;
    private int y;
    private List z;

    public ImageSelector()
    {
        B = false;
        J = false;
        N = 3;
        Q = false;
        R = false;
        S = false;
        U = false;
        V = "";
        W = "";
        Y = com.roidapp.photogrid.release.ke.a;
        Z = new jm(this);
        ac = new jr(this);
    }

    static TextView A(ImageSelector imageselector)
    {
        return imageselector.I;
    }

    static String B(ImageSelector imageselector)
    {
        return imageselector.ad;
    }

    static TextView C(ImageSelector imageselector)
    {
        return imageselector.p;
    }

    static LinearLayout D(ImageSelector imageselector)
    {
        return imageselector.f;
    }

    static HashMap E(ImageSelector imageselector)
    {
        return imageselector.s;
    }

    static void F(ImageSelector imageselector)
    {
        imageselector.g();
    }

    static HorizontalScrollView G(ImageSelector imageselector)
    {
        return imageselector.i;
    }

    static void H(ImageSelector imageselector)
    {
        imageselector.i();
    }

    static RelativeLayout a(ImageSelector imageselector)
    {
        return imageselector.k;
    }

    static List a(ImageSelector imageselector, String s1)
    {
        return imageselector.e(s1);
    }

    private void a(int i1, Bitmap bitmap, ig ig1)
    {
        this;
        JVM INSTR monitorenter ;
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        if (bitmap.isRecycled()) goto _L2; else goto _L3
_L3:
        String s1 = (new StringBuilder()).append(i1).append("#").append(ig1.n).toString();
        s.put(s1, bitmap);
        bitmap = Message.obtain();
        bitmap.what = 15;
        bitmap.arg1 = i1;
        bitmap.obj = ig1;
        Z.sendMessage(bitmap);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        z.remove(ig1);
        if (true) goto _L5; else goto _L4
_L4:
        bitmap;
        throw bitmap;
    }

    private void a(int i1, Fragment fragment, String s1)
    {
        if (h() || isFinishing())
        {
            return;
        }
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(i1, fragment, s1);
        try
        {
            ad = s1;
            fragmenttransaction.commitAllowingStateLoss();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            Q = false;
        }
        ad = null;
        fragment.printStackTrace();
    }

    private void a(int i1, ig ig1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = (new StringBuilder()).append(i1).append("#").append(ig1.n).toString();
        obj1 = (Bitmap)s.get(obj);
        if (z != null && z.contains(ig1)) goto _L2; else goto _L1
_L1:
        C = false;
        s.remove(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        ((Bitmap) (obj1)).recycle();
_L7:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        View view;
        if (((Bitmap) (obj1)).isRecycled())
        {
            break MISSING_BLOCK_LABEL_455;
        }
        view = LayoutInflater.from(this).inflate(0x7f030121, null);
        ImageButton imagebutton = (ImageButton)view.findViewById(0x7f0d04bb);
        ImageView imageview = (ImageView)view.findViewById(0x7f0d04ba);
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageview.setImageBitmap(((Bitmap) (obj1)));
        imageview.setTag(obj);
        imageview.setOnClickListener(new kc(this, ig1));
        imagebutton.setTag(obj);
        imagebutton.setOnClickListener(new kd(this, ig1));
        if (!C || a != 1)
        {
            break MISSING_BLOCK_LABEL_424;
        }
        if (z.size() < 2)
        {
            break MISSING_BLOCK_LABEL_385;
        }
        obj = s.keySet().iterator();
_L4:
        String s1;
        View view1;
        do
        {
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_385;
                }
                obj1 = (String)((Iterator) (obj)).next();
                s1 = ((String) (obj1)).substring(((String) (obj1)).indexOf("#") + 1);
            } while (s1.equals(ig1.n));
            view1 = f.findViewWithTag(obj1);
        } while (view1 == null);
        if (view1.getParent() == null) goto _L4; else goto _L3
_L3:
        view1 = (View)view1.getParent().getParent();
        f.removeView(view1);
        a(s1, false);
        obj1 = (Bitmap)s.get(obj1);
        if (obj1 == null) goto _L4; else goto _L5
_L5:
        if (((Bitmap) (obj1)).isRecycled()) goto _L4; else goto _L6
_L6:
        ((Bitmap) (obj1)).recycle();
          goto _L4
        ig1;
        throw ig1;
        z.clear();
        z.add(ig1);
        g();
        f.addView(view);
        k();
          goto _L7
        g();
        f.addView(view);
        i.post(new jo(this));
          goto _L7
        C = false;
        z.remove(ig1);
          goto _L7
    }

    static void a(ImageSelector imageselector, int i1)
    {
        imageselector.b(i1);
    }

    static void a(ImageSelector imageselector, int i1, Bitmap bitmap, ig ig1)
    {
        imageselector.a(i1, bitmap, ig1);
    }

    static void a(ImageSelector imageselector, int i1, ig ig1)
    {
        imageselector.a(i1, ig1);
    }

    static void a(ImageSelector imageselector, View view)
    {
        if (view != null) goto _L2; else goto _L1
_L1:
        com.roidapp.photogrid.common.b.a("ImgFolderListNew/jumpCloudNull");
_L4:
        return;
_L2:
        view = (String)view.getTag();
        if (view == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        com.roidapp.photogrid.common.b.a((new StringBuilder("ImageSelector/jumpCloud/")).append(view).toString());
        if (view.equals("cloudfolder_download"))
        {
            imageselector.A = com.roidapp.baselib.d.a.a();
            imageselector.a(true);
            imageselector.o.setVisibility(0);
            return;
        }
        if (!view.equalsIgnoreCase("Flickr"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (imageselector.z != null)
        {
            ih.C().a((ig[])imageselector.z.toArray(new ig[0]));
        }
        if (!imageselector.Q)
        {
            imageselector.Q = true;
            imageselector.d(false);
            com.roidapp.baselib.c.b.d("ImageSelector", "Cloud/Flickr");
            if (!az.w)
            {
                com.roidapp.cloudlib.common.a.b(imageselector, 3);
            }
            view = new Intent();
            view.setClass(imageselector, com/roidapp/cloudlib/flickr/FlickrListCloud);
            imageselector.startActivity(view);
            imageselector.finish();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!view.equalsIgnoreCase("FaceBook"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (imageselector.z != null)
        {
            ih.C().a((ig[])imageselector.z.toArray(new ig[0]));
        }
        if (!imageselector.Q)
        {
            imageselector.Q = true;
            imageselector.d(false);
            com.roidapp.baselib.c.b.d("ImageSelector", "Cloud/Facebook");
            if (!az.w)
            {
                com.roidapp.cloudlib.common.a.b(imageselector, 1);
            }
            view = new Intent();
            view.setClass(imageselector, com/roidapp/cloudlib/facebook/FbAlbumListActivity);
            imageselector.startActivity(view);
            imageselector.finish();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!view.equalsIgnoreCase("DropBox"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (imageselector.z != null)
        {
            ih.C().a((ig[])imageselector.z.toArray(new ig[0]));
        }
        if (!imageselector.Q)
        {
            imageselector.Q = true;
            imageselector.d(false);
            com.roidapp.baselib.c.b.d("ImageSelector", "Cloud/Dropbox");
            if (!az.w)
            {
                com.roidapp.cloudlib.common.a.b(imageselector, 5);
            }
            view = new Intent();
            view.setClass(imageselector, com/roidapp/photogrid/cloud/DropBoxSelectorActivity);
            if (imageselector.u != null)
            {
                imageselector.u.removeAllViews();
            }
            imageselector.startActivity(view);
            imageselector.finish();
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (!view.equalsIgnoreCase("Google"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (imageselector.z != null)
        {
            ih.C().a((ig[])imageselector.z.toArray(new ig[0]));
        }
        if (!imageselector.Q)
        {
            imageselector.Q = true;
            imageselector.d(false);
            com.roidapp.baselib.c.b.d("ImageSelector", "Cloud/Google");
            if (!az.w)
            {
                com.roidapp.cloudlib.common.a.b(imageselector, 4);
            }
            view = new Intent();
            view.setClass(imageselector, com/roidapp/photogrid/cloud/GoogleSearchSelectorActivity);
            if (imageselector.u != null)
            {
                imageselector.u.removeAllViews();
            }
            imageselector.startActivity(view);
            imageselector.finish();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!view.equalsIgnoreCase("Instagram")) goto _L4; else goto _L7
_L7:
        if (imageselector.z != null)
        {
            ih.C().a((ig[])imageselector.z.toArray(new ig[0]));
        }
        if (!imageselector.Q)
        {
            imageselector.Q = true;
            imageselector.d(false);
            com.roidapp.baselib.c.b.d("ImageSelector", "Cloud/Instagram");
            if (!az.w)
            {
                com.roidapp.cloudlib.common.a.b(imageselector, 2);
            }
            view = new Intent();
            view.setClass(imageselector, com/roidapp/cloudlib/instagram/InstagramListCloud);
            if (imageselector.u != null)
            {
                imageselector.u.removeAllViews();
            }
            imageselector.startActivity(view);
            imageselector.finish();
            return;
        }
        if (true) goto _L4; else goto _L8
_L8:
    }

    static void a(ImageSelector imageselector, Object obj)
    {
        String as[];
        Integer ainteger[];
        int i1;
        int j1;
        int k1;
label0:
        {
            if (!imageselector.J)
            {
                if (obj != null)
                {
                    break label0;
                }
                imageselector.b(false);
            }
            return;
        }
        HashMap hashmap = (HashMap)obj;
        obj = (String[])hashmap.get("folders_array");
        as = (String[])hashmap.get("first_pics");
        ainteger = (Integer[])hashmap.get("count");
        if (imageselector.A == null || imageselector.A.equals(""))
        {
            break MISSING_BLOCK_LABEL_517;
        }
        k1 = obj.length;
        i1 = 0;
        j1 = 0;
_L10:
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_517;
        }
        if (!obj[i1].equals(imageselector.A)) goto _L2; else goto _L1
_L1:
        imageselector.N = j1 + 2;
        i1 = 1;
_L12:
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        if (imageselector.N != 2 || !imageselector.A.equals(imageselector.getString(0x7f0702cd))) goto _L6; else goto _L5
_L5:
        if (ainteger[0].intValue() <= 0) goto _L8; else goto _L7
_L7:
        i1 = 1;
_L11:
        imageselector.O = new la(imageselector, imageselector.M, ((String []) (obj)), ainteger, as, imageselector.T);
        imageselector.O.a(imageselector.N, false);
          goto _L9
_L2:
        j1++;
        i1++;
          goto _L10
_L8:
        imageselector.A = obj[1];
        imageselector.N = 3;
_L6:
        i1 = 0;
          goto _L11
_L4:
        if (obj.length > 0)
        {
            if (ainteger[0].intValue() > 0)
            {
                imageselector.A = obj[0];
                imageselector.N = 2;
                i1 = 1;
            } else
            {
                imageselector.A = obj[1];
                imageselector.N = 3;
                i1 = 0;
            }
            imageselector.O = new la(imageselector, imageselector.M, ((String []) (obj)), ainteger, as, imageselector.T);
            imageselector.O.a(imageselector.N, false);
        } else
        {
            imageselector.b(false);
            return;
        }
_L9:
        if (imageselector.U)
        {
            if (imageselector.M.getAdapter() == null)
            {
                imageselector.M.setAdapter(imageselector.O);
                if (imageselector.N > 2)
                {
                    imageselector.M.setSelection(imageselector.N - 2);
                }
            }
            imageselector.Y = com.roidapp.photogrid.release.ke.f;
        }
        if (imageselector.S)
        {
            PreferenceManager.getDefaultSharedPreferences(imageselector).edit().putBoolean("image_selector_sliding_new", false).apply();
            imageselector.M.setAdapter(imageselector.O);
            if (imageselector.N > 2)
            {
                imageselector.M.setSelection(imageselector.N - 2);
            }
            imageselector.Y = com.roidapp.photogrid.release.ke.f;
            imageselector.K.e(imageselector.L);
            imageselector.Z.sendEmptyMessageDelayed(26, 1320L);
        }
        if (imageselector.R)
        {
            imageselector.b(true);
            return;
        }
        imageselector.I.setText(f(imageselector.A));
        if (i1 != 0)
        {
            imageselector.H.a(2);
            return;
        } else
        {
            imageselector.a(imageselector.A, 2);
            return;
        }
        i1 = 0;
          goto _L12
    }

    static void a(ImageSelector imageselector, Object obj, int i1)
    {
        if (!imageselector.J)
        {
            if (obj == null)
            {
                imageselector.b = new String[0];
            } else
            {
                imageselector.b = (String[])((HashMap)obj).get("pics");
            }
            imageselector.c = new int[imageselector.b.length];
            imageselector.I.setText(0x7f0702cd);
            imageselector.b(i1);
        }
    }

    static void a(ImageSelector imageselector, ig aig[])
    {
        imageselector.a(aig);
    }

    private void a(ig ig1, int i1)
    {
        if (J)
        {
            return;
        } else
        {
            X.execute(new kb(this, ig1, i1));
            return;
        }
    }

    private void a(String s1, boolean flag)
    {
        if (b != null && c != null) goto _L2; else goto _L1
_L1:
        com.roidapp.photogrid.common.c.a("370", this);
_L4:
        return;
_L2:
        if (d == null) goto _L4; else goto _L3
_L3:
        int i1 = 0;
_L11:
        if (i1 >= b.length) goto _L4; else goto _L5
_L5:
        int j1;
        if (!s1.equals(b[i1]))
        {
            break MISSING_BLOCK_LABEL_255;
        }
        j1 = 0;
_L10:
        if (j1 >= d.getChildCount()) goto _L7; else goto _L6
_L6:
        ib ib1;
        if (d.getChildAt(j1) == null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        ib1 = (ib)d.getChildAt(j1).getTag();
        if (!ib1.a.getTag().equals(s1))
        {
            break MISSING_BLOCK_LABEL_228;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        if (a == 1 && ib1.d == 1) goto _L4; else goto _L8
_L8:
        ib1.d = ib1.d + 1;
_L9:
        if (ib1.d == 0)
        {
            ib1.b.setVisibility(8);
        } else
        {
            ib1.b.setVisibility(0);
            ib1.b.setText(String.valueOf(ib1.d));
        }
_L7:
        if (flag)
        {
            s1 = c;
            s1[i1] = s1[i1] + 1;
        } else
        {
            s1 = c;
            s1[i1] = s1[i1] - 1;
        }
        e.a(c);
        return;
        ib1.d = ib1.d - 1;
          goto _L9
        j1++;
          goto _L10
        i1++;
          goto _L11
    }

    private void a(ig aig[])
    {
        this;
        JVM INSTR monitorenter ;
        int j1 = aig.length;
        int i1 = j1;
        if (j1 > a)
        {
            i1 = a;
        }
          goto _L1
_L3:
        if (j1 >= i1)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        z.add(aig[j1]);
        y = y + 1;
        a(aig[j1], y);
        j1++;
        continue; /* Loop/switch isn't completed */
        return;
        aig;
        throw aig;
_L1:
        j1 = 0;
        if (true) goto _L3; else goto _L2
_L2:
    }

    static boolean a(ImageSelector imageselector, boolean flag)
    {
        imageselector.U = flag;
        return flag;
    }

    static int b(ImageSelector imageselector, int i1)
    {
        imageselector.Y = i1;
        return i1;
    }

    static ProgressBar b(ImageSelector imageselector)
    {
        return imageselector.l;
    }

    private void b(int i1)
    {
        if (m != null)
        {
            m.setVisibility(8);
        }
        a(false);
        if (i1 == 2)
        {
            if (ih.C().M() != null)
            {
                com.roidapp.photogrid.common.b.a("IS/loadimgs");
                Iterator iterator;
                if (ih.C().M().length == 0)
                {
                    q.setVisibility(0);
                } else
                {
                    q.setVisibility(8);
                }
                a(ih.C().M());
            } else
            {
                q.setVisibility(0);
            }
        }
        if (b == null) goto _L2; else goto _L1
_L1:
        if (z == null) goto _L4; else goto _L3
_L3:
        if (z.size() > 0)
        {
            HashMap hashmap = new HashMap();
            for (iterator = z.iterator(); iterator.hasNext();)
            {
                ig ig1 = (ig)iterator.next();
                if (hashmap.containsKey(ig1.n))
                {
                    i1 = ((Integer)hashmap.get(ig1.n)).intValue();
                    hashmap.put(ig1.n, Integer.valueOf(i1 + 1));
                } else
                {
                    hashmap.put(ig1.n, Integer.valueOf(1));
                }
            }

            q.setVisibility(8);
            String as[] = b;
            int k1 = as.length;
            int j1 = 0;
            i1 = 0;
            do
            {
                if (j1 >= k1)
                {
                    break;
                }
                String s1 = as[j1];
                if (hashmap.size() == 0)
                {
                    break;
                }
                Iterator iterator1 = hashmap.keySet().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    String s2 = (String)iterator1.next();
                    if (!s1.equals(s2))
                    {
                        continue;
                    }
                    c[i1] = ((Integer)hashmap.get(s2)).intValue();
                    hashmap.remove(s2);
                    break;
                } while (true);
                j1++;
                i1++;
            } while (true);
        } else
        {
            q.setVisibility(0);
        }
_L6:
        if (!J)
        {
            D = false;
            e = new ia(this, b, c, T);
            d.setAdapter(e);
            d.setOnTouchListener(ac);
            d.setOnItemClickListener(new jq(this));
        }
_L2:
        return;
_L4:
        q.setVisibility(0);
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void b(ImageSelector imageselector, Object obj)
    {
label0:
        {
            if (imageselector.J)
            {
                break label0;
            }
            kf kf1 = new kf();
            if (obj != null)
            {
                obj = (HashMap)obj;
                if (obj == null)
                {
                    break label0;
                }
                kf1.a((String[])((HashMap) (obj)).get("folders_array"), (String[])((HashMap) (obj)).get("first_pics"), (Integer[])((HashMap) (obj)).get("count"));
            }
            kf1.a(new js(imageselector));
            if (imageselector.P != null && imageselector.P.isShown())
            {
                imageselector.P.bringToFront();
                imageselector.a(0x7f0d037d, kf1, "cloudFragment");
                imageselector.I.setText(0x7f070105);
            }
        }
    }

    static void b(ImageSelector imageselector, String s1)
    {
        imageselector.a(s1, false);
    }

    private void b(boolean flag)
    {
        if (J)
        {
            return;
        }
        if (!flag)
        {
            ListView listview = M;
            kp kp1 = T;
            O = new la(this, listview, new String[0], null, null, kp1);
        }
        O.a(0, false);
        M.setAdapter(O);
        if (S)
        {
            PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("image_selector_sliding_new", false).apply();
            K.e(L);
            Z.postDelayed(new ka(this), 1320L);
        }
        o.setVisibility(4);
        H.b();
    }

    static int c(ImageSelector imageselector, int i1)
    {
        imageselector.N = i1;
        return i1;
    }

    static al c(ImageSelector imageselector)
    {
        return imageselector.ab;
    }

    static String c(ImageSelector imageselector, String s1)
    {
        imageselector.A = s1;
        return s1;
    }

    static String c(String s1)
    {
        return f(s1);
    }

    static void c(ImageSelector imageselector, Object obj)
    {
        if (!imageselector.J && obj != null)
        {
            HashMap hashmap = (HashMap)obj;
            obj = (String[])hashmap.get("folders_array");
            String as[] = (String[])hashmap.get("first_pics");
            Integer ainteger[] = (Integer[])hashmap.get("count");
            if (imageselector.P != null && imageselector.P.isShown())
            {
                imageselector.P.bringToFront();
                km km1 = new km();
                km1.a(((String []) (obj)), as, ainteger);
                imageselector.a(0x7f0d037d, km1, "myfolder");
                imageselector.I.setText(0x7f0702eb);
            }
        }
    }

    private boolean c(boolean flag)
    {
        if (!h() && !isFinishing())
        {
            Q = false;
            Fragment fragment = getSupportFragmentManager().findFragmentByTag(ad);
            if (fragment != null)
            {
                if (fragment instanceof kg)
                {
                    ((kg)fragment).b();
                }
                FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
                fragmenttransaction.remove(fragment);
                fragmenttransaction.commitAllowingStateLoss();
                if (flag)
                {
                    ad = null;
                    I.setText(f(A));
                    O.a(N, true);
                }
                return true;
            }
        }
        return false;
    }

    private static void d(String s1)
    {
        File file;
        file = new File(s1);
        break MISSING_BLOCK_LABEL_9;
        while (true) 
        {
            do
            {
                return;
            } while (!file.exists() || !file.isDirectory());
            String as[] = file.list();
            if (as != null)
            {
                int i1 = 0;
                while (i1 < as.length) 
                {
                    File file1 = new File((new StringBuilder()).append(s1).append(File.separator).append(as[i1]).toString());
                    if (file1.isFile())
                    {
                        file1.delete();
                    }
                    i1++;
                }
            }
        }
    }

    private void d(boolean flag)
    {
        J = true;
        if (ab != null)
        {
            ab.c();
        }
        if (K != null)
        {
            K.b();
        }
        if (T != null)
        {
            T.e();
        }
        if (d != null)
        {
            d.setAdapter(null);
            d = null;
        }
        e = null;
        if (M != null)
        {
            M.setAdapter(null);
        }
        L.setVisibility(8);
        r.setVisibility(8);
        j.removeAllViews();
        if (T != null)
        {
            T.f();
        }
        if (X != null)
        {
            X.shutdownNow();
        }
        j();
        if (flag)
        {
            if (n != null)
            {
                n.setText((new StringBuilder()).append(getResources().getString(0x7f0701a0)).append(" 10%").toString());
            }
            if (m != null)
            {
                m.setVisibility(0);
            }
        }
    }

    static boolean d(ImageSelector imageselector)
    {
        return imageselector.J;
    }

    private List e(String s1)
    {
        int i1 = 0;
        a(6);
        ArrayList arraylist = new ArrayList();
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            Z.sendEmptyMessage(14);
            return arraylist;
        }
        a(10);
        if (s1 == null || s1.equals(""))
        {
            return arraylist;
        }
        a(15);
        ArrayList arraylist1;
        boolean flag;
        if (s1.equals(com.roidapp.baselib.d.a.a()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arraylist1 = new ArrayList();
        s1 = new File(s1);
        a(20);
        if (s1.isDirectory())
        {
            a(21);
            s1 = s1.listFiles();
            a(25);
            if (s1 != null)
            {
                a(26);
                int j1 = s1.length;
                while (i1 < j1) 
                {
                    File file = s1[i1];
                    String s2 = file.getAbsolutePath().toLowerCase(Locale.ENGLISH);
                    if (s2.endsWith(".png") || s2.endsWith(".jpg") || s2.endsWith(".gif") || s2.endsWith(".bmp") || s2.endsWith(".jpeg") || s2.endsWith(".mpo") || bn.a(s2))
                    {
                        if (flag)
                        {
                            if (com.roidapp.photogrid.release.rf.a(file))
                            {
                                arraylist1.add(file);
                            }
                        } else
                        {
                            arraylist1.add(file);
                        }
                    }
                    i1++;
                }
            }
        }
        a(50);
        try
        {
            Collections.sort(arraylist1, new ju(this));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
        a(70);
        for (s1 = arraylist1.iterator(); s1.hasNext(); arraylist.add(((File)s1.next()).getAbsolutePath())) { }
        a(80);
        return arraylist;
    }

    private void e(boolean flag)
    {
        if (Q)
        {
            return;
        }
        if (flag && K != null && L != null && !FixedDrawerLayout.g(L))
        {
            if (M.getAdapter() == null)
            {
                T.b();
                M.setAdapter(O);
                if (N > 2)
                {
                    M.setSelection(N - 2);
                }
            } else
            {
                T.b();
                T.c();
            }
            Y = com.roidapp.photogrid.release.ke.f;
            K.e(L);
            return;
        }
        J = true;
        Q = true;
        flag = az.w;
        if (az.q == 4 && !flag)
        {
            d(false);
            ba.a().a(this);
            ih.C().a(null);
            Intent intent = new Intent();
            intent.setClass(this, com/roidapp/photogrid/cloud/TemplateSelectorActivity);
            startActivity(intent);
            finish();
            com.roidapp.photogrid.b.f.a("TemplateSelect_View", "Cart_TemplateSelect");
            return;
        }
        if (flag)
        {
            d(true);
            Intent intent1;
            if (az.q == 9 || az.q == 10)
            {
                ih.C().a(new ig[] {
                    ih.C().au()
                });
                ih.C().a(null);
                ih.C().j(50);
            } else
            {
                ih.C().a(ih.C().O());
                ih.C().b(null);
                ih.C().ak();
            }
            intent1 = new Intent();
            intent1.setClass(this, com/roidapp/photogrid/release/PhotoGridActivity);
            startActivity(intent1);
            finish();
            az.w = false;
            return;
        }
        d(false);
        ba.a().a(this);
        if (z != null && z.size() > 0)
        {
            ih.C().a((ig[])z.toArray(new ig[0]));
        }
        getSharedPreferences(getPackageName(), 0).edit().putString("folder_name", A).apply();
        az.z = false;
        ih.C().d(A);
        Intent intent2 = new Intent();
        intent2.setClass(this, com/roidapp/photogrid/MainPage);
        startActivity(intent2);
        finish();
        com.roidapp.photogrid.b.f.a("MainPage_View", "Cart_Home");
    }

    static boolean e(ImageSelector imageselector)
    {
        return imageselector.D;
    }

    static Handler f(ImageSelector imageselector)
    {
        return imageselector.Z;
    }

    private static String f(String s1)
    {
        if (s1 != null)
        {
            return s1.substring(s1.lastIndexOf("/") + 1);
        } else
        {
            return "";
        }
    }

    private void g()
    {
        if (!J) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (z != null && z.size() <= 0)
        {
            p.setVisibility(8);
            q.setVisibility(0);
            g.setTextColor(0xff565656);
        } else
        {
            q.setVisibility(8);
            g.setTextColor(getResources().getColor(0x7f0c0062));
        }
        if (!ih.C().P())
        {
            break; /* Loop/switch isn't completed */
        }
        g.setText((new StringBuilder("( ")).append(z.size()).append(" )").toString());
        h.setText(String.format(V, new Object[] {
            Integer.valueOf(a)
        }));
_L4:
        if (z.size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!B)
        {
            j.setBackgroundResource(0x7f0200bc);
            B = true;
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int i1;
        int j1;
label0:
        {
            i1 = a;
            j1 = z.size();
            if (az.q != 4)
            {
                break label0;
            }
            g.setText((new StringBuilder("( ")).append(z.size()).append(" )").toString());
            h.setText(String.format(W, new Object[] {
                Integer.valueOf(a)
            }));
            if (z.size() < a)
            {
                j.setBackgroundColor(getResources().getColor(0x7f0c0043));
                B = false;
                return;
            }
            if (!B)
            {
                j.setBackgroundResource(0x7f0200bc);
                B = true;
                return;
            }
        }
          goto _L1
        g.setText((new StringBuilder()).append(getString(0x7f07022d)).append(i1 - j1).append(getString(0x7f07022c)).toString());
          goto _L4
        if (!B) goto _L1; else goto _L5
_L5:
        ih.C().a(new ig[0]);
        j.setBackgroundColor(getResources().getColor(0x7f0c0043));
        B = false;
        return;
    }

    static boolean g(ImageSelector imageselector)
    {
        imageselector.D = true;
        return true;
    }

    static String h(ImageSelector imageselector)
    {
        return imageselector.A;
    }

    static TextView i(ImageSelector imageselector)
    {
        return imageselector.n;
    }

    private void i()
    {
        if (az.w)
        {
            az.w = false;
            com.roidapp.photogrid.release.qx.a().d();
        }
        if (z != null)
        {
            ih.C().a((ig[])z.toArray(new ig[0]));
        }
        ih.C().j(a);
        startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
        if (u != null)
        {
            u.removeAllViews();
        }
        finish();
        com.roidapp.photogrid.b.f.a("MainPage_View", "Cart_Home");
    }

    static TextView j(ImageSelector imageselector)
    {
        return imageselector.q;
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = s;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = s.keySet().iterator();
_L4:
        Object obj1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_81;
            }
            obj1 = (String)((Iterator) (obj)).next();
            obj1 = (Bitmap)s.get(obj1);
        } while (obj1 == null);
        if (((Bitmap) (obj1)).isRecycled()) goto _L4; else goto _L3
_L3:
        ((Bitmap) (obj1)).recycle();
          goto _L4
        Exception exception;
        exception;
        throw exception;
        s.clear();
          goto _L1
    }

    static List k(ImageSelector imageselector)
    {
        return imageselector.z;
    }

    private void k()
    {
        ih ih1;
        Object obj;
        boolean flag;
        boolean flag1;
        int i1;
        for (i1 = 5; z.size() == 0 || Q;)
        {
            return;
        }

        Q = true;
        J = true;
        c(false);
        Rect rect;
        if (az.q == 6)
        {
            d(false);
        } else
        {
            d(true);
        }
        flag1 = az.w;
        ih1 = ih.C();
        if (!flag1)
        {
            if (az.q == 0 || az.q == 5)
            {
                if (z.size() > 1)
                {
                    i1 = 0;
                }
                az.q = i1;
            }
            ih1.e(true);
        } else
        {
            ih1.e(false);
        }
        obj = getSharedPreferences("FaceClip", 0);
        if (az.q != 4)
        {
            ((SharedPreferences) (obj)).edit().putBoolean("needFaceClip", false).apply();
        }
        flag = ((SharedPreferences) (obj)).getBoolean("needFaceClip", false);
        if (az.w)
        {
            flag = false;
        }
        obj = new Intent();
        az.q;
        JVM INSTR tableswitch 0 5: default 212
    //                   0 447
    //                   1 212
    //                   2 212
    //                   3 212
    //                   4 464
    //                   5 447;
           goto _L1 _L2 _L1 _L1 _L1 _L3 _L2
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_464;
_L4:
        String s1;
        if (az.q == 6)
        {
            PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("first_in", true).apply();
            ih1.l(true);
            ((Intent) (obj)).setClass(this, com/roidapp/photogrid/video/VideoPictureEditActivity);
            com.roidapp.photogrid.b.f.a("VideoSortPage_View", "Cart_VideoSort");
        } else
        if (flag && !A.toLowerCase(Locale.ENGLISH).contains("/face"))
        {
            ((Intent) (obj)).setClass(this, com/roidapp/photogrid/release/FaceDetectorActivity);
            ((Intent) (obj)).putExtra("entryFrom", 1);
            ((Intent) (obj)).putExtra("entryType", 1);
        } else
        if (flag1)
        {
            ((Intent) (obj)).setClass(this, com/roidapp/photogrid/release/ImageEditFreeCropActivity);
        } else
        {
            if (flag)
            {
                ((Intent) (obj)).putExtra("entryFrom", 3);
                ((Intent) (obj)).putExtra("entryType", 1);
            }
            ((Intent) (obj)).setClass(this, com/roidapp/photogrid/release/PhotoGridActivity);
            com.roidapp.photogrid.b.f.a("EditPage_View", "Cart_Edit");
        }
        rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.top > 0)
        {
            az.g = rect.top;
        }
        if (u != null)
        {
            u.removeAllViews();
        }
        ih1.a((ig[])z.toArray(new ig[0]));
        ih1.j(a);
        ih1.d(A);
        if (!az.w)
        {
            ih1.b(com.roidapp.imagelib.filter.aa.a().d());
            com.roidapp.imagelib.filter.aa.a().f();
        }
        if (flag1)
        {
            az.w = false;
        }
        com.roidapp.cloudlib.common.a.A(this);
        getSharedPreferences(getPackageName(), 0).edit().putString("folder_name", A).apply();
        startActivity(((Intent) (obj)));
        overridePendingTransition(0, 0);
        finish();
        return;
_L2:
        s1 = ih1.Y();
        if (s1 != null)
        {
            ih1.c(s1);
        }
          goto _L4
        if (!flag1)
        {
            s1 = ih1.Y();
            if (s1 != null)
            {
                ih1.c(s1);
            }
        }
          goto _L4
    }

    static boolean l(ImageSelector imageselector)
    {
        imageselector.C = false;
        return false;
    }

    static RelativeLayout m(ImageSelector imageselector)
    {
        return imageselector.m;
    }

    static boolean n(ImageSelector imageselector)
    {
        return imageselector.R;
    }

    static boolean o(ImageSelector imageselector)
    {
        imageselector.R = false;
        return false;
    }

    static void p(ImageSelector imageselector)
    {
        imageselector.b(false);
    }

    static LinearLayout q(ImageSelector imageselector)
    {
        return imageselector.L;
    }

    static FixedDrawerLayout r(ImageSelector imageselector)
    {
        return imageselector.K;
    }

    static kp s(ImageSelector imageselector)
    {
        return imageselector.T;
    }

    static void t(ImageSelector imageselector)
    {
        TextView textview;
        if (!imageselector.J && !imageselector.isFinishing() && !imageselector.v)
        {
            if ((textview = (TextView)imageselector.findViewById(0x7f0d008d)) != null)
            {
                Dialog dialog = new Dialog(imageselector, 0x7f0b001d);
                View view;
                android.widget.FrameLayout.LayoutParams layoutparams;
                ViewGroup viewgroup;
                int i1;
                int j1;
                try
                {
                    dialog.setContentView(0x7f0300f0);
                }
                // Misplaced declaration of an exception variable
                catch (ImageSelector imageselector)
                {
                    imageselector.printStackTrace();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ImageSelector imageselector)
                {
                    imageselector.printStackTrace();
                    return;
                }
                dialog.findViewById(0x7f0d03c3).setOnClickListener(new jw(imageselector, dialog));
                view = imageselector.findViewById(0x7f0d0377);
                i1 = textview.getMeasuredWidth();
                j1 = view.getMeasuredWidth();
                ((android.widget.RelativeLayout.LayoutParams)dialog.findViewById(0x7f0d03ca).getLayoutParams()).width = i1 + j1;
                j1 = imageselector.I.getMeasuredWidth();
                layoutparams = (android.widget.FrameLayout.LayoutParams)dialog.findViewById(0x7f0d03c3).getLayoutParams();
                imageselector.aa.getLayoutParams();
                layoutparams.width = j1;
                viewgroup = (ViewGroup)dialog.findViewById(0x7f0d03c8);
                viewgroup.post(new jx(imageselector, textview.getMeasuredWidth() + view.getMeasuredWidth() + layoutparams.width / 2, viewgroup));
                j1 = imageselector.aa.getMeasuredWidth();
                ((android.widget.RelativeLayout.LayoutParams)dialog.findViewById(0x7f0d03cb).getLayoutParams()).width = j1;
                ((TextView)dialog.findViewById(0x7f0d03c4)).setPadding(i1, 0, i1, 0);
                dialog.show();
                return;
            }
        }
    }

    static ListView u(ImageSelector imageselector)
    {
        return imageselector.M;
    }

    static la v(ImageSelector imageselector)
    {
        return imageselector.O;
    }

    static int w(ImageSelector imageselector)
    {
        return imageselector.N;
    }

    static int x(ImageSelector imageselector)
    {
        return imageselector.Y;
    }

    static kt y(ImageSelector imageselector)
    {
        return imageselector.H;
    }

    static ImageButton z(ImageSelector imageselector)
    {
        return imageselector.o;
    }

    public final void a()
    {
        Message message = Message.obtain();
        message.what = 7;
        Z.sendMessage(message);
    }

    public final void a(int i1)
    {
        Message message = Message.obtain();
        message.what = 19;
        message.arg1 = i1;
        Z.sendMessage(message);
    }

    public final void a(ig ig1)
    {
        a(ig1.n);
    }

    public final void a(String s1)
    {
        if (a == 0)
        {
            i();
            return;
        }
        boolean flag = false;
        if (a == 1)
        {
            if (C)
            {
                flag = true;
            }
        } else
        if (z.size() >= a)
        {
            flag = true;
        }
        if (flag)
        {
            s1 = Message.obtain();
            s1.what = 7;
            Z.sendMessage(s1);
            return;
        } else
        {
            C = true;
            ig ig1 = new ig(s1);
            z.add(ig1);
            y = y + 1;
            a(ig1, y);
            a(s1, true);
            return;
        }
    }

    public final void a(String s1, int i1)
    {
        if (d != null)
        {
            d.setAdapter(null);
        }
        if (m != null)
        {
            m.setVisibility(0);
        }
        D = false;
        Z.removeMessages(12);
        Message message = Message.obtain();
        message.what = 12;
        message.arg1 = i1;
        Z.sendMessageDelayed(message, 5000L);
        (new Thread(new jp(this, s1, i1))).start();
    }

    public final void a(String s1, int i1, int j1)
    {
        while (getSupportFragmentManager().findFragmentByTag("FragmentImagePreview") != null || c == null || i1 >= c.length) 
        {
            return;
        }
        if (!h() && !isFinishing()) goto _L2; else goto _L1
_L1:
        T.b();
        kg kg1 = new kg();
        kg1.a(s1, i1, j1);
        a(0x7f0d037e, ((Fragment) (kg1)), "FragmentImagePreview");
        ih.C().d(A);
        return;
_L2:
        Fragment fragment = getSupportFragmentManager().findFragmentByTag("FragmentImagePreview");
        if (fragment != null)
        {
            FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
            fragmenttransaction.remove(fragment);
            try
            {
                fragmenttransaction.commitAllowingStateLoss();
            }
            catch (IllegalStateException illegalstateexception)
            {
                illegalstateexception.printStackTrace();
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean a(boolean flag)
    {
        if (h() || isFinishing())
        {
            return false;
        }
        Q = false;
        if (ad != null)
        {
            Fragment fragment = getSupportFragmentManager().findFragmentByTag(ad);
            if (fragment != null)
            {
                FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
                fragmenttransaction.remove(fragment);
                fragmenttransaction.commitAllowingStateLoss();
                ad = null;
                if (flag)
                {
                    I.setText(f(A));
                    a(A, 1);
                    return true;
                } else
                {
                    T.d();
                    I.setText(f(A));
                    O.a(N, true);
                    return true;
                }
            }
        }
        return false;
    }

    public final List b()
    {
        return z;
    }

    protected final void b(String s1)
    {
        A = s1;
        I.setText(f(A));
        a(A, 1);
        o.setVisibility(0);
    }

    public final String c()
    {
        return "CartPage";
    }

    protected final void d()
    {
        if (H != null)
        {
            H.c();
        }
    }

    public final boolean f()
    {
        return z.size() >= a;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 1002)
        {
            if (j1 != -1)
            {
                return;
            }
            if (F == null && G.getString("PATH") != null)
            {
                F = Uri.parse(G.getString("PATH"));
            }
            if (F != null)
            {
                a(Uri.decode(F.getEncodedPath()));
                sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", F));
            }
        }
        super.onActivityResult(i1, j1, intent);
    }

    public void onClick(View view)
    {
        boolean flag = false;
        if (!Q) goto _L2; else goto _L1
_L1:
        return;
_L2:
        view.getId();
        JVM INSTR lookupswitch 6: default 72
    //                   2131558541: 73
    //                   2131558573: 606
    //                   2131558575: 79
    //                   2131558577: 316
    //                   2131559288: 107
    //                   2131559290: 793;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        return;
_L4:
        e(false);
        return;
_L6:
        if (z != null && z.size() > 0)
        {
            p.setVisibility(0);
            return;
        }
          goto _L1
_L8:
        com.roidapp.photogrid.common.b.a("ImageSelector/toCamrea");
        if (a != 1) goto _L11; else goto _L10
_L10:
        if (C)
        {
            flag = true;
        }
_L13:
        if (flag)
        {
            view = Message.obtain();
            view.what = 7;
            Z.sendMessage(view);
            return;
        }
        break; /* Loop/switch isn't completed */
_L11:
        if (z.size() >= a)
        {
            flag = true;
        }
        if (true) goto _L13; else goto _L12
_L12:
        if (com.roidapp.photogrid.release.rf.b())
        {
            view = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(getString(0x7f07002e)).append("/").toString();
            String s1 = (new StringBuilder("camera_")).append(System.currentTimeMillis()).append(".jpg").toString();
            Intent intent = com.roidapp.cloudlib.al.g().a(this, view, s1);
            if (intent != null)
            {
                F = Uri.fromFile(new File(view, s1));
                try
                {
                    startActivityForResult(intent, 1002);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    view.printStackTrace();
                }
                return;
            }
        } else
        {
            an.a(new WeakReference(this), getString(0x7f07028d));
            return;
        }
          goto _L1
_L7:
        p.setVisibility(8);
        q.setVisibility(0);
        f.removeAllViews();
        j();
        z = new ArrayList();
        if (d != null)
        {
            for (int i1 = 0; i1 < d.getChildCount(); i1++)
            {
                if (d.getChildAt(i1) != null)
                {
                    view = (ib)d.getChildAt(i1).getTag();
                    view.d = 0;
                    ((ib) (view)).b.setVisibility(8);
                }
            }

        }
        if (c != null)
        {
            for (int j1 = 0; j1 < c.length; j1++)
            {
                c[j1] = 0;
            }

        }
        if (e == null && d != null && d.getAdapter() != null)
        {
            e = (ia)d.getAdapter();
        }
        if (e != null)
        {
            e.a(c);
        }
        ih.C().a(new ig[0]);
        C = false;
        g();
        if (az.q == 6)
        {
            view = (new StringBuilder()).append(ImageLibrary.a().b(this));
            ImageLibrary.a();
            d(view.append(ImageLibrary.f()).toString());
        }
        view = getSupportFragmentManager().findFragmentByTag("FragmentImagePreview");
        if (view != null)
        {
            ((kg)view).a();
            return;
        }
          goto _L1
_L5:
        if (z == null || z.size() == 0 || !B)
        {
            if (z != null && z.size() != 0)
            {
                an.a(new WeakReference(this), String.format(getString(0x7f0701ea), new Object[] {
                    Integer.valueOf(a - z.size())
                }));
                return;
            }
            if (ih.C().P())
            {
                an.a(new WeakReference(this), getString(0x7f0701e9));
                return;
            }
            if (a == 1)
            {
                an.a(new WeakReference(this), getString(0x7f0701eb));
                return;
            } else
            {
                an.a(new WeakReference(this), String.format(getString(0x7f0701ea), new Object[] {
                    Integer.valueOf(a)
                }));
                return;
            }
        } else
        {
            k();
            return;
        }
_L9:
        if (p.getVisibility() == 0)
        {
            p.setVisibility(8);
        }
        if (M.getAdapter() == null)
        {
            T.b();
            M.setAdapter(O);
            if (N > 2)
            {
                M.setSelection(N - 2);
            }
            if (FixedDrawerLayout.g(L))
            {
                K.f(L);
                return;
            } else
            {
                Y = com.roidapp.photogrid.release.ke.f;
                K.e(L);
                return;
            }
        }
        if (FixedDrawerLayout.g(L))
        {
            K.f(L);
            return;
        } else
        {
            Y = com.roidapp.photogrid.release.ke.f;
            T.b();
            T.c();
            K.e(L);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ba.a().a(this);
        try
        {
            setContentView(0x7f0300d4);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (v) goto _L2; else goto _L1
_L1:
        z = new ArrayList();
        f = (LinearLayout)findViewById(0x7f0d00b3);
        s = new HashMap();
        g = (TextView)findViewById(0x7f0d00af);
        h = (TextView)findViewById(0x7f0d00b0);
        l = (ProgressBar)findViewById(0x7f0d008b);
        i = (HorizontalScrollView)findViewById(0x7f0d00b2);
        m = (RelativeLayout)findViewById(0x7f0d040d);
        n = (TextView)findViewById(0x7f0d01ac);
        q = (TextView)findViewById(0x7f0d00b4);
        d = (GridView)findViewById(0x7f0d0102);
        V = getResources().getString(0x7f0701b8);
        W = getResources().getString(0x7f070268);
        a = ih.C().K();
        if (a == 0)
        {
            a = ih.C().ak();
        }
        if (ih.C().P())
        {
            if (a == 1)
            {
                q.setText(getResources().getString(0x7f0701f1));
            } else
            {
                q.setText(String.format(getResources().getString(0x7f0701f0), new Object[] {
                    Integer.valueOf(a)
                }));
            }
        } else
        if (a == 1)
        {
            q.setText(getResources().getString(0x7f0701f3));
        } else
        {
            q.setText(String.format(getResources().getString(0x7f0701f2), new Object[] {
                Integer.valueOf(a)
            }));
        }
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            R = bundle.getBoolean("fromCloud", false);
            if (bundle.getString("folder_path") != null)
            {
                A = bundle.getString("folder_path");
            } else
            {
                A = getSharedPreferences(getPackageName(), 0).getString("folder_name", "");
            }
        } else
        {
            A = getSharedPreferences(getPackageName(), 0).getString("folder_name", "");
        }
        P = (FrameLayout)findViewById(0x7f0d037d);
        ((TextView)findViewById(0x7f0d008d)).setOnClickListener(this);
        I = (TextView)findViewById(0x7f0d037b);
        I.setText(0x7f0701a0);
        o = (ImageButton)findViewById(0x7f0d0378);
        o.setAlpha(165);
        o.setOnClickListener(this);
        p = (TextView)findViewById(0x7f0d00b1);
        p.setOnClickListener(this);
        bundle = getResources().getDrawable(0x7f02037b);
        bundle.setAlpha(165);
        g.setCompoundDrawablesWithIntrinsicBounds(bundle, null, null, null);
        g.setOnClickListener(this);
        r = (RelativeLayout)findViewById(0x7f0d037c);
        r.setOnTouchListener(ac);
        j = (LinearLayout)findViewById(0x7f0d00ad);
        j.setOnClickListener(this);
        g();
        if (getSharedPreferences("DebugMode", 0).getBoolean("DebugMode", false))
        {
            ab = new al(this, Z);
            ab.b();
            ba.a().b();
        }
        com.roidapp.photogrid.common.b.a("IS/create");
        bundle = PreferenceManager.getDefaultSharedPreferences(this);
        if (bundle.getBoolean("NEW_USER_SELECTOR", false))
        {
            bundle.edit().putBoolean("NEW_USER_SELECTOR", false).apply();
        }
        S = bundle.getBoolean("image_selector_sliding_new", true);
        az.q;
        JVM INSTR tableswitch 0 10: default 672
    //                   0 1077
    //                   1 1127
    //                   2 1147
    //                   3 1157
    //                   4 1167
    //                   5 1087
    //                   6 1137
    //                   7 672
    //                   8 1117
    //                   9 1097
    //                   10 1107;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L3 _L11 _L12 _L13
_L3:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_1167;
_L14:
        aa = findViewById(0x7f0d037a);
        aa.setOnClickListener(this);
        ((RelativeLayout)findViewById(0x7f0d00e7)).setOnTouchListener(ac);
        if (az.w)
        {
            E = "FreeCrop";
        }
        H = new kt(this, Z);
        char c1 = 'd';
        int i1 = getResources().getDisplayMetrics().widthPixels;
        if (i1 <= 480)
        {
            c1 = 'F';
        } else
        if (i1 >= 1440)
        {
            c1 = '\226';
        }
        T = new kp(this, c1, Z);
        bundle = new android.graphics.BitmapFactory.Options();
        bundle.inScaled = false;
        try
        {
            bundle = BitmapFactory.decodeResource(getResources(), 0x7f020086, bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            bundle = null;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            bundle = null;
        }
        T.a(bundle);
        K = (FixedDrawerLayout)findViewById(0x7f0d002d);
        K.setFocusableInTouchMode(false);
        L = (LinearLayout)findViewById(0x7f0d002f);
        M = (ListView)findViewById(0x7f0d0031);
        K.a(new jy(this));
        M.setOnItemClickListener(new jz(this));
        H.a();
_L2:
        return;
_L4:
        E = "GridActivity";
          goto _L14
_L9:
        E = "GridActivity/Single";
          goto _L14
_L12:
        E = "VideoActivity/Single";
          goto _L14
_L13:
        E = "CameraActivity/Single";
          goto _L14
_L11:
        E = "GridActivity/Movie";
          goto _L14
_L5:
        E = "FreeActivity";
          goto _L14
_L10:
        E = "VideoActivity";
          goto _L14
_L6:
        E = "WideActivity";
          goto _L14
_L7:
        E = "HighActivity";
          goto _L14
        E = "GridActivity/Template";
          goto _L14
    }

    public void onDestroy()
    {
        com.roidapp.photogrid.common.b.a("IS/des");
        J = true;
        T = null;
        super.onDestroy();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            if ("FragmentImagePreview".equals(ad) && c(true))
            {
                return true;
            }
            if (p.getVisibility() == 0)
            {
                p.setVisibility(8);
                return true;
            } else
            {
                e(true);
                return true;
            }
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public void onPause()
    {
        if ("FragmentImagePreview".equals(ad))
        {
            c(true);
        }
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        G = bundle;
    }

    public void onResume()
    {
        super.onResume();
        if (a == 0)
        {
            i();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        if (F != null)
        {
            bundle.putString("PATH", F.toString());
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        super.onStart();
        com.roidapp.photogrid.common.b.a("ImageSelector/start");
        com.roidapp.baselib.c.b.d("ImageSelector");
    }

    protected void onStop()
    {
        super.onStop();
        com.roidapp.baselib.c.b.a("ImageSelector", A());
    }

    public final void x()
    {
        t = "image_selector";
    }
}
