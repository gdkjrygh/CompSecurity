// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.enginehelper.clean.a;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.g;
import com.qihoo360.mobilesafe.opti.i.whitelist.UserBWRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClearWhiteListActivity extends BaseActivity
{
    private class a extends BaseAdapter
    {

        final ClearWhiteListActivity a;
        private final LayoutInflater b;
        private List c;

        static List a(a a1)
        {
            return a1.c;
        }

        public UserBWRecord a(int i)
        {
            return (UserBWRecord)c.get(i);
        }

        public void a(List list)
        {
            if (list != null && !list.isEmpty())
            {
                list = list.iterator();
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    UserBWRecord userbwrecord = (UserBWRecord)list.next();
                    if (userbwrecord != null)
                    {
                        if (c == null)
                        {
                            c = new ArrayList(0);
                        }
                        c.add(userbwrecord);
                    }
                } while (true);
            }
            notifyDataSetChanged();
        }

        public int getCount()
        {
            return c.size();
        }

        public Object getItem(int i)
        {
            return a(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            Object obj;
            UserBWRecord userbwrecord;
            obj = null;
            userbwrecord = (UserBWRecord)c.get(i);
            userbwrecord.desc = com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.a(a, userbwrecord.desc);
            com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.a(a, true);
            if (userbwrecord.type == -1 || userbwrecord.type == -2 || userbwrecord.type == -3 || userbwrecord.type == -4)
            {
                view = b.inflate(0x7f030096, null);
                if (userbwrecord.type == -1)
                {
                    ((LocaleTextView)view.findViewById(0x7f0b01e3)).setLocalText(0x7f0c0061);
                    ((ImageView)view.findViewById(0x7f0b01e2)).setBackgroundDrawable(a.getResources().getDrawable(0x7f020063));
                } else
                if (userbwrecord.type == -2)
                {
                    ((LocaleTextView)view.findViewById(0x7f0b01e3)).setLocalText(0x7f0c0062);
                    ((ImageView)view.findViewById(0x7f0b01e2)).setBackgroundDrawable(a.getResources().getDrawable(0x7f020067));
                } else
                if (userbwrecord.type == -3)
                {
                    ((LocaleTextView)view.findViewById(0x7f0b01e3)).setLocalText(0x7f0c0063);
                    ((ImageView)view.findViewById(0x7f0b01e2)).setBackgroundDrawable(a.getResources().getDrawable(0x7f020061));
                } else
                {
                    ((LocaleTextView)view.findViewById(0x7f0b01e3)).setLocalText(0x7f0c0064);
                    ((ImageView)view.findViewById(0x7f0b01e2)).setBackgroundDrawable(a.getResources().getDrawable(0x7f020064));
                }
                view.setTag("");
                return view;
            }
            View view1;
            if (view == null || (view.getTag() instanceof String))
            {
                view1 = b.inflate(0x7f030097, null);
                viewgroup = a. new b();
                viewgroup.b = (LocaleTextView)view1.findViewById(0x7f0b01ec);
                ((b) (viewgroup)).b.setVisibility(0);
                viewgroup.a = (LocaleTextView)view1.findViewById(0x7f0b01f3);
                ((b) (viewgroup)).a.setVisibility(0);
                viewgroup.c = (LocaleTextView)view1.findViewById(0x7f0b01ea);
                ((b) (viewgroup)).c.setVisibility(0);
                viewgroup.d = (ImageView)view1.findViewById(0x7f0b01e6);
                view1.setTag(viewgroup);
            } else
            {
                viewgroup = (b)view.getTag();
                view1 = view;
            }
            userbwrecord.type;
            JVM INSTR tableswitch 34 35: default 444
        //                       34 636
        //                       35 772;
               goto _L1 _L2 _L3
_L1:
            if ("/".equals(userbwrecord.value))
            {
                ((b) (viewgroup)).b.setLocalText(0x7f0c0065);
            } else
            {
                ((b) (viewgroup)).b.setLocalText(userbwrecord.value);
            }
            if (userbwrecord.type != 33) goto _L5; else goto _L4
_L4:
            if (userbwrecord.desc != null && userbwrecord.desc.equals("Other files"))
            {
                view = a.o.a(0x7f0c021c);
                ((b) (viewgroup)).c.setLocalText(view);
            } else
            {
                obj = ((b) (viewgroup)).c;
                if (userbwrecord.desc == null)
                {
                    view = "";
                } else
                {
                    view = userbwrecord.desc;
                }
                ((LocaleTextView) (obj)).setLocalText(view);
            }
            ((b) (viewgroup)).d.setImageDrawable(a.getResources().getDrawable(0x7f020065));
            view = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/android/data/").toString();
            if (userbwrecord.value != null && (userbwrecord.value.equals(view) || userbwrecord.value.equals("/data/dalvik-cache/")))
            {
                ((b) (viewgroup)).b.setLocalText("");
            }
_L14:
            ((b) (viewgroup)).a.setOnClickListener(new android.view.View.OnClickListener(this, i, userbwrecord) {

                final int a;
                final UserBWRecord b;
                final a c;

                public void onClick(View view)
                {
                    UserBWRecord userbwrecord;
                    Object obj;
                    Object obj1;
                    userbwrecord = null;
                    obj = null;
                    obj1 = null;
                    view = null;
                    if (!ClearWhiteListActivity.c(c.a)) goto _L2; else goto _L1
_L1:
                    com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.a(c.a, false);
                    if (com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.d(c.a) == null || !com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.d(c.a).contains(com.qihoo.security.opti.trashclear.ui.a.a(c).get(a))) goto _L4; else goto _L3
_L3:
                    com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.d(c.a).remove(com.qihoo.security.opti.trashclear.ui.a.a(c).get(a));
                    if (ClearWhiteListActivity.e(c.a) != null)
                    {
                        ClearWhiteListActivity.e(c.a).a(2, b);
                    }
                    if (com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.d(c.a) != null && !com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.d(c.a).isEmpty()) goto _L6; else goto _L5
_L5:
                    if (com.qihoo.security.opti.trashclear.ui.a.a(c) == null || com.qihoo.security.opti.trashclear.ui.a.a(c).isEmpty()) goto _L8; else goto _L7
_L7:
                    int i = 0;
_L17:
                    if (i >= com.qihoo.security.opti.trashclear.ui.a.a(c).size()) goto _L10; else goto _L9
_L9:
                    userbwrecord = (UserBWRecord)com.qihoo.security.opti.trashclear.ui.a.a(c).get(i);
                    if (userbwrecord == null) goto _L12; else goto _L11
_L11:
                    if (userbwrecord.type != -1) goto _L12; else goto _L13
_L13:
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(userbwrecord);
                    view = userbwrecord;
                      goto _L12
_L10:
                    if (view == null) goto _L15; else goto _L14
_L14:
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(view);
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a - 1);
_L16:
                    c.notifyDataSetChanged();
                    return;
_L15:
                    try
                    {
                        com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        return;
                    }
                      goto _L16
_L8:
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
_L6:
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
_L4:
                    if (ClearWhiteListActivity.f(c.a) == null || !ClearWhiteListActivity.f(c.a).contains(com.qihoo.security.opti.trashclear.ui.a.a(c).get(a)))
                    {
                        break MISSING_BLOCK_LABEL_742;
                    }
                    ClearWhiteListActivity.f(c.a).remove(com.qihoo.security.opti.trashclear.ui.a.a(c).get(a));
                    if (ClearWhiteListActivity.e(c.a) != null)
                    {
                        ClearWhiteListActivity.e(c.a).a(4, b);
                    }
                    if (ClearWhiteListActivity.f(c.a) != null && !ClearWhiteListActivity.f(c.a).isEmpty())
                    {
                        break MISSING_BLOCK_LABEL_722;
                    }
                    if (com.qihoo.security.opti.trashclear.ui.a.a(c) == null || com.qihoo.security.opti.trashclear.ui.a.a(c).isEmpty())
                    {
                        break MISSING_BLOCK_LABEL_702;
                    }
                    i = 0;
                    view = userbwrecord;
                    UserBWRecord userbwrecord1;
                    for (; i >= com.qihoo.security.opti.trashclear.ui.a.a(c).size(); i++)
                    {
                        break MISSING_BLOCK_LABEL_598;
                    }

                    userbwrecord1 = (UserBWRecord)com.qihoo.security.opti.trashclear.ui.a.a(c).get(i);
                    if (userbwrecord1 == null)
                    {
                        break MISSING_BLOCK_LABEL_1522;
                    }
                    if (userbwrecord1.type == -2)
                    {
                        view = userbwrecord1;
                    }
                    break MISSING_BLOCK_LABEL_1522;
                    if (view == null)
                    {
                        break MISSING_BLOCK_LABEL_682;
                    }
label0:
                    {
                        i = com.qihoo.security.opti.trashclear.ui.a.a(c).indexOf(view);
                        com.qihoo.security.opti.trashclear.ui.a.a(c).remove(view);
                        if (a <= i)
                        {
                            break label0;
                        }
                        com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a - 1);
                    }
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    if (com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.g(c.a) == null || !com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.g(c.a).contains(com.qihoo.security.opti.trashclear.ui.a.a(c).get(a)))
                    {
                        break MISSING_BLOCK_LABEL_1110;
                    }
                    com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.g(c.a).remove(com.qihoo.security.opti.trashclear.ui.a.a(c).get(a));
                    if (ClearWhiteListActivity.e(c.a) != null)
                    {
                        ClearWhiteListActivity.e(c.a).a(3, b);
                    }
                    if (com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.g(c.a) != null && !com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.g(c.a).isEmpty())
                    {
                        break MISSING_BLOCK_LABEL_1090;
                    }
                    if (com.qihoo.security.opti.trashclear.ui.a.a(c) == null || com.qihoo.security.opti.trashclear.ui.a.a(c).isEmpty())
                    {
                        break MISSING_BLOCK_LABEL_1070;
                    }
                    i = 0;
                    view = obj;
                    for (; i >= com.qihoo.security.opti.trashclear.ui.a.a(c).size(); i++)
                    {
                        break MISSING_BLOCK_LABEL_966;
                    }

                    userbwrecord1 = (UserBWRecord)com.qihoo.security.opti.trashclear.ui.a.a(c).get(i);
                    if (userbwrecord1 == null)
                    {
                        break MISSING_BLOCK_LABEL_1531;
                    }
                    if (userbwrecord1.type == -3)
                    {
                        view = userbwrecord1;
                    }
                    break MISSING_BLOCK_LABEL_1531;
                    if (view == null)
                    {
                        break MISSING_BLOCK_LABEL_1050;
                    }
label1:
                    {
                        i = com.qihoo.security.opti.trashclear.ui.a.a(c).indexOf(view);
                        com.qihoo.security.opti.trashclear.ui.a.a(c).remove(view);
                        if (a <= i)
                        {
                            break label1;
                        }
                        com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a - 1);
                    }
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    if (ClearWhiteListActivity.h(c.a) == null || !ClearWhiteListActivity.h(c.a).contains(com.qihoo.security.opti.trashclear.ui.a.a(c).get(a)))
                    {
                        break MISSING_BLOCK_LABEL_1481;
                    }
                    ClearWhiteListActivity.h(c.a).remove(com.qihoo.security.opti.trashclear.ui.a.a(c).get(a));
                    if (ClearWhiteListActivity.e(c.a) != null)
                    {
                        ClearWhiteListActivity.e(c.a).a(1001, b);
                    }
                    if (ClearWhiteListActivity.h(c.a) != null && !ClearWhiteListActivity.h(c.a).isEmpty())
                    {
                        break MISSING_BLOCK_LABEL_1461;
                    }
                    if (com.qihoo.security.opti.trashclear.ui.a.a(c) == null || com.qihoo.security.opti.trashclear.ui.a.a(c).isEmpty())
                    {
                        break MISSING_BLOCK_LABEL_1441;
                    }
                    i = 0;
                    view = obj1;
                    for (; i >= com.qihoo.security.opti.trashclear.ui.a.a(c).size(); i++)
                    {
                        break MISSING_BLOCK_LABEL_1337;
                    }

                    userbwrecord1 = (UserBWRecord)com.qihoo.security.opti.trashclear.ui.a.a(c).get(i);
                    if (userbwrecord1 == null)
                    {
                        break MISSING_BLOCK_LABEL_1540;
                    }
                    if (userbwrecord1.type == -4)
                    {
                        view = userbwrecord1;
                    }
                    break MISSING_BLOCK_LABEL_1540;
                    if (view == null)
                    {
                        break MISSING_BLOCK_LABEL_1421;
                    }
label2:
                    {
                        i = com.qihoo.security.opti.trashclear.ui.a.a(c).indexOf(view);
                        com.qihoo.security.opti.trashclear.ui.a.a(c).remove(view);
                        if (a <= i)
                        {
                            break label2;
                        }
                        com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a - 1);
                    }
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
                    com.qihoo.security.opti.trashclear.ui.a.a(c).remove(a);
                      goto _L16
_L12:
                    i++;
                    if (true) goto _L17; else goto _L2
_L2:
                }

            
            {
                c = a1;
                a = i;
                b = userbwrecord;
                super();
            }
            });
            return view1;
