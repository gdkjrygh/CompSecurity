.class Lcom/google/inject/internal/InjectorShell$RootModule;
.super Ljava/lang/Object;
.source "InjectorShell.java"

# interfaces
.implements Lcom/google/inject/Module;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/InjectorShell;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "RootModule"
.end annotation


# instance fields
.field final stage:Lcom/google/inject/Stage;


# direct methods
.method private constructor <init>(Lcom/google/inject/Stage;)V
    .locals 1
    .param p1, "stage"    # Lcom/google/inject/Stage;

    .prologue
    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 271
    const-string v0, "stage"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/Stage;

    iput-object v0, p0, Lcom/google/inject/internal/InjectorShell$RootModule;->stage:Lcom/google/inject/Stage;

    .line 272
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/inject/Stage;Lcom/google/inject/internal/InjectorShell$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/inject/Stage;
    .param p2, "x1"    # Lcom/google/inject/internal/InjectorShell$1;

    .prologue
    .line 267
    invoke-direct {p0, p1}, Lcom/google/inject/internal/InjectorShell$RootModule;-><init>(Lcom/google/inject/Stage;)V

    return-void
.end method


# virtual methods
.method public configure(Lcom/google/inject/Binder;)V
    .locals 2
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 275
    sget-object v0, Lcom/google/inject/internal/util/$SourceProvider;->UNKNOWN_SOURCE:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object p1

    .line 276
    const-class v0, Lcom/google/inject/Stage;

    invoke-interface {p1, v0}, Lcom/google/inject/Binder;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/internal/InjectorShell$RootModule;->stage:Lcom/google/inject/Stage;

    invoke-interface {v0, v1}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toInstance(Ljava/lang/Object;)V

    .line 277
    const-class v0, Lcom/google/inject/Singleton;

    sget-object v1, Lcom/google/inject/Scopes;->SINGLETON:Lcom/google/inject/Scope;

    invoke-interface {p1, v0, v1}, Lcom/google/inject/Binder;->bindScope(Ljava/lang/Class;Lcom/google/inject/Scope;)V

    .line 278
    const-class v0, Ljavax/inject/Singleton;

    sget-object v1, Lcom/google/inject/Scopes;->SINGLETON:Lcom/google/inject/Scope;

    invoke-interface {p1, v0, v1}, Lcom/google/inject/Binder;->bindScope(Ljava/lang/Class;Lcom/google/inject/Scope;)V

    .line 279
    return-void
.end method
