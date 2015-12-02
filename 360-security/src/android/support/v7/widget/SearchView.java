// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.view.g;
import android.support.v7.b.b;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            a

public class SearchView extends LinearLayout
    implements android.support.v7.b.b
{
    public static class SearchAutoComplete extends AutoCompleteTextView
    {

        private int a;
        private SearchView b;

        private boolean a()
        {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        static boolean a(SearchAutoComplete searchautocomplete)
        {
            return searchautocomplete.a();
        }

        public boolean enoughToFilter()
        {
            return a <= 0 || super.enoughToFilter();
        }

        protected void onFocusChanged(boolean flag, int i1, Rect rect)
        {
            super.onFocusChanged(flag, i1, rect);
            b.d();
        }

        public boolean onKeyPreIme(int i1, KeyEvent keyevent)
        {
            if (i1 == 4)
            {
                if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate = getKeyDispatcherState();
                    if (dispatcherstate != null)
                    {
                        dispatcherstate.startTracking(keyevent, this);
                    }
                    return true;
                }
                if (keyevent.getAction() == 1)
                {
                    android.view.KeyEvent.DispatcherState dispatcherstate1 = getKeyDispatcherState();
                    if (dispatcherstate1 != null)
                    {
                        dispatcherstate1.handleUpEvent(keyevent);
                    }
                    if (keyevent.isTracking() && !keyevent.isCanceled())
                    {
                        b.clearFocus();
                        SearchView.a(b, false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i1, keyevent);
        }

        public void onWindowFocusChanged(boolean flag)
        {
            super.onWindowFocusChanged(flag);
            if (flag && b.hasFocus() && getVisibility() == 0)
            {
                ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.a(getContext()))
                {
                    SearchView.a.a(this, true);
                }
            }
        }

        public void performCompletion()
        {
        }

        protected void replaceText(CharSequence charsequence)
        {
        }

        void setSearchView(SearchView searchview)
        {
            b = searchview;
        }

        public void setThreshold(int i1)
        {
            super.setThreshold(i1);
            a = i1;
        }

        public SearchAutoComplete(Context context)
        {
            super(context);
            a = getThreshold();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = getThreshold();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i1)
        {
            super(context, attributeset, i1);
            a = getThreshold();
        }
    }

    private static class a
    {

        private Method a;
        private Method b;
        private Method c;
        private Method d;

        void a(InputMethodManager inputmethodmanager, View view, int i1)
        {
            if (d != null)
            {
                try
                {
                    d.invoke(inputmethodmanager, new Object[] {
                        Integer.valueOf(i1), null
                    });
                    return;
                }
                catch (Exception exception) { }
            }
            inputmethodmanager.showSoftInput(view, i1);
        }

        void a(AutoCompleteTextView autocompletetextview)
        {
            if (a == null)
            {
                break MISSING_BLOCK_LABEL_20;
            }
            a.invoke(autocompletetextview, new Object[0]);
            return;
            autocompletetextview;
        }

        void a(AutoCompleteTextView autocompletetextview, boolean flag)
        {
            if (c == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            c.invoke(autocompletetextview, new Object[] {
                Boolean.valueOf(flag)
            });
            return;
            autocompletetextview;
        }

        void b(AutoCompleteTextView autocompletetextview)
        {
            if (b == null)
            {
                break MISSING_BLOCK_LABEL_20;
            }
            b.invoke(autocompletetextview, new Object[0]);
            return;
            autocompletetextview;
        }

        a()
        {
            try
            {
                a = android/widget/AutoCompleteTextView.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                a.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception3) { }
            try
            {
                b = android/widget/AutoCompleteTextView.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                b.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception2) { }
            try
            {
                c = android/widget/AutoCompleteTextView.getMethod("ensureImeVisible", new Class[] {
                    Boolean.TYPE
                });
                c.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception1) { }
            try
            {
                d = android/view/inputmethod/InputMethodManager.getMethod("showSoftInputUnchecked", new Class[] {
                    Integer.TYPE, android/os/ResultReceiver
                });
                d.setAccessible(true);
                return;
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                return;
            }
        }
    }

    public static interface b
    {

        public abstract boolean a();
    }

    public static interface c
    {

        public abstract boolean a(String s1);

        public abstract boolean b(String s1);
    }

    public static interface d
    {

        public abstract boolean a(int i1);

        public abstract boolean b(int i1);
    }


    static final a a = new a();
    private CharSequence A;
    private CharSequence B;
    private boolean C;
    private int D;
    private SearchableInfo E;
    private Bundle F;
    private Runnable G;
    private Runnable H;
    private Runnable I;
    private final Intent J = new Intent("android.speech.action.WEB_SEARCH");
    private final Intent K = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    private final WeakHashMap L = new WeakHashMap();
    private final android.view.View.OnClickListener M = new android.view.View.OnClickListener() {

        final SearchView a;

        public void onClick(View view)
        {
            if (view == SearchView.e(a))
            {
                SearchView.f(a);
            } else
            {
                if (view == android.support.v7.widget.SearchView.g(a))
                {
                    SearchView.h(a);
                    return;
                }
                if (view == SearchView.i(a))
                {
                    SearchView.j(a);
                    return;
                }
                if (view == SearchView.k(a))
                {
                    SearchView.l(a);
                    return;
                }
                if (view == SearchView.m(a))
                {
                    SearchView.n(a);
                    return;
                }
            }
        }

            
            {
                a = SearchView.this;
                super();
            }
    };
    private final android.widget.TextView.OnEditorActionListener N = new android.widget.TextView.OnEditorActionListener() {

        final SearchView a;

        public boolean onEditorAction(TextView textview, int j1, KeyEvent keyevent)
        {
            SearchView.j(a);
            return true;
        }

            
            {
                a = SearchView.this;
                super();
            }
    };
    private final android.widget.AdapterView.OnItemClickListener O = new android.widget.AdapterView.OnItemClickListener() {

        final SearchView a;

        public void onItemClick(AdapterView adapterview, View view, int j1, long l1)
        {
            SearchView.a(a, j1, 0, null);
        }

            
            {
                a = SearchView.this;
                super();
            }
    };
    private final android.widget.AdapterView.OnItemSelectedListener P = new android.widget.AdapterView.OnItemSelectedListener() {

        final SearchView a;

        public void onItemSelected(AdapterView adapterview, View view, int j1, long l1)
        {
            SearchView.a(a, j1);
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        }

            
            {
                a = SearchView.this;
                super();
            }
    };
    private TextWatcher Q;
    android.view.View.OnKeyListener b;
    private c c;
    private b d;
    private android.view.View.OnFocusChangeListener e;
    private d f;
    private android.view.View.OnClickListener g;
    private boolean h;
    private boolean i;
    private android.support.v4.widget.b j;
    private View k;
    private View l;
    private View m;
    private View n;
    private ImageView o;
    private View p;
    private View q;
    private SearchAutoComplete r;
    private View s;
    private ImageView t;
    private boolean u;
    private CharSequence v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;

    public SearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        G = new Runnable() {

            final SearchView a;

            public void run()
            {
                InputMethodManager inputmethodmanager = (InputMethodManager)a.getContext().getSystemService("input_method");
                if (inputmethodmanager != null)
                {
                    SearchView.a.a(inputmethodmanager, a, 0);
                }
            }

            
            {
                a = SearchView.this;
                super();
            }
        };
        H = new Runnable() {

            final SearchView a;

            public void run()
            {
                SearchView.a(a);
            }

            
            {
                a = SearchView.this;
                super();
            }
        };
        I = new Runnable() {

            final SearchView a;

            public void run()
            {
                if (android.support.v7.widget.SearchView.b(a) != null && (android.support.v7.widget.SearchView.b(a) instanceof android.support.v7.widget.a))
                {
                    android.support.v7.widget.SearchView.b(a).a(null);
                }
            }

            
            {
                a = SearchView.this;
                super();
            }
        };
        b = new android.view.View.OnKeyListener() {

            final SearchView a;

            public boolean onKey(View view, int j1, KeyEvent keyevent)
            {
                if (SearchView.o(a) != null)
                {
                    if (SearchView.m(a).isPopupShowing() && SearchView.m(a).getListSelection() != -1)
                    {
                        return SearchView.a(a, view, j1, keyevent);
                    }
                    if (!SearchAutoComplete.a(SearchView.m(a)) && android.support.v4.view.g.a(keyevent) && keyevent.getAction() == 1 && j1 == 66)
                    {
                        view.cancelLongPress();
                        SearchView.a(a, 0, null, SearchView.m(a).getText().toString());
                        return true;
                    }
                }
                return false;
            }

            
            {
                a = SearchView.this;
                super();
            }
        };
        Q = new TextWatcher() {

            final SearchView a;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence1, int j1, int k1, int l1)
            {
            }

            public void onTextChanged(CharSequence charsequence1, int j1, int k1, int l1)
            {
                SearchView.a(a, charsequence1);
            }

            
            {
                a = SearchView.this;
                super();
            }
        };
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(android.support.v7.a.a.g.abc_search_view, this, true);
        k = findViewById(android.support.v7.a.a.e.search_button);
        r = (SearchAutoComplete)findViewById(android.support.v7.a.a.e.search_src_text);
        r.setSearchView(this);
        p = findViewById(android.support.v7.a.a.e.search_edit_frame);
        m = findViewById(android.support.v7.a.a.e.search_plate);
        n = findViewById(android.support.v7.a.a.e.submit_area);
        l = findViewById(android.support.v7.a.a.e.search_go_btn);
        o = (ImageView)findViewById(android.support.v7.a.a.e.search_close_btn);
        q = findViewById(android.support.v7.a.a.e.search_voice_btn);
        t = (ImageView)findViewById(android.support.v7.a.a.e.search_mag_icon);
        k.setOnClickListener(M);
        o.setOnClickListener(M);
        l.setOnClickListener(M);
        q.setOnClickListener(M);
        r.setOnClickListener(M);
        r.addTextChangedListener(Q);
        r.setOnEditorActionListener(N);
        r.setOnItemClickListener(O);
        r.setOnItemSelectedListener(P);
        r.setOnKeyListener(b);
        r.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final SearchView a;

            public void onFocusChange(View view, boolean flag1)
            {
                if (SearchView.c(a) != null)
                {
                    SearchView.c(a).onFocusChange(a, flag1);
                }
            }

            
            {
                a = SearchView.this;
                super();
            }
        });
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.SearchView, 0, 0);
        setIconifiedByDefault(typedarray.getBoolean(3, true));
        int i1 = typedarray.getDimensionPixelSize(0, -1);
        if (i1 != -1)
        {
            setMaxWidth(i1);
        }
        CharSequence charsequence = typedarray.getText(4);
        if (!TextUtils.isEmpty(charsequence))
        {
            setQueryHint(charsequence);
        }
        i1 = typedarray.getInt(2, -1);
        if (i1 != -1)
        {
            setImeOptions(i1);
        }
        i1 = typedarray.getInt(1, -1);
        if (i1 != -1)
        {
            setInputType(i1);
        }
        typedarray.recycle();
        context = context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.View, 0, 0);
        boolean flag = context.getBoolean(0, true);
        context.recycle();
        setFocusable(flag);
        J.addFlags(0x10000000);
        J.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        K.addFlags(0x10000000);
        s = findViewById(r.getDropDownAnchor());
        if (s != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                e();
            } else
            {
                f();
            }
        }
        a(h);
        m();
    }

    private Intent a(Intent intent, SearchableInfo searchableinfo)
    {
        Intent intent1 = new Intent(intent);
        intent = searchableinfo.getSearchActivity();
        if (intent == null)
        {
            intent = null;
        } else
        {
            intent = intent.flattenToShortString();
        }
        intent1.putExtra("calling_package", intent);
        return intent1;
    }

    private Intent a(Cursor cursor, int i1, String s1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s2;
        try
        {
            obj1 = android.support.v7.widget.a.a(cursor, "suggest_intent_action");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                i1 = cursor.getPosition();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                i1 = -1;
            }
            Log.w("SearchView", (new StringBuilder()).append("Search suggestions cursor at row ").append(i1).append(" returned exception.").toString(), s1);
            return null;
        }
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = E.getSuggestIntentAction();
          goto _L2
