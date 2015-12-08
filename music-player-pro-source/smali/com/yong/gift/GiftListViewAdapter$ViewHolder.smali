.class Lcom/yong/gift/GiftListViewAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "GiftListViewAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yong/gift/GiftListViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ViewHolder"
.end annotation


# instance fields
.field private ivIcon:Landroid/widget/ImageView;

.field final synthetic this$0:Lcom/yong/gift/GiftListViewAdapter;

.field private tvDetail:Landroid/widget/TextView;

.field private tvTitle:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Lcom/yong/gift/GiftListViewAdapter;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->this$0:Lcom/yong/gift/GiftListViewAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/yong/gift/GiftListViewAdapter;Lcom/yong/gift/GiftListViewAdapter$ViewHolder;)V
    .locals 0

    .prologue
    .line 103
    invoke-direct {p0, p1}, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;-><init>(Lcom/yong/gift/GiftListViewAdapter;)V

    return-void
.end method

.method static synthetic access$1(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->ivIcon:Landroid/widget/ImageView;

    return-void
.end method

.method static synthetic access$2(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$3(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->tvDetail:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$4(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$5(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->tvDetail:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$6(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->ivIcon:Landroid/widget/ImageView;

    return-object v0
.end method
