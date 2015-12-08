// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.swatchpicker.SwatchDrawable;
import com.google.android.apps.wallet.widgets.swatchpicker.SwatchPicker;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            ProgramIcons

public class CustomizeProgramCardActivity extends WalletActivity
{

    private int colorNames[];
    private int colorOptions[];
    private int programIconNames[];
    private int programIcons[];
    private int selectedColorIndex;
    private int selectedIconIndex;

    public CustomizeProgramCardActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void onCancelPressed()
    {
        setResult(0);
        finish();
    }

    private void onDonePressed()
    {
        Intent intent = new Intent();
        intent.putExtra("selected_icon_index", selectedIconIndex);
        intent.putExtra("selected_color_index", selectedColorIndex);
        setResult(-1, intent);
        finish();
    }

    private void setupColorSwatchPicker()
    {
        SwatchPicker swatchpicker = (SwatchPicker)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ColorSwatchPicker);
        for (int i = 0; i < swatchpicker.getNumSwatches() && i < colorOptions.length; i++)
        {
            ImageView imageview = swatchpicker.getSwatch(i);
            int j = getResources().getColor(colorOptions[i]);
            imageview.setTag((new StringBuilder(17)).append("Color:").append(i).toString());
            imageview.setImageDrawable(new SwatchDrawable(getResources(), j));
            imageview.setContentDescription(getString(colorNames[i]));
        }

        swatchpicker.setCurrentSelectionIndex(selectedColorIndex);
        swatchpicker.setOnSwatchSelectedListener(new com.google.android.apps.wallet.widgets.swatchpicker.SwatchPicker.OnSwatchSelectedListener() {

            final CustomizeProgramCardActivity this$0;

            public final void onSwatchSelected(int k)
            {
                selectedColorIndex = k;
                updatePreviewLogo();
            }

            
            {
                this$0 = CustomizeProgramCardActivity.this;
                super();
            }
        });
    }

    private void setupIconSwatchPicker()
    {
        SwatchPicker swatchpicker = (SwatchPicker)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.IconSwatchPicker);
        for (int i = 0; i < swatchpicker.getNumSwatches() && i < programIcons.length; i++)
        {
            ImageView imageview = swatchpicker.getSwatch(i);
            int j = ProgramIcons.getIconResource(programIcons[i]);
            imageview.setTag((new StringBuilder(16)).append("Icon:").append(i).toString());
            Drawable drawable = getResources().getDrawable(j);
            drawable.setColorFilter(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.medium), android.graphics.PorterDuff.Mode.SRC_IN);
            imageview.setImageDrawable(new SwatchDrawable(getResources(), drawable));
            imageview.setContentDescription(getString(programIconNames[i]));
        }

        swatchpicker.setCurrentSelectionIndex(selectedIconIndex);
        swatchpicker.setOnSwatchSelectedListener(new com.google.android.apps.wallet.widgets.swatchpicker.SwatchPicker.OnSwatchSelectedListener() {

            final CustomizeProgramCardActivity this$0;

            public final void onSwatchSelected(int k)
            {
                selectedIconIndex = k;
                updatePreviewLogo();
            }

            
            {
                this$0 = CustomizeProgramCardActivity.this;
                super();
            }
        });
    }

    private void updatePreviewLogo()
    {
        ImageView imageview = (ImageView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CardLogo);
        ProgramIcons.setIcon(imageview, programIcons[selectedIconIndex]);
        ProgramIcons.setColor(imageview, colorOptions[selectedColorIndex]);
        imageview.setContentDescription(getString(com.google.android.apps.walletnfcrel.R.string.loyalty_program_logo_description_format, new Object[] {
            getString(colorNames[selectedColorIndex])
        }));
    }

    protected final void doOnCreate(Bundle bundle)
    {
        Preconditions.checkArgument(getIntent().hasExtra("primary_text"), "Intent extra primary_text is required.");
        programIcons = getIntent().getIntArrayExtra("program_icons");
        programIconNames = getIntent().getIntArrayExtra("program_icon_names");
        colorOptions = getIntent().getIntArrayExtra("color_options");
        colorNames = getIntent().getIntArrayExtra("color_names");
        if (bundle != null)
        {
            selectedIconIndex = bundle.getInt("selected_icon_index");
            selectedColorIndex = bundle.getInt("selected_color_index");
        } else
        {
            selectedIconIndex = getIntent().getIntExtra("selected_icon_index", 0);
            selectedColorIndex = getIntent().getIntExtra("selected_color_index", 0);
        }
        setContentView(com.google.android.apps.walletnfcrel.R.layout.wobs_customize_program_card);
        bundle = getIntent().getStringExtra("primary_text");
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CardTitle)).setText(bundle);
        bundle = getIntent().getStringExtra("secondary_text");
        if (bundle != null)
        {
            TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.BelowTitleText);
            textview.setText(bundle);
            textview.setVisibility(0);
        }
        setupIconSwatchPicker();
        setupColorSwatchPicker();
        updatePreviewLogo();
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.customize_program_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.Done)
        {
            onDonePressed();
            return true;
        }
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.Cancel)
        {
            onCancelPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putInt("selected_icon_index", selectedIconIndex);
        bundle.putInt("selected_color_index", selectedColorIndex);
    }

    protected final void onUpPressed()
    {
        onDonePressed();
    }


/*
    static int access$002(CustomizeProgramCardActivity customizeprogramcardactivity, int i)
    {
        customizeprogramcardactivity.selectedIconIndex = i;
        return i;
    }

*/



/*
    static int access$202(CustomizeProgramCardActivity customizeprogramcardactivity, int i)
    {
        customizeprogramcardactivity.selectedColorIndex = i;
        return i;
    }

*/
}
