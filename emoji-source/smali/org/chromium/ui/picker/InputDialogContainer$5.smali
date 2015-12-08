.class Lorg/chromium/ui/picker/InputDialogContainer$5;
.super Ljava/lang/Object;
.source "InputDialogContainer.java"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/ui/picker/InputDialogContainer;->showPickerDialog(IIIIIIIIIDDD)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/ui/picker/InputDialogContainer;


# direct methods
.method constructor <init>(Lorg/chromium/ui/picker/InputDialogContainer;)V
    .locals 0

    .prologue
    .line 269
    iput-object p1, p0, Lorg/chromium/ui/picker/InputDialogContainer$5;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 272
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$5;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    # getter for: Lorg/chromium/ui/picker/InputDialogContainer;->mDialogAlreadyDismissed:Z
    invoke-static {v0}, Lorg/chromium/ui/picker/InputDialogContainer;->access$100(Lorg/chromium/ui/picker/InputDialogContainer;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 273
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$5;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    const/4 v1, 0x1

    # setter for: Lorg/chromium/ui/picker/InputDialogContainer;->mDialogAlreadyDismissed:Z
    invoke-static {v0, v1}, Lorg/chromium/ui/picker/InputDialogContainer;->access$102(Lorg/chromium/ui/picker/InputDialogContainer;Z)Z

    .line 274
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$5;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    # getter for: Lorg/chromium/ui/picker/InputDialogContainer;->mInputActionDelegate:Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;
    invoke-static {v0}, Lorg/chromium/ui/picker/InputDialogContainer;->access$000(Lorg/chromium/ui/picker/InputDialogContainer;)Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;->cancelDateTimeDialog()V

    .line 276
    :cond_0
    return-void
.end method
