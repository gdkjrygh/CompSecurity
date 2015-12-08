// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

private static final class q
{
    private static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return SavedState.a(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
        int a;
        boolean b;
        Bundle c;

        static SavedState a(Parcel parcel)
        {
            boolean flag = true;
            SavedState savedstate = new SavedState();
            savedstate.a = parcel.readInt();
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            savedstate.b = flag;
            if (savedstate.b)
            {
                savedstate.c = parcel.readBundle();
            }
            return savedstate;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeInt(a);
            if (b)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (b)
            {
                parcel.writeBundle(c);
            }
        }


        private SavedState()
        {
        }
    }


    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    ViewGroup g;
    View h;
    View i;
    f j;
    e k;
    Context l;
    boolean m;
    boolean n;
    boolean o;
    public boolean p;
    boolean q;
    boolean r;
    Bundle s;

    final void a(f f1)
    {
        if (f1 != j)
        {
            if (j != null)
            {
                j.b(k);
            }
            j = f1;
            if (f1 != null && k != null)
            {
                f1.a(k);
                return;
            }
        }
    }

    SavedState(int i1)
    {
        a = i1;
        q = false;
    }
}
