.class public Lcom/facebook/auth/viewercontext/d;
.super Ljava/lang/Object;
.source "ViewerContextFactory.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/auth/viewercontext/d;->a:Lcom/facebook/prefs/shared/d;

    .line 18
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 12

    .prologue
    const-wide/16 v10, -0x1

    const/4 v0, 0x0

    .line 21
    iget-object v1, p0, Lcom/facebook/auth/viewercontext/d;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->a()Z

    move-result v1

    if-nez v1, :cond_1

    .line 46
    :cond_0
    :goto_0
    return-object v0

    .line 24
    :cond_1
    iget-object v1, p0, Lcom/facebook/auth/viewercontext/d;->a:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/auth/e/a;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 25
    iget-object v2, p0, Lcom/facebook/auth/viewercontext/d;->a:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/auth/e/a;->d:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 26
    iget-object v3, p0, Lcom/facebook/auth/viewercontext/d;->a:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/auth/e/a;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v3, v4, v10, v11}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v3

    .line 27
    iget-object v5, p0, Lcom/facebook/auth/viewercontext/d;->a:Lcom/facebook/prefs/shared/d;

    sget-object v6, Lcom/facebook/auth/e/a;->f:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v5, v6, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 31
    iget-object v6, p0, Lcom/facebook/auth/viewercontext/d;->a:Lcom/facebook/prefs/shared/d;

    sget-object v7, Lcom/facebook/auth/e/a;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v6, v7, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 35
    iget-object v7, p0, Lcom/facebook/auth/viewercontext/d;->a:Lcom/facebook/prefs/shared/d;

    sget-object v8, Lcom/facebook/auth/e/a;->k:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v7, v8, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 39
    iget-object v8, p0, Lcom/facebook/auth/viewercontext/d;->a:Lcom/facebook/prefs/shared/d;

    sget-object v9, Lcom/facebook/auth/e/a;->m:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v8, v9, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 43
    if-eqz v2, :cond_0

    cmp-long v3, v3, v10

    if-eqz v3, :cond_0

    if-eqz v1, :cond_0

    .line 46
    invoke-static {}, Lcom/facebook/auth/viewercontext/ViewerContext;->newBuilder()Lcom/facebook/auth/viewercontext/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/auth/viewercontext/c;->a(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/auth/viewercontext/c;->b(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/facebook/auth/viewercontext/c;->c(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/facebook/auth/viewercontext/c;->d(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/facebook/auth/viewercontext/c;->e(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/facebook/auth/viewercontext/c;->f(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/c;->h()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    goto :goto_0
.end method
