.class Lcom/facebook/auth/d/t;
.super Lcom/facebook/inject/d;
.source "LoggedInUserSessionManagerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/b/d;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/d/r;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/auth/d/t;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/b/d;
    .locals 5

    .prologue
    .line 52
    new-instance v4, Lcom/facebook/auth/b/d;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Lcom/facebook/auth/viewercontext/d;

    invoke-virtual {p0, v1}, Lcom/facebook/auth/d/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/viewercontext/d;

    const-class v2, Lcom/facebook/user/ac;

    invoke-virtual {p0, v2}, Lcom/facebook/auth/d/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/user/ac;

    const-class v3, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v3}, Lcom/facebook/auth/d/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/e/h;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/auth/b/d;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/auth/viewercontext/d;Lcom/facebook/user/ac;Lcom/facebook/common/e/h;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p0}, Lcom/facebook/auth/d/t;->a()Lcom/facebook/auth/b/d;

    move-result-object v0

    return-object v0
.end method
