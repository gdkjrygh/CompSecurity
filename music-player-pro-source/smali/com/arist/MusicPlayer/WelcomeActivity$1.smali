.class Lcom/arist/MusicPlayer/WelcomeActivity$1;
.super Landroid/os/Handler;
.source "WelcomeActivity.java"


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
    iput-object p1, p0, Lcom/arist/MusicPlayer/WelcomeActivity$1;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    .line 54
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 56
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$1;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    # getter for: Lcom/arist/MusicPlayer/WelcomeActivity;->tvWelcome:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$0(Lcom/arist/MusicPlayer/WelcomeActivity;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f080035

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 57
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 58
    return-void
.end method
