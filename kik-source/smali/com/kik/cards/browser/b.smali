.class final Lcom/kik/cards/browser/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/cards/browser/CaptchaWindowFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/browser/CaptchaWindowFragment;)V
    .locals 0

    .prologue
    .line 310
    iput-object p1, p0, Lcom/kik/cards/browser/b;->a:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 315
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 316
    const-string v1, "network"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 317
    iget-object v1, p0, Lcom/kik/cards/browser/b;->a:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-virtual {v1, v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->a(Landroid/os/Bundle;)V

    .line 318
    iget-object v0, p0, Lcom/kik/cards/browser/b;->a:Lcom/kik/cards/browser/CaptchaWindowFragment;

    iget-object v0, v0, Lcom/kik/cards/browser/CaptchaWindowFragment;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismissAllowingStateLoss()V

    .line 319
    iget-object v0, p0, Lcom/kik/cards/browser/b;->a:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-virtual {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->J()V

    .line 320
    return-void
.end method
