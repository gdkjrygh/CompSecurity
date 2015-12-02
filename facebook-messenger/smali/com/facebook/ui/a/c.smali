.class Lcom/facebook/ui/a/c;
.super Lcom/facebook/inject/d;
.source "AnimationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/a/d;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/a/b;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/ui/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/a/d;
    .locals 1

    .prologue
    .line 25
    new-instance v0, Lcom/facebook/ui/a/d;

    invoke-direct {v0}, Lcom/facebook/ui/a/d;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 21
    invoke-virtual {p0}, Lcom/facebook/ui/a/c;->a()Lcom/facebook/ui/a/d;

    move-result-object v0

    return-object v0
.end method
