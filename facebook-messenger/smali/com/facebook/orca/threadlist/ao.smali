.class Lcom/facebook/orca/threadlist/ao;
.super Lcom/facebook/base/broadcast/q;
.source "ThreadListFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/ThreadListFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/ThreadListFragment;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 268
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ao;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ao;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-static {v0, p2}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/ThreadListFragment;Landroid/content/Intent;)V

    .line 272
    return-void
.end method