_L7:
        obj2 = android.support.v7.widget.a.a(cursor, "suggest_intent_data");
        obj = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = E.getSuggestIntentData();
        obj2 = obj;
        if (obj == null) goto _L4; else goto _L3
_L3:
        s2 = android.support.v7.widget.a.a(cursor, "suggest_intent_data_id");
        obj2 = obj;
        if (s2 == null) goto _L4; else goto _L5
_L5:
        obj2 = (new StringBuilder()).append(((String) (obj))).append("/").append(Uri.encode(s2)).toString();
          goto _L4
_L6:
        obj2 = android.support.v7.widget.a.a(cursor, "suggest_intent_query");
        return a(((String) (obj1)), ((Uri) (obj)), android.support.v7.widget.a.a(cursor, "suggest_intent_extra_data"), ((String) (obj2)), i1, s1);
_L9:
        obj = Uri.parse(((String) (obj2)));
          goto _L6
_L2:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = "android.intent.action.SEARCH";
        }
          goto _L7
_L4:
        if (obj2 != null) goto _L9; else goto _L8
_L8:
        obj = null;
          goto _L6
    }

    private Intent a(String s1, Uri uri, String s2, String s3, int i1, String s4)
    {
        s1 = new Intent(s1);
        s1.addFlags(0x10000000);
        if (uri != null)
        {
            s1.setData(uri);
        }
        s1.putExtra("user_query", B);
        if (s3 != null)
        {
            s1.putExtra("query", s3);
        }
        if (s2 != null)
        {
            s1.putExtra("intent_extra_data_key", s2);
        }
        if (F != null)
        {
            s1.putExtra("app_data", F);
        }
        if (i1 != 0)
        {
            s1.putExtra("action_key", i1);
            s1.putExtra("action_msg", s4);
        }
        s1.setComponent(E.getSearchActivity());
        return s1;
    }

    private void a(int i1, String s1, String s2)
    {
        s1 = a("android.intent.action.SEARCH", null, null, s2, i1, s1);
        getContext().startActivity(s1);
    }

    private void a(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        try
        {
            getContext().startActivity(intent);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("SearchView", (new StringBuilder()).append("Failed launch activity: ").append(intent).toString(), runtimeexception);
        }
    }

    static void a(SearchView searchview)
    {
        searchview.l();
    }

    static void a(SearchView searchview, int i1, String s1, String s2)
    {
        searchview.a(i1, s1, s2);
    }

    static void a(SearchView searchview, CharSequence charsequence)
    {
        searchview.c(charsequence);
    }

    static void a(SearchView searchview, boolean flag)
    {
        searchview.setImeVisibility(flag);
    }

    private void a(boolean flag)
    {
        boolean flag2 = true;
        byte byte0 = 8;
        i = flag;
        Object obj;
        int i1;
        boolean flag1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        if (!TextUtils.isEmpty(r.getText()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k.setVisibility(i1);
        b(flag1);
        obj = p;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        obj = t;
        if (h)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        ((ImageView) (obj)).setVisibility(i1);
        j();
        if (!flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        c(flag);
        i();
    }

    private boolean a(int i1)
    {
        if (f == null || !f.a(i1))
        {
            b(i1);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean a(int i1, int j1, String s1)
    {
        boolean flag = false;
        if (f == null || !f.b(i1))
        {
            b(i1, 0, null);
            setImeVisibility(false);
            p();
            flag = true;
        }
        return flag;
    }

    static boolean a(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    static boolean a(SearchView searchview, int i1)
    {
        return searchview.a(i1);
    }

    static boolean a(SearchView searchview, int i1, int j1, String s1)
    {
        return searchview.a(i1, j1, s1);
    }

    static boolean a(SearchView searchview, View view, int i1, KeyEvent keyevent)
    {
        return searchview.a(view, i1, keyevent);
    }

    private boolean a(View view, int i1, KeyEvent keyevent)
    {
        if (E != null && j != null && keyevent.getAction() == 0 && android.support.v4.view.g.a(keyevent))
        {
            if (i1 == 66 || i1 == 84 || i1 == 61)
            {
                return a(r.getListSelection(), 0, ((String) (null)));
            }
            if (i1 == 21 || i1 == 22)
            {
                if (i1 == 21)
                {
                    i1 = 0;
                } else
                {
                    i1 = r.length();
                }
                r.setSelection(i1);
                r.setListSelection(0);
                r.clearListSelection();
                a.a(r, true);
                return true;
            }
            if (i1 == 19 && r.getListSelection() == 0)
            {
                return false;
            }
        }
        return false;
    }

    private Intent b(Intent intent, SearchableInfo searchableinfo)
    {
        Object obj2 = null;
        ComponentName componentname = searchableinfo.getSearchActivity();
        Object obj = new Intent("android.intent.action.SEARCH");
        ((Intent) (obj)).setComponent(componentname);
        PendingIntent pendingintent = PendingIntent.getActivity(getContext(), 0, ((Intent) (obj)), 0x40000000);
        Bundle bundle = new Bundle();
        if (F != null)
        {
            bundle.putParcelable("app_data", F);
        }
        Intent intent1 = new Intent(intent);
        intent = "free_form";
        int i1 = 1;
        Object obj1 = getResources();
        if (searchableinfo.getVoiceLanguageModeId() != 0)
        {
            intent = ((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageModeId());
        }
        if (searchableinfo.getVoicePromptTextId() != 0)
        {
            obj = ((Resources) (obj1)).getString(searchableinfo.getVoicePromptTextId());
        } else
        {
            obj = null;
        }
        if (searchableinfo.getVoiceLanguageId() != 0)
        {
            obj1 = ((Resources) (obj1)).getString(searchableinfo.getVoiceLanguageId());
        } else
        {
            obj1 = null;
        }
        if (searchableinfo.getVoiceMaxResults() != 0)
        {
            i1 = searchableinfo.getVoiceMaxResults();
        }
        intent1.putExtra("android.speech.extra.LANGUAGE_MODEL", intent);
        intent1.putExtra("android.speech.extra.PROMPT", ((String) (obj)));
        intent1.putExtra("android.speech.extra.LANGUAGE", ((String) (obj1)));
        intent1.putExtra("android.speech.extra.MAX_RESULTS", i1);
        if (componentname == null)
        {
            intent = obj2;
        } else
        {
            intent = componentname.flattenToShortString();
        }
        intent1.putExtra("calling_package", intent);
        intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pendingintent);
        intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent1;
    }

    static android.support.v4.widget.b b(SearchView searchview)
    {
        return searchview.j;
    }

    private CharSequence b(CharSequence charsequence)
    {
        if (!h)
        {
            return charsequence;
        } else
        {
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder("   ");
            spannablestringbuilder.append(charsequence);
            charsequence = getContext().getResources().getDrawable(getSearchIconId());
            int i1 = (int)((double)r.getTextSize() * 1.25D);
            charsequence.setBounds(0, 0, i1, i1);
            spannablestringbuilder.setSpan(new ImageSpan(charsequence), 1, 2, 33);
            return spannablestringbuilder;
        }
    }

    private void b(int i1)
    {
        Editable editable = r.getText();
        Object obj = j.a();
        if (obj == null)
        {
            return;
        }
        if (((Cursor) (obj)).moveToPosition(i1))
        {
            obj = j.c(((Cursor) (obj)));
            if (obj != null)
            {
                setQuery(((CharSequence) (obj)));
                return;
            } else
            {
                setQuery(editable);
                return;
            }
        } else
        {
            setQuery(editable);
            return;
        }
    }

    private void b(boolean flag)
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!u)
            {
                break label0;
            }
            byte0 = byte1;
            if (!h())
            {
                break label0;
            }
            byte0 = byte1;
            if (!hasFocus())
            {
                break label0;
            }
            if (!flag)
            {
                byte0 = byte1;
                if (z)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        l.setVisibility(byte0);
    }

    private boolean b(int i1, int j1, String s1)
    {
        Cursor cursor = j.a();
        if (cursor != null && cursor.moveToPosition(i1))
        {
            a(a(cursor, j1, s1));
            return true;
        } else
        {
            return false;
        }
    }

    static android.view.View.OnFocusChangeListener c(SearchView searchview)
    {
        return searchview.e;
    }

    private void c(CharSequence charsequence)
    {
        boolean flag1 = true;
        Editable editable = r.getText();
        B = editable;
        boolean flag;
        if (!TextUtils.isEmpty(editable))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c(flag);
        j();
        i();
        if (c != null && !TextUtils.equals(charsequence, A))
        {
            c.b(charsequence.toString());
        }
        A = charsequence.toString();
    }

    private void c(boolean flag)
    {
        int i1;
        if (z && !c() && flag)
        {
            i1 = 0;
            l.setVisibility(8);
        } else
        {
            i1 = 8;
        }
        q.setVisibility(i1);
    }

    static void d(SearchView searchview)
    {
        searchview.t();
    }

    static View e(SearchView searchview)
    {
        return searchview.k;
    }

    private void e()
    {
        s.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

            final SearchView a;

            public void onLayoutChange(View view, int i1, int j1, int k1, int l1, int i2, int j2, 
                    int k2, int l2)
            {
                SearchView.d(a);
            }

            
            {
                a = SearchView.this;
                super();
            }
        });
    }

    private void f()
    {
        s.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final SearchView a;

            public void onGlobalLayout()
            {
                SearchView.d(a);
            }

            
            {
                a = SearchView.this;
                super();
            }
        });
    }

    static void f(SearchView searchview)
    {
        searchview.r();
    }

    static ImageView g(SearchView searchview)
    {
        return searchview.o;
    }

    private boolean g()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (E == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!E.getVoiceSearchEnabled()) goto _L2; else goto _L3
_L3:
        Intent intent = null;
        if (!E.getVoiceSearchLaunchWebSearch()) goto _L5; else goto _L4
_L4:
        intent = J;
_L7:
        flag = flag1;
        if (intent != null)
        {
            flag = flag1;
            if (getContext().getPackageManager().resolveActivity(intent, 0x10000) != null)
            {
                flag = true;
            }
        }
_L2:
        return flag;
_L5:
        if (E.getVoiceSearchLaunchRecognizer())
        {
            intent = K;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private int getPreferredWidth()
    {
        return getContext().getResources().getDimensionPixelSize(android.support.v7.a.a.d.abc_search_view_preferred_width);
    }

    private int getSearchIconId()
    {
        TypedValue typedvalue = new TypedValue();
        getContext().getTheme().resolveAttribute(android.support.v7.a.a.b.searchViewSearchIcon, typedvalue, true);
        return typedvalue.resourceId;
    }

    static void h(SearchView searchview)
    {
        searchview.q();
    }

    private boolean h()
    {
        return (u || z) && !c();
    }

    static View i(SearchView searchview)
    {
        return searchview.l;
    }

    private void i()
    {
        byte byte0;
label0:
        {
            byte byte1 = 8;
            byte0 = byte1;
            if (!h())
            {
                break label0;
            }
            if (l.getVisibility() != 0)
            {
                byte0 = byte1;
                if (q.getVisibility() != 0)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        n.setVisibility(byte0);
    }

    private void j()
    {
        boolean flag2 = true;
        boolean flag1 = false;
        ImageView imageview;
        int ai[];
        Drawable drawable;
        boolean flag;
        int i1;
        if (!TextUtils.isEmpty(r.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = ((flag2) ? 1 : 0);
        if (!flag)
        {
            if (h && !C)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
        }
        imageview = o;
        if (i1 != 0)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        imageview.setVisibility(i1);
        drawable = o.getDrawable();
        if (flag)
        {
            ai = ENABLED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable.setState(ai);
    }

    static void j(SearchView searchview)
    {
        searchview.o();
    }

    static View k(SearchView searchview)
    {
        return searchview.q;
    }

    private void k()
    {
        post(H);
    }

    private void l()
    {
        boolean flag = r.hasFocus();
        Drawable drawable = m.getBackground();
        int ai[];
        if (flag)
        {
            ai = FOCUSED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable.setState(ai);
        drawable = n.getBackground();
        if (flag)
        {
            ai = FOCUSED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        drawable.setState(ai);
        invalidate();
    }

    static void l(SearchView searchview)
    {
        searchview.s();
    }

    static SearchAutoComplete m(SearchView searchview)
    {
        return searchview.r;
    }

    private void m()
    {
        if (v != null)
        {
            r.setHint(b(v));
        } else
        if (E != null)
        {
            String s1 = null;
            int i1 = E.getHintId();
            if (i1 != 0)
            {
                s1 = getContext().getString(i1);
            }
            if (s1 != null)
            {
                r.setHint(b(s1));
                return;
            }
        } else
        {
            r.setHint(b(""));
            return;
        }
    }

    private void n()
    {
        boolean flag = true;
        r.setThreshold(E.getSuggestThreshold());
        r.setImeOptions(E.getImeOptions());
        int j1 = E.getInputType();
        int i1 = j1;
        if ((j1 & 0xf) == 1)
        {
            j1 &= 0xfffeffff;
            i1 = j1;
            if (E.getSuggestAuthority() != null)
            {
                i1 = j1 | 0x10000 | 0x80000;
            }
        }
        r.setInputType(i1);
        if (j != null)
        {
            j.a(null);
        }
        if (E.getSuggestAuthority() != null)
        {
            j = new android.support.v7.widget.a(getContext(), this, E, L);
            r.setAdapter(j);
            android.support.v7.widget.a a1 = (android.support.v7.widget.a)j;
            byte byte0 = flag;
            if (w)
            {
                byte0 = 2;
            }
            a1.a(byte0);
        }
    }

    static void n(SearchView searchview)
    {
        searchview.u();
    }

    static SearchableInfo o(SearchView searchview)
    {
        return searchview.E;
    }

    private void o()
    {
        Editable editable = r.getText();
        if (editable != null && TextUtils.getTrimmedLength(editable) > 0 && (c == null || !c.a(editable.toString())))
        {
            if (E != null)
            {
                a(0, ((String) (null)), editable.toString());
                setImeVisibility(false);
            }
            p();
        }
    }

    private void p()
    {
        r.dismissDropDown();
    }

    private void q()
    {
        if (TextUtils.isEmpty(r.getText()))
        {
            if (h && (d == null || !d.a()))
            {
                clearFocus();
                a(true);
            }
            return;
        } else
        {
            r.setText("");
            r.requestFocus();
            setImeVisibility(true);
            return;
        }
    }

    private void r()
    {
        a(false);
        r.requestFocus();
        setImeVisibility(true);
        if (g != null)
        {
            g.onClick(this);
        }
    }

    private void s()
    {
        if (E != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        obj = E;
        try
        {
            if (((SearchableInfo) (obj)).getVoiceSearchLaunchWebSearch())
            {
                obj = a(J, ((SearchableInfo) (obj)));
                getContext().startActivity(((Intent) (obj)));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("SearchView", "Could not find voice search activity");
            return;
        }
        if (!((SearchableInfo) (obj)).getVoiceSearchLaunchRecognizer()) goto _L1; else goto _L3
_L3:
        obj = b(K, ((SearchableInfo) (obj)));
        getContext().startActivity(((Intent) (obj)));
        return;
    }

    private void setImeVisibility(boolean flag)
    {
        if (flag)
        {
            post(G);
        } else
        {
            removeCallbacks(G);
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
    }

    private void setQuery(CharSequence charsequence)
    {
        r.setText(charsequence);
        SearchAutoComplete searchautocomplete = r;
        int i1;
        if (TextUtils.isEmpty(charsequence))
        {
            i1 = 0;
        } else
        {
            i1 = charsequence.length();
        }
        searchautocomplete.setSelection(i1);
    }

    private void t()
    {
        if (s.getWidth() > 1)
        {
            Resources resources = getContext().getResources();
            int j1 = m.getPaddingLeft();
            Rect rect = new Rect();
            int i1;
            int k1;
            int l1;
            int i2;
            if (h)
            {
                i1 = resources.getDimensionPixelSize(android.support.v7.a.a.d.abc_dropdownitem_icon_width);
                i1 = resources.getDimensionPixelSize(android.support.v7.a.a.d.abc_dropdownitem_text_padding_left) + i1;
            } else
            {
                i1 = 0;
            }
            r.getDropDownBackground().getPadding(rect);
            k1 = rect.left;
            r.setDropDownHorizontalOffset(j1 - (k1 + i1));
            k1 = s.getWidth();
            l1 = rect.left;
            i2 = rect.right;
            r.setDropDownWidth((i1 + (i2 + (k1 + l1))) - j1);
        }
    }

    private void u()
    {
        a.a(r);
        a.b(r);
    }

    public void a()
    {
        if (C)
        {
            return;
        } else
        {
            C = true;
            D = r.getImeOptions();
            r.setImeOptions(D | 0x2000000);
            r.setText("");
            setIconified(false);
            return;
        }
    }

    void a(CharSequence charsequence)
    {
        setQuery(charsequence);
    }

    public void b()
    {
        clearFocus();
        a(true);
        r.setImeOptions(D);
        C = false;
    }

    public boolean c()
    {
        return i;
    }

    public void clearFocus()
    {
        x = true;
        setImeVisibility(false);
        super.clearFocus();
        r.clearFocus();
        x = false;
    }

    void d()
    {
        a(c());
        k();
        if (r.hasFocus())
        {
            u();
        }
    }

    public int getImeOptions()
    {
        return r.getImeOptions();
    }

    public int getInputType()
    {
        return r.getInputType();
    }

    public int getMaxWidth()
    {
        return y;
    }

    public CharSequence getQuery()
    {
        return r.getText();
    }

    public CharSequence getQueryHint()
    {
        Object obj = null;
        CharSequence charsequence;
        if (v != null)
        {
            charsequence = v;
        } else
        {
            charsequence = obj;
            if (E != null)
            {
                int i1 = E.getHintId();
                charsequence = obj;
                if (i1 != 0)
                {
                    return getContext().getString(i1);
                }
            }
        }
        return charsequence;
    }

    public android.support.v4.widget.b getSuggestionsAdapter()
    {
        return j;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(H);
        post(I);
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (E == null)
        {
            return false;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        if (c())
        {
            super.onMeasure(i1, j1);
            return;
        }
        l1 = android.view.View.MeasureSpec.getMode(i1);
        k1 = android.view.View.MeasureSpec.getSize(i1);
        l1;
        JVM INSTR lookupswitch 3: default 60
    //                   -2147483648: 75
    //                   0: 127
    //                   1073741824: 106;
           goto _L1 _L2 _L3 _L4
_L1:
        i1 = k1;
_L6:
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), j1);
        return;
_L2:
        if (y > 0)
        {
            i1 = Math.min(y, k1);
        } else
        {
            i1 = Math.min(getPreferredWidth(), k1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = k1;
        if (y > 0)
        {
            i1 = Math.min(y, k1);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (y > 0)
        {
            i1 = y;
        } else
        {
            i1 = getPreferredWidth();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        k();
    }

    public boolean requestFocus(int i1, Rect rect)
    {
        while (x || !isFocusable()) 
        {
            return false;
        }
        if (!c())
        {
            boolean flag = r.requestFocus(i1, rect);
            if (flag)
            {
                a(false);
            }
            return flag;
        } else
        {
            return super.requestFocus(i1, rect);
        }
    }

    public void setAppSearchData(Bundle bundle)
    {
        F = bundle;
    }

    public void setIconified(boolean flag)
    {
        if (flag)
        {
            q();
            return;
        } else
        {
            r();
            return;
        }
    }

    public void setIconifiedByDefault(boolean flag)
    {
        if (h == flag)
        {
            return;
        } else
        {
            h = flag;
            a(flag);
            m();
            return;
        }
    }

    public void setImeOptions(int i1)
    {
        r.setImeOptions(i1);
    }

    public void setInputType(int i1)
    {
        r.setInputType(i1);
    }

    public void setMaxWidth(int i1)
    {
        y = i1;
        requestLayout();
    }

    public void setOnCloseListener(b b1)
    {
        d = b1;
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        e = onfocuschangelistener;
    }

    public void setOnQueryTextListener(c c1)
    {
        c = c1;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
    {
        g = onclicklistener;
    }

    public void setOnSuggestionListener(d d1)
    {
        f = d1;
    }

    public void setQueryHint(CharSequence charsequence)
    {
        v = charsequence;
        m();
    }

    public void setQueryRefinementEnabled(boolean flag)
    {
        w = flag;
        if (j instanceof android.support.v7.widget.a)
        {
            android.support.v7.widget.a a1 = (android.support.v7.widget.a)j;
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            a1.a(byte0);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableinfo)
    {
        E = searchableinfo;
        if (E != null)
        {
            n();
            m();
        }
        z = g();
        if (z)
        {
            r.setPrivateImeOptions("nm");
        }
        a(c());
    }

    public void setSubmitButtonEnabled(boolean flag)
    {
        u = flag;
        a(c());
    }

    public void setSuggestionsAdapter(android.support.v4.widget.b b1)
    {
        j = b1;
        r.setAdapter(j);
    }

}
