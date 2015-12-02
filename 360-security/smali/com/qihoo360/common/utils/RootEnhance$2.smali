.class Lcom/qihoo360/common/utils/RootEnhance$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/common/utils/RootEnhance;->rebootSystemIngnoreResult(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field private final synthetic b:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/common/utils/RootEnhance$2;->b:Landroid/content/Context;

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const-string/jumbo v0, "app_process"

    iput-object v0, p0, Lcom/qihoo360/common/utils/RootEnhance$2;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    .line 67
    const/4 v0, 0x2

    new-array v6, v0, [Ljava/lang/Object;

    .line 68
    const/4 v0, 0x0

    .line 71
    :try_start_0
    const-string/jumbo v1, "app_process"

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 72
    iget-object v2, p0, Lcom/qihoo360/common/utils/RootEnhance$2;->b:Landroid/content/Context;

    invoke-static {v2, v6}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;[Ljava/lang/Object;)Lcom/qihoo360/mobilesafe/support/a/f;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 73
    if-eqz v0, :cond_0

    :try_start_1
    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/support/a/b;->a()Z

    move-result v2

    if-nez v2, :cond_2

    const-wide/16 v2, 0x7530

    invoke-interface {v0, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/b;->a(J)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v2

    if-nez v2, :cond_2

    .line 89
    :cond_0
    if-eqz v0, :cond_1

    .line 90
    iget-object v0, p0, Lcom/qihoo360/common/utils/RootEnhance$2;->b:Landroid/content/Context;

    invoke-static {v0, v6}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;[Ljava/lang/Object;)V

    .line 93
    :cond_1
    :goto_0
    return-void

    .line 76
    :cond_2
    :try_start_2
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    const-string/jumbo v3, "com.qihoo360.RFS"

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    const-string/jumbo v3, "-reboot"

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 82
    new-instance v4, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "CLASSPATH="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/qihoo360/common/utils/RootEnhance$2;->b:Landroid/content/Context;

    invoke-static {v5}, Lcom/qihoo360/mobilesafe/support/a;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    const-string/jumbo v4, "app_process"

    invoke-static {v1, v4}, Lcom/qihoo360/common/utils/Utils;->pathAppend(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-wide/16 v4, 0x0

    .line 83
    invoke-static/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a;->a(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    if-eqz v0, :cond_1

    .line 90
    iget-object v0, p0, Lcom/qihoo360/common/utils/RootEnhance$2;->b:Landroid/content/Context;

    invoke-static {v0, v6}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;[Ljava/lang/Object;)V

    goto :goto_0

    .line 86
    :catch_0
    move-exception v1

    .line 89
    if-eqz v0, :cond_1

    .line 90
    iget-object v0, p0, Lcom/qihoo360/common/utils/RootEnhance$2;->b:Landroid/content/Context;

    invoke-static {v0, v6}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;[Ljava/lang/Object;)V

    goto :goto_0

    .line 88
    :catchall_0
    move-exception v1

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    .line 89
    :goto_1
    if-eqz v1, :cond_3

    .line 90
    iget-object v1, p0, Lcom/qihoo360/common/utils/RootEnhance$2;->b:Landroid/content/Context;

    invoke-static {v1, v6}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;[Ljava/lang/Object;)V

    .line 92
    :cond_3
    throw v0

    .line 88
    :catchall_1
    move-exception v1

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_1
.end method
