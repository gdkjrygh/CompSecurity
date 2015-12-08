.class final Lcom/b/a/a/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/b/a/a/y;

.field final synthetic b:Z

.field final synthetic c:Lcom/b/a/a/b;


# direct methods
.method constructor <init>(Lcom/b/a/a/b;Lcom/b/a/a/y;Z)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lcom/b/a/a/g;->c:Lcom/b/a/a/b;

    iput-object p2, p0, Lcom/b/a/a/g;->a:Lcom/b/a/a/y;

    iput-boolean p3, p0, Lcom/b/a/a/g;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 148
    :try_start_0
    iget-object v0, p0, Lcom/b/a/a/g;->c:Lcom/b/a/a/b;

    iget-object v0, v0, Lcom/b/a/a/b;->b:Lcom/b/a/a/w;

    iget-object v1, p0, Lcom/b/a/a/g;->a:Lcom/b/a/a/y;

    invoke-interface {v0, v1}, Lcom/b/a/a/w;->a(Lcom/b/a/a/y;)V

    .line 149
    iget-boolean v0, p0, Lcom/b/a/a/g;->b:Z

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/b/a/a/g;->c:Lcom/b/a/a/b;

    iget-object v0, v0, Lcom/b/a/a/b;->b:Lcom/b/a/a/w;

    invoke-interface {v0}, Lcom/b/a/a/w;->e()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    :cond_0
    :goto_0
    return-void

    .line 153
    :catch_0
    move-exception v0

    .line 154
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Failed to process event"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
