.class public Lcom/facebook/orca/intents/IntentHandlerActivity;
.super Lcom/facebook/base/activity/i;
.source "IntentHandlerActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 17
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 19
    invoke-virtual {p0}, Lcom/facebook/orca/intents/IntentHandlerActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    .line 20
    const-class v1, Lcom/facebook/orca/intents/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/intents/b;

    .line 22
    invoke-virtual {p0}, Lcom/facebook/orca/intents/IntentHandlerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/intents/b;->a(Landroid/content/Intent;)Lcom/google/common/d/a/s;

    .line 23
    invoke-virtual {p0}, Lcom/facebook/orca/intents/IntentHandlerActivity;->finish()V

    .line 24
    return-void
.end method
