// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.speechkit.speech;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.admarvel.android.ads.AdMarvelInternalWebView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.admarvel.speechkit.speech:
//            NavigationStringEnum, TransitionStringEnum

public abstract class Abstract
{
    public static class Dimensions extends ReflectedParcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public Dimensions createFromParcel(Parcel parcel)
            {
                return new Dimensions(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public Dimensions[] newArray(int i)
            {
                return new Dimensions[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public int height;
        public int width;
        public int x;
        public int y;

        public void setValues(int i, int j, int k, int l)
        {
            x = i;
            y = j;
            width = k;
            height = l;
        }


        public Dimensions()
        {
            x = -1;
            y = -1;
            width = -1;
            height = -1;
        }

        protected Dimensions(Parcel parcel)
        {
            super(parcel);
        }
    }

    public static class PlayerProperties extends ReflectedParcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public PlayerProperties createFromParcel(Parcel parcel)
            {
                return new PlayerProperties(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public PlayerProperties[] newArray(int i)
            {
                return new PlayerProperties[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public boolean audioMuted;
        public boolean autoPlay;
        public boolean doLoop;
        public boolean inline;
        public int positionUpdatePeriodMs;
        public boolean showControl;
        public String startStyle;
        public String stopStyle;

        public boolean doLoop()
        {
            return doLoop;
        }

        public boolean doMute()
        {
            return audioMuted;
        }

        public boolean exitOnComplete()
        {
            return stopStyle.equalsIgnoreCase("exit");
        }

        public boolean isAutoPlay()
        {
            return autoPlay;
        }

        public boolean isFullScreen()
        {
            return startStyle.equalsIgnoreCase("fullscreen");
        }

        public void muteAudio()
        {
            audioMuted = true;
        }

        public void setProperties(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, String s, String s1, 
                int i)
        {
            autoPlay = flag1;
            showControl = flag2;
            doLoop = flag4;
            audioMuted = flag;
            startStyle = s;
            stopStyle = s1;
            inline = flag3;
            positionUpdatePeriodMs = i;
        }

        public void setStopStyle(String s)
        {
            stopStyle = s;
        }

        public boolean showControl()
        {
            return showControl;
        }


        public PlayerProperties()
        {
            showControl = true;
            autoPlay = true;
            audioMuted = false;
            doLoop = false;
            stopStyle = "normal";
            startStyle = "normal";
            inline = false;
            positionUpdatePeriodMs = -1;
        }

        public PlayerProperties(Parcel parcel)
        {
            super(parcel);
        }
    }

    public static class Properties extends ReflectedParcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public Properties createFromParcel(Parcel parcel)
            {
                return new Properties(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public Properties[] newArray(int i)
            {
                return new Properties[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public int backgroundColor;
        public float backgroundOpacity;
        public boolean isModal;
        public boolean lockOrientation;
        public boolean useBackground;
        public boolean useCustomClose;


        public Properties()
        {
            useBackground = false;
            backgroundColor = 0;
            backgroundOpacity = 0.0F;
            isModal = false;
            lockOrientation = false;
            useCustomClose = false;
        }

        protected Properties(Parcel parcel)
        {
            super(parcel);
        }
    }

    public static class ReflectedParcelable
        implements Parcelable
    {

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            Field afield[];
            afield = getClass().getDeclaredFields();
            i = 0;
_L2:
            Object obj;
            Object obj1;
            try
            {
                if (i >= afield.length)
                {
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                parcel.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                parcel.printStackTrace();
                return;
            }
            obj = afield[i];
            obj1 = ((Field) (obj)).getType();
            if (!((Class) (obj1)).isEnum())
            {
                break MISSING_BLOCK_LABEL_108;
            }
            obj1 = ((Class) (obj1)).toString();
            if (((String) (obj1)).equals("class com.nuance.dragon.mraid.util.NavigationStringEnum"))
            {
                parcel.writeString(((NavigationStringEnum)((Field) (obj)).get(this)).getText());
                break MISSING_BLOCK_LABEL_139;
            }
            if (((String) (obj1)).equals("class com.nuance.dragon.mraid.util.TransitionStringEnum"))
            {
                parcel.writeString(((TransitionStringEnum)((Field) (obj)).get(this)).getText());
            }
            break MISSING_BLOCK_LABEL_139;
            obj = ((Field) (obj)).get(this);
            if (!(obj instanceof android.os.Parcelable.Creator))
            {
                parcel.writeValue(obj);
            }
            i++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public ReflectedParcelable()
        {
        }

        protected ReflectedParcelable(Parcel parcel)
        {
            Field afield[];
            int i;
            afield = getClass().getDeclaredFields();
            i = 0;
_L2:
            Field field;
            Object obj;
            try
            {
                if (i >= afield.length)
                {
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                parcel.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                parcel.printStackTrace();
                return;
            }
            field = afield[i];
            obj = field.getType();
            if (!((Class) (obj)).isEnum())
            {
                break MISSING_BLOCK_LABEL_105;
            }
            obj = ((Class) (obj)).toString();
            if (((String) (obj)).equals("class com.nuance.dragon.mraid.util.NavigationStringEnum"))
            {
                field.set(this, NavigationStringEnum.fromString(parcel.readString()));
                break MISSING_BLOCK_LABEL_135;
            }
            if (((String) (obj)).equals("class com.nuance.dragon.mraid.util.TransitionStringEnum"))
            {
                field.set(this, TransitionStringEnum.fromString(parcel.readString()));
            }
            break MISSING_BLOCK_LABEL_135;
            if (!(field.get(this) instanceof android.os.Parcelable.Creator))
            {
                field.set(this, parcel.readValue(null));
            }
            i++;
            if (true) goto _L2; else goto _L1
_L1:
        }
    }


    private static final String BOOLEAN_TYPE = "boolean";
    public static final String EXIT = "exit";
    private static final String FLOAT_TYPE = "float";
    public static final String FULL_SCREEN = "fullscreen";
    private static final String INT_TYPE = "int";
    private static final String NAVIGATION_TYPE = "class com.nuance.dragon.mraid.util.NavigationStringEnum";
    private static final String STRING_TYPE = "class java.lang.String";
    public static final String STYLE_NORMAL = "normal";
    private static final String TRANSITION_TYPE = "class com.nuance.dragon.mraid.util.TransitionStringEnum";
    protected WeakReference adMarvelInternalWebViewReference;
    protected WeakReference contextReference;

    public Abstract()
    {
    }

    public Abstract(AdMarvelInternalWebView admarvelinternalwebview, Context context)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        contextReference = new WeakReference(context);
    }

    public Abstract(AdMarvelInternalWebView admarvelinternalwebview, String s)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        contextReference = new WeakReference(admarvelinternalwebview.getContext());
    }

    protected static Object getFromJSON(JSONObject jsonobject, Class class1)
        throws IllegalAccessException, InstantiationException, NumberFormatException
    {
        Field afield[];
        int j;
        afield = class1.getDeclaredFields();
        class1 = ((Class) (class1.newInstance()));
        j = 0;
_L7:
        Object obj;
        String s;
        String s1;
        if (j >= afield.length)
        {
            return class1;
        }
        obj = afield[j];
        s = ((Field) (obj)).getName().replace('_', '-');
        s1 = ((Field) (obj)).getType().toString();
        if (!s1.equals("int")) goto _L2; else goto _L1
_L1:
        boolean flag;
        s = jsonobject.getString(s).toLowerCase();
        flag = s.startsWith("#");
        if (!flag) goto _L4; else goto _L3
_L3:
        int i = -1;
        if (!s.startsWith("#0x")) goto _L6; else goto _L5
_L5:
        int k = Integer.decode(s.substring(1)).intValue();
        i = k;
_L8:
        try
        {
            ((Field) (obj)).set(class1, Integer.valueOf(i));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JSONException) (obj)).printStackTrace();
        }
_L9:
        j++;
          goto _L7
_L6:
        k = Integer.parseInt(s.substring(1), 16);
        i = k;
          goto _L8
_L4:
        i = Integer.parseInt(s);
          goto _L8
_L2:
label0:
        {
            if (!s1.equals("class java.lang.String"))
            {
                break label0;
            }
            ((Field) (obj)).set(class1, jsonobject.getString(s));
        }
          goto _L9
label1:
        {
            if (!s1.equals("boolean"))
            {
                break label1;
            }
            ((Field) (obj)).set(class1, Boolean.valueOf(jsonobject.getBoolean(s)));
        }
          goto _L9
label2:
        {
            if (!s1.equals("float"))
            {
                break label2;
            }
            ((Field) (obj)).set(class1, Float.valueOf(Float.parseFloat(jsonobject.getString(s))));
        }
          goto _L9
        if (!s1.equals("class com.nuance.dragon.mraid.util.NavigationStringEnum")) goto _L11; else goto _L10
_L10:
        ((Field) (obj)).set(class1, NavigationStringEnum.fromString(jsonobject.getString(s)));
          goto _L9
_L11:
        if (!s1.equals("class com.nuance.dragon.mraid.util.TransitionStringEnum")) goto _L9; else goto _L12
_L12:
        ((Field) (obj)).set(class1, TransitionStringEnum.fromString(jsonobject.getString(s)));
          goto _L9
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L8
    }

    protected String noramlizeUrl(String s)
    {
        String s1 = s;
        if (!s.startsWith("http"))
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            s1 = s;
            if (admarvelinternalwebview != null)
            {
                s1 = (new StringBuilder(String.valueOf(admarvelinternalwebview.getBaseUrl()))).append(s).toString();
            }
        }
        return s1;
    }

    public abstract void stopAllListeners();
}
