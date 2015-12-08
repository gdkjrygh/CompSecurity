.class public final Lcom/google/inject/spi/MembersInjectorLookup;
.super Ljava/lang/Object;
.source "MembersInjectorLookup.java"

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
.field private delegate:Lcom/google/inject/MembersInjector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/MembersInjector",
            "<TT;>;"
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
.method public constructor <init>(Ljava/lang/Object;Lcom/google/inject/TypeLiteral;)V
    .locals 1
    .param p1, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/spi/MembersInjectorLookup;, "Lcom/google/inject/spi/MembersInjectorLookup<TT;>;"
    .local p2, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const-string v0, "source"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/spi/MembersInjectorLookup;->source:Ljava/lang/Object;

    .line 43
    const-string v0, "type"

    invoke-static {p2, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/TypeLiteral;

    iput-object v0, p0, Lcom/google/inject/spi/MembersInjectorLookup;->type:Lcom/google/inject/TypeLiteral;

    .line 44
    return-void
.end method

.method static synthetic access$000(Lcom/google/inject/spi/MembersInjectorLookup;)Lcom/google/inject/MembersInjector;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/spi/MembersInjectorLookup;

    .prologue
    .line 35
    iget-object v0, p0, Lcom/google/inject/spi/MembersInjectorLookup;->delegate:Lcom/google/inject/MembersInjector;

    return-object v0
.end method

.method static synthetic access$100(Lcom/google/inject/spi/MembersInjectorLookup;)Lcom/google/inject/TypeLiteral;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/spi/MembersInjectorLookup;

    .prologue
    .line 35
    iget-object v0, p0, Lcom/google/inject/spi/MembersInjectorLookup;->type:Lcom/google/inject/TypeLiteral;

    return-object v0
.end method


# virtual methods
.method public acceptVisitor(Lcom/google/inject/spi/ElementVisitor;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/ElementVisitor",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 58
    .local p0, "this":Lcom/google/inject/spi/MembersInjectorLookup;, "Lcom/google/inject/spi/MembersInjectorLookup<TT;>;"
    .local p1, "visitor":Lcom/google/inject/spi/ElementVisitor;, "Lcom/google/inject/spi/ElementVisitor<TT;>;"
    invoke-interface {p1, p0}, Lcom/google/inject/spi/ElementVisitor;->visit(Lcom/google/inject/spi/MembersInjectorLookup;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public applyTo(Lcom/google/inject/Binder;)V
    .locals 2
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 72
    .local p0, "this":Lcom/google/inject/spi/MembersInjectorLookup;, "Lcom/google/inject/spi/MembersInjectorLookup<TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/spi/MembersInjectorLookup;->getSource()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/spi/MembersInjectorLookup;->type:Lcom/google/inject/TypeLiteral;

    invoke-interface {v0, v1}, Lcom/google/inject/Binder;->getMembersInjector(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/MembersInjector;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/spi/MembersInjectorLookup;->initializeDelegate(Lcom/google/inject/MembersInjector;)V

    .line 73
    return-void
.end method

.method public getDelegate()Lcom/google/inject/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/MembersInjector",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 81
    .local p0, "this":Lcom/google/inject/spi/MembersInjectorLookup;, "Lcom/google/inject/spi/MembersInjectorLookup<TT;>;"
    iget-object v0, p0, Lcom/google/inject/spi/MembersInjectorLookup;->delegate:Lcom/google/inject/MembersInjector;

    return-object v0
.end method

.method public getMembersInjector()Lcom/google/inject/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/MembersInjector",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 90
    .local p0, "this":Lcom/google/inject/spi/MembersInjectorLookup;, "Lcom/google/inject/spi/MembersInjectorLookup<TT;>;"
    new-instance v0, Lcom/google/inject/spi/MembersInjectorLookup$1;

    invoke-direct {v0, p0}, Lcom/google/inject/spi/MembersInjectorLookup$1;-><init>(Lcom/google/inject/spi/MembersInjectorLookup;)V

    return-object v0
.end method

.method public getSource()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    .local p0, "this":Lcom/google/inject/spi/MembersInjectorLookup;, "Lcom/google/inject/spi/MembersInjectorLookup<TT;>;"
    iget-object v0, p0, Lcom/google/inject/spi/MembersInjectorLookup;->source:Ljava/lang/Object;

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
    .line 54
    .local p0, "this":Lcom/google/inject/spi/MembersInjectorLookup;, "Lcom/google/inject/spi/MembersInjectorLookup<TT;>;"
    iget-object v0, p0, Lcom/google/inject/spi/MembersInjectorLookup;->type:Lcom/google/inject/TypeLiteral;

    return-object v0
.end method

.method public initializeDelegate(Lcom/google/inject/MembersInjector;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/MembersInjector",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 67
    .local p0, "this":Lcom/google/inject/spi/MembersInjectorLookup;, "Lcom/google/inject/spi/MembersInjectorLookup<TT;>;"
    .local p1, "delegate":Lcom/google/inject/MembersInjector;, "Lcom/google/inject/MembersInjector<TT;>;"
    iget-object v0, p0, Lcom/google/inject/spi/MembersInjectorLookup;->delegate:Lcom/google/inject/MembersInjector;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "delegate already initialized"

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 68
    const-string v0, "delegate"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/MembersInjector;

    iput-object v0, p0, Lcom/google/inject/spi/MembersInjectorLookup;->delegate:Lcom/google/inject/MembersInjector;

    .line 69
    return-void

    .line 67
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
