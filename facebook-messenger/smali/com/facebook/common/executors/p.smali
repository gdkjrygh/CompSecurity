.class Lcom/facebook/common/executors/p;
.super Ljava/lang/Object;
.source "KeyedExecutor.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/common/executors/q;

.field final synthetic b:Lcom/facebook/common/executors/r;

.field final synthetic c:Lcom/facebook/common/executors/n;


# direct methods
.method constructor <init>(Lcom/facebook/common/executors/n;Lcom/facebook/common/executors/q;Lcom/facebook/common/executors/r;)V
    .locals 0

    .prologue
    .line 174
    iput-object p1, p0, Lcom/facebook/common/executors/p;->c:Lcom/facebook/common/executors/n;

    iput-object p2, p0, Lcom/facebook/common/executors/p;->a:Lcom/facebook/common/executors/q;

    iput-object p3, p0, Lcom/facebook/common/executors/p;->b:Lcom/facebook/common/executors/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/common/executors/p;->c:Lcom/facebook/common/executors/n;

    iget-object v1, p0, Lcom/facebook/common/executors/p;->a:Lcom/facebook/common/executors/q;

    iget-object v2, p0, Lcom/facebook/common/executors/p;->b:Lcom/facebook/common/executors/r;

    invoke-static {v0, v1, v2}, Lcom/facebook/common/executors/n;->a(Lcom/facebook/common/executors/n;Lcom/facebook/common/executors/q;Lcom/facebook/common/executors/r;)V

    .line 177
    return-void
.end method
