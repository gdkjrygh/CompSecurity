.class Lcom/facebook/auth/login/av;
.super Lcom/facebook/inject/d;
.source "LoginModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/protocol/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/ap;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/login/ap;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lcom/facebook/auth/login/av;->a:Lcom/facebook/auth/login/ap;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V
    .locals 0

    .prologue
    .line 202
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/av;-><init>(Lcom/facebook/auth/login/ap;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/protocol/e;
    .locals 2

    .prologue
    .line 206
    new-instance v1, Lcom/facebook/auth/protocol/e;

    const-class v0, Lcom/facebook/config/a/c;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/c;

    invoke-direct {v1, v0}, Lcom/facebook/auth/protocol/e;-><init>(Lcom/facebook/config/a/c;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 202
    invoke-virtual {p0}, Lcom/facebook/auth/login/av;->a()Lcom/facebook/auth/protocol/e;

    move-result-object v0

    return-object v0
.end method
