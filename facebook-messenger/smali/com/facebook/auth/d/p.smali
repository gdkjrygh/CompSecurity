.class Lcom/facebook/auth/d/p;
.super Lcom/facebook/inject/d;
.source "LoggedInUserAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/user/UserKey;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/d/b;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/d/b;)V
    .locals 0

    .prologue
    .line 169
    iput-object p1, p0, Lcom/facebook/auth/d/p;->a:Lcom/facebook/auth/d/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V
    .locals 0

    .prologue
    .line 169
    invoke-direct {p0, p1}, Lcom/facebook/auth/d/p;-><init>(Lcom/facebook/auth/d/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/UserKey;
    .locals 3

    .prologue
    .line 173
    const-class v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 174
    if-eqz v0, :cond_0

    new-instance v1, Lcom/facebook/user/UserKey;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 169
    invoke-virtual {p0}, Lcom/facebook/auth/d/p;->a()Lcom/facebook/user/UserKey;

    move-result-object v0

    return-object v0
.end method
