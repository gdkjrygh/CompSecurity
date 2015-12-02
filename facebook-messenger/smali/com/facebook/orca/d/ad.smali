.class Lcom/facebook/orca/d/ad;
.super Lcom/facebook/inject/d;
.source "AudioModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/d/bf;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/s;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/d/s;)V
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lcom/facebook/orca/d/ad;->a:Lcom/facebook/orca/d/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V
    .locals 0

    .prologue
    .line 211
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/ad;-><init>(Lcom/facebook/orca/d/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/d/bf;
    .locals 3

    .prologue
    .line 216
    new-instance v1, Lcom/facebook/orca/d/bf;

    invoke-virtual {p0}, Lcom/facebook/orca/d/ad;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/media/AudioManager;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    invoke-direct {v1, v0}, Lcom/facebook/orca/d/bf;-><init>(Landroid/media/AudioManager;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 211
    invoke-virtual {p0}, Lcom/facebook/orca/d/ad;->a()Lcom/facebook/orca/d/bf;

    move-result-object v0

    return-object v0
.end method
