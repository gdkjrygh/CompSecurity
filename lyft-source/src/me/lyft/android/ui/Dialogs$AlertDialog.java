// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package me.lyft.android.ui:
//            Dialogs

public class analyticsName extends Dialogs
{

    private String analyticsName;
    private ArrayList buttons;
    private int buttonsOrientation;
    private String className;
    private Integer icon;
    private String imageUrl;
    private List items;
    private String message;
    private Float messageFontSize;
    private Integer sound;
    private String title;
    private Integer titleColorResource;
    private Integer titleLayout;

    public analyticsName addButton(int i, String s, int j)
    {
        class DialogButtonMeta
        {

            int id;
            int layoutId;
            String text;

            public int getId()
            {
                return id;
            }

            public int getLayoutId()
            {
                return layoutId;
            }

            public String getText()
            {
                return text;
            }

            public DialogButtonMeta(int i, String s, int j)
            {
                id = i;
                text = s;
                layoutId = j;
            }
        }

        s = new DialogButtonMeta(i, s, j);
        getButtons().add(s);
        return this;
    }

    public getButtons addNegativeButton(String s)
    {
        return addNegativeButton(s, 0x7f030055);
    }

    public addNegativeButton addNegativeButton(String s, int i)
    {
        return addButton(0x7f0d0009, s, i);
    }

    public addButton addNeutralButton(String s)
    {
        return addNeutralButton(s, 0x7f030055);
    }

    public addNeutralButton addNeutralButton(String s, int i)
    {
        return addButton(0x7f0d000a, s, i);
    }

    public addButton addPositiveButton(String s)
    {
        return addPositiveButton(s, 0x7f030055);
    }

    public addPositiveButton addPositiveButton(String s, int i)
    {
        return addButton(0x7f0d000b, s, i);
    }

    public ArrayList getButtons()
    {
        return buttons;
    }

    public int getButtonsOrientation()
    {
        return buttonsOrientation;
    }

    public Class getDialogEventClass()
    {
        Class class1;
        try
        {
            class1 = Class.forName(className);
        }
        catch (Exception exception)
        {
            return null;
        }
        return class1;
    }

    public Integer getIcon()
    {
        return icon;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public List getItems()
    {
        return items;
    }

    public String getMessage()
    {
        return message;
    }

    public Float getMessageFontSize()
    {
        return messageFontSize;
    }

    public String getName()
    {
        return analyticsName;
    }

    public Integer getSound()
    {
        return sound;
    }

    public String getTitle()
    {
        return title;
    }

    public Integer getTitleColorResource()
    {
        return titleColorResource;
    }

    public Integer getTitleLayout()
    {
        return titleLayout;
    }

    public titleLayout setButtons(ArrayList arraylist)
    {
        buttons = arraylist;
        return this;
    }

    public buttons setButtonsOrientation(Integer integer)
    {
        buttonsOrientation = integer.intValue();
        return this;
    }

    public buttonsOrientation setDialogEventClass(Class class1)
    {
        className = class1.getName();
        return this;
    }

    public className setIcon(Integer integer)
    {
        icon = integer;
        return this;
    }

    public icon setImageUrl(String s)
    {
        imageUrl = s;
        return this;
    }

    public imageUrl setItems(List list)
    {
        items = list;
        return this;
    }

    public items setMessage(String s)
    {
        message = s;
        return this;
    }

    public message setMessageFontSize(float f)
    {
        messageFontSize = Float.valueOf(f);
        return this;
    }

    public messageFontSize setSound(int i)
    {
        sound = Integer.valueOf(i);
        return this;
    }

    public sound setTitle(String s)
    {
        title = s;
        return this;
    }

    public title setTitleColorResource(int i)
    {
        titleColorResource = Integer.valueOf(i);
        return this;
    }

    public titleColorResource setTitleLayout(Integer integer)
    {
        titleLayout = integer;
        return this;
    }

    public DialogButtonMeta(String s)
    {
        buttons = new ArrayList();
        analyticsName = s;
    }
}
