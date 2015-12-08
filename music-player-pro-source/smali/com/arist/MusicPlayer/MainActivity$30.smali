.class Lcom/arist/MusicPlayer/MainActivity$30;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->onCreateDialog(I)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;

.field private final synthetic val$etAlbum:Landroid/widget/EditText;

.field private final synthetic val$etArtist:Landroid/widget/EditText;

.field private final synthetic val$etName:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$30;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iput-object p2, p0, Lcom/arist/MusicPlayer/MainActivity$30;->val$etName:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/arist/MusicPlayer/MainActivity$30;->val$etAlbum:Landroid/widget/EditText;

    iput-object p4, p0, Lcom/arist/MusicPlayer/MainActivity$30;->val$etArtist:Landroid/widget/EditText;

    .line 1508
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v2, 0x3

    .line 1510
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$30;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v0, v0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$30;->val$etName:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    .line 1511
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$30;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v0, v0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$30;->val$etAlbum:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    .line 1512
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$30;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v0, v0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$30;->val$etArtist:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    .line 1513
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$30;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$5(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicDao;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$30;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v1, v1, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v0, v1}, Lcom/arist/dao/MusicDao;->updateMusic(Lcom/arist/entity/Music;)I

    .line 1514
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$30;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$15(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/MusicAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/Adapter/MusicAdapter;->notifyDataSetChanged()V

    .line 1515
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$30;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v2}, Lcom/arist/MusicPlayer/MainActivity;->dismissDialog(I)V

    .line 1516
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$30;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v2}, Lcom/arist/MusicPlayer/MainActivity;->removeDialog(I)V

    .line 1517
    return-void
.end method
