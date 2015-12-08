.class public Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;
.super Landroid/os/AsyncTask;
.source "MainBookActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/MainBookActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LoadBook"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;)V
    .locals 0

    .prologue
    .line 472
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method static synthetic access$2(Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;)Lcom/hmobile/biblekjv/MainBookActivity;
    .locals 1

    .prologue
    .line 472
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    return-object v0
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 479
    const-wide/16 v2, 0x64

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 483
    :goto_0
    const/4 v1, 0x0

    return-object v1

    .line 480
    :catch_0
    move-exception v0

    .line 481
    .local v0, "e":Ljava/lang/InterruptedException;
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 4
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    .line 488
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 489
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v1, v1, Lcom/hmobile/biblekjv/MainBookActivity;->settings:Landroid/content/SharedPreferences;

    const-string v2, "navigation_fade"

    .line 490
    const/4 v3, 0x1

    .line 489
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lcom/hmobile/biblekjv/MainBookActivity;->navigationfade_global:Z

    .line 491
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-boolean v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->navigationfade_global:Z

    if-eqz v0, :cond_0

    .line 492
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->llNavigationFade:Landroid/widget/LinearLayout;
    invoke-static {v0}, Lcom/hmobile/biblekjv/MainBookActivity;->access$0(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 494
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook$1;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook$1;-><init>(Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 503
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 504
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/MainBookActivity;->loadData()V

    .line 506
    return-void
.end method
