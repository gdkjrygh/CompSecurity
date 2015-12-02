.class public Lcom/qihoo360/mobilesafe/support/a/g;
.super Lcom/qihoo360/mobilesafe/support/a/c;
.source "360Security"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/support/a/c;-><init>(Landroid/content/Context;)V

    .line 26
    const-string/jumbo v0, "com.qihoo.rt_server"

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/g;->d:Ljava/lang/String;

    .line 27
    return-void
.end method

.method private a(Ljava/io/BufferedWriter;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 114
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 144
    return-void
.end method

.method private g()V
    .locals 0

    .prologue
    .line 126
    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/qihoo360/mobilesafe/support/a/g;->g:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v3, "/auth.jar"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 37
    const/16 v3, 0x2710

    invoke-virtual {p0, v0, v3}, Lcom/qihoo360/mobilesafe/support/a/g;->a(ZI)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 38
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 39
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    const-string/jumbo v4, "-server"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    invoke-static {p1, v3}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Ljava/lang/String;Ljava/util/ArrayList;)[B

    move-result-object v3

    .line 44
    const/16 v4, 0x1388

    invoke-virtual {p0, v3, v4}, Lcom/qihoo360/mobilesafe/support/a/g;->a([BI)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 102
    :cond_0
    :goto_0
    return v0

    .line 51
    :cond_1
    const-string/jumbo v3, "%s -server %s %s&\n"

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v1

    aput-object p2, v4, v0

    aput-object v2, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 53
    :try_start_0
    const-string/jumbo v2, "export _LD_LIBRARY_PATH=%s\n"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string/jumbo v6, "LD_LIBRARY_PATH"

    invoke-static {v6}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/support/a/g;->a(Ljava/lang/String;)V

    .line 54
    const-string/jumbo v2, "ls>/data/step\n"

    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/support/a/g;->a(Ljava/lang/String;)V

    .line 55
    const-string/jumbo v2, "rm /data/step\n"

    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/support/a/g;->a(Ljava/lang/String;)V

    .line 56
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/g;->g:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 58
    if-nez v2, :cond_3

    move v0, v1

    .line 59
    goto :goto_0

    .line 61
    :cond_2
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v4

    iput-object v4, p0, Lcom/qihoo360/mobilesafe/support/a/g;->b:Ljava/lang/Process;

    .line 63
    new-instance v4, Ljava/io/BufferedWriter;

    new-instance v5, Ljava/io/OutputStreamWriter;

    iget-object v6, p0, Lcom/qihoo360/mobilesafe/support/a/g;->b:Ljava/lang/Process;

    invoke-virtual {v6}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v6

    const-string/jumbo v7, "UTF-8"

    invoke-direct {v5, v6, v7}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    const/16 v6, 0x200

    invoke-direct {v4, v5, v6}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    .line 64
    const/4 v5, 0x0

    invoke-direct {p0, v4, v5}, Lcom/qihoo360/mobilesafe/support/a/g;->a(Ljava/io/BufferedWriter;I)V

    .line 65
    const-string/jumbo v5, "export _LD_LIBRARY_PATH=%s\n"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string/jumbo v8, "LD_LIBRARY_PATH"

    invoke-static {v8}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 66
    const/4 v5, 0x1

    invoke-direct {p0, v4, v5}, Lcom/qihoo360/mobilesafe/support/a/g;->a(Ljava/io/BufferedWriter;I)V

    .line 67
    const-string/jumbo v5, "export LD_LIBRARY_PATH=%s\n"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string/jumbo v8, "LD_LIBRARY_PATH"

    invoke-static {v8}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 68
    const/4 v5, 0x2

    invoke-direct {p0, v4, v5}, Lcom/qihoo360/mobilesafe/support/a/g;->a(Ljava/io/BufferedWriter;I)V

    .line 69
    const-string/jumbo v5, "export BOOTCLASSPATH=%s\n"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string/jumbo v8, "BOOTCLASSPATH"

    invoke-static {v8}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 70
    const/4 v5, 0x3

    invoke-direct {p0, v4, v5}, Lcom/qihoo360/mobilesafe/support/a/g;->a(Ljava/io/BufferedWriter;I)V

    .line 71
    const-string/jumbo v5, "export PATH=%s\n"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string/jumbo v8, "PATH"

    invoke-static {v8}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 72
    const/4 v5, 0x4

    invoke-direct {p0, v4, v5}, Lcom/qihoo360/mobilesafe/support/a/g;->a(Ljava/io/BufferedWriter;I)V

    .line 73
    invoke-virtual {v4, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 74
    const/4 v5, 0x5

    invoke-direct {p0, v4, v5}, Lcom/qihoo360/mobilesafe/support/a/g;->a(Ljava/io/BufferedWriter;I)V

    .line 75
    const-string/jumbo v5, "exit 100\n"

    invoke-virtual {v4, v5}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 76
    invoke-virtual {v4}, Ljava/io/BufferedWriter;->flush()V

    .line 77
    iget-object v5, p0, Lcom/qihoo360/mobilesafe/support/a/g;->b:Ljava/lang/Process;

    invoke-virtual {v5}, Ljava/lang/Process;->waitFor()I

    move-result v5

    .line 81
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/g;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    :try_start_1
    invoke-virtual {v4}, Ljava/io/BufferedWriter;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 88
    :goto_1
    const/16 v4, 0x64

    if-eq v5, v4, :cond_0

    .line 89
    :try_start_2
    const-string/jumbo v4, "360s"

    invoke-virtual {v2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 90
    const-string/jumbo v2, "su"
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 60
    :cond_3
    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_4
    move v0, v1

    .line 92
    goto/16 :goto_0

    .line 99
    :catch_0
    move-exception v0

    move v0, v1

    .line 102
    goto/16 :goto_0

    .line 85
    :catch_1
    move-exception v4

    goto :goto_1
.end method
