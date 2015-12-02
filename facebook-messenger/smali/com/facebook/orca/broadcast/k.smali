.class Lcom/facebook/orca/broadcast/k;
.super Ljava/lang/Object;
.source "ComposeBroadcastFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/facebook/orca/broadcast/k;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/orca/broadcast/k;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->a(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Lcom/facebook/orca/broadcast/q;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/broadcast/k;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->a(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Lcom/facebook/orca/broadcast/q;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/broadcast/q;->a()V

    .line 102
    :cond_0
    return-void
.end method
