.class public Lcom/facebook/fdlimit/a;
.super Ljava/lang/Object;
.source "FdLimitOverride.java"


# static fields
.field public static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-class v0, Lcom/facebook/fdlimit/a;

    sput-object v0, Lcom/facebook/fdlimit/a;->a:Ljava/lang/Class;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 27
    sget-object v1, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-static {v1}, Lcom/facebook/e/a;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Landroid/os/Build;->CPU_ABI2:Ljava/lang/String;

    invoke-static {v1}, Lcom/facebook/e/a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 30
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/facebook/fdlimit/FdLimitNative;->getHardFdLimit()I

    move-result v1

    invoke-static {}, Lcom/facebook/fdlimit/FdLimitNative;->getHardFdLimit()I

    move-result v2

    invoke-static {v1, v2}, Lcom/facebook/fdlimit/FdLimitNative;->setFdLimit(II)V

    .line 32
    sget-object v1, Lcom/facebook/fdlimit/a;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fd limit now "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/facebook/fdlimit/FdLimitNative;->getSoftFdLimit()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/facebook/fdlimit/FdLimitNative;->getHardFdLimit()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    const/4 v0, 0x1

    .line 42
    :cond_1
    :goto_0
    return v0

    .line 35
    :catch_0
    move-exception v1

    goto :goto_0
.end method
