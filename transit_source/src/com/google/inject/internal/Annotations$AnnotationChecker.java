// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$Function;
import com.google.inject.internal.util.$MapMaker;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.inject.internal:
//            Annotations

static class annotationTypes
{

    private final Collection annotationTypes;
    final Map cache;
    private $Function hasAnnotations;

    boolean hasAnnotations(Class class1)
    {
        return ((Boolean)cache.get(class1)).booleanValue();
    }


    _cls1.this._cls0(Collection collection)
    {
        hasAnnotations = new $Function() {

            final Annotations.AnnotationChecker this$0;

            public Boolean apply(Class class1)
            {
                class1 = class1.getAnnotations();
                int j = class1.length;
                for (int i = 0; i < j; i++)
                {
                    Annotation annotation = class1[i];
                    if (annotationTypes.contains(annotation.annotationType()))
                    {
                        return Boolean.valueOf(true);
                    }
                }

                return Boolean.valueOf(false);
            }

            public volatile Object apply(Object obj)
            {
                return apply((Class)obj);
            }

            
            {
                this$0 = Annotations.AnnotationChecker.this;
                super();
            }
        };
        cache = (new $MapMaker()).weakKeys().makeComputingMap(hasAnnotations);
        annotationTypes = collection;
    }
}
