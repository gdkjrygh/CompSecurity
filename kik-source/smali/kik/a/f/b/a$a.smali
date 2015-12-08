.class final Lkik/a/f/b/a$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/f/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/a/f/b/a;

.field private final b:Lkik/a/f/f/z;


# direct methods
.method public constructor <init>(Lkik/a/f/b/a;Lkik/a/f/f/z;)V
    .locals 0

    .prologue
    .line 193
    iput-object p1, p0, Lkik/a/f/b/a$a;->a:Lkik/a/f/b/a;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 194
    iput-object p2, p0, Lkik/a/f/b/a$a;->b:Lkik/a/f/f/z;

    .line 195
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 200
    iget-object v2, p0, Lkik/a/f/b/a$a;->b:Lkik/a/f/f/z;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lkik/a/f/f/z;->a(J)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 204
    iget-object v2, p0, Lkik/a/f/b/a$a;->a:Lkik/a/f/b/a;

    invoke-static {v2}, Lkik/a/f/b/a;->a(Lkik/a/f/b/a;)Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 207
    :try_start_0
    iget-object v2, p0, Lkik/a/f/b/a$a;->b:Lkik/a/f/f/z;

    invoke-virtual {v2}, Lkik/a/f/f/z;->k()I

    move-result v2

    if-gtz v2, :cond_3

    iget-object v2, p0, Lkik/a/f/b/a$a;->a:Lkik/a/f/b/a;

    invoke-static {v2}, Lkik/a/f/b/a;->b(Lkik/a/f/b/a;)Ljava/util/Set;

    move-result-object v2

    iget-object v3, p0, Lkik/a/f/b/a$a;->b:Lkik/a/f/f/z;

    invoke-virtual {v3}, Lkik/a/f/f/z;->l_()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v3, v1

    .line 209
    :goto_0
    if-nez v3, :cond_2

    .line 211
    iget-object v2, p0, Lkik/a/f/b/a$a;->a:Lkik/a/f/b/a;

    invoke-static {v2}, Lkik/a/f/b/a;->c(Lkik/a/f/b/a;)Ljava/util/LinkedList;

    move-result-object v2

    iget-object v5, p0, Lkik/a/f/b/a$a;->b:Lkik/a/f/f/z;

    invoke-virtual {v2, v5}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v1

    .line 212
    :goto_1
    if-nez v2, :cond_0

    iget-object v2, p0, Lkik/a/f/b/a$a;->a:Lkik/a/f/b/a;

    invoke-static {v2}, Lkik/a/f/b/a;->d(Lkik/a/f/b/a;)Ljava/util/LinkedList;

    move-result-object v2

    iget-object v5, p0, Lkik/a/f/b/a$a;->b:Lkik/a/f/f/z;

    invoke-virtual {v2, v5}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move v0, v1

    .line 213
    :cond_1
    if-nez v0, :cond_2

    iget-object v0, p0, Lkik/a/f/b/a$a;->a:Lkik/a/f/b/a;

    invoke-static {v0}, Lkik/a/f/b/a;->e(Lkik/a/f/b/a;)Ljava/util/LinkedList;

    move-result-object v0

    iget-object v1, p0, Lkik/a/f/b/a$a;->b:Lkik/a/f/f/z;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 215
    :cond_2
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    if-eqz v3, :cond_5

    .line 218
    iget-object v0, p0, Lkik/a/f/b/a$a;->a:Lkik/a/f/b/a;

    invoke-static {v0}, Lkik/a/f/b/a;->f(Lkik/a/f/b/a;)Ljava/util/Timer;

    move-result-object v0

    new-instance v1, Lkik/a/f/b/a$a;

    iget-object v2, p0, Lkik/a/f/b/a$a;->a:Lkik/a/f/b/a;

    iget-object v3, p0, Lkik/a/f/b/a$a;->b:Lkik/a/f/f/z;

    invoke-direct {v1, v2, v3}, Lkik/a/f/b/a$a;-><init>(Lkik/a/f/b/a;Lkik/a/f/f/z;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 228
    :goto_2
    return-void

    :cond_3
    move v3, v0

    .line 207
    goto :goto_0

    :cond_4
    move v2, v0

    .line 211
    goto :goto_1

    .line 215
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 221
    :cond_5
    iget-object v0, p0, Lkik/a/f/b/a$a;->b:Lkik/a/f/f/z;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lkik/a/f/f/z;->b(I)V

    goto :goto_2

    .line 226
    :cond_6
    iget-object v0, p0, Lkik/a/f/b/a$a;->a:Lkik/a/f/b/a;

    iget-object v1, p0, Lkik/a/f/b/a$a;->b:Lkik/a/f/f/z;

    invoke-static {v0, v1}, Lkik/a/f/b/a;->a(Lkik/a/f/b/a;Lkik/a/f/f/z;)V

    goto :goto_2
.end method
