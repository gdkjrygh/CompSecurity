// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ObjectInterface;
import com.skype.SkyLib;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.SymbolDrawable;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.widget.drawable.PresenceDrawable;

// Referenced classes of package com.skype.android.widget:
//            ConversationSpan, ParticipantSpan

public static class g extends g
{

    private final ContactUtil f;
    private final ConversationUtil g;
    private final SkyLib h;

    protected final SymbolDrawable a(ObjectInterface objectinterface)
    {
        Object obj = (Conversation)objectinterface;
        if (((Conversation) (obj)).getTypeProp() == com.skype.ent)
        {
            objectinterface = new PresenceDrawable(SegoeTypeFaceFactory.getInstance((Application)super.().getApplicationContext()), super.());
            obj = ((Conversation) (obj)).getIdentityProp();
            ContactImpl contactimpl = new ContactImpl();
            if (h.getContact(((String) (obj)), contactimpl))
            {
                f.a(objectinterface, contactimpl.getTypeProp(), contactimpl.getAvailabilityProp());
                return objectinterface;
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }
    }

    protected final ParticipantSpan a(ObjectInterface objectinterface, BitmapDrawable bitmapdrawable, Rect rect, boolean flag, boolean flag1)
    {
        return new ConversationSpan((Conversation)objectinterface, bitmapdrawable, rect, flag, flag1, (byte)0);
    }

    public final volatile Context b()
    {
        return super.();
    }

    protected final CharSequence b(ObjectInterface objectinterface)
    {
        objectinterface = (Conversation)objectinterface;
        return g.m(objectinterface);
    }

    public (Context context, SkyLib skylib, ContactUtil contactutil, ConversationUtil conversationutil)
    {
        super(context);
        h = skylib;
        f = contactutil;
        g = conversationutil;
    }
}
