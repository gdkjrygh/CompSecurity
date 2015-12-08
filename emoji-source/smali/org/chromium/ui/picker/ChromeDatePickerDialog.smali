.class Lorg/chromium/ui/picker/ChromeDatePickerDialog;
.super Landroid/app/DatePickerDialog;
.source "ChromeDatePickerDialog.java"


# instance fields
.field private final mCallBack:Landroid/app/DatePickerDialog$OnDateSetListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "callBack"    # Landroid/app/DatePickerDialog$OnDateSetListener;
    .param p3, "year"    # I
    .param p4, "monthOfYear"    # I
    .param p5, "dayOfMonth"    # I

    .prologue
    .line 25
    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;ILandroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 26
    iput-object p2, p0, Lorg/chromium/ui/picker/ChromeDatePickerDialog;->mCallBack:Landroid/app/DatePickerDialog$OnDateSetListener;

    .line 27
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 35
    const/4 v1, -0x1

    if-ne p2, v1, :cond_0

    iget-object v1, p0, Lorg/chromium/ui/picker/ChromeDatePickerDialog;->mCallBack:Landroid/app/DatePickerDialog$OnDateSetListener;

    if-eqz v1, :cond_0

    .line 36
    invoke-virtual {p0}, Lorg/chromium/ui/picker/ChromeDatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object v0

    .line 37
    .local v0, "datePicker":Landroid/widget/DatePicker;
    invoke-virtual {v0}, Landroid/widget/DatePicker;->clearFocus()V

    .line 38
    iget-object v1, p0, Lorg/chromium/ui/picker/ChromeDatePickerDialog;->mCallBack:Landroid/app/DatePickerDialog$OnDateSetListener;

    invoke-virtual {v0}, Landroid/widget/DatePicker;->getYear()I

    move-result v2

    invoke-virtual {v0}, Landroid/widget/DatePicker;->getMonth()I

    move-result v3

    invoke-virtual {v0}, Landroid/widget/DatePicker;->getDayOfMonth()I

    move-result v4

    invoke-interface {v1, v0, v2, v3, v4}, Landroid/app/DatePickerDialog$OnDateSetListener;->onDateSet(Landroid/widget/DatePicker;III)V

    .line 41
    .end local v0    # "datePicker":Landroid/widget/DatePicker;
    :cond_0
    return-void
.end method
