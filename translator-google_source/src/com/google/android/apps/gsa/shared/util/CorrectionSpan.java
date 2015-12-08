// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.google.common.base.p;

// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            c

public final class CorrectionSpan extends CharacterStyle
    implements Parcelable, UpdateAppearance
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final String a;

    public CorrectionSpan(String s)
    {
        a = (String)p.a(s);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof CorrectionSpan)
        {
            obj = (CorrectionSpan)obj;
            return a.equals(((CorrectionSpan) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        String s = a;
        return (new StringBuilder(String.valueOf(s).length() + 16)).append("CorrectionSpan[").append(s).append("]").toString();
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        textpaint.setUnderlineText(true);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
