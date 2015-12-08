.class Lcom/arist/MusicPlayer/WelcomeActivity$2;
.super Ljava/lang/Object;
.source "WelcomeActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/WelcomeActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/WelcomeActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/WelcomeActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/WelcomeActivity$2;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 71
    :try_start_0
    iget-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity$2;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    # invokes: Lcom/arist/MusicPlayer/WelcomeActivity;->gotoMainActivity()V
    invoke-static {v1}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$1(Lcom/arist/MusicPlayer/WelcomeActivity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :goto_0
    return-void

    .line 72
    :catch_0
    move-exception v0

    .line 73
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
