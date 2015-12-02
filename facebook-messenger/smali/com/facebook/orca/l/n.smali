.class Lcom/facebook/orca/l/n;
.super Ljava/lang/Object;
.source "MergeServiceHandler.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/threads/FolderName;

.field final synthetic b:Lcom/facebook/auth/viewercontext/ViewerContext;

.field final synthetic c:Lcom/facebook/orca/l/v;

.field final synthetic d:Lcom/facebook/orca/l/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/l/a;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/auth/viewercontext/ViewerContext;Lcom/facebook/orca/l/v;)V
    .locals 0

    .prologue
    .line 1546
    iput-object p1, p0, Lcom/facebook/orca/l/n;->d:Lcom/facebook/orca/l/a;

    iput-object p2, p0, Lcom/facebook/orca/l/n;->a:Lcom/facebook/orca/threads/FolderName;

    iput-object p3, p0, Lcom/facebook/orca/l/n;->b:Lcom/facebook/auth/viewercontext/ViewerContext;

    iput-object p4, p0, Lcom/facebook/orca/l/n;->c:Lcom/facebook/orca/l/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 1549
    const-wide/16 v0, 0x5

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 1550
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "For "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/l/n;->a:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 1552
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/l/n;->b:Lcom/facebook/auth/viewercontext/ViewerContext;

    if-eqz v0, :cond_0

    .line 1553
    iget-object v0, p0, Lcom/facebook/orca/l/n;->d:Lcom/facebook/orca/l/a;

    invoke-static {v0}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/l/a;)Lcom/facebook/auth/viewercontext/e;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/orca/l/n;->b:Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-interface {v0, v2}, Lcom/facebook/auth/viewercontext/e;->b(Lcom/facebook/auth/viewercontext/ViewerContext;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1556
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/l/n;->c:Lcom/facebook/orca/l/v;

    iget-object v2, p0, Lcom/facebook/orca/l/n;->a:Lcom/facebook/orca/threads/FolderName;

    invoke-interface {v0, v2}, Lcom/facebook/orca/l/v;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 1558
    :try_start_2
    iget-object v2, p0, Lcom/facebook/orca/l/n;->b:Lcom/facebook/auth/viewercontext/ViewerContext;

    if-eqz v2, :cond_1

    .line 1559
    iget-object v2, p0, Lcom/facebook/orca/l/n;->d:Lcom/facebook/orca/l/a;

    invoke-static {v2}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/l/a;)Lcom/facebook/auth/viewercontext/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/facebook/auth/viewercontext/e;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1563
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 1564
    invoke-static {}, Lcom/facebook/orca/l/a;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    return-object v0

    .line 1558
    :catchall_0
    move-exception v0

    :try_start_3
    iget-object v2, p0, Lcom/facebook/orca/l/n;->b:Lcom/facebook/auth/viewercontext/ViewerContext;

    if-eqz v2, :cond_2

    .line 1559
    iget-object v2, p0, Lcom/facebook/orca/l/n;->d:Lcom/facebook/orca/l/a;

    invoke-static {v2}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/l/a;)Lcom/facebook/auth/viewercontext/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/facebook/auth/viewercontext/e;->d()V

    :cond_2
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1563
    :catchall_1
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 1564
    invoke-static {}, Lcom/facebook/orca/l/a;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    throw v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1546
    invoke-virtual {p0}, Lcom/facebook/orca/l/n;->a()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
