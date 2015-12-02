.class Lcom/facebook/reflex/ad;
.super Lcom/facebook/inject/d;
.source "ReflexModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/reflex/Transaction;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/reflex/z;


# direct methods
.method private constructor <init>(Lcom/facebook/reflex/z;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/reflex/ad;->a:Lcom/facebook/reflex/z;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/reflex/z;Lcom/facebook/reflex/aa;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/facebook/reflex/ad;-><init>(Lcom/facebook/reflex/z;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/reflex/Transaction;
    .locals 1

    .prologue
    .line 55
    invoke-static {}, Lcom/facebook/reflex/Transaction;->a()Lcom/facebook/reflex/Transaction;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0}, Lcom/facebook/reflex/ad;->a()Lcom/facebook/reflex/Transaction;

    move-result-object v0

    return-object v0
.end method
