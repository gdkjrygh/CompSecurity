.class Landroid_src/mms/g/h;
.super Ljava/lang/Object;
.source "DownloadManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/net/Uri;

.field final synthetic b:Landroid_src/mms/g/d;


# direct methods
.method constructor <init>(Landroid_src/mms/g/d;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Landroid_src/mms/g/h;->b:Landroid_src/mms/g/d;

    iput-object p2, p0, Landroid_src/mms/g/h;->a:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 157
    :try_start_0
    iget-object v0, p0, Landroid_src/mms/g/h;->b:Landroid_src/mms/g/d;

    invoke-static {v0}, Landroid_src/mms/g/d;->a(Landroid_src/mms/g/d;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Landroid_src/mms/g/h;->b:Landroid_src/mms/g/d;

    iget-object v2, p0, Landroid_src/mms/g/h;->a:Landroid/net/Uri;

    invoke-static {v1, v2}, Landroid_src/mms/g/d;->a(Landroid_src/mms/g/d;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Landroid_src/mms/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    :goto_0
    return-void

    .line 159
    :catch_0
    move-exception v0

    .line 160
    const-string v1, "DownloadManager"

    invoke-virtual {v0}, Landroid_src/mms/d;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
