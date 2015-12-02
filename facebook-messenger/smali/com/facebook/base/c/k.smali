.class Lcom/facebook/base/c/k;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/config/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 1046
    iput-object p1, p0, Lcom/facebook/base/c/k;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 1046
    invoke-direct {p0, p1}, Lcom/facebook/base/c/k;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/config/b/a;
    .locals 2

    .prologue
    .line 1050
    new-instance v1, Lcom/facebook/config/b/b;

    const-class v0, Landroid/content/pm/PackageInfo;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    invoke-direct {v1, v0}, Lcom/facebook/config/b/b;-><init>(Landroid/content/pm/PackageInfo;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1046
    invoke-virtual {p0}, Lcom/facebook/base/c/k;->a()Lcom/facebook/config/b/a;

    move-result-object v0

    return-object v0
.end method
