.class public final Lcom/google/inject/spi/InjectionRequest;
.super Ljava/lang/Object;
.source "InjectionRequest.java"

# interfaces
.implements Lcom/google/inject/spi/Element;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/spi/Element;"
    }
.end annotation


# instance fields
.field private final instance:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final source:Ljava/lang/Object;

.field private final type:Lcom/google/inject/TypeLiteral;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/google/inject/TypeLiteral;Ljava/lang/Object;)V
    .locals 1
    .param p1, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;TT;)V"
        }
    .end annotation

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/spi/InjectionRequest;, "Lcom/google/inject/spi/InjectionRequest<TT;>;"
    .local p2, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    .local p3, "instance":Ljava/lang/Object;, "TT;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const-string v0, "source"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/spi/InjectionRequest;->source:Ljava/lang/Object;

    .line 43
    const-string v0, "type"

    invoke-static {p2, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/TypeLiteral;

    iput-object v0, p0, Lcom/google/inject/spi/InjectionRequest;->type:Lcom/google/inject/TypeLiteral;

    .line 44
    const-string v0, "instance"

    invoke-static {p3, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/spi/InjectionRequest;->instance:Ljava/lang/Object;

    .line 45
    return-void
.end method


# virtual methods
.method public acceptVisitor(Lcom/google/inject/spi/ElementVisitor;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/ElementVisitor",
            "<TR;>;)TR;"
        }
    .end annotation

    .prologue
    .line 76
    .local p0, "this":Lcom/google/inject/spi/InjectionRequest;, "Lcom/google/inject/spi/InjectionRequest<TT;>;"
    .local p1, "visitor":Lcom/google/inject/spi/ElementVisitor;, "Lcom/google/inject/spi/ElementVisitor<TR;>;"
    invoke-interface {p1, p0}, Lcom/google/inject/spi/ElementVisitor;->visit(Lcom/google/inject/spi/InjectionRequest;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public applyTo(Lcom/google/inject/Binder;)V
    .locals 3
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 80
    .local p0, "this":Lcom/google/inject/spi/InjectionRequest;, "Lcom/google/inject/spi/InjectionRequest<TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/spi/InjectionRequest;->getSource()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/spi/InjectionRequest;->type:Lcom/google/inject/TypeLiteral;

    iget-object v2, p0, Lcom/google/inject/spi/InjectionRequest;->instance:Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lcom/google/inject/Binder;->requestInjection(Lcom/google/inject/TypeLiteral;Ljava/lang/Object;)V

    .line 81
    return-void
.end method

.method public getInjectionPoints()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/ConfigurationException;
        }
    .end annotation

    .prologue
    .line 72
    .local p0, "this":Lcom/google/inject/spi/InjectionRequest;, "Lcom/google/inject/spi/InjectionRequest<TT;>;"
    iget-object v0, p0, Lcom/google/inject/spi/InjectionRequest;->instance:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/spi/InjectionPoint;->forInstanceMethodsAndFields(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getInstance()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 52
    .local p0, "this":Lcom/google/inject/spi/InjectionRequest;, "Lcom/google/inject/spi/InjectionRequest<TT;>;"
    iget-object v0, p0, Lcom/google/inject/spi/InjectionRequest;->instance:Ljava/lang/Object;

    return-object v0
.end method

.method public getSource()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 48
    .local p0, "this":Lcom/google/inject/spi/InjectionRequest;, "Lcom/google/inject/spi/InjectionRequest<TT;>;"
    iget-object v0, p0, Lcom/google/inject/spi/InjectionRequest;->source:Ljava/lang/Object;

    return-object v0
.end method

.method public getType()Lcom/google/inject/TypeLiteral;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 56
    .local p0, "this":Lcom/google/inject/spi/InjectionRequest;, "Lcom/google/inject/spi/InjectionRequest<TT;>;"
    iget-object v0, p0, Lcom/google/inject/spi/InjectionRequest;->type:Lcom/google/inject/TypeLiteral;

    return-object v0
.end method
