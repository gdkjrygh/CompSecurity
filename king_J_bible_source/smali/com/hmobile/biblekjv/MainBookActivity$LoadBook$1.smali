.class Lcom/hmobile/biblekjv/MainBookActivity$LoadBook$1;
.super Ljava/lang/Object;
.source "MainBookActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->onPostExecute(Ljava/lang/Void;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook$1;->this$1:Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;

    .line 494
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 497
    const-wide/16 v2, 0x1388

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 498
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook$1;->this$1:Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->access$2(Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;)Lcom/hmobile/biblekjv/MainBookActivity;

    move-result-object v1

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->handler:Landroid/os/Handler;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$1(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 502
    :goto_0
    return-void

    .line 499
    :catch_0
    move-exception v0

    .line 500
    .local v0, "e":Ljava/lang/InterruptedException;
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method
