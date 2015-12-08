.class final Lcom/b/a/b/c;
.super La/a/a/a/d;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/b/a/b/b;


# direct methods
.method constructor <init>(Lcom/b/a/b/b;)V
    .locals 0

    .prologue
    .line 18
    iput-object p1, p0, Lcom/b/a/b/c;->a:Lcom/b/a/b/b;

    invoke-direct {p0}, La/a/a/a/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 21
    iget-object v0, p0, Lcom/b/a/b/c;->a:Lcom/b/a/b/b;

    invoke-virtual {v0}, Lcom/b/a/b/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/b/a/b/c;->a:Lcom/b/a/b/b;

    invoke-static {v0}, Lcom/b/a/b/b;->a(Lcom/b/a/b/b;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/b/a/b/d;

    invoke-direct {v1, p0}, Lcom/b/a/b/d;-><init>(Lcom/b/a/b/c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 31
    :cond_0
    return-void
.end method
