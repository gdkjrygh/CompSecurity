.class Landroid_src/mms/g/g;
.super Ljava/lang/Object;
.source "DownloadManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid_src/mms/g/d;


# direct methods
.method constructor <init>(Landroid_src/mms/g/d;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Landroid_src/mms/g/g;->a:Landroid_src/mms/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 139
    iget-object v0, p0, Landroid_src/mms/g/g;->a:Landroid_src/mms/g/d;

    invoke-static {v0}, Landroid_src/mms/g/d;->a(Landroid_src/mms/g/d;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/facebook/o;->service_message_not_found:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 141
    return-void
.end method
