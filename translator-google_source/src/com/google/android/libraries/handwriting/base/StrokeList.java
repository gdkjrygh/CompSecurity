// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.handwriting.base:
//            k, Stroke

public class StrokeList extends ArrayList
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    public static final StrokeList EMPTY = new StrokeList();
    public static final String INK = "ink";
    public static final String LANGUAGE = "language";
    public static final String PRE_CONTEXT = "pre_context";
    public static final String WRITING_GUIDE = "writing_guide";
    public static final String WRITING_GUIDE_HEIGHT = "writing_area_height";
    public static final String WRITING_GUIDE_WIDTH = "writing_area_width";
    private static final long serialVersionUID = 1L;
    private final LinkedList cuts;
    private boolean enablePreSpace;
    private int firstStrokeId;
    private int inputType;
    private int lastStrokeId;
    private String postContext;
    private String preContext;
    private String userId;
    private int writingGuideHeight;
    private int writingGuideWidth;

    public StrokeList()
    {
        firstStrokeId = 0;
        lastStrokeId = 0;
        inputType = 0;
        preContext = "";
        postContext = "";
        userId = "";
        enablePreSpace = false;
        cuts = new LinkedList();
    }

    public StrokeList(int i)
    {
        super(i);
        firstStrokeId = 0;
        lastStrokeId = 0;
        inputType = 0;
        preContext = "";
        postContext = "";
        userId = "";
        enablePreSpace = false;
        cuts = new LinkedList();
    }

    public StrokeList(Parcel parcel)
    {
        this();
        readFromParcel(parcel);
    }

    public StrokeList(StrokeList strokelist, boolean flag)
    {
        super(strokelist.size());
        firstStrokeId = 0;
        lastStrokeId = 0;
        inputType = 0;
        preContext = "";
        postContext = "";
        userId = "";
        enablePreSpace = false;
        cuts = new LinkedList();
        writingGuideHeight = strokelist.writingGuideHeight;
        writingGuideWidth = strokelist.writingGuideWidth;
        inputType = strokelist.inputType;
        firstStrokeId = strokelist.firstStrokeId;
        lastStrokeId = strokelist.lastStrokeId;
        enablePreSpace = strokelist.enablePreSpace;
        if (flag)
        {
            preContext = strokelist.preContext;
            postContext = strokelist.postContext;
            userId = strokelist.userId;
            for (strokelist = strokelist.iterator(); strokelist.hasNext(); add(new Stroke((Stroke)strokelist.next()))) { }
        } else
        {
            preContext = strokelist.preContext;
            postContext = strokelist.postContext;
            userId = strokelist.userId;
            addAll(strokelist);
        }
    }

    public StrokeList(JSONObject jsonobject)
    {
        firstStrokeId = 0;
        lastStrokeId = 0;
        inputType = 0;
        preContext = "";
        postContext = "";
        userId = "";
        enablePreSpace = false;
        cuts = new LinkedList();
        parseFromJsonArray(jsonobject.getJSONArray("ink"));
        writingGuideWidth = jsonobject.getJSONObject("writing_guide").getInt("writing_area_width");
        writingGuideHeight = jsonobject.getJSONObject("writing_guide").getInt("writing_area_height");
        preContext = jsonobject.optString("pre_context", "");
    }

    private static double a(double d)
    {
        double d1 = d;
        if (android.os.Build.VERSION.SDK_INT > 6)
        {
            d1 = Double.parseDouble(String.format(Locale.ENGLISH, "%.4e", new Object[] {
                Double.valueOf(d)
            }));
        }
        return d1;
    }

    public void addCut(int i, int j)
    {
        cuts.add(new Cut(i, j));
    }

    public void addCut(int i, int j, float f, Cut.CutType cuttype)
    {
        cuts.add(new Cut(i, j, f, cuttype));
    }

    public JSONArray asJsonArray()
    {
        JSONArray jsonarray = new JSONArray();
        Iterator iterator = iterator();
        long l = -1L;
        JSONArray jsonarray1;
        for (; iterator.hasNext(); jsonarray.put(jsonarray1))
        {
            Object obj = (Stroke)iterator.next();
            jsonarray1 = new JSONArray();
            JSONArray jsonarray2 = new JSONArray();
            for (Iterator iterator1 = ((Stroke) (obj)).iterator(); iterator1.hasNext(); jsonarray2.put(a(((Stroke.Point)iterator1.next()).a))) { }
            jsonarray1.put(jsonarray2);
            jsonarray2 = new JSONArray();
            for (Iterator iterator2 = ((Stroke) (obj)).iterator(); iterator2.hasNext(); jsonarray2.put(a(((Stroke.Point)iterator2.next()).b))) { }
            jsonarray1.put(jsonarray2);
            jsonarray2 = new JSONArray();
            for (Iterator iterator3 = ((Stroke) (obj)).iterator(); iterator3.hasNext();)
            {
                Stroke.Point point = (Stroke.Point)iterator3.next();
                long l1 = l;
                if (l == -1L)
                {
                    l1 = point.c;
                }
                jsonarray2.put(point.c - l1);
                l = l1;
            }

            jsonarray1.put(jsonarray2);
            jsonarray2 = new JSONArray();
            for (obj = ((Stroke) (obj)).iterator(); ((Iterator) (obj)).hasNext(); jsonarray2.put(a(((Stroke.Point)((Iterator) (obj)).next()).d))) { }
            jsonarray1.put(jsonarray2);
        }

        return jsonarray;
    }

    public JSONObject asJsonObject()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("ink", asJsonArray());
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("writing_area_width", getWritingGuideWidth());
        jsonobject1.put("writing_area_height", getWritingGuideHeight());
        jsonobject.put("writing_guide", jsonobject1);
        if (preContext != null && preContext.length() > 0)
        {
            jsonobject.put("pre_context", preContext);
        }
        return jsonobject;
    }

    public LinkedList cuts()
    {
        return cuts;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equivalent(StrokeList strokelist)
    {
        boolean flag2 = false;
        if (strokelist != this) goto _L2; else goto _L1
_L1:
        boolean flag1 = true;
_L4:
        return flag1;
_L2:
        flag1 = flag2;
        if (strokelist == null) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (size() != strokelist.size()) goto _L4; else goto _L5
_L5:
        Stroke stroke;
        Stroke stroke1;
        boolean flag;
        int i;
        for (i = size() - 1; i < 0;)
        {
            break MISSING_BLOCK_LABEL_263;
        }

        stroke = (Stroke)get(i);
        stroke1 = (Stroke)strokelist.get(i);
        if (stroke1 == stroke)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        if (stroke1 == null)
        {
            flag = false;
        } else
        {
label0:
            {
                if (stroke.a.size() == stroke1.a.size())
                {
                    break label0;
                }
                flag = false;
            }
        }
_L7:
        flag1 = flag2;
        if (!flag) goto _L4; else goto _L6
_L6:
        i--;
          goto _L5
        int j = 0;
_L8:
label1:
        {
            if (j >= stroke.a.size())
            {
                break MISSING_BLOCK_LABEL_257;
            }
            Stroke.Point point = stroke.a(j);
            Stroke.Point point1 = stroke1.a(j);
            if (point1 == point)
            {
                flag = true;
            } else
            if (point1 != null && point.a == point1.a && point.b == point1.b && point.c == point1.c && point.d == point1.d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                break label1;
            }
            flag = false;
        }
          goto _L7
        j++;
          goto _L8
        flag = true;
          goto _L7
        return true;
          goto _L5
    }

    public boolean getEnablePreSpace()
    {
        return enablePreSpace;
    }

    public Stroke getFirst()
    {
        return (Stroke)get(0);
    }

    public int getFirstStrokeId()
    {
        return firstStrokeId;
    }

    public int getInputType()
    {
        return inputType;
    }

    public Stroke getLast()
    {
        return (Stroke)get(size() - 1);
    }

    public int getLastStrokeId()
    {
        return lastStrokeId;
    }

    public String getPostContext()
    {
        return postContext;
    }

    public String getPreContext()
    {
        return preContext;
    }

    public String getUserId()
    {
        return userId;
    }

    public int getWritingGuideHeight()
    {
        return writingGuideHeight;
    }

    public int getWritingGuideWidth()
    {
        return writingGuideWidth;
    }

    public String logString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ink with ").append(size()).append(" strokes.\n");
        stringbuilder.append("writing guide ").append(writingGuideWidth).append(" x ").append(writingGuideHeight);
        stringbuilder.append(" inputType: ").append(inputType);
        stringbuilder.append(" precontext: ").append(preContext);
        stringbuilder.append(" postcontext: ").append(postContext);
        stringbuilder.append(" userId: ").append(userId);
        for (int i = 0; i < size(); i++)
        {
            Stroke stroke = (Stroke)get(i);
            stringbuilder.append("   stroke ");
            stringbuilder.append(i);
            stringbuilder.append(":");
            for (int j = 0; j < stroke.a.size(); j++)
            {
                stringbuilder.append("[");
                stringbuilder.append(stroke.a(j).a);
                stringbuilder.append(",");
                stringbuilder.append(stroke.a(j).b);
                stringbuilder.append(",");
                stringbuilder.append(stroke.a(j).c);
                stringbuilder.append(",");
                stringbuilder.append(stroke.a(j).d);
                stringbuilder.append("],");
            }

            stringbuilder.append("\n");
        }

        return stringbuilder.toString();
    }

    public void parseFromJsonArray(JSONArray jsonarray)
    {
        int l = jsonarray.length();
        clear();
        int i = 0;
        while (i < l) 
        {
            JSONArray jsonarray5 = jsonarray.getJSONArray(i);
            Stroke stroke = new Stroke();
            JSONArray jsonarray3 = jsonarray5.getJSONArray(0);
            JSONArray jsonarray4 = jsonarray5.getJSONArray(1);
            JSONArray jsonarray2 = null;
            JSONArray jsonarray1;
            int j;
            if (jsonarray5.length() > 2)
            {
                jsonarray1 = jsonarray5.getJSONArray(2);
                if (jsonarray5.length() > 3)
                {
                    jsonarray2 = jsonarray5.getJSONArray(3);
                }
            } else
            {
                jsonarray1 = null;
            }
            j = 0;
            while (j < jsonarray3.length()) 
            {
                if (jsonarray1 != null)
                {
                    if (jsonarray2 != null)
                    {
                        stroke.a((float)jsonarray3.getDouble(j), (float)jsonarray4.getDouble(j), jsonarray1.getLong(j), (float)jsonarray2.getDouble(j));
                    } else
                    {
                        stroke.a((float)jsonarray3.getDouble(j), (float)jsonarray4.getDouble(j), jsonarray1.getLong(j), 1.0F);
                    }
                } else
                {
                    stroke.a((float)jsonarray3.getDouble(j), (float)jsonarray4.getDouble(j), 0L, 1.0F);
                }
                j++;
            }
            add(stroke);
            i++;
        }
    }

    public void readFromParcel(Parcel parcel)
    {
        writingGuideWidth = parcel.readInt();
        writingGuideHeight = parcel.readInt();
        inputType = parcel.readInt();
        boolean flag;
        if (parcel.readByte() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        enablePreSpace = flag;
        preContext = parcel.readString();
        postContext = parcel.readString();
        userId = parcel.readString();
        firstStrokeId = parcel.readInt();
        lastStrokeId = parcel.readInt();
        parcel.readTypedList(this, Stroke.CREATOR);
    }

    public void setCuts(LinkedList linkedlist)
    {
        cuts.clear();
        cuts.addAll(linkedlist);
    }

    public void setEnablePreSpace(boolean flag)
    {
        enablePreSpace = flag;
    }

    public void setFirstStrokeId(int i)
    {
        firstStrokeId = i;
    }

    public void setInputType(int i)
    {
        inputType = i;
    }

    public void setLastStrokeId(int i)
    {
        lastStrokeId = i;
    }

    public void setPostContext(String s)
    {
        postContext = s;
    }

    public void setPreContext(String s)
    {
        preContext = s;
    }

    public void setUserId(String s)
    {
        userId = s;
    }

    public void setWritingGuide(int i, int j)
    {
        writingGuideWidth = i;
        writingGuideHeight = j;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(writingGuideWidth);
        parcel.writeInt(writingGuideHeight);
        parcel.writeInt(inputType);
        if (enablePreSpace)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        parcel.writeString(preContext);
        parcel.writeString(postContext);
        parcel.writeString(userId);
        parcel.writeInt(firstStrokeId);
        parcel.writeInt(lastStrokeId);
        parcel.writeTypedList(this);
    }


    private class Cut
    {

        public final int a;
        public final int b;
        public final float c;
        public final CutType d;

        public Cut(int i, int j)
        {
            a = i;
            b = j;
            c = 0.0F;
            class CutType extends Enum
            {

                public static final CutType BETWEEN;
                public static final CutType CLASSIFIER;
                public static final CutType DEPRECATED_RENDERED;
                public static final CutType EVERY_POINT;
                public static final CutType MAXIMUM;
                public static final CutType MINIMUM;
                public static final CutType MONOTONIC;
                public static final CutType OVERWRITE;
                public static final CutType STROKES;
                public static final CutType VELOCITY;
                private static final CutType a[];

                public static CutType valueOf(String s)
                {
                    return (CutType)Enum.valueOf(com/google/android/libraries/handwriting/base/StrokeList$Cut$CutType, s);
                }

                public static CutType[] values()
                {
                    return (CutType[])a.clone();
                }

                static 
                {
                    STROKES = new CutType("STROKES", 0);
                    MINIMUM = new CutType("MINIMUM", 1);
                    MAXIMUM = new CutType("MAXIMUM", 2);
                    BETWEEN = new CutType("BETWEEN", 3);
                    VELOCITY = new CutType("VELOCITY", 4);
                    DEPRECATED_RENDERED = new CutType("DEPRECATED_RENDERED", 5);
                    MONOTONIC = new CutType("MONOTONIC", 6);
                    OVERWRITE = new CutType("OVERWRITE", 7);
                    CLASSIFIER = new CutType("CLASSIFIER", 8);
                    EVERY_POINT = new CutType("EVERY_POINT", 9);
                    a = (new CutType[] {
                        STROKES, MINIMUM, MAXIMUM, BETWEEN, VELOCITY, DEPRECATED_RENDERED, MONOTONIC, OVERWRITE, CLASSIFIER, EVERY_POINT
                    });
                }

                private CutType(String s, int i)
                {
                    super(s, i);
                }
            }

            d = CutType.STROKES;
        }

        public Cut(int i, int j, float f, CutType cuttype)
        {
            a = i;
            b = j;
            c = f;
            d = cuttype;
        }
    }

}
