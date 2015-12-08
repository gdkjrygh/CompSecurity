.class public Lroboguice/inject/ContextScopedProvider;
.super Ljava/lang/Object;
.source "ContextScopedProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected provider:Lcom/google/inject/Provider;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Provider",
            "<TT;>;"
        }
    .end annotation
.end field

.field protected scope:Lroboguice/inject/ContextScope;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    .local p0, "this":Lroboguice/inject/ContextScopedProvider;, "Lroboguice/inject/ContextScopedProvider<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(Landroid/content/Context;)Ljava/lang/Object;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 14
    .local p0, "this":Lroboguice/inject/ContextScopedProvider;, "Lroboguice/inject/ContextScopedProvider<TT;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 15
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedProvider;->scope:Lroboguice/inject/ContextScope;

    invoke-virtual {v0, p1}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedProvider;->provider:Lcom/google/inject/Provider;

    invoke-interface {v0}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 19
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedProvider;->scope:Lroboguice/inject/ContextScope;

    invoke-virtual {v2, p1}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedProvider;->scope:Lroboguice/inject/ContextScope;

    invoke-virtual {v2, p1}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 21
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method
