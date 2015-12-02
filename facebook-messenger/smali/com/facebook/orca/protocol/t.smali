.class Lcom/facebook/orca/protocol/t;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/t;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 301
    iput-object p1, p0, Lcom/facebook/orca/protocol/t;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 301
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/t;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/t;
    .locals 1

    .prologue
    .line 306
    new-instance v0, Lcom/facebook/orca/protocol/methods/t;

    invoke-direct {v0}, Lcom/facebook/orca/protocol/methods/t;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 301
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/t;->a()Lcom/facebook/orca/protocol/methods/t;

    move-result-object v0

    return-object v0
.end method
