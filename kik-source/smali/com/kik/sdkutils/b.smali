.class final Lcom/kik/sdkutils/b;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/support/v4/app/Fragment;

.field final synthetic b:Lcom/kik/g/i;


# direct methods
.method constructor <init>(Landroid/support/v4/app/Fragment;Lcom/kik/g/i;)V
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/kik/sdkutils/b;->a:Landroid/support/v4/app/Fragment;

    iput-object p2, p0, Lcom/kik/sdkutils/b;->b:Lcom/kik/g/i;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 58
    iget-object v0, p0, Lcom/kik/sdkutils/b;->a:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 60
    if-nez v0, :cond_0

    .line 71
    :goto_0
    return-void

    .line 64
    :cond_0
    new-instance v1, Lcom/kik/sdkutils/c;

    invoke-direct {v1, p0, p1, p2}, Lcom/kik/sdkutils/c;-><init>(Lcom/kik/sdkutils/b;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
