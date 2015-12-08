.class final Lcom/kik/l/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/Hashtable;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/kik/l/f;


# direct methods
.method constructor <init>(Lcom/kik/l/f;Ljava/util/Hashtable;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 156
    iput-object p1, p0, Lcom/kik/l/j;->c:Lcom/kik/l/f;

    iput-object p2, p0, Lcom/kik/l/j;->a:Ljava/util/Hashtable;

    iput-object p3, p0, Lcom/kik/l/j;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const-wide/32 v8, 0x41353000

    const/4 v0, 0x0

    .line 160
    iget-object v1, p0, Lcom/kik/l/j;->a:Ljava/util/Hashtable;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/kik/l/j;->b:Landroid/content/Context;

    if-nez v1, :cond_1

    .line 193
    :cond_0
    return-void

    .line 163
    :cond_1
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/kik/l/j;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "profpics"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 164
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 165
    if-eqz v2, :cond_0

    move v1, v0

    .line 168
    :goto_0
    array-length v0, v2

    if-ge v1, v0, :cond_0

    .line 170
    :try_start_0
    aget-object v3, v2, v1

    .line 171
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 172
    const/4 v0, 0x0

    .line 174
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v6, 0x10

    if-lt v5, v6, :cond_2

    .line 175
    const/4 v0, 0x0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x10

    invoke-virtual {v4, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 177
    :cond_2
    if-eqz v0, :cond_3

    .line 178
    iget-object v4, p0, Lcom/kik/l/j;->a:Ljava/util/Hashtable;

    invoke-virtual {v4, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 179
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 180
    invoke-static {v0}, Lcom/kik/cache/k;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v0

    .line 181
    new-instance v4, Lcom/android/volley/b$a;

    invoke-direct {v4}, Lcom/android/volley/b$a;-><init>()V

    .line 182
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    add-long/2addr v6, v8

    iput-wide v6, v4, Lcom/android/volley/b$a;->d:J

    .line 183
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    add-long/2addr v6, v8

    iput-wide v6, v4, Lcom/android/volley/b$a;->e:J

    .line 184
    invoke-static {v3}, Lcom/kik/l/f;->a(Ljava/io/File;)[B

    move-result-object v3

    iput-object v3, v4, Lcom/android/volley/b$a;->a:[B

    .line 185
    iget-object v3, p0, Lcom/kik/l/j;->c:Lcom/kik/l/f;

    invoke-static {v3}, Lcom/kik/l/f;->d(Lcom/kik/l/f;)Lcom/android/volley/toolbox/d;

    move-result-object v3

    invoke-virtual {v3, v0, v4}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;Lcom/android/volley/b$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    :cond_3
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 189
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_1
.end method
