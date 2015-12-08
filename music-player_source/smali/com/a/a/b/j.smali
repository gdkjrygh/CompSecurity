.class final Lcom/a/a/b/j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/a/a/b/l;

.field final synthetic b:Lcom/a/a/b/i;


# direct methods
.method constructor <init>(Lcom/a/a/b/i;Lcom/a/a/b/l;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/b/j;->b:Lcom/a/a/b/i;

    iput-object p2, p0, Lcom/a/a/b/j;->a:Lcom/a/a/b/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/a/a/b/j;->b:Lcom/a/a/b/i;

    iget-object v0, v0, Lcom/a/a/b/i;->a:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->q:Lcom/a/a/a/a/b;

    iget-object v1, p0, Lcom/a/a/b/j;->a:Lcom/a/a/b/l;

    iget-object v1, v1, Lcom/a/a/b/l;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/a/a/a/a/b;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    iget-object v1, p0, Lcom/a/a/b/j;->b:Lcom/a/a/b/i;

    invoke-static {v1}, Lcom/a/a/b/i;->a(Lcom/a/a/b/i;)V

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/b/j;->b:Lcom/a/a/b/i;

    invoke-static {v0}, Lcom/a/a/b/i;->b(Lcom/a/a/b/i;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/b/j;->a:Lcom/a/a/b/l;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/a/a/b/j;->b:Lcom/a/a/b/i;

    invoke-static {v0}, Lcom/a/a/b/i;->c(Lcom/a/a/b/i;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/b/j;->a:Lcom/a/a/b/l;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
