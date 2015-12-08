.class public Lcom/arist/Adapter/FolderAdapter;
.super Landroid/widget/BaseAdapter;
.source "FolderAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arist/Adapter/FolderAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private folders:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/MusicFolder;",
            ">;"
        }
    .end annotation
.end field

.field private inflater:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/MusicFolder;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 34
    .local p2, "folders":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/MusicFolder;>;"
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 35
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/Adapter/FolderAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 36
    invoke-virtual {p0, p2}, Lcom/arist/Adapter/FolderAdapter;->setData(Ljava/util/ArrayList;)V

    .line 37
    return-void
.end method


# virtual methods
.method public changeData(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/MusicFolder;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 23
    .local p1, "folders":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/MusicFolder;>;"
    invoke-virtual {p0, p1}, Lcom/arist/Adapter/FolderAdapter;->setData(Ljava/util/ArrayList;)V

    .line 24
    invoke-virtual {p0}, Lcom/arist/Adapter/FolderAdapter;->notifyDataSetChanged()V

    .line 25
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/arist/Adapter/FolderAdapter;->folders:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 46
    iget-object v0, p0, Lcom/arist/Adapter/FolderAdapter;->folders:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 51
    iget-object v0, p0, Lcom/arist/Adapter/FolderAdapter;->folders:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/entity/MusicFolder;

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getId()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 57
    if-nez p2, :cond_1

    .line 58
    iget-object v2, p0, Lcom/arist/Adapter/FolderAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 59
    const v3, 0x7f030010

    invoke-virtual {v2, v3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 60
    new-instance v1, Lcom/arist/Adapter/FolderAdapter$ViewHolder;

    invoke-direct {v1, p0, v5}, Lcom/arist/Adapter/FolderAdapter$ViewHolder;-><init>(Lcom/arist/Adapter/FolderAdapter;Lcom/arist/Adapter/FolderAdapter$ViewHolder;)V

    .line 62
    .local v1, "holder":Lcom/arist/Adapter/FolderAdapter$ViewHolder;
    const v2, 0x7f0d004f

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 61
    invoke-static {v1, v2}, Lcom/arist/Adapter/FolderAdapter$ViewHolder;->access$1(Lcom/arist/Adapter/FolderAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 64
    const v2, 0x7f0d0050

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 63
    invoke-static {v1, v2}, Lcom/arist/Adapter/FolderAdapter$ViewHolder;->access$2(Lcom/arist/Adapter/FolderAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 65
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 68
    :goto_0
    iget-object v2, p0, Lcom/arist/Adapter/FolderAdapter;->folders:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/entity/MusicFolder;

    .line 69
    .local v0, "folder":Lcom/arist/entity/MusicFolder;
    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicFolderPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 70
    const v2, 0x7f020095

    invoke-virtual {p2, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 74
    :goto_1
    # getter for: Lcom/arist/Adapter/FolderAdapter$ViewHolder;->tvMusicFolderTitle:Landroid/widget/TextView;
    invoke-static {v1}, Lcom/arist/Adapter/FolderAdapter$ViewHolder;->access$3(Lcom/arist/Adapter/FolderAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    const-string v2, "artist"

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 77
    const-string v2, "album"

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 78
    :cond_0
    # getter for: Lcom/arist/Adapter/FolderAdapter$ViewHolder;->tvMusicFolderDes:Landroid/widget/TextView;
    invoke-static {v1}, Lcom/arist/Adapter/FolderAdapter$ViewHolder;->access$4(Lcom/arist/Adapter/FolderAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getNum()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 79
    sget-object v4, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    const v5, 0x7f08005d

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 78
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    :goto_2
    return-object p2

    .line 67
    .end local v0    # "folder":Lcom/arist/entity/MusicFolder;
    .end local v1    # "holder":Lcom/arist/Adapter/FolderAdapter$ViewHolder;
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/arist/Adapter/FolderAdapter$ViewHolder;

    .restart local v1    # "holder":Lcom/arist/Adapter/FolderAdapter$ViewHolder;
    goto :goto_0

    .line 73
    .restart local v0    # "folder":Lcom/arist/entity/MusicFolder;
    :cond_2
    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    invoke-virtual {p2, v2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_1

    .line 81
    :cond_3
    # getter for: Lcom/arist/Adapter/FolderAdapter$ViewHolder;->tvMusicFolderDes:Landroid/widget/TextView;
    invoke-static {v1}, Lcom/arist/Adapter/FolderAdapter$ViewHolder;->access$4(Lcom/arist/Adapter/FolderAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getNum()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 82
    sget-object v4, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    const v5, 0x7f08005e

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 83
    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 81
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

.method public setData(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/MusicFolder;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 28
    .local p1, "folders":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/MusicFolder;>;"
    if-eqz p1, :cond_0

    .line 29
    iput-object p1, p0, Lcom/arist/Adapter/FolderAdapter;->folders:Ljava/util/ArrayList;

    .line 32
    :goto_0
    return-void

    .line 31
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/Adapter/FolderAdapter;->folders:Ljava/util/ArrayList;

    goto :goto_0
.end method
