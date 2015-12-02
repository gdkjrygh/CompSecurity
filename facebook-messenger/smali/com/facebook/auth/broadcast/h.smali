.class Lcom/facebook/auth/broadcast/h;
.super Lcom/facebook/inject/d;
.source "CrossProcessAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/broadcast/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/broadcast/d;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/broadcast/d;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/facebook/auth/broadcast/h;->a:Lcom/facebook/auth/broadcast/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/broadcast/d;Lcom/facebook/auth/broadcast/e;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lcom/facebook/auth/broadcast/h;-><init>(Lcom/facebook/auth/broadcast/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/broadcast/l;
    .locals 5

    .prologue
    .line 72
    new-instance v4, Lcom/facebook/auth/broadcast/l;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/base/j;

    invoke-virtual {p0, v1}, Lcom/facebook/auth/broadcast/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/base/j;

    const-class v2, Lcom/facebook/config/a/d;

    invoke-virtual {p0, v2}, Lcom/facebook/auth/broadcast/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/config/a/d;

    const-class v3, Lcom/facebook/c/l;

    invoke-virtual {p0, v3}, Lcom/facebook/auth/broadcast/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/c/l;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/auth/broadcast/l;-><init>(Landroid/content/Context;Lcom/facebook/base/j;Lcom/facebook/config/a/d;Lcom/facebook/c/l;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 68
    invoke-virtual {p0}, Lcom/facebook/auth/broadcast/h;->a()Lcom/facebook/auth/broadcast/l;

    move-result-object v0

    return-object v0
.end method
