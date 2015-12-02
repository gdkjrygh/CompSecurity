.class Lcom/facebook/orca/threadview/dg;
.super Ljava/lang/Object;
.source "ThreadViewMessageFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V
    .locals 0

    .prologue
    .line 1363
    iput-object p1, p0, Lcom/facebook/orca/threadview/dg;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1366
    iget-object v0, p0, Lcom/facebook/orca/threadview/dg;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Z)V

    .line 1367
    return-void
.end method
