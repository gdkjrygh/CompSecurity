.class Lorg/chromium/ui/picker/InputDialogContainer$FullTimeListener;
.super Ljava/lang/Object;
.source "InputDialogContainer.java"

# interfaces
.implements Lorg/chromium/ui/picker/MultiFieldTimePickerDialog$OnMultiFieldTimeSetListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/ui/picker/InputDialogContainer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FullTimeListener"
.end annotation


# instance fields
.field private final mDialogType:I

.field final synthetic this$0:Lorg/chromium/ui/picker/InputDialogContainer;


# direct methods
.method constructor <init>(Lorg/chromium/ui/picker/InputDialogContainer;I)V
    .locals 0
    .param p2, "dialogType"    # I

    .prologue
    .line 306
    iput-object p1, p0, Lorg/chromium/ui/picker/InputDialogContainer$FullTimeListener;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 307
    iput p2, p0, Lorg/chromium/ui/picker/InputDialogContainer$FullTimeListener;->mDialogType:I

    .line 308
    return-void
.end method


# virtual methods
.method public onTimeSet(IIII)V
    .locals 10
    .param p1, "hourOfDay"    # I
    .param p2, "minute"    # I
    .param p3, "second"    # I
    .param p4, "milli"    # I

    .prologue
    const/4 v2, 0x0

    .line 312
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$FullTimeListener;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    iget v1, p0, Lorg/chromium/ui/picker/InputDialogContainer$FullTimeListener;->mDialogType:I

    move v3, v2

    move v4, v2

    move v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    move v9, v2

    invoke-virtual/range {v0 .. v9}, Lorg/chromium/ui/picker/InputDialogContainer;->setFieldDateTimeValue(IIIIIIIII)V

    .line 313
    return-void
.end method
