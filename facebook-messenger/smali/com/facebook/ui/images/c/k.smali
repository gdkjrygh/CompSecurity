.class Lcom/facebook/ui/images/c/k;
.super Lcom/facebook/inject/d;
.source "ImageModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/a/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/images/c/a;)V
    .locals 0

    .prologue
    .line 207
    iput-object p1, p0, Lcom/facebook/ui/images/c/k;->a:Lcom/facebook/ui/images/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/images/c/a;Lcom/facebook/ui/images/c/b;)V
    .locals 0

    .prologue
    .line 207
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/c/k;-><init>(Lcom/facebook/ui/images/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/a/g;
    .locals 1

    .prologue
    .line 211
    new-instance v0, Lcom/facebook/a/g;

    invoke-direct {v0}, Lcom/facebook/a/g;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 207
    invoke-virtual {p0}, Lcom/facebook/ui/images/c/k;->a()Lcom/facebook/a/g;

    move-result-object v0

    return-object v0
.end method
