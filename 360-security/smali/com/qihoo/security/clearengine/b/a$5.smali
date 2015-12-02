.class Lcom/qihoo/security/clearengine/b/a$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/clearengine/b/a;->a(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/b/a$5;->a:Landroid/content/Context;

    .line 1553
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public query(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .prologue
    .line 1556
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1557
    const-class v1, Lcom/qihoo360/i/v1/main/pt/IPtManager;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1559
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/b;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$5;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/clearengine/sdk/a/b;-><init>(Landroid/content/Context;)V

    .line 1574
    :goto_0
    return-object v0

    .line 1560
    :cond_0
    const-class v1, Lcom/qihoo360/mobilesafe/opti/i/plugins/ISharedPreferences;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1562
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/c;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$5;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/clearengine/sdk/a/c;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 1563
    :cond_1
    const-class v1, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanProcess;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1565
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/a;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$5;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/clearengine/sdk/a/a;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 1566
    :cond_2
    const-class v1, Lcom/qihoo360/mobilesafe/opti/i/plugins/IUpdate;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1573
    const-string/jumbo v1, "FunctionManagerImpl"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "query interface is not supported "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1574
    const/4 v0, 0x0

    goto :goto_0
.end method
