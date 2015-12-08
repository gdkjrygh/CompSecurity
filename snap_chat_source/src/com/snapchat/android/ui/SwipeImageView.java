// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Gs;
import Ho;
import Hu;
import Hv;
import Hz;
import IO;
import Ic;
import Ir;
import Jo;
import Mf;
import OP;
import PG;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.snapchat.android.Timber;
import com.snapchat.android.ui.layertype.LayerType;
import com.snapchat.android.ui.swipefilters.FilterPageType;
import com.snapchat.android.util.SnapMediaUtils;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.snapchat.android.ui:
//            SwipeViewState

public class SwipeImageView extends FrameLayout
{
    public static interface a
    {

        public abstract void h();
    }


    final Hu a;
    public Hz b;
    public SwipeViewState c;
    Bitmap d;
    boolean e;
    public FrameLayout f;
    public boolean g;
    private final Ir h;
    private int i;
    private int j;
    private a k;

    public SwipeImageView(Context context)
    {
        this(context, null);
    }

    public SwipeImageView(Context context, AttributeSet attributeset)
    {
        LayerType layertype;
        if (Ic.a())
        {
            layertype = LayerType.SOFTWARE;
        } else
        {
            layertype = LayerType.HARDWARE;
        }
        this(context, attributeset, layertype, new Hu(), new Hv(), ((Ir) (new OP())));
    }

    public SwipeImageView(Context context, AttributeSet attributeset, LayerType layertype, Hu hu, Hv hv, Ir ir)
    {
        super(context, attributeset);
        e = false;
        g = false;
        i = 0;
        j = 0;
        a = hu;
        h = ir;
        setWillNotDraw(false);
        setLayerType(layertype.getFrameworkLayerValue(), null);
    }

    private static void a(Ho ho, int l)
    {
        if (ho != null)
        {
            ho.a(l);
        }
    }

    static boolean a(SwipeImageView swipeimageview)
    {
        return swipeimageview.g;
    }

    static Bitmap b(SwipeImageView swipeimageview)
    {
        return swipeimageview.d;
    }

    final Paint a(Bitmap bitmap)
    {
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
        bitmap = SnapMediaUtils.a(bitmap, getContext());
        paint.getShader().setLocalMatrix(bitmap);
        return paint;
    }

    public final FilterPageType a(int l)
    {
        PG.a();
        if (b.b() == 0)
        {
            return null;
        } else
        {
            return b.b(l);
        }
    }

    public final void a()
    {
        PG.a();
        if (d == null)
        {
            Timber.d("SwipeImageView", "setBaseImage() has not been called; aborting.", new Object[0]);
            return;
        }
        Object obj = a(d);
        for (Iterator iterator = b.a().iterator(); iterator.hasNext(); ((Ho)iterator.next()).a(((Paint) (obj)))) { }
        obj = c();
        if (obj != null)
        {
            boolean flag;
            if (!g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((Ho) (obj)).a(flag, d);
        }
        invalidate();
        (new AsyncTask(new ArrayList(b.a())) {

            private List a;
            private SwipeImageView b;

            protected final Object doInBackground(Object aobj[])
            {
                aobj = a.iterator();
                while (((Iterator) (aobj)).hasNext()) 
                {
                    Ho ho = (Ho)((Iterator) (aobj)).next();
                    boolean flag1;
                    if (!SwipeImageView.a(b))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    ho.a(flag1, SwipeImageView.b(b));
                    b.postInvalidate();
                }
                return null;
            }

            
            {
                b = SwipeImageView.this;
                a = list;
                super();
            }
        }).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new Void[0]);
    }

    public final void a(Ho ho)
    {
        ho = ho.d();
        if (ho != null)
        {
            f.addView(ho);
        }
    }

    public void addView(View view)
    {
        super.addView(view);
        f.bringToFront();
    }

    public final float b()
    {
        return (float)(c.e % getWidth()) / (float)getWidth();
    }

