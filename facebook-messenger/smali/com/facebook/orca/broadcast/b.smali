.class Lcom/facebook/orca/broadcast/b;
.super Ljava/lang/Object;
.source "BroadcastActivity.java"

# interfaces
.implements Lcom/facebook/base/fragment/c;


# instance fields
.field final synthetic a:Lcom/facebook/orca/broadcast/BroadcastActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/broadcast/BroadcastActivity;)V
    .locals 0

    .prologue
    .line 384
    iput-object p1, p0, Lcom/facebook/orca/broadcast/b;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 387
    if-nez p2, :cond_0

    .line 388
    iget-object v0, p0, Lcom/facebook/orca/broadcast/b;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->onBackPressed()V

    .line 390
    :cond_0
    return-void
.end method
