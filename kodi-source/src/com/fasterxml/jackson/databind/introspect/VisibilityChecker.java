// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedMember, AnnotatedField, AnnotatedMethod

public interface VisibilityChecker
{
    public static class Std
        implements VisibilityChecker, Serializable
    {

        protected static final Std DEFAULT = new Std((JsonAutoDetect)com/fasterxml/jackson/databind/introspect/VisibilityChecker$Std.getAnnotation(com/fasterxml/jackson/annotation/JsonAutoDetect));
        protected final com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility _creatorMinLevel;
        protected final com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility _fieldMinLevel;
        protected final com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility _getterMinLevel;
        protected final com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility _isGetterMinLevel;
        protected final com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility _setterMinLevel;

        public static Std defaultInstance()
        {
            return DEFAULT;
        }

        public boolean isCreatorVisible(AnnotatedMember annotatedmember)
        {
            return isCreatorVisible(annotatedmember.getMember());
        }

        public boolean isCreatorVisible(Member member)
        {
            return _creatorMinLevel.isVisible(member);
        }

        public boolean isFieldVisible(AnnotatedField annotatedfield)
        {
            return isFieldVisible(annotatedfield.getAnnotated());
        }

        public boolean isFieldVisible(Field field)
        {
            return _fieldMinLevel.isVisible(field);
        }

        public boolean isGetterVisible(AnnotatedMethod annotatedmethod)
        {
            return isGetterVisible(annotatedmethod.getAnnotated());
        }

        public boolean isGetterVisible(Method method)
        {
            return _getterMinLevel.isVisible(method);
        }

        public boolean isIsGetterVisible(AnnotatedMethod annotatedmethod)
        {
            return isIsGetterVisible(annotatedmethod.getAnnotated());
        }

        public boolean isIsGetterVisible(Method method)
        {
            return _isGetterMinLevel.isVisible(method);
        }

        public boolean isSetterVisible(AnnotatedMethod annotatedmethod)
        {
            return isSetterVisible(annotatedmethod.getAnnotated());
        }

        public boolean isSetterVisible(Method method)
        {
            return _setterMinLevel.isVisible(method);
        }

        public String toString()
        {
            return (new StringBuilder("[Visibility:")).append(" getter: ").append(_getterMinLevel).append(", isGetter: ").append(_isGetterMinLevel).append(", setter: ").append(_setterMinLevel).append(", creator: ").append(_creatorMinLevel).append(", field: ").append(_fieldMinLevel).append("]").toString();
        }

        public Std with(JsonAutoDetect jsonautodetect)
        {
            Std std = this;
            Std std1 = std;
            if (jsonautodetect != null)
            {
                std1 = std.withGetterVisibility(jsonautodetect.getterVisibility()).withIsGetterVisibility(jsonautodetect.isGetterVisibility()).withSetterVisibility(jsonautodetect.setterVisibility()).withCreatorVisibility(jsonautodetect.creatorVisibility()).withFieldVisibility(jsonautodetect.fieldVisibility());
            }
            return std1;
        }

        public volatile VisibilityChecker with(JsonAutoDetect jsonautodetect)
        {
            return with(jsonautodetect);
        }

        public Std withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
        {
            com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1 = visibility;
            if (visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
            {
                visibility1 = DEFAULT._creatorMinLevel;
            }
            if (_creatorMinLevel == visibility1)
            {
                return this;
            } else
            {
                return new Std(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, visibility1, _fieldMinLevel);
            }
        }

        public volatile VisibilityChecker withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
        {
            return withCreatorVisibility(visibility);
        }

        public Std withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
        {
            com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1 = visibility;
            if (visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
            {
                visibility1 = DEFAULT._fieldMinLevel;
            }
            if (_fieldMinLevel == visibility1)
            {
                return this;
            } else
            {
                return new Std(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, visibility1);
            }
        }

        public volatile VisibilityChecker withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
        {
            return withFieldVisibility(visibility);
        }

        public Std withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
        {
            com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1 = visibility;
            if (visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
            {
                visibility1 = DEFAULT._getterMinLevel;
            }
            if (_getterMinLevel == visibility1)
            {
                return this;
            } else
            {
                return new Std(visibility1, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
            }
        }

        public volatile VisibilityChecker withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
        {
            return withGetterVisibility(visibility);
        }

        public Std withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
        {
            com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1 = visibility;
            if (visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
            {
                visibility1 = DEFAULT._isGetterMinLevel;
            }
            if (_isGetterMinLevel == visibility1)
            {
                return this;
            } else
            {
                return new Std(_getterMinLevel, visibility1, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
            }
        }

        public volatile VisibilityChecker withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
        {
            return withIsGetterVisibility(visibility);
        }

        public Std withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
        {
            com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1 = visibility;
            if (visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
            {
                visibility1 = DEFAULT._setterMinLevel;
            }
            if (_setterMinLevel == visibility1)
            {
                return this;
            } else
            {
                return new Std(_getterMinLevel, _isGetterMinLevel, visibility1, _creatorMinLevel, _fieldMinLevel);
            }
        }

        public volatile VisibilityChecker withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
        {
            return withSetterVisibility(visibility);
        }


        public Std(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility2, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility3, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility4)
        {
            _getterMinLevel = visibility;
            _isGetterMinLevel = visibility1;
            _setterMinLevel = visibility2;
            _creatorMinLevel = visibility3;
            _fieldMinLevel = visibility4;
        }

        public Std(JsonAutoDetect jsonautodetect)
        {
            _getterMinLevel = jsonautodetect.getterVisibility();
            _isGetterMinLevel = jsonautodetect.isGetterVisibility();
            _setterMinLevel = jsonautodetect.setterVisibility();
            _creatorMinLevel = jsonautodetect.creatorVisibility();
            _fieldMinLevel = jsonautodetect.fieldVisibility();
        }
    }


    public abstract boolean isCreatorVisible(AnnotatedMember annotatedmember);

    public abstract boolean isFieldVisible(AnnotatedField annotatedfield);

    public abstract boolean isGetterVisible(AnnotatedMethod annotatedmethod);

    public abstract boolean isIsGetterVisible(AnnotatedMethod annotatedmethod);

    public abstract boolean isSetterVisible(AnnotatedMethod annotatedmethod);

    public abstract VisibilityChecker with(JsonAutoDetect jsonautodetect);

    public abstract VisibilityChecker withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);
}
