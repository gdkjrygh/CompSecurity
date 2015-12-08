// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.skype.Contact;
import com.skype.ObjectInterface;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.SymbolDrawable;
import com.skype.android.util.ContactUtil;
import com.skype.android.widget.drawable.PresenceDrawable;

// Referenced classes of package com.skype.android.widget:
//            ParticipantSpan

public class ContactSpan extends ParticipantSpan
{
    public static class Builder extends ParticipantSpan.Builder
    {

        private final ContactUtil f;

        public final int a()
        {
            return e;
        }

        protected final SymbolDrawable a(ObjectInterface objectinterface)
        {
            objectinterface = (Contact)objectinterface;
            PresenceDrawable presencedrawable = new PresenceDrawable(SegoeTypeFaceFactory.getInstance((Application)super.b().getApplicationContext()), super.b());
            f.a(presencedrawable, objectinterface.getTypeProp(), objectinterface.getAvailabilityProp());
            return presencedrawable;
        }

        protected final ParticipantSpan a(ObjectInterface objectinterface, BitmapDrawable bitmapdrawable, Rect rect, boolean flag, boolean flag1)
        {
            return new ContactSpan((Contact)objectinterface, bitmapdrawable, rect, flag, flag1, (byte)0);
        }

        public final volatile Context b()
        {
            return super.b();
        }

        protected final CharSequence b(ObjectInterface objectinterface)
        {
            objectinterface = (Contact)objectinterface;
            return f.a(objectinterface.getDisplaynameProp(), objectinterface.getType());
        }

        public Builder(Context context, ContactUtil contactutil)
        {
            super(context);
            f = contactutil;
        }
    }


    private final Contact a;

    private ContactSpan(Contact contact, BitmapDrawable bitmapdrawable, Rect rect, boolean flag, boolean flag1)
    {
        super(bitmapdrawable, rect, flag, flag1);
        a = contact;
    }

    ContactSpan(Contact contact, BitmapDrawable bitmapdrawable, Rect rect, boolean flag, boolean flag1, byte byte0)
    {
        this(contact, bitmapdrawable, rect, flag, flag1);
    }

    public final Contact a()
    {
        return a;
    }

    public final volatile ObjectInterface b()
    {
        return a;
    }

    public String getSource()
    {
        return a.getIdentity();
    }
}
