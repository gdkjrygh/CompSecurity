.class Lcom/umeng/common/net/f;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field final synthetic a:Lcom/umeng/common/net/DownloadingService;


# direct methods
.method constructor <init>(Lcom/umeng/common/net/DownloadingService;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/common/net/f;->a:Lcom/umeng/common/net/DownloadingService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/umeng/common/net/f;->a:Lcom/umeng/common/net/DownloadingService;

    invoke-static {v0, p1, p2}, Lcom/umeng/common/net/DownloadingService;->a(Lcom/umeng/common/net/DownloadingService;Landroid/content/Context;Landroid/content/Intent;)Z

    return-void
.end method
