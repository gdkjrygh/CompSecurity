// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.events.OverrideNavigationEvent;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.grid.dialog.PinHashtagListDialog;
import com.pinterest.ui.grid.pin.PinCinematicDrawable;
import com.pinterest.ui.grid.pin.PinIconTextDrawable;
import com.pinterest.ui.grid.pin.PinImageDrawable;
import com.pinterest.ui.grid.pin.PinInfoDrawable;
import com.pinterest.ui.menu.ShowPinContextMenuEvent;
import com.pinterest.ui.text.HashTagUtils;
import java.util.ArrayList;
import org.apache.commons.lang3.BooleanUtils;

// Referenced classes of package com.pinterest.ui.grid:
//            PinGridCell, PinterestAdapterView

class isDown extends com.pinterest.ui.etector.SimpleOnGestureListener
{

    public boolean isDown;
    public final int minTouch = ViewConfiguration.getPressedStateDuration();
    final PinGridCell this$0;
    public final int touchDelay = ViewConfiguration.getTapTimeout();

    public boolean onDown(MotionEvent motionevent)
    {
        resolveTouch(motionevent, true, false);
        return true;
    }

    public void onLongPress(MotionEvent motionevent)
    {
        resolveTouch(null, false, true);
        while (PinGridCell.access$400(PinGridCell.this) || !PinGridCell.access$500(PinGridCell.this).getBounds().contains((int)motionevent.getX(), (int)motionevent.getY())) 
        {
            return;
        }
        if (PinGridCell.access$600(PinGridCell.this))
        {
            motionevent = ComponentType.RELATED_PIN;
        } else
        {
            motionevent = ComponentType.FLOWED_PIN;
        }
        Pinalytics.a(EventType.LONG_PRESS, ElementType.PIN_SOURCE_IMAGE, motionevent, PinGridCell.access$700(PinGridCell.this).getUid(), PinGridCell.access$700(PinGridCell.this).getLoggingAuxData(PinGridCell.access$800(PinGridCell.this)), null);
        Events.post(new ShowPinContextMenuEvent(PinGridCell.access$700(PinGridCell.this)));
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        resolveTouch(null, false, true);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        int i = (int)(motionevent.getDownTime() - motionevent.getEventTime());
        class _cls1
            implements Runnable
        {

            final PinGridCell._cls2 this$1;

            public void run()
            {
                PinGridCell.access$900(this$0);
            }

            _cls1()
            {
                this$1 = PinGridCell._cls2.this;
                super();
            }
        }

        boolean flag;
        if (i < touchDelay)
        {
            i = touchDelay - i;
        } else
        {
            i = minTouch;
        }
        resolveTouch(motionevent, true, true);
        postDelayed(new _cls1(), i);
        if (PinGridCell.access$600(PinGridCell.this))
        {
            motionevent = ComponentType.RELATED_PIN;
        } else
        {
            motionevent = ComponentType.FLOWED_PIN;
        }
        if (PinGridCell.access$500(PinGridCell.this).isPressed() || PinGridCell.access$1000(PinGridCell.this).isPressed())
        {
            Pinalytics.a(ElementType.PIN_SOURCE_IMAGE, motionevent, PinGridCell.access$700(PinGridCell.this).getUid(), PinGridCell.access$700(PinGridCell.this).getLoggingAuxData(PinGridCell.access$800(PinGridCell.this)));
            if (BooleanUtils.isTrue(Boolean.valueOf(PinGridCell.access$1100(PinGridCell.this, PinGridCell.access$700(PinGridCell.this)))) && PinGridCell.access$1200(PinGridCell.this) != null)
            {
                PinGridCell.access$1200(PinGridCell.this).prepareForReuse();
            }
            Object obj;
            String s;
            if (PinGridCell.access$400(PinGridCell.this))
            {
                Events.post(new OverrideNavigationEvent(2, PinGridCell.access$700(PinGridCell.this).getUid()));
            } else
            {
                PinHashtagListDialog pinhashtaglistdialog;
                boolean flag1;
                if (getParent() instanceof PinterestAdapterView)
                {
                    flag1 = PinGridCell.access$1300(PinGridCell.this, PinGridCell.access$700(PinGridCell.this));
                } else
                {
                    flag1 = false;
                }
                if (!flag1)
                {
                    StopWatch.get().start("pin_closeup");
                    Events.post(new Navigation(Location.PIN, PinGridCell.access$700(PinGridCell.this)));
                }
            }
            playSoundEffect(0);
            flag = true;
        } else
        {
            flag = false;
        }
        i = ((flag) ? 1 : 0);
        if (PinGridCell.access$1400(PinGridCell.this))
        {
            i = ((flag) ? 1 : 0);
            if (PinGridCell.access$1500(PinGridCell.this).isPressed())
            {
                i = ((flag) ? 1 : 0);
                if (!flag)
                {
                    if (PinGridCell.access$1600(PinGridCell.this))
                    {
                        Pinalytics.a(ElementType.PIN_INTEREST, motionevent, PinGridCell.access$700(PinGridCell.this).getInterestUid());
                        if (PinGridCell.access$400(PinGridCell.this))
                        {
                            Events.post(new OverrideNavigationEvent(7, PinGridCell.access$700(PinGridCell.this).getInterestUid()));
                        } else
                        {
                            obj = PinGridCell.access$700(PinGridCell.this).getInterest();
                            if (obj != null)
                            {
                                if (((Interest) (obj)).getFollowing() == null)
                                {
                                    ((Interest) (obj)).setFollowing(Boolean.valueOf(true));
                                }
                                StopWatch.get().start("interest_ttrfp");
                                Events.post(new Navigation(Location.INTEREST, ((com.pinterest.api.model.Model) (obj))));
                            }
                        }
                    } else
                    {
                        Pinalytics.a(ElementType.PIN_BOARD, motionevent, PinGridCell.access$700(PinGridCell.this).getBoardUid());
                        if (PinGridCell.access$400(PinGridCell.this))
                        {
                            Events.post(new OverrideNavigationEvent(4, PinGridCell.access$700(PinGridCell.this).getBoardUid()));
                        } else
                        {
                            obj = PinGridCell.access$700(PinGridCell.this).getBoard();
                            if (obj != null)
                            {
                                Events.post(new Navigation(Location.BOARD, ((com.pinterest.api.model.Model) (obj))));
                            }
                        }
                    }
                    playSoundEffect(0);
                    i = 1;
                }
            }
        }
        flag = i;
        if (PinGridCell.access$1700(PinGridCell.this).isPressed())
        {
            flag = i;
            if (i == 0)
            {
                if (PinGridCell.access$700(PinGridCell.this).getIsDynamicallyInserted() && PinGridCell.access$700(PinGridCell.this).getRelatedParentPin() != null)
                {
                    PinGridCell.access$1300(PinGridCell.this, PinGridCell.access$700(PinGridCell.this).getRelatedParentPin());
                }
                obj = PinGridCell.access$700(PinGridCell.this).getBoard();
                flag = i;
                if (obj != null)
                {
                    Pinalytics.a(ElementType.PIN_BOARD, motionevent, ((Board) (obj)).getUid());
                    if (PinGridCell.access$400(PinGridCell.this))
                    {
                        Events.post(new OverrideNavigationEvent(4, PinGridCell.access$700(PinGridCell.this).getBoardUid()));
                    } else
                    {
                        Events.post(new Navigation(Location.BOARD, ((com.pinterest.api.model.Model) (obj))));
                    }
                    playSoundEffect(0);
                    flag = true;
                }
            }
        }
        i = ((flag) ? 1 : 0);
        if (PinGridCell.access$1800(PinGridCell.this).isPressed())
        {
            i = ((flag) ? 1 : 0);
            if (!flag)
            {
                Pinalytics.a(ElementType.PIN_DESCRIPTION, motionevent);
                if (!PinGridCell.access$400(PinGridCell.this) && PinGridCell.access$700(PinGridCell.this).hasHashtag())
                {
                    obj = PinGridCell.access$700(PinGridCell.this).getSpanWords();
                    if (((ArrayList) (obj)).size() == 1)
                    {
                        HashTagUtils.gotoTarget((String)((ArrayList) (obj)).get(0));
                    } else
                    {
                        pinhashtaglistdialog = PinHashtagListDialog.newInstance();
                        pinhashtaglistdialog.setHashTags(((java.util.List) (obj)));
                        Events.post(new DialogEvent(pinhashtaglistdialog));
                    }
                }
                playSoundEffect(0);
                i = 1;
            }
        }
        flag = i;
        if (PinGridCell.access$1700(PinGridCell.this).isIconPressed())
        {
            flag = i;
            if (i == 0)
            {
                if (PinGridCell.access$700(PinGridCell.this).getRecommendationReason() != null || PinGridCell.access$700(PinGridCell.this).getIsDynamicallyInserted())
                {
                    Pinalytics.a(ElementType.PIN_FEEDBACK_BUTTON_PFY, motionevent);
                    if (!PinGridCell.access$400(PinGridCell.this))
                    {
                        PinGridCell.access$1900(PinGridCell.this);
                    }
                }
                playSoundEffect(0);
                flag = true;
            }
        }
        i = ((flag) ? 1 : 0);
        if (PinGridCell.access$1500(PinGridCell.this).isIconPressed())
        {
            i = ((flag) ? 1 : 0);
            if (!flag)
            {
                if (PinGridCell.access$700(PinGridCell.this).shouldShowPromoterInGrid())
                {
                    Pinalytics.a(ElementType.PIN_FEEDBACK_BUTTON_PROMOTED, motionevent);
                    if (!PinGridCell.access$400(PinGridCell.this))
                    {
                        PinGridCell.access$2000(PinGridCell.this);
                    }
                }
                playSoundEffect(0);
                i = 1;
            }
        }
        flag = i;
        if (PinGridCell.access$2100(PinGridCell.this))
        {
            flag = i;
            if (PinGridCell.access$1500(PinGridCell.this).isPressed())
            {
                flag = i;
                if (i == 0)
                {
                    if (PinGridCell.access$400(PinGridCell.this))
                    {
                        Events.post(new OverrideNavigationEvent(3, PinGridCell.access$700(PinGridCell.this).getUserUid()));
                    } else
                    {
                        Pinalytics.a(ElementType.PIN_USER, motionevent, PinGridCell.access$700(PinGridCell.this).getUserUid());
                        Events.post(new Navigation(Location.USER, PinGridCell.access$700(PinGridCell.this).getUser()));
                    }
                    playSoundEffect(0);
                    flag = true;
                }
            }
        }
        i = ((flag) ? 1 : 0);
        if (PinGridCell.access$2200(PinGridCell.this).isPressed())
        {
            i = ((flag) ? 1 : 0);
            if (!flag)
            {
                getContext();
                if (PinGridCell.access$700(PinGridCell.this).hasAttribution())
                {
                    s = PinGridCell.access$700(PinGridCell.this).getAttrAuthorUrl();
                    obj = s;
                    if (s == null)
                    {
                        obj = PinGridCell.access$700(PinGridCell.this).getClickThroughUrl();
                    }
                    Pinalytics.a(ElementType.PIN_ATTRIBUTION, motionevent);
                    if (PinGridCell.access$400(PinGridCell.this))
                    {
                        Events.post(new OverrideNavigationEvent(5, ((String) (obj))));
                    } else
                    {
                        obj = new Navigation(Location.BROWSER, ((String) (obj)));
                        ((Navigation) (obj)).putExtra("Referer", PinGridCell.access$700(PinGridCell.this).getPinterestLink());
                        Events.post(obj);
                    }
                } else
                if (PinGridCell.access$700(PinGridCell.this).getDomain() != null)
                {
                    Pinalytics.a(ElementType.PIN_DOMAIN, motionevent);
                    if (PinGridCell.access$400(PinGridCell.this))
                    {
                        Events.post(new OverrideNavigationEvent(4, PinGridCell.access$700(PinGridCell.this).getDomain()));
                    } else
                    {
                        Events.post(new Navigation(Location.DOMAIN, PinGridCell.access$700(PinGridCell.this).getDomain()));
                    }
                }
                i = ((flag) ? 1 : 0);
                if (PinGridCell.access$400(PinGridCell.this))
                {
                    playSoundEffect(0);
                    i = 1;
                }
            }
        }
        flag = i;
        if (PinGridCell.access$2300(PinGridCell.this).isPressed())
        {
            flag = i;
            if (i == 0)
            {
                obj = PinGridCell.access$700(PinGridCell.this).getBoard();
                flag = i;
                if (obj != null)
                {
                    Pinalytics.a(ElementType.PIN_BOARD, motionevent, ((Board) (obj)).getUid());
                    if (PinGridCell.access$400(PinGridCell.this))
                    {
                        Events.post(new OverrideNavigationEvent(4, PinGridCell.access$700(PinGridCell.this).getBoardUid()));
                    } else
                    {
                        Events.post(new Navigation(Location.BOARD, ((com.pinterest.api.model.Model) (obj))));
                    }
                    playSoundEffect(0);
                    flag = true;
                }
            }
        }
        if (PinGridCell.access$2400(PinGridCell.this).isPressed() && !flag)
        {
            Pinalytics.a(ElementType.PIN_DOMAIN, motionevent);
            if (PinGridCell.access$400(PinGridCell.this))
            {
                Events.post(new OverrideNavigationEvent(4, PinGridCell.access$700(PinGridCell.this).getDomain()));
            } else
            if (PinGridCell.access$700(PinGridCell.this).isCSR())
            {
                Events.post(new Navigation(Location.BROWSER, PinGridCell.access$700(PinGridCell.this).getLink()));
            } else
            {
                Events.post(new Navigation(Location.DOMAIN, PinGridCell.access$700(PinGridCell.this).getDomain()));
            }
            playSoundEffect(0);
        }
        return true;
    }

