.class public Lroboguice/inject/ContextScopedSystemServiceProvider;
.super Ljava/lang/Object;
.source "ContextScopedSystemServiceProvider.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/Provider",
        "<TT;>;"
    }
.end annotation


# instance fields
.field protected contextProvider:Lcom/google/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Provider",
            "<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field protected serviceName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/inject/Provider;Ljava/lang/String;)V
    .locals 0
    .param p2, "serviceName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Provider",
            "<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 27
    .local p0, "this":Lroboguice/inject/ContextScopedSystemServiceProvider;, "Lroboguice/inject/ContextScopedSystemServiceProvider<TT;>;"
    .local p1, "contextProvider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<Landroid/content/Context;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lroboguice/inject/ContextScopedSystemServiceProvider;->contextProvider:Lcom/google/inject/Provider;

    .line 29
    iput-object p2, p0, Lroboguice/inject/ContextScopedSystemServiceProvider;->serviceName:Ljava/lang/String;

    .line 30
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 34
    .local p0, "this":Lroboguice/inject/ContextScopedSystemServiceProvider;, "Lroboguice/inject/ContextScopedSystemServiceProvider<TT;>;"
    iget-object v0, p0, Lroboguice/inject/ContextScopedSystemServiceProvider;->contextProvider:Lcom/google/inject/Provider;

    invoke-interface {v0}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lroboguice/inject/ContextScopedSystemServiceProvider;->serviceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
