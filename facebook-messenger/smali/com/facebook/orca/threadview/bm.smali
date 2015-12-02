.class Lcom/facebook/orca/threadview/bm;
.super Ljava/lang/Object;
.source "ThreadViewFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 1736
    iput-object p1, p0, Lcom/facebook/orca/threadview/bm;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1739
    iget-object v0, p0, Lcom/facebook/orca/threadview/bm;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->Q()Z

    .line 1740
    return-void
.end method
