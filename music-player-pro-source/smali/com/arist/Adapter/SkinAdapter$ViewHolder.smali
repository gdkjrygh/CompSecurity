.class Lcom/arist/Adapter/SkinAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "SkinAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/Adapter/SkinAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ViewHolder"
.end annotation


# instance fields
.field private iv:Landroid/widget/ImageView;

.field private ivSkinChecked:Landroid/widget/ImageView;

.field final synthetic this$0:Lcom/arist/Adapter/SkinAdapter;


# direct methods
.method constructor <init>(Lcom/arist/Adapter/SkinAdapter;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/arist/Adapter/SkinAdapter$ViewHolder;->this$0:Lcom/arist/Adapter/SkinAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/arist/Adapter/SkinAdapter$ViewHolder;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/arist/Adapter/SkinAdapter$ViewHolder;->iv:Landroid/widget/ImageView;

    return-void
.end method

.method static synthetic access$1(Lcom/arist/Adapter/SkinAdapter$ViewHolder;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/arist/Adapter/SkinAdapter$ViewHolder;->ivSkinChecked:Landroid/widget/ImageView;

    return-void
.end method

.method static synthetic access$2(Lcom/arist/Adapter/SkinAdapter$ViewHolder;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/arist/Adapter/SkinAdapter$ViewHolder;->iv:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$3(Lcom/arist/Adapter/SkinAdapter$ViewHolder;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/arist/Adapter/SkinAdapter$ViewHolder;->ivSkinChecked:Landroid/widget/ImageView;

    return-object v0
.end method
