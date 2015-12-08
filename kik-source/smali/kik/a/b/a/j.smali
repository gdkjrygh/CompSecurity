.class final Lkik/a/b/a/j;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/b/a/a;


# direct methods
.method constructor <init>(Lkik/a/b/a/a;)V
    .locals 0

    .prologue
    .line 2257
    iput-object p1, p0, Lkik/a/b/a/j;->a:Lkik/a/b/a/a;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 2257
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3b

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lkik/a/b/a/j;->a:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->i(Lkik/a/b/a/a;)Ljava/util/Hashtable;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/j;->a:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->i(Lkik/a/b/a/a;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->d()Lkik/a/d/s;

    move-result-object v3

    iget-object v4, p0, Lkik/a/b/a/j;->a:Lkik/a/b/a/a;

    invoke-static {v4}, Lkik/a/b/a/a;->a(Lkik/a/b/a/a;)Lkik/a/e/v;

    move-result-object v4

    invoke-interface {v4, v0, v3}, Lkik/a/e/v;->a(Lkik/a/d/f;Lkik/a/d/s;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    return-void
.end method
