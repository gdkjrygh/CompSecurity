.class public abstract Lcom/facebook/config/server/h;
.super Ljava/lang/Object;
.source "DelegatingPlatformAppHttpConfig.java"

# interfaces
.implements Lcom/facebook/http/c/i;


# instance fields
.field private final a:Lcom/facebook/http/c/i;


# direct methods
.method public constructor <init>(Lcom/facebook/http/c/i;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/config/server/h;->a:Lcom/facebook/http/c/i;

    .line 19
    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri$Builder;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/config/server/h;->a:Lcom/facebook/http/c/i;

    invoke-interface {v0}, Lcom/facebook/http/c/i;->a()Landroid/net/Uri$Builder;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroid/net/Uri$Builder;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/config/server/h;->a:Lcom/facebook/http/c/i;

    invoke-interface {v0}, Lcom/facebook/http/c/i;->b()Landroid/net/Uri$Builder;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/net/Uri$Builder;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/config/server/h;->a:Lcom/facebook/http/c/i;

    invoke-interface {v0}, Lcom/facebook/http/c/i;->c()Landroid/net/Uri$Builder;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/net/Uri$Builder;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/config/server/h;->a:Lcom/facebook/http/c/i;

    invoke-interface {v0}, Lcom/facebook/http/c/i;->d()Landroid/net/Uri$Builder;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/config/server/h;->a:Lcom/facebook/http/c/i;

    invoke-interface {v0}, Lcom/facebook/http/c/i;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/config/server/h;->a:Lcom/facebook/http/c/i;

    invoke-interface {v0}, Lcom/facebook/http/c/i;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
