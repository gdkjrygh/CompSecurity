.class Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "GiftGridViewAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/coocent/android/xmlparser/GiftGridViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ViewHolder"
.end annotation


# instance fields
.field private ivIcon:Landroid/widget/ImageView;

.field private newIcon:Landroid/widget/ImageView;

.field final synthetic this$0:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

.field private tvTitle:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Lnet/coocent/android/xmlparser/GiftGridViewAdapter;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->this$0:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/coocent/android/xmlparser/GiftGridViewAdapter;Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;)V
    .locals 0

    .prologue
    .line 99
    invoke-direct {p0, p1}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;-><init>(Lnet/coocent/android/xmlparser/GiftGridViewAdapter;)V

    return-void
.end method

.method static synthetic access$1(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->ivIcon:Landroid/widget/ImageView;

    return-void
.end method

.method static synthetic access$2(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->newIcon:Landroid/widget/ImageView;

    return-void
.end method

.method static synthetic access$3(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$4(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$5(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->ivIcon:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$6(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->newIcon:Landroid/widget/ImageView;

    return-object v0
.end method
