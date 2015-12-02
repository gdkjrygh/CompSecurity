.class public abstract Lcom/facebook/ui/h/a;
.super Lcom/facebook/base/activity/i;
.source "BaseSplashScreenActivity.java"


# annotations
.annotation runtime Lcom/facebook/base/activity/AppInitializationNotRequired;
.end annotation

.annotation runtime Lcom/facebook/base/activity/AuthNotRequired;
.end annotation


# static fields
.field private static final p:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private q:Landroid/content/Intent;

.field private r:Z

.field private final s:I

.field private t:Lcom/facebook/inject/t;

.field private final u:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/facebook/ui/h/a;

    sput-object v0, Lcom/facebook/ui/h/a;->p:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 62
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    .line 63
    iput p1, p0, Lcom/facebook/ui/h/a;->s:I

    .line 64
    iput-object p2, p0, Lcom/facebook/ui/h/a;->u:Ljava/lang/Class;

    .line 65
    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/h/a;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/facebook/ui/h/a;->l()V

    return-void
.end method

.method private k()Landroid/content/Intent;
    .locals 3

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/ui/h/a;->q:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 114
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/ui/h/a;->q:Landroid/content/Intent;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 115
    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    move-result v1

    const v2, -0x10000001

    and-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 120
    :goto_0
    return-object v0

    .line 118
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 119
    invoke-virtual {p0}, Lcom/facebook/ui/h/a;->j()Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto :goto_0
.end method

.method private l()V
    .locals 2

    .prologue
    .line 125
    iget-boolean v0, p0, Lcom/facebook/ui/h/a;->r:Z

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/facebook/ui/h/a;->t:Lcom/facebook/inject/t;

    const-class v1, Lcom/facebook/c/s;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    .line 128
    invoke-direct {p0}, Lcom/facebook/ui/h/a;->k()Landroid/content/Intent;

    move-result-object v1

    .line 129
    invoke-virtual {v0, v1, p0}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 131
    :cond_0
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 69
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 71
    invoke-virtual {p0}, Lcom/facebook/ui/h/a;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 72
    if-eqz v1, :cond_0

    .line 73
    const-string v0, "return_intent"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    iput-object v0, p0, Lcom/facebook/ui/h/a;->q:Landroid/content/Intent;

    .line 74
    const-string v0, "should_start_return_intent"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/h/a;->r:Z

    .line 77
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/ui/h/a;->i()Lcom/facebook/inject/t;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/h/a;->t:Lcom/facebook/inject/t;

    .line 78
    iget-object v0, p0, Lcom/facebook/ui/h/a;->t:Lcom/facebook/inject/t;

    const-class v1, Lcom/facebook/base/a/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/a/d;

    .line 80
    invoke-virtual {v0}, Lcom/facebook/base/a/d;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 81
    invoke-direct {p0}, Lcom/facebook/ui/h/a;->l()V

    .line 82
    invoke-virtual {p0}, Lcom/facebook/ui/h/a;->finish()V

    .line 95
    :goto_0
    return-void

    .line 84
    :cond_1
    new-instance v1, Lcom/facebook/ui/h/b;

    invoke-direct {v1, p0}, Lcom/facebook/ui/h/b;-><init>(Lcom/facebook/ui/h/a;)V

    invoke-virtual {v0, v1}, Lcom/facebook/base/a/d;->a(Lcom/facebook/base/a/f;)V

    .line 93
    iget v0, p0, Lcom/facebook/ui/h/a;->s:I

    invoke-virtual {p0, v0}, Lcom/facebook/ui/h/a;->setContentView(I)V

    goto :goto_0
.end method

.method protected j()Landroid/content/ComponentName;
    .locals 2

    .prologue
    .line 109
    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p0, Lcom/facebook/ui/h/a;->u:Ljava/lang/Class;

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 99
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onPause()V

    .line 100
    invoke-virtual {p0}, Lcom/facebook/ui/h/a;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/ui/h/a;->setResult(I)V

    .line 103
    :cond_0
    return-void
.end method
