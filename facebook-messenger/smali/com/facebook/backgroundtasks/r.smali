.class public Lcom/facebook/backgroundtasks/r;
.super Lcom/google/common/d/a/a;
.source "SimpleBackgroundResultFutureCallback.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/d/a/a",
        "<",
        "Lcom/facebook/backgroundtasks/b;",
        ">;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/google/common/d/a/a;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/backgroundtasks/r;->a:Ljava/lang/Class;

    .line 22
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/backgroundtasks/r;->a:Ljava/lang/Class;

    const-string v1, "Finished successfully"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 27
    new-instance v0, Lcom/facebook/backgroundtasks/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/facebook/backgroundtasks/b;-><init>(Z)V

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundtasks/r;->a_(Ljava/lang/Object;)Z

    .line 28
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 15
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/backgroundtasks/r;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/backgroundtasks/r;->a:Ljava/lang/Class;

    const-string v1, "Finished with failure"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 33
    new-instance v0, Lcom/facebook/backgroundtasks/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/backgroundtasks/b;-><init>(Z)V

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundtasks/r;->a_(Ljava/lang/Object;)Z

    .line 34
    return-void
.end method
