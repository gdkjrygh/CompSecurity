// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class ry extends gjl
{

    public ry(android.view.Window.Callback callback)
    {
        super(callback);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        CharSequence charsequence = menuitem.getTitleCondensed();
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        menuitem.setTitleCondensed(charsequence.toString());
_L4:
        boolean flag = super.onMenuItemSelected(i, menuitem);
        menuitem.setTitleCondensed(charsequence);
        return flag;
_L2:
        if (menuitem.getTitle() != null)
        {
            menuitem.setTitleCondensed(menuitem.getTitle().toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
