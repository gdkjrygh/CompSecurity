.class Lcom/google/inject/internal/InjectorImpl$InjectorOptions;
.super Ljava/lang/Object;
.source "InjectorImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/InjectorImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "InjectorOptions"
.end annotation


# instance fields
.field final disableCircularProxies:Z

.field final jitDisabled:Z

.field final stage:Lcom/google/inject/Stage;


# direct methods
.method constructor <init>(Lcom/google/inject/Stage;ZZ)V
    .locals 0
    .param p1, "stage"    # Lcom/google/inject/Stage;
    .param p2, "jitDisabled"    # Z
    .param p3, "disableCircularProxies"    # Z

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lcom/google/inject/internal/InjectorImpl$InjectorOptions;->stage:Lcom/google/inject/Stage;

    .line 77
    iput-boolean p2, p0, Lcom/google/inject/internal/InjectorImpl$InjectorOptions;->jitDisabled:Z

    .line 78
    iput-boolean p3, p0, Lcom/google/inject/internal/InjectorImpl$InjectorOptions;->disableCircularProxies:Z

    .line 79
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 83
    new-instance v0, Lcom/google/inject/internal/util/$ToStringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ToStringBuilder;-><init>(Ljava/lang/Class;)V

    const-string v1, "stage"

    iget-object v2, p0, Lcom/google/inject/internal/InjectorImpl$InjectorOptions;->stage:Lcom/google/inject/Stage;

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "jitDisabled"

    iget-boolean v2, p0, Lcom/google/inject/internal/InjectorImpl$InjectorOptions;->jitDisabled:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "disableCircularProxies"

    iget-boolean v2, p0, Lcom/google/inject/internal/InjectorImpl$InjectorOptions;->disableCircularProxies:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
