// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.photo;

import com.lyft.scoop.Screen;
import java.io.File;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.common.Objects;
import me.lyft.android.ui.Dialogs;

public final class PhotoPickerDialog extends Dialogs
{

    private Category analyticsCategory;
    private Screen captureScreen;
    private File outFile;
    private Screen previewScreen;
    private Screen returnScreen;
    private String title;

    public PhotoPickerDialog(String s, Screen screen, Screen screen1, Screen screen2, File file)
    {
        captureScreen = screen;
        returnScreen = screen1;
        outFile = file;
        title = s;
        previewScreen = screen2;
    }

    public PhotoPickerDialog(String s, Screen screen, Screen screen1, Screen screen2, File file, Category category)
    {
        captureScreen = screen;
        returnScreen = screen1;
        outFile = file;
        title = s;
        previewScreen = screen2;
        analyticsCategory = category;
    }

    public PhotoPickerDialog(String s, Screen screen, Screen screen1, File file)
    {
        captureScreen = screen;
        returnScreen = screen1;
        outFile = file;
        title = s;
    }

    public Category getAnalyticsCategory()
    {
        return (Category)Objects.firstNonNull(analyticsCategory, Category.PHOTO_PICKER_DIALOG);
    }

    public Screen getCaptureScreen()
    {
        return captureScreen;
    }

    public File getOutFile()
    {
        return outFile;
    }

    public Screen getPreviewScreen()
    {
        return previewScreen;
    }

    public Screen getReturnScreen()
    {
        return returnScreen;
    }

    public String getTitle()
    {
        return title;
    }
}
