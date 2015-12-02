.class Lcom/facebook/base/c/an;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 632
    iput-object p1, p0, Lcom/facebook/base/c/an;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 632
    invoke-direct {p0, p1}, Lcom/facebook/base/c/an;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 636
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 632
    invoke-virtual {p0}, Lcom/facebook/base/c/an;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
