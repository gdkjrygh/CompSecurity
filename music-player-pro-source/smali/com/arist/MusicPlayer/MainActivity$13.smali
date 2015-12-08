.class Lcom/arist/MusicPlayer/MainActivity$13;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->createSleepSetDlg(Landroid/view/View;Landroid/widget/EditText;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;

.field private final synthetic val$et:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;Landroid/widget/EditText;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iput-object p2, p0, Lcom/arist/MusicPlayer/MainActivity$13;->val$et:Landroid/widget/EditText;

    .line 423
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/arist/MusicPlayer/MainActivity$13;)Lcom/arist/MusicPlayer/MainActivity;
    .locals 1

    .prologue
    .line 423
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 10
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    const/4 v7, 0x1

    .line 426
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$13;->val$et:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 427
    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 426
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->access$40(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 429
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 430
    .local v6, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v0, "sleep_time"

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->sleepTime:I
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$41(Lcom/arist/MusicPlayer/MainActivity;)I

    move-result v1

    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 431
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->sleepTime:I
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$41(Lcom/arist/MusicPlayer/MainActivity;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    .line 432
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 431
    add-long v8, v0, v2

    .line 434
    .local v8, "sleepTimeMillis":J
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    invoke-static {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->access$42(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/Timer;)V

    .line 435
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->sleepTimer:Ljava/util/Timer;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$39(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/Timer;

    move-result-object v0

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$13$1;

    invoke-direct {v1, p0, v8, v9}, Lcom/arist/MusicPlayer/MainActivity$13$1;-><init>(Lcom/arist/MusicPlayer/MainActivity$13;J)V

    .line 445
    const-wide/16 v2, 0x0

    const-wide/32 v4, 0xea60

    .line 435
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 447
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-static {v0, v7}, Lcom/arist/MusicPlayer/MainActivity;->access$38(Lcom/arist/MusicPlayer/MainActivity;Z)V

    .line 449
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 451
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const v2, 0x7f080055

    invoke-virtual {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 452
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->sleepTime:I
    invoke-static {v4}, Lcom/arist/MusicPlayer/MainActivity;->access$41(Lcom/arist/MusicPlayer/MainActivity;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    .line 450
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 448
    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 453
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 454
    return-void
.end method
