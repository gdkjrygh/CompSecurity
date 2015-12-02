.class Lcom/facebook/orca/chatheads/cy;
.super Lcom/facebook/inject/d;
.source "ChatHeadsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/chatheads/eb;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 125
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/co;)V
    .locals 0

    .prologue
    .line 125
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/cy;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/chatheads/eb;
    .locals 3

    .prologue
    .line 130
    new-instance v2, Lcom/facebook/orca/chatheads/eb;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cy;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Landroid/view/WindowManager;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/cy;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/chatheads/eb;-><init>(Landroid/content/Context;Landroid/view/WindowManager;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 125
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cy;->a()Lcom/facebook/orca/chatheads/eb;

    move-result-object v0

    return-object v0
.end method
