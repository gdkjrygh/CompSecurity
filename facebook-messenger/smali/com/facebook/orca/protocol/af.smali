.class Lcom/facebook/orca/protocol/af;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/bc;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 400
    iput-object p1, p0, Lcom/facebook/orca/protocol/af;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 400
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/af;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/bc;
    .locals 3

    .prologue
    .line 405
    new-instance v1, Lcom/facebook/orca/protocol/methods/bc;

    const-class v0, Lcom/facebook/orca/protocol/methods/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/protocol/methods/aa;

    const-class v2, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/protocol/af;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/facebook/orca/protocol/methods/bc;-><init>(Lcom/facebook/orca/protocol/methods/aa;Ljavax/inject/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 400
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/af;->a()Lcom/facebook/orca/protocol/methods/bc;

    move-result-object v0

    return-object v0
.end method
