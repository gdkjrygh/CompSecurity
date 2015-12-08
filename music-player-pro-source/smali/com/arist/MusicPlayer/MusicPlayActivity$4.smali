.class Lcom/arist/MusicPlayer/MusicPlayActivity$4;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$4;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 159
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$4;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # invokes: Lcom/arist/MusicPlayer/MusicPlayActivity;->doPlay()V
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$8(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    .line 160
    return-void
.end method
