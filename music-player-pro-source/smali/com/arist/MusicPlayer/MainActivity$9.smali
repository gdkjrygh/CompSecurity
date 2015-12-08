.class Lcom/arist/MusicPlayer/MainActivity$9;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$9;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 335
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 338
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$9;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->isSleepOpened:Z
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$35(Lcom/arist/MusicPlayer/MainActivity;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 339
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$9;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->inflater:Landroid/view/LayoutInflater;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$36(Lcom/arist/MusicPlayer/MainActivity;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 340
    const v4, 0x7f030023

    const/4 v5, 0x0

    .line 339
    invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 342
    .local v2, "sleepView":Landroid/view/View;
    const v3, 0x7f0d00a1

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 341
    check-cast v1, Landroid/widget/EditText;

    .line 343
    .local v1, "et":Landroid/widget/EditText;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 344
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v4

    .line 345
    const-string v5, "sleep_time"

    const/16 v6, 0xf

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 344
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 343
    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 346
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$9;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->createSleepSetDlg(Landroid/view/View;Landroid/widget/EditText;)Landroid/app/Dialog;
    invoke-static {v3, v2, v1}, Lcom/arist/MusicPlayer/MainActivity;->access$37(Lcom/arist/MusicPlayer/MainActivity;Landroid/view/View;Landroid/widget/EditText;)Landroid/app/Dialog;

    move-result-object v0

    .line 347
    .local v0, "dialog":Landroid/app/Dialog;
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 355
    .end local v0    # "dialog":Landroid/app/Dialog;
    .end local v1    # "et":Landroid/widget/EditText;
    .end local v2    # "sleepView":Landroid/view/View;
    :goto_0
    return-void

    .line 349
    :cond_0
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$9;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/arist/MusicPlayer/MainActivity;->access$38(Lcom/arist/MusicPlayer/MainActivity;Z)V

    .line 350
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$9;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->sleepTimer:Ljava/util/Timer;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$39(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/Timer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Timer;->cancel()V

    .line 351
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$9;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 352
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$9;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const v5, 0x7f080054

    invoke-virtual {v4, v5}, Lcom/arist/MusicPlayer/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 353
    const/4 v5, 0x1

    .line 351
    invoke-static {v3, v4, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    .line 353
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
