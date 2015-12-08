.class final Lcom/b/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:La/a/a/a/a/g/b;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/b/a/a/b;


# direct methods
.method constructor <init>(Lcom/b/a/a/b;La/a/a/a/a/g/b;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/b/a/a/c;->c:Lcom/b/a/a/b;

    iput-object p2, p0, Lcom/b/a/a/c;->a:La/a/a/a/a/g/b;

    iput-object p3, p0, Lcom/b/a/a/c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 81
    :try_start_0
    iget-object v0, p0, Lcom/b/a/a/c;->c:Lcom/b/a/a/b;

    iget-object v0, v0, Lcom/b/a/a/b;->b:Lcom/b/a/a/w;

    iget-object v1, p0, Lcom/b/a/a/c;->a:La/a/a/a/a/g/b;

    iget-object v2, p0, Lcom/b/a/a/c;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/b/a/a/w;->a(La/a/a/a/a/g/b;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    :goto_0
    return-void

    .line 83
    :catch_0
    move-exception v0

    .line 84
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Failed to set analytics settings data"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
