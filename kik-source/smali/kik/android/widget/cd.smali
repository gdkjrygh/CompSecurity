.class public final Lkik/android/widget/cd;
.super Landroid/app/DatePickerDialog;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V
    .locals 1

    .prologue
    .line 15
    invoke-direct/range {p0 .. p5}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/cd;->a:Ljava/lang/String;

    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lkik/android/widget/cd;->a:Ljava/lang/String;

    .line 20
    invoke-virtual {p0, p1}, Lkik/android/widget/cd;->setTitle(Ljava/lang/CharSequence;)V

    .line 21
    return-void
.end method

.method public final onDateChanged(Landroid/widget/DatePicker;III)V
    .locals 1

    .prologue
    .line 25
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/DatePickerDialog;->onDateChanged(Landroid/widget/DatePicker;III)V

    .line 26
    iget-object v0, p0, Lkik/android/widget/cd;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Lkik/android/widget/cd;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkik/android/widget/cd;->setTitle(Ljava/lang/CharSequence;)V

    .line 29
    :cond_0
    return-void
.end method
