.class final Lcom/google/inject/internal/InjectorShell;
.super Ljava/lang/Object;
.source "InjectorShell.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/InjectorShell$1;,
        Lcom/google/inject/internal/InjectorShell$RootModule;,
        Lcom/google/inject/internal/InjectorShell$LoggerFactory;,
        Lcom/google/inject/internal/InjectorShell$InjectorFactory;,
        Lcom/google/inject/internal/InjectorShell$Builder;
    }
.end annotation


# instance fields
.field private final elements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;"
        }
    .end annotation
.end field

.field private final injector:Lcom/google/inject/internal/InjectorImpl;


# direct methods
.method private constructor <init>(Lcom/google/inject/internal/InjectorShell$Builder;Ljava/util/List;Lcom/google/inject/internal/InjectorImpl;)V
    .locals 0
    .param p1, "builder"    # Lcom/google/inject/internal/InjectorShell$Builder;
    .param p3, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorShell$Builder;",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;",
            "Lcom/google/inject/internal/InjectorImpl;",
            ")V"
        }
    .end annotation

    .prologue
    .line 54
    .local p2, "elements":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/Element;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p2, p0, Lcom/google/inject/internal/InjectorShell;->elements:Ljava/util/List;

    .line 56
    iput-object p3, p0, Lcom/google/inject/internal/InjectorShell;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 57
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/inject/internal/InjectorShell$Builder;Ljava/util/List;Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/InjectorShell$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/inject/internal/InjectorShell$Builder;
    .param p2, "x1"    # Ljava/util/List;
    .param p3, "x2"    # Lcom/google/inject/internal/InjectorImpl;
    .param p4, "x3"    # Lcom/google/inject/internal/InjectorShell$1;

    .prologue
    .line 49
    invoke-direct {p0, p1, p2, p3}, Lcom/google/inject/internal/InjectorShell;-><init>(Lcom/google/inject/internal/InjectorShell$Builder;Ljava/util/List;Lcom/google/inject/internal/InjectorImpl;)V

    return-void
.end method

.method static synthetic access$100(Lcom/google/inject/internal/InjectorImpl;)V
    .locals 0
    .param p0, "x0"    # Lcom/google/inject/internal/InjectorImpl;

    .prologue
    .line 49
    invoke-static {p0}, Lcom/google/inject/internal/InjectorShell;->bindInjector(Lcom/google/inject/internal/InjectorImpl;)V

    return-void
.end method

.method static synthetic access$200(Lcom/google/inject/internal/InjectorImpl;)V
    .locals 0
    .param p0, "x0"    # Lcom/google/inject/internal/InjectorImpl;

    .prologue
    .line 49
    invoke-static {p0}, Lcom/google/inject/internal/InjectorShell;->bindLogger(Lcom/google/inject/internal/InjectorImpl;)V

    return-void
.end method

.method private static bindInjector(Lcom/google/inject/internal/InjectorImpl;)V
    .locals 9
    .param p0, "injector"    # Lcom/google/inject/internal/InjectorImpl;

    .prologue
    .line 208
    const-class v0, Lcom/google/inject/Injector;

    invoke-static {v0}, Lcom/google/inject/Key;->get(Ljava/lang/Class;)Lcom/google/inject/Key;

    move-result-object v2

    .line 209
    .local v2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<Lcom/google/inject/Injector;>;"
    new-instance v4, Lcom/google/inject/internal/InjectorShell$InjectorFactory;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/google/inject/internal/InjectorShell$InjectorFactory;-><init>(Lcom/google/inject/Injector;Lcom/google/inject/internal/InjectorShell$1;)V

    .line 210
    .local v4, "injectorFactory":Lcom/google/inject/internal/InjectorShell$InjectorFactory;
    iget-object v8, p0, Lcom/google/inject/internal/InjectorImpl;->state:Lcom/google/inject/internal/State;

    new-instance v0, Lcom/google/inject/internal/ProviderInstanceBindingImpl;

    sget-object v3, Lcom/google/inject/internal/util/$SourceProvider;->UNKNOWN_SOURCE:Ljava/lang/Object;

    sget-object v5, Lcom/google/inject/internal/Scoping;->UNSCOPED:Lcom/google/inject/internal/Scoping;

    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableSet;->of()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v7

    move-object v1, p0

    move-object v6, v4

    invoke-direct/range {v0 .. v7}, Lcom/google/inject/internal/ProviderInstanceBindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;Lcom/google/inject/Provider;Ljava/util/Set;)V

    invoke-interface {v8, v2, v0}, Lcom/google/inject/internal/State;->putBinding(Lcom/google/inject/Key;Lcom/google/inject/internal/BindingImpl;)V

    .line 214
    return-void
.end method

.method private static bindLogger(Lcom/google/inject/internal/InjectorImpl;)V
    .locals 9
    .param p0, "injector"    # Lcom/google/inject/internal/InjectorImpl;

    .prologue
    .line 242
    const-class v0, Ljava/util/logging/Logger;

    invoke-static {v0}, Lcom/google/inject/Key;->get(Ljava/lang/Class;)Lcom/google/inject/Key;

    move-result-object v2

    .line 243
    .local v2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<Ljava/util/logging/Logger;>;"
    new-instance v4, Lcom/google/inject/internal/InjectorShell$LoggerFactory;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/google/inject/internal/InjectorShell$LoggerFactory;-><init>(Lcom/google/inject/internal/InjectorShell$1;)V

    .line 244
    .local v4, "loggerFactory":Lcom/google/inject/internal/InjectorShell$LoggerFactory;
    iget-object v8, p0, Lcom/google/inject/internal/InjectorImpl;->state:Lcom/google/inject/internal/State;

    new-instance v0, Lcom/google/inject/internal/ProviderInstanceBindingImpl;

    sget-object v3, Lcom/google/inject/internal/util/$SourceProvider;->UNKNOWN_SOURCE:Ljava/lang/Object;

    sget-object v5, Lcom/google/inject/internal/Scoping;->UNSCOPED:Lcom/google/inject/internal/Scoping;

    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableSet;->of()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v7

    move-object v1, p0

    move-object v6, v4

    invoke-direct/range {v0 .. v7}, Lcom/google/inject/internal/ProviderInstanceBindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;Lcom/google/inject/Provider;Ljava/util/Set;)V

    invoke-interface {v8, v2, v0}, Lcom/google/inject/internal/State;->putBinding(Lcom/google/inject/Key;Lcom/google/inject/internal/BindingImpl;)V

    .line 248
    return-void
.end method


# virtual methods
.method getElements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;"
        }
    .end annotation

    .prologue
    .line 64
    iget-object v0, p0, Lcom/google/inject/internal/InjectorShell;->elements:Ljava/util/List;

    return-object v0
.end method

.method getInjector()Lcom/google/inject/internal/InjectorImpl;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/inject/internal/InjectorShell;->injector:Lcom/google/inject/internal/InjectorImpl;

    return-object v0
.end method
