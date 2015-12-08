.class final Lkik/a/j/ah;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/j/u$b;


# direct methods
.method constructor <init>(Lkik/a/j/u$b;)V
    .locals 0

    .prologue
    .line 243
    iput-object p1, p0, Lkik/a/j/ah;->a:Lkik/a/j/u$b;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 243
    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lkik/a/j/ah;->a:Lkik/a/j/u$b;

    iget-object v0, v0, Lkik/a/j/u$b;->a:Lkik/a/j/u;

    iget-object v1, p0, Lkik/a/j/ah;->a:Lkik/a/j/u$b;

    invoke-static {v1}, Lkik/a/j/u$b;->a(Lkik/a/j/u$b;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lkik/a/j/u;->a(Lkik/a/j/u;Ljava/lang/String;Ljava/util/Map;)V

    iget-object v0, p0, Lkik/a/j/ah;->a:Lkik/a/j/u$b;

    iget-object v0, v0, Lkik/a/j/u$b;->a:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->a(Lkik/a/j/u;)Ljava/util/Map;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lkik/a/j/ah;->a:Lkik/a/j/u$b;

    iget-object v0, v0, Lkik/a/j/u$b;->a:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->a(Lkik/a/j/u;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lkik/a/j/ah;->a:Lkik/a/j/u$b;

    invoke-static {v2}, Lkik/a/j/u$b;->a(Lkik/a/j/u$b;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
