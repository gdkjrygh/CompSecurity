// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import com.tinder.managers.ManagerApp;
import java.io.Serializable;

public class Job
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Job createFromParcel(Parcel parcel)
        {
            return new Job(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Job[] newArray(int i)
        {
            return new Job[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public String companyId;
    public boolean companyShown;
    private String mCompany;
    private String mTitle;
    public String titleId;
    public boolean titleShown;

    public Job()
    {
        mCompany = "";
        mTitle = "";
    }

    protected Job(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        mCompany = "";
        mTitle = "";
        mCompany = parcel.readString();
        mTitle = parcel.readString();
        companyId = parcel.readString();
        titleId = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        companyShown = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        titleShown = flag;
    }

    public Job(String s, String s1)
    {
        mCompany = "";
        mTitle = "";
        mCompany = s;
        mTitle = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCompany()
    {
        return mCompany;
    }

    public Spanned getSpanned()
    {
        ManagerApp managerapp = ManagerApp.d();
        if (hasTitle() && hasCompany())
        {
            return Html.fromHtml(managerapp.getString(0x7f06024b, new Object[] {
                mTitle, mCompany
            }).trim());
        }
        if (hasTitle())
        {
            return Html.fromHtml(mTitle.trim());
        }
        if (hasCompany())
        {
            return Html.fromHtml(mCompany.trim());
        } else
        {
            return null;
        }
    }

    public Spanned getSpannedStrict()
    {
        ManagerApp managerapp = ManagerApp.d();
        if (hasTitle() && titleShown && hasCompany() && companyShown)
        {
            return Html.fromHtml(managerapp.getString(0x7f06024b, new Object[] {
                mTitle, mCompany
            }).trim());
        }
        if (hasTitle() && titleShown)
        {
            return Html.fromHtml(mTitle.trim());
        }
        if (hasCompany() && companyShown)
        {
            return Html.fromHtml(mCompany.trim());
        } else
        {
            return null;
        }
    }

    public String getTitle()
    {
        return mTitle;
    }

    public boolean hasCompany()
    {
        return mCompany != null && !mCompany.isEmpty();
    }

    public boolean hasString()
    {
        return hasTitle() || hasCompany();
    }

    public boolean hasTitle()
    {
        return mTitle != null && !mTitle.isEmpty();
    }

    public void setCompany(String s)
    {
        mCompany = s;
    }

    public void setTitle(String s)
    {
        mTitle = s;
    }

    public String toString()
    {
        ManagerApp managerapp = ManagerApp.d();
        if (hasTitle() && hasCompany())
        {
            return managerapp.getString(0x7f06024b, new Object[] {
                mTitle, mCompany
            }).trim();
        }
        if (hasTitle())
        {
            return mTitle.trim();
        }
        if (hasCompany())
        {
            return mCompany.trim();
        } else
        {
            return "";
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(mCompany);
        parcel.writeString(mTitle);
        parcel.writeString(companyId);
        parcel.writeString(titleId);
        if (companyShown)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (titleShown)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}
