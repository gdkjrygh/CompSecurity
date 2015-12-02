.class Lcom/facebook/ui/images/c/e;
.super Lcom/facebook/inject/d;
.source "ImageModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/images/b/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/images/c/a;)V
    .locals 0

    .prologue
    .line 167
    iput-object p1, p0, Lcom/facebook/ui/images/c/e;->a:Lcom/facebook/ui/images/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/images/c/a;Lcom/facebook/ui/images/c/b;)V
    .locals 0

    .prologue
    .line 167
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/c/e;-><init>(Lcom/facebook/ui/images/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/b/e;
    .locals 2

    .prologue
    .line 172
    new-instance v1, Lcom/facebook/ui/images/b/e;

    const-class v0, Lcom/facebook/ui/images/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/ui/images/c/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/l;

    invoke-direct {v1, v0}, Lcom/facebook/ui/images/b/e;-><init>(Lcom/facebook/ui/images/b/l;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 167
    invoke-virtual {p0}, Lcom/facebook/ui/images/c/e;->a()Lcom/facebook/ui/images/b/e;

    move-result-object v0

    return-object v0
.end method
