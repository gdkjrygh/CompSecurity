.class final Lcom/roidapp/cloudlib/sns/basepost/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/d;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/d;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/f;->a:Lcom/roidapp/cloudlib/sns/basepost/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 115
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 116
    const-string v1, "data"

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/f;->a:Lcom/roidapp/cloudlib/sns/basepost/d;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/basepost/d;->a(Lcom/roidapp/cloudlib/sns/basepost/d;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    .line 118
    invoke-virtual {v1, v0}, Lcom/google/a/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 119
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    const-string v2, "sns_common"

    invoke-static {v1, v2}, Lcom/roidapp/baselib/d/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 121
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 122
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 125
    :cond_0
    new-instance v3, Ljava/io/File;

    const-string v2, "recommanded_users"

    invoke-direct {v3, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 127
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 128
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 130
    :cond_1
    const/4 v2, 0x0

    .line 132
    :try_start_0
    new-instance v1, Ljava/io/FileWriter;

    invoke-direct {v1, v3}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 139
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 144
    :cond_2
    :goto_0
    return-void

    .line 135
    :catch_0
    move-exception v0

    move-object v1, v2

    :goto_1
    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 137
    if-eqz v1, :cond_2

    .line 139
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileWriter;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 141
    :catch_1
    move-exception v0

    goto :goto_0

    .line 137
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_3

    .line 139
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileWriter;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 141
    :cond_3
    :goto_3
    throw v0

    :catch_2
    move-exception v0

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_3

    .line 137
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 135
    :catch_4
    move-exception v0

    goto :goto_1
.end method
