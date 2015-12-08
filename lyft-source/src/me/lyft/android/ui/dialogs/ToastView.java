// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.concurrent.TimeUnit;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.Binder;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            Toast

public class ToastView extends FrameLayout
{

    public static final int TOAST_TIMEOUT = 2000;
    private Binder binder;
    DialogFlow dialogFlow;
    ImageView iconImageView;
    private final Toast params;
    TextView titleTextView;

    public ToastView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (Toast)context.a();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (params.getIcon() != null)
        {
            iconImageView.setVisibility(0);
            iconImageView.setImageResource(params.getIcon().intValue());
        } else
        {
            iconImageView.setVisibility(8);
        }
        titleTextView.setText(params.getMessage());
        binder = Binder.attach(this);
        binder.bind(Observable.timer(2000L, TimeUnit.MILLISECONDS), new Action1() {

            final ToastView this$0;

            public void call(Long long1)
            {
                dialogFlow.dismiss(me/lyft/android/ui/dialogs/Toast);
            }

            public volatile void call(Object obj)
            {
                call((Long)obj);
            }

            
            {
                this$0 = ToastView.this;
                super();
            }
        });
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }
}
