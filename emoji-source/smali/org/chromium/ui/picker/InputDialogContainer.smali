.class public Lorg/chromium/ui/picker/InputDialogContainer;
.super Ljava/lang/Object;
.source "InputDialogContainer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;,
        Lorg/chromium/ui/picker/InputDialogContainer$DateTimeListener;,
        Lorg/chromium/ui/picker/InputDialogContainer$FullTimeListener;,
        Lorg/chromium/ui/picker/InputDialogContainer$DateListener;,
        Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;
    }
.end annotation


# static fields
.field private static sTextInputTypeDate:I

.field private static sTextInputTypeDateTime:I

.field private static sTextInputTypeDateTimeLocal:I

.field private static sTextInputTypeMonth:I

.field private static sTextInputTypeTime:I

.field private static sTextInputTypeWeek:I


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mDialog:Landroid/app/AlertDialog;

.field private mDialogAlreadyDismissed:Z

.field private final mInputActionDelegate:Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "inputActionDelegate"    # Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;

    .prologue
    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    .line 75
    iput-object p2, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mInputActionDelegate:Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;

    .line 76
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/ui/picker/InputDialogContainer;)Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/ui/picker/InputDialogContainer;

    .prologue
    .line 33
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mInputActionDelegate:Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;

    return-object v0
.end method

.method static synthetic access$100(Lorg/chromium/ui/picker/InputDialogContainer;)Z
    .locals 1
    .param p0, "x0"    # Lorg/chromium/ui/picker/InputDialogContainer;

    .prologue
    .line 33
    iget-boolean v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialogAlreadyDismissed:Z

    return v0
.end method

.method static synthetic access$102(Lorg/chromium/ui/picker/InputDialogContainer;Z)Z
    .locals 0
    .param p0, "x0"    # Lorg/chromium/ui/picker/InputDialogContainer;
    .param p1, "x1"    # Z

    .prologue
    .line 33
    iput-boolean p1, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialogAlreadyDismissed:Z

    return p1
.end method

.method static synthetic access$200(Lorg/chromium/ui/picker/InputDialogContainer;)Landroid/app/AlertDialog;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/ui/picker/InputDialogContainer;

    .prologue
    .line 33
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic access$300()I
    .locals 1

    .prologue
    .line 33
    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTimeLocal:I

    return v0
.end method

.method static synthetic access$400()I
    .locals 1

    .prologue
    .line 33
    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeMonth:I

    return v0
.end method

.method public static initializeInputTypes(IIIIII)V
    .locals 0
    .param p0, "textInputTypeDate"    # I
    .param p1, "textInputTypeDateTime"    # I
    .param p2, "textInputTypeDateTimeLocal"    # I
    .param p3, "textInputTypeMonth"    # I
    .param p4, "textInputTypeTime"    # I
    .param p5, "textInputTypeWeek"    # I

    .prologue
    .line 59
    sput p0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDate:I

    .line 60
    sput p1, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTime:I

    .line 61
    sput p2, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTimeLocal:I

    .line 62
    sput p3, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeMonth:I

    .line 63
    sput p4, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeTime:I

    .line 64
    sput p5, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeWeek:I

    .line 65
    return-void
.end method

.method public static isDialogInputType(I)Z
    .locals 1
    .param p0, "type"    # I

    .prologue
    .line 68
    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDate:I

    if-eq p0, v0, :cond_0

    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeTime:I

    if-eq p0, v0, :cond_0

    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTime:I

    if-eq p0, v0, :cond_0

    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTimeLocal:I

    if-eq p0, v0, :cond_0

    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeMonth:I

    if-eq p0, v0, :cond_0

    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeWeek:I

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method dismissDialog()V
    .locals 1

    .prologue
    .line 288
    invoke-virtual {p0}, Lorg/chromium/ui/picker/InputDialogContainer;->isDialogShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 289
    :cond_0
    return-void
.end method

