// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import com.facebook.common.w.e;
import com.facebook.common.w.q;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.user:
//            ad, ae, PicCropInfo, UserEmailAddress, 
//            LastActive, MobileAppData, User, Birthday, 
//            Name, o, UserPhoneNumber, af, 
//            ag, ah, n

public class ac
{

    private static final Pattern d = Pattern.compile("^https://");
    private final ObjectMapper a;
    private final ThreadLocal b = new ad(this);
    private final ThreadLocal c = new ae(this);

    public ac(ObjectMapper objectmapper)
    {
        a = objectmapper;
    }

    private String a(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            Matcher matcher = d.matcher(s);
            if (matcher.find())
            {
                return matcher.replaceFirst("http://");
            }
        }
        return s;
    }

    public PicCropInfo a(JsonNode jsonnode)
    {
        if (jsonnode.has("uri") && jsonnode.has("width") && jsonnode.has("height") && jsonnode.has("left") && jsonnode.has("right") && jsonnode.has("top") && jsonnode.has("bottom"))
        {
            String s = a(com.facebook.common.w.e.b(jsonnode.get("uri")));
            int i = com.facebook.common.w.e.d(jsonnode.get("width"));
            int j = com.facebook.common.w.e.d(jsonnode.get("height"));
            float f1 = (float)com.facebook.common.w.e.e(jsonnode.get("left"));
            float f2 = (float)com.facebook.common.w.e.e(jsonnode.get("right"));
            return new PicCropInfo(s, i, j, f1, (float)com.facebook.common.w.e.e(jsonnode.get("top")), f2, (float)com.facebook.common.w.e.e(jsonnode.get("bottom")));
        } else
        {
            return null;
        }
    }

    public User a(n n, String s)
    {
        try
        {
            n = b(n, a.readTree(s));
        }
        // Misplaced declaration of an exception variable
        catch (n n)
        {
            throw new RuntimeException("Unexpected serialization exception", n);
        }
        return n;
    }

    public ArrayNode a(es es1)
    {
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        for (es1 = es1.iterator(); es1.hasNext(); arraynode.add(((UserEmailAddress)es1.next()).a())) { }
        return arraynode;
    }

    public ObjectNode a(LastActive lastactive)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("time", lastactive.a() / 1000L);
        objectnode.put("active", lastactive.b());
        return objectnode;
    }

    public ObjectNode a(MobileAppData mobileappdata)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("has_push", a.valueToTree(ik.a(mobileappdata.a())));
        objectnode.put("is_installed", a.valueToTree(ik.a(mobileappdata.b())));
        objectnode.put("last_used", a.valueToTree(ik.a(mobileappdata.c())));
        return objectnode;
    }

    public ObjectNode a(PicCropInfo piccropinfo)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("uri", piccropinfo.a());
        objectnode.put("width", piccropinfo.c());
        objectnode.put("height", piccropinfo.d());
        objectnode.put("left", piccropinfo.e());
        objectnode.put("right", piccropinfo.g());
        objectnode.put("top", piccropinfo.f());
        objectnode.put("bottom", piccropinfo.h());
        return objectnode;
    }

    public es a(n n, JsonNode jsonnode)
    {
        et et1 = es.e();
        for (jsonnode = jsonnode.iterator(); jsonnode.hasNext(); et1.b(b(n, (JsonNode)jsonnode.next()))) { }
        return et1.b();
    }

    public String a(User user)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("uid", user.b());
        a(objectnode, user.d());
        if (!user.j().isEmpty())
        {
            objectnode.put("emails", a(user.j()));
        }
        if (!user.k().isEmpty())
        {
            objectnode.put("phones", b(user.k()));
        }
        if (user.p() != null)
        {
            objectnode.put("pic_big", user.q());
        }
        if (user.q() != null)
        {
            objectnode.put("pic_square", user.q());
        }
        if (user.s() != null)
        {
            objectnode.put("pic_crop", a(user.s()));
        }
        if (user.w() != 0.0F)
        {
            objectnode.put("rank", user.w());
        }
        if (user.x() != q.UNSET)
        {
            boolean flag;
            if (user.x() == q.YES)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            objectnode.put("is_pushable", flag);
        }
        if (user.y())
        {
            objectnode.put("is_employee", true);
        }
        if (user.z() != null)
        {
            a(objectnode, user.z());
        }
        if (user.C() != null)
        {
            objectnode.put("last_active", a(user.C()));
        }
        if (user.D() != null)
        {
            objectnode.put("mobile_app_data", a(user.D()));
        }
        if (user.E() != null)
        {
            objectnode.put("type", user.E());
        }
        if (user.F() != null)
        {
            objectnode.put("auth_token", user.F());
        }
        return objectnode.toString();
    }

    public void a(ObjectNode objectnode, Birthday birthday)
    {
        Object obj = null;
        int i = birthday.b();
        int j = birthday.a();
        String s = obj;
        if (i != 0)
        {
            s = obj;
            if (j != 0)
            {
                String s1 = new String((new StringBuilder()).append(i).append("/").append(j).toString());
                s = s1;
                if (birthday.d())
                {
                    s = (new StringBuilder()).append(s1).append("/").append(birthday.c()).toString();
                }
            }
        }
        objectnode.put("birthday_date", s);
    }

    public void a(ObjectNode objectnode, Name name)
    {
        if (name.a())
        {
            objectnode.put("first_name", name.getFirstName());
        }
        if (name.b())
        {
            objectnode.put("last_name", name.getLastName());
        }
        if (name.e())
        {
            objectnode.put("name", name.getDisplayName());
        }
    }

    public Name b(JsonNode jsonnode)
    {
        String s2 = null;
        String s;
        String s1;
        if (jsonnode.has("first_name"))
        {
            s = com.facebook.common.w.e.b(jsonnode.get("first_name"));
        } else
        {
            s = null;
        }
        if (jsonnode.has("last_name"))
        {
            s1 = com.facebook.common.w.e.b(jsonnode.get("last_name"));
        } else
        {
            s1 = null;
        }
        if (jsonnode.has("name"))
        {
            s2 = com.facebook.common.w.e.b(jsonnode.get("name"));
        }
        return new Name(s, s1, s2);
    }

    public User b(n n, JsonNode jsonnode)
    {
        o o1 = new o();
        Preconditions.checkArgument(jsonnode.has("uid"), "Missing id field on profile");
        String s1 = com.facebook.common.w.e.b(jsonnode.get("uid"));
        String s = s1;
        if (s1 == null)
        {
            s = com.facebook.common.w.e.b(jsonnode.get("id"));
        }
        o1.a(n, s);
        if (com.facebook.common.w.e.a(jsonnode.get("contact_email")))
        {
            o1.a(es.a(new UserEmailAddress(com.facebook.common.w.e.b(jsonnode.get("contact_email")), 0)));
        } else
        if (jsonnode.has("emails"))
        {
            o1.a(c(jsonnode.get("emails")));
        }
        if (com.facebook.common.w.e.a(jsonnode.get("phones")))
        {
            o1.b(d(jsonnode.get("phones")));
        }
        o1.a(b(jsonnode));
        o1.a(e(jsonnode));
        if (jsonnode.has("pic_square"))
        {
            o1.b(a(com.facebook.common.w.e.b(jsonnode.get("pic_square"))));
        }
        if (jsonnode.has("pic_big"))
        {
            o1.c(a(com.facebook.common.w.e.b(jsonnode.get("pic_big"))));
        }
        if (jsonnode.has("pic_crop"))
        {
            o1.a(a(jsonnode.get("pic_crop")));
        }
        if (jsonnode.has("rank"))
        {
            o1.a((float)com.facebook.common.w.e.e(jsonnode.get("rank")));
        }
        if (jsonnode.has("is_pushable"))
        {
            if (jsonnode.get("is_pushable").booleanValue())
            {
                n = q.YES;
            } else
            {
                n = q.NO;
            }
            o1.a(n);
        } else
        {
            o1.a(q.UNSET);
        }
        if (jsonnode.has("affiliations"))
        {
            for (n = jsonnode.get("affiliations").iterator(); n.hasNext();)
            {
                if (com.facebook.common.w.e.c(((JsonNode)n.next()).get("nid")) == 0x30186a0L)
                {
                    o1.a(true);
                }
            }

        } else
        {
            o1.a(jsonnode.path("is_employee").asBoolean(false));
        }
        if (jsonnode.has("last_active"))
        {
            o1.a(f(jsonnode.get("last_active")));
        }
        if (jsonnode.has("mobile_app_data"))
        {
            o1.a(g(jsonnode.get("mobile_app_data")));
        }
        if (jsonnode.has("type"))
        {
            o1.f(com.facebook.common.w.e.b(jsonnode.get("type")));
        }
        if (jsonnode.has("auth_token"))
        {
            o1.g(com.facebook.common.w.e.a(jsonnode.get("auth_token"), null));
        }
        return o1.x();
    }

    public JsonNode b(es es1)
    {
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        es1 = es1.iterator();
        while (es1.hasNext()) 
        {
            UserPhoneNumber userphonenumber = (UserPhoneNumber)es1.next();
            ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("full_number", userphonenumber.b());
            objectnode.put("display_number", userphonenumber.a());
            if (userphonenumber.g() != q.UNSET)
            {
                boolean flag;
                if (userphonenumber.g() == q.YES)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                objectnode.put("is_verified", flag);
            }
            objectnode.put("android_type", userphonenumber.f());
            arraynode.add(objectnode);
        }
        return arraynode;
    }

    public es c(JsonNode jsonnode)
    {
        et et1 = es.e();
        for (jsonnode = jsonnode.iterator(); jsonnode.hasNext(); et1.b(new UserEmailAddress(com.facebook.common.w.e.b((JsonNode)jsonnode.next()), 0))) { }
        return et1.b();
    }

    public es d(JsonNode jsonnode)
    {
        et et1;
        Iterator iterator;
        et1 = es.e();
        iterator = jsonnode.iterator();
_L2:
        int i;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = (JsonNode)iterator.next();
        String s;
        String s1;
        if (((JsonNode) (obj)).has("full_number"))
        {
            s1 = com.facebook.common.w.e.b(((JsonNode) (obj)).get("full_number"));
            s = com.facebook.common.w.e.b(((JsonNode) (obj)).get("display_number"));
        } else
        {
            jsonnode = com.facebook.common.w.e.b(((JsonNode) (obj)).get("country_code"));
            s = com.facebook.common.w.e.b(((JsonNode) (obj)).get("number"));
            s = (new StringBuilder()).append("+").append(jsonnode).append(s).toString();
            s1 = s;
        }
        jsonnode = q.UNSET;
        if (((JsonNode) (obj)).has("is_verified"))
        {
            if (((JsonNode) (obj)).get("is_verified").booleanValue())
            {
                jsonnode = q.YES;
            } else
            {
                jsonnode = q.NO;
            }
        }
        if (((JsonNode) (obj)).has("android_type"))
        {
            i = com.facebook.common.w.e.d(((JsonNode) (obj)).get("android_type"));
        } else
        {
            if (!((JsonNode) (obj)).has("type"))
            {
                break MISSING_BLOCK_LABEL_272;
            }
            obj = com.facebook.common.w.e.b(((JsonNode) (obj)).get("type"));
            if ("other_phone".equals(obj))
            {
                i = 7;
            } else
            {
                if (!"cell".equals(obj))
                {
                    break MISSING_BLOCK_LABEL_272;
                }
                i = 2;
            }
        }
_L3:
        et1.b(new UserPhoneNumber(s, s1, i, jsonnode));
        if (true) goto _L2; else goto _L1
_L1:
        return et1.b();
        i = 0;
          goto _L3
    }

    public Birthday e(JsonNode jsonnode)
    {
        int j;
        j = 0;
        jsonnode = jsonnode.get("birthday_date");
        if (jsonnode == null || jsonnode.isNull()) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        String s = jsonnode.textValue();
        jsonnode = ((SimpleDateFormat)b.get()).parse(s, new ParsePosition(0));
        int l;
        if (jsonnode != null)
        {
            k = 1;
        } else
        {
            jsonnode = ((SimpleDateFormat)c.get()).parse(s, new ParsePosition(0));
            k = 0;
        }
        if (jsonnode == null) goto _L2; else goto _L3
_L3:
        i = jsonnode.getMonth() + 1;
        j = jsonnode.getDate();
        if (k != 0)
        {
            l = jsonnode.getYear() + 1900;
            k = i;
            i = l;
        } else
        {
            boolean flag = false;
            k = i;
            i = ((flag) ? 1 : 0);
        }
_L5:
        return new Birthday(k, j, i);
_L2:
        i = 0;
        k = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public LastActive f(JsonNode jsonnode)
    {
        while (jsonnode == null || !jsonnode.has("time") || !jsonnode.has("active")) 
        {
            return null;
        }
        return new LastActive(com.facebook.common.w.e.c(jsonnode.get("time")) * 1000L, com.facebook.common.w.e.g(jsonnode.get("active")));
    }

    public MobileAppData g(JsonNode jsonnode)
    {
        while (jsonnode == null || !jsonnode.has("has_push") || !jsonnode.has("is_installed") || !jsonnode.has("last_used")) 
        {
            return null;
        }
        Map map;
        Map map1;
        try
        {
            map = (Map)a.readValue(jsonnode.get("has_push").toString(), new af(this));
            map1 = (Map)a.readValue(jsonnode.get("is_installed").toString(), new ag(this));
            jsonnode = (Map)a.readValue(jsonnode.get("last_used").toString(), new ah(this));
            Iterator iterator = jsonnode.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((java.util.Map.Entry)iterator.next()).getValue() == null)
                {
                    iterator.remove();
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (JsonNode jsonnode)
        {
            throw new RuntimeException("Unexpected serialization exception with mobile_app_data", jsonnode);
        }
        // Misplaced declaration of an exception variable
        catch (JsonNode jsonnode)
        {
            throw new RuntimeException("Unexpected serialization exception with mobile_app_data", jsonnode);
        }
        // Misplaced declaration of an exception variable
        catch (JsonNode jsonnode)
        {
            throw new RuntimeException("Unexpected serialization exception with mobile_app_data", jsonnode);
        }
        jsonnode = new MobileAppData(ev.a(map), ev.a(map1), ev.a(jsonnode));
        return jsonnode;
    }

}
