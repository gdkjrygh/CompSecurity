.class Lcom/facebook/orca/protocol/u;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/x;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 310
    iput-object p1, p0, Lcom/facebook/orca/protocol/u;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 310
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/u;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/x;
    .locals 6

    .prologue
    .line 314
    new-instance v0, Lcom/facebook/orca/protocol/methods/x;

    const-class v1, Lcom/facebook/orca/protocol/methods/aa;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/protocol/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/protocol/methods/aa;

    const-class v2, Lcom/facebook/orca/protocol/methods/ba;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/protocol/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/protocol/methods/ba;

    const-class v3, Lcom/facebook/orca/protocol/methods/c;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/protocol/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/protocol/methods/c;

    const-class v4, Lcom/facebook/orca/k/a;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/protocol/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/k/a;

    const-class v5, Lcom/facebook/orca/protocol/methods/bb;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/protocol/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/protocol/methods/bb;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/protocol/methods/x;-><init>(Lcom/facebook/orca/protocol/methods/aa;Lcom/facebook/orca/protocol/methods/ba;Lcom/facebook/orca/protocol/methods/c;Lcom/facebook/orca/k/a;Lcom/facebook/orca/protocol/methods/bb;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 310
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/u;->a()Lcom/facebook/orca/protocol/methods/x;

    move-result-object v0

    return-object v0
.end method
