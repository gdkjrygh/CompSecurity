.class final Lcom/kik/sdkutils/i;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/support/v4/app/Fragment;

.field final synthetic b:Lcom/kik/g/p;


# direct methods
.method constructor <init>(Landroid/support/v4/app/Fragment;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/kik/sdkutils/i;->a:Landroid/support/v4/app/Fragment;

    iput-object p2, p0, Lcom/kik/sdkutils/i;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 108
    iget-object v0, p0, Lcom/kik/sdkutils/i;->a:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 110
    if-nez v0, :cond_0

    .line 121
    :goto_0
    return-void

    .line 114
    :cond_0
    new-instance v1, Lcom/kik/sdkutils/l;

    invoke-direct {v1, p0, p1}, Lcom/kik/sdkutils/l;-><init>(Lcom/kik/sdkutils/i;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lcom/kik/sdkutils/i;->a:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 74
    if-nez v0, :cond_0

    .line 85
    :goto_0
    return-void

    .line 78
    :cond_0
    new-instance v1, Lcom/kik/sdkutils/j;

    invoke-direct {v1, p0}, Lcom/kik/sdkutils/j;-><init>(Lcom/kik/sdkutils/i;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 90
    iget-object v0, p0, Lcom/kik/sdkutils/i;->a:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 92
    if-nez v0, :cond_0

    .line 103
    :goto_0
    return-void

    .line 96
    :cond_0
    new-instance v1, Lcom/kik/sdkutils/k;

    invoke-direct {v1, p0, p1}, Lcom/kik/sdkutils/k;-><init>(Lcom/kik/sdkutils/i;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
