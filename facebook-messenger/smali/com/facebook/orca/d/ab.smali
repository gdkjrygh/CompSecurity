.class Lcom/facebook/orca/d/ab;
.super Lcom/facebook/inject/d;
.source "AudioModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/d/ay;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/s;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/d/s;)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lcom/facebook/orca/d/ab;->a:Lcom/facebook/orca/d/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V
    .locals 0

    .prologue
    .line 144
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/ab;-><init>(Lcom/facebook/orca/d/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/d/ay;
    .locals 1

    .prologue
    .line 148
    new-instance v0, Lcom/facebook/orca/d/ay;

    invoke-direct {v0}, Lcom/facebook/orca/d/ay;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 144
    invoke-virtual {p0}, Lcom/facebook/orca/d/ab;->a()Lcom/facebook/orca/d/ay;

    move-result-object v0

    return-object v0
.end method
