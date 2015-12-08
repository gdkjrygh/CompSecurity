// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import AO;
import Bk;
import EC;
import EN;
import EO;
import Ew;
import Ex;
import FY;
import Hb;
import Og;
import PI;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.ui.snapview.SnapViewSessionStopReason;
import com.snapchat.android.util.AlertDialogUtils;
import com.squareup.otto.Bus;
import hr;

// Referenced classes of package com.snapchat.android.stories.ui:
//            StorySnapView, StorySnapViewGroup

public class ExplorerStorySnapView extends StorySnapView
{

    private final Ew k;
    private AlertDialog l;

    public ExplorerStorySnapView(Context context, StorySnapViewGroup storysnapviewgroup)
    {
        this(context, storysnapviewgroup, Ew.a());
    }

    private ExplorerStorySnapView(Context context, StorySnapViewGroup storysnapviewgroup, Ew ew)
    {
        super(context, storysnapviewgroup);
        l = null;
        k = ew;
    }

    static void a(ExplorerStorySnapView explorerstorysnapview, int i)
    {
        EO eo = ((StorySnapView) (explorerstorysnapview)).g;
        if (eo != null && eo.h() != null)
        {
            eo.h().d();
            Integer.toString(i);
            (new EC()).execute();
        }
        explorerstorysnapview.h();
        ((StorySnapView) (explorerstorysnapview)).g.f();
        explorerstorysnapview.f.a(new Og(false));
    }

    protected final EO a()
    {
        return new EN(d, a, b, e, c);
    }

    public final void a(AO ao)
    {
        if (i.c())
        {
            if (j != null)
            {
                j.b();
            }
            i.a(8);
        }
    }

    public final void a(Hb hb)
    {
        if (hb instanceof Bk)
        {
            Object obj = (Bk)hb;
            if (((Bk) (obj)).aM() != null)
            {
                obj = ((Bk) (obj)).aM();
            } else
            {
                obj = "-";
            }
            Timber.c("ExplorerStorySnapView", "Parent snap id for displayed snap is: %s", new Object[] {
                obj
            });
        }
        super.a(hb);
    }

    public final void a(Hb hb, AO ao)
    {
    }

    public final void a(Hb hb, SnapViewSessionStopReason snapviewsessionstopreason, int i)
    {
        super.a(hb, snapviewsessionstopreason, i);
        if (l != null && l.isShowing())
        {
            l.cancel();
        }
    }

    protected final void b()
    {
    }

    public final void c()
    {
        super.g.c(true);
        int i = getContext().getResources().getStringArray(0x7f09001d).length;
        Object obj = new android.content.DialogInterface.OnCancelListener() {

            private ExplorerStorySnapView a;

            public final void onCancel(DialogInterface dialoginterface)
            {
                a.h();
                ((StorySnapView) (a)).g.c(false);
                a.f.a(new Og(false));
            }

            
            {
                a = ExplorerStorySnapView.this;
                super();
            }
        };
        android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener(i, ((android.content.DialogInterface.OnCancelListener) (obj))) {

            final ExplorerStorySnapView a;
            private int b;
            private android.content.DialogInterface.OnCancelListener c;

            public final void onClick(DialogInterface dialoginterface, int j)
            {
                if (j == b - 1)
                {
                    (new FY(this, a.getContext(), c, j) {

                        private int a;
                        private _cls2 b;

                        protected final void a(String s)
                        {
                            Timber.c("ExplorerStorySnapView", "report snap: %s", new Object[] {
                                s
                            });
                            ExplorerStorySnapView.a(b.a, a);
                        }

            
            {
                b = _pcls2;
                a = i;
                super(context, oncancellistener);
            }
                    }).show();
                    return;
                } else
                {
                    ExplorerStorySnapView.a(a, j);
                    return;
                }
            }

            
            {
                a = ExplorerStorySnapView.this;
                b = i;
                c = oncancellistener;
                super();
            }
        };
        if (l == null)
        {
            l = AlertDialogUtils.a(getContext(), ((android.content.DialogInterface.OnCancelListener) (obj)), onclicklistener);
        } else
        {
            l.show();
        }
        obj = super.g.h();
        if (obj != null)
        {
            Ew ew = k;
            hr hr1 = new hr();
            hr1.storySnapId = ((Bk) (obj)).d();
            String s = ((Bk) (obj)).aN();
            if (s != null)
            {
                hr1.storyRootSnapId = s;
            }
            hr1.level = Long.valueOf(((Bk) (obj)).aO());
            ew.a.a(hr1);
        }
    }
}
