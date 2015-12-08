.class Lcom/google/inject/internal/InjectorImpl$2;
.super Ljava/lang/Object;
.source "InjectorImpl.java"

# interfaces
.implements Lcom/google/inject/internal/InternalFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/internal/InjectorImpl;->createProvidedByBinding(Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;Lcom/google/inject/ProvidedBy;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/BindingImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/InternalFactory",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/inject/internal/InjectorImpl;

.field final synthetic val$providerBinding:Lcom/google/inject/internal/BindingImpl;

.field final synthetic val$providerKey:Lcom/google/inject/Key;

.field final synthetic val$providerType:Ljava/lang/Class;

.field final synthetic val$rawType:Ljava/lang/Class;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Lcom/google/inject/internal/BindingImpl;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 680
    iput-object p1, p0, Lcom/google/inject/internal/InjectorImpl$2;->this$0:Lcom/google/inject/internal/InjectorImpl;

    iput-object p2, p0, Lcom/google/inject/internal/InjectorImpl$2;->val$providerKey:Lcom/google/inject/Key;

    iput-object p3, p0, Lcom/google/inject/internal/InjectorImpl$2;->val$providerBinding:Lcom/google/inject/internal/BindingImpl;

    iput-object p4, p0, Lcom/google/inject/internal/InjectorImpl$2;->val$rawType:Ljava/lang/Class;

    iput-object p5, p0, Lcom/google/inject/internal/InjectorImpl$2;->val$providerType:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;
    .locals 6
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p2, "context"    # Lcom/google/inject/internal/InternalContext;
    .param p3, "dependency"    # Lcom/google/inject/spi/Dependency;
    .param p4, "linked"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Errors;",
            "Lcom/google/inject/internal/InternalContext;",
            "Lcom/google/inject/spi/Dependency;",
            "Z)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 683
    iget-object v4, p0, Lcom/google/inject/internal/InjectorImpl$2;->val$providerKey:Lcom/google/inject/Key;

    invoke-virtual {p1, v4}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object p1

    .line 684
    iget-object v4, p0, Lcom/google/inject/internal/InjectorImpl$2;->val$providerBinding:Lcom/google/inject/internal/BindingImpl;

    invoke-virtual {v4}, Lcom/google/inject/internal/BindingImpl;->getInternalFactory()Lcom/google/inject/internal/InternalFactory;

    move-result-object v4

    const/4 v5, 0x1

    invoke-interface {v4, p1, p2, p3, v5}, Lcom/google/inject/internal/InternalFactory;->get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/inject/Provider;

    .line 687
    .local v2, "provider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<*>;"
    :try_start_0
    invoke-interface {v2}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    .line 688
    .local v1, "o":Ljava/lang/Object;
    if-eqz v1, :cond_0

    iget-object v4, p0, Lcom/google/inject/internal/InjectorImpl$2;->val$rawType:Ljava/lang/Class;

    invoke-virtual {v4, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 689
    iget-object v4, p0, Lcom/google/inject/internal/InjectorImpl$2;->val$providerType:Ljava/lang/Class;

    iget-object v5, p0, Lcom/google/inject/internal/InjectorImpl$2;->val$rawType:Ljava/lang/Class;

    invoke-virtual {p1, v4, v5}, Lcom/google/inject/internal/Errors;->subtypeNotProvided(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/internal/Errors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/inject/internal/Errors;->toException()Lcom/google/inject/internal/ErrorsException;

    move-result-object v4

    throw v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 694
    .end local v1    # "o":Ljava/lang/Object;
    :catch_0
    move-exception v0

    .line 695
    .local v0, "e":Ljava/lang/RuntimeException;
    invoke-virtual {p1, v0}, Lcom/google/inject/internal/Errors;->errorInProvider(Ljava/lang/RuntimeException;)Lcom/google/inject/internal/Errors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/inject/internal/Errors;->toException()Lcom/google/inject/internal/ErrorsException;

    move-result-object v4

    throw v4

    .line 692
    .end local v0    # "e":Ljava/lang/RuntimeException;
    .restart local v1    # "o":Ljava/lang/Object;
    :cond_0
    move-object v3, v1

    .line 693
    .local v3, "t":Ljava/lang/Object;, "TT;"
    return-object v3
.end method
