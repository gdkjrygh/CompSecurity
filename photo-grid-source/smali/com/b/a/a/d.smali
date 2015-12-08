.class final Lcom/b/a/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/b/a/a/b;


# direct methods
.method constructor <init>(Lcom/b/a/a/b;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/b/a/a/d;->a:Lcom/b/a/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 98
    :try_start_0
    iget-object v0, p0, Lcom/b/a/a/d;->a:Lcom/b/a/a/b;

    iget-object v0, v0, Lcom/b/a/a/b;->b:Lcom/b/a/a/w;

    .line 99
    iget-object v1, p0, Lcom/b/a/a/d;->a:Lcom/b/a/a/b;

    new-instance v2, Lcom/b/a/a/l;

    invoke-direct {v2}, Lcom/b/a/a/l;-><init>()V

    iput-object v2, v1, Lcom/b/a/a/b;->b:Lcom/b/a/a/w;

    .line 100
    invoke-interface {v0}, Lcom/b/a/a/w;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    :goto_0
    return-void

    .line 101
    :catch_0
    move-exception v0

    .line 102
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Failed to disable events"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
