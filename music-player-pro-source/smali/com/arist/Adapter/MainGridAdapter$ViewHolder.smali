.class Lcom/arist/Adapter/MainGridAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "MainGridAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/Adapter/MainGridAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ViewHolder"
.end annotation


# instance fields
.field private ivButtonInfo:Landroid/widget/ImageView;

.field final synthetic this$0:Lcom/arist/Adapter/MainGridAdapter;

.field private tvButtonInfoDes:Landroid/widget/TextView;

.field private tvButtonInfoTitle:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Lcom/arist/Adapter/MainGridAdapter;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->this$0:Lcom/arist/Adapter/MainGridAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/Adapter/MainGridAdapter;Lcom/arist/Adapter/MainGridAdapter$ViewHolder;)V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0, p1}, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;-><init>(Lcom/arist/Adapter/MainGridAdapter;)V

    return-void
.end method

.method static synthetic access$1(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->ivButtonInfo:Landroid/widget/ImageView;

    return-void
.end method

.method static synthetic access$2(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->tvButtonInfoTitle:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$3(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->tvButtonInfoDes:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$4(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->ivButtonInfo:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$5(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->tvButtonInfoTitle:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$6(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->tvButtonInfoDes:Landroid/widget/TextView;

    return-object v0
.end method
