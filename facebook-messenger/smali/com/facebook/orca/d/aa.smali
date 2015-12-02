.class Lcom/facebook/orca/d/aa;
.super Lcom/facebook/inject/d;
.source "AudioModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/d/aw;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/s;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/d/s;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/facebook/orca/d/aa;->a:Lcom/facebook/orca/d/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V
    .locals 0

    .prologue
    .line 152
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/aa;-><init>(Lcom/facebook/orca/d/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/d/aw;
    .locals 3

    .prologue
    .line 157
    new-instance v2, Lcom/facebook/orca/d/aw;

    const-class v0, Landroid/view/LayoutInflater;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    const-class v1, Landroid/content/res/Resources;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/d/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/Resources;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/d/aw;-><init>(Landroid/view/LayoutInflater;Landroid/content/res/Resources;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 152
    invoke-virtual {p0}, Lcom/facebook/orca/d/aa;->a()Lcom/facebook/orca/d/aw;

    move-result-object v0

    return-object v0
.end method
