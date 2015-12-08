.class Lcom/arist/Adapter/MusicAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "MusicAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/Adapter/MusicAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ViewHolder"
.end annotation


# instance fields
.field private albumPic:Landroid/widget/ImageView;

.field private frm_menu_layout:Landroid/widget/RelativeLayout;

.field final synthetic this$0:Lcom/arist/Adapter/MusicAdapter;

.field private tvMusicDes:Landroid/widget/TextView;

.field private tvMusicTitle:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Lcom/arist/Adapter/MusicAdapter;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->this$0:Lcom/arist/Adapter/MusicAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/Adapter/MusicAdapter;Lcom/arist/Adapter/MusicAdapter$ViewHolder;)V
    .locals 0

    .prologue
    .line 116
    invoke-direct {p0, p1}, Lcom/arist/Adapter/MusicAdapter$ViewHolder;-><init>(Lcom/arist/Adapter/MusicAdapter;)V

    return-void
.end method

.method static synthetic access$1(Lcom/arist/Adapter/MusicAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->tvMusicTitle:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$2(Lcom/arist/Adapter/MusicAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->tvMusicDes:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$3(Lcom/arist/Adapter/MusicAdapter$ViewHolder;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->albumPic:Landroid/widget/ImageView;

    return-void
.end method

.method static synthetic access$4(Lcom/arist/Adapter/MusicAdapter$ViewHolder;Landroid/widget/RelativeLayout;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->frm_menu_layout:Landroid/widget/RelativeLayout;

    return-void
.end method

.method static synthetic access$5(Lcom/arist/Adapter/MusicAdapter$ViewHolder;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->frm_menu_layout:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic access$6(Lcom/arist/Adapter/MusicAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->tvMusicTitle:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$7(Lcom/arist/Adapter/MusicAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->tvMusicDes:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$8(Lcom/arist/Adapter/MusicAdapter$ViewHolder;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/arist/Adapter/MusicAdapter$ViewHolder;->albumPic:Landroid/widget/ImageView;

    return-object v0
.end method
