.class public Lorg/chromium/ui/picker/DateDialogNormalizer;
.super Ljava/lang/Object;
.source "DateDialogNormalizer.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static normalize(Landroid/widget/DatePicker;Landroid/widget/DatePicker$OnDateChangedListener;IIIIIJJ)V
    .locals 11
    .param p0, "picker"    # Landroid/widget/DatePicker;
    .param p1, "listener"    # Landroid/widget/DatePicker$OnDateChangedListener;
    .param p2, "year"    # I
    .param p3, "month"    # I
    .param p4, "day"    # I
    .param p5, "hour"    # I
    .param p6, "minute"    # I
    .param p7, "minMillis"    # J
    .param p9, "maxMillis"    # J

    .prologue
    .line 61
    const-string v5, "GMT"

    invoke-static {v5}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v4

    .line 62
    .local v4, "calendar":Ljava/util/Calendar;
    invoke-virtual {v4}, Ljava/util/Calendar;->clear()V

    .line 63
    const/4 v10, 0x0

    move v5, p2

    move v6, p3

    move v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    invoke-virtual/range {v4 .. v10}, Ljava/util/Calendar;->set(IIIIII)V

    .line 64
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    cmp-long v5, v6, p7

    if-gez v5, :cond_1

    .line 65
    invoke-virtual {v4}, Ljava/util/Calendar;->clear()V

    .line 66
    move-wide/from16 v0, p7

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 71
    :cond_0
    :goto_0
    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    const/4 v6, 0x2

    invoke-virtual {v4, v6}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/4 v7, 0x5

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    invoke-virtual {p0, v5, v6, v7, p1}, Landroid/widget/DatePicker;->init(IIILandroid/widget/DatePicker$OnDateChangedListener;)V

    .line 75
    move-wide/from16 v0, p7

    move-wide/from16 v2, p9

    invoke-static {p0, v0, v1, v2, v3}, Lorg/chromium/ui/picker/DateDialogNormalizer;->setLimits(Landroid/widget/DatePicker;JJ)V

    .line 76
    return-void

    .line 67
    :cond_1
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    cmp-long v5, v6, p9

    if-lez v5, :cond_0

    .line 68
    invoke-virtual {v4}, Ljava/util/Calendar;->clear()V

    .line 69
    move-wide/from16 v0, p9

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    goto :goto_0
.end method

.method private static setLimits(Landroid/widget/DatePicker;JJ)V
    .locals 11
    .param p0, "picker"    # Landroid/widget/DatePicker;
    .param p1, "minMillis"    # J
    .param p3, "maxMillis"    # J

    .prologue
    const/4 v10, 0x5

    const/4 v9, 0x2

    const/4 v8, 0x1

    .line 22
    cmp-long v5, p3, p1

    if-gtz v5, :cond_0

    .line 42
    :goto_0
    return-void

    .line 25
    :cond_0
    invoke-static {p1, p2}, Lorg/chromium/ui/picker/DateDialogNormalizer;->trimToDate(J)Ljava/util/Calendar;

    move-result-object v4

    .line 26
    .local v4, "minCal":Ljava/util/Calendar;
    invoke-static {p3, p4}, Lorg/chromium/ui/picker/DateDialogNormalizer;->trimToDate(J)Ljava/util/Calendar;

    move-result-object v3

    .line 27
    .local v3, "maxCal":Ljava/util/Calendar;
    invoke-virtual {p0}, Landroid/widget/DatePicker;->getYear()I

    move-result v2

    .line 28
    .local v2, "currentYear":I
    invoke-virtual {p0}, Landroid/widget/DatePicker;->getMonth()I

    move-result v1

    .line 29
    .local v1, "currentMonth":I
    invoke-virtual {p0}, Landroid/widget/DatePicker;->getDayOfMonth()I

    move-result v0

    .line 30
    .local v0, "currentDayOfMonth":I
    invoke-virtual {v3, v8}, Ljava/util/Calendar;->get(I)I

    move-result v5

    invoke-virtual {v3, v9}, Ljava/util/Calendar;->get(I)I

    move-result v6

    invoke-virtual {v3, v10}, Ljava/util/Calendar;->get(I)I

    move-result v7

    invoke-virtual {p0, v5, v6, v7}, Landroid/widget/DatePicker;->updateDate(III)V

    .line 33
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    invoke-virtual {p0, v6, v7}, Landroid/widget/DatePicker;->setMinDate(J)V

    .line 34
    invoke-virtual {v4, v8}, Ljava/util/Calendar;->get(I)I

    move-result v5

    invoke-virtual {v4, v9}, Ljava/util/Calendar;->get(I)I

    move-result v6

    invoke-virtual {v4, v10}, Ljava/util/Calendar;->get(I)I

    move-result v7

    invoke-virtual {p0, v5, v6, v7}, Landroid/widget/DatePicker;->updateDate(III)V

    .line 37
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    invoke-virtual {p0, v6, v7}, Landroid/widget/DatePicker;->setMaxDate(J)V

    .line 41
    invoke-virtual {p0, v2, v1, v0}, Landroid/widget/DatePicker;->updateDate(III)V

    goto :goto_0
.end method

.method private static trimToDate(J)Ljava/util/Calendar;
    .locals 8
    .param p0, "time"    # J

    .prologue
    const/4 v4, 0x0

    .line 45
    const-string v1, "GMT"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v7

    .line 46
    .local v7, "cal":Ljava/util/Calendar;
    invoke-virtual {v7}, Ljava/util/Calendar;->clear()V

    .line 47
    invoke-virtual {v7, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 48
    const-string v1, "GMT"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    .line 49
    .local v0, "result":Ljava/util/Calendar;
    invoke-virtual {v0}, Ljava/util/Calendar;->clear()V

    .line 50
    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v7, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x5

    invoke-virtual {v7, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    move v5, v4

    move v6, v4

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 52
    return-object v0
.end method
