// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.android.util.ContactUtil;
import com.skype.android.widget.SpinnerAdapter;

public class PresenceControlAdapter extends SpinnerAdapter
{
    public static final class PresenceModel extends Enum
    {

        private static final PresenceModel $VALUES[];
        public static final PresenceModel AVAILABLE;
        public static final PresenceModel BUSY;
        public static final PresenceModel INVISIBLE;
        private com.skype.Contact.AVAILABILITY status;
        private int titleId;

        public static PresenceModel valueOf(String s)
        {
            return (PresenceModel)Enum.valueOf(com/skype/android/app/account/PresenceControlAdapter$PresenceModel, s);
        }

        public static PresenceModel[] values()
        {
            return (PresenceModel[])$VALUES.clone();
        }

        public final com.skype.Contact.AVAILABILITY getAvailabilityStatus()
        {
            return status;
        }

        public final int getTitleId()
        {
            return titleId;
        }

        static 
        {
            AVAILABLE = new PresenceModel("AVAILABLE", 0, 0x7f080294, com.skype.Contact.AVAILABILITY.ONLINE);
            BUSY = new PresenceModel("BUSY", 1, 0x7f080296, com.skype.Contact.AVAILABILITY.DO_NOT_DISTURB);
            INVISIBLE = new PresenceModel("INVISIBLE", 2, 0x7f0802c8, com.skype.Contact.AVAILABILITY.INVISIBLE);
            $VALUES = (new PresenceModel[] {
                AVAILABLE, BUSY, INVISIBLE
            });
        }

        private PresenceModel(String s, int i, int j, com.skype.Contact.AVAILABILITY availability)
        {
            super(s, i);
            titleId = j;
            status = availability;
        }
    }

    private static final class a
    {

        protected TextView text;

        private a()
        {
        }

    }


    private ContactUtil contactUtil;

    public PresenceControlAdapter(Context context, ContactUtil contactutil)
    {
        super(context, 0x7f0300e0);
        contactUtil = contactutil;
        add(PresenceModel.AVAILABLE);
        add(PresenceModel.BUSY);
        add(PresenceModel.INVISIBLE);
    }

    private View customPresenceView(int i, View view)
    {
        a a1 = (a)view.getTag();
        PresenceModel presencemodel = (PresenceModel)getItem(i);
        a1.text.setText(getContext().getString(presencemodel.getTitleId()));
        contactUtil.a(a1.text, null, presencemodel.getAvailabilityStatus());
        return view;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = super.getDropDownView(i, view, viewgroup);
            viewgroup = new a();
            viewgroup.text = (TextView)view.findViewById(0x7f1004bd);
            view.setTag(viewgroup);
        }
        return customPresenceView(i, view);
    }

    public PresenceModel getPresenceModel(com.skype.Contact.AVAILABILITY availability)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Contact$AVAILABILITY[];

            static 
            {
                $SwitchMap$com$skype$Contact$AVAILABILITY = new int[com.skype.Contact.AVAILABILITY.values().length];
                try
                {
                    $SwitchMap$com$skype$Contact$AVAILABILITY[com.skype.Contact.AVAILABILITY.DO_NOT_DISTURB.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Contact$AVAILABILITY[com.skype.Contact.AVAILABILITY.DO_NOT_DISTURB_FROM_MOBILE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.Contact.AVAILABILITY[availability.ordinal()])
        {
        default:
            if (ContactUtil.a(availability))
            {
                return PresenceModel.AVAILABLE;
            } else
            {
                return PresenceModel.INVISIBLE;
            }

        case 1: // '\001'
        case 2: // '\002'
            return PresenceModel.BUSY;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = LayoutInflater.from(getContext()).inflate(0x7f0300e1, null);
            viewgroup = new a(null);
            viewgroup.text = (TextView)view.findViewById(0x7f1004be);
            view.setTag(viewgroup);
        }
        return customPresenceView(i, view);
    }
}
