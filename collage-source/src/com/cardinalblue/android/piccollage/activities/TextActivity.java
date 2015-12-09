// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.gson.ColorOption;
import com.cardinalblue.android.piccollage.model.gson.ColorOptionList;
import com.cardinalblue.android.piccollage.model.gson.Font;
import com.cardinalblue.android.piccollage.model.gson.FontList;
import com.cardinalblue.android.piccollage.model.gson.FontModel;
import com.cardinalblue.android.piccollage.model.gson.TextFormatModel;
import com.cardinalblue.android.piccollage.model.gson.TextScrapModel;
import com.cardinalblue.android.piccollage.view.CheckableImageView;
import com.cardinalblue.android.piccollage.view.PreviewTextView;
import com.cardinalblue.android.piccollage.view.a.l;
import com.cardinalblue.android.piccollage.view.m;
import com.google.samples.apps.iosched.ui.widget.SlidingTabLayout;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseFragmentActivity

public class TextActivity extends BaseFragmentActivity
{
    public static class a extends b
    {

        private ColorOption b;
        private int c;
        private g d;

        static g a(a a1)
        {
            return a1.d;
        }

        private g a(ColorOptionList coloroptionlist)
        {
            return new g(getActivity(), 0x7f0300f4, coloroptionlist.colorOptions);
        }

        static ColorOption a(a a1, ColorOption coloroption)
        {
            a1.b = coloroption;
            return coloroption;
        }

        static ColorOption b(a a1)
        {
            return a1.b;
        }

        public volatile void onCreate(Bundle bundle)
        {
            super.onCreate(bundle);
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            viewgroup = (ColorOptionList)com.cardinalblue.android.b.k.a(getResources(), 0x7f060009, com/cardinalblue/android/piccollage/model/gson/ColorOptionList);
            getArguments();
            c = a.getText().getTextFormat().getTextBackgroundColor();
            layoutinflater = layoutinflater.inflate(0x7f0300c6, null);
            bundle = (GridView)layoutinflater.findViewById(0x7f100204);
            d = a(viewgroup);
            d.a(viewgroup.getColorOptionIndex(c));
            bundle.setAdapter(d);
            bundle.setSelection(d.a(ColorOption.parse(c)));
            bundle.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(this) {

                final a a;

                public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
                {
                    a.a(a).a(i1);
                    a.a(a).notifyDataSetInvalidated();
                    a.a(a, (ColorOption)a.a(a).getItem(i1));
                    com.cardinalblue.android.piccollage.controller.d.a().c(new c(com.cardinalblue.android.piccollage.activities.a.b(a)));
                    a.a.getText().getTextFormat().setBackgroundColor(com.cardinalblue.android.piccollage.activities.a.b(a).getColor());
                    a.getArguments().putParcelable("text_model", a.a);
                }

            
            {
                a = a1;
                super();
            }
            });
            return layoutinflater;
        }

