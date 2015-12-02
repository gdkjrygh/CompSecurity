// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.BeanUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedClass, AnnotatedConstructor, POJOPropertyBuilder, AnnotatedMethod, 
//            AnnotatedField, VisibilityChecker, AnnotatedMember, ObjectIdInfo

public class POJOPropertiesCollector
{

    protected final AnnotationIntrospector _annotationIntrospector;
    protected LinkedList _anyGetters;
    protected LinkedList _anySetters;
    protected final AnnotatedClass _classDef;
    protected final MapperConfig _config;
    protected LinkedList _creatorProperties;
    protected final boolean _forSerialization;
    protected HashSet _ignoredPropertyNames;
    protected LinkedHashMap _injectables;
    protected LinkedList _jsonValueGetters;
    protected final String _mutatorPrefix;
    protected final LinkedHashMap _properties = new LinkedHashMap();
    protected final JavaType _type;
    protected final VisibilityChecker _visibilityChecker;

    protected POJOPropertiesCollector(MapperConfig mapperconfig, boolean flag, JavaType javatype, AnnotatedClass annotatedclass, String s)
    {
        Object obj = null;
        super();
        _creatorProperties = null;
        _anyGetters = null;
        _anySetters = null;
        _jsonValueGetters = null;
        _config = mapperconfig;
        _forSerialization = flag;
        _type = javatype;
        _classDef = annotatedclass;
        javatype = s;
        if (s == null)
        {
            javatype = "set";
        }
        _mutatorPrefix = javatype;
        javatype = obj;
        if (mapperconfig.isAnnotationProcessingEnabled())
        {
            javatype = _config.getAnnotationIntrospector();
        }
        _annotationIntrospector = javatype;
        if (_annotationIntrospector == null)
        {
            _visibilityChecker = _config.getDefaultVisibilityChecker();
            return;
        } else
        {
            _visibilityChecker = _annotationIntrospector.findAutoDetectVisibility(annotatedclass, _config.getDefaultVisibilityChecker());
            return;
        }
    }

    private void _addIgnored(String s)
    {
        if (!_forSerialization)
        {
            if (_ignoredPropertyNames == null)
            {
                _ignoredPropertyNames = new HashSet();
            }
            _ignoredPropertyNames.add(s);
        }
    }

    protected void _addCreators()
    {
        AnnotationIntrospector annotationintrospector = _annotationIntrospector;
        if (annotationintrospector != null)
        {
            for (Iterator iterator = _classDef.getConstructors().iterator(); iterator.hasNext();)
            {
                AnnotatedConstructor annotatedconstructor = (AnnotatedConstructor)iterator.next();
                if (_creatorProperties == null)
                {
                    _creatorProperties = new LinkedList();
                }
                int k = annotatedconstructor.getParameterCount();
                int i = 0;
                while (i < k) 
                {
                    AnnotatedParameter annotatedparameter = annotatedconstructor.getParameter(i);
                    String s = annotationintrospector.findDeserializationName(annotatedparameter);
                    if (s != null)
                    {
                        POJOPropertyBuilder pojopropertybuilder = _property(s);
                        pojopropertybuilder.addCtor(annotatedparameter, s, true, false);
                        _creatorProperties.add(pojopropertybuilder);
                    }
                    i++;
                }
            }

            Iterator iterator1 = _classDef.getStaticMethods().iterator();
            while (iterator1.hasNext()) 
            {
                AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator1.next();
                if (_creatorProperties == null)
                {
                    _creatorProperties = new LinkedList();
                }
                int l = annotatedmethod.getParameterCount();
                int j = 0;
                while (j < l) 
                {
                    AnnotatedParameter annotatedparameter1 = annotatedmethod.getParameter(j);
                    String s1 = annotationintrospector.findDeserializationName(annotatedparameter1);
                    if (s1 != null)
                    {
                        POJOPropertyBuilder pojopropertybuilder1 = _property(s1);
                        pojopropertybuilder1.addCtor(annotatedparameter1, s1, true, false);
                        _creatorProperties.add(pojopropertybuilder1);
                    }
                    j++;
                }
            }
        }
    }

