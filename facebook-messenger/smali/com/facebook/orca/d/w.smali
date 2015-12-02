.class Lcom/facebook/orca/d/w;
.super Lcom/facebook/inject/d;
.source "AudioModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/d/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/s;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/d/s;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lcom/facebook/orca/d/w;->a:Lcom/facebook/orca/d/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V
    .locals 0

    .prologue
    .line 186
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/w;-><init>(Lcom/facebook/orca/d/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/d/m;
    .locals 4

    .prologue
    .line 190
    new-instance v2, Lcom/facebook/orca/d/m;

    invoke-virtual {p0}, Lcom/facebook/orca/d/w;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/media/AudioManager;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    const-class v1, Lcom/facebook/orca/d/e;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/d/w;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v1, Lcom/facebook/orca/d/bf;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/d/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/d/bf;

    invoke-direct {v2, v0, v3, v1}, Lcom/facebook/orca/d/m;-><init>(Landroid/media/AudioManager;Ljavax/inject/a;Lcom/facebook/orca/d/bf;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 186
    invoke-virtual {p0}, Lcom/facebook/orca/d/w;->a()Lcom/facebook/orca/d/m;

    move-result-object v0

    return-object v0
.end method