_L2:
            view = userbwrecord.desc;
            if (view != null && !view.equals(""))
            {
                ((b) (viewgroup)).c.setLocalText(view);
            } else
            {
                ((b) (viewgroup)).c.setLocalText("");
            }
            view = userbwrecord.value;
            ArrayList arraylist;
            int k;
            try
            {
                view = com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity.a(a).a(null, view, 0x7f02014f);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                view = ((View) (obj));
            }
            if (view == null)
            {
                ((b) (viewgroup)).d.setImageDrawable(a.getResources().getDrawable(0x7f020062));
            } else
            {
                ((b) (viewgroup)).d.setImageDrawable(view);
            }
            view = userbwrecord.value;
            if (view != null && !view.equals(""))
            {
                ((b) (viewgroup)).b.setLocalText(view);
            } else
            {
                ((b) (viewgroup)).b.setLocalText("");
            }
            continue; /* Loop/switch isn't completed */
_L3:
            view = userbwrecord.desc;
            if (view != null && !view.equals(""))
            {
                ((b) (viewgroup)).c.setLocalText(view);
            } else
            {
                ((b) (viewgroup)).c.setLocalText("");
            }
            view = userbwrecord.value;
            if (view != null && !view.equals(""))
            {
                ((b) (viewgroup)).b.setLocalText(view);
            } else
            {
                ((b) (viewgroup)).b.setLocalText("");
            }
            ((b) (viewgroup)).d.setImageDrawable(a.getResources().getDrawable(0x7f020149));
            continue; /* Loop/switch isn't completed */
