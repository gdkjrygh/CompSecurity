// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import com.google.android.apps.wallet.wobs.add.ProgramCardsUiProperties;

public final class LoyaltyCardsUiProperties
    implements ProgramCardsUiProperties
{

    static final int COLOR_NAMES[];
    static final int COLOR_OPTIONS[];
    static final int PROGRAM_ICONS[] = {
        1, 9, 10, 11, 12
    };
    static final int PROGRAM_ICON_NAMES[];

    public LoyaltyCardsUiProperties()
    {
    }

    public final int[] getColorNames()
    {
        return COLOR_NAMES;
    }

    public final int[] getColorOptions()
    {
        return COLOR_OPTIONS;
    }

    public final int getEditCardInfoFragmentTitle(int i)
    {
        switch (i)
        {
        default:
            return com.google.android.apps.walletnfcrel.R.string.loyalty_programs_title;

        case 2: // '\002'
            return com.google.android.apps.walletnfcrel.R.string.loyalty_edit_title;
        }
    }

    public final int getErrorDialogMessage()
    {
        return com.google.android.apps.walletnfcrel.R.string.loyalty_add_program_error_message;
    }

    public final int getErrorDialogTitle()
    {
        return com.google.android.apps.walletnfcrel.R.string.loyalty_new_program_error_title;
    }

    public final int[] getProgramIconNames()
    {
        return PROGRAM_ICON_NAMES;
    }

    public final int[] getProgramIcons()
    {
        return PROGRAM_ICONS;
    }

    public final int getSearchProgramsFragmentTitle()
    {
        return com.google.android.apps.walletnfcrel.R.string.loyalty_new_program_title;
    }

    public final int getSuccessToastMessage()
    {
        return com.google.android.apps.walletnfcrel.R.string.loyalty_add_program_success_message;
    }

    static 
    {
        COLOR_OPTIONS = (new int[] {
            com.google.android.apps.walletnfcrel.R.color.wobs_customcolor0, com.google.android.apps.walletnfcrel.R.color.wobs_customcolor1, com.google.android.apps.walletnfcrel.R.color.wobs_customcolor2, com.google.android.apps.walletnfcrel.R.color.wobs_customcolor3, com.google.android.apps.walletnfcrel.R.color.wobs_customcolor4, com.google.android.apps.walletnfcrel.R.color.wobs_customcolor5, com.google.android.apps.walletnfcrel.R.color.wobs_customcolor6, com.google.android.apps.walletnfcrel.R.color.wobs_customcolor7, com.google.android.apps.walletnfcrel.R.color.wobs_customcolor8, com.google.android.apps.walletnfcrel.R.color.wobs_customcolor9
        });
        COLOR_NAMES = (new int[] {
            com.google.android.apps.walletnfcrel.R.string.color_name_blue, com.google.android.apps.walletnfcrel.R.string.color_name_lightblue, com.google.android.apps.walletnfcrel.R.string.color_name_green, com.google.android.apps.walletnfcrel.R.string.color_name_yellow, com.google.android.apps.walletnfcrel.R.string.color_name_orange, com.google.android.apps.walletnfcrel.R.string.color_name_black, com.google.android.apps.walletnfcrel.R.string.color_name_purple, com.google.android.apps.walletnfcrel.R.string.color_name_red, com.google.android.apps.walletnfcrel.R.string.color_name_darkorange, com.google.android.apps.walletnfcrel.R.string.color_name_gray
        });
        PROGRAM_ICON_NAMES = (new int[] {
            com.google.android.apps.walletnfcrel.R.string.wobs_icon_description_default, com.google.android.apps.walletnfcrel.R.string.wobs_icon_description_grocery, com.google.android.apps.walletnfcrel.R.string.wobs_icon_description_dining, com.google.android.apps.walletnfcrel.R.string.wobs_icon_description_airline, com.google.android.apps.walletnfcrel.R.string.wobs_icon_description_pharmacy
        });
    }
}
