.class Lcom/facebook/auth/d/s;
.super Lcom/facebook/inject/d;
.source "LoggedInUserSessionManagerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/user/User;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/d/r;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/auth/d/s;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/facebook/auth/b/d;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->d()Lcom/facebook/user/User;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0}, Lcom/facebook/auth/d/s;->a()Lcom/facebook/user/User;

    move-result-object v0

    return-object v0
.end method
