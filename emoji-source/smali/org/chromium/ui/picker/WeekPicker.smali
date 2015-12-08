.class public Lorg/chromium/ui/picker/WeekPicker;
.super Lorg/chromium/ui/picker/TwoFieldDatePicker;
.source "WeekPicker.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;DD)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "minValue"    # D
    .param p4, "maxValue"    # D

    .prologue
    .line 18
    invoke-direct/range {p0 .. p5}, Lorg/chromium/ui/picker/TwoFieldDatePicker;-><init>(Landroid/content/Context;DD)V

    .line 20
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getPositionInYearSpinner()Landroid/widget/NumberPicker;

    move-result-object v1

    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lorg/chromium/ui/R$string;->accessibility_date_picker_week:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/NumberPicker;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 24
    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    .line 25
    .local v0, "cal":Ljava/util/Calendar;
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 26
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setMinimalDaysInFirstWeek(I)V

    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 28
    invoke-static {v0}, Lorg/chromium/ui/picker/WeekPicker;->getISOWeekYearForDate(Ljava/util/Calendar;)I

    move-result v1

    invoke-static {v0}, Lorg/chromium/ui/picker/WeekPicker;->getWeekForDate(Ljava/util/Calendar;)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v2, v3}, Lorg/chromium/ui/picker/WeekPicker;->init(IILorg/chromium/ui/picker/TwoFieldDatePicker$OnMonthOrWeekChangedListener;)V

    .line 29
    return-void
.end method

.method public static createDateFromValue(D)Ljava/util/Calendar;
    .locals 4
    .param p0, "value"    # D

    .prologue
    .line 49
    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    .line 50
    .local v0, "date":Ljava/util/Calendar;
    invoke-virtual {v0}, Ljava/util/Calendar;->clear()V

    .line 51
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 52
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setMinimalDaysInFirstWeek(I)V

    .line 53
    double-to-long v2, p0

    invoke-virtual {v0, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 54
    return-object v0
.end method

.method public static createDateFromWeek(II)Ljava/util/Calendar;
    .locals 3
    .param p0, "year"    # I
    .param p1, "week"    # I

    .prologue
    const/4 v2, 0x2

    .line 35
    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    .line 36
    .local v0, "date":Ljava/util/Calendar;
    invoke-virtual {v0}, Ljava/util/Calendar;->clear()V

    .line 37
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 38
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setMinimalDaysInFirstWeek(I)V

    .line 39
    const/4 v1, 0x7

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 40
    const/4 v1, 0x1

    invoke-virtual {v0, v1, p0}, Ljava/util/Calendar;->set(II)V

    .line 41
    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->set(II)V

    .line 42
    return-object v0
.end method

.method public static getISOWeekYearForDate(Ljava/util/Calendar;)I
    .locals 5
    .param p0, "date"    # Ljava/util/Calendar;

    .prologue
    const/4 v4, 0x1

    .line 63
    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 64
    .local v2, "year":I
    const/4 v3, 0x2

    invoke-virtual {p0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 65
    .local v0, "month":I
    const/4 v3, 0x3

    invoke-virtual {p0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 66
    .local v1, "week":I
    if-nez v0, :cond_1

    const/16 v3, 0x33

    if-le v1, v3, :cond_1

    .line 67
    add-int/lit8 v2, v2, -0x1

    .line 71
    :cond_0
    :goto_0
    return v2

    .line 68
    :cond_1
    const/16 v3, 0xb

    if-ne v0, v3, :cond_0

    if-ne v1, v4, :cond_0

    .line 69
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method private getNumberOfWeeks(I)I
    .locals 2
    .param p1, "year"    # I

    .prologue
    .line 92
    const/16 v1, 0x14

    invoke-static {p1, v1}, Lorg/chromium/ui/picker/WeekPicker;->createDateFromWeek(II)Ljava/util/Calendar;

    move-result-object v0

    .line 93
    .local v0, "date":Ljava/util/Calendar;
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v1

    return v1
.end method

.method public static getWeekForDate(Ljava/util/Calendar;)I
    .locals 1
    .param p0, "date"    # Ljava/util/Calendar;

    .prologue
    .line 75
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    return v0
.end method


# virtual methods
.method protected getDateForValue(D)Ljava/util/Calendar;
    .locals 1
    .param p1, "value"    # D

    .prologue
    .line 59
    invoke-static {p1, p2}, Lorg/chromium/ui/picker/WeekPicker;->createDateFromValue(D)Ljava/util/Calendar;

    move-result-object v0

    return-object v0
.end method

.method protected getMaxPositionInYear(I)I
    .locals 1
    .param p1, "year"    # I

    .prologue
    .line 128
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getMaxDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/ui/picker/WeekPicker;->getISOWeekYearForDate(Ljava/util/Calendar;)I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 129
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getMaxDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/ui/picker/WeekPicker;->getWeekForDate(Ljava/util/Calendar;)I

    move-result v0

    .line 131
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, p1}, Lorg/chromium/ui/picker/WeekPicker;->getNumberOfWeeks(I)I

    move-result v0

    goto :goto_0
.end method

.method protected getMaxYear()I
    .locals 1

    .prologue
    .line 118
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getMaxDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/ui/picker/WeekPicker;->getISOWeekYearForDate(Ljava/util/Calendar;)I

    move-result v0

    return v0
.end method

.method protected getMinPositionInYear(I)I
    .locals 1
    .param p1, "year"    # I

    .prologue
    .line 136
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getMinDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/ui/picker/WeekPicker;->getISOWeekYearForDate(Ljava/util/Calendar;)I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 137
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getMinDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/ui/picker/WeekPicker;->getWeekForDate(Ljava/util/Calendar;)I

    move-result v0

    .line 139
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected getMinYear()I
    .locals 1

    .prologue
    .line 123
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getMinDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/ui/picker/WeekPicker;->getISOWeekYearForDate(Ljava/util/Calendar;)I

    move-result v0

    return v0
.end method

.method public getPositionInYear()I
    .locals 1

    .prologue
    .line 113
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getWeek()I

    move-result v0

    return v0
.end method

.method public getWeek()I
    .locals 1

    .prologue
    .line 108
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getCurrentDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/ui/picker/WeekPicker;->getWeekForDate(Ljava/util/Calendar;)I

    move-result v0

    return v0
.end method

.method public getYear()I
    .locals 1

    .prologue
    .line 101
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getCurrentDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/ui/picker/WeekPicker;->getISOWeekYearForDate(Ljava/util/Calendar;)I

    move-result v0

    return v0
.end method

.method protected setCurrentDate(II)V
    .locals 2
    .param p1, "year"    # I
    .param p2, "week"    # I

    .prologue
    .line 80
    invoke-static {p1, p2}, Lorg/chromium/ui/picker/WeekPicker;->createDateFromWeek(II)Ljava/util/Calendar;

    move-result-object v0

    .line 81
    .local v0, "date":Ljava/util/Calendar;
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getMinDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 82
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getMinDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/chromium/ui/picker/WeekPicker;->setCurrentDate(Ljava/util/Calendar;)V

    .line 88
    :goto_0
    return-void

    .line 83
    :cond_0
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getMaxDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 84
    invoke-virtual {p0}, Lorg/chromium/ui/picker/WeekPicker;->getMaxDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/chromium/ui/picker/WeekPicker;->setCurrentDate(Ljava/util/Calendar;)V

    goto :goto_0

    .line 86
    :cond_1
    invoke-virtual {p0, v0}, Lorg/chromium/ui/picker/WeekPicker;->setCurrentDate(Ljava/util/Calendar;)V

    goto :goto_0
.end method
