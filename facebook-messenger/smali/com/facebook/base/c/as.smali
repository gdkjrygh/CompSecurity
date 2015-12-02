.class Lcom/facebook/base/c/as;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Landroid/content/pm/PackageInfo;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 479
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 479
    invoke-direct {p0}, Lcom/facebook/base/c/as;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/content/pm/PackageInfo;
    .locals 3

    .prologue
    .line 483
    const-class v0, Landroid/content/pm/PackageManager;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/as;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageManager;

    .line 484
    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/base/c/as;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 486
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 487
    :catch_0
    move-exception v0

    .line 488
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 479
    invoke-virtual {p0}, Lcom/facebook/base/c/as;->a()Landroid/content/pm/PackageInfo;

    move-result-object v0

    return-object v0
.end method
