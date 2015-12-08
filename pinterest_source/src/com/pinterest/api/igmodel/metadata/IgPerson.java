// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata;

import com.pinterest.api.igmodel.IgModel;
import com.pinterest.api.model.metadata.Person;
import com.pinterest.network.json.PinterestJsonObject;

public class IgPerson
    implements IgModel
{

    public String a;
    public String b;
    public String c;

    public IgPerson()
    {
    }

    public final Person a()
    {
        Person person = new Person();
        person.setId(a);
        person.setType(c);
        person.setName(b);
        return person;
    }

    public final PinterestJsonObject b()
    {
        PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
        pinterestjsonobject.b("id", a);
        pinterestjsonobject.b("name", b);
        pinterestjsonobject.b("type", c);
        return pinterestjsonobject;
    }

    public Object getModel()
    {
        return a();
    }
}
