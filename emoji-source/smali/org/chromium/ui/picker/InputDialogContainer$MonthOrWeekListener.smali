.class Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;
.super Ljava/lang/Object;
.source "InputDialogContainer.java"

# interfaces
.implements Lorg/chromium/ui/picker/TwoFieldDatePickerDialog$OnValueSetListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/ui/picker/InputDialogContainer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MonthOrWeekListener"
.end annotation


# instance fields
.field private final mDialogType:I

.field final synthetic this$0:Lorg/chromium/ui/picker/InputDialogContainer;


# direct methods
.method constructor <init>(Lorg/chromium/ui/picker/InputDialogContainer;I)V
    .locals 0
    .param p2, "dialogType"    # I

    .prologue
    .line 336
    iput-object p1, p0, Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 337
    iput p2, p0, Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;->mDialogType:I

    .line 338
    return-void
.end method


# virtual methods
.method public onValueSet(II)V
    .locals 11
    .param p1, "year"    # I
    .param p2, "positionInYear"    # I

    .prologue
    const/4 v4, 0x0

    .line 342
    iget v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;->mDialogType:I

    # getter for: Lorg/chromium/ui/picker/InputDialogContainer;->sTextInputTypeMonth:I
    invoke-static {}, Lorg/chromium/ui/picker/InputDialogContainer;->access$400()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 343
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    iget v1, p0, Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;->mDialogType:I

    move v2, p1

    move v3, p2

    move v5, v4

    move v6, v4

    move v7, v4

    move v8, v4

    move v9, v4

    invoke-virtual/range {v0 .. v9}, Lorg/chromium/ui/picker/InputDialogContainer;->setFieldDateTimeValue(IIIIIIIII)V

    .line 347
    :goto_0
    return-void

    .line 345
    :cond_0
    iget-object v1, p0, Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    iget v2, p0, Lorg/chromium/ui/picker/InputDialogContainer$MonthOrWeekListener;->mDialogType:I

    move v3, p1

    move v5, v4

    move v6, v4

    move v7, v4

    move v8, v4

    move v9, v4

    move v10, p2

    invoke-virtual/range {v1 .. v10}, Lorg/chromium/ui/picker/InputDialogContainer;->setFieldDateTimeValue(IIIIIIIII)V

    goto :goto_0
.end method
