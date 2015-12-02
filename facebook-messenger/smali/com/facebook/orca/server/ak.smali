.class Lcom/facebook/orca/server/ak;
.super Landroid/content/BroadcastReceiver;
.source "MessagesServiceManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/server/aj;


# direct methods
.method constructor <init>(Lcom/facebook/orca/server/aj;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/orca/server/ak;->a:Lcom/facebook/orca/server/aj;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/server/ak;->a:Lcom/facebook/orca/server/aj;

    invoke-static {v0}, Lcom/facebook/orca/server/aj;->a(Lcom/facebook/orca/server/aj;)V

    .line 50
    return-void
.end method
