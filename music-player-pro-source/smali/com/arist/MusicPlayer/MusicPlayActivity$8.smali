.class Lcom/arist/MusicPlayer/MusicPlayActivity$8;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$8;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 193
    sget v0, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput v0, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    .line 195
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$8;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    .line 196
    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$8;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->playModeStrArr:[Ljava/lang/String;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$11(Lcom/arist/MusicPlayer/MusicPlayActivity;)[Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    .line 197
    const/4 v2, 0x0

    .line 195
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 197
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 198
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$8;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPlayMode:Landroid/widget/ImageButton;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$12(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    .line 199
    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$8;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->playModeArr:[I
    invoke-static {v1}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$13(Lcom/arist/MusicPlayer/MusicPlayActivity;)[I

    move-result-object v1

    sget v2, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 200
    return-void

    .line 194
    :cond_0
    sget v0, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    goto :goto_0
.end method
