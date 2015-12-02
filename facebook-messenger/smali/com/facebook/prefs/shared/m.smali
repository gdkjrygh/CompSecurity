.class Lcom/facebook/prefs/shared/m;
.super Ljava/lang/Object;
.source "FbSharedPreferencesImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/prefs/shared/j;


# direct methods
.method constructor <init>(Lcom/facebook/prefs/shared/j;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lcom/facebook/prefs/shared/m;->a:Lcom/facebook/prefs/shared/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 206
    iget-object v1, p0, Lcom/facebook/prefs/shared/m;->a:Lcom/facebook/prefs/shared/j;

    monitor-enter v1

    .line 207
    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/m;->a:Lcom/facebook/prefs/shared/j;

    invoke-static {v0}, Lcom/facebook/prefs/shared/j;->a(Lcom/facebook/prefs/shared/j;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 208
    iget-object v2, p0, Lcom/facebook/prefs/shared/m;->a:Lcom/facebook/prefs/shared/j;

    invoke-static {v2}, Lcom/facebook/prefs/shared/j;->a(Lcom/facebook/prefs/shared/j;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 209
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 212
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 209
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 214
    :cond_0
    return-void
.end method
