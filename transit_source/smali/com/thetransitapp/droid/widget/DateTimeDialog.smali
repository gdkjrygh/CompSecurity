.class public Lcom/thetransitapp/droid/widget/DateTimeDialog;
.super Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockDialogFragment;
.source "DateTimeDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/app/DatePickerDialog$OnDateSetListener;
.implements Landroid/app/TimePickerDialog$OnTimeSetListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/widget/DateTimeDialog$OnDateTimePickedListener;
    }
.end annotation


# instance fields
.field private arriveBy:Z

.field private calendar:Ljava/util/Calendar;

.field private cancelButton:Landroid/widget/Button;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050043
    .end annotation
.end field

.field private datePicker:Landroid/widget/Button;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050041
    .end annotation
.end field

.field private dateTimePickedListener:Lcom/thetransitapp/droid/widget/DateTimeDialog$OnDateTimePickedListener;

.field private okButton:Landroid/widget/Button;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050044
    .end annotation
.end field

.field private timePicker:Landroid/widget/Button;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050042
    .end annotation
.end field

.field private typePicker:Landroid/widget/Spinner;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050040
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockDialogFragment;-><init>()V

    .line 52
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    .line 53
    return-void
.end method

.method private updateButtonText()V
    .locals 4

    .prologue
    .line 123
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Landroid/text/format/DateFormat;->getLongDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v1

    .line 124
    .local v1, "formater":Ljava/text/DateFormat;
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 126
    .local v0, "date":Ljava/lang/String;
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v1

    .line 127
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    .line 129
    .local v2, "time":Ljava/lang/String;
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->datePicker:Landroid/widget/Button;

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 130
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->timePicker:Landroid/widget/Button;

    invoke-virtual {v3, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 131
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 12
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v0, 0x1

    .line 83
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->datePicker:Landroid/widget/Button;

    if-ne p1, v1, :cond_0

    .line 84
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 85
    .local v3, "year":I
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 86
    .local v4, "month":I
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 88
    .local v5, "day":I
    new-instance v0, Landroid/app/DatePickerDialog;

    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->show()V

    .line 103
    .end local v3    # "year":I
    .end local v4    # "month":I
    .end local v5    # "day":I
    :goto_0
    return-void

    .line 89
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->timePicker:Landroid/widget/Button;

    if-ne p1, v1, :cond_1

    .line 90
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 91
    .local v9, "hour":I
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v10

    .line 93
    .local v10, "minute":I
    new-instance v6, Landroid/app/TimePickerDialog;

    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    .line 94
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v11

    move-object v8, p0

    .line 93
    invoke-direct/range {v6 .. v11}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    .line 94
    invoke-virtual {v6}, Landroid/app/TimePickerDialog;->show()V

    goto :goto_0

    .line 96
    .end local v9    # "hour":I
    .end local v10    # "minute":I
    :cond_1
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->okButton:Landroid/widget/Button;

    if-ne p1, v1, :cond_2

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->dateTimePickedListener:Lcom/thetransitapp/droid/widget/DateTimeDialog$OnDateTimePickedListener;

    if-eqz v1, :cond_2

    .line 97
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->dateTimePickedListener:Lcom/thetransitapp/droid/widget/DateTimeDialog$OnDateTimePickedListener;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    .line 98
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->typePicker:Landroid/widget/Spinner;

    invoke-virtual {v6}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v6

    if-ne v6, v0, :cond_3

    .line 97
    :goto_1
    invoke-interface {v1, v2, v0}, Lcom/thetransitapp/droid/widget/DateTimeDialog$OnDateTimePickedListener;->onDateTimePicked(Ljava/util/Date;Z)V

    .line 101
    :cond_2
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockDialogFragment;->dismiss()V

    goto :goto_0

    .line 98
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 63
    const v0, 0x7f030019

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onDateSet(Landroid/widget/DatePicker;III)V
    .locals 2
    .param p1, "view"    # Landroid/widget/DatePicker;
    .param p2, "year"    # I
    .param p3, "monthOfYear"    # I
    .param p4, "dayOfMonth"    # I

    .prologue
    .line 115
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p2}, Ljava/util/Calendar;->set(II)V

    .line 116
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p3}, Ljava/util/Calendar;->set(II)V

    .line 117
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, p4}, Ljava/util/Calendar;->set(II)V

    .line 119
    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/DateTimeDialog;->updateButtonText()V

    .line 120
    return-void
.end method

.method public onTimeSet(Landroid/widget/TimePicker;II)V
    .locals 2
    .param p1, "view"    # Landroid/widget/TimePicker;
    .param p2, "hourOfDay"    # I
    .param p3, "minute"    # I

    .prologue
    .line 107
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    const/16 v1, 0xb

    invoke-virtual {v0, v1, p2}, Ljava/util/Calendar;->set(II)V

    .line 108
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    const/16 v1, 0xc

    invoke-virtual {v0, v1, p3}, Ljava/util/Calendar;->set(II)V

    .line 110
    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/DateTimeDialog;->updateButtonText()V

    .line 111
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 68
    invoke-super {p0, p1, p2}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockDialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 69
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    const v1, 0x7f0a0091

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setTitle(I)V

    .line 71
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->datePicker:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->timePicker:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->cancelButton:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->okButton:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->typePicker:Landroid/widget/Spinner;

    iget-boolean v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->arriveBy:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setSelection(I)V

    .line 78
    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/DateTimeDialog;->updateButtonText()V

    .line 79
    return-void

    .line 76
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setArriveBy(Z)V
    .locals 0
    .param p1, "arriveBy"    # Z

    .prologue
    .line 46
    iput-boolean p1, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->arriveBy:Z

    return-void
.end method

.method public setDate(Ljava/util/Date;)V
    .locals 1
    .param p1, "date"    # Ljava/util/Date;

    .prologue
    .line 56
    if-eqz p1, :cond_0

    .line 57
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->calendar:Ljava/util/Calendar;

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 59
    :cond_0
    return-void
.end method

.method public setDateTimePickedListener(Lcom/thetransitapp/droid/widget/DateTimeDialog$OnDateTimePickedListener;)V
    .locals 0
    .param p1, "dateTimePickedListener"    # Lcom/thetransitapp/droid/widget/DateTimeDialog$OnDateTimePickedListener;

    .prologue
    .line 43
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/DateTimeDialog;->dateTimePickedListener:Lcom/thetransitapp/droid/widget/DateTimeDialog$OnDateTimePickedListener;

    return-void
.end method
