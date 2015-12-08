.class public Lcom/arist/Adapter/NetMusicAdapter;
.super Landroid/widget/BaseAdapter;
.source "NetMusicAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private callback:Lcom/arist/util/AsyncImageLoader$Callback;

.field private f_context:Landroid/content/Context;

.field private inflater:Landroid/view/LayoutInflater;

.field private loader:Lcom/arist/util/AsyncImageLoader;

.field private netMusics:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/jamendo/api/JamendoMusic;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Landroid/widget/ListView;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p3, "lvNetMusics"    # Landroid/widget/ListView;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/jamendo/api/JamendoMusic;",
            ">;",
            "Landroid/widget/ListView;",
            ")V"
        }
    .end annotation

    .prologue
    .line 42
    .local p2, "netMusics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/yong/jamendo/api/JamendoMusic;>;"
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/arist/Adapter/NetMusicAdapter;->f_context:Landroid/content/Context;

    .line 45
    invoke-virtual {p0, p2}, Lcom/arist/Adapter/NetMusicAdapter;->setNetMusics(Ljava/util/ArrayList;)V

    .line 46
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 47
    new-instance v0, Lcom/arist/Adapter/NetMusicAdapter$1;

    invoke-direct {v0, p0, p3}, Lcom/arist/Adapter/NetMusicAdapter$1;-><init>(Lcom/arist/Adapter/NetMusicAdapter;Landroid/widget/ListView;)V

    iput-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter;->callback:Lcom/arist/util/AsyncImageLoader$Callback;

    .line 54
    new-instance v0, Lcom/arist/util/AsyncImageLoader;

    invoke-direct {v0}, Lcom/arist/util/AsyncImageLoader;-><init>()V

    iput-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter;->loader:Lcom/arist/util/AsyncImageLoader;

    .line 55
    return-void
.end method

.method static synthetic access$0(Lcom/arist/Adapter/NetMusicAdapter;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter;->f_context:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$1(Lcom/arist/Adapter/NetMusicAdapter;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter;->netMusics:Ljava/util/ArrayList;

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
            "Lcom/yong/jamendo/api/JamendoMusic;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 58
    .local p1, "netMusics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/yong/jamendo/api/JamendoMusic;>;"
    invoke-virtual {p0, p1}, Lcom/arist/Adapter/NetMusicAdapter;->setNetMusics(Ljava/util/ArrayList;)V

    .line 59
    invoke-virtual {p0}, Lcom/arist/Adapter/NetMusicAdapter;->notifyDataSetChanged()V

    .line 60
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter;->netMusics:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 69
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter;->netMusics:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 74
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v5, 0x0

    .line 79
    const/4 v1, 0x0

    .line 80
    .local v1, "holder":Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;
    if-nez p2, :cond_0

    .line 81
    iget-object v3, p0, Lcom/arist/Adapter/NetMusicAdapter;->inflater:Landroid/view/LayoutInflater;

    const v4, 0x7f03001d

    invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 82
    new-instance v1, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;

    .end local v1    # "holder":Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;
    invoke-direct {v1, p0, v5}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;-><init>(Lcom/arist/Adapter/NetMusicAdapter;Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)V

    .line 84
    .restart local v1    # "holder":Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;
    const v3, 0x7f0d0087

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 83
    invoke-static {v1, v3}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$1(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;Landroid/widget/ImageView;)V

    .line 86
    const v3, 0x7f0d0089

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 85
    invoke-static {v1, v3}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$2(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 88
    const v3, 0x7f0d008a

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 87
    invoke-static {v1, v3}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$3(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 90
    const v3, 0x7f0d0088

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 89
    invoke-static {v1, v3}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$4(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 91
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 96
    :goto_0
    iget-object v3, p0, Lcom/arist/Adapter/NetMusicAdapter;->netMusics:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/yong/jamendo/api/JamendoMusic;

    .line 97
    .local v2, "netMusicTemp":Lcom/yong/jamendo/api/JamendoMusic;
    # getter for: Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->tvName:Landroid/widget/TextView;
    invoke-static {v1}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$5(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/yong/jamendo/api/JamendoMusic;->getMusic_name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    # getter for: Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->tvArtist:Landroid/widget/TextView;
    invoke-static {v1}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$6(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/yong/jamendo/api/JamendoMusic;->getArtistName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    # getter for: Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->tvDuration:Landroid/widget/TextView;
    invoke-static {v1}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$7(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v3

    .line 100
    invoke-virtual {v2}, Lcom/yong/jamendo/api/JamendoMusic;->getDuration()I

    move-result v4

    .line 99
    invoke-static {v4}, Lcom/arist/util/TimeFormat;->timeFormatInSecond(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    const v3, 0x7f0d0056

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    .line 101
    invoke-static {v1, v3}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$8(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;Landroid/widget/RelativeLayout;)V

    .line 103
    # getter for: Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->frm_menu_layout:Landroid/widget/RelativeLayout;
    invoke-static {v1}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$9(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/RelativeLayout;

    move-result-object v3

    new-instance v4, Lcom/arist/Adapter/NetMusicAdapter$2;

    invoke-direct {v4, p0, p1}, Lcom/arist/Adapter/NetMusicAdapter$2;-><init>(Lcom/arist/Adapter/NetMusicAdapter;I)V

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    # getter for: Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->ivAlbum:Landroid/widget/ImageView;
    invoke-static {v1}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$10(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/yong/jamendo/api/JamendoMusic;->getAlbum_image()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 118
    iget-object v3, p0, Lcom/arist/Adapter/NetMusicAdapter;->loader:Lcom/arist/util/AsyncImageLoader;

    iget-object v4, p0, Lcom/arist/Adapter/NetMusicAdapter;->callback:Lcom/arist/util/AsyncImageLoader$Callback;

    invoke-virtual {v3, v2, v4}, Lcom/arist/util/AsyncImageLoader;->loadImage(Lcom/yong/jamendo/api/JamendoMusic;Lcom/arist/util/AsyncImageLoader$Callback;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 119
    .local v0, "bm":Landroid/graphics/Bitmap;
    if-nez v0, :cond_1

    .line 120
    # getter for: Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->ivAlbum:Landroid/widget/ImageView;
    invoke-static {v1}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$10(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    const v4, 0x7f020056

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 123
    :goto_1
    return-object p2

    .line 93
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .end local v2    # "netMusicTemp":Lcom/yong/jamendo/api/JamendoMusic;
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "holder":Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;
    check-cast v1, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;

    .restart local v1    # "holder":Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;
    goto :goto_0

    .line 122
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    .restart local v2    # "netMusicTemp":Lcom/yong/jamendo/api/JamendoMusic;
    :cond_1
    # getter for: Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->ivAlbum:Landroid/widget/ImageView;
    invoke-static {v1}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->access$10(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1
.end method

.method public quit()V
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter;->loader:Lcom/arist/util/AsyncImageLoader;

    invoke-virtual {v0}, Lcom/arist/util/AsyncImageLoader;->quit()V

    .line 33
    return-void
.end method

.method public setNetMusics(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/jamendo/api/JamendoMusic;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 36
    .local p1, "netMusics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/yong/jamendo/api/JamendoMusic;>;"
    if-eqz p1, :cond_0

    .line 37
    iput-object p1, p0, Lcom/arist/Adapter/NetMusicAdapter;->netMusics:Ljava/util/ArrayList;

    .line 40
    :goto_0
    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter;->netMusics:Ljava/util/ArrayList;

    goto :goto_0
.end method
