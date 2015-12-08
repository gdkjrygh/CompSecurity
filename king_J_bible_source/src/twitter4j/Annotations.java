// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package twitter4j:
//            Annotation

public class Annotations
    implements Serializable
{

    public static final int lengthLimit = 512;
    private static final long serialVersionUID = 0x6e08dab641ae27cdL;
    private List annotations;

    public Annotations()
    {
        annotations = null;
        setAnnotations(null);
    }

    public Annotations(List list)
    {
        annotations = null;
        setAnnotations(list);
    }

    public Annotations(JSONArray jsonarray)
    {
        int i;
        annotations = null;
        setAnnotations(null);
        i = 0;
_L2:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        addAnnotation(new Annotation(jsonarray.getJSONObject(i)));
        i++;
        if (true) goto _L2; else goto _L1
        jsonarray;
        annotations.clear();
_L1:
    }

    private List getSortedAnnotations()
    {
        ArrayList arraylist = new ArrayList(size().intValue());
        arraylist.addAll(annotations);
        Collections.sort(arraylist);
        return arraylist;
    }

    public static boolean isExceedingLengthLimit(Annotations annotations1)
    {
        return annotations1.asParameterValue().length() > 512;
    }

    public void addAnnotation(Annotation annotation1)
    {
        annotations.add(annotation1);
    }

    public Annotations annotation(Annotation annotation1)
    {
        addAnnotation(annotation1);
        return this;
    }

    String asParameterValue()
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = annotations.iterator(); iterator.hasNext(); jsonarray.put(((Annotation)iterator.next()).asJSONObject())) { }
        return jsonarray.toString();
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (this == obj) goto _L4; else goto _L3
_L3:
        if (!(obj instanceof Annotations))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((Annotations)obj).getSortedAnnotations().equals(getSortedAnnotations())) goto _L4; else goto _L5
_L5:
        return false;
    }

    public List getAnnotations()
    {
        return annotations;
    }

    public int hashCode()
    {
        return getSortedAnnotations().hashCode();
    }

    public boolean isEmpty()
    {
        return annotations.isEmpty();
    }

    public boolean isExceedingLengthLimit()
    {
        return isExceedingLengthLimit(this);
    }

    public void setAnnotations(List list)
    {
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        annotations = ((List) (obj));
    }

    public Integer size()
    {
        return new Integer(annotations.size());
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer("Annotations{");
        for (int i = 0; i < size().intValue(); i++)
        {
            if (i > 0)
            {
                stringbuffer.append(", ");
            }
            stringbuffer.append(((Annotation)annotations.get(i)).toString());
        }

        stringbuffer.append('}');
        return stringbuffer.toString();
    }
}
