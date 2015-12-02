.class Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;)V
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 60
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;->a:Ljava/lang/ref/WeakReference;

    .line 61
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    .line 68
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;

    .line 69
    if-nez v0, :cond_0

    .line 94
    :goto_0
    return-void

    .line 72
    :cond_0
    const/4 v2, -0x1

    .line 73
    const/4 v1, 0x0

    .line 74
    iget v3, p1, Landroid/os/Message;->what:I

    packed-switch v3, :pswitch_data_0

    .line 88
    :goto_1
    const/16 v3, 0x61b3

    iget-object v4, v0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v4, v4, Lcom/qihoo/security/ui/result/AdvData;->adid:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v4, v2, v1}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, v0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v2, v2, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    iget-object v3, v0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v3, v3, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->finish()V

    goto :goto_0

    .line 76
    :pswitch_0
    const/4 v2, 0x0

    .line 77
    const-string/jumbo v1, "30s timeout"

    goto :goto_1

    .line 80
    :pswitch_1
    iget v2, p1, Landroid/os/Message;->arg1:I

    .line 81
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    .line 74
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
