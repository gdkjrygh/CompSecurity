.class Lcom/facebook/common/l/e;
.super Lcom/facebook/inject/d;
.source "ManifestModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/l/a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/l/d;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/facebook/common/l/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/l/a;
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/common/l/b;

    invoke-virtual {p0, v0}, Lcom/facebook/common/l/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/l/b;

    invoke-virtual {v0}, Lcom/facebook/common/l/b;->a()Lcom/facebook/common/l/a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 32
    invoke-virtual {p0}, Lcom/facebook/common/l/e;->a()Lcom/facebook/common/l/a;

    move-result-object v0

    return-object v0
.end method
