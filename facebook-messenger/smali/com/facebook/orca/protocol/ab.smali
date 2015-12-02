.class Lcom/facebook/orca/protocol/ab;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/a/k;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 445
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 445
    invoke-direct {p0}, Lcom/facebook/orca/protocol/ab;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/a/k;
    .locals 2

    .prologue
    .line 450
    new-instance v1, Lcom/facebook/orca/a/k;

    const-class v0, Lcom/facebook/abtest/qe/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/c;

    invoke-direct {v1, v0}, Lcom/facebook/orca/a/k;-><init>(Lcom/facebook/abtest/qe/c;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 445
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/ab;->a()Lcom/facebook/orca/a/k;

    move-result-object v0

    return-object v0
.end method
