.class Lcom/facebook/orca/d/ac;
.super Lcom/facebook/inject/d;
.source "AudioModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/d/az;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/s;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/d/s;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lcom/facebook/orca/d/ac;->a:Lcom/facebook/orca/d/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V
    .locals 0

    .prologue
    .line 131
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/ac;-><init>(Lcom/facebook/orca/d/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/d/az;
    .locals 5

    .prologue
    .line 135
    new-instance v4, Lcom/facebook/orca/d/az;

    const-class v0, Lcom/facebook/orca/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/a;

    const-class v1, Lcom/facebook/orca/d/ay;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/d/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/d/ay;

    const-class v2, Lcom/facebook/common/executors/n;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/d/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/executors/n;

    const-class v3, Lcom/facebook/orca/d/r;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/d/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/d/r;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/orca/d/az;-><init>(Lcom/facebook/orca/d/a;Lcom/facebook/orca/d/ay;Lcom/facebook/common/executors/n;Lcom/facebook/orca/d/r;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 131
    invoke-virtual {p0}, Lcom/facebook/orca/d/ac;->a()Lcom/facebook/orca/d/az;

    move-result-object v0

    return-object v0
.end method
