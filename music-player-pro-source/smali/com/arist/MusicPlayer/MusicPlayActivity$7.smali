.class Lcom/arist/MusicPlayer/MusicPlayActivity$7;
.super Ljava/lang/Object;
.source "MusicPlayActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MusicPlayActivity;->initListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$7;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 180
    const/4 v1, 0x1

    sput-boolean v1, Lcom/arist/MusicPlayer/MyApplication;->showList:Z

    .line 182
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$7;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    .line 183
    const-class v2, Lcom/arist/MusicPlayer/MainActivity;

    .line 182
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 184
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$7;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    invoke-virtual {v1, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->startActivity(Landroid/content/Intent;)V

    .line 185
    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$7;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    const v2, 0x7f040002

    const v3, 0x7f040007

    invoke-virtual {v1, v2, v3}, Lcom/arist/MusicPlayer/MusicPlayActivity;->overridePendingTransition(II)V

    .line 187
    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$7;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    invoke-virtual {v1}, Lcom/arist/MusicPlayer/MusicPlayActivity;->finish()V

    .line 188
    return-void
.end method
