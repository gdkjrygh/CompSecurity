.class Lcom/facebook/orca/d/z;
.super Lcom/facebook/inject/d;
.source "AudioModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/d/af;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/s;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/d/s;)V
    .locals 0

    .prologue
    .line 198
    iput-object p1, p0, Lcom/facebook/orca/d/z;->a:Lcom/facebook/orca/d/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V
    .locals 0

    .prologue
    .line 198
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/z;-><init>(Lcom/facebook/orca/d/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/d/af;
    .locals 6

    .prologue
    .line 202
    new-instance v0, Lcom/facebook/orca/d/af;

    const-class v1, Landroid/media/AudioManager;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/d/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/AudioManager;

    const-class v2, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/d/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/executors/a;

    const-class v3, Lcom/facebook/orca/j/c;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/d/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/j/c;

    const-class v4, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/d/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/analytics/av;

    const-class v5, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/d/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/d/af;-><init>(Landroid/media/AudioManager;Lcom/facebook/common/executors/a;Lcom/facebook/orca/j/c;Lcom/facebook/analytics/av;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 198
    invoke-virtual {p0}, Lcom/facebook/orca/d/z;->a()Lcom/facebook/orca/d/af;

    move-result-object v0

    return-object v0
.end method
