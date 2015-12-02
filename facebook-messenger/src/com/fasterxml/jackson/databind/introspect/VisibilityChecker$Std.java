// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            VisibilityChecker, AnnotatedMember, AnnotatedField, AnnotatedMethod

public class _fieldMinLevel
    implements VisibilityChecker
{

    protected static final withVisibility DEFAULT = new <init>((JsonAutoDetect)com/fasterxml/jackson/databind/introspect/VisibilityChecker$Std.getAnnotation(com/fasterxml/jackson/annotation/JsonAutoDetect));
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

    public _fieldMinLevel with(com.fasterxml.jackson.annotation.ity ity)
    {
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            return DEFAULT;
        } else
        {
            return new <init>(ity);
        }
    }

    public <init> with(JsonAutoDetect jsonautodetect)
    {
        <init> <init>1 = this;
        if (jsonautodetect != null)
        {
            <init>1 = withGetterVisibility(jsonautodetect.getterVisibility()).withIsGetterVisibility(jsonautodetect.isGetterVisibility()).withSetterVisibility(jsonautodetect.setterVisibility()).withCreatorVisibility(jsonautodetect.creatorVisibility()).withFieldVisibility(jsonautodetect.fieldVisibility());
        }
        return <init>1;
    }

    public volatile VisibilityChecker with(com.fasterxml.jackson.annotation.ity ity)
    {
        return with(ity);
    }

    public volatile VisibilityChecker with(JsonAutoDetect jsonautodetect)
    {
        return with(jsonautodetect);
    }

    public with withCreatorVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            ity = DEFAULT._creatorMinLevel;
        }
        if (_creatorMinLevel == ity)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, ity, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withCreatorVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        return withCreatorVisibility(ity);
    }

    public withCreatorVisibility withFieldVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            ity = DEFAULT._fieldMinLevel;
        }
        if (_fieldMinLevel == ity)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, ity);
        }
    }

    public volatile VisibilityChecker withFieldVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        return withFieldVisibility(ity);
    }

    public withFieldVisibility withGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            ity = DEFAULT._getterMinLevel;
        }
        if (_getterMinLevel == ity)
        {
            return this;
        } else
        {
            return new <init>(ity, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        return withGetterVisibility(ity);
    }

    public withGetterVisibility withIsGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            ity = DEFAULT._isGetterMinLevel;
        }
        if (_isGetterMinLevel == ity)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, ity, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withIsGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        return withIsGetterVisibility(ity);
    }

    public withIsGetterVisibility withSetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            ity = DEFAULT._setterMinLevel;
        }
        if (_setterMinLevel == ity)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, _isGetterMinLevel, ity, _creatorMinLevel, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withSetterVisibility(com.fasterxml.jackson.annotation.ity ity)
    {
        return withSetterVisibility(ity);
    }

    public withSetterVisibility withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.ity ity)
    {
        switch (witchMap.com.fasterxml.jackson.annotation.PropertyAccessor[propertyaccessor.ordinal()])
        {
        default:
            return this;

        case 1: // '\001'
            return withGetterVisibility(ity);

        case 2: // '\002'
            return withSetterVisibility(ity);

        case 3: // '\003'
            return withCreatorVisibility(ity);

        case 4: // '\004'
            return withFieldVisibility(ity);

        case 5: // '\005'
            return withIsGetterVisibility(ity);

        case 6: // '\006'
            return with(ity);
        }
    }

    public volatile VisibilityChecker withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.ity ity)
    {
        return withVisibility(propertyaccessor, ity);
    }


    public (com.fasterxml.jackson.annotation.ity ity)
    {
        if (ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
        {
            _getterMinLevel = DEFAULT._getterMinLevel;
            _isGetterMinLevel = DEFAULT._isGetterMinLevel;
            _setterMinLevel = DEFAULT._setterMinLevel;
            _creatorMinLevel = DEFAULT._creatorMinLevel;
            _fieldMinLevel = DEFAULT._fieldMinLevel;
            return;
        } else
        {
            _getterMinLevel = ity;
            _isGetterMinLevel = ity;
            _setterMinLevel = ity;
            _creatorMinLevel = ity;
            _fieldMinLevel = ity;
            return;
        }
    }

    public _fieldMinLevel(com.fasterxml.jackson.annotation.ity ity, com.fasterxml.jackson.annotation.ity ity1, com.fasterxml.jackson.annotation.ity ity2, com.fasterxml.jackson.annotation.ity ity3, com.fasterxml.jackson.annotation.ity ity4)
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
