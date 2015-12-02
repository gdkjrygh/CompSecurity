.class public Lcom/android/volley/d;
.super Lcom/android/volley/h;
.source "360Security"


# instance fields
.field private final f:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/g;Lcom/android/volley/a;Lcom/android/volley/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/android/volley/Request",
            "<*>;>;",
            "Lcom/android/volley/g;",
            "Lcom/android/volley/a;",
            "Lcom/android/volley/l;",
            ")V"
        }
    .end annotation

    .prologue
    .line 53
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/volley/h;-><init>(Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/g;Lcom/android/volley/a;Lcom/android/volley/l;)V

    .line 54
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/android/volley/d;->f:Landroid/content/Context;

    .line 55
    return-void
.end method

.method private a(Lcom/android/volley/Request;)Lcom/android/volley/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/Request;",
            ")",
            "Lcom/android/volley/k",
            "<*>;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 139
    invoke-virtual {p1}, Lcom/android/volley/Request;->d()Ljava/lang/String;

    move-result-object v2

    .line 140
    const-string/jumbo v0, ""

    .line 142
    const-string/jumbo v3, "Package://"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 143
    const-string/jumbo v0, "Package://"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 144
    invoke-static {}, Lcom/qihoo/utils/a/a;->a()Lcom/qihoo/utils/a/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/utils/a/a;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 150
    :goto_0
    if-eqz v0, :cond_1

    .line 151
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 152
    if-eqz v0, :cond_1

    .line 153
    invoke-static {v0, v1}, Lcom/android/volley/k;->a(Ljava/lang/Object;Lcom/android/volley/a$a;)Lcom/android/volley/k;

    move-result-object v0

    .line 156
    :goto_1
    return-object v0

    .line 145
    :cond_0
    const-string/jumbo v3, "ApkPath://"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 146
    const-string/jumbo v0, "ApkPath://"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 147
    invoke-static {}, Lcom/qihoo/utils/a/a;->a()Lcom/qihoo/utils/a/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/utils/a/a;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 156
    :cond_1
    new-instance v0, Lcom/android/volley/VolleyError;

    new-instance v1, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-direct {v1, v2}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/android/volley/VolleyError;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lcom/android/volley/k;->a(Lcom/android/volley/VolleyError;)Lcom/android/volley/k;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v2, v0

    move-object v0, v1

    goto :goto_0
.end method

