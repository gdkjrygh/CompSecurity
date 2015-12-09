// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.common.utils.d;
import com.aviary.android.feather.common.utils.j;
import com.aviary.android.feather.common.utils.l;
import com.aviary.android.feather.headless.filters.NativeFilterProxy;
import com.aviary.android.feather.library.MonitoredActivity;
import com.aviary.android.feather.library.c.e;
import com.aviary.android.feather.library.services.HiResBackgroundService;
import com.aviary.android.feather.library.services.LocalDataService;
import com.aviary.android.feather.library.services.drag.DragLayer;
import com.aviary.android.feather.sdk.panels.AbstractPanelLoaderService;
import com.aviary.android.feather.sdk.widget.AviaryBottomBarViewFlipper;
import com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher;
import com.aviary.android.feather.sdk.widget.AviaryNavBarViewFlipper;
import it.sephiroth.android.library.b.c;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.aviary.android.feather.sdk:
//            AviaryMainController, a

public class FeatherActivity extends MonitoredActivity
    implements AviaryMainController.a, AviaryMainController.b, AviaryMainController.c, a.a, com.aviary.android.feather.sdk.widget.AviaryBottomBarViewFlipper.a, com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.c, com.aviary.android.feather.sdk.widget.AviaryNavBarViewFlipper.a, it.sephiroth.android.library.widget.AdapterView.c
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/sdk/FeatherActivity$a, s1);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("ASK", 0);
            b = new a("CLOSE", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    class b extends ArrayAdapter
    {

        Object a;
        LayoutInflater b;
        List c;
        int d;
        int e;
        boolean f;
        final FeatherActivity g;

        public com.aviary.android.feather.library.a.a a(int i1)
        {
            return (com.aviary.android.feather.library.a.a)c.get(i1);
        }

        public int getCount()
        {
            if (f)
            {
                return c.size();
            } else
            {
                return c.size() + 1;
            }
        }

        public Object getItem(int i1)
        {
            return a(i1);
        }

        public long getItemId(int i1)
        {
            return 0L;
        }

        public int getItemViewType(int i1)
        {
            while (f || i1 != getCount() - 1) 
            {
                return 0;
            }
            return 1;
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            int j1 = getItemViewType(i1);
            Object obj = view;
            if (view == null)
            {
                if (j1 == 0)
                {
                    view = b.inflate(R.layout.aviary_tool_layout, viewgroup, false);
                    viewgroup = view.getLayoutParams();
                    if (e == -1)
                    {
                        obj = com.aviary.android.feather.sdk.FeatherActivity.c(g).c(view);
                        double d1 = Math.floor((double)d / (double)obj[0]);
                        e = (int)((double)d / (d1 + 0.5D));
                    }
                    obj = view;
                    if (viewgroup != null)
                    {
                        viewgroup.width = e;
                        view.setLayoutParams(viewgroup);
                        obj = view;
                    }
                } else
                {
                    obj = b.inflate(R.layout.aviary_tool_feedback_layout, viewgroup, false);
                }
            }
            if (j1 == 0)
            {
                ((View) (obj)).setTag(a(i1));
            }
            return ((View) (obj));
        }

        public int getViewTypeCount()
        {
            return !f ? 2 : 1;
        }

        public b(Context context, List list, boolean flag)
        {
            g = FeatherActivity.this;
            super(context, -1);
            a = new Object();
            d = context.getResources().getDisplayMetrics().widthPixels;
            e = -1;
            b = LayoutInflater.from(context);
            c = list;
            f = flag;
        }
    }

    class c extends com.aviary.android.feather.common.utils.os.a
        implements android.content.DialogInterface.OnDismissListener, android.media.MediaScannerConnection.OnScanCompletedListener, com.aviary.android.feather.library.b.b.a, com.aviary.android.feather.library.services.HiResBackgroundService.b
    {

        File a;
        Bitmap b;
        ProgressDialog c;
        com.aviary.android.feather.headless.a d;
        a e;
        android.graphics.Bitmap.CompressFormat f;
        boolean g;
        String h;
        com.aviary.android.feather.common.a.a.c i;
        final FeatherActivity j;
        private int k;
        private Object l;
        private Object m;
        private Uri n;

        private boolean d()
        {
            i.b("saveInBackgroundHiRes");
            HiResBackgroundService hiresbackgroundservice = (HiResBackgroundService)j.c.a(com/aviary/android/feather/library/services/HiResBackgroundService);
            if (hiresbackgroundservice == null)
            {
                return false;
            }
            j.c.a(this);
            hiresbackgroundservice.a(a.getAbsolutePath(), f, k);
            i.a("waiting for notification from mFinishedLock..");
            Object obj = l;
            obj;
            JVM INSTR monitorenter ;
            i.a("waiting for mFinishedLock...");
            l.wait();
            j.c.b(this);
            return true;
            Object obj1;
            obj1;
            ((InterruptedException) (obj1)).printStackTrace();
            j.c.b(this);
            obj;
            JVM INSTR monitorexit ;
            return false;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
        }

        private boolean e()
        {
            i.b("saveInBackgroundLowRes");
            try
            {
                FileOutputStream fileoutputstream = new FileOutputStream(a);
                b.compress(f, k, fileoutputstream);
                com.aviary.android.feather.common.utils.d.a(fileoutputstream);
            }
            catch (IOException ioexception)
            {
                i.d(ioexception.getMessage());
                h = ioexception.getMessage();
                ioexception.printStackTrace();
                return false;
            }
            return true;
        }

        protected transient Pair a(Bitmap abitmap[])
        {
            b = abitmap[0];
            boolean flag;
            if (g)
            {
                flag = d();
            } else
            {
                flag = e();
            }
            if (isCancelled())
            {
                return null;
            }
            if (!flag || a == null || h != null || d != null)
            {
                break MISSING_BLOCK_LABEL_175;
            }
            try
            {
                com.aviary.android.feather.library.b.a.a(j, a);
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap abitmap[])
            {
                abitmap.printStackTrace();
                h = abitmap.getMessage();
                return null;
            }
            j.b(a.getAbsolutePath());
            (new com.aviary.android.feather.library.b.b(j, a, this, this)).a();
            if (true) goto _L2; else goto _L1
_L1:
            abitmap;
            JVM INSTR monitorenter ;
_L2:
            synchronized (m)
            {
                m.wait();
            }
            return Pair.create(a.getAbsolutePath(), n);
            InterruptedException interruptedexception;
            interruptedexception;
            interruptedexception.printStackTrace();
            h = interruptedexception.getMessage();
            abitmap;
            JVM INSTR monitorexit ;
            return null;
            exception;
            abitmap;
            JVM INSTR monitorexit ;
            throw exception;
            return null;
        }

        protected void a()
        {
            i.b("PreExecute");
            c = new ProgressDialog(j);
            c.setIndeterminate(true);
            c.setProgressStyle(0);
            c.setCancelable(true);
            c.setCanceledOnTouchOutside(false);
            c.setOnDismissListener(this);
            c.setMessage(j.getString(R.string.feather_save_progress));
            c.show();
        }

        public void a(int i1, int j1)
        {
            publishProgress(new Integer[] {
                Integer.valueOf(i1), Integer.valueOf(j1)
            });
        }

        protected void a(Pair pair)
        {
            i.c("PostExecute, mErrorString:%s, mHiResException: %s", new Object[] {
                h, d
            });
            try
            {
                if (c.getWindow() != null)
                {
                    c.dismiss();
                }
            }
            catch (Throwable throwable)
            {
                throwable.printStackTrace();
                i.d(throwable.getMessage());
            }
            if (isCancelled())
            {
                i.c("was cancelled..");
                j.a(0, null);
                j.finish();
                return;
            }
            if (d != null || h != null || pair == null)
            {
                if (d != null)
                {
                    j.a(b, null, f, k, false, e);
                    return;
                }
                FeatherActivity featheractivity = j;
                if (h != null)
                {
                    pair = h;
                } else
                {
                    pair = j.getString(R.string.feather_error_saving_image);
                }
                featheractivity.c(pair);
                return;
            } else
            {
                j.a(pair, e);
                return;
            }
        }

        public void a(com.aviary.android.feather.headless.a a1)
        {
            i.c("onHiresError: %s", new Object[] {
                a1
            });
            d = a1;
            synchronized (l)
            {
                l.notify();
            }
            return;
            exception;
            a1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected volatile void a(Object obj)
        {
            a((Pair)obj);
        }

        protected transient void a(Integer ainteger[])
        {
            int i1 = ainteger[0].intValue();
            int j1 = ainteger[1].intValue();
            i.c("ProgressUpdate. %d/%d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(j1)
            });
            if (i1 == 1)
            {
                ainteger = j.getString(R.string.feather_loading_image);
            } else
            if (i1 == j1)
            {
                ainteger = j.getString(R.string.feather_save_progress);
            } else
            {
                ainteger = (new StringBuilder()).append("Applying action ").append(i1 - 1).append(" of ").append(j1 - 2).toString();
            }
            c.setMessage(ainteger);
        }

        protected volatile void a(Object aobj[])
        {
            a((Integer[])aobj);
        }

        public void b()
        {
            i.d("onScanError");
            synchronized (m)
            {
                m.notify();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void c()
        {
            i.a("onHiresComplete");
            synchronized (l)
            {
                l.notify();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Bitmap[])aobj);
        }

        protected void onCancelled()
        {
            i.d("save task cancelled");
            j.a(0, null);
            j.finish();
        }

        public void onDismiss(DialogInterface dialoginterface)
        {
            i.d("onDismiss");
            cancel(true);
        }

        public void onScanCompleted(String s1, Uri uri)
        {
            i.b((new StringBuilder()).append("onScanCompleted: ").append(s1).append(", uri: ").append(uri).toString());
            n = uri;
            synchronized (m)
            {
                m.notify();
            }
            return;
            uri;
            s1;
            JVM INSTR monitorexit ;
            throw uri;
        }

        public c(File file, a a1, android.graphics.Bitmap.CompressFormat compressformat, int i1, boolean flag)
        {
            j = FeatherActivity.this;
            super();
            l = new Object();
            m = new Object();
            i = com.aviary.android.feather.common.a.a.a("SaveHiResImageTask", com.aviary.android.feather.common.a.a.d.a);
            i.c("ctor, file: %s, action: %s, hires: %b", new Object[] {
                file.getAbsolutePath(), a1, Boolean.valueOf(flag)
            });
            e = a1;
            a = file;
            g = flag;
            f = compressformat;
            k = i1;
        }
    }


    protected final com.aviary.android.feather.common.a.a.c b;
    protected AviaryMainController c;
    protected boolean d;
    protected final Handler e = new Handler();
    private int f;
    private AviaryNavBarViewFlipper g;
    private HListView h;
    private com.aviary.android.feather.sdk.widget.c i;
    private ViewGroup j;
    private View k;
    private int l;
    private AviaryBottomBarViewFlipper m;
    private ViewGroup n;
    private DragLayer o;
    private com.aviary.android.feather.sdk.a p;
    private boolean q;
    private Handler r;
    private AviaryImageRestoreSwitcher s;

    public FeatherActivity()
    {
        b = com.aviary.android.feather.common.a.a.a("FeatherActivity", com.aviary.android.feather.common.a.a.d.a);
        f = 0;
        r = new Handler(new android.os.Handler.Callback() {

            final FeatherActivity a;

            public boolean handleMessage(Message message)
            {
                a.a(message.what, message.arg1, message.obj);
                return true;
            }

            
            {
                a = FeatherActivity.this;
                super();
            }
        });
    }

    private void E()
    {
        c = new AviaryMainController(this, r);
        a(c);
    }

    private void F()
    {
        g.setOnToolbarClickListener(this);
        s.getDefaultImageView().setDoubleTapEnabled(false);
        s.getDefaultImageView().setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        s.getRestoredImageView().setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        h.setAdapter(null);
        m.setOnBottomBarItemClickListener(this);
        LocalDataService localdataservice = (LocalDataService)c.a(com/aviary/android/feather/library/services/LocalDataService);
        if (localdataservice != null && localdataservice.a("white-label"))
        {
            m.a(false);
        }
    }

    private void G()
    {
        a(((LocalDataService)c.a(com/aviary/android/feather/library/services/LocalDataService)).h());
    }

    private void H()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(getResources().getInteger(0x10e0001));
        alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final FeatherActivity a;

            public void onAnimationEnd(Animation animation)
            {
                com.aviary.android.feather.sdk.FeatherActivity.b(a).setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                a = FeatherActivity.this;
                super();
            }
        });
        k.startAnimation(alphaanimation);
    }

    static void a(FeatherActivity featheractivity)
    {
        featheractivity.G();
    }

    static View b(FeatherActivity featheractivity)
    {
        return featheractivity.k;
    }

    static HListView c(FeatherActivity featheractivity)
    {
        return featheractivity.h;
    }

    public AviaryMainController A()
    {
        return c;
    }

    public boolean B()
    {
        b.b("onRestoreBegin");
        if (c != null && c.m() != null && !c.p() && c.o())
        {
            s.setDisplayedChild(1);
            k().a("editor: original_shown");
            return true;
        } else
        {
            return false;
        }
    }

    public void C()
    {
        b.b("onRestoreChanged");
        g.a(true);
        k().a("editor: restore_original_shown");
    }

    public void D()
    {
        b.b("onRestoreEnd");
        s.setDisplayedChild(0);
        g.a(false);
    }

    protected Dialog a(int i1, String s1, android.view.View.OnClickListener onclicklistener)
    {
        Dialog dialog = new Dialog(this, R.style.AviaryTheme_Dialog_Custom);
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.aviary_feedback_dialog_view);
        dialog.setCanceledOnTouchOutside(true);
        Object obj = dialog.getWindow();
        TextView textview = (TextView)((Window) (obj)).findViewById(R.id.aviary_version);
        TextView textview1 = (TextView)((Window) (obj)).findViewById(R.id.aviary_text);
        Button button = (Button)((Window) (obj)).findViewById(R.id.aviary_button1);
        obj = (Button)((Window) (obj)).findViewById(R.id.aviary_button2);
        textview.setText((new StringBuilder()).append(getString(R.string.feather_version)).append(" ").append("3.4.10").toString());
        textview1.setText(i1);
        button.setText(s1);
        button.setOnClickListener(new android.view.View.OnClickListener(onclicklistener, dialog) {

            final android.view.View.OnClickListener a;
            final Dialog b;
            final FeatherActivity c;

            public void onClick(View view)
            {
                if (a != null)
                {
                    a.onClick(view);
                }
                b.dismiss();
            }

            
            {
                c = FeatherActivity.this;
                a = onclicklistener;
                b = dialog;
                super();
            }
        });
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener(dialog) {

            final Dialog a;
            final FeatherActivity b;

            public void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                b = FeatherActivity.this;
                a = dialog;
                super();
            }
        });
        return dialog;
    }

    protected Uri a(Intent intent)
    {
        b.b("handleIntent");
        if (intent != null && intent.getData() != null)
        {
            Object obj = intent.getAction();
            HashMap hashmap = new HashMap();
            if (obj == null)
            {
                obj = "null";
            }
            hashmap.put("from", obj);
            k().a("editor: invoked", hashmap);
            obj = intent.getData();
            intent = ((Intent) (obj));
            if (com.aviary.android.feather.common.utils.l.c())
            {
                intent = ((Intent) (obj));
                if (((Uri) (obj)).toString().startsWith("content://com.android.gallery3d.provider"))
                {
                    intent = Uri.parse(((Uri) (obj)).toString().replace("com.android.gallery3d", "com.google.android.gallery3d"));
                }
            }
            b.a((new StringBuilder()).append("src: ").append(intent).toString());
            return intent;
        } else
        {
            return null;
        }
    }

    Pair a(List list)
    {
        List list1 = list;
        if (list == null)
        {
            list = t();
            list1 = list;
            if (list == null)
            {
                list1 = Arrays.asList(com.aviary.android.feather.library.filters.a.a());
            }
        }
        list = new ArrayList();
        HashMap hashmap = new HashMap();
        com.aviary.android.feather.library.a.a aa[] = AbstractPanelLoaderService.a();
        int i1 = 0;
        while (i1 < aa.length) 
        {
            com.aviary.android.feather.library.filters.a.a a1 = aa[i1].c;
            if (list1 == null || list1.contains(a1.name()))
            {
                hashmap.put(a1.name(), aa[i1]);
            }
            i1++;
        }
        if (list1 != null)
        {
            Iterator iterator = list1.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                if (hashmap.containsKey(s1))
                {
                    list.add(hashmap.get(s1));
                }
            } while (true);
        }
        return new Pair(list1, list);
    }

    public ImageViewTouchBase a()
    {
        return u();
    }

    protected File a(android.graphics.Bitmap.CompressFormat compressformat)
    {
        return b(compressformat);
    }

    public void a(int i1)
    {
        if (i1 == R.id.aviary_white_logo)
        {
            showDialog(4);
        }
    }

    protected void a(int i1, int j1, Object obj)
    {
        boolean flag = false;
        b.b((new StringBuilder()).append("onStateChanged: ").append(i1).toString());
        switch (i1)
        {
        default:
            return;

        case 0: // '\0'
            g.setClickable(false);
            return;

        case 1: // '\001'
            g.setClickable(true);
            return;

        case 2: // '\002'
            g.setClickable(false);
            s.setVisibility(0);
            return;

        case 3: // '\003'
            h.setEnabled(true);
            g.setClickable(true);
            g.b();
            g.setSaveEnabled(true);
            return;

        case 4: // '\004'
            h.setEnabled(false);
            g.setClickable(false);
            g.setSaveEnabled(false);
            return;

        case 5: // '\005'
            s.setVisibility(8);
            return;

        case 6: // '\006'
            g.a(c.q().a, false);
            g.a();
            u().e();
            s.a();
            return;

        case 100: // 'd'
            g.setTitle((CharSequence)obj);
            return;

        case 101: // 'e'
            g.setTitle(j1);
            return;

        case 102: // 'f'
            obj = g;
            break;
        }
        if (j1 != 0)
        {
            flag = true;
        }
        ((AviaryNavBarViewFlipper) (obj)).setApplyVisible(flag);
    }

    protected final void a(int i1, Intent intent)
    {
        f = i1;
        Intent intent1 = intent;
        if (intent == null)
        {
            intent1 = new Intent();
        }
        intent = getIntent();
        if (intent != null)
        {
            intent = intent.getBundleExtra("extra-in-extras");
            if (intent != null)
            {
                intent1.putExtra("extra-in-extras", intent);
            }
            if (c != null && !intent1.hasExtra("bitmap-changed"))
            {
                intent1.putExtra("bitmap-changed", c.n());
            }
        }
        setResult(i1, intent1);
    }

    protected void a(Bitmap bitmap, Uri uri, android.graphics.Bitmap.CompressFormat compressformat, int i1, boolean flag, a a1)
    {
        Object obj;
        b.c("performSave, uri:%s, quality: %d, action:%s", new Object[] {
            uri, Integer.valueOf(i1), a1
        });
        if (uri != null)
        {
            uri = new File(uri.getPath());
        } else
        {
            uri = a(compressformat);
        }
        b.a("trying to create the new file...");
        obj = uri;
        if (uri.exists())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        obj = uri;
        if (uri.createNewFile())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        b.d("Failed to create the file");
        obj = uri;
_L2:
        ((LocalDataService)A().a(com/aviary/android/feather/library/services/LocalDataService)).b(Uri.parse(((File) (obj)).getAbsolutePath()));
        (new c(((File) (obj)), a1, compressformat, i1, flag)).execute(new Bitmap[] {
            bitmap
        });
        return;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        try
        {
            b.d("using a temporary file!");
            ioexception = File.createTempFile("aviary-image-", ".jpeg");
        }
        catch (IOException ioexception1)
        {
            ioexception1.printStackTrace();
            ioexception1 = uri;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(Bitmap bitmap, e e1)
    {
        b.b("onDownloadComplete");
        b.b("imageinfo: %s", new Object[] {
            e1
        });
        p = null;
        u().a(bitmap, null, -1F, 8F);
        Animation animation = AnimationUtils.loadAnimation(this, 0x10a0000);
        animation.setFillEnabled(true);
        s.setVisibility(0);
        s.startAnimation(animation);
        H();
        if (c != null)
        {
            if (!c.r())
            {
                c.a(bitmap, e1);
            }
            if (c.m() != null)
            {
                s.getRestoredImageView().a(c.m(), null, -1F, 8F);
                s.setOnRestoreStateListener(this);
                s.setRestoreEnabled(true);
            } else
            {
                s.setRestoreEnabled(false);
                s.setOnRestoreStateListener(null);
            }
        }
        if (bitmap != null && e1.b() != null)
        {
            b.d((new StringBuilder()).append("original.size: ").append(e1.b()[0]).append("x").append(e1.b()[1]).toString());
            b.d((new StringBuilder()).append("final.size: ").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).toString());
        }
        e1 = getIntent();
        if (e1 != null && e1.hasExtra("extra-in-quick-tool"))
        {
            bitmap = com.aviary.android.feather.library.filters.a.a(e1.getStringExtra("extra-in-quick-tool"));
            e1 = e1.getBundleExtra("extra-in-quick-tool-options");
            if (bitmap != null)
            {
                e.post(new Runnable(bitmap, e1) {

                    final com.aviary.android.feather.library.filters.a.a a;
                    final Bundle b;
                    final FeatherActivity c;

                    public void run()
                    {
                        c.a(a, b);
                    }

            
            {
                c = FeatherActivity.this;
                a = a1;
                b = bundle;
                super();
            }
                });
            }
        }
    }

    public void a(Bitmap bitmap, boolean flag)
    {
        boolean flag1 = true;
        if (!flag)
        {
            flag1 = com.aviary.android.feather.library.c.b.b(((it.sephiroth.android.library.imagezoom.a.b)u().getDrawable()).a(), bitmap);
        }
        b.b((new StringBuilder()).append("onPreviewChange: ").append(bitmap).append(", changed: ").append(flag1).toString());
        Matrix matrix;
        if (!flag1)
        {
            matrix = u().getDisplayMatrix();
        } else
        {
            matrix = null;
        }
        u().a(bitmap, matrix, -1F, 8F);
        s.a();
    }

    public void a(Bitmap bitmap, boolean flag, Matrix matrix)
    {
        Matrix matrix1 = matrix;
        if (!flag)
        {
            matrix1 = matrix;
            if (matrix == null)
            {
                matrix1 = u().getDisplayMatrix();
            }
        }
        u().a(bitmap, matrix1, -1F, 8F);
        s.a();
    }

    protected void a(Uri uri)
    {
        if (p != null)
        {
            p.a(null);
            p = null;
        }
        Object obj = (LocalDataService)c.a(com/aviary/android/feather/library/services/LocalDataService);
        int i1 = ((Integer)((LocalDataService) (obj)).a("max-image-size", Integer.valueOf(0))).intValue();
        ((LocalDataService) (obj)).a(uri);
        boolean flag;
        if (c.j() == null && ((LocalDataService) (obj)).a("tools-list"))
        {
            obj = Arrays.asList((Object[])((LocalDataService) (obj)).a("tools-list", new String[0]));
        } else
        {
            obj = null;
        }
        if (c.j() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = new com.aviary.android.feather.sdk.a(uri, i1, flag, ((List) (obj)));
        p.a(this);
        p.execute(new FeatherActivity[] {
            this
        });
    }

    protected void a(Pair pair, a a1)
    {
        b.b((new StringBuilder()).append("onSaveCompleted: ").append(pair).append(", action: ").append(a1).toString());
        a1 = new Intent();
        if (pair != null)
        {
            a1.setData(Uri.parse((String)pair.first));
            a1.putExtra("extra-output-uri", (Parcelable)pair.second);
        }
        a(-1, ((Intent) (a1)));
        finish();
    }

    void a(com.aviary.android.feather.library.filters.a.a a1, Bundle bundle)
    {
        b.c("quickLaunch: %s", new Object[] {
            a1
        });
        AviaryMainController aviarymaincontroller = A();
        com.aviary.android.feather.library.a.a a2 = ((AbstractPanelLoaderService)aviarymaincontroller.a(com/aviary/android/feather/sdk/panels/AbstractPanelLoaderService)).a(a1);
        if (a1 != null && aviarymaincontroller.s() && aviarymaincontroller.r())
        {
            aviarymaincontroller.a(a2, bundle);
        }
    }

    protected void a(AviaryMainController aviarymaincontroller)
    {
    }

    protected void a(it.sephiroth.android.library.b.c c1)
    {
    }

    public void a(AdapterView adapterview, View view, int i1, long l1)
    {
        b.b((new StringBuilder()).append("onItemClick: ").append(i1).toString());
        if (view != null && adapterview.isEnabled() && adapterview.getAdapter() != null)
        {
            int j1 = adapterview.getAdapter().getItemViewType(i1);
            if (j1 == 0)
            {
                adapterview = ((AdapterView) (adapterview.getAdapter().getItem(i1)));
                if (adapterview instanceof com.aviary.android.feather.library.a.a)
                {
                    r.postDelayed(new Runnable(adapterview) {

                        final Object a;
                        final FeatherActivity b;

                        public void run()
                        {
                            b.c.a((com.aviary.android.feather.library.a.a)a);
                        }

            
            {
                b = FeatherActivity.this;
                a = obj;
                super();
            }
                    }, 50L);
                }
            } else
            if (j1 == 1)
            {
                showDialog(3);
                return;
            }
        }
    }

    public void a(String s1)
    {
        b.e("onDownloadError", new Object[] {
            s1
        });
        p = null;
        H();
        showDialog(1);
    }

    public void a(List list, List list1, boolean flag)
    {
        boolean flag1 = true;
        b.c("onToolsLoaded: %s, white-label: %b", new Object[] {
            list, Boolean.valueOf(flag)
        });
        LocalDataService localdataservice = (LocalDataService)c.a(com/aviary/android/feather/library/services/LocalDataService);
        if (flag && localdataservice.a("white-label"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.setAdapter(new b(this, list1, flag));
        h.setOnItemClickListener(this);
        list1 = m;
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        list1.a(flag);
        c.a(list);
    }

    protected void a(boolean flag)
    {
        if (flag)
        {
            super.onBackPressed();
            return;
        } else
        {
            onBackPressed();
            return;
        }
    }

    public AviaryBottomBarViewFlipper b()
    {
        return m;
    }

    protected File b(android.graphics.Bitmap.CompressFormat compressformat)
    {
        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        StringBuilder stringbuilder = (new StringBuilder()).append("aviary-image-").append(System.currentTimeMillis()).append(".");
        if (compressformat == android.graphics.Bitmap.CompressFormat.JPEG)
        {
            compressformat = "jpeg";
        } else
        {
            compressformat = "png";
        }
        return new File(file, stringbuilder.append(compressformat).toString());
    }

    protected void b(Bitmap bitmap, boolean flag)
    {
        if (d)
        {
            return;
        }
        d = true;
        k().a("editor: saved", new String[] {
            "tool_count", String.valueOf(c.i())
        });
        c.b(false);
        LocalDataService localdataservice = (LocalDataService)c.a(com/aviary/android/feather/library/services/LocalDataService);
        if (((Boolean)localdataservice.a("return-data", Boolean.valueOf(false))).booleanValue())
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", bitmap);
            a(-1, (new Intent()).setData(localdataservice.i()).setAction("inline-data").putExtras(bundle));
            finish();
            return;
        }
        flag = ((HiResBackgroundService)c.a(com/aviary/android/feather/library/services/HiResBackgroundService)).i();
        a a1 = com.aviary.android.feather.sdk.a.a;
        if ("aviary.intent.action.EDIT".equals(getIntent().getAction()))
        {
            a1 = com.aviary.android.feather.sdk.a.b;
        }
        a(bitmap, localdataservice.i(), localdataservice.j(), localdataservice.k(), flag, a1);
    }

    protected void b(String s1)
    {
        b.a((new StringBuilder()).append("saveExif: ").append(s1).toString());
        if (s1 == null)
        {
            return;
        }
        Object obj = (LocalDataService)c.a(com/aviary/android/feather/library/services/LocalDataService);
        it.sephiroth.android.library.b.c c1 = new it.sephiroth.android.library.b.c();
        if (obj != null)
        {
            obj = ((LocalDataService) (obj)).c();
            if (obj != null)
            {
                c1.a(((e) (obj)).a());
            }
        }
        c1.h(it.sephiroth.android.library.b.c.a);
        c1.h(it.sephiroth.android.library.b.c.b);
        c1.a(c1.a(it.sephiroth.android.library.b.c.j, Integer.valueOf(0)));
        c1.a(c1.a(it.sephiroth.android.library.b.c.s, "Aviary for Android 3.4.10"));
        a(c1);
        try
        {
            c1.a(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
    }

    public ViewGroup c()
    {
        return m.getContentPanel();
    }

    protected void c(String s1)
    {
        a(0, ((Intent) (null)));
        (new android.app.AlertDialog.Builder(this)).setTitle(R.string.feather_generic_error_title).setMessage(s1).setCancelable(false).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final FeatherActivity a;

            public void onCancel(DialogInterface dialoginterface)
            {
                a.a(0, null);
                a.finish();
            }

            
            {
                a = FeatherActivity.this;
                super();
            }
        }).setPositiveButton(R.string.feather_close, new android.content.DialogInterface.OnClickListener() {

            final FeatherActivity a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                a.a(0, null);
                a.finish();
            }

            
            {
                a = FeatherActivity.this;
                super();
            }
        }).show();
    }

    public ViewGroup d()
    {
        return j;
    }

    public ViewGroup e()
    {
        n.setVisibility(0);
        return n;
    }

    public void f()
    {
        n.removeAllViews();
        n.setVisibility(8);
    }

    public void g()
    {
        g.setApplyProgressVisible(true);
    }

    public void h()
    {
        g.setApplyProgressVisible(false);
    }

    public void i()
    {
        if (i == null)
        {
            i = com.aviary.android.feather.sdk.utils.e.b(this);
        }
        i.a();
    }

    public void j()
    {
        if (i != null)
        {
            i.b();
        }
    }

    public com.aviary.android.feather.common.b.b k()
    {
        return a;
    }

    public void l()
    {
        u().invalidate();
        s.a();
    }

    public void m()
    {
    }

    protected void n()
    {
    }

    protected void o()
    {
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        c.a(i1, j1, intent);
    }

    public void onBackPressed()
    {
        if (g.e() || s.getStatus() != com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.d.a)
        {
            b.a("Restore enabled, let's close that first!");
            s.a();
        } else
        if (!c.v())
        {
            if (i != null)
            {
                i.b();
            }
            if (c.n())
            {
                LocalDataService localdataservice = (LocalDataService)c.a(com/aviary/android/feather/library/services/LocalDataService);
                if (localdataservice != null && ((Boolean)localdataservice.a("hide-exit-unsave-confirmation", Boolean.valueOf(false))).booleanValue())
                {
                    super.onBackPressed();
                    return;
                } else
                {
                    showDialog(0);
                    return;
                }
            }
            if (!s())
            {
                a(0, ((Intent) (null)));
                super.onBackPressed();
                return;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (l != configuration.orientation)
        {
            l = configuration.orientation;
            if (c != null)
            {
                c.a(configuration);
            }
        }
        l = configuration.orientation;
    }

    public void onContentChanged()
    {
        super.onContentChanged();
        o = (DragLayer)findViewById(R.id.dragLayer);
        g = (AviaryNavBarViewFlipper)findViewById(R.id.aviary_navbar);
        m = (AviaryBottomBarViewFlipper)findViewById(R.id.aviary_bottombar);
        h = m.getToolsListView();
        j = (ViewGroup)findViewById(R.id.drawing_view_container);
        k = findViewById(R.id.image_loading_view);
        n = (ViewGroup)findViewById(R.id.feather_dialogs_container);
        m.setDisplayedChild(1);
        s = (AviaryImageRestoreSwitcher)findViewById(R.id.aviary_restore);
    }

    public void onCreate(Bundle bundle)
    {
        long l1 = com.aviary.android.feather.common.utils.c.a();
        o();
        super.onCreate(bundle);
        if (!com.aviary.android.feather.common.utils.j.b(this))
        {
            setRequestedOrientation(1);
        }
        setContentView(R.layout.aviary_main_view);
        a(0, ((Intent) (null)));
        E();
        p();
        F();
        c.a(this);
        c.a(this);
        c.a(o);
        bundle = a(getIntent());
        if (bundle == null)
        {
            a(0, ((Intent) (null)));
            finish();
            return;
        } else
        {
            a(bundle);
            n();
            b.d("total memory: %.2f", new Object[] {
                Double.valueOf(com.aviary.android.feather.common.utils.l.f())
            });
            k().a("editor: opened");
            com.aviary.android.feather.common.utils.c.a(l1, "onCreate finished");
            return;
        }
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 0: // '\0'
            return (new android.app.AlertDialog.Builder(this)).setTitle(R.string.feather_confirm).setMessage(R.string.confirm_quit_message).setPositiveButton(R.string.feather_yes_leave, new android.content.DialogInterface.OnClickListener() {

                final FeatherActivity a;

                public void onClick(DialogInterface dialoginterface, int j1)
                {
                    dialoginterface.dismiss();
                    a.a(true);
                }

            
            {
                a = FeatherActivity.this;
                super();
            }
            }).setNegativeButton(R.string.feather_keep_editing, new android.content.DialogInterface.OnClickListener() {

                final FeatherActivity a;

                public void onClick(DialogInterface dialoginterface, int j1)
                {
                    dialoginterface.dismiss();
                }

            
            {
                a = FeatherActivity.this;
                super();
            }
            }).create();

        case 1: // '\001'
            return (new android.app.AlertDialog.Builder(this)).setTitle(R.string.feather_attention).setMessage(R.string.feather_error_download_image_message).setCancelable(false).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final FeatherActivity a;

                public void onClick(DialogInterface dialoginterface, int j1)
                {
                    dialoginterface.dismiss();
                    a.finish();
                }

            
            {
                a = FeatherActivity.this;
                super();
            }
            }).create();

        case 2: // '\002'
            return (new android.app.AlertDialog.Builder(this)).setTitle(R.string.feather_revert_dialog_title).setMessage(R.string.feather_revert_dialog_message).setPositiveButton(0x1040013, new android.content.DialogInterface.OnClickListener() {

                final FeatherActivity a;

                public void onClick(DialogInterface dialoginterface, int j1)
                {
                    dialoginterface.dismiss();
                    com.aviary.android.feather.sdk.FeatherActivity.a(a);
                }

            
            {
                a = FeatherActivity.this;
                super();
            }
            }).setNegativeButton(0x1040009, new android.content.DialogInterface.OnClickListener() {

                final FeatherActivity a;

                public void onClick(DialogInterface dialoginterface, int j1)
                {
                    dialoginterface.dismiss();
                }

            
            {
                a = FeatherActivity.this;
                super();
            }
            }).create();

        case 3: // '\003'
            return r();

        case 4: // '\004'
            return q();

        case 5: // '\005'
            return (new android.app.AlertDialog.Builder(this)).setTitle(R.string.feather_confirm).setMessage(R.string.feather_unsaved_from_camera).setPositiveButton(R.string.feather_yes_leave, new android.content.DialogInterface.OnClickListener() {

                final FeatherActivity a;

                public void onClick(DialogInterface dialoginterface, int j1)
                {
                    dialoginterface.dismiss();
                    a.a(true);
                }

            
            {
                a = FeatherActivity.this;
                super();
            }
            }).setNegativeButton(R.string.feather_keep_editing, new android.content.DialogInterface.OnClickListener() {

                final FeatherActivity a;

                public void onClick(DialogInterface dialoginterface, int j1)
                {
                    dialoginterface.dismiss();
                }

            
            {
                a = FeatherActivity.this;
                super();
            }
            }).create();
        }
    }

    protected void onDestroy()
    {
        b.b("onDestroy");
        if (f != -1)
        {
            k().a("editor: cancelled");
        }
        super.onDestroy();
        g.setOnToolbarClickListener(null);
        m.setOnBottomBarItemClickListener(null);
        c.a(null);
        c.a(null);
        if (p != null)
        {
            p.a(null);
            p = null;
        }
        if (c != null)
        {
            c.k();
        }
        r = null;
        c = null;
    }

    protected void onPause()
    {
        super.onPause();
        q = false;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        while (d || !c.r() || !c.s()) 
        {
            return false;
        }
        return true;
    }

    protected void onRestart()
    {
        b.b("onRestart");
        super.onRestart();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        b.b((new StringBuilder()).append("onRestoreInstanceState: ").append(bundle).toString());
        super.onRestoreInstanceState(bundle);
    }

    protected void onResume()
    {
        super.onResume();
        q = true;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        b.b("onSaveInstanceState");
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        b.b("onStart");
        super.onStart();
        l = getResources().getConfiguration().orientation;
    }

    public void onStop()
    {
        b.b("onStop");
        super.onStop();
    }

    protected void p()
    {
        try
        {
            NativeFilterProxy.a(this);
            return;
        }
        catch (com.aviary.android.feather.headless.b b1)
        {
            b1.printStackTrace();
            Toast.makeText(getApplicationContext(), (new StringBuilder()).append("Sorry an error occurred: ").append(b1.getMessage()).toString(), 1).show();
            finish();
            return;
        }
    }

    protected Dialog q()
    {
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final FeatherActivity a;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse("http://www.aviary.com/android"));
                a.startActivity(view);
            }

            
            {
                a = FeatherActivity.this;
                super();
            }
        };
        return a(R.string.feather_about_dialog_message, "aviary.com/android", onclicklistener);
    }

    protected Dialog r()
    {
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final FeatherActivity a;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse("http://support.aviary.com/"));
                a.startActivity(view);
            }

            
            {
                a = FeatherActivity.this;
                super();
            }
        };
        return a(R.string.feather_feedback_dialog_message, getString(R.string.feather_send_feedback), onclicklistener);
    }

    protected boolean s()
    {
        if (A() != null)
        {
            Object obj = (LocalDataService)A().a(com/aviary/android/feather/library/services/LocalDataService);
            if (obj != null && ((LocalDataService) (obj)).a("source-type"))
            {
                obj = (String)((LocalDataService) (obj)).a("source-type", com.aviary.android.feather.library.a.a.c.name());
                if (com.aviary.android.feather.library.a.a.b.name().equals(obj))
                {
                    showDialog(5);
                    return true;
                }
            }
        }
        return false;
    }

    protected List t()
    {
        b.b("loadStandaloneTools");
        return null;
    }

    public ImageViewTouch u()
    {
        return s.getDefaultImageView();
    }

    public void v()
    {
        b.b("onRestoreClick");
        if (c != null && c.r())
        {
            k().a("editor: image_reset");
            c.y();
            s.a();
        }
    }

    public void w()
    {
        if (c != null && c.r())
        {
            LocalDataService localdataservice = (LocalDataService)c.a(com/aviary/android/feather/library/services/LocalDataService);
            boolean flag = c.n();
            boolean flag1 = ((Boolean)localdataservice.a("save-on-no-changes", Boolean.valueOf(true))).booleanValue();
            if (com.aviary.android.feather.common.a.a.a)
            {
                b.a((new StringBuilder()).append("bitmap changed: ").append(flag).toString());
                b.a((new StringBuilder()).append("save with no changes: ").append(flag1).toString());
            }
            if (!flag && !flag1)
            {
                x();
            } else
            {
                c.z();
                Bitmap bitmap = c.l();
                if (bitmap != null)
                {
                    b(bitmap, flag);
                    return;
                }
            }
        }
    }

    protected void x()
    {
        b.b("exitWithNoModifications");
        Intent intent = new Intent();
        intent.putExtra("bitmap-changed", false);
        a(0, intent);
        finish();
    }

    public void y()
    {
        c.u();
    }

    public void z()
    {
        s.setVisibility(4);
        k.setVisibility(0);
    }
}
