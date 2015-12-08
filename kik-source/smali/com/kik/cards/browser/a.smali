.class final Lcom/kik/cards/browser/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/kik/cards/browser/CaptchaWindowFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/browser/CaptchaWindowFragment;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lcom/kik/cards/browser/a;->a:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/kik/cards/browser/a;->a:Lcom/kik/cards/browser/CaptchaWindowFragment;

    iget-object v0, v0, Lcom/kik/cards/browser/CaptchaWindowFragment;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/kik/cards/browser/a;->a:Lcom/kik/cards/browser/CaptchaWindowFragment;

    iget-object v0, v0, Lcom/kik/cards/browser/CaptchaWindowFragment;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismissAllowingStateLoss()V

    .line 105
    iget-object v0, p0, Lcom/kik/cards/browser/a;->a:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-virtual {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->J()V

    .line 107
    :cond_0
    return-void
.end method
