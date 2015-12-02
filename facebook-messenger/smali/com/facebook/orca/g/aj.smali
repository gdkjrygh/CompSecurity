.class Lcom/facebook/orca/g/aj;
.super Lcom/facebook/inject/d;
.source "ThreadsDbModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/g/t;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/g/ab;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/g/ab;)V
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lcom/facebook/orca/g/aj;->a:Lcom/facebook/orca/g/ab;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/g/ab;Lcom/facebook/orca/g/ac;)V
    .locals 0

    .prologue
    .line 211
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/aj;-><init>(Lcom/facebook/orca/g/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/g/t;
    .locals 5

    .prologue
    .line 215
    new-instance v4, Lcom/facebook/orca/g/t;

    const-class v0, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/g/aj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/aa;

    const-class v1, Lcom/facebook/orca/g/n;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/g/aj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/g/n;

    const-class v2, Lcom/facebook/orca/g/h;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/g/aj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/g/h;

    const-class v3, Lcom/facebook/orca/g/b;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/g/aj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/g/b;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/orca/g/t;-><init>(Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/n;Lcom/facebook/orca/g/h;Lcom/facebook/orca/g/b;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 211
    invoke-virtual {p0}, Lcom/facebook/orca/g/aj;->a()Lcom/facebook/orca/g/t;

    move-result-object v0

    return-object v0
.end method
