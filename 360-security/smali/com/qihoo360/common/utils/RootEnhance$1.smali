.class Lcom/qihoo360/common/utils/RootEnhance$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/common/utils/RootEnhance;->stopPackageIngnoreResult(Landroid/content/Context;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field private final synthetic b:Landroid/content/Context;

.field private final synthetic c:[Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/common/utils/RootEnhance$1;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/qihoo360/common/utils/RootEnhance$1;->c:[Ljava/lang/String;

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const-string/jumbo v0, "app_process"

    iput-object v0, p0, Lcom/qihoo360/common/utils/RootEnhance$1;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .prologue
    .line 27
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/Object;

    .line 28
    const/4 v0, 0x0

    .line 31
    :try_start_0
    const-string/jumbo v1, "app_process"

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 32
    iget-object v1, p0, Lcom/qihoo360/common/utils/RootEnhance$1;->b:Landroid/content/Context;

    invoke-static {v1, v7}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;[Ljava/lang/Object;)Lcom/qihoo360/mobilesafe/support/a/f;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 33
    if-eqz v0, :cond_0

    :try_start_1
    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/support/a/b;->a()Z

    move-result v1

    if-nez v1, :cond_2

    const-wide/16 v2, 0x4e20

    invoke-interface {v0, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/b;->a(J)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v1

    if-nez v1, :cond_2

    .line 53
    :cond_0
    if-eqz v0, :cond_1

    .line 54
    iget-object v0, p0, Lcom/qihoo360/common/utils/RootEnhance$1;->b:Landroid/content/Context;

    invoke-static {v0, v7}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;[Ljava/lang/Object;)V

    .line 57
    :cond_1
    :goto_0
    return-void

    .line 36
    :cond_2
    :try_start_2
    new-instance v2, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    const-string/jumbo v1, "com.qihoo360.RFS"

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    const-string/jumbo v1, "-fs"

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    const-string/jumbo v1, "pkg"

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "CLASSPATH="

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/qihoo360/common/utils/RootEnhance$1;->b:Landroid/content/Context;

    invoke-static {v4}, Lcom/qihoo360/mobilesafe/support/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    iget-object v9, p0, Lcom/qihoo360/common/utils/RootEnhance$1;->c:[Ljava/lang/String;

    array-length v10, v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v1, 0x0

    move v6, v1

    :goto_1
    if-lt v6, v10, :cond_3

    .line 53
    if-eqz v0, :cond_1

    .line 54
    iget-object v0, p0, Lcom/qihoo360/common/utils/RootEnhance$1;->b:Landroid/content/Context;

    invoke-static {v0, v7}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;[Ljava/lang/Object;)V

    goto :goto_0

    .line 45
    :cond_3
    :try_start_3
    aget-object v1, v9, v6

    .line 46
    const/4 v4, 0x3

    invoke-virtual {v2, v4, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 48
    const-string/jumbo v1, "app_process"

    invoke-static {v8, v1}, Lcom/qihoo360/common/utils/Utils;->pathAppend(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-wide/16 v4, 0x0

    .line 47
    invoke-static/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a;->a(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 45
    add-int/lit8 v1, v6, 0x1

    move v6, v1

    goto :goto_1

    .line 50
    :catch_0
    move-exception v1

    .line 53
    if-eqz v0, :cond_1

    .line 54
    iget-object v0, p0, Lcom/qihoo360/common/utils/RootEnhance$1;->b:Landroid/content/Context;

    invoke-static {v0, v7}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;[Ljava/lang/Object;)V

    goto :goto_0

    .line 52
    :catchall_0
    move-exception v1

    move-object v11, v1

    move-object v1, v0

    move-object v0, v11

    .line 53
    :goto_2
    if-eqz v1, :cond_4

    .line 54
    iget-object v1, p0, Lcom/qihoo360/common/utils/RootEnhance$1;->b:Landroid/content/Context;

    invoke-static {v1, v7}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;[Ljava/lang/Object;)V

    .line 56
    :cond_4
    throw v0

    .line 52
    :catchall_1
    move-exception v1

    move-object v11, v1

    move-object v1, v0

    move-object v0, v11

    goto :goto_2
.end method
