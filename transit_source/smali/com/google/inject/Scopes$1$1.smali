.class Lcom/google/inject/Scopes$1$1;
.super Ljava/lang/Object;
.source "Scopes.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/Scopes$1;->scope(Lcom/google/inject/Key;Lcom/google/inject/Provider;)Lcom/google/inject/Provider;
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
.field private volatile instance:Ljava/lang/Object;

.field final synthetic this$0:Lcom/google/inject/Scopes$1;

.field final synthetic val$creator:Lcom/google/inject/Provider;


# direct methods
.method constructor <init>(Lcom/google/inject/Scopes$1;Lcom/google/inject/Provider;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/google/inject/Scopes$1$1;->this$0:Lcom/google/inject/Scopes$1;

    iput-object p2, p0, Lcom/google/inject/Scopes$1$1;->val$creator:Lcom/google/inject/Provider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 54
    iget-object v4, p0, Lcom/google/inject/Scopes$1$1;->instance:Ljava/lang/Object;

    if-nez v4, :cond_4

    .line 63
    const-class v5, Lcom/google/inject/internal/InternalInjectorCreator;

    monitor-enter v5

    .line 64
    :try_start_0
    iget-object v4, p0, Lcom/google/inject/Scopes$1$1;->instance:Ljava/lang/Object;

    if-nez v4, :cond_3

    .line 65
    iget-object v4, p0, Lcom/google/inject/Scopes$1$1;->val$creator:Lcom/google/inject/Provider;

    invoke-interface {v4}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    .line 68
    .local v1, "provided":Ljava/lang/Object;, "TT;"
    instance-of v4, v1, Lcom/google/inject/internal/CircularDependencyProxy;

    if-eqz v4, :cond_0

    .line 69
    monitor-exit v5

    .line 87
    .end local v1    # "provided":Ljava/lang/Object;, "TT;"
    :goto_0
    return-object v1

    .line 72
    .restart local v1    # "provided":Ljava/lang/Object;, "TT;"
    :cond_0
    if-nez v1, :cond_1

    # getter for: Lcom/google/inject/Scopes;->NULL:Ljava/lang/Object;
    invoke-static {}, Lcom/google/inject/Scopes;->access$000()Ljava/lang/Object;

    move-result-object v2

    .line 73
    .local v2, "providedOrSentinel":Ljava/lang/Object;
    :goto_1
    iget-object v4, p0, Lcom/google/inject/Scopes$1$1;->instance:Ljava/lang/Object;

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/google/inject/Scopes$1$1;->instance:Ljava/lang/Object;

    if-eq v4, v2, :cond_2

    .line 74
    new-instance v4, Lcom/google/inject/ProvisionException;

    const-string v6, "Provider was reentrant while creating a singleton"

    invoke-direct {v4, v6}, Lcom/google/inject/ProvisionException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 80
    .end local v1    # "provided":Ljava/lang/Object;, "TT;"
    .end local v2    # "providedOrSentinel":Ljava/lang/Object;
    :catchall_0
    move-exception v4

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v4

    .restart local v1    # "provided":Ljava/lang/Object;, "TT;"
    :cond_1
    move-object v2, v1

    .line 72
    goto :goto_1

    .line 78
    .restart local v2    # "providedOrSentinel":Ljava/lang/Object;
    :cond_2
    :try_start_1
    iput-object v2, p0, Lcom/google/inject/Scopes$1$1;->instance:Ljava/lang/Object;

    .line 80
    .end local v1    # "provided":Ljava/lang/Object;, "TT;"
    .end local v2    # "providedOrSentinel":Ljava/lang/Object;
    :cond_3
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    :cond_4
    iget-object v0, p0, Lcom/google/inject/Scopes$1$1;->instance:Ljava/lang/Object;

    .line 86
    .local v0, "localInstance":Ljava/lang/Object;
    # getter for: Lcom/google/inject/Scopes;->NULL:Ljava/lang/Object;
    invoke-static {}, Lcom/google/inject/Scopes;->access$000()Ljava/lang/Object;

    move-result-object v4

    if-eq v0, v4, :cond_5

    move-object v3, v0

    .local v3, "returnedInstance":Ljava/lang/Object;, "TT;"
    :goto_2
    move-object v1, v3

    .line 87
    goto :goto_0

    .line 86
    .end local v3    # "returnedInstance":Ljava/lang/Object;, "TT;"
    :cond_5
    const/4 v3, 0x0

    goto :goto_2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 91
    const-string v0, "%s[%s]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/inject/Scopes$1$1;->val$creator:Lcom/google/inject/Provider;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    sget-object v3, Lcom/google/inject/Scopes;->SINGLETON:Lcom/google/inject/Scope;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
