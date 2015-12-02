.class Lcom/facebook/orca/protocol/k;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lcom/facebook/orca/protocol/k;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 218
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/k;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/j;
    .locals 2

    .prologue
    .line 222
    new-instance v1, Lcom/facebook/orca/protocol/methods/j;

    const-class v0, Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/protocol/methods/p;

    invoke-direct {v1, v0}, Lcom/facebook/orca/protocol/methods/j;-><init>(Lcom/facebook/orca/protocol/methods/p;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 218
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/k;->a()Lcom/facebook/orca/protocol/methods/j;

    move-result-object v0

    return-object v0
.end method
