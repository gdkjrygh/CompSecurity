// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import java.io.Serializable;
import org.chromium.content_public.browser.NavigationHistory;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal, XWalkNavigationItemInternal

public class XWalkNavigationHistoryInternal
    implements Cloneable, Serializable
{
    public static final class DirectionInternal extends Enum
    {

        private static final DirectionInternal $VALUES[];
        public static final DirectionInternal BACKWARD;
        public static final DirectionInternal FORWARD;

        public static DirectionInternal valueOf(String s)
        {
            return (DirectionInternal)Enum.valueOf(org/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal, s);
        }

        public static DirectionInternal[] values()
        {
            return (DirectionInternal[])$VALUES.clone();
        }

        static 
        {
            BACKWARD = new DirectionInternal("BACKWARD", 0);
            FORWARD = new DirectionInternal("FORWARD", 1);
            $VALUES = (new DirectionInternal[] {
                BACKWARD, FORWARD
            });
        }

        private DirectionInternal(String s, int i)
        {
            super(s, i);
        }
    }


    private NavigationHistory mHistory;
    private XWalkViewInternal mXWalkView;

    XWalkNavigationHistoryInternal()
    {
        mXWalkView = null;
        mHistory = null;
    }

    XWalkNavigationHistoryInternal(XWalkNavigationHistoryInternal xwalknavigationhistoryinternal)
    {
        mXWalkView = xwalknavigationhistoryinternal.mXWalkView;
        mHistory = xwalknavigationhistoryinternal.mHistory;
    }

    XWalkNavigationHistoryInternal(XWalkViewInternal xwalkviewinternal, NavigationHistory navigationhistory)
    {
        mXWalkView = xwalkviewinternal;
        mHistory = navigationhistory;
    }

    public boolean canGoBack()
    {
        return mXWalkView.canGoBack();
    }

    public boolean canGoForward()
    {
        return mXWalkView.canGoForward();
    }

    public void clear()
    {
        mXWalkView.clearHistory();
    }

    protected volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    protected XWalkNavigationHistoryInternal clone()
    {
        this;
        JVM INSTR monitorenter ;
        XWalkNavigationHistoryInternal xwalknavigationhistoryinternal = new XWalkNavigationHistoryInternal(this);
        this;
        JVM INSTR monitorexit ;
        return xwalknavigationhistoryinternal;
        Exception exception;
        exception;
        throw exception;
    }

    public int getCurrentIndex()
    {
        return mHistory.getCurrentEntryIndex();
    }

    public XWalkNavigationItemInternal getCurrentItem()
    {
        return getItemAt(getCurrentIndex());
    }

    public XWalkNavigationItemInternal getItemAt(int i)
    {
        if (i < 0 || i >= size())
        {
            return null;
        } else
        {
            return new XWalkNavigationItemInternal(mHistory.getEntryAtIndex(i));
        }
    }

    public boolean hasItemAt(int i)
    {
        return i >= 0 && i <= size() - 1;
    }

    public void navigate(DirectionInternal directioninternal, int i)
    {
        static class _cls1
        {

            static final int $SwitchMap$org$xwalk$core$internal$XWalkNavigationHistoryInternal$DirectionInternal[];

            static 
            {
                $SwitchMap$org$xwalk$core$internal$XWalkNavigationHistoryInternal$DirectionInternal = new int[DirectionInternal.values().length];
                try
                {
                    $SwitchMap$org$xwalk$core$internal$XWalkNavigationHistoryInternal$DirectionInternal[DirectionInternal.FORWARD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$xwalk$core$internal$XWalkNavigationHistoryInternal$DirectionInternal[DirectionInternal.BACKWARD.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.org.xwalk.core.internal.XWalkNavigationHistoryInternal.DirectionInternal[directioninternal.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            mXWalkView.navigateTo(i);
            return;

        case 2: // '\002'
            mXWalkView.navigateTo(-i);
            break;
        }
    }

    public int size()
    {
        return mHistory.getEntryCount();
    }
}
