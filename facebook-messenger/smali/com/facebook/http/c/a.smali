.class public Lcom/facebook/http/c/a;
.super Ljava/lang/Object;
.source "DefaultNetworkConfig.java"

# interfaces
.implements Lcom/facebook/http/c/e;


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList",
            "<",
            "Lcom/facebook/http/c/f;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/prefs/shared/f;

.field private d:Z

.field private e:Z

.field private f:Lorg/apache/http/HttpHost;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 2

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/http/c/a;->d:Z

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/http/c/a;->e:Z

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/http/c/a;->f:Lorg/apache/http/HttpHost;

    .line 34
    iput-object p1, p0, Lcom/facebook/http/c/a;->a:Lcom/facebook/prefs/shared/d;

    .line 35
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/http/c/a;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 38
    new-instance v0, Lcom/facebook/http/c/b;

    invoke-direct {v0, p0}, Lcom/facebook/http/c/b;-><init>(Lcom/facebook/http/c/a;)V

    iput-object v0, p0, Lcom/facebook/http/c/a;->c:Lcom/facebook/prefs/shared/f;

    .line 48
    iget-object v0, p0, Lcom/facebook/http/c/a;->a:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/http/c/a;->c:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 52
    iget-object v0, p0, Lcom/facebook/http/c/a;->a:Lcom/facebook/prefs/shared/d;

    new-instance v1, Lcom/facebook/http/c/c;

    invoke-direct {v1, p0}, Lcom/facebook/http/c/c;-><init>(Lcom/facebook/http/c/a;)V

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Ljava/lang/Runnable;)V

    .line 58
    return-void
.end method

.method static synthetic a(Lcom/facebook/http/c/a;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/http/c/a;->c()V

    return-void
.end method

.method private c()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 76
    const/4 v0, 0x0

    .line 79
    invoke-direct {p0}, Lcom/facebook/http/c/a;->e()Z

    move-result v2

    .line 80
    iget-boolean v3, p0, Lcom/facebook/http/c/a;->d:Z

    if-eq v2, v3, :cond_0

    .line 81
    iput-boolean v2, p0, Lcom/facebook/http/c/a;->d:Z

    move v0, v1

    .line 86
    :cond_0
    invoke-direct {p0}, Lcom/facebook/http/c/a;->f()Lorg/apache/http/HttpHost;

    move-result-object v2

    .line 87
    iget-object v3, p0, Lcom/facebook/http/c/a;->f:Lorg/apache/http/HttpHost;

    invoke-static {v3, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 88
    iput-object v2, p0, Lcom/facebook/http/c/a;->f:Lorg/apache/http/HttpHost;

    move v0, v1

    .line 92
    :cond_1
    invoke-direct {p0}, Lcom/facebook/http/c/a;->d()Z

    move-result v2

    .line 93
    iget-boolean v3, p0, Lcom/facebook/http/c/a;->e:Z

    if-eq v2, v3, :cond_3

    .line 94
    iput-boolean v2, p0, Lcom/facebook/http/c/a;->e:Z

    .line 98
    :goto_0
    if-eqz v1, :cond_2

    .line 99
    invoke-direct {p0}, Lcom/facebook/http/c/a;->g()V

    .line 101
    :cond_2
    return-void

    :cond_3
    move v1, v0

    goto :goto_0
.end method

.method private d()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 104
    iget-object v1, p0, Lcom/facebook/http/c/a;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 109
    :goto_0
    return v0

    .line 107
    :cond_0
    const-string v1, "fbandroid_ssl_cache_enabled"

    invoke-static {v1}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    .line 109
    iget-object v2, p0, Lcom/facebook/http/c/a;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v2, v1, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    goto :goto_0
.end method

.method private e()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 113
    .line 114
    iget-object v1, p0, Lcom/facebook/http/c/a;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 115
    iget-object v1, p0, Lcom/facebook/http/c/a;->a:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/http/f/c;->f:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    .line 118
    :cond_0
    return v0
.end method

.method private f()Lorg/apache/http/HttpHost;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 122
    invoke-static {}, Lcom/facebook/base/b;->a()Z

    move-result v1

    if-nez v1, :cond_1

    .line 134
    :cond_0
    :goto_0
    return-object v0

    .line 125
    :cond_1
    iget-object v1, p0, Lcom/facebook/http/c/a;->a:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/http/f/c;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 126
    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 129
    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 130
    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 133
    add-int/lit8 v0, v2, 0x1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 134
    new-instance v0, Lorg/apache/http/HttpHost;

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method private g()V
    .locals 2

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/http/c/a;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/c/f;

    .line 139
    invoke-interface {v0}, Lcom/facebook/http/c/f;->a()V

    goto :goto_0

    .line 141
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lorg/apache/http/HttpHost;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/http/c/a;->f:Lorg/apache/http/HttpHost;

    return-object v0
.end method

.method public a(Lcom/facebook/http/c/f;)V
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/http/c/a;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 67
    iget-boolean v0, p0, Lcom/facebook/http/c/a;->d:Z

    return v0
.end method
