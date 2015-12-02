.class Lcom/qihoo/security/engine/e/c$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/qihoo/security/engine/e/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/e/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/engine/e/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/engine/e/c;)V
    .locals 0

    iput-object p1, p0, Lcom/qihoo/security/engine/e/c$a;->a:Lcom/qihoo/security/engine/e/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/services/ScanResult;)Z
    .locals 8

    const/4 v1, 0x1

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/qihoo/security/engine/e/c$a;->a:Lcom/qihoo/security/engine/e/c;

    invoke-static {v2}, Lcom/qihoo/security/engine/e/c;->a(Lcom/qihoo/security/engine/e/c;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v2, p1, Lcom/qihoo/security/services/ScanResult;->state:I

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v2, p0, Lcom/qihoo/security/engine/e/c$a;->a:Lcom/qihoo/security/engine/e/c;

    iget-object v2, v2, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    const/4 v3, 0x6

    invoke-virtual {v2, v3, v0}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget v2, v2, Lcom/qihoo/security/engine/FileInfo;->level:I

    const/16 v3, 0x32

    if-ge v2, v3, :cond_0

    move v0, v1

    goto :goto_0

    :sswitch_1
    iget-object v2, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-eqz v2, :cond_2

    iget v3, v2, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    if-lez v3, :cond_3

    iget-object v2, p0, Lcom/qihoo/security/engine/e/c$a;->a:Lcom/qihoo/security/engine/e/c;

    invoke-static {v2}, Lcom/qihoo/security/engine/e/c;->b(Lcom/qihoo/security/engine/e/c;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v2, v3}, Lcom/qihoo/security/engine/e/c;->a(Lcom/qihoo/security/engine/e/c;I)V

    :cond_2
    :goto_1
    iget-object v2, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v2}, Lcom/qihoo/security/engine/ApkInfo;->isMalware()Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_3
    const-string/jumbo v3, "ac"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v5, ":"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/qihoo/security/engine/e/c$a;->a:Lcom/qihoo/security/engine/e/c;

    invoke-static {v5}, Lcom/qihoo/security/engine/e/c;->b(Lcom/qihoo/security/engine/e/c;)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/engine/ApkInfo;->addUpExts(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x7 -> :sswitch_1
    .end sparse-switch
.end method

.method public b(Lcom/qihoo/security/services/ScanResult;)I
    .locals 5

    const/4 v2, 0x6

    const/4 v1, 0x2

    const/4 v0, 0x1

    const/4 v3, 0x0

    iget v4, p1, Lcom/qihoo/security/services/ScanResult;->state:I

    sparse-switch v4, :sswitch_data_0

    :cond_0
    move v0, v3

    :cond_1
    :goto_0
    return v0

    :sswitch_0
    iget-object v4, p0, Lcom/qihoo/security/engine/e/c$a;->a:Lcom/qihoo/security/engine/e/c;

    iget-object v4, v4, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    invoke-virtual {v4, v0, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v4

    if-nez v4, :cond_1

    :sswitch_1
    iget-object v0, p0, Lcom/qihoo/security/engine/e/c$a;->a:Lcom/qihoo/security/engine/e/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    :sswitch_2
    iget-object v0, p0, Lcom/qihoo/security/engine/e/c$a;->a:Lcom/qihoo/security/engine/e/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_2
        0x7 -> :sswitch_1
    .end sparse-switch
.end method
