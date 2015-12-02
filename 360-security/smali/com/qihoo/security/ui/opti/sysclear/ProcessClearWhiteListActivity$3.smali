.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/a/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V
    .locals 0

    .prologue
    .line 411
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 418
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->l(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 419
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 426
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->l(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 427
    return-void
.end method

.method public c()V
    .locals 0

    .prologue
    .line 434
    return-void
.end method
