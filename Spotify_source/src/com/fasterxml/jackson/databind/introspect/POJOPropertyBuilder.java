// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            BeanPropertyDefinition, AnnotatedMember, AnnotationMap, AnnotatedMethod, 
//            ObjectIdInfo, AnnotatedParameter, AnnotatedConstructor, AnnotatedField

public class POJOPropertyBuilder extends BeanPropertyDefinition
    implements Comparable
{

    protected final AnnotationIntrospector _annotationIntrospector;
    protected Linked _ctorParameters;
    protected Linked _fields;
    protected final boolean _forSerialization;
    protected Linked _getters;
    protected final PropertyName _internalName;
    protected final PropertyName _name;
    protected Linked _setters;

    public POJOPropertyBuilder(PropertyName propertyname, AnnotationIntrospector annotationintrospector, boolean flag)
    {
        this(propertyname, propertyname, annotationintrospector, flag);
    }

    protected POJOPropertyBuilder(PropertyName propertyname, PropertyName propertyname1, AnnotationIntrospector annotationintrospector, boolean flag)
    {
        _internalName = propertyname;
        _name = propertyname1;
        _annotationIntrospector = annotationintrospector;
        _forSerialization = flag;
    }

    public POJOPropertyBuilder(POJOPropertyBuilder pojopropertybuilder, PropertyName propertyname)
    {
        _internalName = pojopropertybuilder._internalName;
        _name = propertyname;
        _annotationIntrospector = pojopropertybuilder._annotationIntrospector;
        _fields = pojopropertybuilder._fields;
        _ctorParameters = pojopropertybuilder._ctorParameters;
        _getters = pojopropertybuilder._getters;
        _setters = pojopropertybuilder._setters;
        _forSerialization = pojopropertybuilder._forSerialization;
    }

    private boolean _anyExplicitNames(Linked linked)
    {
        for (; linked != null; linked = linked.next)
        {
            if (linked.name != null && linked.isNameExplicit)
            {
                return true;
            }
        }

        return false;
    }

    private boolean _anyExplicits(Linked linked)
    {
        for (; linked != null; linked = linked.next)
        {
            if (linked.name != null && linked.name.hasSimpleName())
            {
                return true;
            }
        }

        return false;
    }

    private boolean _anyIgnorals(Linked linked)
    {
        for (; linked != null; linked = linked.next)
        {
            if (linked.isMarkedIgnored)
            {
                return true;
            }
        }

        return false;
    }

    private boolean _anyVisible(Linked linked)
    {
        for (; linked != null; linked = linked.next)
        {
            if (linked.isVisible)
            {
                return true;
            }
        }

        return false;
    }

    private void _explode(Collection collection, Map map, Linked linked)
    {
        Linked linked1 = linked;
        while (linked1 != null) 
        {
            PropertyName propertyname = linked1.name;
            if (!linked1.isNameExplicit || propertyname == null)
            {
                if (linked1.isVisible)
                {
                    throw new IllegalStateException((new StringBuilder("Conflicting/ambiguous property name definitions (implicit name '")).append(_name).append("'): found multiple explicit names: ").append(collection).append(", but also implicit accessor: ").append(linked1).toString());
                }
            } else
            {
                POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)map.get(propertyname);
                POJOPropertyBuilder pojopropertybuilder = pojopropertybuilder1;
                if (pojopropertybuilder1 == null)
                {
                    pojopropertybuilder = new POJOPropertyBuilder(_internalName, propertyname, _annotationIntrospector, _forSerialization);
                    map.put(propertyname, pojopropertybuilder);
                }
                if (linked == _fields)
                {
                    pojopropertybuilder._fields = linked1.withNext(pojopropertybuilder._fields);
                } else
                if (linked == _getters)
                {
                    pojopropertybuilder._getters = linked1.withNext(pojopropertybuilder._getters);
                } else
                if (linked == _setters)
                {
                    pojopropertybuilder._setters = linked1.withNext(pojopropertybuilder._setters);
                } else
                if (linked == _ctorParameters)
                {
                    pojopropertybuilder._ctorParameters = linked1.withNext(pojopropertybuilder._ctorParameters);
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Internal error: mismatched accessors, property: ")).append(this).toString());
                }
            }
            linked1 = linked1.next;
        }
    }

    private Set _findExplicitNames(Linked linked, Set set)
    {
        Linked linked1 = linked;
        for (linked = set; linked1 != null; linked = set)
        {
            set = linked;
            if (linked1.isNameExplicit)
            {
                set = linked;
                if (linked1.name != null)
                {
                    set = linked;
                    if (linked == null)
                    {
                        set = new HashSet();
                    }
                    set.add(linked1.name);
                }
            }
            linked1 = linked1.next;
        }

        return linked;
    }

    private transient AnnotationMap _mergeAnnotations(int i, Linked alinked[])
    {
        AnnotationMap annotationmap = ((AnnotatedMember)alinked[i].value).getAllAnnotations();
        for (i++; i < alinked.length; i++)
        {
            if (alinked[i] != null)
            {
                return AnnotationMap.merge(annotationmap, _mergeAnnotations(i, alinked));
            }
        }

        return annotationmap;
    }

    private Linked _removeIgnored(Linked linked)
    {
        if (linked == null)
        {
            return linked;
        } else
        {
            return linked.withoutIgnored();
        }
    }

    private Linked _removeNonVisible(Linked linked)
    {
        if (linked == null)
        {
            return linked;
        } else
        {
            return linked.withoutNonVisible();
        }
    }

    private Linked _trimByVisibility(Linked linked)
    {
        if (linked == null)
        {
            return linked;
        } else
        {
            return linked.trimByVisibility();
        }
    }

    private static Linked merge(Linked linked, Linked linked1)
    {
        if (linked == null)
        {
            return linked1;
        }
        if (linked1 == null)
        {
            return linked;
        } else
        {
            return linked.append(linked1);
        }
    }

    protected String _findDescription()
    {
        return (String)fromMemberAnnotations(new WithMember() {

            final POJOPropertyBuilder this$0;

            public volatile Object withMember(AnnotatedMember annotatedmember)
            {
                return withMember(annotatedmember);
            }

            public String withMember(AnnotatedMember annotatedmember)
            {
                return _annotationIntrospector.findPropertyDescription(annotatedmember);
            }

            
            {
                this$0 = POJOPropertyBuilder.this;
                super();
            }
        });
    }

    protected Integer _findIndex()
    {
        return (Integer)fromMemberAnnotations(new WithMember() {

            final POJOPropertyBuilder this$0;

            public Integer withMember(AnnotatedMember annotatedmember)
            {
                return _annotationIntrospector.findPropertyIndex(annotatedmember);
            }

            public volatile Object withMember(AnnotatedMember annotatedmember)
            {
                return withMember(annotatedmember);
            }

            
            {
                this$0 = POJOPropertyBuilder.this;
                super();
            }
        });
    }

    protected Boolean _findRequired()
    {
        return (Boolean)fromMemberAnnotations(new WithMember() {

            final POJOPropertyBuilder this$0;

            public Boolean withMember(AnnotatedMember annotatedmember)
            {
                return _annotationIntrospector.hasRequiredMarker(annotatedmember);
            }

            public volatile Object withMember(AnnotatedMember annotatedmember)
            {
                return withMember(annotatedmember);
            }

            
            {
                this$0 = POJOPropertyBuilder.this;
                super();
            }
        });
    }

    protected int _getterPriority(AnnotatedMethod annotatedmethod)
    {
        byte byte0 = 2;
        annotatedmethod = annotatedmethod.getName();
        if (annotatedmethod.startsWith("get") && annotatedmethod.length() > 3)
        {
            byte0 = 1;
        } else
        if (!annotatedmethod.startsWith("is") || annotatedmethod.length() <= 2)
        {
            return 3;
        }
        return byte0;
    }

    protected int _setterPriority(AnnotatedMethod annotatedmethod)
    {
        annotatedmethod = annotatedmethod.getName();
        return !annotatedmethod.startsWith("set") || annotatedmethod.length() <= 3 ? 2 : 1;
    }

    public void addAll(POJOPropertyBuilder pojopropertybuilder)
    {
        _fields = merge(_fields, pojopropertybuilder._fields);
        _ctorParameters = merge(_ctorParameters, pojopropertybuilder._ctorParameters);
        _getters = merge(_getters, pojopropertybuilder._getters);
        _setters = merge(_setters, pojopropertybuilder._setters);
    }

    public void addCtor(AnnotatedParameter annotatedparameter, PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
    {
        _ctorParameters = new Linked(annotatedparameter, _ctorParameters, propertyname, flag, flag1, flag2);
    }

    public void addField(AnnotatedField annotatedfield, PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
    {
        _fields = new Linked(annotatedfield, _fields, propertyname, flag, flag1, flag2);
    }

    public void addGetter(AnnotatedMethod annotatedmethod, PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
    {
        _getters = new Linked(annotatedmethod, _getters, propertyname, flag, flag1, flag2);
    }

    public void addSetter(AnnotatedMethod annotatedmethod, PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
    {
        _setters = new Linked(annotatedmethod, _setters, propertyname, flag, flag1, flag2);
    }

    public boolean anyIgnorals()
    {
        return _anyIgnorals(_fields) || _anyIgnorals(_getters) || _anyIgnorals(_setters) || _anyIgnorals(_ctorParameters);
    }

    public boolean anyVisible()
    {
        return _anyVisible(_fields) || _anyVisible(_getters) || _anyVisible(_setters) || _anyVisible(_ctorParameters);
    }

    public int compareTo(POJOPropertyBuilder pojopropertybuilder)
    {
        if (_ctorParameters != null)
        {
            if (pojopropertybuilder._ctorParameters == null)
            {
                return -1;
            }
        } else
        if (pojopropertybuilder._ctorParameters != null)
        {
            return 1;
        }
        return getName().compareTo(pojopropertybuilder.getName());
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((POJOPropertyBuilder)obj);
    }

    public boolean couldDeserialize()
    {
        return _ctorParameters != null || _setters != null || _fields != null;
    }

    public Collection explode(Collection collection)
    {
        HashMap hashmap = new HashMap();
        _explode(collection, hashmap, _fields);
        _explode(collection, hashmap, _getters);
        _explode(collection, hashmap, _setters);
        _explode(collection, hashmap, _ctorParameters);
        return hashmap.values();
    }

    public Set findExplicitNames()
    {
        Set set = _findExplicitNames(_fields, null);
        set = _findExplicitNames(_getters, set);
        set = _findExplicitNames(_setters, set);
        Set set1 = _findExplicitNames(_ctorParameters, set);
        set = set1;
        if (set1 == null)
        {
            set = Collections.emptySet();
        }
        return set;
    }

    public ObjectIdInfo findObjectIdInfo()
    {
        return (ObjectIdInfo)fromMemberAnnotations(new WithMember() {

            final POJOPropertyBuilder this$0;

            public ObjectIdInfo withMember(AnnotatedMember annotatedmember)
            {
                ObjectIdInfo objectidinfo1 = _annotationIntrospector.findObjectIdInfo(annotatedmember);
                ObjectIdInfo objectidinfo = objectidinfo1;
                if (objectidinfo1 != null)
                {
                    objectidinfo = _annotationIntrospector.findObjectReferenceInfo(annotatedmember, objectidinfo1);
                }
                return objectidinfo;
            }

            public volatile Object withMember(AnnotatedMember annotatedmember)
            {
                return withMember(annotatedmember);
            }

            
            {
                this$0 = POJOPropertyBuilder.this;
                super();
            }
        });
    }

    public com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty findReferenceType()
    {
        return (com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty)fromMemberAnnotations(new WithMember() {

            final POJOPropertyBuilder this$0;

            public com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty withMember(AnnotatedMember annotatedmember)
            {
                return _annotationIntrospector.findReferenceType(annotatedmember);
            }

            public volatile Object withMember(AnnotatedMember annotatedmember)
            {
                return withMember(annotatedmember);
            }

            
            {
                this$0 = POJOPropertyBuilder.this;
                super();
            }
        });
    }

    public Class[] findViews()
    {
        return (Class[])fromMemberAnnotations(new WithMember() {

            final POJOPropertyBuilder this$0;

            public volatile Object withMember(AnnotatedMember annotatedmember)
            {
                return withMember(annotatedmember);
            }

            public Class[] withMember(AnnotatedMember annotatedmember)
            {
                return _annotationIntrospector.findViews(annotatedmember);
            }

            
            {
                this$0 = POJOPropertyBuilder.this;
                super();
            }
        });
    }

    protected Object fromMemberAnnotations(WithMember withmember)
    {
        Object obj;
        Object obj1;
        Object obj3;
        obj1 = null;
        obj3 = null;
        obj = null;
        if (_annotationIntrospector == null) goto _L2; else goto _L1
_L1:
        if (!_forSerialization) goto _L4; else goto _L3
_L3:
        if (_getters != null)
        {
            obj = withmember.withMember((AnnotatedMember)_getters.value);
        }
_L6:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = obj;
            if (_fields != null)
            {
                obj1 = withmember.withMember((AnnotatedMember)_fields.value);
            }
        }
_L2:
        return obj1;
_L4:
        Object obj2 = obj3;
        if (_ctorParameters != null)
        {
            obj2 = withmember.withMember((AnnotatedMember)_ctorParameters.value);
        }
        obj = obj2;
        if (obj2 == null)
        {
            obj = obj2;
            if (_setters != null)
            {
                obj = withmember.withMember((AnnotatedMember)_setters.value);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public AnnotatedMember getAccessor()
    {
        AnnotatedMethod annotatedmethod = getGetter();
        Object obj = annotatedmethod;
        if (annotatedmethod == null)
        {
            obj = getField();
        }
        return ((AnnotatedMember) (obj));
    }

    public AnnotatedParameter getConstructorParameter()
    {
        if (_ctorParameters == null)
        {
            return null;
        }
        Linked linked = _ctorParameters;
        do
        {
            if (((AnnotatedParameter)linked.value).getOwner() instanceof AnnotatedConstructor)
            {
                return (AnnotatedParameter)linked.value;
            }
            linked = linked.next;
        } while (linked != null);
        return (AnnotatedParameter)_ctorParameters.value;
    }

    public AnnotatedField getField()
    {
        if (_fields != null) goto _L2; else goto _L1
_L1:
        AnnotatedField annotatedfield1 = null;
_L4:
        return annotatedfield1;
_L2:
        AnnotatedField annotatedfield;
        Linked linked;
        annotatedfield = (AnnotatedField)_fields.value;
        linked = _fields.next;
_L9:
        annotatedfield1 = annotatedfield;
        if (linked == null) goto _L4; else goto _L3
_L3:
        Class class1;
        Class class2;
        annotatedfield1 = (AnnotatedField)linked.value;
        class1 = annotatedfield.getDeclaringClass();
        class2 = annotatedfield1.getDeclaringClass();
        if (class1 == class2) goto _L6; else goto _L5
_L5:
        if (!class1.isAssignableFrom(class2)) goto _L8; else goto _L7
_L7:
        annotatedfield = annotatedfield1;
_L10:
        linked = linked.next;
          goto _L9
_L8:
        if (class2.isAssignableFrom(class1)) goto _L10; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder("Multiple fields representing property \"")).append(getName()).append("\": ").append(annotatedfield.getFullName()).append(" vs ").append(annotatedfield1.getFullName()).toString());
    }

    public PropertyName getFullName()
    {
        return _name;
    }

    public AnnotatedMethod getGetter()
    {
        Linked linked;
        Linked linked1;
        Linked linked2 = _getters;
        if (linked2 == null)
        {
            return null;
        }
        Linked linked3 = linked2.next;
        linked = linked3;
        linked1 = linked2;
        if (linked3 == null)
        {
            return (AnnotatedMethod)linked2.value;
        }
_L5:
        Class class1;
        Class class2;
        if (linked == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        class1 = ((AnnotatedMethod)linked1.value).getDeclaringClass();
        class2 = ((AnnotatedMethod)linked.value).getDeclaringClass();
        if (class1 == class2) goto _L2; else goto _L1
_L1:
        if (!class1.isAssignableFrom(class2)) goto _L4; else goto _L3
_L3:
        linked1 = linked;
_L6:
        linked = linked.next;
          goto _L5
_L4:
        if (class2.isAssignableFrom(class1)) goto _L6; else goto _L2
_L2:
        int i = _getterPriority((AnnotatedMethod)linked.value);
        int j = _getterPriority((AnnotatedMethod)linked1.value);
        if (i != j)
        {
            if (i < j)
            {
                linked1 = linked;
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Conflicting getter definitions for property \"")).append(getName()).append("\": ").append(((AnnotatedMethod)linked1.value).getFullName()).append(" vs ").append(((AnnotatedMethod)linked.value).getFullName()).toString());
        }
          goto _L6
        _getters = linked1.withoutNext();
        return (AnnotatedMethod)linked1.value;
    }

    public String getInternalName()
    {
        return _internalName.getSimpleName();
    }

    public PropertyMetadata getMetadata()
    {
        Boolean boolean1 = _findRequired();
        String s = _findDescription();
        Integer integer = _findIndex();
        if (boolean1 == null && integer == null)
        {
            if (s == null)
            {
                return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
            } else
            {
                return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL.withDescription(s);
            }
        } else
        {
            return PropertyMetadata.construct(boolean1.booleanValue(), s, integer);
        }
    }

    public AnnotatedMember getMutator()
    {
        AnnotatedParameter annotatedparameter = getConstructorParameter();
        Object obj = annotatedparameter;
        if (annotatedparameter == null)
        {
            AnnotatedMethod annotatedmethod = getSetter();
            obj = annotatedmethod;
            if (annotatedmethod == null)
            {
                obj = getField();
            }
        }
        return ((AnnotatedMember) (obj));
    }

    public String getName()
    {
        if (_name == null)
        {
            return null;
        } else
        {
            return _name.getSimpleName();
        }
    }

    public AnnotatedMember getNonConstructorMutator()
    {
        AnnotatedMethod annotatedmethod = getSetter();
        Object obj = annotatedmethod;
        if (annotatedmethod == null)
        {
            obj = getField();
        }
        return ((AnnotatedMember) (obj));
    }

    public AnnotatedMember getPrimaryMember()
    {
        if (_forSerialization)
        {
            return getAccessor();
        } else
        {
            return getMutator();
        }
    }

    public AnnotatedMethod getSetter()
    {
        Linked linked;
        Linked linked1;
        Linked linked2 = _setters;
        if (linked2 == null)
        {
            return null;
        }
        Linked linked3 = linked2.next;
        linked = linked3;
        linked1 = linked2;
        if (linked3 == null)
        {
            return (AnnotatedMethod)linked2.value;
        }
_L5:
        Class class1;
        Class class2;
        if (linked == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        class1 = ((AnnotatedMethod)linked1.value).getDeclaringClass();
        class2 = ((AnnotatedMethod)linked.value).getDeclaringClass();
        if (class1 == class2) goto _L2; else goto _L1
_L1:
        if (!class1.isAssignableFrom(class2)) goto _L4; else goto _L3
_L3:
        linked1 = linked;
_L6:
        linked = linked.next;
          goto _L5
_L4:
        if (class2.isAssignableFrom(class1)) goto _L6; else goto _L2
_L2:
        int i = _setterPriority((AnnotatedMethod)linked.value);
        int j = _setterPriority((AnnotatedMethod)linked1.value);
        if (i != j)
        {
            if (i < j)
            {
                linked1 = linked;
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Conflicting setter definitions for property \"")).append(getName()).append("\": ").append(((AnnotatedMethod)linked1.value).getFullName()).append(" vs ").append(((AnnotatedMethod)linked.value).getFullName()).toString());
        }
          goto _L6
        _setters = linked1.withoutNext();
        return (AnnotatedMethod)linked1.value;
    }

    public PropertyName getWrapperName()
    {
        AnnotatedMember annotatedmember = getPrimaryMember();
        if (annotatedmember == null || _annotationIntrospector == null)
        {
            return null;
        } else
        {
            return _annotationIntrospector.findWrapperName(annotatedmember);
        }
    }

    public boolean hasConstructorParameter()
    {
        return _ctorParameters != null;
    }

    public boolean hasField()
    {
        return _fields != null;
    }

    public boolean hasGetter()
    {
        return _getters != null;
    }

    public boolean hasSetter()
    {
        return _setters != null;
    }

    public boolean isExplicitlyIncluded()
    {
        return _anyExplicits(_fields) || _anyExplicits(_getters) || _anyExplicits(_setters) || _anyExplicits(_ctorParameters);
    }

    public boolean isExplicitlyNamed()
    {
        return _anyExplicitNames(_fields) || _anyExplicitNames(_getters) || _anyExplicitNames(_setters) || _anyExplicitNames(_ctorParameters);
    }

    public boolean isTypeId()
    {
        Boolean boolean1 = (Boolean)fromMemberAnnotations(new WithMember() {

            final POJOPropertyBuilder this$0;

            public Boolean withMember(AnnotatedMember annotatedmember)
            {
                return _annotationIntrospector.isTypeId(annotatedmember);
            }

            public volatile Object withMember(AnnotatedMember annotatedmember)
            {
                return withMember(annotatedmember);
            }

            
            {
                this$0 = POJOPropertyBuilder.this;
                super();
            }
        });
        return boolean1 != null && boolean1.booleanValue();
    }

    public void mergeAnnotations(boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (_getters == null) goto _L4; else goto _L3
_L3:
        AnnotationMap annotationmap = _mergeAnnotations(0, new Linked[] {
            _getters, _fields, _ctorParameters, _setters
        });
        _getters = _getters.withValue(((AnnotatedMethod)_getters.value).withAnnotations(annotationmap));
_L6:
        return;
_L4:
        if (_fields != null)
        {
            AnnotationMap annotationmap1 = _mergeAnnotations(0, new Linked[] {
                _fields, _ctorParameters, _setters
            });
            _fields = _fields.withValue(((AnnotatedField)_fields.value).withAnnotations(annotationmap1));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (_ctorParameters != null)
        {
            AnnotationMap annotationmap2 = _mergeAnnotations(0, new Linked[] {
                _ctorParameters, _setters, _fields, _getters
            });
            _ctorParameters = _ctorParameters.withValue(((AnnotatedParameter)_ctorParameters.value).withAnnotations(annotationmap2));
            return;
        }
        if (_setters != null)
        {
            AnnotationMap annotationmap3 = _mergeAnnotations(0, new Linked[] {
                _setters, _fields, _getters
            });
            _setters = _setters.withValue(((AnnotatedMethod)_setters.value).withAnnotations(annotationmap3));
            return;
        }
        if (_fields != null)
        {
            AnnotationMap annotationmap4 = _mergeAnnotations(0, new Linked[] {
                _fields, _getters
            });
            _fields = _fields.withValue(((AnnotatedField)_fields.value).withAnnotations(annotationmap4));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void removeIgnored()
    {
        _fields = _removeIgnored(_fields);
        _getters = _removeIgnored(_getters);
        _setters = _removeIgnored(_setters);
        _ctorParameters = _removeIgnored(_ctorParameters);
    }

    public void removeNonVisible(boolean flag)
    {
        _getters = _removeNonVisible(_getters);
        _ctorParameters = _removeNonVisible(_ctorParameters);
        if (flag || _getters == null)
        {
            _fields = _removeNonVisible(_fields);
            _setters = _removeNonVisible(_setters);
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[Property '").append(_name).append("'; ctors: ").append(_ctorParameters).append(", field(s): ").append(_fields).append(", getter(s): ").append(_getters).append(", setter(s): ").append(_setters);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void trimByVisibility()
    {
        _fields = _trimByVisibility(_fields);
        _getters = _trimByVisibility(_getters);
        _setters = _trimByVisibility(_setters);
        _ctorParameters = _trimByVisibility(_ctorParameters);
    }

    public POJOPropertyBuilder withName(PropertyName propertyname)
    {
        return new POJOPropertyBuilder(this, propertyname);
    }

    public POJOPropertyBuilder withSimpleName(String s)
    {
        s = _name.withSimpleName(s);
        if (s == _name)
        {
            return this;
        } else
        {
            return new POJOPropertyBuilder(this, s);
        }
    }

    private class Linked
    {

        public final boolean isMarkedIgnored;
        public final boolean isNameExplicit;
        public final boolean isVisible;
        public final PropertyName name;
        public final Linked next;
        public final Object value;

        private Linked append(Linked linked)
        {
            if (next == null)
            {
                return withNext(linked);
            } else
            {
                return withNext(next.append(linked));
            }
        }

        public final String toString()
        {
            String s1 = (new StringBuilder()).append(value.toString()).append("[visible=").append(isVisible).append(",ignore=").append(isMarkedIgnored).append(",explicitName=").append(isNameExplicit).append("]").toString();
            String s = s1;
            if (next != null)
            {
                s = (new StringBuilder()).append(s1).append(", ").append(next.toString()).toString();
            }
            return s;
        }

        public final Linked trimByVisibility()
        {
            if (next == null)
            {
                return this;
            }
            Linked linked = next.trimByVisibility();
            if (name != null)
            {
                if (linked.name == null)
                {
                    return withNext(null);
                } else
                {
                    return withNext(linked);
                }
            }
            if (linked.name != null)
            {
                return linked;
            }
            if (isVisible == linked.isVisible)
            {
                return withNext(linked);
            }
            if (isVisible)
            {
                return withNext(null);
            } else
            {
                return linked;
            }
        }

        public final Linked withNext(Linked linked)
        {
            if (linked == next)
            {
                return this;
            } else
            {
                return new Linked(value, linked, name, isNameExplicit, isVisible, isMarkedIgnored);
            }
        }

        public final Linked withValue(Object obj)
        {
            if (obj == value)
            {
                return this;
            } else
            {
                return new Linked(obj, next, name, isNameExplicit, isVisible, isMarkedIgnored);
            }
        }

        public final Linked withoutIgnored()
        {
            Linked linked = this;
_L9:
            if (!linked.isMarkedIgnored) goto _L2; else goto _L1
_L1:
            if (linked.next != null) goto _L4; else goto _L3
_L3:
            Linked linked1 = null;
_L6:
            return linked1;
_L4:
            linked = linked.next;
            continue; /* Loop/switch isn't completed */
_L2:
            linked1 = linked;
            if (linked.next == null) goto _L6; else goto _L5
_L5:
            Linked linked2;
            linked2 = linked.next.withoutIgnored();
            linked1 = linked;
            if (linked2 == linked.next) goto _L6; else goto _L7
_L7:
            return linked.withNext(linked2);
            if (true) goto _L9; else goto _L8
_L8:
        }

        public final Linked withoutNext()
        {
            if (next == null)
            {
                return this;
            } else
            {
                return new Linked(value, null, name, isNameExplicit, isVisible, isMarkedIgnored);
            }
        }

        public final Linked withoutNonVisible()
        {
            Linked linked;
            Linked linked1;
            if (next == null)
            {
                linked = null;
            } else
            {
                linked = next.withoutNonVisible();
            }
            linked1 = linked;
            if (isVisible)
            {
                linked1 = withNext(linked);
            }
            return linked1;
        }


        public Linked(Object obj, Linked linked, PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
        {
            value = obj;
            next = linked;
            boolean flag3;
            if (propertyname == null || propertyname.isEmpty())
            {
                obj = null;
            } else
            {
                obj = propertyname;
            }
            name = ((PropertyName) (obj));
            flag3 = flag;
            if (flag)
            {
                if (name == null)
                {
                    throw new IllegalArgumentException("Can not pass true for 'explName' if name is null/empty");
                }
                flag3 = flag;
                if (!propertyname.hasSimpleName())
                {
                    flag3 = false;
                }
            }
            isNameExplicit = flag3;
            isVisible = flag1;
            isMarkedIgnored = flag2;
        }
    }


    private class WithMember
    {

        public abstract Object withMember(AnnotatedMember annotatedmember);
    }

}
