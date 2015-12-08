.class Lcom/umeng/common/net/j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/umeng/common/net/DownloadingService$b;


# direct methods
.method constructor <init>(Lcom/umeng/common/net/DownloadingService$b;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/common/net/j;->a:Lcom/umeng/common/net/DownloadingService$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/umeng/common/net/j;->a:Lcom/umeng/common/net/DownloadingService$b;

    invoke-static {v0}, Lcom/umeng/common/net/DownloadingService$b;->b(Lcom/umeng/common/net/DownloadingService$b;)Lcom/umeng/common/net/DownloadingService;

    move-result-object v0

    iget-object v1, p0, Lcom/umeng/common/net/j;->a:Lcom/umeng/common/net/DownloadingService$b;

    invoke-static {v1}, Lcom/umeng/common/net/DownloadingService$b;->a(Lcom/umeng/common/net/DownloadingService$b;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/umeng/common/a/c;->h(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method
