.class Lcom/facebook/common/c/d;
.super Ljava/lang/Object;
.source "FbSdcardLogger.java"


# instance fields
.field final synthetic a:Lcom/facebook/common/c/a;

.field private b:Ljava/io/File;

.field private c:Ljava/io/Writer;

.field private d:J

.field private e:J


# direct methods
.method private constructor <init>(Lcom/facebook/common/c/a;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/facebook/common/c/d;->a:Lcom/facebook/common/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/c/a;Lcom/facebook/common/c/b;)V
    .locals 0

    .prologue
    .line 123
    invoke-direct {p0, p1}, Lcom/facebook/common/c/d;-><init>(Lcom/facebook/common/c/a;)V

    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 253
    packed-switch p1, :pswitch_data_0

    .line 267
    const-string v0, "o"

    :goto_0
    return-object v0

    .line 255
    :pswitch_0
    const-string v0, "v"

    goto :goto_0

    .line 257
    :pswitch_1
    const-string v0, "d"

    goto :goto_0

    .line 259
    :pswitch_2
    const-string v0, "i"

    goto :goto_0

    .line 261
    :pswitch_3
    const-string v0, "w"

    goto :goto_0

    .line 263
    :pswitch_4
    const-string v0, "e"

    goto :goto_0

    .line 265
    :pswitch_5
    const-string v0, "a"

    goto :goto_0

    .line 253
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private declared-synchronized a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 132
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/common/c/d;->b()V

    .line 133
    iget-object v0, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;

    if-eqz v0, :cond_1

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    invoke-static {}, Lcom/facebook/common/c/a;->c()Ljava/text/SimpleDateFormat;

    move-result-object v1

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    invoke-direct {p0, p1}, Lcom/facebook/common/c/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 143
    const-string v0, "\n"

    invoke-virtual {p3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 144
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 145
    iget-object v5, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;

    invoke-virtual {v5, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 146
    iget-object v5, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;

    invoke-virtual {v5, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 147
    iget-object v4, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 144
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    :cond_1
    :goto_1
    monitor-exit p0

    return-void

    .line 151
    :catch_0
    move-exception v0

    .line 153
    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/facebook/common/c/d;->b:Ljava/io/File;

    .line 154
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 132
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic a(Lcom/facebook/common/c/d;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 123
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/common/c/d;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private declared-synchronized b()V
    .locals 6

    .prologue
    .line 159
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/common/c/d;->d()V

    .line 161
    iget-object v0, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    .line 191
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 165
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/common/c/d;->a:Lcom/facebook/common/c/a;

    invoke-static {v0}, Lcom/facebook/common/c/a;->c(Lcom/facebook/common/c/a;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 171
    iget-wide v2, p0, Lcom/facebook/common/c/d;->d:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x7530

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    .line 175
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/facebook/common/c/d;->d:J

    .line 176
    invoke-direct {p0}, Lcom/facebook/common/c/d;->c()Ljava/io/File;

    move-result-object v2

    .line 177
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_2

    .line 178
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 180
    new-instance v3, Ljava/io/File;

    const-string v4, ".nomedia"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    .line 182
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v2

    const-string v3, "debug.log"

    const/4 v4, 0x0

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-static {v2, v3, v4, v5}, Lcom/facebook/common/c/g;->a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/common/c/d;->b:Ljava/io/File;

    .line 183
    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v3, Ljava/io/FileWriter;

    iget-object v4, p0, Lcom/facebook/common/c/d;->b:Ljava/io/File;

    invoke-direct {v3, v4}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    const/16 v4, 0x800

    invoke-direct {v2, v3, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    iput-object v2, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;

    .line 184
    iput-wide v0, p0, Lcom/facebook/common/c/d;->e:J

    .line 185
    invoke-static {}, Lcom/facebook/common/c/a;->d()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Opened log."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 186
    :catch_0
    move-exception v0

    .line 188
    const/4 v0, 0x0

    :try_start_3
    iput-object v0, p0, Lcom/facebook/common/c/d;->b:Ljava/io/File;

    .line 189
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 159
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private c()Ljava/io/File;
    .locals 4

    .prologue
    .line 194
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    .line 195
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "/Android/data/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/common/c/d;->a:Lcom/facebook/common/c/a;

    invoke-static {v3}, Lcom/facebook/common/c/a;->d(Lcom/facebook/common/c/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/files/log/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method

.method private d()V
    .locals 4

    .prologue
    .line 199
    iget-object v0, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;

    if-nez v0, :cond_1

    .line 207
    :cond_0
    :goto_0
    return-void

    .line 202
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 203
    iget-wide v2, p0, Lcom/facebook/common/c/d;->e:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x124f80

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 205
    invoke-direct {p0}, Lcom/facebook/common/c/d;->e()V

    goto :goto_0
.end method

.method private e()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 243
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 247
    iput-object v1, p0, Lcom/facebook/common/c/d;->b:Ljava/io/File;

    .line 248
    iput-object v1, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;

    .line 250
    :goto_0
    return-void

    .line 244
    :catch_0
    move-exception v0

    .line 247
    iput-object v1, p0, Lcom/facebook/common/c/d;->b:Ljava/io/File;

    .line 248
    iput-object v1, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;

    goto :goto_0

    .line 247
    :catchall_0
    move-exception v0

    iput-object v1, p0, Lcom/facebook/common/c/d;->b:Ljava/io/File;

    .line 248
    iput-object v1, p0, Lcom/facebook/common/c/d;->c:Ljava/io/Writer;

    throw v0
.end method


# virtual methods
.method public declared-synchronized a()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/common/c/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 215
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/common/c/d;->d()V

    .line 216
    invoke-direct {p0}, Lcom/facebook/common/c/d;->c()Ljava/io/File;

    move-result-object v0

    .line 217
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 218
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 238
    :goto_0
    monitor-exit p0

    return-object v0

    .line 221
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 222
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    .line 223
    array-length v0, v4

    invoke-static {v0}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v0

    .line 224
    array-length v5, v4

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v5, :cond_4

    aget-object v6, v4, v1

    .line 225
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "debug.log"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    .line 224
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 228
    :cond_1
    invoke-static {v6}, Lcom/facebook/common/c/g;->a(Ljava/io/File;)Lcom/facebook/common/c/f;

    move-result-object v7

    .line 229
    invoke-virtual {v7}, Lcom/facebook/common/c/f;->b()Ljava/util/Date;

    move-result-object v8

    .line 230
    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    sub-long v8, v2, v8

    const-wide/32 v10, 0x2932e00

    cmp-long v8, v8, v10

    if-lez v8, :cond_3

    .line 232
    :cond_2
    invoke-virtual {v6}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 215
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 235
    :cond_3
    :try_start_2
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 237
    :cond_4
    invoke-static {v0}, Lcom/facebook/common/c/g;->a(Ljava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method
