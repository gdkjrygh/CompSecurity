.class Lcom/facebook/orca/photos/b/u;
.super Lcom/facebook/inject/d;
.source "PhotoUploadModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/photos/b/ab;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/photos/b/o;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/photos/b/o;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/facebook/orca/photos/b/u;->a:Lcom/facebook/orca/photos/b/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V
    .locals 0

    .prologue
    .line 100
    invoke-direct {p0, p1}, Lcom/facebook/orca/photos/b/u;-><init>(Lcom/facebook/orca/photos/b/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/photos/b/ab;
    .locals 2

    .prologue
    .line 104
    new-instance v1, Lcom/facebook/orca/photos/b/ab;

    const-class v0, Landroid/content/res/Resources;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    invoke-direct {v1, v0}, Lcom/facebook/orca/photos/b/ab;-><init>(Landroid/content/res/Resources;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 100
    invoke-virtual {p0}, Lcom/facebook/orca/photos/b/u;->a()Lcom/facebook/orca/photos/b/ab;

    move-result-object v0

    return-object v0
.end method
