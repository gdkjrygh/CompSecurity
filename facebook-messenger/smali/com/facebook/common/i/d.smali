.class Lcom/facebook/common/i/d;
.super Lcom/facebook/common/v/j;
.source "IncrementalTaskExecutor.java"


# instance fields
.field final synthetic a:Lcom/facebook/common/i/b;


# direct methods
.method constructor <init>(Lcom/facebook/common/i/b;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/facebook/common/i/d;->a:Lcom/facebook/common/i/b;

    invoke-direct {p0}, Lcom/facebook/common/v/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/common/i/d;->a:Lcom/facebook/common/i/b;

    invoke-static {v0, p1}, Lcom/facebook/common/i/b;->a(Lcom/facebook/common/i/b;Z)Z

    .line 60
    iget-object v0, p0, Lcom/facebook/common/i/d;->a:Lcom/facebook/common/i/b;

    invoke-static {v0}, Lcom/facebook/common/i/b;->b(Lcom/facebook/common/i/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/common/i/d;->a:Lcom/facebook/common/i/b;

    invoke-static {v0}, Lcom/facebook/common/i/b;->c(Lcom/facebook/common/i/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/i/d;->a:Lcom/facebook/common/i/b;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/common/i/b;->a(Lcom/facebook/common/i/b;J)V

    .line 63
    :cond_1
    return-void
.end method
