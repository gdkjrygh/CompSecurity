// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lyft.scoop.Screen;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

class viewState
    implements Parcelable
{

    public static final android.os.lableScreen.viewState CREATOR = new android.os.Parcelable.Creator() {

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Backstack.ParcelableScreen createFromParcel(Parcel parcel)
        {
            return new Backstack.ParcelableScreen(parcel);
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Backstack.ParcelableScreen[] newArray(int i)
        {
            return new Backstack.ParcelableScreen[i];
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

    public static viewState fromScreen(Screen screen, Gson gson)
    {
        try
        {
            screen = new <init>(encodeScreen(screen, gson), screen.getViewState());
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


    public _cls1(Parcel parcel)
    {
        parcel = parcel.readBundle();
        serializedScreen = parcel.getString("serializedScreen");
        viewState = parcel.getSparseParcelableArray("viewState");
    }

    public viewState(String s, SparseArray sparsearray)
    {
        serializedScreen = s;
        viewState = sparsearray;
    }
}
