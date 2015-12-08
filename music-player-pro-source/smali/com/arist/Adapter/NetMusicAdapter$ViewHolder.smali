.class Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "NetMusicAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/Adapter/NetMusicAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ViewHolder"
.end annotation


# instance fields
.field private frm_menu_layout:Landroid/widget/RelativeLayout;

.field private ivAlbum:Landroid/widget/ImageView;

.field final synthetic this$0:Lcom/arist/Adapter/NetMusicAdapter;

.field private tvArtist:Landroid/widget/TextView;

.field private tvDuration:Landroid/widget/TextView;

.field private tvName:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Lcom/arist/Adapter/NetMusicAdapter;)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->this$0:Lcom/arist/Adapter/NetMusicAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/Adapter/NetMusicAdapter;Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)V
    .locals 0

    .prologue
    .line 126
    invoke-direct {p0, p1}, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;-><init>(Lcom/arist/Adapter/NetMusicAdapter;)V

    return-void
.end method

.method static synthetic access$1(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->ivAlbum:Landroid/widget/ImageView;

    return-void
.end method

.method static synthetic access$10(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->ivAlbum:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$2(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->tvName:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$3(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->tvArtist:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$4(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->tvDuration:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$5(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->tvName:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$6(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->tvArtist:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$7(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->tvDuration:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$8(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;Landroid/widget/RelativeLayout;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->frm_menu_layout:Landroid/widget/RelativeLayout;

    return-void
.end method

.method static synthetic access$9(Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/arist/Adapter/NetMusicAdapter$ViewHolder;->frm_menu_layout:Landroid/widget/RelativeLayout;

    return-object v0
.end method
