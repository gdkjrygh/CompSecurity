.class public Lcom/facebook/orca/nux/NUXActivity;
.super Lcom/facebook/base/activity/i;
.source "NUXActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


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
.field private q:Lcom/facebook/orca/nux/NuxIntroView;

.field private r:Landroid/content/ComponentName;

.field private s:Lcom/facebook/orca/nux/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/orca/nux/NUXActivity;

    sput-object v0, Lcom/facebook/orca/nux/NUXActivity;->p:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/nux/NUXActivity;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/orca/nux/NUXActivity;->k()V

    return-void
.end method

.method private j()V
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/nux/NUXActivity;->q:Lcom/facebook/orca/nux/NuxIntroView;

    new-instance v1, Lcom/facebook/orca/nux/c;

    invoke-direct {v1, p0}, Lcom/facebook/orca/nux/c;-><init>(Lcom/facebook/orca/nux/NUXActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/nux/NuxIntroView;->setOnNextClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    return-void
.end method

.method private k()V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0}, Lcom/facebook/orca/nux/NUXActivity;->l()V

    .line 65
    return-void
.end method

.method private l()V
    .locals 2

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/orca/nux/NUXActivity;->s:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->n()V

    .line 69
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 70
    iget-object v1, p0, Lcom/facebook/orca/nux/NUXActivity;->r:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 71
    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NUXActivity;->startActivity(Landroid/content/Intent;)V

    .line 72
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NUXActivity;->finish()V

    .line 73
    return-void
.end method


# virtual methods
.method protected a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 37
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->a(Landroid/os/Bundle;)V

    .line 38
    sget v0, Lcom/facebook/k;->nux:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NUXActivity;->setContentView(I)V

    .line 39
    return-void
.end method

.method protected b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NUXActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 44
    const-class v0, Lcom/facebook/orca/nux/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/h;

    iput-object v0, p0, Lcom/facebook/orca/nux/NUXActivity;->s:Lcom/facebook/orca/nux/h;

    .line 45
    const-class v0, Landroid/content/ComponentName;

    const-class v2, Lcom/facebook/orca/threadlist/ForThreadListActivity;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    iput-object v0, p0, Lcom/facebook/orca/nux/NUXActivity;->r:Landroid/content/ComponentName;

    .line 47
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 49
    sget v0, Lcom/facebook/i;->nux_intro:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NUXActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/NuxIntroView;

    iput-object v0, p0, Lcom/facebook/orca/nux/NUXActivity;->q:Lcom/facebook/orca/nux/NuxIntroView;

    .line 50
    invoke-direct {p0}, Lcom/facebook/orca/nux/NUXActivity;->j()V

    .line 51
    iget-object v0, p0, Lcom/facebook/orca/nux/NUXActivity;->q:Lcom/facebook/orca/nux/NuxIntroView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxIntroView;->f()V

    .line 52
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 32
    sget-object v0, Lcom/facebook/analytics/f/a;->NUX_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
