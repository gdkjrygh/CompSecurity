.class public Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;
.super Landroid/app/AlertDialog;
.source "MultiFieldTimePickerDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;,
        Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$OnMultiFieldTimeSetListener;
    }
.end annotation


# static fields
.field private static final HOUR_IN_MILLIS:I = 0x36ee80

.field private static final MINUTE_IN_MILLIS:I = 0xea60

.field private static final SECOND_IN_MILLIS:I = 0x3e8


# instance fields
.field private final mAmPmSpinner:Landroid/widget/NumberPicker;

.field private final mBaseMilli:I

.field private final mHourSpinner:Landroid/widget/NumberPicker;

.field private final mIs24hourFormat:Z

.field private final mListener:Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$OnMultiFieldTimeSetListener;

.field private final mMilliSpinner:Landroid/widget/NumberPicker;

.field private final mMinuteSpinner:Landroid/widget/NumberPicker;

.field private final mSecSpinner:Landroid/widget/NumberPicker;

.field private final mStep:I


# direct methods
.method public constructor <init>(Landroid/content/Context;IIIIIIIIZLorg/chromium/ui/picker/MultiFieldTimePickerDialog$OnMultiFieldTimeSetListener;)V
    .locals 20
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "theme"    # I
    .param p3, "hour"    # I
    .param p4, "minute"    # I
    .param p5, "second"    # I
    .param p6, "milli"    # I
    .param p7, "min"    # I
    .param p8, "max"    # I
    .param p9, "step"    # I
    .param p10, "is24hourFormat"    # Z
    .param p11, "listener"    # Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$OnMultiFieldTimeSetListener;

    .prologue
    .line 55
    invoke-direct/range {p0 .. p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    .line 56
    move-object/from16 v0, p11

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mListener:Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$OnMultiFieldTimeSetListener;

    .line 57
    move/from16 v0, p9

    move-object/from16 v1, p0

    iput v0, v1, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mStep:I

    .line 58
    move/from16 v0, p10

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mIs24hourFormat:Z

    .line 60
    move/from16 v0, p7

    move/from16 v1, p8

    if-lt v0, v1, :cond_0

    .line 61
    const/16 p7, 0x0

    .line 62
    const p8, 0x5265bff

    .line 64
    :cond_0
    if-ltz p9, :cond_1

    const v16, 0x5265c00

    move/from16 v0, p9

    move/from16 v1, v16

    if-lt v0, v1, :cond_2

    .line 65
    :cond_1
    const p9, 0xea60

    .line 68
    :cond_2
    const-string v16, "layout_inflater"

    move-object/from16 v0, p1

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/LayoutInflater;

    .line 71
    .local v4, "inflater":Landroid/view/LayoutInflater;
    sget v16, Lorg/chromium/ui/R$layout;->multi_field_time_picker_dialog:I

    const/16 v17, 0x0

    move/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v15

    .line 72
    .local v15, "view":Landroid/view/View;
    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->setView(Landroid/view/View;)V

    .line 74
    sget v16, Lorg/chromium/ui/R$id;->hour:I

    invoke-virtual/range {v15 .. v16}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/NumberPicker;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mHourSpinner:Landroid/widget/NumberPicker;

    .line 75
    sget v16, Lorg/chromium/ui/R$id;->minute:I

    invoke-virtual/range {v15 .. v16}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/NumberPicker;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMinuteSpinner:Landroid/widget/NumberPicker;

    .line 76
    sget v16, Lorg/chromium/ui/R$id;->second:I

    invoke-virtual/range {v15 .. v16}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/NumberPicker;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mSecSpinner:Landroid/widget/NumberPicker;

    .line 77
    sget v16, Lorg/chromium/ui/R$id;->milli:I

    invoke-virtual/range {v15 .. v16}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/NumberPicker;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    .line 78
    sget v16, Lorg/chromium/ui/R$id;->ampm:I

    invoke-virtual/range {v15 .. v16}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/NumberPicker;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mAmPmSpinner:Landroid/widget/NumberPicker;

    .line 80
    const v16, 0x36ee80

    div-int v10, p7, v16

    .line 81
    .local v10, "minHour":I
    const v16, 0x36ee80

    div-int v6, p8, v16

    .line 82
    .local v6, "maxHour":I
    const v16, 0x36ee80

    mul-int v16, v16, v10

    sub-int p7, p7, v16

    .line 83
    const v16, 0x36ee80

    mul-int v16, v16, v6

    sub-int p8, p8, v16

    .line 85
    if-ne v10, v6, :cond_3

    .line 86
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mHourSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setEnabled(Z)V

    .line 87
    move/from16 p3, v10

    .line 90
    :cond_3
    if-eqz p10, :cond_d

    .line 91
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mAmPmSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x8

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setVisibility(I)V

    .line 129
    :goto_0
    if-ne v10, v6, :cond_4

    .line 130
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mHourSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setEnabled(Z)V

    .line 132
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mHourSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mHourSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    .line 134
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mHourSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 136
    new-instance v14, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;

    const-string v16, "%02d"

    move-object/from16 v0, v16

    invoke-direct {v14, v0}, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;-><init>(Ljava/lang/String;)V

    .line 138
    .local v14, "twoDigitPaddingFormatter":Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;
    const v16, 0xea60

    div-int v11, p7, v16

    .line 139
    .local v11, "minMinute":I
    const v16, 0xea60

    div-int v7, p8, v16

    .line 140
    .local v7, "maxMinute":I
    const v16, 0xea60

    mul-int v16, v16, v11

    sub-int p7, p7, v16

    .line 141
    const v16, 0xea60

    mul-int v16, v16, v7

    sub-int p8, p8, v16

    .line 143
    if-ne v10, v6, :cond_13

    .line 144
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMinuteSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 145
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMinuteSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v7}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    .line 146
    if-ne v11, v7, :cond_5

    .line 148
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMinuteSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x1

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    invoke-virtual {v14, v11}, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;->format(I)Ljava/lang/String;

    move-result-object v19

    aput-object v19, v17, v18

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 150
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMinuteSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setEnabled(Z)V

    .line 151
    move/from16 p4, v11

    .line 158
    :cond_5
    :goto_1
    const v16, 0x36ee80

    move/from16 v0, p9

    move/from16 v1, v16

    if-lt v0, v1, :cond_6

    .line 159
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMinuteSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setEnabled(Z)V

    .line 162
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMinuteSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    move/from16 v1, p4

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 163
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMinuteSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v14}, Landroid/widget/NumberPicker;->setFormatter(Landroid/widget/NumberPicker$Formatter;)V

    .line 165
    const v16, 0xea60

    move/from16 v0, p9

    move/from16 v1, v16

    if-lt v0, v1, :cond_7

    .line 167
    sget v16, Lorg/chromium/ui/R$id;->second_colon:I

    invoke-virtual/range {v15 .. v16}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    const/16 v17, 0x8

    invoke-virtual/range {v16 .. v17}, Landroid/view/View;->setVisibility(I)V

    .line 168
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mSecSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x8

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setVisibility(I)V

    .line 171
    :cond_7
    move/from16 v0, p7

    div-int/lit16 v12, v0, 0x3e8

    .line 172
    .local v12, "minSecond":I
    move/from16 v0, p8

    div-int/lit16 v8, v0, 0x3e8

    .line 173
    .local v8, "maxSecond":I
    mul-int/lit16 v0, v12, 0x3e8

    move/from16 v16, v0

    sub-int p7, p7, v16

    .line 174
    mul-int/lit16 v0, v8, 0x3e8

    move/from16 v16, v0

    sub-int p8, p8, v16

    .line 176
    if-ne v10, v6, :cond_14

    if-ne v11, v7, :cond_14

    .line 177
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mSecSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v12}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 178
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mSecSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v8}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    .line 179
    if-ne v12, v8, :cond_8

    .line 181
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mSecSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x1

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    invoke-virtual {v14, v12}, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;->format(I)Ljava/lang/String;

    move-result-object v19

    aput-object v19, v17, v18

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 183
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mSecSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setEnabled(Z)V

    .line 184
    move/from16 p5, v12

    .line 191
    :cond_8
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mSecSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 192
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mSecSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v14}, Landroid/widget/NumberPicker;->setFormatter(Landroid/widget/NumberPicker$Formatter;)V

    .line 194
    const/16 v16, 0x3e8

    move/from16 v0, p9

    move/from16 v1, v16

    if-lt v0, v1, :cond_9

    .line 196
    sget v16, Lorg/chromium/ui/R$id;->second_dot:I

    invoke-virtual/range {v15 .. v16}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    const/16 v17, 0x8

    invoke-virtual/range {v16 .. v17}, Landroid/view/View;->setVisibility(I)V

    .line 197
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x8

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setVisibility(I)V

    .line 201
    :cond_9
    div-int/lit8 v16, p9, 0x2

    add-int v16, v16, p6

    div-int v16, v16, p9

    mul-int p6, v16, p9

    .line 202
    const/16 v16, 0x1

    move/from16 v0, p9

    move/from16 v1, v16

    if-eq v0, v1, :cond_a

    const/16 v16, 0xa

    move/from16 v0, p9

    move/from16 v1, v16

    if-eq v0, v1, :cond_a

    const/16 v16, 0x64

    move/from16 v0, p9

    move/from16 v1, v16

    if-ne v0, v1, :cond_18

    .line 203
    :cond_a
    if-ne v10, v6, :cond_15

    if-ne v11, v7, :cond_15

    if-ne v12, v8, :cond_15

    .line 205
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    div-int v17, p7, p9

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    div-int v17, p8, p9

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    .line 208
    move/from16 v0, p7

    move/from16 v1, p8

    if-ne v0, v1, :cond_b

    .line 209
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setEnabled(Z)V

    .line 210
    move/from16 p6, p7

    .line 217
    :cond_b
    :goto_3
    const/16 v16, 0x1

    move/from16 v0, p9

    move/from16 v1, v16

    if-ne v0, v1, :cond_16

    .line 218
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    new-instance v17, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;

    const-string v18, "%03d"

    invoke-direct/range {v17 .. v18}, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setFormatter(Landroid/widget/NumberPicker$Formatter;)V

    .line 224
    :cond_c
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    div-int v17, p6, p9

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 225
    const/16 v16, 0x0

    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mBaseMilli:I

    .line 241
    :goto_5
    return-void

    .line 93
    .end local v7    # "maxMinute":I
    .end local v8    # "maxSecond":I
    .end local v11    # "minMinute":I
    .end local v12    # "minSecond":I
    .end local v14    # "twoDigitPaddingFormatter":Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;
    :cond_d
    div-int/lit8 v9, v10, 0xc

    .line 94
    .local v9, "minAmPm":I
    div-int/lit8 v5, v6, 0xc

    .line 95
    .local v5, "maxAmPm":I
    div-int/lit8 v2, p3, 0xc

    .line 96
    .local v2, "amPm":I
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mAmPmSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v9}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 97
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mAmPmSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    .line 98
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mAmPmSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x2

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    sget v19, Lorg/chromium/ui/R$string;->time_picker_dialog_am:I

    move-object/from16 v0, p1

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v19

    aput-object v19, v17, v18

    const/16 v18, 0x1

    sget v19, Lorg/chromium/ui/R$string;->time_picker_dialog_pm:I

    move-object/from16 v0, p1

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v19

    aput-object v19, v17, v18

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 103
    rem-int/lit8 p3, p3, 0xc

    .line 104
    if-nez p3, :cond_e

    .line 105
    const/16 p3, 0xc

    .line 107
    :cond_e
    if-ne v9, v5, :cond_12

    .line 108
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mAmPmSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setEnabled(Z)V

    .line 109
    move v2, v9

    .line 111
    rem-int/lit8 v10, v10, 0xc

    .line 112
    rem-int/lit8 v6, v6, 0xc

    .line 113
    if-nez v10, :cond_10

    if-nez v6, :cond_10

    .line 114
    const/16 v10, 0xc

    .line 115
    const/16 v6, 0xc

    .line 126
    :cond_f
    :goto_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mAmPmSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/widget/NumberPicker;->setValue(I)V

    goto/16 :goto_0

    .line 116
    :cond_10
    if-nez v10, :cond_11

    .line 117
    move v10, v6

    .line 118
    const/16 v6, 0xc

    goto :goto_6

    .line 119
    :cond_11
    if-nez v6, :cond_f

    .line 120
    const/16 v6, 0xc

    goto :goto_6

    .line 123
    :cond_12
    const/4 v10, 0x1

    .line 124
    const/16 v6, 0xc

    goto :goto_6

    .line 154
    .end local v2    # "amPm":I
    .end local v5    # "maxAmPm":I
    .end local v9    # "minAmPm":I
    .restart local v7    # "maxMinute":I
    .restart local v11    # "minMinute":I
    .restart local v14    # "twoDigitPaddingFormatter":Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;
    :cond_13
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMinuteSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 155
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMinuteSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x3b

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    goto/16 :goto_1

    .line 187
    .restart local v8    # "maxSecond":I
    .restart local v12    # "minSecond":I
    :cond_14
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mSecSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 188
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mSecSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x3b

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    goto/16 :goto_2

    .line 213
    :cond_15
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x3e7

    div-int v17, v17, p9

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    goto/16 :goto_3

    .line 219
    :cond_16
    const/16 v16, 0xa

    move/from16 v0, p9

    move/from16 v1, v16

    if-ne v0, v1, :cond_17

    .line 220
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    new-instance v17, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;

    const-string v18, "%02d"

    invoke-direct/range {v17 .. v18}, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setFormatter(Landroid/widget/NumberPicker$Formatter;)V

    goto/16 :goto_4

    .line 221
    :cond_17
    const/16 v16, 0x64

    move/from16 v0, p9

    move/from16 v1, v16

    if-ne v0, v1, :cond_c

    .line 222
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    new-instance v17, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;

    const-string v18, "%d"

    invoke-direct/range {v17 .. v18}, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$NumberFormatter;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setFormatter(Landroid/widget/NumberPicker$Formatter;)V

    goto/16 :goto_4

    .line 226
    :cond_18
    const/16 v16, 0x3e8

    move/from16 v0, p9

    move/from16 v1, v16

    if-ge v0, v1, :cond_1a

    .line 228
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 229
    .local v13, "strValue":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    move/from16 v3, p7

    .local v3, "i":I
    :goto_7
    move/from16 v0, p8

    if-ge v3, v0, :cond_19

    .line 230
    const-string v16, "%03d"

    const/16 v17, 0x1

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    aput-object v19, v17, v18

    invoke-static/range {v16 .. v17}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    add-int v3, v3, p9

    goto :goto_7

    .line 232
    :cond_19
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v17

    add-int/lit8 v17, v17, -0x1

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    .line 234
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v16, v0

    sub-int v17, p6, p7

    div-int v17, v17, p9

    invoke-virtual/range {v16 .. v17}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 235
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    move-object/from16 v17, v0

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v16

    move/from16 v0, v16

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v16

    check-cast v16, [Ljava/lang/String;

    move-object/from16 v0, v17

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 237
    move/from16 v0, p7

    move-object/from16 v1, p0

    iput v0, v1, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mBaseMilli:I

    goto/16 :goto_5

    .line 239
    .end local v3    # "i":I
    .end local v13    # "strValue":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_1a
    const/16 v16, 0x0

    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mBaseMilli:I

    goto/16 :goto_5
.end method

.method private notifyDateSet()V
    .locals 7

    .prologue
    .line 249
    iget-object v5, p0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mHourSpinner:Landroid/widget/NumberPicker;

    invoke-virtual {v5}, Landroid/widget/NumberPicker;->getValue()I

    move-result v1

    .line 250
    .local v1, "hour":I
    iget-object v5, p0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMinuteSpinner:Landroid/widget/NumberPicker;

    invoke-virtual {v5}, Landroid/widget/NumberPicker;->getValue()I

    move-result v3

    .line 251
    .local v3, "minute":I
    iget-object v5, p0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mSecSpinner:Landroid/widget/NumberPicker;

    invoke-virtual {v5}, Landroid/widget/NumberPicker;->getValue()I

    move-result v4

    .line 252
    .local v4, "sec":I
    iget-object v5, p0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mMilliSpinner:Landroid/widget/NumberPicker;

    invoke-virtual {v5}, Landroid/widget/NumberPicker;->getValue()I

    move-result v5

    iget v6, p0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mStep:I

    mul-int/2addr v5, v6

    iget v6, p0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mBaseMilli:I

    add-int v2, v5, v6

    .line 253
    .local v2, "milli":I
    iget-boolean v5, p0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mIs24hourFormat:Z

    if-nez v5, :cond_1

    .line 254
    iget-object v5, p0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mAmPmSpinner:Landroid/widget/NumberPicker;

    invoke-virtual {v5}, Landroid/widget/NumberPicker;->getValue()I

    move-result v0

    .line 255
    .local v0, "ampm":I
    const/16 v5, 0xc

    if-ne v1, v5, :cond_0

    .line 256
    const/4 v1, 0x0

    .line 258
    :cond_0
    mul-int/lit8 v5, v0, 0xc

    add-int/2addr v1, v5

    .line 260
    .end local v0    # "ampm":I
    :cond_1
    iget-object v5, p0, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->mListener:Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$OnMultiFieldTimeSetListener;

    invoke-interface {v5, v1, v3, v4, v2}, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$OnMultiFieldTimeSetListener;->onTimeSet(IIII)V

    .line 261
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 245
    invoke-direct {p0}, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;->notifyDateSet()V

    .line 246
    return-void
.end method
