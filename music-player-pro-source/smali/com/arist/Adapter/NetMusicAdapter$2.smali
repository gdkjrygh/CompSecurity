.class Lcom/arist/Adapter/NetMusicAdapter$2;
.super Ljava/lang/Object;
.source "NetMusicAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/Adapter/NetMusicAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/Adapter/NetMusicAdapter;

.field private final synthetic val$position:I


# direct methods
.method constructor <init>(Lcom/arist/Adapter/NetMusicAdapter;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/Adapter/NetMusicAdapter$2;->this$0:Lcom/arist/Adapter/NetMusicAdapter;

    iput p2, p0, Lcom/arist/Adapter/NetMusicAdapter$2;->val$position:I

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 106
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter$2;->this$0:Lcom/arist/Adapter/NetMusicAdapter;

    # getter for: Lcom/arist/Adapter/NetMusicAdapter;->f_context:Landroid/content/Context;
    invoke-static {v0}, Lcom/arist/Adapter/NetMusicAdapter;->access$0(Lcom/arist/Adapter/NetMusicAdapter;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/arist/MusicPlayer/MainActivity;

    iget-object v1, p0, Lcom/arist/Adapter/NetMusicAdapter$2;->this$0:Lcom/arist/Adapter/NetMusicAdapter;

    # getter for: Lcom/arist/Adapter/NetMusicAdapter;->netMusics:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/arist/Adapter/NetMusicAdapter;->access$1(Lcom/arist/Adapter/NetMusicAdapter;)Ljava/util/ArrayList;

    move-result-object v1

    .line 107
    iget v2, p0, Lcom/arist/Adapter/NetMusicAdapter$2;->val$position:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yong/jamendo/api/JamendoMusic;

    .line 106
    iput-object v1, v0, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    .line 108
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter$2;->this$0:Lcom/arist/Adapter/NetMusicAdapter;

    # getter for: Lcom/arist/Adapter/NetMusicAdapter;->f_context:Landroid/content/Context;
    invoke-static {v0}, Lcom/arist/Adapter/NetMusicAdapter;->access$0(Lcom/arist/Adapter/NetMusicAdapter;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/arist/MusicPlayer/MainActivity;

    .line 109
    iget-object v1, p0, Lcom/arist/Adapter/NetMusicAdapter$2;->this$0:Lcom/arist/Adapter/NetMusicAdapter;

    # getter for: Lcom/arist/Adapter/NetMusicAdapter;->f_context:Landroid/content/Context;
    invoke-static {v1}, Lcom/arist/Adapter/NetMusicAdapter;->access$0(Lcom/arist/Adapter/NetMusicAdapter;)Landroid/content/Context;

    move-result-object v1

    check-cast v1, Lcom/arist/MusicPlayer/MainActivity;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->showDialog(I)V

    .line 110
    return-void
.end method
