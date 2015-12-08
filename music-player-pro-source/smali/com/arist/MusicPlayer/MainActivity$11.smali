.class Lcom/arist/MusicPlayer/MainActivity$11;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$11;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 368
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 371
    invoke-static {}, Lcom/arist/notify/MyNotiofation;->clearNotification()V

    .line 372
    const/4 v0, 0x3

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->status:I

    .line 373
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$11;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.MediaPlayer.action.STATUS_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 376
    new-instance v0, Lnet/coocent/android/exitwithrate/EnterAndExit;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$11;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {v0, v1}, Lnet/coocent/android/exitwithrate/EnterAndExit;-><init>(Landroid/app/Activity;)V

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$11;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-boolean v1, v1, Lcom/arist/MusicPlayer/MainActivity;->isExitAdLoad:Z

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$11;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v2, v2, Lcom/arist/MusicPlayer/MainActivity;->mExitAdview:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0, v1, v2}, Lnet/coocent/android/exitwithrate/EnterAndExit;->exitWithRate(ZLandroid/view/View;)V

    .line 377
    return-void
.end method