    public final Ho c()
    {
        if (b.b() == 0)
        {
            return null;
        } else
        {
            return b.a(c.a);
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Mf.a().c(this);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Mf.a().b(this);
    }

    public void onDraw(Canvas canvas)
    {
        if (e || d == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        LayerType layertype;
        Object obj2;
        obj = a;
        obj1 = c;
        obj2 = b;
        layertype = Gs.a(getLayerType());
        if (((Hz) (obj2)).b() != 0) goto _L4; else goto _L3
_L3:
        canvas.drawRect(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight(), ((Hu) (obj)).a);
_L2:
        canvas = b.a().iterator();
        do
        {
            if (!canvas.hasNext())
            {
                break;
            }
            obj = (Ho)canvas.next();
            if (obj != b.a(c.a) && obj != b.a(c.b) && obj != b.a(c.d) && obj != b.a(c.c))
            {
                obj = ((Ho) (obj)).d();
                if (obj != null)
                {
                    ((View) (obj)).setVisibility(4);
                }
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L4:
        int l = Hu.a(((Hz) (obj2)), ((SwipeViewState) (obj1)).a(true), ((SwipeViewState) (obj1)).a(false));
        int k1 = Hu.a(((Hz) (obj2)), ((SwipeViewState) (obj1)).b(true), ((SwipeViewState) (obj1)).b(false));
        Paint paint = ((Hu) (obj)).a(((Hz) (obj2)).a(l));
        obj2 = ((Hu) (obj)).a(((Hz) (obj2)).a(k1));
        float f1 = ((SwipeViewState) (obj1)).e();
        if (paint == ((Hu) (obj)).a && obj2 == ((Hu) (obj)).a)
        {
            canvas.drawRect(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight(), ((Hu) (obj)).a);
        } else
        {
            paint.setAlpha(255);
            ((Paint) (obj2)).setAlpha(255);
            int j1 = Math.round(f1);
            canvas.drawRect(0.0F, 0.0F, j1, canvas.getHeight(), paint);
            canvas.drawRect(j1, 0.0F, canvas.getWidth(), canvas.getHeight(), ((Paint) (obj2)));
        }
        if (((SwipeViewState) (obj1)).c() && layertype == LayerType.HARDWARE)
        {
            f1 = ((SwipeViewState) (obj1)).e();
            float f2 = Math.max(((SwipeViewState) (obj1)).f, ((SwipeViewState) (obj1)).e);
            for (int i1 = (int)f1; (float)i1 < f2; i1++)
            {
                paint.setAlpha((int)(255F * (1.0F - ((float)i1 - f1) / (f2 - f1))));
                canvas.drawLine(i1, 0.0F, i1, canvas.getHeight(), paint);
            }

            paint.setAlpha(255);
        }
        if (true) goto _L2; else goto _L5
_L5:
        canvas = c;
        obj = b;
        obj1 = getContext();
        if (((Hz) (obj)).b() == 0) goto _L7; else goto _L6
_L6:
        int l1;
        int i2;
        l1 = Jo.a(((Context) (obj1)));
        i2 = Jo.i(((Context) (obj1)));
        if (!canvas.c()) goto _L9; else goto _L8
_L8:
        boolean flag;
        if (((SwipeViewState) (canvas)).c != ((SwipeViewState) (canvas)).d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Hv.a(((Hz) (obj)), l1, i2, ((SwipeViewState) (canvas)).e, canvas.a(true), canvas.b(true));
        }
        if (((SwipeViewState) (canvas)).a != ((SwipeViewState) (canvas)).b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Hv.a(((Hz) (obj)), l1, i2, ((SwipeViewState) (canvas)).e, canvas.a(false), canvas.b(false));
        }
_L7:
        h.a();
        return;
_L9:
        Hv.a(((Hz) (obj)), l1, i2, ((SwipeViewState) (canvas)).a);
        if (((SwipeViewState) (canvas)).l)
        {
            Hv.a(((Hz) (obj)), l1, i2, ((SwipeViewState) (canvas)).c);
        }
        if (true) goto _L7; else goto _L10
_L10:
    }

    public void onMeasure(int l, int i1)
    {
        super.onMeasure(l, i1);
        boolean flag;
        if (l > i1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d != null)
        {
            boolean flag1;
            boolean flag2;
            if (d.getWidth() > d.getHeight())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag != flag1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            e = flag2;
            if (e)
            {
                if (i != l || j != i1)
                {
                    i = l;
                    j = i1;
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    Timber.c("SwipeImageView", "The orientation of the current bitmap does not match the one of the canvas. (%d, %d)", new Object[] {
                        Integer.valueOf(l), Integer.valueOf(i1)
                    });
                    if (k != null)
                    {
                        k.h();
                    } else
                    {
                        Timber.e("SwipeImageView", "Cannot handle the orientation change because mSnapPreviewRotationListener is null", new Object[0]);
                    }
                }
            }
        } else
        {
            e = false;
        }
        setMeasuredDimension(l, i1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Ho ho = c();
        if (ho == null)
        {
            return false;
        } else
        {
            ho.d().dispatchTouchEvent(motionevent);
            return true;
        }
    }

    public void setFilterPageProvider(Hz hz)
    {
        b = hz;
    }

    public void setSnapPreviewRotationListener(a a1)
    {
        k = a1;
    }

    public void setSwipeState(SwipeViewState swipeviewstate)
    {
        c = swipeviewstate;
    }

    public void setVisibilityOfPreviewOnlyContent(int l)
    {
        a(c(), l);
        Ho ho;
        if (b.b() == 0 || !c.l)
        {
            ho = null;
        } else
        {
            ho = b.a(c.c);
        }
        a(ho, l);
    }
}
