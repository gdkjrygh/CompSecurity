.class final Lcom/google/inject/util/Modules$2;
.super Ljava/lang/Object;
.source "Modules.java"

# interfaces
.implements Lcom/google/inject/Module;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/util/Modules;->combine(Ljava/lang/Iterable;)Lcom/google/inject/Module;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$modulesSet:Ljava/util/Set;


# direct methods
.method constructor <init>(Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/google/inject/util/Modules$2;->val$modulesSet:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configure(Lcom/google/inject/Binder;)V
    .locals 5
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 112
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-interface {p1, v2}, Lcom/google/inject/Binder;->skipSources([Ljava/lang/Class;)Lcom/google/inject/Binder;

    move-result-object p1

    .line 113
    iget-object v2, p0, Lcom/google/inject/util/Modules$2;->val$modulesSet:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/Module;

    .line 114
    .local v1, "module":Lcom/google/inject/Module;
    invoke-interface {p1, v1}, Lcom/google/inject/Binder;->install(Lcom/google/inject/Module;)V

    goto :goto_0

    .line 116
    .end local v1    # "module":Lcom/google/inject/Module;
    :cond_0
    return-void
.end method
