// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import android.util.Log;
import com.brightcove.player.util.ErrorUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.event:
//            EventEmitter, Emits, ListensFor, d, 
//            EventListener, Event

public class RegisteringEventEmitter
    implements EventEmitter
{

    private static String a = "events";
    private EventEmitter b;
    private String c;
    private boolean d;
    private List e;
    private List f;

    public RegisteringEventEmitter(EventEmitter eventemitter, Class class1)
    {
        d = false;
        if (eventemitter == null || class1 == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("eventEmitterAndComponentRequired"));
        } else
        {
            b = eventemitter;
            c = class1.getSimpleName();
            e = a(class1, com/brightcove/player/event/Emits);
            f = a(class1, com/brightcove/player/event/ListensFor);
            eventemitter.on("debug", new d(this));
            return;
        }
    }

    private Map a(Map map)
    {
        if (!d)
        {
            return map;
        } else
        {
            HashMap hashmap = new HashMap(map.size() + 1);
            hashmap.putAll(map);
            hashmap.put("emitter", c);
            return hashmap;
        }
    }

    static boolean a(RegisteringEventEmitter registeringeventemitter, boolean flag)
    {
        registeringeventemitter.d = flag;
        return flag;
    }

    private List b(Class class1, Class class2)
    {
        ArrayList arraylist = new ArrayList();
        Class class3 = class1.getSuperclass();
        if (class3 != null)
        {
            arraylist.addAll(b(class3, class2));
        }
        class1 = class1.getAnnotation(class2);
        if (class1 != null)
        {
            arraylist.add(class1);
        }
        return arraylist;
    }

    public static RegisteringEventEmitter build(EventEmitter eventemitter, Class class1)
    {
        EventEmitter eventemitter1 = eventemitter;
        if (eventemitter instanceof RegisteringEventEmitter)
        {
            eventemitter1 = ((RegisteringEventEmitter)eventemitter).getRootEmitter();
        }
        return new RegisteringEventEmitter(eventemitter1, class1);
    }

    protected List a(Class class1, Class class2)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        class1 = b(class1, class2);
        if (class1 == null || class1.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        iterator = class1.iterator();
        class1 = new String[0];
_L4:
        Annotation annotation;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        annotation = (Annotation)iterator.next();
        String as[] = (String[])(String[])annotation.getClass().getMethod(a, new Class[0]).invoke(annotation, new Object[0]);
        class1 = as;
_L5:
        arraylist.addAll(Arrays.asList(class1));
        if (true) goto _L4; else goto _L3
        Exception exception;
        exception;
        Log.e("Component", (new StringBuilder()).append("Error attempting to invoke ").append(a).append(" on annotation ").append(class2.getName()).append(": ").append(exception.getMessage()).toString());
          goto _L5
_L2:
        throw new RuntimeException(String.format(ErrorUtil.getMessage("annotationRequired"), new Object[] {
            class2.getName()
        }));
_L3:
        return arraylist;
    }

    public void disable()
    {
        b.disable();
    }

    public void emit(String s)
    {
        Map map;
        if (d)
        {
            map = Collections.singletonMap("emitter", c);
        } else
        {
            map = Collections.emptyMap();
        }
        if (e.contains(s))
        {
            b.emit(s, map);
            return;
        } else
        {
            throw new IllegalArgumentException(String.format(ErrorUtil.getMessage("notPermittedToEmit"), new Object[] {
                s
            }));
        }
    }

    public void emit(String s, Map map)
    {
        if (e.contains(s))
        {
            b.emit(s, a(map));
            return;
        } else
        {
            throw new IllegalArgumentException(String.format(ErrorUtil.getMessage("notPermittedToEmit"), new Object[] {
                s
            }));
        }
    }

    public void enable()
    {
        b.enable();
    }

    public List getAllowedEmittedEvents()
    {
        return e;
    }

    public List getAllowedListenEvents()
    {
        return f;
    }

    public EventEmitter getRootEmitter()
    {
        return b;
    }

    public void off()
    {
        b.off();
    }

    public void off(String s, int i)
    {
        b.off(s, i);
    }

    public int on(String s, EventListener eventlistener)
    {
        if (f.contains(s))
        {
            return b.on(s, eventlistener);
        } else
        {
            throw new IllegalArgumentException(String.format(ErrorUtil.getMessage("notPermittedToListen"), new Object[] {
                s
            }));
        }
    }

    public int once(String s, EventListener eventlistener)
    {
        if (f.contains(s))
        {
            return b.once(s, eventlistener);
        } else
        {
            throw new IllegalArgumentException(String.format(ErrorUtil.getMessage("notPermittedToListen"), new Object[] {
                s
            }));
        }
    }

    public void request(String s, EventListener eventlistener)
    {
        if (e.contains(s))
        {
            b.request(s, eventlistener);
            return;
        } else
        {
            throw new IllegalArgumentException(String.format(ErrorUtil.getMessage("notPermittedToEmit"), new Object[] {
                s
            }));
        }
    }

    public void request(String s, Map map, EventListener eventlistener)
    {
        if (e.contains(s))
        {
            b.request(s, map, eventlistener);
            return;
        } else
        {
            throw new IllegalArgumentException(String.format(ErrorUtil.getMessage("notPermittedToEmit"), new Object[] {
                s
            }));
        }
    }

    public void respond(Event event)
    {
        b.respond(event);
    }

    public void respond(Map map)
    {
        b.respond(map);
    }

}
