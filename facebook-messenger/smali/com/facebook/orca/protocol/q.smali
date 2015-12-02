.class Lcom/facebook/orca/protocol/q;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 250
    iput-object p1, p0, Lcom/facebook/orca/protocol/q;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 250
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/q;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/p;
    .locals 6

    .prologue
    .line 254
    new-instance v0, Lcom/facebook/orca/protocol/methods/p;

    const-class v1, Lcom/facebook/orca/protocol/methods/bc;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/protocol/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/protocol/methods/bc;

    const-class v2, Lcom/facebook/auth/protocol/j;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/protocol/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/auth/protocol/j;

    const-class v3, Lcom/facebook/user/ac;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/protocol/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/user/ac;

    const-class v4, Lcom/facebook/orca/protocol/methods/x;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/protocol/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/protocol/methods/x;

    const-class v5, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/protocol/q;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/protocol/methods/p;-><init>(Lcom/facebook/orca/protocol/methods/bc;Lcom/facebook/auth/protocol/j;Lcom/facebook/user/ac;Lcom/facebook/orca/protocol/methods/x;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 250
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/q;->a()Lcom/facebook/orca/protocol/methods/p;

    move-result-object v0

    return-object v0
.end method
