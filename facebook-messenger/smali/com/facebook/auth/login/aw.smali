.class Lcom/facebook/auth/login/aw;
.super Lcom/facebook/inject/d;
.source "LoginModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/service/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/ap;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/login/ap;)V
    .locals 0

    .prologue
    .line 173
    iput-object p1, p0, Lcom/facebook/auth/login/aw;->a:Lcom/facebook/auth/login/ap;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V
    .locals 0

    .prologue
    .line 173
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/aw;-><init>(Lcom/facebook/auth/login/ap;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/e;
    .locals 1

    .prologue
    .line 176
    const-class v0, Lcom/facebook/auth/login/s;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/aw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/e;

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 173
    invoke-virtual {p0}, Lcom/facebook/auth/login/aw;->a()Lcom/facebook/fbservice/service/e;

    move-result-object v0

    return-object v0
.end method
