.class Lcom/arist/Adapter/FolderAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "FolderAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/Adapter/FolderAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ViewHolder"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/Adapter/FolderAdapter;

.field private tvMusicFolderDes:Landroid/widget/TextView;

.field private tvMusicFolderTitle:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Lcom/arist/Adapter/FolderAdapter;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/arist/Adapter/FolderAdapter$ViewHolder;->this$0:Lcom/arist/Adapter/FolderAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/Adapter/FolderAdapter;Lcom/arist/Adapter/FolderAdapter$ViewHolder;)V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0, p1}, Lcom/arist/Adapter/FolderAdapter$ViewHolder;-><init>(Lcom/arist/Adapter/FolderAdapter;)V

    return-void
.end method

.method static synthetic access$1(Lcom/arist/Adapter/FolderAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/arist/Adapter/FolderAdapter$ViewHolder;->tvMusicFolderTitle:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$2(Lcom/arist/Adapter/FolderAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/arist/Adapter/FolderAdapter$ViewHolder;->tvMusicFolderDes:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$3(Lcom/arist/Adapter/FolderAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/arist/Adapter/FolderAdapter$ViewHolder;->tvMusicFolderTitle:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$4(Lcom/arist/Adapter/FolderAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/arist/Adapter/FolderAdapter$ViewHolder;->tvMusicFolderDes:Landroid/widget/TextView;

    return-object v0
.end method
