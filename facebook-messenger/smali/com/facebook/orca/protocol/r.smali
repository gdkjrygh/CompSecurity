.class Lcom/facebook/orca/protocol/r;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 242
    iput-object p1, p0, Lcom/facebook/orca/protocol/r;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 242
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/r;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/s;
    .locals 2

    .prologue
    .line 246
    new-instance v1, Lcom/facebook/orca/protocol/methods/s;

    const-class v0, Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/protocol/methods/p;

    invoke-direct {v1, v0}, Lcom/facebook/orca/protocol/methods/s;-><init>(Lcom/facebook/orca/protocol/methods/p;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 242
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/r;->a()Lcom/facebook/orca/protocol/methods/s;

    move-result-object v0

    return-object v0
.end method
