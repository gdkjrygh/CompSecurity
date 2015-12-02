.class Lcom/facebook/auth/login/au;
.super Lcom/facebook/inject/d;
.source "LoginModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/ap;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/login/ap;)V
    .locals 0

    .prologue
    .line 221
    iput-object p1, p0, Lcom/facebook/auth/login/au;->a:Lcom/facebook/auth/login/ap;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V
    .locals 0

    .prologue
    .line 221
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/au;-><init>(Lcom/facebook/auth/login/ap;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 225
    const-class v0, Lcom/facebook/auth/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/au;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/a;

    .line 226
    invoke-interface {v0}, Lcom/facebook/auth/b/a;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    .line 227
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 221
    invoke-virtual {p0}, Lcom/facebook/auth/login/au;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