    public void resolveTouch(MotionEvent motionevent, boolean flag, boolean flag1)
    {
        PinGridCell.access$900(PinGridCell.this);
        if (isEnabled() && (isDown != flag || flag1) && motionevent != null)
        {
            if (PinGridCell.access$1000(PinGridCell.this).getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
            {
                PinGridCell.access$1000(PinGridCell.this).setPressed(true);
            }
            if (PinGridCell.access$500(PinGridCell.this).getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
            {
                PinGridCell.access$500(PinGridCell.this).setPressed(true);
            }
            if (PinGridCell.access$1500(PinGridCell.this).getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
            {
                if (PinGridCell.access$1500(PinGridCell.this).getIconBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                {
                    PinGridCell.access$1500(PinGridCell.this).setIconPressed(true);
                } else
                {
                    PinGridCell.access$1500(PinGridCell.this).setPressed(true);
                }
            }
            if (PinGridCell.access$2200(PinGridCell.this).getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
            {
                PinGridCell.access$2200(PinGridCell.this).setPressed(true);
            }
            if (PinGridCell.access$2300(PinGridCell.this).getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
            {
                PinGridCell.access$2300(PinGridCell.this).setPressed(true);
            }
            if (PinGridCell.access$1700(PinGridCell.this).getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
            {
                if (PinGridCell.access$1700(PinGridCell.this).getIconBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
                {
                    PinGridCell.access$1700(PinGridCell.this).setIconPressed(true);
                } else
                {
                    PinGridCell.access$1700(PinGridCell.this).setPressed(true);
                }
            }
            if (PinGridCell.access$1800(PinGridCell.this).isClickable() && PinGridCell.access$1800(PinGridCell.this).getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
            {
                PinGridCell.access$1800(PinGridCell.this).setPressed(true);
            }
            if (PinGridCell.access$2400(PinGridCell.this).getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()))
            {
                PinGridCell.access$2400(PinGridCell.this).setPressed(true);
            }
        }
        isDown = flag;
        if (flag1)
        {
            invalidate();
            return;
        } else
        {
            postInvalidateDelayed(touchDelay);
            return;
        }
    }

    alogEvent()
    {
        this$0 = PinGridCell.this;
        super();
        isDown = false;
    }
}
