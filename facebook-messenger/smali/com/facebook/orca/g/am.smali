.class Lcom/facebook/orca/g/am;
.super Lcom/facebook/inject/d;
.source "ThreadsDbModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/g/z;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/g/ab;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/g/ab;)V
    .locals 0

    .prologue
    .line 224
    iput-object p1, p0, Lcom/facebook/orca/g/am;->a:Lcom/facebook/orca/g/ab;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/g/ab;Lcom/facebook/orca/g/ac;)V
    .locals 0

    .prologue
    .line 224
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/am;-><init>(Lcom/facebook/orca/g/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/g/z;
    .locals 5

    .prologue
    .line 228
    new-instance v4, Lcom/facebook/orca/g/z;

    const-class v0, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/g/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/aa;

    const-class v1, Lcom/facebook/orca/g/r;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/g/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/g/r;

    const-class v2, Lcom/facebook/orca/g/g;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/g/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/g/g;

    const-class v3, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/g/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/time/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/orca/g/z;-><init>(Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/r;Lcom/facebook/orca/g/g;Lcom/facebook/common/time/a;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 224
    invoke-virtual {p0}, Lcom/facebook/orca/g/am;->a()Lcom/facebook/orca/g/z;

    move-result-object v0

    return-object v0
.end method
