// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import android.os.Bundle;
import com.google.gson.Gson;
import com.lyft.scoop.Screen;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public final class Backstack extends ArrayDeque
{

    public Backstack()
    {
    }

    public static Backstack fromBundle(Bundle bundle, Screen screen, String s, Gson gson)
    {
        Backstack backstack = new Backstack();
        if (bundle != null)
        {
            for (bundle = bundle.getParcelableArrayList(s).iterator(); bundle.hasNext(); backstack.add(((ParcelableScreen)bundle.next()).toScreen(gson))) { }
        } else
        if (screen != null)
        {
            backstack.push(screen);
        }
        return backstack;
    }

    public void toBundle(Bundle bundle, String s, Gson gson)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = iterator(); iterator.hasNext(); arraylist.add(ParcelableScreen.fromScreen((Screen)iterator.next(), gson))) { }
        bundle.putParcelableArrayList(s, arraylist);
    }

    private class ParcelableScreen
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public ParcelableScreen createFromParcel(Parcel parcel)
            {
                return new ParcelableScreen(parcel);
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

            public ParcelableScreen[] newArray(int i)
            {
                return new ParcelableScreen[i];
            }

        };
        private final String serializedScreen;
        private final SparseArray viewState;

        private static Object decodeScreen(String s, Gson gson)
        {
            s = new JsonReader(new StringReader(s));
            s.c();
            gson = ((Gson) (gson.a(s, Class.forName(s.g()))));
            s.close();
            return gson;
            gson;
            throw new RuntimeException(gson);
            gson;
            s.close();
            throw gson;
        }

        private static String encodeScreen(Object obj, Gson gson)
        {
            JsonWriter jsonwriter;
            StringWriter stringwriter;
            stringwriter = new StringWriter();
            jsonwriter = new JsonWriter(stringwriter);
            Class class1 = obj.getClass();
            jsonwriter.d();
            jsonwriter.a(class1.getName());
            gson.a(obj, class1, jsonwriter);
            jsonwriter.e();
            obj = stringwriter.toString();
            jsonwriter.close();
            return ((String) (obj));
            obj;
            jsonwriter.close();
            throw obj;
        }

        public static ParcelableScreen fromScreen(Screen screen, Gson gson)
        {
            try
            {
                screen = new ParcelableScreen(encodeScreen(screen, gson), screen.getViewState());
            }
            // Misplaced declaration of an exception variable
            catch (Screen screen)
            {
                throw new RuntimeException(screen);
            }
            return screen;
        }

        public int describeContents()
        {
            return 0;
        }

        public Screen toScreen(Gson gson)
        {
            try
            {
                gson = (Screen)decodeScreen(serializedScreen, gson);
                gson.setViewState(viewState);
            }
            // Misplaced declaration of an exception variable
            catch (Gson gson)
            {
                throw new RuntimeException(gson);
            }
            return gson;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            Bundle bundle = new Bundle();
            bundle.putString("serializedScreen", serializedScreen);
            bundle.putSparseParcelableArray("viewState", viewState);
            parcel.writeBundle(bundle);
        }


        public ParcelableScreen(Parcel parcel)
        {
            parcel = parcel.readBundle();
            serializedScreen = parcel.getString("serializedScreen");
            viewState = parcel.getSparseParcelableArray("viewState");
        }

        public ParcelableScreen(String s, SparseArray sparsearray)
        {
            serializedScreen = s;
            viewState = sparsearray;
        }
    }

}
