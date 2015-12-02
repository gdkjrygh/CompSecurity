.class Lcom/facebook/orca/app/as;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/images/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1262
    iput-object p1, p0, Lcom/facebook/orca/app/as;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1262
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/as;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/images/i;
    .locals 3

    .prologue
    .line 1266
    new-instance v2, Lcom/facebook/orca/images/i;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/as;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Landroid/view/LayoutInflater;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/as;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/images/i;-><init>(Landroid/content/Context;Landroid/view/LayoutInflater;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1262
    invoke-virtual {p0}, Lcom/facebook/orca/app/as;->a()Lcom/facebook/orca/images/i;

    move-result-object v0

    return-object v0
.end method
