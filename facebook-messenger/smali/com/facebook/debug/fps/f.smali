.class Lcom/facebook/debug/fps/f;
.super Lcom/facebook/inject/d;
.source "FPSModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/debug/fps/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/debug/fps/d;


# direct methods
.method private constructor <init>(Lcom/facebook/debug/fps/d;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/debug/fps/f;->a:Lcom/facebook/debug/fps/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/debug/fps/d;Lcom/facebook/debug/fps/e;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lcom/facebook/debug/fps/f;-><init>(Lcom/facebook/debug/fps/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/debug/fps/b;
    .locals 1

    .prologue
    .line 48
    const-class v0, Lcom/facebook/debug/fps/a;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/debug/fps/a;

    invoke-virtual {v0}, Lcom/facebook/debug/fps/a;->a()Lcom/facebook/debug/fps/b;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/facebook/debug/fps/f;->a()Lcom/facebook/debug/fps/b;

    move-result-object v0

    return-object v0
.end method
