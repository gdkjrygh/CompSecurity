.class Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerMusic;
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
    name = "OnItemLongClickListenerMusic"
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
    .line 957
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 3
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
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    const/4 v2, 0x1

    .line 960
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$15(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/MusicAdapter;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/arist/Adapter/MusicAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/entity/Music;

    iput-object v0, v1, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    .line 961
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v2}, Lcom/arist/MusicPlayer/MainActivity;->showDialog(I)V

    .line 962
    return v2
.end method
