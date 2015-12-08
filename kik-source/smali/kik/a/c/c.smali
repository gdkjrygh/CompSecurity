.class public final Lkik/a/c/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;

.field private static final b:Lcom/c/a/b/v;


# instance fields
.field private final c:Lkik/a/c/g;

.field private d:Lcom/kik/g/f;

.field private final e:Lkik/a/c/f;

.field private final f:Lcom/kik/g/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 35
    const-string v0, "LinkModerationManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/c/c;->a:Lorg/c/b;

    .line 40
    const-string v0, "kik.com"

    const-string v1, "kik.me"

    const-string v2, "photobombkik.com"

    const-string v3, "youtube.com"

    const-string v4, "soundcloud.com"

    invoke-static {v0, v1, v2, v3, v4}, Lcom/c/a/b/v;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/c/a/b/v;

    move-result-object v0

    sput-object v0, Lkik/a/c/c;->b:Lcom/c/a/b/v;

    return-void
.end method

.method public constructor <init>(Lkik/a/e/f;Lcom/kik/g/e;Lkik/a/e/v;)V
    .locals 2

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/a/c/c;->d:Lcom/kik/g/f;

    .line 49
    new-instance v0, Lkik/a/c/d;

    invoke-direct {v0, p0}, Lkik/a/c/d;-><init>(Lkik/a/c/c;)V

    iput-object v0, p0, Lkik/a/c/c;->f:Lcom/kik/g/i;

    .line 60
    new-instance v0, Lkik/a/c/g;

    invoke-direct {v0, p1}, Lkik/a/c/g;-><init>(Lkik/a/e/f;)V

    iput-object v0, p0, Lkik/a/c/c;->c:Lkik/a/c/g;

    .line 61
    iget-object v0, p0, Lkik/a/c/c;->d:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/c/c;->f:Lcom/kik/g/i;

    invoke-virtual {v0, p2, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 62
    new-instance v0, Lkik/a/c/f;

    invoke-interface {p3}, Lkik/a/e/v;->p()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/a/c/f;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Lkik/a/c/c;->e:Lkik/a/c/f;

    .line 63
    return-void
.end method

.method static synthetic a(Lkik/a/c/c;)Lkik/a/c/f;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lkik/a/c/c;->e:Lkik/a/c/f;

    return-object v0
.end method

.method private b(Ljava/util/List;)Ljava/util/Map;
    .locals 6

    .prologue
    .line 109
    new-instance v1, Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/a/a/af;->b(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v0}, Lkik/a/c/c;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    const-wide v4, 0x7fffffffffffffffL

    invoke-static {v4, v5}, Lkik/a/d/r;->a(J)Lkik/a/d/r;

    move-result-object v3

    invoke-static {v3}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lkik/a/c/c;->e:Lkik/a/c/f;

    invoke-virtual {v3, v0}, Lkik/a/c/f;->a(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 112
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 113
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 114
    invoke-static {v0}, Lkik/a/c/c;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 117
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 118
    iget-object v3, p0, Lkik/a/c/c;->c:Lkik/a/c/g;

    new-instance v4, Lkik/a/f/f/d;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-direct {v4, v5}, Lkik/a/f/f/d;-><init>(Ljava/util/Set;)V

    new-instance v5, Lkik/a/c/e;

    invoke-direct {v5, p0, v0}, Lkik/a/c/e;-><init>(Lkik/a/c/c;Ljava/util/Map;)V

    invoke-virtual {v3, v4, v5}, Lkik/a/c/g;->a(Lkik/a/f/f/z;Lcom/kik/g/r;)V

    .line 119
    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 122
    iget-object v3, p0, Lkik/a/c/c;->e:Lkik/a/c/f;

    invoke-virtual {v3, v0}, Lkik/a/c/f;->a(Ljava/util/Map;)V

    goto :goto_1

    .line 125
    :cond_4
    return-object v1
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 97
    :try_start_0
    sget-object v0, Lkik/a/c/c;->b:Lcom/c/a/b/v;

    invoke-static {p0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/c/a/f/a;->a(Ljava/lang/String;)Lcom/c/a/f/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/a/f/a;->a()Lcom/c/a/f/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/a/f/a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/a/b/v;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 100
    :goto_0
    return v0

    :catch_0
    move-exception v0

    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method private static c(Ljava/util/List;)Ljava/util/List;
    .locals 7

    .prologue
    .line 138
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 139
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 140
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 141
    new-instance v4, Lcom/kik/g/p;

    invoke-direct {v4}, Lcom/kik/g/p;-><init>()V

    .line 142
    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v5

    const/16 v6, 0x64

    if-ne v5, v6, :cond_0

    .line 143
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 146
    :cond_0
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 148
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 149
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    :cond_2
    return-object v2
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 78
    :try_start_0
    invoke-static {p1}, Lcom/c/a/b/m;->a(Ljava/lang/Object;)Lcom/c/a/b/m;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/c/c;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    invoke-static {v0}, Lcom/kik/g/s;->c(Lcom/kik/g/p;)Lcom/kik/g/p;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 82
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lkik/a/c/c;->e:Lkik/a/c/f;

    invoke-virtual {v0}, Lkik/a/c/f;->a()V

    .line 91
    iget-object v0, p0, Lkik/a/c/c;->d:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 92
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 1

    .prologue
    .line 68
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 72
    :cond_0
    :goto_0
    return-void

    .line 71
    :cond_1
    invoke-direct {p0, p1}, Lkik/a/c/c;->b(Ljava/util/List;)Ljava/util/Map;

    goto :goto_0
.end method
