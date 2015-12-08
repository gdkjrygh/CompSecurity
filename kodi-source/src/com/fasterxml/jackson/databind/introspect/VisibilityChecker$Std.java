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
//            VisibilityChecker, AnnotatedMember, AnnotatedField, AnnotatedMethod

public static class _fieldMinLevel
    implements VisibilityChecker, Serializable
{

    protected static final withSetterVisibility DEFAULT = new <init>((JsonAutoDetect)com/fasterxml/jackson/databind/introspect/VisibilityChecker$Std.getAnnotation(com/fasterxml/jackson/annotation/JsonAutoDetect));
    protected final com.fasterxml.jackson.annotation.ity _creatorMinLevel;
    protected final com.fasterxml.jackson.annotation.ity _fieldMinLevel;
    protected final com.fasterxml.jackson.annotation.ity _getterMinLevel;
    protected final com.fasterxml.jackson.annotation.ity _isGetterMinLevel;
    protected final com.fasterxml.jackson.annotation.ity _setterMinLevel;

    public static _fieldMinLevel defaultInstance()
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

    public _fieldMinLevel with(JsonAutoDetect jsonautodetect)
    {
        _fieldMinLevel _lfieldminlevel = this;
        _fieldMinLevel _lfieldminlevel1 = _lfieldminlevel;
        if (jsonautodetect != null)
        {
            _lfieldminlevel1 = _lfieldminlevel.withGetterVisibility(jsonautodetect.getterVisibility()).withIsGetterVisibility(jsonautodetect.isGetterVisibility()).withSetterVisibility(jsonautodetect.setterVisibility()).withCreatorVisibility(jsonautodetect.creatorVisibility()).withFieldVisibility(jsonautodetect.fieldVisibility());
        }
        return _lfieldminlevel1;
    }

    public volatile VisibilityChecker with(JsonAutoDetect jsonautodetect)
    {
        return with(jsonautodetect);
    }

    public with withCreatorVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        com.fasterxml.jackson.annotation.ity ity1 = ity;
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            ity1 = DEFAULT._creatorMinLevel;
        }
        if (_creatorMinLevel == ity1)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, ity1, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withCreatorVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        return withCreatorVisibility(ity);
    }

    public withCreatorVisibility withFieldVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        com.fasterxml.jackson.annotation.ity ity1 = ity;
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            ity1 = DEFAULT._fieldMinLevel;
        }
        if (_fieldMinLevel == ity1)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, ity1);
        }
    }

    public volatile VisibilityChecker withFieldVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        return withFieldVisibility(ity);
    }

    public withFieldVisibility withGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        com.fasterxml.jackson.annotation.ity ity1 = ity;
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            ity1 = DEFAULT._getterMinLevel;
        }
        if (_getterMinLevel == ity1)
        {
            return this;
        } else
        {
            return new <init>(ity1, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        return withGetterVisibility(ity);
    }

    public withGetterVisibility withIsGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        com.fasterxml.jackson.annotation.ity ity1 = ity;
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            ity1 = DEFAULT._isGetterMinLevel;
        }
        if (_isGetterMinLevel == ity1)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, ity1, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withIsGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        return withIsGetterVisibility(ity);
    }

    public withIsGetterVisibility withSetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        com.fasterxml.jackson.annotation.ity ity1 = ity;
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            ity1 = DEFAULT._setterMinLevel;
        }
        if (_setterMinLevel == ity1)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, _isGetterMinLevel, ity1, _creatorMinLevel, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withSetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        return withSetterVisibility(ity);
    }


    public (com.fasterxml.jackson.annotation.ity ity, com.fasterxml.jackson.annotation.ity ity1, com.fasterxml.jackson.annotation.ity ity2, com.fasterxml.jackson.annotation.ity ity3, com.fasterxml.jackson.annotation.ity ity4)
    {
        _getterMinLevel = ity;
        _isGetterMinLevel = ity1;
        _setterMinLevel = ity2;
        _creatorMinLevel = ity3;
        _fieldMinLevel = ity4;
    }

    public _fieldMinLevel(JsonAutoDetect jsonautodetect)
    {
        _getterMinLevel = jsonautodetect.getterVisibility();
        _isGetterMinLevel = jsonautodetect.isGetterVisibility();
        _setterMinLevel = jsonautodetect.setterVisibility();
        _creatorMinLevel = jsonautodetect.creatorVisibility();
        _fieldMinLevel = jsonautodetect.fieldVisibility();
    }
}
