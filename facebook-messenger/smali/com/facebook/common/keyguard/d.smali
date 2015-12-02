.class Lcom/facebook/common/keyguard/d;
.super Ljava/lang/Object;
.source "KeyguardPendingIntentActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/common/keyguard/c;


# direct methods
.method constructor <init>(Lcom/facebook/common/keyguard/c;)V
    .locals 0

    .prologue
    .line 162
    iput-object p1, p0, Lcom/facebook/common/keyguard/d;->a:Lcom/facebook/common/keyguard/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 165
    iget-object v0, p0, Lcom/facebook/common/keyguard/d;->a:Lcom/facebook/common/keyguard/c;

    iget-object v0, v0, Lcom/facebook/common/keyguard/c;->a:Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;

    invoke-virtual {v0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->finish()V

    .line 166
    iget-object v0, p0, Lcom/facebook/common/keyguard/d;->a:Lcom/facebook/common/keyguard/c;

    iget-object v0, v0, Lcom/facebook/common/keyguard/c;->a:Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;

    invoke-virtual {v0, v1, v1}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->overridePendingTransition(II)V

    .line 167
    return-void
.end method
