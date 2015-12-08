.class public Lcom/arist/Adapter/MusicAdapter;
.super Landroid/widget/BaseAdapter;
.source "MusicAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arist/Adapter/MusicAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private f_context:Landroid/content/Context;

.field private inflater:Landroid/view/LayoutInflater;

.field private musics:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;"
        }
    .end annotation
.end field


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
            "Lcom/arist/entity/Music;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 41
    .local p2, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/arist/Adapter/MusicAdapter;->f_context:Landroid/content/Context;

    .line 43
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/Adapter/MusicAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 44
    invoke-virtual {p0, p2}, Lcom/arist/Adapter/MusicAdapter;->setData(Ljava/util/ArrayList;)V

    .line 45
    return-void
.end method

.method static synthetic access$0(Lcom/arist/Adapter/MusicAdapter;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/arist/Adapter/MusicAdapter;->f_context:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$1(Lcom/arist/Adapter/MusicAdapter;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/arist/Adapter/MusicAdapter;->musics:Ljava/util/ArrayList;

    return-object v0
.end method


# virtual methods
.method public changeData(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 30
    .local p1, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    invoke-virtual {p0, p1}, Lcom/arist/Adapter/MusicAdapter;->setData(Ljava/util/ArrayList;)V

    .line 31
    invoke-virtual {p0}, Lcom/arist/Adapter/MusicAdapter;->notifyDataSetChanged()V

    .line 32
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/arist/Adapter/MusicAdapter;->musics:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 54
    iget-object v0, p0, Lcom/arist/Adapter/MusicAdapter;->musics:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 59
    iget-object v0, p0, Lcom/arist/Adapter/MusicAdapter;->musics:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/entity/Music;

    invoke-virtual {v0}, Lcom/arist/entity/Music;->getId()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 78
    iget-object v3, p0, Lcom/arist/Adapter/MusicAdapter;->inflater:Landroid/view/LayoutInflater;

    const v4, 0x7f030013

    invoke-virtual {v3, v4, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 79
    new-instance v1, Lcom/arist/Adapter/MusicAdapter$ViewHolder;

    invoke-direct {v1, p0, v6}, Lcom/arist/Adapter/MusicAdapter$ViewHolder;-><init>(Lcom/arist/Adapter/MusicAdapter;Lcom/arist/Adapter/MusicAdapter$ViewHolder;)V

    .line 81
    .local v1, "holder":Lcom/arist/Adapter/MusicAdapter$ViewHolder;
    const v3, 0x7f0d004f

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 80
    invoke-static {v1, v3}, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->access$1(Lcom/arist/Adapter/MusicAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 83
    const v3, 0x7f0d0050

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 82
    invoke-static {v1, v3}, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->access$2(Lcom/arist/Adapter/MusicAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 85
    const v3, 0x7f0d0055

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 84
    invoke-static {v1, v3}, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->access$3(Lcom/arist/Adapter/MusicAdapter$ViewHolder;Landroid/widget/ImageView;)V

    .line 87
    const v3, 0x7f0d0056

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    .line 86
    invoke-static {v1, v3}, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->access$4(Lcom/arist/Adapter/MusicAdapter$ViewHolder;Landroid/widget/RelativeLayout;)V

    .line 88
    # getter for: Lcom/arist/Adapter/MusicAdapter$ViewHolder;->frm_menu_layout:Landroid/widget/RelativeLayout;
    invoke-static {v1}, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->access$5(Lcom/arist/Adapter/MusicAdapter$ViewHolder;)Landroid/widget/RelativeLayout;

    move-result-object v3

    new-instance v4, Lcom/arist/Adapter/MusicAdapter$1;

    invoke-direct {v4, p0, p1}, Lcom/arist/Adapter/MusicAdapter$1;-><init>(Lcom/arist/Adapter/MusicAdapter;I)V

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    iget-object v3, p0, Lcom/arist/Adapter/MusicAdapter;->musics:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/arist/entity/Music;

    .line 98
    .local v2, "music":Lcom/arist/entity/Music;
    invoke-virtual {v2}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 99
    const v3, 0x7f020094

    invoke-virtual {p2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 102
    :goto_0
    # getter for: Lcom/arist/Adapter/MusicAdapter$ViewHolder;->tvMusicTitle:Landroid/widget/TextView;
    invoke-static {v1}, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->access$6(Lcom/arist/Adapter/MusicAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    # getter for: Lcom/arist/Adapter/MusicAdapter$ViewHolder;->tvMusicDes:Landroid/widget/TextView;
    invoke-static {v1}, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->access$7(Lcom/arist/Adapter/MusicAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/arist/entity/Music;->getArtist()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, " - "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v2}, Lcom/arist/entity/Music;->getAlbum()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    invoke-static {v2}, Lcom/arist/util/AlbumPicUtil;->getAlbumBitmap(Lcom/arist/entity/Music;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 107
    .local v0, "bmp":Landroid/graphics/Bitmap;
    if-nez v0, :cond_1

    .line 108
    # getter for: Lcom/arist/Adapter/MusicAdapter$ViewHolder;->albumPic:Landroid/widget/ImageView;
    invoke-static {v1}, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->access$8(Lcom/arist/Adapter/MusicAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    const v4, 0x7f020056

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 113
    :goto_1
    return-object p2

    .line 101
    .end local v0    # "bmp":Landroid/graphics/Bitmap;
    :cond_0
    invoke-static {v5, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    invoke-virtual {p2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_0

    .line 110
    .restart local v0    # "bmp":Landroid/graphics/Bitmap;
    :cond_1
    # getter for: Lcom/arist/Adapter/MusicAdapter$ViewHolder;->albumPic:Landroid/widget/ImageView;
    invoke-static {v1}, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->access$8(Lcom/arist/Adapter/MusicAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1
.end method

.method public setData(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 35
    .local p1, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    if-eqz p1, :cond_0

    .line 36
    iput-object p1, p0, Lcom/arist/Adapter/MusicAdapter;->musics:Ljava/util/ArrayList;

    .line 39
    :goto_0
    return-void

    .line 38
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/Adapter/MusicAdapter;->musics:Ljava/util/ArrayList;

    goto :goto_0
.end method
