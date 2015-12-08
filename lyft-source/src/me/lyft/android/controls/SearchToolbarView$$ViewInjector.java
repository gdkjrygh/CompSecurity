// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.controls:
//            SearchToolbarView

public class _cls2.val.target
    implements butterknife.ViewInjector
{

    public volatile void inject(butterknife.ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (SearchToolbarView)obj, obj1);
    }

    public void inject(butterknife.ViewInjector viewinjector, final SearchToolbarView target, Object obj)
    {
        View view = (View)viewinjector.ViewInjector(obj, 0x7f0d034e, "field 'clearButton' and method 'onClearClicked'");
        target.clearButton = (ImageView)viewinjector.learButton(view, 0x7f0d034e, "field 'clearButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final SearchToolbarView..ViewInjector this$0;
            final SearchToolbarView val$target;

            public void doClick(View view1)
            {
                target.onClearClicked();
            }

            
            {
                this$0 = SearchToolbarView..ViewInjector.this;
                target = searchtoolbarview;
                super();
            }
        });
        target.editText = (EditText)viewinjector.ditText((View)viewinjector.ditText(obj, 0x7f0d040a, "field 'editText'"), 0x7f0d040a, "field 'editText'");
        ((View)viewinjector.ditText(obj, 0x7f0d0406, "method 'onHomeClicked'")).setOnClickListener(new DebouncingOnClickListener() {

            final SearchToolbarView..ViewInjector this$0;
            final SearchToolbarView val$target;

            public void doClick(View view1)
            {
                target.onHomeClicked();
            }

            
            {
                this$0 = SearchToolbarView..ViewInjector.this;
                target = searchtoolbarview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((SearchToolbarView)obj);
    }

    public void reset(SearchToolbarView searchtoolbarview)
    {
        searchtoolbarview.clearButton = null;
        searchtoolbarview.editText = null;
    }

    public _cls2.val.target()
    {
    }
}