.method isDialogShowing()Z
    .locals 1

    .prologue
    .line 284
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected setFieldDateTimeValue(IIIIIIIII)V
    .locals 10
    .param p1, "dialogType"    # I
    .param p2, "year"    # I
    .param p3, "month"    # I
    .param p4, "monthDay"    # I
    .param p5, "hourOfDay"    # I
    .param p6, "minute"    # I
    .param p7, "second"    # I
    .param p8, "millis"    # I
    .param p9, "week"    # I

    .prologue
    .line 356
    iget-boolean v3, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialogAlreadyDismissed:Z

    if-eqz v3, :cond_0

    .line 382
    :goto_0
    return-void

    .line 358
    :cond_0
    const/4 v3, 0x1

    iput-boolean v3, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialogAlreadyDismissed:Z

    .line 360
    sget v3, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeMonth:I

    if-ne p1, v3, :cond_1

    .line 361
    iget-object v3, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mInputActionDelegate:Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;

    add-int/lit16 v4, p2, -0x7b2

    mul-int/lit8 v4, v4, 0xc

    add-int/2addr v4, p3

    int-to-double v4, v4

    invoke-interface {v3, v4, v5}, Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;->replaceDateTime(D)V

    goto :goto_0

    .line 362
    :cond_1
    sget v3, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeWeek:I

    if-ne p1, v3, :cond_2

    .line 363
    iget-object v3, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mInputActionDelegate:Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;

    move/from16 v0, p9

    invoke-static {p2, v0}, Lorg/chromium/ui/picker/WeekPicker;->createDateFromWeek(II)Ljava/util/Calendar;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    long-to-double v4, v4

    invoke-interface {v3, v4, v5}, Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;->replaceDateTime(D)V

    goto :goto_0

    .line 365
    :cond_2
    sget v3, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeTime:I

    if-ne p1, v3, :cond_3

    .line 366
    iget-object v3, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mInputActionDelegate:Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    int-to-long v6, p5

    invoke-virtual {v4, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    move/from16 v0, p6

    int-to-long v8, v0

    invoke-virtual {v6, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v6

    add-long/2addr v4, v6

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move/from16 v0, p7

    int-to-long v8, v0

    invoke-virtual {v6, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v6

    add-long/2addr v4, v6

    move/from16 v0, p8

    int-to-long v6, v0

    add-long/2addr v4, v6

    long-to-double v4, v4

    invoke-interface {v3, v4, v5}, Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;->replaceDateTime(D)V

    goto :goto_0

    .line 371
    :cond_3
    const-string v3, "UTC"

    invoke-static {v3}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v2

    .line 372
    .local v2, "cal":Ljava/util/Calendar;
    invoke-virtual {v2}, Ljava/util/Calendar;->clear()V

    .line 373
    const/4 v3, 0x1

    invoke-virtual {v2, v3, p2}, Ljava/util/Calendar;->set(II)V

    .line 374
    const/4 v3, 0x2

    invoke-virtual {v2, v3, p3}, Ljava/util/Calendar;->set(II)V

    .line 375
    const/4 v3, 0x5

    invoke-virtual {v2, v3, p4}, Ljava/util/Calendar;->set(II)V

    .line 376
    const/16 v3, 0xb

    invoke-virtual {v2, v3, p5}, Ljava/util/Calendar;->set(II)V

    .line 377
    const/16 v3, 0xc

    move/from16 v0, p6

    invoke-virtual {v2, v3, v0}, Ljava/util/Calendar;->set(II)V

    .line 378
    const/16 v3, 0xd

    move/from16 v0, p7

    invoke-virtual {v2, v3, v0}, Ljava/util/Calendar;->set(II)V

    .line 379
    const/16 v3, 0xe

    move/from16 v0, p8

    invoke-virtual {v2, v3, v0}, Ljava/util/Calendar;->set(II)V

    .line 380
    iget-object v3, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mInputActionDelegate:Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    long-to-double v4, v4

    invoke-interface {v3, v4, v5}, Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;->replaceDateTime(D)V

    goto/16 :goto_0
.end method

.method public showDialog(IDDDD[Lorg/chromium/ui/picker/DateTimeSuggestion;)V
    .locals 0
    .param p1, "type"    # I
    .param p2, "value"    # D
    .param p4, "min"    # D
    .param p6, "max"    # D
    .param p8, "step"    # D
    .param p10, "suggestions"    # [Lorg/chromium/ui/picker/DateTimeSuggestion;

    .prologue
    .line 201
    invoke-virtual {p0}, Lorg/chromium/ui/picker/InputDialogContainer;->dismissDialog()V

    .line 202
    if-nez p10, :cond_0

    .line 203
    invoke-virtual/range {p0 .. p9}, Lorg/chromium/ui/picker/InputDialogContainer;->showPickerDialog(IDDDD)V

    .line 207
    :goto_0
    return-void

    .line 205
    :cond_0
    invoke-virtual/range {p0 .. p10}, Lorg/chromium/ui/picker/InputDialogContainer;->showSuggestionDialog(IDDDD[Lorg/chromium/ui/picker/DateTimeSuggestion;)V

    goto :goto_0
.end method

.method public showPickerDialog(IDDDD)V
    .locals 20
    .param p1, "dialogType"    # I
    .param p2, "dialogValue"    # D
    .param p4, "min"    # D
    .param p6, "max"    # D
    .param p8, "step"    # D

    .prologue
    .line 86
    invoke-static/range {p2 .. p3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 87
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v18

    .line 88
    .local v18, "cal":Ljava/util/Calendar;
    const/16 v2, 0xe

    const/4 v3, 0x0

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 104
    :goto_0
    sget v2, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDate:I

    move/from16 v0, p1

    if-ne v0, v2, :cond_4

    .line 105
    const/4 v2, 0x1

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v2, 0x2

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v5

    const/4 v2, 0x5

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v2, p0

    move/from16 v3, p1

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    move-wide/from16 v16, p8

    invoke-virtual/range {v2 .. v17}, Lorg/chromium/ui/picker/InputDialogContainer;->showPickerDialog(IIIIIIIIIDDD)V

    .line 134
    :cond_0
    :goto_1
    return-void

    .line 90
    .end local v18    # "cal":Ljava/util/Calendar;
    :cond_1
    sget v2, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeMonth:I

    move/from16 v0, p1

    if-ne v0, v2, :cond_2

    .line 91
    invoke-static/range {p2 .. p3}, Lorg/chromium/ui/picker/MonthPicker;->createDateFromValue(D)Ljava/util/Calendar;

    move-result-object v18

    .restart local v18    # "cal":Ljava/util/Calendar;
    goto :goto_0

    .line 92
    .end local v18    # "cal":Ljava/util/Calendar;
    :cond_2
    sget v2, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeWeek:I

    move/from16 v0, p1

    if-ne v0, v2, :cond_3

    .line 93
    invoke-static/range {p2 .. p3}, Lorg/chromium/ui/picker/WeekPicker;->createDateFromValue(D)Ljava/util/Calendar;

    move-result-object v18

    .restart local v18    # "cal":Ljava/util/Calendar;
    goto :goto_0

    .line 95
    .end local v18    # "cal":Ljava/util/Calendar;
    :cond_3
    new-instance v19, Ljava/util/GregorianCalendar;

    const-string v2, "UTC"

    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    move-object/from16 v0, v19

    invoke-direct {v0, v2}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 99
    .local v19, "gregorianCalendar":Ljava/util/GregorianCalendar;
    new-instance v2, Ljava/util/Date;

    const-wide/high16 v6, -0x8000000000000000L

    invoke-direct {v2, v6, v7}, Ljava/util/Date;-><init>(J)V

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Ljava/util/GregorianCalendar;->setGregorianChange(Ljava/util/Date;)V

    .line 100
    move-wide/from16 v0, p2

    double-to-long v2, v0

    move-object/from16 v0, v19

    invoke-virtual {v0, v2, v3}, Ljava/util/GregorianCalendar;->setTimeInMillis(J)V

    .line 101
    move-object/from16 v18, v19

    .restart local v18    # "cal":Ljava/util/Calendar;
    goto :goto_0

    .line 110
    .end local v19    # "gregorianCalendar":Ljava/util/GregorianCalendar;
    :cond_4
    sget v2, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeTime:I

    move/from16 v0, p1

    if-ne v0, v2, :cond_5

    .line 111
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v2, 0xb

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v7

    const/16 v2, 0xc

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v2, p0

    move/from16 v3, p1

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    move-wide/from16 v16, p8

    invoke-virtual/range {v2 .. v17}, Lorg/chromium/ui/picker/InputDialogContainer;->showPickerDialog(IIIIIIIIIDDD)V

    goto :goto_1

    .line 115
    :cond_5
    sget v2, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTime:I

    move/from16 v0, p1

    if-eq v0, v2, :cond_6

    sget v2, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTimeLocal:I

    move/from16 v0, p1

    if-ne v0, v2, :cond_7

    .line 117
    :cond_6
    const/4 v2, 0x1

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v2, 0x2

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v5

    const/4 v2, 0x5

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/16 v2, 0xb

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v7

    const/16 v2, 0xc

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v8

    const/16 v2, 0xd

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v9

    const/16 v2, 0xe

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v10

    const/4 v11, 0x0

    move-object/from16 v2, p0

    move/from16 v3, p1

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    move-wide/from16 v16, p8

    invoke-virtual/range {v2 .. v17}, Lorg/chromium/ui/picker/InputDialogContainer;->showPickerDialog(IIIIIIIIIDDD)V

    goto/16 :goto_1

    .line 126
    :cond_7
    sget v2, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeMonth:I

    move/from16 v0, p1

    if-ne v0, v2, :cond_8

    .line 127
    const/4 v2, 0x1

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v2, 0x2

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v2, p0

    move/from16 v3, p1

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    move-wide/from16 v16, p8

    invoke-virtual/range {v2 .. v17}, Lorg/chromium/ui/picker/InputDialogContainer;->showPickerDialog(IIIIIIIIIDDD)V

    goto/16 :goto_1

    .line 129
    :cond_8
    sget v2, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeWeek:I

    move/from16 v0, p1

    if-ne v0, v2, :cond_0

    .line 130
    invoke-static/range {v18 .. v18}, Lorg/chromium/ui/picker/WeekPicker;->getISOWeekYearForDate(Ljava/util/Calendar;)I

    move-result v4

    .line 131
    .local v4, "year":I
    invoke-static/range {v18 .. v18}, Lorg/chromium/ui/picker/WeekPicker;->getWeekForDate(Ljava/util/Calendar;)I

    move-result v11

    .line 132
    .local v11, "week":I
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v2, p0

    move/from16 v3, p1

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    move-wide/from16 v16, p8

    invoke-virtual/range {v2 .. v17}, Lorg/chromium/ui/picker/InputDialogContainer;->showPickerDialog(IIIIIIIIIDDD)V

    goto/16 :goto_1
.end method

.method protected showPickerDialog(IIIIIIIIIDDD)V
    .locals 26
    .param p1, "dialogType"    # I
    .param p2, "year"    # I
    .param p3, "month"    # I
    .param p4, "monthDay"    # I
    .param p5, "hourOfDay"    # I
    .param p6, "minute"    # I
    .param p7, "second"    # I
    .param p8, "millis"    # I
    .param p9, "week"    # I
    .param p10, "min"    # D
    .param p12, "max"    # D
    .param p14, "step"    # D

    .prologue
    .line 213
    invoke-virtual/range {p0 .. p0}, Lorg/chromium/ui/picker/InputDialogContainer;->isDialogShowing()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v3}, Landroid/app/AlertDialog;->dismiss()V

    .line 215
    :cond_0
    move-wide/from16 v0, p14

    double-to-int v12, v0

    .line 217
    .local v12, "stepTime":I
    sget v3, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDate:I

    move/from16 v0, p1

    if-ne v0, v3, :cond_2

    .line 218
    new-instance v2, Lorg/chromium/ui/picker/ChromeDatePickerDialog;

    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    new-instance v4, Lorg/chromium/ui/picker/InputDialogContainer$DateListener;

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v4, v0, v1}, Lorg/chromium/ui/picker/InputDialogContainer$DateListener;-><init>(Lorg/chromium/ui/picker/InputDialogContainer;I)V

    move/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    invoke-direct/range {v2 .. v7}, Lorg/chromium/ui/picker/ChromeDatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 221
    .local v2, "dialog":Lorg/chromium/ui/picker/ChromeDatePickerDialog;
    invoke-virtual {v2}, Lorg/chromium/ui/picker/ChromeDatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object v3

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide/from16 v0, p10

    double-to-long v10, v0

    move-wide/from16 v0, p12

    double-to-long v12, v0

    move-object v4, v2

    move/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    invoke-static/range {v3 .. v13}, Lorg/chromium/ui/picker/DateDialogNormalizer;->normalize(Landroid/widget/DatePicker;Landroid/widget/DatePicker$OnDateChangedListener;IIIIIJJ)V

    .line 226
    .end local v12    # "stepTime":I
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    sget v4, Lorg/chromium/ui/R$string;->date_picker_dialog_title:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/chromium/ui/picker/ChromeDatePickerDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 227
    move-object/from16 v0, p0

    iput-object v2, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    .line 250
    .end local v2    # "dialog":Lorg/chromium/ui/picker/ChromeDatePickerDialog;
    :cond_1
    :goto_0
    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    const/4 v5, -0x1

    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    sget v6, Lorg/chromium/ui/R$string;->date_picker_dialog_set:I

    invoke-virtual {v3, v6}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v6

    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    check-cast v3, Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v4, v5, v6, v3}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 254
    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    const/4 v5, -0x2

    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    const/high16 v6, 0x1040000

    invoke-virtual {v3, v6}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v6

    const/4 v3, 0x0

    check-cast v3, Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v4, v5, v6, v3}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 258
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    const/4 v4, -0x3

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    sget v6, Lorg/chromium/ui/R$string;->date_picker_dialog_clear:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v5

    new-instance v6, Lorg/chromium/ui/picker/InputDialogContainer$4;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Lorg/chromium/ui/picker/InputDialogContainer$4;-><init>(Lorg/chromium/ui/picker/InputDialogContainer;)V

    invoke-virtual {v3, v4, v5, v6}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 268
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    new-instance v4, Lorg/chromium/ui/picker/InputDialogContainer$5;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lorg/chromium/ui/picker/InputDialogContainer$5;-><init>(Lorg/chromium/ui/picker/InputDialogContainer;)V

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 279
    const/4 v3, 0x0

    move-object/from16 v0, p0

    iput-boolean v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialogAlreadyDismissed:Z

    .line 280
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v3}, Landroid/app/AlertDialog;->show()V

    .line 281
    return-void

    .line 228
    .restart local v12    # "stepTime":I
    :cond_2
    sget v3, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeTime:I

    move/from16 v0, p1

    if-ne v0, v3, :cond_3

    .line 229
    new-instance v3, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;

    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    const/4 v5, 0x0

    move-wide/from16 v0, p10

    double-to-int v10, v0

    move-wide/from16 v0, p12

    double-to-int v11, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    invoke-static {v6}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v13

    new-instance v14, Lorg/chromium/ui/picker/InputDialogContainer$FullTimeListener;

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v14, v0, v1}, Lorg/chromium/ui/picker/InputDialogContainer$FullTimeListener;-><init>(Lorg/chromium/ui/picker/InputDialogContainer;I)V

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v3 .. v14}, Lorg/chromium/ui/picker/MultiFieldTimePickerDialog;-><init>(Landroid/content/Context;IIIIIIIIZLorg/chromium/ui/picker/MultiFieldTimePickerDialog$OnMultiFieldTimeSetListener;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 235
    :cond_3
    sget v3, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTime:I

    move/from16 v0, p1

    if-eq v0, v3, :cond_4

    sget v3, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTimeLocal:I

    move/from16 v0, p1

    if-ne v0, v3, :cond_5

    .line 237
    :cond_4
    new-instance v13, Lorg/chromium/ui/picker/DateTimePickerDialog;

    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    new-instance v15, Lorg/chromium/ui/picker/InputDialogContainer$DateTimeListener;

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v15, v0, v1}, Lorg/chromium/ui/picker/InputDialogContainer$DateTimeListener;-><init>(Lorg/chromium/ui/picker/InputDialogContainer;I)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    invoke-static {v3}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v21

    move/from16 v16, p2

    move/from16 v17, p3

    move/from16 v18, p4

    move/from16 v19, p5

    move/from16 v20, p6

    move-wide/from16 v22, p10

    move-wide/from16 v24, p12

    invoke-direct/range {v13 .. v25}, Lorg/chromium/ui/picker/DateTimePickerDialog;-><init>(Landroid/content/Context;Lorg/chromium/ui/picker/DateTimePickerDialog$OnDateTimeSetListener;IIIIIZDD)V

    move-object/from16 v0, p0

    iput-object v13, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 242
    :cond_5
    sget v3, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeMonth:I

    move/from16 v0, p1

    if-ne v0, v3, :cond_6

    .line 243
    new-instance v3, Lorg/chromium/ui/picker/MonthPickerDialog;

    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    new-instance v5, Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v5, v0, v1}, Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;-><init>(Lorg/chromium/ui/picker/InputDialogContainer;I)V

    move/from16 v6, p2

    move/from16 v7, p3

    move-wide/from16 v8, p10

    move-wide/from16 v10, p12

    invoke-direct/range {v3 .. v11}, Lorg/chromium/ui/picker/MonthPickerDialog;-><init>(Landroid/content/Context;Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;IIDD)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 245
    :cond_6
    sget v3, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeWeek:I

    move/from16 v0, p1

    if-ne v0, v3, :cond_1

    .line 246
    new-instance v3, Lorg/chromium/ui/picker/WeekPickerDialog;

    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    new-instance v5, Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v5, v0, v1}, Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;-><init>(Lorg/chromium/ui/picker/InputDialogContainer;I)V

    move/from16 v6, p2

    move/from16 v7, p9

    move-wide/from16 v8, p10

    move-wide/from16 v10, p12

    invoke-direct/range {v3 .. v11}, Lorg/chromium/ui/picker/WeekPickerDialog;-><init>(Landroid/content/Context;Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;IIDD)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    goto/16 :goto_0
