.class Lcom/facebook/auth/broadcast/j;
.super Lcom/facebook/inject/d;
.source "CrossProcessAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/base/j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/broadcast/d;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/broadcast/d;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/facebook/auth/broadcast/j;->a:Lcom/facebook/auth/broadcast/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/broadcast/d;Lcom/facebook/auth/broadcast/e;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/facebook/auth/broadcast/j;-><init>(Lcom/facebook/auth/broadcast/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/base/j;
    .locals 1

    .prologue
    .line 55
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->j()Lcom/facebook/base/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0}, Lcom/facebook/auth/broadcast/j;->a()Lcom/facebook/base/j;

    move-result-object v0

    return-object v0
.end method
