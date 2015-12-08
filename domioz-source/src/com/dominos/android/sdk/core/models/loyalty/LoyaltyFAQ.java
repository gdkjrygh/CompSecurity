// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;

import android.os.Parcel;
import android.os.Parcelable;
import com.dominos.android.sdk.common.StringHelper;

public class LoyaltyFAQ
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String answer;
    private String control;
    private Control enumControl;
    private String question;

    private LoyaltyFAQ(Parcel parcel)
    {
        setQuestion(parcel.readString());
        setAnswer(parcel.readString());
        setControl(parcel.readString());
    }

    LoyaltyFAQ(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAnswer()
    {
        return answer;
    }

    public String getControl()
    {
        return control;
    }

    public Control getEnumControl()
    {
        enumControl = Control.NORMAL;
        Control acontrol[] = Control.values();
        int j = acontrol.length;
        for (int i = 0; i < j; i++)
        {
            Control control1 = acontrol[i];
            if (StringHelper.equalsIgnoreCase(control1.text, control))
            {
                enumControl = control1;
            }
        }

        return enumControl;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setAnswer(String s)
    {
        answer = s;
    }

    public void setControl(String s)
    {
        control = s;
    }

    public void setQuestion(String s)
    {
        question = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(question);
        parcel.writeString(answer);
        parcel.writeString(control);
    }


    private class Control extends Enum
    {

        private static final Control $VALUES[];
        public static final Control NORMAL;
        public static final Control OPT_OUT;
        private final String text;

        public static Control valueOf(String s)
        {
            return (Control)Enum.valueOf(com/dominos/android/sdk/core/models/loyalty/LoyaltyFAQ$Control, s);
        }

        public static Control[] values()
        {
            return (Control[])$VALUES.clone();
        }

        public final String getText()
        {
            return text;
        }

        static 
        {
            OPT_OUT = new Control("OPT_OUT", 0, "optout");
            NORMAL = new Control("NORMAL", 1, "normal");
            $VALUES = (new Control[] {
                OPT_OUT, NORMAL
            });
        }


        private Control(String s, int i, String s1)
        {
            super(s, i);
            text = s1;
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LoyaltyFAQ createFromParcel(Parcel parcel)
        {
            return new LoyaltyFAQ(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LoyaltyFAQ[] newArray(int i)
        {
            return new LoyaltyFAQ[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
