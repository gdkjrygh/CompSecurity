.class Lcom/facebook/auth/broadcast/f;
.super Lcom/facebook/inject/d;
.source "CrossProcessAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/c/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/broadcast/d;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/broadcast/d;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/auth/broadcast/f;->a:Lcom/facebook/auth/broadcast/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/broadcast/d;Lcom/facebook/auth/broadcast/e;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/auth/broadcast/f;-><init>(Lcom/facebook/auth/broadcast/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/c/l;
    .locals 2

    .prologue
    .line 64
    new-instance v1, Lcom/facebook/c/l;

    const-class v0, Lcom/facebook/base/j;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/j;

    invoke-direct {v1, v0}, Lcom/facebook/c/l;-><init>(Lcom/facebook/base/j;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0}, Lcom/facebook/auth/broadcast/f;->a()Lcom/facebook/c/l;

    move-result-object v0

    return-object v0
.end method
