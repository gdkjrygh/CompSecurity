.class Lcom/facebook/auth/login/as;
.super Lcom/facebook/inject/d;
.source "LoginModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/login/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/ap;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/login/ap;)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lcom/facebook/auth/login/as;->a:Lcom/facebook/auth/login/ap;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V
    .locals 0

    .prologue
    .line 163
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/as;-><init>(Lcom/facebook/auth/login/ap;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/login/s;
    .locals 3

    .prologue
    .line 166
    new-instance v2, Lcom/facebook/auth/login/s;

    const-class v0, Lcom/facebook/auth/login/o;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/as;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/o;

    const-class v1, Lcom/facebook/auth/login/bc;

    invoke-virtual {p0, v1}, Lcom/facebook/auth/login/as;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/login/bc;

    invoke-direct {v2, v0, v1}, Lcom/facebook/auth/login/s;-><init>(Lcom/facebook/auth/login/o;Lcom/facebook/auth/login/bc;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 163
    invoke-virtual {p0}, Lcom/facebook/auth/login/as;->a()Lcom/facebook/auth/login/s;

    move-result-object v0

    return-object v0
.end method
