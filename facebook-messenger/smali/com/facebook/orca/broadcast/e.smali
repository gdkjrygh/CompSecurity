.class Lcom/facebook/orca/broadcast/e;
.super Ljava/lang/Object;
.source "BroadcastActivity.java"

# interfaces
.implements Lcom/facebook/orca/activity/d;


# instance fields
.field final synthetic a:Lcom/facebook/orca/broadcast/BroadcastActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/broadcast/BroadcastActivity;)V
    .locals 0

    .prologue
    .line 524
    iput-object p1, p0, Lcom/facebook/orca/broadcast/e;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .prologue
    .line 527
    if-eqz p1, :cond_0

    .line 528
    iget-object v0, p0, Lcom/facebook/orca/broadcast/e;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->f(Lcom/facebook/orca/broadcast/BroadcastActivity;)V

    .line 529
    iget-object v0, p0, Lcom/facebook/orca/broadcast/e;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->g(Lcom/facebook/orca/broadcast/BroadcastActivity;)V

    .line 531
    :cond_0
    return-void
.end method
