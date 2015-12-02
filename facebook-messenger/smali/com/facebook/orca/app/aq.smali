.class Lcom/facebook/orca/app/aq;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/compose/ao;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 2107
    iput-object p1, p0, Lcom/facebook/orca/app/aq;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 2107
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/aq;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/compose/ao;
    .locals 3

    .prologue
    .line 2112
    new-instance v2, Lcom/facebook/orca/compose/ao;

    invoke-virtual {p0}, Lcom/facebook/orca/app/aq;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/c/s;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/aq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/c/s;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/compose/ao;-><init>(Landroid/content/Context;Lcom/facebook/c/s;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2107
    invoke-virtual {p0}, Lcom/facebook/orca/app/aq;->a()Lcom/facebook/orca/compose/ao;

    move-result-object v0

    return-object v0
.end method
