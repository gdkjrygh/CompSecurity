.class Lcom/facebook/c/i;
.super Lcom/facebook/inject/d;
.source "ContentModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/c/u;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/c/e;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/facebook/c/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/c/u;
    .locals 1

    .prologue
    .line 70
    new-instance v0, Lcom/facebook/c/u;

    invoke-direct {v0}, Lcom/facebook/c/u;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/facebook/c/i;->a()Lcom/facebook/c/u;

    move-result-object v0

    return-object v0
.end method
