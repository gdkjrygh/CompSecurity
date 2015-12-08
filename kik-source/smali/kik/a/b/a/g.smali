.class final Lkik/a/b/a/g;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/b/a/a;


# direct methods
.method constructor <init>(Lkik/a/b/a/a;)V
    .locals 0

    .prologue
    .line 2196
    iput-object p1, p0, Lkik/a/b/a/g;->a:Lkik/a/b/a/a;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .prologue
    .line 2196
    check-cast p2, Ljava/util/List;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lkik/a/b/a/g;->a:Lkik/a/b/a/a;

    invoke-static {v1}, Lkik/a/b/a/a;->i(Lkik/a/b/a/a;)Ljava/util/Hashtable;

    move-result-object v3

    monitor-enter v3

    :try_start_0
    iget-object v1, p0, Lkik/a/b/a/g;->a:Lkik/a/b/a/a;

    invoke-static {v1}, Lkik/a/b/a/a;->i(Lkik/a/b/a/a;)Ljava/util/Hashtable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/f;

    iget-object v5, p0, Lkik/a/b/a/g;->a:Lkik/a/b/a/a;

    invoke-virtual {v5, v1}, Lkik/a/b/a/a;->a(Lkik/a/d/f;)I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_1

    invoke-virtual {v1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    :cond_1
    invoke-virtual {v1}, Lkik/a/d/f;->n()Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Lkik/a/b/a/g;->a:Lkik/a/b/a/a;

    invoke-virtual {v1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Lkik/a/b/a/a;->d(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lkik/a/b/a/g;->a:Lkik/a/b/a/a;

    invoke-static {v1, v0}, Lkik/a/b/a/a;->b(Lkik/a/b/a/a;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    return-void
.end method
