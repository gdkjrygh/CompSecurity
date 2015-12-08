.class Lorg/chromium/ui/picker/InputDialogContainer$DateTimeListener;
.super Ljava/lang/Object;
.source "InputDialogContainer.java"

# interfaces
.implements Lorg/chromium/ui/picker/DateTimePickerDialog$OnDateTimeSetListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/ui/picker/InputDialogContainer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DateTimeListener"
.end annotation


# instance fields
.field private final mDialogType:I

.field private final mLocal:Z

.field final synthetic this$0:Lorg/chromium/ui/picker/InputDialogContainer;


# direct methods
.method public constructor <init>(Lorg/chromium/ui/picker/InputDialogContainer;I)V
    .locals 1
    .param p2, "dialogType"    # I

    .prologue
    .line 320
    iput-object p1, p0, Lorg/chromium/ui/picker/InputDialogContainer$DateTimeListener;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 321
    # getter for: Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeDateTimeLocal:I
    invoke-static {}, Lorg/chromium/ui/picker/InputDialogContainer;->access$300()I

    move-result v0

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$DateTimeListener;->mLocal:Z

    .line 322
    iput p2, p0, Lorg/chromium/ui/picker/InputDialogContainer$DateTimeListener;->mDialogType:I

    .line 323
    return-void

    .line 321
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public onDateTimeSet(Landroid/widget/DatePicker;Landroid/widget/TimePicker;IIIII)V
    .locals 10
    .param p1, "dateView"    # Landroid/widget/DatePicker;
    .param p2, "timeView"    # Landroid/widget/TimePicker;
    .param p3, "year"    # I
    .param p4, "month"    # I
    .param p5, "monthDay"    # I
    .param p6, "hourOfDay"    # I
    .param p7, "minute"    # I

    .prologue
    .line 329
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$DateTimeListener;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    iget v1, p0, Lorg/chromium/ui/picker/InputDialogContainer$DateTimeListener;->mDialogType:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v2, p3

    move v3, p4

    move v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v9}, Lorg/chromium/ui/picker/InputDialogContainer;->setFieldDateTimeValue(IIIIIIIII)V

    .line 330
    return-void
.end method
