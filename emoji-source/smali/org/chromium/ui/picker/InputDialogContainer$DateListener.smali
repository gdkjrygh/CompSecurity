.class Lorg/chromium/ui/picker/InputDialogContainer$DateListener;
.super Ljava/lang/Object;
.source "InputDialogContainer.java"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/ui/picker/InputDialogContainer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DateListener"
.end annotation


# instance fields
.field private final mDialogType:I

.field final synthetic this$0:Lorg/chromium/ui/picker/InputDialogContainer;


# direct methods
.method constructor <init>(Lorg/chromium/ui/picker/InputDialogContainer;I)V
    .locals 0
    .param p2, "dialogType"    # I

    .prologue
    .line 294
    iput-object p1, p0, Lorg/chromium/ui/picker/InputDialogContainer$DateListener;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 295
    iput p2, p0, Lorg/chromium/ui/picker/InputDialogContainer$DateListener;->mDialogType:I

    .line 296
    return-void
.end method


# virtual methods
.method public onDateSet(Landroid/widget/DatePicker;III)V
    .locals 10
    .param p1, "view"    # Landroid/widget/DatePicker;
    .param p2, "year"    # I
    .param p3, "month"    # I
    .param p4, "monthDay"    # I

    .prologue
    const/4 v5, 0x0

    .line 300
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$DateListener;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    iget v1, p0, Lorg/chromium/ui/picker/InputDialogContainer$DateListener;->mDialogType:I

    move v2, p2

    move v3, p3

    move v4, p4

    move v6, v5

    move v7, v5

    move v8, v5

    move v9, v5

    invoke-virtual/range {v0 .. v9}, Lorg/chromium/ui/picker/InputDialogContainer;->setFieldDateTimeValue(IIIIIIIII)V

    .line 301
    return-void
.end method
