.class public final Lcom/mobvista/sdk/m/core/loader/JumpLoader;
.super Lcom/mobvista/sdk/m/a/a/d/a;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/e/d;


# instance fields
.field a:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Lcom/mobvista/sdk/m/a/a/d/b;

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 25
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/a/d/a;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->b:I

    .line 28
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->c:Ljava/lang/String;

    .line 29
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->a:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    .line 30
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->d:Lcom/mobvista/sdk/m/a/a/d/b;

    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->e:Z

    .line 209
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Lcom/mobvista/sdk/m/a/a/d/b;Z)V
    .locals 1

    .prologue
    .line 39
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->c:Ljava/lang/String;

    .line 40
    iput-object p3, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->d:Lcom/mobvista/sdk/m/a/a/d/b;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->a:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    .line 44
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/u;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/loader/u;-><init>()V

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/mobvista/sdk/m/core/loader/u;->a(Landroid/content/Context;Ljava/lang/String;Lcom/mobvista/sdk/m/a/a/d/b;Z)V

    .line 48
    return-void
.end method

.method public final a(Lcom/mobvista/sdk/m/a/e/c;)V
    .locals 0

    .prologue
    .line 69
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 35
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->e:Z

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->e:Z

    .line 61
    return-void
.end method

.method public final b(Lcom/mobvista/sdk/m/a/e/c;)V
    .locals 2

    .prologue
    .line 80
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->e:Z

    if-nez v0, :cond_1

    .line 91
    :cond_0
    :goto_0
    return-void

    .line 84
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->d:Lcom/mobvista/sdk/m/a/a/d/b;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->a:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 86
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->d:Lcom/mobvista/sdk/m/a/a/d/b;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->a:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/a/a/d/b;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 88
    :cond_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->d:Lcom/mobvista/sdk/m/a/a/d/b;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->a:Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getMsg()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/a/a/d/b;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