_L5:
            if (userbwrecord.type != 321)
            {
                break MISSING_BLOCK_LABEL_1178;
            }
            obj = ((b) (viewgroup)).c;
            if (userbwrecord.desc == null)
            {
                view = "";
            } else
            {
                view = userbwrecord.desc;
            }
            ((LocaleTextView) (obj)).setLocalText(view);
            view = userbwrecord.bundle;
            if (view == null || view.get("pkgList") == null)
            {
                break MISSING_BLOCK_LABEL_1155;
            }
            arraylist = (ArrayList)view.get("pkgList");
            if (arraylist == null || arraylist.isEmpty()) goto _L7; else goto _L6
_L6:
            view = null;
            k = 0;
_L12:
            obj = view;
            if (k >= arraylist.size()) goto _L9; else goto _L8
_L8:
            obj = (String)arraylist.get(k);
            obj = ClearWhiteListActivity.b(a).getApplicationIcon(((String) (obj)));
            view = ((View) (obj));
_L11:
            if (view == null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = view;
_L9:
            if (obj != null)
            {
                ((b) (viewgroup)).d.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
                ((b) (viewgroup)).d.setVisibility(0);
            } else
            {
                ((b) (viewgroup)).d.setImageDrawable(a.getResources().getDrawable(0x7f020044));
            }
            continue; /* Loop/switch isn't completed */
            obj;
            ((android.content.pm.PackageManager.NameNotFoundException) (obj)).printStackTrace();
            if (true) goto _L11; else goto _L10
_L10:
            k++;
            if (true) goto _L12; else goto _L7
_L7:
            ((b) (viewgroup)).d.setImageDrawable(a.getResources().getDrawable(0x7f020044));
            continue; /* Loop/switch isn't completed */
            ((b) (viewgroup)).d.setImageDrawable(a.getResources().getDrawable(0x7f020044));
            continue; /* Loop/switch isn't completed */
            ((b) (viewgroup)).d.setVisibility(8);
            if (true) goto _L14; else goto _L13
_L13:
        }

        public a(Context context, List list)
        {
            a = ClearWhiteListActivity.this;
            super();
            b = LayoutInflater.from(context);
            if (list == null)
            {
                c = new ArrayList(0);
                return;
            } else
            {
                c = new ArrayList(list);
                return;
            }
        }
    }

    private class b
    {

        public LocaleTextView a;
        public LocaleTextView b;
        public LocaleTextView c;
        public ImageView d;
        final ClearWhiteListActivity e;

        private b()
        {
            e = ClearWhiteListActivity.this;
            super();
        }

    }


    private List A;
    private List B;
    private List C;
    private List D;
    private LocaleTextView E;
    private LinearLayout F;
    private com.qihoo.security.enginehelper.clean.a G;
    private g H;
    private PackageManager I;
    private boolean J;
    private ListView y;
    private a z;

    public ClearWhiteListActivity()
    {
        J = false;
    }

    static g a(ClearWhiteListActivity clearwhitelistactivity)
    {
        return clearwhitelistactivity.H;
    }

    static String a(ClearWhiteListActivity clearwhitelistactivity, String s)
    {
        return clearwhitelistactivity.c(s);
    }

    static boolean a(ClearWhiteListActivity clearwhitelistactivity, boolean flag)
    {
        clearwhitelistactivity.J = flag;
        return flag;
    }

    static PackageManager b(ClearWhiteListActivity clearwhitelistactivity)
    {
        return clearwhitelistactivity.I;
    }

    private String c(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            String s2 = "";
            s1 = s;
            if (s.contains("[[["))
            {
                s1 = s;
                if (s.contains("]]]"))
                {
                    Matcher matcher = Pattern.compile("\\[\\[\\[(\\d)\\]\\]\\]").matcher(s);
                    Object obj;
                    for (obj = s2; matcher.find(); obj = matcher.group(1)) { }
                    s = s.toString().replace("[[[", "").replace("]]]", "").replace(((CharSequence) (obj)), "");
                    obj = Integer.valueOf(((String) (obj)));
                    return (new StringBuilder()).append(s).append(o.a(0x7f0c005f, new Object[] {
                        obj
                    })).toString();
                }
            }
        }
        return s1;
    }

    static boolean c(ClearWhiteListActivity clearwhitelistactivity)
    {
        return clearwhitelistactivity.J;
    }

    static List d(ClearWhiteListActivity clearwhitelistactivity)
    {
        return clearwhitelistactivity.A;
    }

    static com.qihoo.security.enginehelper.clean.a e(ClearWhiteListActivity clearwhitelistactivity)
    {
        return clearwhitelistactivity.G;
    }

    static List f(ClearWhiteListActivity clearwhitelistactivity)
    {
        return clearwhitelistactivity.B;
    }

    static List g(ClearWhiteListActivity clearwhitelistactivity)
    {
        return clearwhitelistactivity.D;
    }

    static List h(ClearWhiteListActivity clearwhitelistactivity)
    {
        return clearwhitelistactivity.C;
    }

    protected void j()
    {
        super.j();
        b(0x7f0c0060);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030095);
        H = new g(p, 40, 40);
        I = getPackageManager();
        F = (LinearLayout)findViewById(0x7f0b0094);
        E = (LocaleTextView)findViewById(0x7f0b0091);
        E.setLocalText(0x7f0c0069);
        y = (ListView)findViewById(0x7f0b0182);
        y.setEmptyView(F);
        G = com.qihoo.security.enginehelper.clean.a.a(p);
        G.e();
        A = G.a(2);
        B = G.a(4);
        D = G.a(3);
        C = G.a(1001);
        z = new a(p, null);
        y.setAdapter(z);
        if (A != null && !A.isEmpty())
        {
            bundle = new UserBWRecord();
            bundle.type = -1;
            ArrayList arraylist = new ArrayList();
            arraylist.add(bundle);
            z.a(arraylist);
        }
        z.a(A);
        if (B != null && !B.isEmpty())
        {
            bundle = new UserBWRecord();
            bundle.type = -2;
            ArrayList arraylist1 = new ArrayList();
            arraylist1.add(bundle);
            z.a(arraylist1);
        }
        z.a(B);
        if (D != null && !D.isEmpty())
        {
            bundle = new UserBWRecord();
            bundle.type = -3;
            ArrayList arraylist2 = new ArrayList();
            arraylist2.add(bundle);
            z.a(arraylist2);
        }
        z.a(D);
        if (C != null && !C.isEmpty())
        {
            bundle = new UserBWRecord();
            bundle.type = -4;
            ArrayList arraylist3 = new ArrayList();
            arraylist3.add(bundle);
            z.a(arraylist3);
        }
        z.a(C);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (H != null)
        {
            H.a();
        }
        if (G != null)
        {
            G.f();
        }
    }

    protected void onPause()
    {
        super.onPause();
    }
}
