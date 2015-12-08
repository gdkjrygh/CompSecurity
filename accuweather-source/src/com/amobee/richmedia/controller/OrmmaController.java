// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amobee.richmedia.controller.util.NavigationStringEnum;
import com.amobee.richmedia.controller.util.TransitionStringEnum;
import com.amobee.richmedia.view.AmobeeView;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class OrmmaController
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

        public void setProperties(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, String s, String s1)
        {
            autoPlay = flag1;
            showControl = flag2;
            doLoop = flag4;
            audioMuted = flag;
            startStyle = s;
            stopStyle = s1;
            inline = flag3;
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
        public int height;
        public boolean useBackground;
        public boolean useCustomClose;
        public int width;


        public Properties()
        {
            height = -1;
            width = -1;
            useBackground = false;
            backgroundColor = 0;
            backgroundOpacity = 0.0F;
            useCustomClose = false;
        }

        protected Properties(Parcel parcel)
        {
            super(parcel);
            height = -1;
            width = -1;
        }
    }

    public static class RecurrenceProperties extends ReflectedParcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public RecurrenceProperties createFromParcel(Parcel parcel)
            {
                return new RecurrenceProperties(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public RecurrenceProperties[] newArray(int i)
            {
                return new RecurrenceProperties[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public short daysInMonth[];
        public short daysInWeek[];
        public short daysInYear[];
        public String exceptionDates[];
        public String expires;
        public String frequency;
        public int interval;
        public short monthsInYear[];
        public short weeksInMonth[];


        public RecurrenceProperties()
        {
            frequency = "-1";
            interval = -1;
            expires = "";
            exceptionDates = null;
            daysInWeek = null;
            daysInMonth = null;
            daysInYear = null;
            weeksInMonth = null;
            monthsInYear = null;
        }

        protected RecurrenceProperties(Parcel parcel)
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
_L1:
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
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                return;
            }
            obj = afield[i];
            obj1 = ((Field) (obj)).getType();
            if (!((Class) (obj1)).isEnum())
            {
                break MISSING_BLOCK_LABEL_102;
            }
            obj1 = ((Class) (obj1)).toString();
            if (((String) (obj1)).equals("class com.ormma.NavigationStringEnum"))
            {
                parcel.writeString(((NavigationStringEnum)((Field) (obj)).get(this)).getText());
                break MISSING_BLOCK_LABEL_129;
            }
            if (((String) (obj1)).equals("class com.ormma.TransitionStringEnum"))
            {
                parcel.writeString(((TransitionStringEnum)((Field) (obj)).get(this)).getText());
            }
            break MISSING_BLOCK_LABEL_129;
            obj = ((Field) (obj)).get(this);
            if (!(obj instanceof android.os.Parcelable.Creator))
            {
                parcel.writeValue(obj);
            }
            i++;
              goto _L1
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
_L1:
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
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                return;
            }
            field = afield[i];
            obj = field.getType();
            if (!((Class) (obj)).isEnum())
            {
                break MISSING_BLOCK_LABEL_99;
            }
            obj = ((Class) (obj)).toString();
            if (((String) (obj)).equals("class com.ormma.NavigationStringEnum"))
            {
                field.set(this, NavigationStringEnum.fromString(parcel.readString()));
                break MISSING_BLOCK_LABEL_125;
            }
            if (((String) (obj)).equals("class com.ormma.TransitionStringEnum"))
            {
                field.set(this, TransitionStringEnum.fromString(parcel.readString()));
            }
            break MISSING_BLOCK_LABEL_125;
            if (!(field.get(this) instanceof android.os.Parcelable.Creator))
            {
                field.set(this, parcel.readValue(null));
            }
            i++;
              goto _L1
        }
    }

    public static class ResizeProperties extends ReflectedParcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public ResizeProperties createFromParcel(Parcel parcel)
            {
                return new ResizeProperties(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public ResizeProperties[] newArray(int i)
            {
                return new ResizeProperties[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public boolean allowOffscreen;
        public String customClosePosition;
        public int height;
        public int offsetX;
        public int offsetY;
        public int width;


        public ResizeProperties()
        {
            width = -1;
            height = -1;
            offsetX = -1;
            offsetY = -1;
            width = 0;
            height = 0;
            customClosePosition = "top-right";
            offsetX = 0;
            offsetY = 0;
            allowOffscreen = true;
        }

        protected ResizeProperties(Parcel parcel)
        {
            super(parcel);
            width = -1;
            height = -1;
            offsetX = -1;
            offsetY = -1;
        }
    }


    private static final String BOOLEAN_TYPE = "boolean";
    public static final String EXIT = "exit";
    private static final String FLOAT_TYPE = "float";
    public static final String FULL_SCREEN = "fullscreen";
    private static final String INT_TYPE = "int";
    private static final String NAVIGATION_TYPE = "class com.ormma.NavigationStringEnum";
    private static final String SHORT_ARRAY_TYPE = "class [S";
    private static final String STRING_ARRAY_TYPE = "class [Ljava.lang.String;";
    private static final String STRING_TYPE = "class java.lang.String";
    public static final String STYLE_NORMAL = "normal";
    private static final String TRANSITION_TYPE = "class com.ormma.TransitionStringEnum";
    protected Context mContext;
    protected AmobeeView mOrmmaView;

    public OrmmaController(AmobeeView amobeeview, Context context)
    {
        mOrmmaView = amobeeview;
        mContext = context;
    }

    protected static Object getFromJSON(JSONObject jsonobject, Class class1)
        throws IllegalAccessException, InstantiationException, NumberFormatException, NullPointerException
    {
        Field afield[];
        int j;
        afield = class1.getDeclaredFields();
        class1 = ((Class) (class1.newInstance()));
        j = 0;
_L7:
        Field field;
        Object obj;
        Object obj1;
        if (j >= afield.length)
        {
            return class1;
        }
        field = afield[j];
        obj = field.getName().replace('_', '-');
        obj1 = field.getType().toString();
        if (!((String) (obj1)).equals("int")) goto _L2; else goto _L1
_L1:
        boolean flag;
        obj = jsonobject.getString(((String) (obj))).toLowerCase();
        flag = ((String) (obj)).startsWith("#");
        if (!flag) goto _L4; else goto _L3
_L3:
        int i = -1;
        if (!((String) (obj)).startsWith("#0x")) goto _L6; else goto _L5
_L5:
        int k = Integer.decode(((String) (obj)).substring(1)).intValue();
        i = k;
_L8:
        NumberFormatException numberformatexception;
        String as[];
        try
        {
            field.set(class1, Integer.valueOf(i));
        }
        catch (JSONException jsonexception) { }
_L9:
        j++;
          goto _L7
_L6:
        k = Integer.parseInt(((String) (obj)).substring(1), 16);
        i = k;
          goto _L8
_L4:
        i = Integer.parseInt(((String) (obj)));
          goto _L8
_L2:
label0:
        {
            if (!((String) (obj1)).equals("class java.lang.String"))
            {
                break label0;
            }
            field.set(class1, jsonobject.getString(((String) (obj))));
        }
          goto _L9
label1:
        {
            if (!((String) (obj1)).equals("boolean"))
            {
                break label1;
            }
            field.set(class1, Boolean.valueOf(jsonobject.getBoolean(((String) (obj)))));
        }
          goto _L9
label2:
        {
            if (!((String) (obj1)).equals("float"))
            {
                break label2;
            }
            field.set(class1, Float.valueOf(Float.parseFloat(jsonobject.getString(((String) (obj))))));
        }
          goto _L9
label3:
        {
            if (!((String) (obj1)).equals("class com.ormma.NavigationStringEnum"))
            {
                break label3;
            }
            field.set(class1, NavigationStringEnum.fromString(jsonobject.getString(((String) (obj)))));
        }
          goto _L9
label4:
        {
            if (!((String) (obj1)).equals("class com.ormma.TransitionStringEnum"))
            {
                break label4;
            }
            field.set(class1, TransitionStringEnum.fromString(jsonobject.getString(((String) (obj)))));
        }
          goto _L9
        if (!((String) (obj1)).equals("class [S")) goto _L11; else goto _L10
_L10:
        obj = jsonobject.optJSONArray(((String) (obj)));
        if (obj == null) goto _L9; else goto _L12
_L12:
        obj1 = new short[((JSONArray) (obj)).length()];
        i = 0;
_L13:
label5:
        {
            if (i < obj1.length)
            {
                break label5;
            }
            field.set(class1, obj1);
        }
          goto _L9
        obj1[i] = (short)((JSONArray) (obj)).getInt(i);
        i++;
          goto _L13
_L11:
        if (!((String) (obj1)).equals("class [Ljava.lang.String;")) goto _L9; else goto _L14
_L14:
        obj = jsonobject.optJSONArray(((String) (obj)));
        if (obj == null) goto _L9; else goto _L15
_L15:
        as = new String[((JSONArray) (obj)).length()];
        i = 0;
_L16:
label6:
        {
            if (i < as.length)
            {
                break label6;
            }
            field.set(class1, as);
        }
          goto _L9
        as[i] = ((JSONArray) (obj)).getString(i);
        i++;
          goto _L16
        numberformatexception;
          goto _L8
    }

    public abstract void stopAllListeners();
}
