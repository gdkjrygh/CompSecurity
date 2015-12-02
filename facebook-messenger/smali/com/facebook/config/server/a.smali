.class public Lcom/facebook/config/server/a;
.super Ljava/lang/Object;
.source "BootstrapPlatformAppHttpConfig.java"

# interfaces
.implements Lcom/facebook/http/c/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri$Builder;
    .locals 1

    .prologue
    .line 21
    const-string v0, "https://b-api.facebook.com"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroid/net/Uri$Builder;
    .locals 1

    .prologue
    .line 26
    const-string v0, "https://b-graph.facebook.com"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/net/Uri$Builder;
    .locals 2

    .prologue
    .line 31
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "BootstrapHttpConfig should be used only for graph and api requests"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Landroid/net/Uri$Builder;
    .locals 2

    .prologue
    .line 37
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "BootstrapHttpConfig should be used only for graph and api requests"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    return-object v0
.end method