.end method

.method showSuggestionDialog(IDDDD[Lorg/chromium/ui/picker/DateTimeSuggestion;)V
    .locals 14
    .param p1, "dialogType"    # I
    .param p2, "dialogValue"    # D
    .param p4, "min"    # D
    .param p6, "max"    # D
    .param p8, "step"    # D
    .param p10, "suggestions"    # [Lorg/chromium/ui/picker/DateTimeSuggestion;

    .prologue
    .line 140
    new-instance v13, Landroid/widget/ListView;

    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    invoke-direct {v13, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 141
    .local v13, "suggestionListView":Landroid/widget/ListView;
    new-instance v2, Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;

    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    invoke-static/range {p10 .. p10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 143
    .local v2, "adapter":Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;
    invoke-virtual {v13, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 144
    new-instance v0, Lorg/chromium/ui/picker/InputDialogContainer$1;

    move-object v1, p0

    move v3, p1

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    move-wide/from16 v8, p6

    move-wide/from16 v10, p8

    invoke-direct/range {v0 .. v11}, Lorg/chromium/ui/picker/InputDialogContainer$1;-><init>(Lorg/chromium/ui/picker/InputDialogContainer;Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;IDDDD)V

    invoke-virtual {v13, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 159
    sget v12, Lorg/chromium/ui/R$string;->date_picker_dialog_title:I

    .line 160
    .local v12, "dialogTitleId":I
    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeTime:I

    if-ne p1, v0, :cond_1

    .line 161
    sget v12, Lorg/chromium/ui/R$string;->time_picker_dialog_title:I

    .line 171
    :cond_0
    :goto_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v12}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mContext:Landroid/content/Context;

    const/high16 v3, 0x1040000

    invoke-virtual {v1, v3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    new-instance v3, Lorg/chromium/ui/picker/InputDialogContainer$2;

    invoke-direct {v3, p0}, Lorg/chromium/ui/picker/InputDialogContainer$2;-><init>(Lorg/chromium/ui/picker/InputDialogContainer;)V

    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    .line 183
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    new-instance v1, Lorg/chromium/ui/picker/InputDialogContainer$3;

    invoke-direct {v1, p0}, Lorg/chromium/ui/picker/InputDialogContainer$3;-><init>(Lorg/chromium/ui/picker/InputDialogContainer;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 192
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialogAlreadyDismissed:Z

    .line 193
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 194
    return-void

    .line 162
    :cond_1
    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTime:I

    if-eq p1, v0, :cond_2

    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTimeLocal:I

    if-ne p1, v0, :cond_3

    .line 164
    :cond_2
    sget v12, Lorg/chromium/ui/R$string;->date_time_picker_dialog_title:I

    goto :goto_0

    .line 165
    :cond_3
    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeMonth:I

    if-ne p1, v0, :cond_4

    .line 166
    sget v12, Lorg/chromium/ui/R$string;->month_picker_dialog_title:I

    goto :goto_0

    .line 167
    :cond_4
    sget v0, Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeWeek:I

    if-ne p1, v0, :cond_0

    .line 168
    sget v12, Lorg/chromium/ui/R$string;->week_picker_dialog_title:I

    goto :goto_0
.end method
