// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import java.util.LinkedHashMap;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChangeChargeAccountLabelListItemView

public class ChangeChargeAccountLabelView extends LinearLayout
    implements IHandleBack
{

    AppFlow appFlow;
    MessageBus bus;
    private ChangeChargeAccountLabelListItemView changeChargeAccountLabelListItemView;
    DialogFlow dialogFlow;
    private boolean goBack;
    LinearLayout labelList;
    private LinkedHashMap labelsMap;
    private final Action1 onToolbarHomeClicked = new Action1() {

        final ChangeChargeAccountLabelView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            goBack = false;
            setResultAndGoBack(screenParams.getCardLabelType(), screenParams.getCardLabel(), goBack);
        }

            
            {
                this$0 = ChangeChargeAccountLabelView.this;
                super();
            }
    };
    private android.view.View.OnTouchListener onTouchListener;
    private String previousLabel;
    private final PaymentScreens.ChangeCreditCardLabelScreen screenParams;
    Toolbar toolbar;

    public ChangeChargeAccountLabelView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        goBack = true;
        onTouchListener = new android.view.View.OnTouchListener() {

            final ChangeChargeAccountLabelView this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                motionevent.getAction();
                JVM INSTR tableswitch 0 1: default 28
            //                           0 30
            //                           1 41;
                   goto _L1 _L2 _L3
_L1:
                return false;
_L2:
                updateCheckboxes(view);
                continue; /* Loop/switch isn't completed */
_L3:
                updatePreviousLabelAndGoToNextScreen(view);
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                this$0 = ChangeChargeAccountLabelView.this;
                super();
            }
        };
        context = Scoop.a(this);
        context.b(this);
        labelsMap = new LinkedHashMap();
        labelsMap.put("personal", getResources().getString(0x7f07028a));
        labelsMap.put("business", getResources().getString(0x7f070083));
        screenParams = (PaymentScreens.ChangeCreditCardLabelScreen)context.a();
    }

    private void addLabelList(String s, String s1)
    {
        labelsMap.put(s1, s);
        changeChargeAccountLabelListItemView = (new ChangeChargeAccountLabelListItemView(getContext())).setLabelText(s1);
        changeChargeAccountLabelListItemView.setOnTouchListener(onTouchListener);
        setCheckbox(s);
        labelList.addView(changeChargeAccountLabelListItemView);
    }

    private void loadLabelListItems()
    {
        labelsMap = new LinkedHashMap();
        labelList.removeAllViews();
        addLabelList("personal", getResources().getString(0x7f07028a));
        addLabelList("business", getResources().getString(0x7f070083));
        addLabelList("custom", getResources().getString(0x7f070256));
    }

    private void setCheckbox(String s)
    {
        if (s.equalsIgnoreCase(screenParams.getCardLabelType()))
        {
            previousLabel = screenParams.getCardLabel();
            changeChargeAccountLabelListItemView.setChecked(Boolean.valueOf(true));
            if ("custom".equalsIgnoreCase(screenParams.getCardLabelType()))
            {
                changeChargeAccountLabelListItemView.setCustomLabelText(screenParams.getCardLabel());
            }
        }
    }

    private void setResultAndGoBack(String s, String s1, boolean flag)
    {
        s = new ResponseData(s, s1);
        bus.post(me/lyft/android/ui/payment/ChangeChargeAccountLabelView$ResponseEvent, s);
        if (flag)
        {
            appFlow.goBack();
        }
    }

    private void updateCheckboxes(View view)
    {
        for (int i = 0; i < labelList.getChildCount(); i++)
        {
            ((ImageView)((ViewGroup)labelList.getChildAt(i)).findViewById(0x7f0d0326)).setImageDrawable(getResources().getDrawable(0x7f020018));
        }

        ((ImageView)view.findViewById(0x7f0d0326)).setImageDrawable(getResources().getDrawable(0x7f020019));
    }

    private void updatePreviousLabelAndGoToNextScreen(View view)
    {
        String s = ((TextView)view.findViewById(0x7f0d0324)).getText().toString();
        if ("custom".equalsIgnoreCase(screenParams.getCardLabelType()))
        {
            view = screenParams.getCardLabel();
        } else
        {
            view = "";
        }
        previousLabel = s;
        if ("custom".equalsIgnoreCase((String)labelsMap.get(s)))
        {
            dialogFlow.show(new PaymentDialogs.ChargeAccountCustomLabelDialog("custom", view));
            return;
        } else
        {
            setResultAndGoBack((String)labelsMap.get(s), s, goBack);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Binder.attach(this).bind(toolbar.observeHomeClick(), onToolbarHomeClicked);
        loadLabelListItems();
    }

    public boolean onBack()
    {
        setResultAndGoBack(screenParams.getCardLabelType(), screenParams.getCardLabel(), goBack);
        return true;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.showTitle().setTitle(getContext().getString(0x7f07024a));
    }



/*
    static boolean access$002(ChangeChargeAccountLabelView changechargeaccountlabelview, boolean flag)
    {
        changechargeaccountlabelview.goBack = flag;
        return flag;
    }

*/





    private class ResponseData extends Consumable
    {

        public final String label;
        public final String labelType;

        public ResponseData(String s, String s1)
        {
            labelType = s;
            label = s1;
        }
    }

}
