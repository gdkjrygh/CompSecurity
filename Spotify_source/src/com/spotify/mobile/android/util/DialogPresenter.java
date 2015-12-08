// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import aa;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import fze;
import java.util.ArrayList;

// Referenced classes of package com.spotify.mobile.android.util:
//            Assertion

public final class DialogPresenter extends Fragment
{

    private DialogTag Y;
    private boolean Z;
    private ArrayList a;
    private ArrayList b;

    public DialogPresenter()
    {
        a = new ArrayList();
        b = new ArrayList();
    }

    private fze a(DialogTag dialogtag)
    {
        return (fze)m().a(DialogTag.a(dialogtag));
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = Z;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!b.isEmpty() && Y == null)
        {
            Y = (DialogTag)b.remove(0);
            a(Y).a();
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void c(Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        a = bundle.getParcelableArrayList("request_code_map");
        b = bundle.getParcelableArrayList("dialog_queue");
        Y = (DialogTag)bundle.getParcelable("current_dialog");
        this;
        JVM INSTR monitorexit ;
        return;
        bundle;
        throw bundle;
    }

    public final void A()
    {
        super.A();
        Z = false;
    }

    public final void a(int i, int j, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        fze fze1;
        intent = (DialogTag)a.get(i - 1);
        fze1 = a(((DialogTag) (intent)));
        if (fze1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Assertion.c(intent, Y);
        Y = null;
        if (true) goto _L1; else goto _L3
_L3:
        intent;
        throw intent;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            c(bundle);
        }
    }

    public final void a(fze fze1)
    {
        this;
        JVM INSTR monitorenter ;
        b.add(new DialogTag(fze1.f(), (byte)0));
        a();
        this;
        JVM INSTR monitorexit ;
        return;
        fze1;
        throw fze1;
    }

    public final int b(fze fze1)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        a.add(new DialogTag(fze1.f(), (byte)0));
        i = a.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        fze1;
        throw fze1;
    }

    public final void e(Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        super.e(bundle);
        bundle.putParcelableArrayList("request_code_map", a);
        bundle.putParcelableArrayList("dialog_queue", b);
        bundle.putParcelable("current_dialog", Y);
        this;
        JVM INSTR monitorexit ;
        return;
        bundle;
        throw bundle;
    }

    public final void z()
    {
        super.z();
        Z = true;
        if (Y == null)
        {
            a();
        }
    }

    private class DialogTag
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new DialogTag(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new DialogTag[i];
            }

        };
        private final String a;

        static String a(DialogTag dialogtag)
        {
            return dialogtag.a;
        }

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            return (obj instanceof DialogTag) && ((DialogTag)obj).a.equals(a);
        }

        public int hashCode()
        {
            return a.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(a);
        }


        private DialogTag(Parcel parcel)
        {
            a = parcel.readString();
        }

        DialogTag(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        private DialogTag(String s)
        {
            a = s;
        }

        DialogTag(String s, byte byte0)
        {
            this(s);
        }
    }

}
