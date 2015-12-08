.class Lroboguice/inject/ContextScope$1;
.super Ljava/lang/Object;
.source "ContextScope.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lroboguice/inject/ContextScope;->scope(Lcom/google/inject/Key;Lcom/google/inject/Provider;)Lcom/google/inject/Provider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/Provider",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lroboguice/inject/ContextScope;

.field final synthetic val$key:Lcom/google/inject/Key;

.field final synthetic val$unscoped:Lcom/google/inject/Provider;


# direct methods
.method constructor <init>(Lroboguice/inject/ContextScope;Lcom/google/inject/Key;Lcom/google/inject/Provider;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lroboguice/inject/ContextScope$1;->this$0:Lroboguice/inject/ContextScope;

    iput-object p2, p0, Lroboguice/inject/ContextScope$1;->val$key:Lcom/google/inject/Key;

    iput-object p3, p0, Lroboguice/inject/ContextScope$1;->val$unscoped:Lcom/google/inject/Provider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 106
    const-class v5, Lroboguice/inject/ContextScope;

    monitor-enter v5

    .line 107
    :try_start_0
    iget-object v4, p0, Lroboguice/inject/ContextScope$1;->this$0:Lroboguice/inject/ContextScope;

    invoke-virtual {v4}, Lroboguice/inject/ContextScope;->getContextStack()Ljava/util/Stack;

    move-result-object v3

    .line 108
    .local v3, "stack":Ljava/util/Stack;, "Ljava/util/Stack<Ljava/lang/ref/WeakReference<Landroid/content/Context;>;>;"
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 109
    .local v0, "context":Landroid/content/Context;
    iget-object v4, p0, Lroboguice/inject/ContextScope$1;->this$0:Lroboguice/inject/ContextScope;

    invoke-virtual {v4, v0}, Lroboguice/inject/ContextScope;->getScopedObjectMap(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v2

    .line 110
    .local v2, "objectsForScope":Ljava/util/Map;, "Ljava/util/Map<Lcom/google/inject/Key<*>;Ljava/lang/Object;>;"
    if-nez v2, :cond_0

    .line 111
    const/4 v1, 0x0

    monitor-exit v5

    .line 119
    :goto_0
    return-object v1

    .line 113
    :cond_0
    iget-object v4, p0, Lroboguice/inject/ContextScope$1;->val$key:Lcom/google/inject/Key;

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 114
    .local v1, "current":Ljava/lang/Object;, "TT;"
    if-nez v1, :cond_1

    iget-object v4, p0, Lroboguice/inject/ContextScope$1;->val$key:Lcom/google/inject/Key;

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 115
    iget-object v4, p0, Lroboguice/inject/ContextScope$1;->val$unscoped:Lcom/google/inject/Provider;

    invoke-interface {v4}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    .line 116
    iget-object v4, p0, Lroboguice/inject/ContextScope$1;->val$key:Lcom/google/inject/Key;

    invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    :cond_1
    monitor-exit v5

    goto :goto_0

    .line 120
    .end local v0    # "context":Landroid/content/Context;
    .end local v1    # "current":Ljava/lang/Object;, "TT;"
    .end local v2    # "objectsForScope":Ljava/util/Map;, "Ljava/util/Map<Lcom/google/inject/Key<*>;Ljava/lang/Object;>;"
    .end local v3    # "stack":Ljava/util/Stack;, "Ljava/util/Stack<Ljava/lang/ref/WeakReference<Landroid/content/Context;>;>;"
    :catchall_0
    move-exception v4

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v4
.end method
