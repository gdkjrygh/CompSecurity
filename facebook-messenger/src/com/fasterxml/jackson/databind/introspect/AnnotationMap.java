// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class AnnotationMap
    implements Annotations
{

    protected HashMap _annotations;

    public AnnotationMap()
    {
    }

    private AnnotationMap(HashMap hashmap)
    {
        _annotations = hashmap;
    }

    public static AnnotationMap merge(AnnotationMap annotationmap, AnnotationMap annotationmap1)
    {
        AnnotationMap annotationmap2;
        if (annotationmap == null || annotationmap._annotations == null || annotationmap._annotations.isEmpty())
        {
            annotationmap2 = annotationmap1;
        } else
        {
            annotationmap2 = annotationmap;
            if (annotationmap1 != null)
            {
                annotationmap2 = annotationmap;
                if (annotationmap1._annotations != null)
                {
                    annotationmap2 = annotationmap;
                    if (!annotationmap1._annotations.isEmpty())
                    {
                        HashMap hashmap = new HashMap();
                        Annotation annotation;
                        for (annotationmap1 = annotationmap1._annotations.values().iterator(); annotationmap1.hasNext(); hashmap.put(annotation.annotationType(), annotation))
                        {
                            annotation = (Annotation)annotationmap1.next();
                        }

                        for (annotationmap = annotationmap._annotations.values().iterator(); annotationmap.hasNext(); hashmap.put(annotationmap1.annotationType(), annotationmap1))
                        {
                            annotationmap1 = (Annotation)annotationmap.next();
                        }

                        return new AnnotationMap(hashmap);
                    }
                }
            }
        }
        return annotationmap2;
    }

    protected final void _add(Annotation annotation)
    {
        if (_annotations == null)
        {
            _annotations = new HashMap();
        }
        _annotations.put(annotation.annotationType(), annotation);
    }

    public void add(Annotation annotation)
    {
        _add(annotation);
    }

    public void addIfNotPresent(Annotation annotation)
    {
        if (_annotations == null || !_annotations.containsKey(annotation.annotationType()))
        {
            _add(annotation);
        }
    }

    public Annotation get(Class class1)
    {
        if (_annotations == null)
        {
            return null;
        } else
        {
            return (Annotation)_annotations.get(class1);
        }
    }

    public int size()
    {
        if (_annotations == null)
        {
            return 0;
        } else
        {
            return _annotations.size();
        }
    }

    public String toString()
    {
        if (_annotations == null)
        {
            return "[null]";
        } else
        {
            return _annotations.toString();
        }
    }
}
