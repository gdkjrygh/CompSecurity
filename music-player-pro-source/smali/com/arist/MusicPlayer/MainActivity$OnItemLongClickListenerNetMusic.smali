.class Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerNetMusic;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "OnItemLongClickListenerNetMusic"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemLongClickListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 947
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 2
    .param p2, "arg1"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)Z"
        }
    .end annotation

    .prologue
    .line 950
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->netMusicAdapter:Lcom/arist/Adapter/NetMusicAdapter;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$16(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/NetMusicAdapter;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/arist/Adapter/NetMusicAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yong/jamendo/api/JamendoMusic;

    iput-object v0, v1, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    .line 951
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->showDialog(I)V

    .line 952
    const/4 v0, 0x1

    return v0
.end method
