.class public Lcom/facebook/auth/viewercontext/h;
.super Lcom/facebook/base/activity/a;
.source "ViewerContextManagerImpl.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    return-void
.end method


# virtual methods
.method public f(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 110
    invoke-super {p0, p1}, Lcom/facebook/base/activity/a;->f(Landroid/app/Activity;)V

    .line 112
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 113
    const-string v1, "com.facebook.orca.auth.OVERRIDDEN_VIEWER_CONTEXT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 114
    if-eqz v0, :cond_0

    .line 116
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 117
    const-class v2, Lcom/facebook/auth/viewercontext/e;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/viewercontext/e;

    .line 118
    invoke-interface {v1, v0}, Lcom/facebook/auth/viewercontext/e;->a(Lcom/facebook/auth/viewercontext/ViewerContext;)V

    .line 120
    :cond_0
    return-void
.end method
