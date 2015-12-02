.class Lcom/facebook/d/a/c;
.super Lcom/facebook/inject/d;
.source "DatabaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/d/b/a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/d/a/b;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/d/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/d/b/a;
    .locals 3

    .prologue
    .line 29
    new-instance v1, Lcom/facebook/d/b/a;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/d/a/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-class v0, Lcom/facebook/common/process/c;

    invoke-virtual {p0, v0}, Lcom/facebook/d/a/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/process/c;

    invoke-direct {v1, v2, v0}, Lcom/facebook/d/b/a;-><init>(Ljava/lang/String;Lcom/facebook/common/process/c;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 24
    invoke-virtual {p0}, Lcom/facebook/d/a/c;->a()Lcom/facebook/d/b/a;

    move-result-object v0

    return-object v0
.end method
