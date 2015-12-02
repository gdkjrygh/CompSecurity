.class Lcom/facebook/orca/threadview/bk;
.super Ljava/lang/Object;
.source "ThreadViewFragment.java"

# interfaces
.implements Lcom/facebook/orca/mutators/h;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threads/ThreadSummary;

.field final synthetic b:Lcom/facebook/user/User;

.field final synthetic c:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/user/User;)V
    .locals 0

    .prologue
    .line 1362
    iput-object p1, p0, Lcom/facebook/orca/threadview/bk;->c:Lcom/facebook/orca/threadview/ThreadViewFragment;

    iput-object p2, p0, Lcom/facebook/orca/threadview/bk;->a:Lcom/facebook/orca/threads/ThreadSummary;

    iput-object p3, p0, Lcom/facebook/orca/threadview/bk;->b:Lcom/facebook/user/User;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 1365
    iget-object v0, p0, Lcom/facebook/orca/threadview/bk;->c:Lcom/facebook/orca/threadview/ThreadViewFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/bk;->a:Lcom/facebook/orca/threads/ThreadSummary;

    iget-object v2, p0, Lcom/facebook/orca/threadview/bk;->b:Lcom/facebook/user/User;

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/user/User;)V

    .line 1366
    return-void
.end method
