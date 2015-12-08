// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.invite.InviteDTO;
import me.lyft.android.infrastructure.lyft.invite.InvitePhoneNumber;

// Referenced classes of package me.lyft.android.providers:
//            ContactPhone

public class UserContact
    implements Comparable
{

    private String category;
    private String company;
    private String email;
    private final String name;
    private ContactPhone phone;
    private String photoUri;

    public UserContact(String s)
    {
        name = s;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((UserContact)obj);
    }

    public int compareTo(UserContact usercontact)
    {
        int i = getName().compareToIgnoreCase(usercontact.getName());
        if (i == 0)
        {
            if (phone != null && usercontact.phone != null)
            {
                return phone.compareTo(usercontact.phone);
            }
            if (usercontact.phone != null)
            {
                return -1;
            }
            if (email != null && usercontact.email != null)
            {
                return email.compareTo(usercontact.email);
            }
            if (usercontact.email != null)
            {
                return -1;
            }
        }
        return i;
    }

    public InviteDTO createEmailInvite()
    {
        String s = getEmail();
        if (!Strings.isNullOrEmpty(s))
        {
            return new InviteDTO(getFirstName(), getLastName(), null, s);
        } else
        {
            return null;
        }
    }

    public InviteDTO createPhoneInvite()
    {
        ContactPhone contactphone = getPhoneNumber();
        if (contactphone != null)
        {
            return new InviteDTO(getFirstName(), getLastName(), new InvitePhoneNumber[] {
                contactphone.create()
            }, null);
        } else
        {
            return null;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!(obj instanceof UserContact))
            {
                break label0;
            }
            obj = (UserContact)obj;
            if (this != obj)
            {
                flag = flag1;
                if (hashCode() != ((UserContact) (obj)).hashCode())
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public String getCategory()
    {
        return category;
    }

    public String getCompany()
    {
        return company;
    }

    public String getEmail()
    {
        return email;
    }

    public String getFirstName()
    {
        return name.split(" ")[0];
    }

    public String getLastName()
    {
        String as[] = name.split(" ");
        if (as.length > 1)
        {
            return as[1];
        } else
        {
            return null;
        }
    }

    public String getName()
    {
        return name;
    }

    public ContactPhone getPhoneNumber()
    {
        return phone;
    }

    public String getPhotoUri()
    {
        return photoUri;
    }

    public int hashCode()
    {
        int i = 1;
        if (!Strings.isNullOrEmpty(name))
        {
            i = name.hashCode() + 31;
        }
        int j;
        if (phone != null && !Strings.isNullOrEmpty(phone.getPhoneNumber()))
        {
            j = i * 13 + phone.getPhoneNumber().hashCode();
        } else
        {
            j = i;
            if (!Strings.isNullOrEmpty(email))
            {
                return i * 17 + email.hashCode();
            }
        }
        return j;
    }

    public UserContact setCategory(String s)
    {
        category = s;
        return this;
    }

    public UserContact setCompany(String s)
    {
        company = s;
        return this;
    }

    public UserContact setContactPhone(ContactPhone contactphone)
    {
        phone = contactphone;
        return this;
    }

    public UserContact setEmail(String s)
    {
        email = s;
        return this;
    }

    public UserContact setPhotoUri(String s)
    {
        photoUri = s;
        return this;
    }
}
