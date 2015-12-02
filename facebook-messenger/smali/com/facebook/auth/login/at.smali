.class Lcom/facebook/auth/login/at;
.super Lcom/facebook/inject/d;
.source "LoginModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/login/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/ap;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/login/ap;)V
    .locals 0

    .prologue
    .line 193
    iput-object p1, p0, Lcom/facebook/auth/login/at;->a:Lcom/facebook/auth/login/ap;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V
    .locals 0

    .prologue
    .line 193
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/at;-><init>(Lcom/facebook/auth/login/ap;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/login/v;
    .locals 3

    .prologue
    .line 196
    new-instance v1, Lcom/facebook/auth/login/v;

    invoke-virtual {p0}, Lcom/facebook/auth/login/at;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/a/e;->a(Landroid/content/Context;)Landroid/support/v4/a/e;

    move-result-object v2

    const-class v0, Lcom/facebook/auth/c/b;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/c/b;

    invoke-direct {v1, v2, v0}, Lcom/facebook/auth/login/v;-><init>(Landroid/support/v4/a/e;Lcom/facebook/auth/c/b;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 193
    invoke-virtual {p0}, Lcom/facebook/auth/login/at;->a()Lcom/facebook/auth/login/v;

    move-result-object v0

    return-object v0
.end method