    protected void _addFields()
    {
        AnnotationIntrospector annotationintrospector = _annotationIntrospector;
        Iterator iterator = _classDef.fields().iterator();
        while (iterator.hasNext()) 
        {
            AnnotatedField annotatedfield = (AnnotatedField)iterator.next();
            String s1 = annotatedfield.getName();
            String s;
            boolean flag;
            boolean flag1;
            if (annotationintrospector == null)
            {
                s = null;
            } else
            if (_forSerialization)
            {
                s = annotationintrospector.findSerializationName(annotatedfield);
            } else
            {
                s = annotationintrospector.findDeserializationName(annotatedfield);
            }
            if ("".equals(s))
            {
                s = s1;
            }
            if (s != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                flag = _visibilityChecker.isFieldVisible(annotatedfield);
            }
            if (annotationintrospector != null && annotationintrospector.hasIgnoreMarker(annotatedfield))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            _property(s1).addField(annotatedfield, s, flag, flag1);
        }
    }

    protected void _addGetterMethod(AnnotatedMethod annotatedmethod, AnnotationIntrospector annotationintrospector)
    {
        if (annotationintrospector == null) goto _L2; else goto _L1
_L1:
        if (!annotationintrospector.hasAnyGetterAnnotation(annotatedmethod)) goto _L4; else goto _L3
_L3:
        if (_anyGetters == null)
        {
            _anyGetters = new LinkedList();
        }
        _anyGetters.add(annotatedmethod);
_L8:
        return;
_L4:
        if (annotationintrospector.hasAsValueAnnotation(annotatedmethod))
        {
            if (_jsonValueGetters == null)
            {
                _jsonValueGetters = new LinkedList();
            }
            _jsonValueGetters.add(annotatedmethod);
            return;
        }
_L2:
        String s;
        String s1;
        boolean flag;
        if (annotationintrospector == null)
        {
            s = null;
        } else
        {
            s = annotationintrospector.findSerializationName(annotatedmethod);
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        s1 = BeanUtil.okNameForRegularGetter(annotatedmethod, annotatedmethod.getName());
        if (s1 != null) goto _L6; else goto _L5
_L5:
        s1 = BeanUtil.okNameForIsGetter(annotatedmethod, annotatedmethod.getName());
        if (s1 == null) goto _L8; else goto _L7
_L7:
        flag = _visibilityChecker.isIsGetterVisible(annotatedmethod);
_L9:
        String s2;
        boolean flag1;
        if (annotationintrospector == null)
        {
            flag1 = false;
        } else
        {
            flag1 = annotationintrospector.hasIgnoreMarker(annotatedmethod);
        }
        _property(s1).addGetter(annotatedmethod, s, flag, flag1);
        return;
_L6:
        flag = _visibilityChecker.isGetterVisible(annotatedmethod);
          goto _L9
        s2 = BeanUtil.okNameForGetter(annotatedmethod);
        s1 = s2;
        if (s2 == null)
        {
            s1 = annotatedmethod.getName();
        }
        s2 = s;
        if (s.length() == 0)
        {
            s2 = s1;
        }
        flag = true;
        s = s2;
          goto _L9
    }

    protected void _addInjectables()
    {
        AnnotationIntrospector annotationintrospector = _annotationIntrospector;
        if (annotationintrospector != null)
        {
            AnnotatedField annotatedfield;
            for (Iterator iterator = _classDef.fields().iterator(); iterator.hasNext(); _doAddInjectable(annotationintrospector.findInjectableValueId(annotatedfield), annotatedfield))
            {
                annotatedfield = (AnnotatedField)iterator.next();
            }

            Iterator iterator1 = _classDef.memberMethods().iterator();
            while (iterator1.hasNext()) 
            {
                AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator1.next();
                if (annotatedmethod.getParameterCount() == 1)
                {
                    _doAddInjectable(annotationintrospector.findInjectableValueId(annotatedmethod), annotatedmethod);
                }
            }
        }
    }

    protected void _addMethods()
    {
        AnnotationIntrospector annotationintrospector = _annotationIntrospector;
        Iterator iterator = _classDef.memberMethods().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator.next();
            int i = annotatedmethod.getParameterCount();
            if (i == 0)
            {
                _addGetterMethod(annotatedmethod, annotationintrospector);
            } else
            if (i == 1)
            {
                _addSetterMethod(annotatedmethod, annotationintrospector);
            } else
            if (i == 2 && annotationintrospector != null && annotationintrospector.hasAnySetterAnnotation(annotatedmethod))
            {
                if (_anySetters == null)
                {
                    _anySetters = new LinkedList();
                }
                _anySetters.add(annotatedmethod);
            }
        } while (true);
    }

