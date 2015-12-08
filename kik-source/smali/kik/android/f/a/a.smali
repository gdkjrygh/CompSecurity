.class public final Lkik/android/f/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/android/volley/p;

.field private final b:Lcom/android/volley/toolbox/d;

.field private final c:Lcom/kik/cache/SimpleLruBitmapCache;

.field private final d:Lcom/kik/cache/ad;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkik/a/e/q;Ljava/lang/String;Lcom/kik/cache/SimpleLruBitmapCache;)V
    .locals 4

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-interface {p2, p3}, Lkik/a/e/q;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 44
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-direct {v0, v2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 45
    invoke-static {v0, v1}, Lkik/android/util/d;->a(Ljava/io/File;Ljava/io/File;)V

    .line 47
    const-string v2, "AN"

    .line 48
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v0, v3, :cond_0

    .line 51
    new-instance v0, Lcom/android/volley/toolbox/h;

    invoke-direct {v0}, Lcom/android/volley/toolbox/h;-><init>()V

    .line 59
    :goto_0
    new-instance v2, Lkik/android/net/c;

    invoke-direct {v2, v0}, Lkik/android/net/c;-><init>(Lcom/android/volley/toolbox/g;)V

    .line 61
    new-instance v0, Lcom/android/volley/toolbox/d;

    const/high16 v3, 0x1400000

    invoke-direct {v0, v1, v3}, Lcom/android/volley/toolbox/d;-><init>(Ljava/io/File;I)V

    iput-object v0, p0, Lkik/android/f/a/a;->b:Lcom/android/volley/toolbox/d;

    .line 62
    new-instance v0, Lcom/android/volley/p;

    iget-object v1, p0, Lkik/android/f/a/a;->b:Lcom/android/volley/toolbox/d;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/android/volley/p;-><init>(Lcom/android/volley/b;Lcom/android/volley/h;I)V

    iput-object v0, p0, Lkik/android/f/a/a;->a:Lcom/android/volley/p;

    .line 63
    iput-object p4, p0, Lkik/android/f/a/a;->c:Lcom/kik/cache/SimpleLruBitmapCache;

    .line 65
    iget-object v0, p0, Lkik/android/f/a/a;->a:Lcom/android/volley/p;

    invoke-virtual {v0}, Lcom/android/volley/p;->a()V

    .line 67
    new-instance v0, Lcom/kik/cache/ad;

    iget-object v1, p0, Lkik/android/f/a/a;->a:Lcom/android/volley/p;

    iget-object v2, p0, Lkik/android/f/a/a;->c:Lcom/kik/cache/SimpleLruBitmapCache;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/kik/cache/ad;-><init>(Lcom/android/volley/p;Lcom/kik/cache/ad$b;Lcom/kik/cache/ap;)V

    iput-object v0, p0, Lkik/android/f/a/a;->d:Lcom/kik/cache/ad;

    .line 68
    iget-object v0, p0, Lkik/android/f/a/a;->d:Lcom/kik/cache/ad;

    invoke-virtual {v0}, Lcom/kik/cache/ad;->b()V

    .line 69
    return-void

    .line 56
    :cond_0
    new-instance v0, Lcom/android/volley/toolbox/e;

    invoke-static {v2}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/android/volley/toolbox/e;-><init>(Lorg/apache/http/client/HttpClient;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 4

    .prologue
    .line 73
    new-instance v1, Lcom/kik/cache/x;

    new-instance v0, Lkik/android/f/a/b;

    invoke-direct {v0, p0}, Lkik/android/f/a/b;-><init>(Lkik/android/f/a/a;)V

    new-instance v2, Lkik/android/f/a/c;

    invoke-direct {v2, p0}, Lkik/android/f/a/c;-><init>(Lkik/android/f/a/a;)V

    invoke-direct {v1, p1, v0, v2}, Lcom/kik/cache/x;-><init>(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)V

    .line 85
    invoke-virtual {v1}, Lcom/kik/cache/x;->e()Ljava/lang/String;

    move-result-object v2

    .line 86
    const/4 v0, 0x0

    .line 88
    iget-object v3, p0, Lkik/android/f/a/a;->b:Lcom/android/volley/toolbox/d;

    invoke-virtual {v3, v2}, Lcom/android/volley/toolbox/d;->c(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 89
    const/4 v0, 0x1

    .line 92
    :cond_0
    if-nez v0, :cond_1

    .line 93
    iget-object v2, p0, Lkik/android/f/a/a;->a:Lcom/android/volley/p;

    invoke-virtual {v2, v1}, Lcom/android/volley/p;->a(Lcom/android/volley/n;)Lcom/android/volley/n;

    .line 96
    :cond_1
    return v0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 6

    .prologue
    .line 101
    new-instance v2, Lcom/kik/g/p;

    invoke-direct {v2}, Lcom/kik/g/p;-><init>()V

    .line 102
    new-instance v3, Lcom/kik/cache/x;

    new-instance v0, Lkik/android/f/a/d;

    invoke-direct {v0, p0, v2}, Lkik/android/f/a/d;-><init>(Lkik/android/f/a/a;Lcom/kik/g/p;)V

    new-instance v1, Lkik/android/f/a/e;

    invoke-direct {v1, p0, v2}, Lkik/android/f/a/e;-><init>(Lkik/android/f/a/a;Lcom/kik/g/p;)V

    invoke-direct {v3, p1, v0, v1}, Lcom/kik/cache/x;-><init>(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)V

    .line 116
    const/4 v1, 0x0

    .line 117
    invoke-virtual {v3}, Lcom/kik/cache/x;->e()Ljava/lang/String;

    move-result-object v4

    .line 118
    const/4 v0, 0x0

    .line 120
    iget-object v5, p0, Lkik/android/f/a/a;->b:Lcom/android/volley/toolbox/d;

    invoke-virtual {v5, v4}, Lcom/android/volley/toolbox/d;->c(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 121
    iget-object v5, p0, Lkik/android/f/a/a;->b:Lcom/android/volley/toolbox/d;

    invoke-virtual {v5, v4}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;)Lcom/android/volley/b$a;

    move-result-object v4

    .line 122
    if-eqz v4, :cond_0

    .line 123
    iget-object v1, v4, Lcom/android/volley/b$a;->a:[B

    .line 126
    :cond_0
    if-eqz v1, :cond_1

    .line 127
    const/4 v0, 0x1

    .line 128
    invoke-virtual {v2, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 132
    :cond_1
    if-nez v0, :cond_2

    .line 133
    iget-object v0, p0, Lkik/android/f/a/a;->a:Lcom/android/volley/p;

    invoke-virtual {v0, v3}, Lcom/android/volley/p;->a(Lcom/android/volley/n;)Lcom/android/volley/n;

    .line 136
    :cond_2
    return-object v2
.end method
