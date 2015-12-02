.class Lcom/facebook/f/l;
.super Lcom/facebook/inject/d;
.source "GkModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/f/a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/f/k;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/f/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/f/a;
    .locals 1

    .prologue
    .line 35
    new-instance v0, Lcom/facebook/f/a;

    invoke-direct {v0}, Lcom/facebook/f/a;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0}, Lcom/facebook/f/l;->a()Lcom/facebook/f/a;

    move-result-object v0

    return-object v0
.end method
