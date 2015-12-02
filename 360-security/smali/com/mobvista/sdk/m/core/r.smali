.class final Lcom/mobvista/sdk/m/core/r;
.super Ljava/lang/Thread;
.source "360Security"


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/r;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/r;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/f;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/core/c/f;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/b;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/b;

    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/c/b;->a()V

    .line 45
    sget-object v0, Lcom/mobvista/sdk/m/a/f/d;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/r;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/d;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/r;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAd;->a(Landroid/content/Context;)V

    .line 49
    return-void
.end method
