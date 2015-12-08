.class Lcom/google/inject/internal/InternalInjectorCreator$1;
.super Ljava/lang/Object;
.source "InternalInjectorCreator.java"

# interfaces
.implements Lcom/google/inject/internal/ContextualCallable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/internal/InternalInjectorCreator;->loadEagerSingletons(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Stage;Lcom/google/inject/internal/Errors;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/ContextualCallable",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field dependency:Lcom/google/inject/spi/Dependency;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/spi/Dependency",
            "<*>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/google/inject/internal/InternalInjectorCreator;

.field final synthetic val$binding:Lcom/google/inject/internal/BindingImpl;

.field final synthetic val$errors:Lcom/google/inject/internal/Errors;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InternalInjectorCreator;Lcom/google/inject/internal/BindingImpl;Lcom/google/inject/internal/Errors;)V
    .locals 1

    .prologue
    .line 198
    iput-object p1, p0, Lcom/google/inject/internal/InternalInjectorCreator$1;->this$0:Lcom/google/inject/internal/InternalInjectorCreator;

    iput-object p2, p0, Lcom/google/inject/internal/InternalInjectorCreator$1;->val$binding:Lcom/google/inject/internal/BindingImpl;

    iput-object p3, p0, Lcom/google/inject/internal/InternalInjectorCreator$1;->val$errors:Lcom/google/inject/internal/Errors;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 199
    iget-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator$1;->val$binding:Lcom/google/inject/internal/BindingImpl;

    invoke-virtual {v0}, Lcom/google/inject/internal/BindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/spi/Dependency;->get(Lcom/google/inject/Key;)Lcom/google/inject/spi/Dependency;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator$1;->dependency:Lcom/google/inject/spi/Dependency;

    return-void
.end method


# virtual methods
.method public bridge synthetic call(Lcom/google/inject/internal/InternalContext;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/internal/InternalContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 198
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/InternalInjectorCreator$1;->call(Lcom/google/inject/internal/InternalContext;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call(Lcom/google/inject/internal/InternalContext;)Ljava/lang/Void;
    .locals 6
    .param p1, "context"    # Lcom/google/inject/internal/InternalContext;

    .prologue
    .line 201
    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator$1;->dependency:Lcom/google/inject/spi/Dependency;

    invoke-virtual {p1, v3}, Lcom/google/inject/internal/InternalContext;->setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;

    move-result-object v2

    .line 202
    .local v2, "previous":Lcom/google/inject/spi/Dependency;
    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator$1;->val$errors:Lcom/google/inject/internal/Errors;

    iget-object v4, p0, Lcom/google/inject/internal/InternalInjectorCreator$1;->dependency:Lcom/google/inject/spi/Dependency;

    invoke-virtual {v3, v4}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v1

    .line 204
    .local v1, "errorsForBinding":Lcom/google/inject/internal/Errors;
    :try_start_0
    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator$1;->val$binding:Lcom/google/inject/internal/BindingImpl;

    invoke-virtual {v3}, Lcom/google/inject/internal/BindingImpl;->getInternalFactory()Lcom/google/inject/internal/InternalFactory;

    move-result-object v3

    iget-object v4, p0, Lcom/google/inject/internal/InternalInjectorCreator$1;->dependency:Lcom/google/inject/spi/Dependency;

    const/4 v5, 0x0

    invoke-interface {v3, v1, p1, v4, v5}, Lcom/google/inject/internal/InternalFactory;->get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 208
    invoke-virtual {p1, v2}, Lcom/google/inject/internal/InternalContext;->setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;

    .line 211
    :goto_0
    const/4 v3, 0x0

    return-object v3

    .line 205
    :catch_0
    move-exception v0

    .line 206
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    :try_start_1
    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    invoke-virtual {p1, v2}, Lcom/google/inject/internal/InternalContext;->setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;

    goto :goto_0

    .end local v0    # "e":Lcom/google/inject/internal/ErrorsException;
    :catchall_0
    move-exception v3

    invoke-virtual {p1, v2}, Lcom/google/inject/internal/InternalContext;->setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;

    throw v3
.end method
