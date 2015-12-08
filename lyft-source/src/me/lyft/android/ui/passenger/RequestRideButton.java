// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import rx.Observable;
import rx.subjects.PublishSubject;

public class RequestRideButton extends Button
{

    private static final int STATE_REQUEST_RIDE = 0;
    private static final int STATE_SET_DESTINATION = 2;
    private static final int STATE_SET_PICKUP = 1;
    private Drawable drawable;
    private final PublishSubject requestRideClicked;
    private String requestRideText;
    private final PublishSubject setDropoffClicked;
    private final PublishSubject setPickupClicked;
    private int state;

    public RequestRideButton(Context context)
    {
        super(context);
        requestRideClicked = PublishSubject.create();
        setPickupClicked = PublishSubject.create();
        setDropoffClicked = PublishSubject.create();
        state = 0;
    }

    public RequestRideButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        requestRideClicked = PublishSubject.create();
        setPickupClicked = PublishSubject.create();
        setDropoffClicked = PublishSubject.create();
        state = 0;
    }

    public RequestRideButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        requestRideClicked = PublishSubject.create();
        setPickupClicked = PublishSubject.create();
        setDropoffClicked = PublishSubject.create();
        state = 0;
    }

    private boolean isRequestRide()
    {
        return state == 0;
    }

    private boolean isSetDestination()
    {
        return state == 2;
    }

    private boolean isSetPickup()
    {
        return state == 1;
    }

    private void setState(int i)
    {
        state = i;
        updateButtonForState();
    }

    public Observable observeRequestRideClick()
    {
        return requestRideClicked.asObservable();
    }

    public Observable observeSetDropoffClick()
    {
        return setDropoffClicked.asObservable();
    }

    public Observable observeSetPickupClick()
    {
        return setPickupClicked.asObservable();
    }

    public boolean performClick()
    {
        super.performClick();
        if (!isRequestRide()) goto _L2; else goto _L1
_L1:
        requestRideClicked.onNext(this);
_L4:
        return true;
_L2:
        if (isSetPickup())
        {
            setPickupClicked.onNext(this);
        } else
        if (isSetDestination())
        {
            setDropoffClicked.onNext(this);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setButtonDrawable(Drawable drawable1)
    {
        drawable = drawable1;
    }

    public void setRequestRideText(String s)
    {
        requestRideText = s;
        if (isRequestRide())
        {
            setText(s);
        }
    }

    public void switchToRequestRide()
    {
        setState(0);
    }

    public void switchToSetDestination()
    {
        setState(2);
    }

    public void switchToSetPickup()
    {
        setState(1);
    }

    public void updateButtonForState()
    {
        if (isRequestRide())
        {
            setText(requestRideText);
            setBackgroundDrawable(drawable);
        } else
        {
            if (isSetPickup())
            {
                setText(0x7f070328);
                setBackgroundResource(0x7f020050);
                return;
            }
            if (isSetDestination())
            {
                setText(0x7f070327);
                setBackgroundResource(0x7f020057);
                return;
            }
        }
    }
}
