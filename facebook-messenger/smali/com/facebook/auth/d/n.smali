.class Lcom/facebook/auth/d/n;
.super Lcom/facebook/inject/d;
.source "LoggedInUserAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/viewercontext/ViewerContext;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/d/b;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/d/b;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/facebook/auth/d/n;->a:Lcom/facebook/auth/d/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V
    .locals 0

    .prologue
    .line 143
    invoke-direct {p0, p1}, Lcom/facebook/auth/d/n;-><init>(Lcom/facebook/auth/d/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 1

    .prologue
    .line 147
    const-class v0, Lcom/facebook/auth/viewercontext/e;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/n;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/e;

    invoke-interface {v0}, Lcom/facebook/auth/viewercontext/e;->c()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 143
    invoke-virtual {p0}, Lcom/facebook/auth/d/n;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    return-object v0
.end method
