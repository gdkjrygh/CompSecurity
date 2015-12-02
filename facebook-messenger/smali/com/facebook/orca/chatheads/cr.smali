.class Lcom/facebook/orca/chatheads/cr;
.super Lcom/facebook/inject/d;
.source "ChatHeadsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/chatheads/b/k;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 136
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/co;)V
    .locals 0

    .prologue
    .line 136
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/cr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/chatheads/b/k;
    .locals 7

    .prologue
    .line 141
    new-instance v0, Lcom/facebook/orca/chatheads/b/k;

    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/cr;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/chatheads/cr;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/chatheads/cr;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/chatheads/cr;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/prefs/shared/d;

    const-class v5, Landroid/os/Handler;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/chatheads/cr;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/Handler;

    const-class v6, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/chatheads/cr;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/e/h;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/chatheads/b/k;-><init>(Landroid/content/Context;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/prefs/shared/d;Landroid/os/Handler;Lcom/facebook/common/e/h;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 136
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cr;->a()Lcom/facebook/orca/chatheads/b/k;

    move-result-object v0

    return-object v0
.end method