        public a()
        {
        }
    }

    private static abstract class b extends Fragment
    {

        protected TextScrapModel a;

        public void onCreate(Bundle bundle)
        {
            super.onCreate(bundle);
            a = (TextScrapModel)getArguments().getParcelable("text_model");
        }

        private b()
        {
        }

    }

    public static final class c
    {

        private ColorOption a;

        public ColorOption a()
        {
            return a;
        }

        public c(ColorOption coloroption)
        {
            a = coloroption;
        }
    }

    public static final class d
    {

        private ColorOption a;

        public ColorOption a()
        {
            return a;
        }

        public d(ColorOption coloroption)
        {
            a = coloroption;
        }
    }

    public static final class e
    {

        private boolean a;

        public boolean a()
        {
            return a;
        }

        public e(boolean flag)
        {
            a = flag;
        }
    }

    public static final class f
    {

        private String a;

        public String a()
        {
            if (TextUtils.isEmpty(a))
            {
                return "font_Bebas_Neue.ttf";
            } else
            {
                return a;
            }
        }

        public f(String s)
        {
            a = s;
        }
    }

    private static class g extends ArrayAdapter
    {

        private int a;

        public int a(ColorOption coloroption)
        {
            for (int i1 = 0; i1 < getCount(); i1++)
            {
                if (((ColorOption)getItem(i1)).equals(coloroption))
                {
                    return i1;
                }
            }

            return -1;
        }

        public void a(int i1)
        {
            a = i1;
        }

        public int getPosition(Object obj)
        {
            return a((ColorOption)obj);
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            boolean flag = false;
            int j1 = ((ColorOption)getItem(i1)).getColor();
            if (view == null)
            {
                view = (CheckableImageView)LayoutInflater.from(getContext()).inflate(0x7f0300f4, viewgroup, false);
            } else
            {
                view = (CheckableImageView)view;
            }
            if (a == i1)
            {
                flag = true;
            }
            view.setChecked(flag);
            if (j1 == 0)
            {
                view.setImageResource(0x7f02012c);
                return view;
            } else
            {
                view.setImageDrawable(new ColorDrawable(j1));
                return view;
            }
        }

        public g(Context context, int i1, List list)
        {
            super(context, i1, list);
        }
    }

    public static class h extends b
    {

        private ColorOption b;
        private int c;
        private g d;

        static g a(h h1)
        {
            return h1.d;
        }

        private g a(ColorOptionList coloroptionlist)
        {
            return new g(getActivity(), 0x7f0300f4, coloroptionlist.colorOptions);
        }

        static ColorOption a(h h1, ColorOption coloroption)
        {
            h1.b = coloroption;
            return coloroption;
        }

        static ColorOption b(h h1)
        {
            return h1.b;
        }

        public volatile void onCreate(Bundle bundle)
        {
            super.onCreate(bundle);
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            viewgroup = l.a(getActivity()).a();
            c = a.getText().getTextFormat().getTextColor();
            layoutinflater = layoutinflater.inflate(0x7f0300c6, null);
            bundle = (GridView)layoutinflater.findViewById(0x7f100204);
            d = a(viewgroup);
            d.a(viewgroup.getColorOptionIndex(c));
            bundle.setAdapter(d);
            bundle.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(this) {

                final h a;

                public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
                {
                    h.a(a).a(i1);
                    h.a(a).notifyDataSetInvalidated();
                    h.a(a, (ColorOption)h.a(a).getItem(i1));
                    com.cardinalblue.android.piccollage.controller.d.a().c(new d(com.cardinalblue.android.piccollage.activities.h.b(a)));
                    a.a.getText().getTextFormat().setTextColor(com.cardinalblue.android.piccollage.activities.h.b(a).getColor());
                    a.a.getText().getTextFormat().setBorderColor(com.cardinalblue.android.piccollage.activities.h.b(a).getContrastColor());
                    a.getArguments().putParcelable("text_model", a.a);
                }

            
            {
                a = h1;
                super();
            }
            });
            return layoutinflater;
        }

        public h()
        {
        }
    }

    public static class i extends b
    {

        private k b;

        static k a(i i1)
        {
            return i1.b;
        }

        public volatile void onCreate(Bundle bundle)
        {
            super.onCreate(bundle);
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            viewgroup = layoutinflater.inflate(0x7f0300c8, null);
            layoutinflater = (FontList)com.cardinalblue.android.b.k.a(getResources(), 0x7f060006, com/cardinalblue/android/piccollage/model/gson/FontList);
            bundle = getActivity();
            int i1;
            if (layoutinflater != null)
            {
                layoutinflater = ((FontList) (layoutinflater)).fontList;
            } else
            {
                layoutinflater = new ArrayList();
            }
            b = new k(bundle, 0x7f03014c, layoutinflater);
            layoutinflater = (ListView)viewgroup.findViewById(0x7f100206);
            layoutinflater.setAdapter(b);
            layoutinflater.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(this) {

                final i a;

                public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
                {
                    adapterview = ((Font)i.a(a).getItem(i1)).fontName;
                    com.cardinalblue.android.piccollage.controller.d.a().c(new f(adapterview));
                    a.a.getText().getTextFormat().getFont().setFontName(adapterview);
                    a.getArguments().putParcelable("text_model", a.a);
                }

            
            {
                a = i1;
                super();
            }
            });
            a = (TextScrapModel)getArguments().getParcelable("text_model");
            bundle = a.getText().getTextFormat().getFont().getFontName();
            i1 = b.a(bundle);
            if (i1 >= 0)
            {
                layoutinflater.performItemClick(layoutinflater.getChildAt(i1), i1, i1);
                layoutinflater.setSelectionFromTop(i1, getResources().getDimensionPixelSize(0x7f0b013b) / 2);
            }
            return viewgroup;
        }

        public i()
        {
        }
    }

    public static class j extends b
    {

        private CheckedTextView b;

        static CheckedTextView a(j j1)
        {
            return j1.b;
        }

        public void onCreate(Bundle bundle)
        {
            super.onCreate(bundle);
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            layoutinflater = layoutinflater.inflate(0x7f0300c7, null);
            b = (CheckedTextView)layoutinflater.findViewById(0x7f100205);
            boolean flag = a.getText().getTextFormat().hasTextBorder();
            b.setChecked(flag);
            b.setOnClickListener(new android.view.View.OnClickListener(this) {

                final j a;

                public void onClick(View view)
                {
                    j.a(a).toggle();
                    boolean flag = j.a(a).isChecked();
                    com.cardinalblue.android.piccollage.controller.d.a().c(new e(flag));
                    a.a.getText().getTextFormat().setTextBorder(flag);
                    a.getArguments().putParcelable("text_model", a.a);
                    com.cardinalblue.android.piccollage.a.b.ai();
                }

            
            {
                a = j1;
                super();
            }
            });
            return layoutinflater;
        }

        public j()
        {
        }
    }

    private static class k extends ArrayAdapter
    {

        int a(String s)
        {
            for (int i1 = 0; i1 < getCount(); i1++)
            {
                if (((Font)getItem(i1)).fontName.equals(s))
                {
                    return i1;
                }
            }

            return -1;
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            if (view != null)
            {
                view = (TextView)view;
            } else
            {
                view = (TextView)super.getView(i1, view, viewgroup);
            }
            viewgroup = m.b(getContext(), ((Font)getItem(i1)).fontName);
            if (viewgroup == null)
            {
                viewgroup = Typeface.DEFAULT;
            }
            view.setTypeface(viewgroup);
            view.setText(((Font)getItem(i1)).displayName);
            return view;
        }

        public k(Context context, int i1, List list)
        {
            super(context, i1, list);
        }
    }

    private static class l
    {

        private static l a = null;
        private final ColorOptionList b;

        public static l a(Context context)
        {
            if (a == null)
            {
                a = new l(context);
            }
            return a;
        }

        public ColorOptionList a()
        {
            return b;
        }


        private l(Context context)
        {
            b = (ColorOptionList)com.cardinalblue.android.b.k.a(context.getResources(), 0x7f060001, com/cardinalblue/android/piccollage/model/gson/ColorOptionList);
        }
    }


    private PreviewTextView a;
    private boolean b;
    private String c;

    public TextActivity()
    {
    }

    static PreviewTextView a(TextActivity textactivity)
    {
        return textactivity.a;
    }

    static void a(TextActivity textactivity, String s)
    {
        textactivity.a(s);
    }

    private void a(String s)
    {
        String s1 = s;
        if (c.equals(s))
        {
            s1 = "";
        }
        (new com.afollestad.materialdialogs.f.a(this)).a(0x7f07029c).d(0x24061).b(0x7f07012e).a(getString(0x7f07029c), s1, true, new com.afollestad.materialdialogs.f.d() {

            final TextActivity a;

            public void a(com.afollestad.materialdialogs.f f1, CharSequence charsequence)
            {
            }

            
            {
                a = TextActivity.this;
                super();
            }
        }).c(0x7f07010f).a(new com.afollestad.materialdialogs.f.j() {

            final TextActivity a;

            public void a(com.afollestad.materialdialogs.f f1, com.afollestad.materialdialogs.b b1)
            {
label0:
                {
                    b1 = f1.f().getText().toString();
                    if (b1 != null)
                    {
                        f1 = b1;
                        if (!TextUtils.isEmpty(b1.trim()))
                        {
                            break label0;
                        }
                    }
                    f1 = TextActivity.c(a);
                }
                TextActivity.a(a).setString(f1);
            }

            
            {
                a = TextActivity.this;
                super();
            }
        }).b(new com.afollestad.materialdialogs.f.j() {

            final TextActivity a;

            public void a(com.afollestad.materialdialogs.f f1, com.afollestad.materialdialogs.b b1)
            {
                if (com.cardinalblue.android.piccollage.activities.TextActivity.b(a))
                {
                    a.finish();
                }
            }

            
            {
                a = TextActivity.this;
                super();
            }
        }).c();
    }

    static boolean a(TextActivity textactivity, boolean flag)
    {
        textactivity.b = flag;
        return flag;
    }

    static boolean b(TextActivity textactivity)
    {
        return textactivity.b;
    }

    static String c(TextActivity textactivity)
    {
        return textactivity.c;
    }

    public void onBackPressed()
    {
        setResult(0);
        super.onBackPressed();
    }

    public void onBgColorPicked(c c1)
    {
        a.setBgColorOption(c1.a());
    }

    public void onColorPicked(d d1)
    {
        a.setColorOption(d1.a());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03003e);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        c = TextScrapModel.getDefaultText(this);
        a = (PreviewTextView)findViewById(0x7f100100);
        a.setOnClickListener(new android.view.View.OnClickListener() {

            final TextActivity a;

            public void onClick(View view)
            {
                TextActivity.a(a, false);
                TextActivity.a(a, TextActivity.a(a).getString());
            }

            
            {
                a = TextActivity.this;
                super();
            }
        });
        Object obj;
        Object obj1;
        Bundle bundle1;
        if (bundle == null)
        {
            obj = (TextScrapModel)getIntent().getParcelableExtra("text_model");
        } else
        {
            obj = (TextScrapModel)bundle.getParcelable("text_model");
        }
        a.a(((TextScrapModel) (obj)));
        a.invalidate();
        obj1 = new com.cardinalblue.android.piccollage.view.a.l(this);
        bundle1 = new Bundle();
        bundle1.putParcelable("text_model", ((android.os.Parcelable) (obj)));
        ((com.cardinalblue.android.piccollage.view.a.l) (obj1)).a(0x7f0202ba, com/cardinalblue/android/piccollage/activities/TextActivity$i.getName(), bundle1, "tag_font_picker");
        bundle1 = new Bundle();
        bundle1.putParcelable("text_model", ((android.os.Parcelable) (obj)));
        ((com.cardinalblue.android.piccollage.view.a.l) (obj1)).a(0x7f0202b8, com/cardinalblue/android/piccollage/activities/TextActivity$h.getName(), bundle1, "tag_color_picker");
        bundle1 = new Bundle();
        bundle1.putParcelable("text_model", ((android.os.Parcelable) (obj)));
        ((com.cardinalblue.android.piccollage.view.a.l) (obj1)).a(0x7f0202b7, com/cardinalblue/android/piccollage/activities/TextActivity$a.getName(), bundle1, "tag_background_picker");
        bundle1 = new Bundle();
        bundle1.putParcelable("text_model", ((android.os.Parcelable) (obj)));
        ((com.cardinalblue.android.piccollage.view.a.l) (obj1)).a(0x7f0202b9, com/cardinalblue/android/piccollage/activities/TextActivity$j.getName(), bundle1, "tag_style_config");
        obj = (ViewPager)findViewById(0x7f1000fe);
        ((ViewPager) (obj)).setOffscreenPageLimit(3);
        ((ViewPager) (obj)).setAdapter(((android.support.v4.view.PagerAdapter) (obj1)));
        obj1 = (SlidingTabLayout)findViewById(0x7f1000fd);
        ((SlidingTabLayout) (obj1)).a(0x7f03014b, 0, 0x7f10007a);
        ((SlidingTabLayout) (obj1)).setSelectedIndicatorColors(new int[] {
            getResources().getColor(0x7f0f00ff)
        });
        ((SlidingTabLayout) (obj1)).setDistributeEvenly(true);
        ((SlidingTabLayout) (obj1)).setViewPager(((ViewPager) (obj)));
        b = true;
        if (bundle == null)
        {
            a(a.getString());
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11001f, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 32
    //                   16908332: 38
    //                   2131755754: 49;
           goto _L1 _L2 _L3
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        setResult(0);
        finish();
_L5:
        return true;
_L3:
        menuitem = a.getString();
        if (menuitem == null || menuitem.trim().equals(""))
        {
            setResult(0);
            finish();
        } else
        {
            com.cardinalblue.android.piccollage.a.b.bH();
            menuitem = new Intent();
            menuitem.putExtra("text_model", a.getModel());
            setResult(-1, menuitem);
            finish();
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("text_model", a.getModel());
    }

    protected void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.controller.d.b(this);
    }

    protected void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.controller.d.a(this);
    }

    public void setFont(f f1)
    {
        f1 = f1.a();
        a.setFont(f1);
        com.cardinalblue.android.piccollage.a.b.aj();
        com.cardinalblue.android.piccollage.a.b.E(f1);
    }

    public void setOutline(e e1)
    {
        a.setHasOutline(e1.a());
    }
}
