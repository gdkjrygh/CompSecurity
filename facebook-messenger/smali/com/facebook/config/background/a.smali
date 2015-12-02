.class public abstract Lcom/facebook/config/background/a;
.super Ljava/lang/Object;
.source "AbstractConfigurationAndLoginComponent.java"

# interfaces
.implements Lcom/facebook/auth/a/c;
.implements Lcom/facebook/config/background/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/facebook/http/protocol/v;
.end method

.method public final b()Lcom/facebook/http/protocol/v;
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p0}, Lcom/facebook/config/background/a;->a()Lcom/facebook/http/protocol/v;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/facebook/http/protocol/v;
    .locals 1

    .prologue
    .line 17
    invoke-virtual {p0}, Lcom/facebook/config/background/a;->a()Lcom/facebook/http/protocol/v;

    move-result-object v0

    return-object v0
.end method
