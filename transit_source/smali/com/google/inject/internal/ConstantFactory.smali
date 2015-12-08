.class final Lcom/google/inject/internal/ConstantFactory;
.super Ljava/lang/Object;
.source "ConstantFactory.java"

# interfaces
.implements Lcom/google/inject/internal/InternalFactory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/InternalFactory",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final initializable:Lcom/google/inject/internal/Initializable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/Initializable",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/inject/internal/Initializable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Initializable",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 29
    .local p0, "this":Lcom/google/inject/internal/ConstantFactory;, "Lcom/google/inject/internal/ConstantFactory<TT;>;"
    .local p1, "initializable":Lcom/google/inject/internal/Initializable;, "Lcom/google/inject/internal/Initializable<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/google/inject/internal/ConstantFactory;->initializable:Lcom/google/inject/internal/Initializable;

    .line 31
    return-void
.end method


# virtual methods
.method public get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;
    .locals 1
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
    .line 35
    .local p0, "this":Lcom/google/inject/internal/ConstantFactory;, "Lcom/google/inject/internal/ConstantFactory<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ConstantFactory;->initializable:Lcom/google/inject/internal/Initializable;

    invoke-interface {v0, p1}, Lcom/google/inject/internal/Initializable;->get(Lcom/google/inject/internal/Errors;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 39
    .local p0, "this":Lcom/google/inject/internal/ConstantFactory;, "Lcom/google/inject/internal/ConstantFactory<TT;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ToStringBuilder;

    const-class v1, Lcom/google/inject/internal/ConstantFactory;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ToStringBuilder;-><init>(Ljava/lang/Class;)V

    const-string v1, "value"

    iget-object v2, p0, Lcom/google/inject/internal/ConstantFactory;->initializable:Lcom/google/inject/internal/Initializable;

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
