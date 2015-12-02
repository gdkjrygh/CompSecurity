.class Lcom/facebook/orca/protocol/p;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/o;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 234
    iput-object p1, p0, Lcom/facebook/orca/protocol/p;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 234
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/p;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/o;
    .locals 2

    .prologue
    .line 238
    new-instance v1, Lcom/facebook/orca/protocol/methods/o;

    const-class v0, Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/protocol/methods/p;

    invoke-direct {v1, v0}, Lcom/facebook/orca/protocol/methods/o;-><init>(Lcom/facebook/orca/protocol/methods/p;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 234
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/p;->a()Lcom/facebook/orca/protocol/methods/o;

    move-result-object v0

    return-object v0
.end method