    protected void _addSetterMethod(AnnotatedMethod annotatedmethod, AnnotationIntrospector annotationintrospector)
    {
        String s;
        String s1;
        if (annotationintrospector == null)
        {
            s = null;
        } else
        {
            s = annotationintrospector.findDeserializationName(annotatedmethod);
        }
        boolean flag;
        boolean flag1;
        if (s == null)
        {
            s1 = BeanUtil.okNameForMutator(annotatedmethod, _mutatorPrefix);
            if (s1 == null)
            {
                return;
            }
            flag = _visibilityChecker.isSetterVisible(annotatedmethod);
        } else
        {
            String s2 = BeanUtil.okNameForMutator(annotatedmethod, _mutatorPrefix);
            s1 = s2;
            if (s2 == null)
            {
                s1 = annotatedmethod.getName();
            }
            s2 = s;
            if (s.length() == 0)
            {
                s2 = s1;
            }
            flag = true;
            s = s2;
        }
        if (annotationintrospector == null)
        {
            flag1 = false;
        } else
        {
            flag1 = annotationintrospector.hasIgnoreMarker(annotatedmethod);
        }
        _property(s1).addSetter(annotatedmethod, s, flag, flag1);
    }

    protected void _doAddInjectable(Object obj, AnnotatedMember annotatedmember)
    {
        if (obj != null)
        {
            if (_injectables == null)
            {
                _injectables = new LinkedHashMap();
            }
            if ((AnnotatedMember)_injectables.put(obj, annotatedmember) != null)
            {
                if (obj == null)
                {
                    annotatedmember = "[null]";
                } else
                {
                    annotatedmember = obj.getClass().getName();
                }
                throw new IllegalArgumentException((new StringBuilder()).append("Duplicate injectable value with id '").append(String.valueOf(obj)).append("' (of type ").append(annotatedmember).append(")").toString());
            }
        }
    }

