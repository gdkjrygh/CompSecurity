.class Lcom/facebook/orca/g/ao;
.super Lcom/facebook/inject/d;
.source "ThreadsDbModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/g/ap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/g/ab;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/g/ab;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/facebook/orca/g/ao;->a:Lcom/facebook/orca/g/ab;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/g/ab;Lcom/facebook/orca/g/ac;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/ao;-><init>(Lcom/facebook/orca/g/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/g/ap;
    .locals 1

    .prologue
    .line 69
    new-instance v0, Lcom/facebook/orca/g/ap;

    invoke-direct {v0}, Lcom/facebook/orca/g/ap;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 65
    invoke-virtual {p0}, Lcom/facebook/orca/g/ao;->a()Lcom/facebook/orca/g/ap;

    move-result-object v0

    return-object v0
.end method
