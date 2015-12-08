// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPFilter;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPMessage;
import com.digby.localpoint.sdk.core.ILPMessageListener;
import com.digby.localpoint.sdk.core.ILPMessageProvider;
import com.digby.localpoint.sdk.core.ILPOrdering;
import com.digby.localpoint.sdk.core.filter.ILPMessageFilterFactory;
import com.digby.localpoint.sdk.core.impl.filter.LPMessageFilterFactory;
import com.digby.localpoint.sdk.core.impl.ordering.LPMessageOrderingFactory;
import com.digby.localpoint.sdk.core.ordering.ILPMessageOrderingFactory;
import com.digby.mm.android.library.db.impl.DigbyDBHelper;
import com.digby.mm.android.library.db.impl.MessageDBHelper;
import com.digby.mm.android.library.messages.IMessage;
import com.digby.mm.android.library.messages.impl.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPMessage

public class LPMessageProvider
    implements ILPMessageProvider
{
    class DefaultMessageOrdering
        implements ILPOrdering
    {

        final LPMessageProvider this$0;

        public int compare(Object obj, Object obj1)
        {
            obj = (ILPMessage)obj;
            obj1 = (ILPMessage)obj1;
            return Long.valueOf(Long.parseLong(((ILPMessage) (obj)).getID().getValue())).compareTo(Long.valueOf(Long.parseLong(((ILPMessage) (obj1)).getID().getValue())));
        }

        DefaultMessageOrdering()
        {
            this$0 = LPMessageProvider.this;
            super();
        }
    }


    private final Context context;

    LPMessageProvider()
    {
        context = null;
    }

    public LPMessageProvider(Context context1)
    {
        context = context1;
    }

    public void addListener(ILPMessageListener ilpmessagelistener)
    {
        throw new UnsupportedOperationException("Please extend LPAbstractMessageEventReceiver and register as a BroadcastReceiver in AndroidManifest.xml.");
    }

    public ILPMessageFilterFactory getFilterFactory()
    {
        return new LPMessageFilterFactory(context);
    }

    public Iterator getListenerIterator()
    {
        throw new UnsupportedOperationException("Please extend LPAbstractMessageEventReceiver and register as a BroadcastReceiver in AndroidManifest.xml.");
    }

    public ILPMessage getMessage(ILPID ilpid)
    {
        for (Iterator iterator = getMessages().iterator(); iterator.hasNext();)
        {
            ILPMessage ilpmessage = (ILPMessage)iterator.next();
            if (ilpid.getValue().equals(ilpmessage.getID().getValue()))
            {
                return ilpmessage;
            }
        }

        return null;
    }

    MessageDBHelper getMessageDBHelper()
    {
        return new MessageDBHelper(new DigbyDBHelper(context));
    }

    public List getMessages()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = getMessageDBHelper().getMessages().iterator(); iterator.hasNext(); arraylist.add(new LPMessage((Message)(IMessage)iterator.next()))) { }
        return arraylist;
    }

    public List getMessages(final ILPFilter o, ILPOrdering ilpordering)
    {
        Object obj = getMessages();
        ArrayList arraylist = new ArrayList();
        if (o != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ILPMessage ilpmessage = (ILPMessage)((Iterator) (obj)).next();
                if (o.accept(ilpmessage))
                {
                    arraylist.add(ilpmessage);
                }
            } while (true);
        } else
        {
            arraylist.addAll(((java.util.Collection) (obj)));
        }
        o = ilpordering;
        if (ilpordering == null)
        {
            o = new DefaultMessageOrdering();
        }
        Collections.sort(arraylist, new Comparator() {

            final LPMessageProvider this$0;
            final ILPOrdering val$o;

            public int compare(ILPMessage ilpmessage1, ILPMessage ilpmessage2)
            {
                return o.compare(ilpmessage1, ilpmessage2);
            }

            public volatile int compare(Object obj1, Object obj2)
            {
                return compare((ILPMessage)obj1, (ILPMessage)obj2);
            }

            
            {
                this$0 = LPMessageProvider.this;
                o = ilpordering;
                super();
            }
        });
        return arraylist;
    }

    public ILPMessageOrderingFactory getOrderingFactory()
    {
        return new LPMessageOrderingFactory(context);
    }

    public void removeAllListeners()
    {
        throw new UnsupportedOperationException("Please extend LPAbstractMessageEventReceiver and register as a BroadcastReceiver in AndroidManifest.xml.");
    }

    public void removeListener(ILPMessageListener ilpmessagelistener)
    {
        throw new UnsupportedOperationException("Please extend LPAbstractMessageEventReceiver and register as a BroadcastReceiver in AndroidManifest.xml.");
    }
}
