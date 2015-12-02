.class Lcom/facebook/orca/app/cd;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/threadlist/i;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 1487
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1487
    invoke-direct {p0}, Lcom/facebook/orca/app/cd;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threadlist/i;
    .locals 3

    .prologue
    .line 1491
    new-instance v2, Lcom/facebook/orca/threadlist/i;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/cd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Landroid/content/res/Resources;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/cd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/Resources;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/threadlist/i;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1487
    invoke-virtual {p0}, Lcom/facebook/orca/app/cd;->a()Lcom/facebook/orca/threadlist/i;

    move-result-object v0

    return-object v0
.end method
