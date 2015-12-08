.class Lcom/google/inject/internal/InjectorImpl$4;
.super Ljava/lang/Object;
.source "InjectorImpl.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/internal/InjectorImpl;->getProviderOrThrow(Lcom/google/inject/Key;Lcom/google/inject/internal/Errors;)Lcom/google/inject/Provider;
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
.field final synthetic this$0:Lcom/google/inject/internal/InjectorImpl;

.field final synthetic val$dependency:Lcom/google/inject/spi/Dependency;

.field final synthetic val$factory:Lcom/google/inject/internal/InternalFactory;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/spi/Dependency;Lcom/google/inject/internal/InternalFactory;)V
    .locals 0

    .prologue
    .line 970
    iput-object p1, p0, Lcom/google/inject/internal/InjectorImpl$4;->this$0:Lcom/google/inject/internal/InjectorImpl;

    iput-object p2, p0, Lcom/google/inject/internal/InjectorImpl$4;->val$dependency:Lcom/google/inject/spi/Dependency;

    iput-object p3, p0, Lcom/google/inject/internal/InjectorImpl$4;->val$factory:Lcom/google/inject/internal/InternalFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 972
    new-instance v1, Lcom/google/inject/internal/Errors;

    iget-object v3, p0, Lcom/google/inject/internal/InjectorImpl$4;->val$dependency:Lcom/google/inject/spi/Dependency;

    invoke-direct {v1, v3}, Lcom/google/inject/internal/Errors;-><init>(Ljava/lang/Object;)V

    .line 974
    .local v1, "errors":Lcom/google/inject/internal/Errors;
    :try_start_0
    iget-object v3, p0, Lcom/google/inject/internal/InjectorImpl$4;->this$0:Lcom/google/inject/internal/InjectorImpl;

    new-instance v4, Lcom/google/inject/internal/InjectorImpl$4$1;

    invoke-direct {v4, p0, v1}, Lcom/google/inject/internal/InjectorImpl$4$1;-><init>(Lcom/google/inject/internal/InjectorImpl$4;Lcom/google/inject/internal/Errors;)V

    invoke-virtual {v3, v4}, Lcom/google/inject/internal/InjectorImpl;->callInContext(Lcom/google/inject/internal/ContextualCallable;)Ljava/lang/Object;

    move-result-object v2

    .line 984
    .local v2, "t":Ljava/lang/Object;, "TT;"
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/google/inject/internal/Errors;->throwIfNewErrors(I)V
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 985
    return-object v2

    .line 986
    .end local v2    # "t":Ljava/lang/Object;, "TT;"
    :catch_0
    move-exception v0

    .line 987
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    new-instance v3, Lcom/google/inject/ProvisionException;

    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/inject/internal/Errors;->getMessages()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/google/inject/ProvisionException;-><init>(Ljava/lang/Iterable;)V

    throw v3
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 992
    iget-object v0, p0, Lcom/google/inject/internal/InjectorImpl$4;->val$factory:Lcom/google/inject/internal/InternalFactory;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
