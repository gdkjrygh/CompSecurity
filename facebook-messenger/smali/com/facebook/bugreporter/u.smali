.class Lcom/facebook/bugreporter/u;
.super Lcom/facebook/inject/d;
.source "BugReporterModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/bugreporter/z;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/o;


# direct methods
.method private constructor <init>(Lcom/facebook/bugreporter/o;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lcom/facebook/bugreporter/u;->a:Lcom/facebook/bugreporter/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/u;-><init>(Lcom/facebook/bugreporter/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/z;
    .locals 3

    .prologue
    .line 138
    new-instance v2, Lcom/facebook/bugreporter/z;

    const-class v0, Landroid/content/pm/PackageManager;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageManager;

    const-class v1, Lcom/facebook/common/l/b;

    invoke-virtual {p0, v1}, Lcom/facebook/bugreporter/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/l/b;

    invoke-direct {v2, v0, v1}, Lcom/facebook/bugreporter/z;-><init>(Landroid/content/pm/PackageManager;Lcom/facebook/common/l/b;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 134
    invoke-virtual {p0}, Lcom/facebook/bugreporter/u;->a()Lcom/facebook/bugreporter/z;

    move-result-object v0

    return-object v0
.end method
