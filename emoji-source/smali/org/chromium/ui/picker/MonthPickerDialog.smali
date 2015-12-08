.class public Lorg/chromium/ui/picker/MonthPickerDialog;
.super Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;
.source "MonthPickerDialog.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;IIDD)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "callBack"    # Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;
    .param p3, "year"    # I
    .param p4, "monthOfYear"    # I
    .param p5, "minMonth"    # D
    .param p7, "maxMonth"    # D

    .prologue
    .line 21
    invoke-direct/range {p0 .. p8}, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;-><init>(Landroid/content/Context;Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;IIDD)V

    .line 22
    sget v0, Lorg/chromium/ui/R$string;->month_picker_dialog_title:I

    invoke-virtual {p0, v0}, Lorg/chromium/ui/picker/MonthPickerDialog;->setTitle(I)V

    .line 23
    return-void
.end method


# virtual methods
.method protected createPicker(Landroid/content/Context;DD)Lorg/chromium/ui/picker/TwoFieldDatePicker;
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "minValue"    # D
    .param p4, "maxValue"    # D

    .prologue
    .line 27
    new-instance v0, Lorg/chromium/ui/picker/MonthPicker;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lorg/chromium/ui/picker/MonthPicker;-><init>(Landroid/content/Context;DD)V

    return-object v0
.end method

.method public getMonthPicker()Lorg/chromium/ui/picker/MonthPicker;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lorg/chromium/ui/picker/MonthPickerDialog;->mPicker:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    check-cast v0, Lorg/chromium/ui/picker/MonthPicker;

    return-object v0
.end method
