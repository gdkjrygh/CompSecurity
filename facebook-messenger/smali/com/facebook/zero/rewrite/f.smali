.class public Lcom/facebook/zero/rewrite/f;
.super Ljava/lang/Object;
.source "ZeroUrlRewriter.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/zero/d/a;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/zero/rewrite/f;

    sput-object v0, Lcom/facebook/zero/rewrite/f;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/zero/d/a;Ljavax/inject/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/zero/d/a;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    const-string v1, "^https?://b-(graph|api)\\.facebook\\.com.*$"

    const-string v2, ""

    const-string v3, "always"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/rewrite/f;->d:Lcom/google/common/a/es;

    .line 40
    iput-object p1, p0, Lcom/facebook/zero/rewrite/f;->b:Lcom/facebook/zero/d/a;

    .line 41
    iput-object p2, p0, Lcom/facebook/zero/rewrite/f;->c:Ljavax/inject/a;

    .line 42
    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 2

    .prologue
    .line 56
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-virtual {p0, v0}, Lcom/facebook/zero/rewrite/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    :goto_0
    return-object p1

    :cond_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 67
    iget-object v0, p0, Lcom/facebook/zero/rewrite/f;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/q;

    .line 68
    iget-object v1, p0, Lcom/facebook/zero/rewrite/f;->b:Lcom/facebook/zero/d/a;

    invoke-virtual {v1}, Lcom/facebook/zero/d/a;->e()Lcom/google/common/a/es;

    move-result-object v2

    .line 70
    iget-object v1, p0, Lcom/facebook/zero/rewrite/f;->d:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    .line 71
    invoke-virtual {v1, p1}, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 72
    sget-object v0, Lcom/facebook/zero/rewrite/f;->a:Ljava/lang/Class;

    const-string v1, "Whitelisted URI: %s"

    new-array v2, v5, [Ljava/lang/Object;

    aput-object p1, v2, v4

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    :goto_0
    return-object p1

    .line 77
    :cond_1
    invoke-virtual {v2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    .line 78
    invoke-virtual {v1, v0}, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a(Lcom/facebook/common/w/q;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1, p1}, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 79
    invoke-virtual {v1, p1}, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 80
    sget-object v1, Lcom/facebook/zero/rewrite/f;->a:Ljava/lang/Class;

    const-string v2, "Rewritten URI: %s %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v4

    aput-object v0, v3, v5

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object p1, v0

    .line 81
    goto :goto_0

    .line 85
    :cond_3
    sget-object v0, Lcom/facebook/zero/rewrite/f;->a:Ljava/lang/Class;

    const-string v1, "Unfiltered URI: %s"

    new-array v2, v5, [Ljava/lang/Object;

    aput-object p1, v2, v4

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Ljava/net/URI;)Ljava/net/URI;
    .locals 2

    .prologue
    .line 45
    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    .line 46
    invoke-virtual {p0, v0}, Lcom/facebook/zero/rewrite/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    :goto_0
    return-object p1

    :cond_0
    invoke-static {v1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p1

    goto :goto_0
.end method
