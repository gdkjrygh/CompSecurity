.class Lcom/arist/Adapter/MusicAdapter$1;
.super Ljava/lang/Object;
.source "MusicAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/Adapter/MusicAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/Adapter/MusicAdapter;

.field private final synthetic val$position:I


# direct methods
.method constructor <init>(Lcom/arist/Adapter/MusicAdapter;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/Adapter/MusicAdapter$1;->this$0:Lcom/arist/Adapter/MusicAdapter;

    iput p2, p0, Lcom/arist/Adapter/MusicAdapter$1;->val$position:I

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 91
    iget-object v0, p0, Lcom/arist/Adapter/MusicAdapter$1;->this$0:Lcom/arist/Adapter/MusicAdapter;

    # getter for: Lcom/arist/Adapter/MusicAdapter;->f_context:Landroid/content/Context;
    invoke-static {v0}, Lcom/arist/Adapter/MusicAdapter;->access$0(Lcom/arist/Adapter/MusicAdapter;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/arist/MusicPlayer/MainActivity;

    iget-object v1, p0, Lcom/arist/Adapter/MusicAdapter$1;->this$0:Lcom/arist/Adapter/MusicAdapter;

    # getter for: Lcom/arist/Adapter/MusicAdapter;->musics:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/arist/Adapter/MusicAdapter;->access$1(Lcom/arist/Adapter/MusicAdapter;)Ljava/util/ArrayList;

    move-result-object v1

    iget v2, p0, Lcom/arist/Adapter/MusicAdapter$1;->val$position:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/arist/entity/Music;

    iput-object v1, v0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    .line 92
    iget-object v0, p0, Lcom/arist/Adapter/MusicAdapter$1;->this$0:Lcom/arist/Adapter/MusicAdapter;

    # getter for: Lcom/arist/Adapter/MusicAdapter;->f_context:Landroid/content/Context;
    invoke-static {v0}, Lcom/arist/Adapter/MusicAdapter;->access$0(Lcom/arist/Adapter/MusicAdapter;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/arist/MusicPlayer/MainActivity;

    .line 93
    iget-object v1, p0, Lcom/arist/Adapter/MusicAdapter$1;->this$0:Lcom/arist/Adapter/MusicAdapter;

    # getter for: Lcom/arist/Adapter/MusicAdapter;->f_context:Landroid/content/Context;
    invoke-static {v1}, Lcom/arist/Adapter/MusicAdapter;->access$0(Lcom/arist/Adapter/MusicAdapter;)Landroid/content/Context;

    move-result-object v1

    check-cast v1, Lcom/arist/MusicPlayer/MainActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->showDialog(I)V

    .line 94
    return-void
.end method
