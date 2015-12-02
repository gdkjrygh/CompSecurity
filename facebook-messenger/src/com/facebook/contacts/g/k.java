// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.common.w.e;
import com.facebook.contacts.server.ContactInteractionEvent;
import com.facebook.contacts.server.UploadBulkContactChange;
import com.facebook.contacts.server.UploadBulkContactChangeResult;
import com.facebook.contacts.server.UploadBulkContactFieldMatch;
import com.facebook.contacts.server.UploadBulkContactsParams;
import com.facebook.contacts.server.UploadBulkContactsResult;
import com.facebook.contacts.server.ad;
import com.facebook.contacts.server.af;
import com.facebook.contacts.server.ag;
import com.facebook.contacts.server.ai;
import com.facebook.contacts.server.aj;
import com.facebook.contacts.server.c;
import com.facebook.debug.log.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.Name;
import com.facebook.user.User;
import com.facebook.user.UserEmailAddress;
import com.facebook.user.UserPhoneNumber;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.contacts.g:
//            l

public class k
    implements f
{

    private static final Class a = com/facebook/contacts/g/k;
    private final JsonFactory b;

    public k(JsonFactory jsonfactory)
    {
        b = jsonfactory;
    }

    private String a(ContactInteractionEvent contactinteractionevent)
    {
        switch (com.facebook.contacts.g.l.b[contactinteractionevent.a().ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid event: ").append(contactinteractionevent).toString());

        case 1: // '\001'
            return "sms_sent";

        case 2: // '\002'
            return "sms_received";

        case 3: // '\003'
            return "mms_sent";

        case 4: // '\004'
            return "mms_received";

        case 5: // '\005'
            return "call_sent";

        case 6: // '\006'
            return "call_received";
        }
    }

    private String a(UploadBulkContactChange uploadbulkcontactchange)
    {
        switch (l.a[uploadbulkcontactchange.c().ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "add";

        case 2: // '\002'
            return "modify";

        case 3: // '\003'
            return "delete";
        }
    }

    private String a(UserEmailAddress useremailaddress)
    {
        int i = useremailaddress.b();
        if (i == 1)
        {
            return "home";
        }
        if (i == 2)
        {
            return "work";
        } else
        {
            return "other";
        }
    }

    private String a(UserPhoneNumber userphonenumber)
    {
        int i = userphonenumber.f();
        if (i == 1)
        {
            return "home";
        }
        if (i == 3)
        {
            return "work";
        }
        if (i == 2)
        {
            return "mobile";
        }
        if (i == 5)
        {
            return "fax_home";
        }
        if (i == 4)
        {
            return "fax_work";
        }
        if (i == 13)
        {
            return "fax_other";
        }
        if (i == 6)
        {
            return "pager";
        } else
        {
            return "other";
        }
    }

    private String a(es es1)
    {
        StringWriter stringwriter = new StringWriter();
        JsonGenerator jsongenerator = b.createJsonGenerator(stringwriter);
        jsongenerator.writeStartArray();
        for (es1 = es1.iterator(); es1.hasNext(); a((UploadBulkContactChange)es1.next(), jsongenerator)) { }
        jsongenerator.writeEndArray();
        jsongenerator.flush();
        return stringwriter.toString();
    }

    private void a(UploadBulkContactChange uploadbulkcontactchange, JsonGenerator jsongenerator)
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeStringField("client_contact_id", uploadbulkcontactchange.a());
        jsongenerator.writeStringField("update_type", a(uploadbulkcontactchange));
        a(uploadbulkcontactchange.d(), jsongenerator);
        a(uploadbulkcontactchange.b(), jsongenerator);
        jsongenerator.writeEndObject();
    }

    private void a(User user, JsonGenerator jsongenerator)
    {
        jsongenerator.writeObjectFieldStart("contact");
        jsongenerator.writeObjectFieldStart("name");
        Object obj = user.d();
        jsongenerator.writeStringField("formatted", ((Name) (obj)).f());
        if (((Name) (obj)).a())
        {
            jsongenerator.writeStringField("first", ((Name) (obj)).getFirstName());
        }
        if (((Name) (obj)).b())
        {
            jsongenerator.writeStringField("last", ((Name) (obj)).getLastName());
        }
        jsongenerator.writeEndObject();
        obj = user.j();
        if (!((es) (obj)).isEmpty())
        {
            jsongenerator.writeArrayFieldStart("emails");
            for (obj = ((es) (obj)).iterator(); ((Iterator) (obj)).hasNext(); jsongenerator.writeEndObject())
            {
                UserEmailAddress useremailaddress = (UserEmailAddress)((Iterator) (obj)).next();
                jsongenerator.writeStartObject();
                jsongenerator.writeStringField("type", a(useremailaddress));
                jsongenerator.writeStringField("email", useremailaddress.a());
            }

            jsongenerator.writeEndArray();
        }
        user = user.k();
        if (!user.isEmpty())
        {
            jsongenerator.writeArrayFieldStart("phones");
            for (user = user.iterator(); user.hasNext(); jsongenerator.writeEndObject())
            {
                UserPhoneNumber userphonenumber = (UserPhoneNumber)user.next();
                jsongenerator.writeStartObject();
                jsongenerator.writeStringField("type", a(userphonenumber));
                jsongenerator.writeStringField("number", userphonenumber.b());
            }

            jsongenerator.writeEndArray();
        }
        jsongenerator.writeEndObject();
    }

    private void a(es es1, JsonGenerator jsongenerator)
    {
        jsongenerator.writeArrayFieldStart("interaction_events");
        for (es1 = es1.iterator(); es1.hasNext(); jsongenerator.writeEndObject())
        {
            Object obj = (ContactInteractionEvent)es1.next();
            jsongenerator.writeStartObject();
            jsongenerator.writeStringField("type", a(((ContactInteractionEvent) (obj))));
            jsongenerator.writeNumberField("count", ((ContactInteractionEvent) (obj)).b());
            jsongenerator.writeArrayFieldStart("timestamps");
            for (obj = ((ContactInteractionEvent) (obj)).c().iterator(); ((Iterator) (obj)).hasNext(); jsongenerator.writeNumber(((Long)((Iterator) (obj)).next()).longValue() / 1000L)) { }
            jsongenerator.writeEndArray();
        }

        jsongenerator.writeEndArray();
    }

    public UploadBulkContactsResult a(UploadBulkContactsParams uploadbulkcontactsparams, r r1)
    {
        String s;
        et et1;
        Iterator iterator;
        uploadbulkcontactsparams = r1.c();
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got response: ").append(uploadbulkcontactsparams).toString());
        s = e.b(uploadbulkcontactsparams.get("import_id"));
        et1 = es.e();
        iterator = uploadbulkcontactsparams.get("contact_changes").fields();
_L8:
        Object obj;
        String s1;
        String s2;
        et et2;
        JsonNode jsonnode;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        uploadbulkcontactsparams = (java.util.Map.Entry)iterator.next();
        s1 = (String)uploadbulkcontactsparams.getKey();
        jsonnode = (JsonNode)uploadbulkcontactsparams.getValue();
        uploadbulkcontactsparams = e.b(jsonnode.get("update_type"));
        Iterator iterator1;
        if (uploadbulkcontactsparams.equals("add"))
        {
            r1 = ag.ADD;
        } else
        if (uploadbulkcontactsparams.equals("modify"))
        {
            r1 = ag.MODIFY;
        } else
        if (uploadbulkcontactsparams.equals("remove"))
        {
            r1 = ag.REMOVE;
        } else
        if (uploadbulkcontactsparams.equals("none"))
        {
            r1 = ag.NONE;
        } else
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Unrecognized contact change type: ").append(uploadbulkcontactsparams).append(", skipping").toString());
            continue; /* Loop/switch isn't completed */
        }
        s2 = e.b(jsonnode.get("contact").get("id"));
        et2 = es.e();
        iterator1 = jsonnode.get("field_matches").iterator();
_L6:
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        uploadbulkcontactsparams = (JsonNode)iterator1.next();
        obj = e.b(uploadbulkcontactsparams.get("match_type"));
        if (((String) (obj)).equals("hard"))
        {
            obj = ai.HARD;
        } else
        if (((String) (obj)).equals("soft"))
        {
            obj = ai.SOFT;
        } else
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Unrecognized contact field match type: ").append(((String) (obj))).append(", skipping").toString());
            continue; /* Loop/switch isn't completed */
        }
        uploadbulkcontactsparams = e.b(uploadbulkcontactsparams.get("value_type"));
        if (!uploadbulkcontactsparams.equals("name")) goto _L2; else goto _L1
_L1:
        uploadbulkcontactsparams = aj.NAME;
_L4:
        et2.b(new UploadBulkContactFieldMatch(((ai) (obj)), uploadbulkcontactsparams));
        continue; /* Loop/switch isn't completed */
_L2:
        if (uploadbulkcontactsparams.equals("email"))
        {
            uploadbulkcontactsparams = aj.EMAIL;
            continue; /* Loop/switch isn't completed */
        }
        if (uploadbulkcontactsparams.equals("phone"))
        {
            uploadbulkcontactsparams = aj.PHONE;
            continue; /* Loop/switch isn't completed */
        }
        if (uploadbulkcontactsparams.equals("email_public_hash"))
        {
            uploadbulkcontactsparams = aj.EMAIL_PUBLIC_HASH;
            continue; /* Loop/switch isn't completed */
        }
        if (!uploadbulkcontactsparams.equals("phone_public_hash"))
        {
            break; /* Loop/switch isn't completed */
        }
        uploadbulkcontactsparams = aj.PHONE_PUBLIC_HASH;
        if (true) goto _L4; else goto _L3
_L3:
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Unrecognized contact field value type: ").append(uploadbulkcontactsparams).append(", skipping").toString());
        if (true) goto _L6; else goto _L5
_L5:
        uploadbulkcontactsparams = e.b(jsonnode.get("match_confidence"));
        if (uploadbulkcontactsparams.equals("high"))
        {
            uploadbulkcontactsparams = af.HIGH;
        } else
        if (uploadbulkcontactsparams.equals("medium"))
        {
            uploadbulkcontactsparams = af.MEDIUM;
        } else
        if (uploadbulkcontactsparams.equals("low"))
        {
            uploadbulkcontactsparams = af.LOW;
        } else
        if (uploadbulkcontactsparams.equals("very_low"))
        {
            uploadbulkcontactsparams = af.VERY_LOW;
        } else
        if (uploadbulkcontactsparams.equals("unknown"))
        {
            uploadbulkcontactsparams = af.UNKNOWN;
        } else
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Unrecognized confidence type: ").append(uploadbulkcontactsparams).toString());
            uploadbulkcontactsparams = af.UNKNOWN;
        }
        et1.b(new UploadBulkContactChangeResult(r1, s1, s2, et2.b(), uploadbulkcontactsparams));
        if (true) goto _L8; else goto _L7
_L7:
        return new UploadBulkContactsResult(s, et1.b(), com.facebook.fbservice.c.b.FROM_SERVER, System.currentTimeMillis());
    }

    public n a(UploadBulkContactsParams uploadbulkcontactsparams)
    {
        java.util.ArrayList arraylist = hq.a();
        if (uploadbulkcontactsparams.a() != null)
        {
            arraylist.add(new BasicNameValuePair("import_id", uploadbulkcontactsparams.a()));
        }
        arraylist.add(new BasicNameValuePair("contact_changes", a(uploadbulkcontactsparams.b())));
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Uploading contacts: ").append(arraylist).toString());
        return new n("graphUploadBulkContacts", "POST", "me/bulkcontacts", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((UploadBulkContactsParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((UploadBulkContactsParams)obj, r1);
    }

}
