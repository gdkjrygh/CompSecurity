.class public abstract Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;
.super Landroid/app/AlertDialog;
.source "TwoFieldDatePickerDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Lorg/chromium/ui/picker/TwoFieldDatePicker$OnMonthOrWeekChangedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;
    }
.end annotation


# static fields
.field private static final POSITION_IN_YEAR:Ljava/lang/String; = "position_in_year"

.field private static final YEAR:Ljava/lang/String; = "year"


# instance fields
.field protected final mCallBack:Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;

.field protected final mPicker:Lorg/chromium/ui/picker/TwoFieldDatePicker;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;IIDD)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "theme"    # I
    .param p3, "callBack"    # Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;
    .param p4, "year"    # I
    .param p5, "positionInYear"    # I
    .param p6, "minValue"    # D
    .param p8, "maxValue"    # D

    .prologue
    .line 65
    invoke-direct {p0, p1, p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    .line 67
    iput-object p3, p0, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->mCallBack:Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;

    .line 69
    const/4 v0, -0x1

    sget v1, Lorg/chromium/ui/R$string;->date_picker_dialog_set:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p0}, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 71
    const/4 v1, -0x2

    const/high16 v0, 0x1040000

    invoke-virtual {p1, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v0, 0x0

    check-cast v0, Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p0, v1, v2, v0}, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 73
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->setIcon(I)V

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p6

    move-wide v4, p8

    .line 75
    invoke-virtual/range {v0 .. v5}, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->createPicker(Landroid/content/Context;DD)Lorg/chromium/ui/picker/TwoFieldDatePicker;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->mPicker:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    .line 76
    iget-object v0, p0, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->mPicker:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {p0, v0}, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->setView(Landroid/view/View;)V

    .line 77
    iget-object v0, p0, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->mPicker:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v0, p4, p5, p0}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->init(IILorg/chromium/ui/picker/TwoFieldDatePicker$OnMonthOrWeekChangedListener;)V

    .line 78
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;IIDD)V
    .locals 11
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "callBack"    # Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;
    .param p3, "year"    # I
    .param p4, "positionInYear"    # I
    .param p5, "minValue"    # D
    .param p7, "maxValue"    # D

    .prologue
    .line 48
    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    invoke-direct/range {v0 .. v9}, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;-><init>(Landroid/content/Context;ILorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;IIDD)V

    .line 49
    return-void
.end method


# virtual methods
.method protected createPicker(Landroid/content/Context;DD)Lorg/chromium/ui/picker/TwoFieldDatePicker;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "minValue"    # D
    .param p4, "maxValue"    # D

    .prologue
    .line 81
    const/4 v0, 0x0

    return-object v0
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 86
    invoke-virtual {p0}, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->tryNotifyDateSet()V

    .line 87
    return-void
.end method

.method public onMonthOrWeekChanged(Lorg/chromium/ui/picker/TwoFieldDatePicker;II)V
    .locals 2
    .param p1, "view"    # Lorg/chromium/ui/picker/TwoFieldDatePicker;
    .param p2, "year"    # I
    .param p3, "positionInYear"    # I

    .prologue
    .line 101
    iget-object v0, p0, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->mPicker:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p3, v1}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->init(IILorg/chromium/ui/picker/TwoFieldDatePicker$OnMonthOrWeekChangedListener;)V

    .line 102
    return-void
.end method

.method protected tryNotifyDateSet()V
    .locals 3

    .prologue
    .line 93
    iget-object v0, p0, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->mCallBack:Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->mPicker:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v0}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->clearFocus()V

    .line 95
    iget-object v0, p0, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->mCallBack:Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;

    iget-object v1, p0, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->mPicker:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v1}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->getYear()I

    move-result v1

    iget-object v2, p0, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->mPicker:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v2}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->getPositionInYear()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;->onValueSet(II)V

    .line 97
    :cond_0
    return-void
.end method

.method public updateDate(II)V
    .locals 1
    .param p1, "year"    # I
    .param p2, "weekOfYear"    # I

    .prologue
    .line 111
    iget-object v0, p0, Lorg/chromium/ui/picker/TwoFieldDatePickerDialog;->mPicker:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v0, p1, p2}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->updateDate(II)V

    .line 112
    return-void
.end method
