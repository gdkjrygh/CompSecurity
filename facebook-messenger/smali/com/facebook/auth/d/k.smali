.class Lcom/facebook/auth/d/k;
.super Lcom/facebook/inject/d;
.source "LoggedInUserAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/credentials/UserTokenCredentials;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/d/b;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/d/b;)V
    .locals 0

    .prologue
    .line 205
    iput-object p1, p0, Lcom/facebook/auth/d/k;->a:Lcom/facebook/auth/d/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V
    .locals 0

    .prologue
    .line 205
    invoke-direct {p0, p1}, Lcom/facebook/auth/d/k;-><init>(Lcom/facebook/auth/d/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/credentials/UserTokenCredentials;
    .locals 3

    .prologue
    .line 208
    const-class v0, Lcom/facebook/auth/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/a;

    .line 209
    invoke-interface {v0}, Lcom/facebook/auth/b/a;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    .line 210
    if-eqz v1, :cond_0

    .line 211
    new-instance v0, Lcom/facebook/auth/credentials/UserTokenCredentials;

    invoke-virtual {v1}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/facebook/auth/credentials/UserTokenCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 205
    invoke-virtual {p0}, Lcom/facebook/auth/d/k;->a()Lcom/facebook/auth/credentials/UserTokenCredentials;

    move-result-object v0

    return-object v0
.end method
