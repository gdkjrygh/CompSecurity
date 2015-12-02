.class public final Lcom/mobvista/sdk/m/core/loader/u;
.super Lcom/mobvista/sdk/m/a/a/d/a;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/e/d;


# instance fields
.field private a:Lcom/mobvista/sdk/m/a/a/d/b;

.field private b:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/a/d/a;-><init>()V

    .line 25
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/u;->c:Z

    .line 61
    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/u;->b:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    return-object v0
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/loader/u;Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;
    .locals 0

    .prologue
    .line 18
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/u;->b:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    return-object p1
.end method

.method static synthetic b(Lcom/mobvista/sdk/m/core/loader/u;)Z
    .locals 1

    .prologue
    .line 18
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/u;->c:Z

    return v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Lcom/mobvista/sdk/m/a/a/d/b;Z)V
    .locals 2

    .prologue
    .line 34
    iput-object p3, p0, Lcom/mobvista/sdk/m/core/loader/u;->a:Lcom/mobvista/sdk/m/a/a/d/b;

    .line 36
    if-eqz p4, :cond_0

    .line 37
    invoke-static {}, Lcom/mobvista/sdk/m/a/e/a;->a()Lcom/mobvista/sdk/m/a/e/a;

    move-result-object v0

    new-instance v1, Lcom/mobvista/sdk/m/core/loader/v;

    invoke-direct {v1, p0, p1, p2}, Lcom/mobvista/sdk/m/core/loader/v;-><init>(Lcom/mobvista/sdk/m/core/loader/u;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lcom/mobvista/sdk/m/a/e/a;->b(Lcom/mobvista/sdk/m/a/e/c;Lcom/mobvista/sdk/m/a/e/d;)I

    .line 46
    :goto_0
    return-void

    .line 39
    :cond_0
    invoke-static {}, Lcom/mobvista/sdk/m/a/e/a;->a()Lcom/mobvista/sdk/m/a/e/a;

    move-result-object v0

    new-instance v1, Lcom/mobvista/sdk/m/core/loader/v;

    invoke-direct {v1, p0, p1, p2}, Lcom/mobvista/sdk/m/core/loader/v;-><init>(Lcom/mobvista/sdk/m/core/loader/u;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lcom/mobvista/sdk/m/a/e/a;->a(Lcom/mobvista/sdk/m/a/e/c;Lcom/mobvista/sdk/m/a/e/d;)I

    goto :goto_0
.end method

.method public final a(Lcom/mobvista/sdk/m/a/e/c;)V
    .locals 0

    .prologue
    .line 269
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/u;->c:Z

    .line 59
    return-void
.end method

.method public final b(Lcom/mobvista/sdk/m/a/e/c;)V
    .locals 2

    .prologue
    .line 274
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/u;->c:Z

    if-nez v0, :cond_1

    .line 285
    :cond_0
    :goto_0
    return-void

    .line 278
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/u;->a:Lcom/mobvista/sdk/m/a/a/d/b;

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/u;->b:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 280
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/u;->a:Lcom/mobvista/sdk/m/a/a/d/b;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/u;->b:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/a/a/d/b;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 282
    :cond_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/u;->a:Lcom/mobvista/sdk/m/a/a/d/b;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/u;->b:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getMsg()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/a/a/d/b;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