    protected POJOPropertyBuilder _property(String s)
    {
        POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)_properties.get(s);
        POJOPropertyBuilder pojopropertybuilder = pojopropertybuilder1;
        if (pojopropertybuilder1 == null)
        {
            pojopropertybuilder = new POJOPropertyBuilder(s, _annotationIntrospector, _forSerialization);
            _properties.put(s, pojopropertybuilder);
        }
        return pojopropertybuilder;
    }

    protected void _removeUnwantedProperties()
    {
        Iterator iterator = _properties.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            POJOPropertyBuilder pojopropertybuilder = (POJOPropertyBuilder)((java.util.Map.Entry)iterator.next()).getValue();
            if (!pojopropertybuilder.anyVisible())
            {
                iterator.remove();
                continue;
            }
            if (pojopropertybuilder.anyIgnorals())
            {
                if (!pojopropertybuilder.isExplicitlyIncluded())
                {
                    iterator.remove();
                    _addIgnored(pojopropertybuilder.getName());
                    continue;
                }
                pojopropertybuilder.removeIgnored();
                if (!_forSerialization && !pojopropertybuilder.couldDeserialize())
                {
                    _addIgnored(pojopropertybuilder.getName());
                }
            }
            pojopropertybuilder.removeNonVisible();
        } while (true);
    }

    protected void _renameProperties()
    {
        Iterator iterator = _properties.entrySet().iterator();
        Object obj = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)((java.util.Map.Entry)iterator.next()).getValue();
            String s1 = pojopropertybuilder1.findNewName();
            if (s1 != null)
            {
                LinkedList linkedlist = ((LinkedList) (obj));
                if (obj == null)
                {
                    linkedlist = new LinkedList();
                }
                linkedlist.add(pojopropertybuilder1.withName(s1));
                iterator.remove();
                obj = linkedlist;
            }
        } while (true);
        if (obj != null)
        {
            for (obj = ((LinkedList) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                POJOPropertyBuilder pojopropertybuilder = (POJOPropertyBuilder)((Iterator) (obj)).next();
                String s = pojopropertybuilder.getName();
                POJOPropertyBuilder pojopropertybuilder2 = (POJOPropertyBuilder)_properties.get(s);
                if (pojopropertybuilder2 == null)
                {
                    _properties.put(s, pojopropertybuilder);
                } else
                {
                    pojopropertybuilder2.addAll(pojopropertybuilder);
                }
            }

        }
    }

    protected void _renameUsing(PropertyNamingStrategy propertynamingstrategy)
    {
        POJOPropertyBuilder apojopropertybuilder[] = (POJOPropertyBuilder[])_properties.values().toArray(new POJOPropertyBuilder[_properties.size()]);
        _properties.clear();
        int j = apojopropertybuilder.length;
        int i = 0;
        while (i < j) 
        {
            POJOPropertyBuilder pojopropertybuilder1 = apojopropertybuilder[i];
            String s = pojopropertybuilder1.getName();
            POJOPropertyBuilder pojopropertybuilder;
            if (_forSerialization)
            {
                if (pojopropertybuilder1.hasGetter())
                {
                    s = propertynamingstrategy.nameForGetterMethod(_config, pojopropertybuilder1.getGetter(), s);
                } else
                if (pojopropertybuilder1.hasField())
                {
                    s = propertynamingstrategy.nameForField(_config, pojopropertybuilder1.getField(), s);
                }
            } else
            if (pojopropertybuilder1.hasSetter())
            {
                s = propertynamingstrategy.nameForSetterMethod(_config, pojopropertybuilder1.getSetter(), s);
            } else
            if (pojopropertybuilder1.hasConstructorParameter())
            {
                s = propertynamingstrategy.nameForConstructorParameter(_config, pojopropertybuilder1.getConstructorParameter(), s);
            } else
            if (pojopropertybuilder1.hasField())
            {
                s = propertynamingstrategy.nameForField(_config, pojopropertybuilder1.getField(), s);
            } else
            if (pojopropertybuilder1.hasGetter())
            {
                s = propertynamingstrategy.nameForGetterMethod(_config, pojopropertybuilder1.getGetter(), s);
            }
            pojopropertybuilder = pojopropertybuilder1;
            if (!s.equals(pojopropertybuilder1.getName()))
            {
                pojopropertybuilder = pojopropertybuilder1.withName(s);
            }
            pojopropertybuilder1 = (POJOPropertyBuilder)_properties.get(s);
            if (pojopropertybuilder1 == null)
            {
                _properties.put(s, pojopropertybuilder);
            } else
            {
                pojopropertybuilder1.addAll(pojopropertybuilder);
            }
            i++;
        }
    }

    protected void _sortProperties()
    {
        Object obj;
        Object obj1;
        LinkedHashMap linkedhashmap;
        obj1 = _annotationIntrospector;
        boolean flag;
        if (obj1 == null)
        {
            obj = null;
        } else
        {
            obj = ((AnnotationIntrospector) (obj1)).findSerializationSortAlphabetically(_classDef);
        }
        if (obj == null)
        {
            flag = _config.shouldSortPropertiesAlphabetically();
        } else
        {
            flag = ((Boolean) (obj)).booleanValue();
        }
        if (obj1 == null)
        {
            obj = null;
        } else
        {
            obj = ((AnnotationIntrospector) (obj1)).findSerializationPropertyOrder(_classDef);
        }
        if (!flag && _creatorProperties == null && obj == null)
        {
            return;
        }
        int i = _properties.size();
        Iterator iterator1;
        POJOPropertyBuilder pojopropertybuilder2;
        if (flag)
        {
            obj1 = new TreeMap();
        } else
        {
            obj1 = new LinkedHashMap(i + i);
        }
        for (iterator1 = _properties.values().iterator(); iterator1.hasNext(); ((Map) (obj1)).put(pojopropertybuilder2.getName(), pojopropertybuilder2))
        {
            pojopropertybuilder2 = (POJOPropertyBuilder)iterator1.next();
        }

        linkedhashmap = new LinkedHashMap(i + i);
        if (obj == null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        k = obj.length;
        j = 0;
_L4:
        if (j >= k) goto _L2; else goto _L3
_L3:
        POJOPropertyBuilder pojopropertybuilder;
        Object obj2;
        String s;
        s = obj[j];
        pojopropertybuilder = (POJOPropertyBuilder)((Map) (obj1)).get(s);
        if (pojopropertybuilder != null)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        Iterator iterator2 = _properties.values().iterator();
        do
        {
            if (!iterator2.hasNext())
            {
                break MISSING_BLOCK_LABEL_384;
            }
            obj2 = (POJOPropertyBuilder)iterator2.next();
        } while (!s.equals(((POJOPropertyBuilder) (obj2)).getInternalName()));
        s = ((POJOPropertyBuilder) (obj2)).getName();
        pojopropertybuilder = ((POJOPropertyBuilder) (obj2));
        obj2 = s;
_L5:
        if (pojopropertybuilder != null)
        {
            linkedhashmap.put(obj2, pojopropertybuilder);
        }
        j++;
          goto _L4
_L2:
        if (_creatorProperties != null)
        {
            POJOPropertyBuilder pojopropertybuilder1;
            for (Iterator iterator = _creatorProperties.iterator(); iterator.hasNext(); linkedhashmap.put(pojopropertybuilder1.getName(), pojopropertybuilder1))
            {
                pojopropertybuilder1 = (POJOPropertyBuilder)iterator.next();
            }

        }
        linkedhashmap.putAll(((Map) (obj1)));
        _properties.clear();
        _properties.putAll(linkedhashmap);
        return;
        obj2 = s;
          goto _L5
    }

    public POJOPropertiesCollector collect()
    {
        _properties.clear();
        _addFields();
        _addMethods();
        _addCreators();
        _addInjectables();
        _removeUnwantedProperties();
        _renameProperties();
        PropertyNamingStrategy propertynamingstrategy = _config.getPropertyNamingStrategy();
        if (propertynamingstrategy != null)
        {
            _renameUsing(propertynamingstrategy);
        }
        for (Iterator iterator = _properties.values().iterator(); iterator.hasNext(); ((POJOPropertyBuilder)iterator.next()).trimByVisibility()) { }
        for (Iterator iterator1 = _properties.values().iterator(); iterator1.hasNext(); ((POJOPropertyBuilder)iterator1.next()).mergeAnnotations(_forSerialization)) { }
        _sortProperties();
        return this;
    }

    public Class findPOJOBuilderClass()
    {
        return _annotationIntrospector.findPOJOBuilder(_classDef);
    }

    public AnnotationIntrospector getAnnotationIntrospector()
    {
        return _annotationIntrospector;
    }

    public AnnotatedMember getAnyGetter()
    {
        if (_anyGetters != null)
        {
            if (_anyGetters.size() > 1)
            {
                reportProblem((new StringBuilder()).append("Multiple 'any-getters' defined (").append(_anyGetters.get(0)).append(" vs ").append(_anyGetters.get(1)).append(")").toString());
            }
            return (AnnotatedMember)_anyGetters.getFirst();
        } else
        {
            return null;
        }
    }

    public AnnotatedMethod getAnySetterMethod()
    {
        if (_anySetters != null)
        {
            if (_anySetters.size() > 1)
            {
                reportProblem((new StringBuilder()).append("Multiple 'any-setters' defined (").append(_anySetters.get(0)).append(" vs ").append(_anySetters.get(1)).append(")").toString());
            }
            return (AnnotatedMethod)_anySetters.getFirst();
        } else
        {
            return null;
        }
    }

    public AnnotatedClass getClassDef()
    {
        return _classDef;
    }

    public MapperConfig getConfig()
    {
        return _config;
    }

    public Set getIgnoredPropertyNames()
    {
        return _ignoredPropertyNames;
    }

    public Map getInjectables()
    {
        return _injectables;
    }

    public AnnotatedMethod getJsonValueMethod()
    {
        if (_jsonValueGetters != null)
        {
            if (_jsonValueGetters.size() > 1)
            {
                reportProblem((new StringBuilder()).append("Multiple value properties defined (").append(_jsonValueGetters.get(0)).append(" vs ").append(_jsonValueGetters.get(1)).append(")").toString());
            }
            return (AnnotatedMethod)_jsonValueGetters.get(0);
        } else
        {
            return null;
        }
    }

    public ObjectIdInfo getObjectIdInfo()
    {
        if (_annotationIntrospector == null)
        {
            return null;
        } else
        {
            return _annotationIntrospector.findObjectIdInfo(_classDef);
        }
    }

    public List getProperties()
    {
        return new ArrayList(_properties.values());
    }

    protected Map getPropertyMap()
    {
        return _properties;
    }

    public JavaType getType()
    {
        return _type;
    }

    protected void reportProblem(String s)
    {
        throw new IllegalArgumentException((new StringBuilder()).append("Problem with definition of ").append(_classDef).append(": ").append(s).toString());
    }
}
