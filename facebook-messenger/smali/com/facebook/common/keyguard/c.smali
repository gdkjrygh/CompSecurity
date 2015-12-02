.class Lcom/facebook/common/keyguard/c;
.super Ljava/lang/Object;
.source "KeyguardPendingIntentActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;


# direct methods
.method constructor <init>(Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lcom/facebook/common/keyguard/c;->a:Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 157
    iget-object v0, p0, Lcom/facebook/common/keyguard/c;->a:Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;

    invoke-static {v0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->c(Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;)V

    .line 162
    iget-object v0, p0, Lcom/facebook/common/keyguard/c;->a:Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;

    invoke-static {v0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->d(Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/keyguard/d;

    invoke-direct {v1, p0}, Lcom/facebook/common/keyguard/d;-><init>(Lcom/facebook/common/keyguard/c;)V

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 169
    return-void
.end method
