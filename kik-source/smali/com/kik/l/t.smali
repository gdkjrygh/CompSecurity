.class final Lcom/kik/l/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Lcom/kik/l/p;


# direct methods
.method constructor <init>(Lcom/kik/l/p;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lcom/kik/l/t;->b:Lcom/kik/l/p;

    iput-object p2, p0, Lcom/kik/l/t;->a:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const-wide/32 v8, 0x41353000

    .line 149
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/kik/l/t;->a:Ljava/io/File;

    const-string v2, "chatPicsBig"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 150
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 151
    if-nez v2, :cond_1

    .line 168
    :cond_0
    return-void

    .line 154
    :cond_1
    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v0, v2, v1

    .line 156
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 158
    new-instance v5, Lcom/android/volley/b$a;

    invoke-direct {v5}, Lcom/android/volley/b$a;-><init>()V

    .line 159
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    add-long/2addr v6, v8

    iput-wide v6, v5, Lcom/android/volley/b$a;->d:J

    .line 160
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    add-long/2addr v6, v8

    iput-wide v6, v5, Lcom/android/volley/b$a;->e:J

    .line 161
    invoke-static {v0}, Lcom/kik/l/p;->b(Ljava/io/File;)[B

    move-result-object v0

    iput-object v0, v5, Lcom/android/volley/b$a;->a:[B

    .line 162
    iget-object v0, p0, Lcom/kik/l/t;->b:Lcom/kik/l/p;

    invoke-static {v0}, Lcom/kik/l/p;->d(Lcom/kik/l/p;)Lcom/android/volley/toolbox/d;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;Lcom/android/volley/b$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 164
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_1
.end method
