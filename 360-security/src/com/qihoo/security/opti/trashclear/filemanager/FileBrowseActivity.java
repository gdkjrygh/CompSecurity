// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.dialog.g;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import java.io.File;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            f, e, a, d, 
//            b

public class FileBrowseActivity extends BaseActivity
    implements android.view.View.OnClickListener, f
{
    private class a extends BaseAdapter
    {

        final FileBrowseActivity a;
        private final com.qihoo.security.opti.trashclear.filemanager.a b;
        private final com.qihoo.security.opti.trashclear.filemanager.b c;
        private final ArrayList d;

        public int getCount()
        {
            return d.size();
        }

        public Object getItem(int i1)
        {
            return d.get(i1);
        }

        public long getItemId(int i1)
        {
            return (long)i1;
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            com.qihoo.security.opti.trashclear.filemanager.d d1;
            if (view == null)
            {
                view = LayoutInflater.from(FileBrowseActivity.o(a)).inflate(0x7f030098, null);
                viewgroup = a. new c();
                viewgroup.g = (CheckBox)view.findViewById(0x7f0b01ff);
                viewgroup.h = (FrameLayout)view.findViewById(0x7f0b01fe);
                viewgroup.b = (LocaleTextView)view.findViewById(0x7f0b01fc);
                viewgroup.f = (ImageView)view.findViewById(0x7f0b01f8);
                viewgroup.e = (ImageView)view.findViewById(0x7f0b01f7);
                viewgroup.a = (LocaleTextView)view.findViewById(0x7f0b01fa);
                viewgroup.d = (LocaleTextView)view.findViewById(0x7f0b01fb);
                viewgroup.c = (LocaleTextView)view.findViewById(0x7f0b01fd);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (c)view.getTag();
            }
            d1 = b.a(i1);
            if (d1 == null) goto _L2; else goto _L1
_L1:
            ((c) (viewgroup)).a.setLocalText(d1.a);
            ((c) (viewgroup)).d.setLocalText(com.qihoo.security.opti.trashclear.filemanager.e.a(FileBrowseActivity.o(a), d1.f));
            if (d1.d)
            {
                if (FileBrowseActivity.i(a))
                {
                    ((c) (viewgroup)).b.setVisibility(8);
                    ((c) (viewgroup)).c.setVisibility(4);
                    ((c) (viewgroup)).f.setImageResource(0x7f020132);
                } else
                {
                    ((c) (viewgroup)).c.setVisibility(8);
                    ((c) (viewgroup)).b.setVisibility(0);
                    ((c) (viewgroup)).b.setLocalText((new StringBuilder()).append("(").append(d1.e).append(")").toString());
                    ((c) (viewgroup)).e.setVisibility(8);
                    ((c) (viewgroup)).f.setImageResource(0x7f020132);
                }
            } else
            {
                ((c) (viewgroup)).b.setVisibility(8);
                ((c) (viewgroup)).c.setVisibility(0);
                ((c) (viewgroup)).c.setLocalText(com.qihoo.security.opti.trashclear.filemanager.e.a(d1.c));
                c.a(d1, ((c) (viewgroup)).f, ((c) (viewgroup)).e);
            }
            if (FileBrowseActivity.i(a))
            {
                ((c) (viewgroup)).h.setVisibility(0);
            }
            ((c) (viewgroup)).g.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(this, d1) {

                final com.qihoo.security.opti.trashclear.filemanager.d a;
                final a b;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
label0:
                    {
                        if (FileBrowseActivity.i(b.a))
                        {
                            a.g = flag;
                            if (!flag)
                            {
                                break label0;
                            }
                            compoundbutton.setButtonDrawable(0x7f02006c);
                        }
                        return;
                    }
                    compoundbutton.setButtonDrawable(0x7f02006d);
                }

            
            {
                b = a1;
                a = d1;
                super();
            }
            });
            if (!d1.g) goto _L4; else goto _L3
_L3:
            ((c) (viewgroup)).g.setChecked(true);
            if (FileBrowseActivity.i(a))
            {
                ((c) (viewgroup)).g.setButtonDrawable(0x7f02006c);
            }
_L6:
            viewgroup = b.d();
            i1 = a.getResources().getColor(0x7f080050);
            if (!d1.b.equals(viewgroup))
            {
                break; /* Loop/switch isn't completed */
            }
            view.setBackgroundColor(a.getResources().getColor(0x7f08004f));
_L2:
            return view;
_L4:
            ((c) (viewgroup)).g.setChecked(false);
            if (FileBrowseActivity.i(a))
            {
                ((c) (viewgroup)).g.setButtonDrawable(0x7f02006d);
            }
            if (true) goto _L6; else goto _L5
_L5:
            view.setBackgroundColor(i1);
            return view;
        }

        public a(ArrayList arraylist, com.qihoo.security.opti.trashclear.filemanager.a a1, com.qihoo.security.opti.trashclear.filemanager.b b1)
        {
            a = FileBrowseActivity.this;
            super();
            b = a1;
            c = b1;
            d = arraylist;
        }
    }

    private abstract class b
        implements Comparator
    {

        private boolean a;
        final FileBrowseActivity b;

        protected abstract int a(com.qihoo.security.opti.trashclear.filemanager.d d1, com.qihoo.security.opti.trashclear.filemanager.d d2);

        public int b(com.qihoo.security.opti.trashclear.filemanager.d d1, com.qihoo.security.opti.trashclear.filemanager.d d2)
        {
            int i1 = 1;
            byte byte1 = -1;
            if (d1.d == d2.d)
            {
                i1 = a(d1, d2);
            } else
            if (a)
            {
                if (!d1.d)
                {
                    return -1;
                }
            } else
            {
                byte byte0;
                if (d1.d)
                {
                    byte0 = byte1;
                } else
                {
                    byte0 = 1;
                }
                return byte0;
            }
            return i1;
        }

        public int compare(Object obj, Object obj1)
        {
            return b((com.qihoo.security.opti.trashclear.filemanager.d)obj, (com.qihoo.security.opti.trashclear.filemanager.d)obj1);
        }

        private b()
        {
            b = FileBrowseActivity.this;
            super();
        }

    }

    private class c
    {

        LocaleTextView a;
        LocaleTextView b;
        LocaleTextView c;
        LocaleTextView d;
        ImageView e;
        ImageView f;
        CheckBox g;
        FrameLayout h;
        final FileBrowseActivity i;

        private c()
        {
            i = FileBrowseActivity.this;
            super();
        }

    }


    public static TrashInfo y;
    private static final String z = com/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity.getSimpleName();
    private ListView A;
    private a B;
    private com.qihoo.security.opti.trashclear.filemanager.a C;
    private com.qihoo.security.opti.trashclear.filemanager.b D;
    private final ArrayList E = new ArrayList();
    private long F;
    private long G;
    private boolean H;
    private boolean I;
    private boolean J;
    private final Handler K = new Handler() {

        final FileBrowseActivity a;

        public void handleMessage(Message message)
        {
            if (!a.isFinishing()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            FileBrowseActivity.a(a).setVisibility(8);
            message.what;
            JVM INSTR tableswitch 0 4: default 60
        //                       0 95
        //                       1 105
        //                       2 60
        //                       3 204
        //                       4 227;
               goto _L3 _L4 _L5 _L3 _L6 _L7
_L3:
            break; /* Loop/switch isn't completed */
_L4:
            break; /* Loop/switch isn't completed */
_L9:
            if (FileBrowseActivity.i(a) && FileBrowseActivity.c(a).size() > 0)
            {
                FileBrowseActivity.a(a).setVisibility(0);
                return;
            }
            if (true) goto _L1; else goto _L8
_L8:
            FileBrowseActivity.b(a);
              goto _L9
_L5:
            message = (ArrayList)message.obj;
            if (message != null)
            {
                FileBrowseActivity.c(a).clear();
                FileBrowseActivity.c(a).addAll(message);
                a.a(com.qihoo.security.opti.trashclear.filemanager.FileBrowseActivity.d(a));
                FileBrowseActivity filebrowseactivity = a;
                boolean flag;
                if (message.size() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                FileBrowseActivity.a(filebrowseactivity, flag);
                FileBrowseActivity.e(a).notifyDataSetChanged();
            }
            FileBrowseActivity.f(a).setEnabled(true);
              goto _L9
_L6:
            com.qihoo.security.opti.trashclear.filemanager.FileBrowseActivity.g(a).dismiss();
            FileBrowseActivity.h(a).c();
              goto _L9
_L7:
            message = FileBrowseActivity.h(a).d();
            if (message == null) goto _L11; else goto _L10
_L10:
            int i1 = 0;
_L13:
            com.qihoo.security.opti.trashclear.filemanager.d d1;
            if (i1 >= FileBrowseActivity.c(a).size())
            {
                break; /* Loop/switch isn't completed */
            }
            d1 = (com.qihoo.security.opti.trashclear.filemanager.d)FileBrowseActivity.c(a).get(i1);
              goto _L12
_L15:
            i1++;
            if (true) goto _L13; else goto _L11
_L12:
            if (d1.d || !d1.b.equals(message)) goto _L15; else goto _L14
_L14:
            FileBrowseActivity.f(a).setSelection(i1);
_L11:
            FileBrowseActivity.e(a).notifyDataSetChanged();
              goto _L9
        }

            
            {
                a = FileBrowseActivity.this;
                super();
            }
    };
    private final BroadcastReceiver L = new BroadcastReceiver() {

        final FileBrowseActivity a;

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction();
            if (context.equals("android.intent.action.MEDIA_MOUNTED") || context.equals("android.intent.action.MEDIA_UNMOUNTED"))
            {
                FileBrowseActivity.j(a).sendEmptyMessage(0);
            }
        }

            
            {
                a = FileBrowseActivity.this;
                super();
            }
    };
    private final Comparator M = new b() {

        final FileBrowseActivity a;

        public int a(com.qihoo.security.opti.trashclear.filemanager.d d1, com.qihoo.security.opti.trashclear.filemanager.d d2)
        {
            Collator collator = Collator.getInstance(Locale.CHINA);
            if (collator != null)
            {
                return collator.compare(d1.a, d2.a);
            } else
            {
                return d1.a.compareToIgnoreCase(d2.a);
            }
        }

            
            {
                a = FileBrowseActivity.this;
                super();
            }
    };
    private final long N = 0L;
    private final long O = 0L;
    private Context P;
    private Button Q;
    private LinearLayout R;
    private g S;

    public FileBrowseActivity()
    {
        F = 0L;
        G = 0L;
        H = false;
        I = false;
        J = false;
    }

    static LinearLayout a(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.R;
    }

    static void a(FileBrowseActivity filebrowseactivity, boolean flag)
    {
        filebrowseactivity.c(flag);
    }

    static void b(FileBrowseActivity filebrowseactivity)
    {
        filebrowseactivity.s();
    }

    static ArrayList c(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.E;
    }

    private void c(boolean flag)
    {
        View view = com.qihoo360.mobilesafe.b.s.a(this, 0x7f0b01ac);
        if (view != null)
        {
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            view.setVisibility(i1);
        }
    }

    static Comparator d(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.M;
    }

    static a e(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.B;
    }

    private String e(String s1)
    {
        String s2 = "";
        Object obj = s1;
        if (s1.contains("[[["))
        {
            obj = s1;
            if (s1.contains("]]]"))
            {
                Matcher matcher = Pattern.compile("\\[\\[\\[(\\d)\\]\\]\\]").matcher(s1);
                for (obj = s2; matcher.find(); obj = matcher.group(1)) { }
                s1 = s1.toString().replace("[[[", "").replace("]]]", "").replace(((CharSequence) (obj)), "");
                obj = Integer.valueOf(((String) (obj)));
                obj = (new StringBuilder()).append(s1).append(o.a(0x7f0c005f, new Object[] {
                    obj
                })).toString();
            }
        }
        return ((String) (obj));
    }

    static ListView f(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.A;
    }

    static g g(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.S;
    }

    static com.qihoo.security.opti.trashclear.filemanager.a h(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.C;
    }

    static boolean i(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.J;
    }

    static Handler j(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.K;
    }

    static boolean k(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.H;
    }

    static long l(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.G;
    }

    static long m(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.F;
    }

    static boolean n(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.I;
    }

    static Context o(FileBrowseActivity filebrowseactivity)
    {
        return filebrowseactivity.P;
    }

    private void r()
    {
        if (y != null && y.bundle != null)
        {
            int i1 = y.bundle.getInt("dateNum");
            boolean flag = y.bundle.getBoolean("isInDate");
            if (i1 > 0)
            {
                H = true;
                I = flag;
                G = System.currentTimeMillis();
                F = (long)i1 * 0x5265c00L;
                return;
            }
        }
    }

    private void s()
    {
        boolean flag = false;
        boolean flag1 = com.qihoo.security.opti.trashclear.filemanager.e.a();
        Object obj = com.qihoo360.mobilesafe.b.s.a(this, 0x7f0b0204);
        int i1;
        if (flag1)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        obj = A;
        if (flag1)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        ((ListView) (obj)).setVisibility(i1);
        if (flag1)
        {
            C.c();
        }
    }

    private void t()
    {
        if (u())
        {
            if (S == null)
            {
                S = new g(P);
            }
            S.show();
            (new Thread(new Runnable((ArrayList)E.clone()) {

                final ArrayList a;
                final FileBrowseActivity b;

                public void run()
                {
                    Iterator iterator;
                    long l1;
                    iterator = a.iterator();
                    l1 = 0L;
_L5:
                    Object obj;
                    long l2;
                    if (!iterator.hasNext())
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    obj = (com.qihoo.security.opti.trashclear.filemanager.d)iterator.next();
                    l2 = l1;
                    if (!((com.qihoo.security.opti.trashclear.filemanager.d) (obj)).g)
                    {
                        break MISSING_BLOCK_LABEL_115;
                    }
                    if (!((com.qihoo.security.opti.trashclear.filemanager.d) (obj)).d) goto _L2; else goto _L1
_L1:
                    l2 = com.qihoo.security.opti.trashclear.filemanager.e.b(new File(((com.qihoo.security.opti.trashclear.filemanager.d) (obj)).b));
                    l1 += l2;
_L3:
                    com.qihoo.security.opti.trashclear.filemanager.e.b(((com.qihoo.security.opti.trashclear.filemanager.d) (obj)).b);
                    continue; /* Loop/switch isn't completed */
                    Exception exception;
                    exception;
                    exception.printStackTrace();
                    if (true) goto _L3; else goto _L2
_L2:
                    obj = new File(((com.qihoo.security.opti.trashclear.filemanager.d) (obj)).b);
                    l2 = l1 + ((File) (obj)).length();
                    ((File) (obj)).delete();
                    l1 = l2;
                    if (true) goto _L5; else goto _L4
_L4:
                    if (FileBrowseActivity.y != null)
                    {
                        FileBrowseActivity.y.size = FileBrowseActivity.y.size - l1;
                    }
                    FileBrowseActivity.j(b).sendEmptyMessage(3);
                    return;
                }

            
            {
                b = FileBrowseActivity.this;
                a = arraylist;
                super();
            }
            })).start();
            return;
        } else
        {
            com.qihoo360.mobilesafe.b.s.a(P, 0x7f0c0078, 2000);
            return;
        }
    }

    private boolean u()
    {
        for (Iterator iterator = E.iterator(); iterator.hasNext();)
        {
            if (((com.qihoo.security.opti.trashclear.filemanager.d)iterator.next()).g)
            {
                return true;
            }
        }

        return false;
    }

    public void a(Comparator comparator)
    {
        Collections.sort(E, comparator);
        q();
    }

    public void c(String s1)
    {
        (new Thread(new Runnable(s1) {

            final String a;
            final FileBrowseActivity b;

            public void run()
            {
                ArrayList arraylist;
                Object obj;
                File afile[];
                int i1;
                int j1;
                File file = new File(a);
                if (!file.exists() || !file.isDirectory())
                {
                    FileBrowseActivity.j(b).obtainMessage(1).sendToTarget();
                    return;
                }
                arraylist = new ArrayList();
                arraylist.clear();
                obj = file.getAbsolutePath();
                afile = file.listFiles();
                if (afile == null)
                {
                    obj = FileBrowseActivity.j(b).obtainMessage(1);
                    obj.obj = arraylist;
                    ((Message) (obj)).sendToTarget();
                    return;
                }
                j1 = afile.length;
                i1 = 0;
_L3:
                File file1;
                String s2;
                String s3;
                if (i1 >= j1)
                {
                    break; /* Loop/switch isn't completed */
                }
                file1 = afile[i1];
                s2 = (new StringBuilder()).append(((String) (obj))).append(File.separator).append(file1.getName()).toString();
                s3 = s2.toLowerCase();
                  goto _L1
_L5:
                i1++;
                if (true) goto _L3; else goto _L2
_L1:
                if (!file1.isFile() && (FileBrowseActivity.h(b).e(s3) || !FileBrowseActivity.h(b).f(s3))) goto _L5; else goto _L4
_L4:
                if (!FileBrowseActivity.k(b) || !file1.isFile()) goto _L7; else goto _L6
_L6:
                boolean flag;
                if (Math.abs(FileBrowseActivity.l(b) - file1.lastModified()) > FileBrowseActivity.m(b))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (FileBrowseActivity.n(b) && flag || !FileBrowseActivity.n(b) && !flag) goto _L5; else goto _L7
_L7:
                Object obj1 = new File(s2);
                if (com.qihoo.security.opti.trashclear.filemanager.e.a(((File) (obj1))))
                {
                    obj1 = com.qihoo.security.opti.trashclear.filemanager.e.a(((File) (obj1)), e.a);
                    if (file1.isDirectory())
                    {
                        String as[] = (new File(s2)).list();
                        if (as != null)
                        {
                            obj1.e = as.length;
                        } else
                        {
                            obj1.e = 0;
                        }
                    }
                    if (obj1 != null)
                    {
                        arraylist.add(obj1);
                    }
                }
                  goto _L5
_L2:
                Message message = FileBrowseActivity.j(b).obtainMessage(1);
                message.obj = arraylist;
                message.sendToTarget();
                return;
            }

            
            {
                b = FileBrowseActivity.this;
                a = s1;
                super();
            }
        })).start();
    }

    public View d(int i1)
    {
        return com.qihoo360.mobilesafe.b.s.a(this, i1);
    }

    public boolean d(String s1)
    {
        return false;
    }

    public com.qihoo.security.opti.trashclear.filemanager.d e(int i1)
    {
        if (i1 < 0 || i1 > E.size() - 1)
        {
            return null;
        } else
        {
            return (com.qihoo.security.opti.trashclear.filemanager.d)E.get(i1);
        }
    }

    public boolean o()
    {
        return C.e();
    }

    public void onBackPressed()
    {
        o();
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0b0206)
        {
            t();
        }
    }

    public void onCreate(Bundle bundle)
    {
        String s1;
        String s3;
        String as[];
        String as1[];
label0:
        {
            super.onCreate(bundle);
            com.qihoo360.mobilesafe.b.s.b(this, 0x7f030099);
            r();
            getIntent();
            P = this;
            C = new com.qihoo.security.opti.trashclear.filemanager.a(this);
            D = new com.qihoo.security.opti.trashclear.filemanager.b(this);
            A = (ListView)com.qihoo360.mobilesafe.b.s.a(this, 0x7f0b0203);
            B = new a(E, C, D);
            s1 = com.qihoo360.mobilesafe.b.s.a(this).getStringExtra("current_directory_name");
            String s2 = com.qihoo360.mobilesafe.b.s.a(this).getStringExtra("current_directory");
            s3 = com.qihoo360.mobilesafe.b.s.a(this).getStringExtra("current_sdcard_directory");
            as = com.qihoo360.mobilesafe.b.s.a(this).getStringArrayExtra("current_filter_directory");
            as1 = com.qihoo360.mobilesafe.b.s.a(this).getStringArrayExtra("current_prefix_directory");
            J = com.qihoo360.mobilesafe.b.s.a(this).getBooleanExtra("source_mediastore_disk", false);
            if (!TextUtils.isEmpty(s1))
            {
                bundle = s2;
                if (!TextUtils.isEmpty(s2))
                {
                    break label0;
                }
            }
            s1 = "storage";
            bundle = "/storage";
        }
        File file = new File(bundle);
        if (file.isFile())
        {
            C.c(bundle);
            bundle = file.getParent();
        }
        Q = (Button)findViewById(0x7f0b0206);
        R = (LinearLayout)findViewById(0x7f0b0205);
        Q.setOnClickListener(this);
        if (J)
        {
            Q.setBackgroundResource(0x7f02012a);
            Q.setTextColor(-1);
            Q.setText(com.qihoo.security.locale.d.a().a(0x7f0c0079));
        }
        b(e(s1));
        S = new g(P);
        C.a(bundle);
        C.b(bundle);
        C.d(s3);
        C.a(as);
        C.b(as1);
        A.setAdapter(B);
        bundle = new IntentFilter();
        bundle.addAction("android.intent.action.MEDIA_MOUNTED");
        bundle.addAction("android.intent.action.MEDIA_UNMOUNTED");
        bundle.addDataScheme("file");
        registerReceiver(L, bundle);
        s();
    }

    public void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(L);
    }

    public Context p()
    {
        return this;
    }

    public void q()
    {
        K.sendEmptyMessage(4);
    }

}
