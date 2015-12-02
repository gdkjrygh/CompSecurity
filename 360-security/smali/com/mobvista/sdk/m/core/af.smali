.class final Lcom/mobvista/sdk/m/core/af;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/ac;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/ac;)V
    .locals 0

    .prologue
    .line 477
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/af;->a:Lcom/mobvista/sdk/m/core/ac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 481
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/af;->a:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->h(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/af;->a:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->h(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 482
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/af;->a:Lcom/mobvista/sdk/m/core/ac;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/ac;->h(Lcom/mobvista/sdk/m/core/ac;)Lcom/mobvista/sdk/m/core/loader/JumpLoader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader;->b()V

    .line 487
    :cond_0
    return-void
.end method