.method private a(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/Request",
            "<*>;",
            "Lcom/android/volley/VolleyError;",
            ")V"
        }
    .end annotation

    .prologue
    .line 160
    invoke-virtual {p1, p2}, Lcom/android/volley/Request;->a(Lcom/android/volley/VolleyError;)Lcom/android/volley/VolleyError;

    move-result-object v0

    .line 161
    iget-object v1, p0, Lcom/android/volley/d;->d:Lcom/android/volley/l;

    invoke-interface {v1, p1, v0}, Lcom/android/volley/l;->a(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V

    .line 162
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 59
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 64
    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/android/volley/d;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/Request;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 74
    :try_start_1
    const-string/jumbo v1, "network-queue-take"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 78
    invoke-virtual {v0}, Lcom/android/volley/Request;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 79
    const-string/jumbo v1, "network-discard-cancelled"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->b(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/android/volley/VolleyError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    .line 129
    :catch_0
    move-exception v1

    .line 130
    invoke-direct {p0, v0, v1}, Lcom/android/volley/d;->a(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V

    goto :goto_0

    .line 65
    :catch_1
    move-exception v0

    .line 67
    iget-boolean v0, p0, Lcom/android/volley/d;->e:Z

    if-eqz v0, :cond_0

    .line 68
    return-void

    .line 84
    :cond_1
    :try_start_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_2
    .catch Lcom/android/volley/VolleyError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    const/16 v4, 0xe

    if-lt v1, v4, :cond_2

    .line 87
    :try_start_3
    const-class v1, Landroid/net/TrafficStats;

    const-string/jumbo v4, "setThreadStatsTag"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Class;

    const/4 v6, 0x0

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v7, v5, v6

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 88
    const/4 v4, 0x0

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v0}, Lcom/android/volley/Request;->c()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-virtual {v1, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lcom/android/volley/VolleyError; {:try_start_3 .. :try_end_3} :catch_0

    .line 96
    :cond_2
    :goto_1
    :try_start_4
    invoke-virtual {v0}, Lcom/android/volley/Request;->d()Ljava/lang/String;

    move-result-object v1

    .line 97
    instance-of v4, v0, Lcom/android/volley/toolbox/h;

    if-eqz v4, :cond_5

    const-string/jumbo v4, "Package://"

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string/jumbo v4, "ApkPath://"

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 100
    :cond_3
    const-string/jumbo v1, "network-http-complete"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 101
    invoke-direct {p0, v0}, Lcom/android/volley/d;->a(Lcom/android/volley/Request;)Lcom/android/volley/k;

    move-result-object v1

    .line 102
    const-string/jumbo v4, "network-parse-complete"

    invoke-virtual {v0, v4}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    move-object v4, v1

    move v1, v2

    .line 121
    :goto_2
    if-nez v1, :cond_4

    invoke-virtual {v0}, Lcom/android/volley/Request;->r()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v4, Lcom/android/volley/k;->b:Lcom/android/volley/a$a;

    if-eqz v1, :cond_4

    .line 122
    iget-object v1, p0, Lcom/android/volley/d;->c:Lcom/android/volley/a;

    invoke-virtual {v0}, Lcom/android/volley/Request;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v4, Lcom/android/volley/k;->b:Lcom/android/volley/a$a;

    invoke-interface {v1, v5, v6}, Lcom/android/volley/a;->a(Ljava/lang/String;Lcom/android/volley/a$a;)V

    .line 123
    const-string/jumbo v1, "network-cache-written"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 127
    :cond_4
    invoke-virtual {v0}, Lcom/android/volley/Request;->v()V

    .line 128
    iget-object v1, p0, Lcom/android/volley/d;->d:Lcom/android/volley/l;

    invoke-interface {v1, v0, v4}, Lcom/android/volley/l;->a(Lcom/android/volley/Request;Lcom/android/volley/k;)V
    :try_end_4
    .catch Lcom/android/volley/VolleyError; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto/16 :goto_0

    .line 131
    :catch_2
    move-exception v1

    .line 132
    const-string/jumbo v4, "Unhandled exception %s"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-static {v1, v4, v5}, Lcom/android/volley/n;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    iget-object v4, p0, Lcom/android/volley/d;->d:Lcom/android/volley/l;

    new-instance v5, Lcom/android/volley/VolleyError;

    invoke-direct {v5, v1}, Lcom/android/volley/VolleyError;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v4, v0, v5}, Lcom/android/volley/l;->a(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V

    goto/16 :goto_0

    .line 105
    :cond_5
    :try_start_5
    iget-object v1, p0, Lcom/android/volley/d;->b:Lcom/android/volley/g;

    invoke-interface {v1, v0}, Lcom/android/volley/g;->a(Lcom/android/volley/Request;)Lcom/android/volley/i;

    move-result-object v1

    .line 106
    const-string/jumbo v4, "network-http-complete"

    invoke-virtual {v0, v4}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 110
    iget-boolean v4, v1, Lcom/android/volley/i;->d:Z

    if-eqz v4, :cond_6

    invoke-virtual {v0}, Lcom/android/volley/Request;->w()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 111
    const-string/jumbo v1, "not-modified"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->b(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 116
    :cond_6
    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->a(Lcom/android/volley/i;)Lcom/android/volley/k;

    move-result-object v1

    .line 117
    const-string/jumbo v4, "network-parse-complete"

    invoke-virtual {v0, v4}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V
    :try_end_5
    .catch Lcom/android/volley/VolleyError; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    move-object v4, v1

    move v1, v3

    goto :goto_2

    .line 89
    :catch_3
    move-exception v1

    goto/16 :goto_1
.end method
