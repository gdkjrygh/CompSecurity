.class public Lcom/qihoo/security/gamebooster/GameBoosterActivity;
.super Lcom/qihoo/security/app/BaseSimpleActivity;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/widget/AbsListView$OnScrollListener;
.implements Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;
.implements Lcom/qihoo/security/gamebooster/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$8;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$i;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$j;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$a;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$m;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$l;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$g;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$f;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$b;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;,
        Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo/security/app/BaseSimpleActivity;",
        "Landroid/view/View$OnClickListener;",
        "Landroid/view/View$OnLongClickListener;",
        "Landroid/widget/AbsListView$OnScrollListener;",
        "Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;",
        "Lcom/qihoo/security/gamebooster/h",
        "<",
        "Lcom/qihoo/security/gamebooster/g;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private A:Landroid/view/View;

.field private B:I

.field private final C:Landroid/content/BroadcastReceiver;

.field private D:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/qihoo/security/gamebooster/g;

.field private c:Landroid/view/LayoutInflater;

.field private d:Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;

.field private e:Landroid/os/Handler;

.field private f:Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;

.field private g:Landroid/view/View;

.field private h:Landroid/view/View;

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;

.field private k:Landroid/content/pm/PackageManager;

.field private l:I

.field private m:I

.field private n:Ljava/lang/String;

.field private final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/ads/NativeAd;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private s:Landroid/view/View;

.field private t:Z

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation
.end field

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation
.end field

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation
.end field

.field private final y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private z:Lcom/qihoo/security/adv/a/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 90
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseSimpleActivity;-><init>()V

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c:Landroid/view/LayoutInflater;

    .line 114
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->i:Ljava/util/List;

    .line 117
    iput v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->l:I

    .line 118
    iput v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->m:I

    .line 120
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->o:Ljava/util/Map;

    .line 121
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->p:Ljava/util/Map;

    .line 122
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->q:Ljava/util/Map;

    .line 123
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 125
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->t:Z

    .line 132
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->y:Ljava/util/List;

    .line 137
    new-instance v0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$1;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->C:Landroid/content/BroadcastReceiver;

    .line 1390
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;I)I
    .locals 0

    .prologue
    .line 90
    iput p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->l:I

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->g:Landroid/view/View;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->n:Ljava/lang/String;

    return-object p1
.end method

.method private a(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 218
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1003

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 219
    if-eqz p1, :cond_0

    .line 220
    invoke-static {p0, p1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 222
    :cond_0
    return-void
.end method

.method private a(Landroid/view/View;Lcom/qihoo/security/ui/result/AdvData;)V
    .locals 3

    .prologue
    .line 707
    iget-object v0, p2, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    if-nez v0, :cond_2

    .line 708
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/s;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 709
    invoke-static {}, Lcom/qihoo/security/ui/result/a;->a()Lcom/qihoo/security/ui/result/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/qihoo/security/ui/result/a;->a(Lcom/qihoo/security/ui/result/AdvData;)V

    .line 727
    :cond_0
    :goto_0
    return-void

    .line 711
    :cond_1
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c00c4

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 715
    :cond_2
    const v0, 0x7f0b0084

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 716
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->o:Ljava/util/Map;

    iget-object v2, p2, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 717
    if-eq v0, v1, :cond_3

    .line 718
    iget-object v0, p2, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/facebook/ads/NativeAd;Landroid/view/View;)V

    .line 723
    :cond_3
    if-eqz v1, :cond_0

    .line 724
    invoke-virtual {v1}, Landroid/view/View;->performClick()Z

    goto :goto_0
.end method

.method private a(Lcom/facebook/ads/NativeAd;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 1528
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->o:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1529
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Lcom/facebook/ads/NativeAd;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/facebook/ads/NativeAd;Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 90
    invoke-static {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b(Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;Ljava/lang/Object;)V

    return-void
.end method

.method private a(Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V
    .locals 2

    .prologue
    .line 1532
    if-nez p1, :cond_0

    .line 1539
    :goto_0
    return-void

    .line 1535
    :cond_0
    iget v0, p1, Lcom/qihoo/security/ui/result/AdvData;->type:I

    if-nez v0, :cond_1

    iget-object v0, p1, Lcom/qihoo/security/ui/result/AdvData;->title:Ljava/lang/String;

    .line 1536
    :goto_1
    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderAllLikeData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    if-ne p2, v1, :cond_2

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->p:Ljava/util/Map;

    .line 1537
    :goto_2
    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1535
    :cond_1
    iget-object v0, p1, Lcom/qihoo/security/ui/result/AdvData;->adid:Ljava/lang/String;

    goto :goto_1

    .line 1536
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->q:Ljava/util/Map;

    goto :goto_2
.end method

.method private a(Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;)V
    .locals 2

    .prologue
    .line 1514
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f09004e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    .line 1515
    invoke-virtual {p1, v0}, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->setShadowWidth(I)V

    .line 1516
    invoke-virtual {p1, v0}, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->setShadowHeight(I)V

    .line 1517
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->setShadowColor(I)V

    .line 1518
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f09004f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->setBlurWidth(F)V

    .line 1519
    const-wide/16 v0, 0x64

    invoke-virtual {p1, v0, v1}, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->a(J)V

    .line 1520
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/widget/ImageView/RemoteImageView;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 90
    invoke-static {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b(Lcom/qihoo/security/widget/ImageView/RemoteImageView;Ljava/lang/Object;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 678
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "game_booster_show_toast"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    .line 679
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 693
    :cond_0
    :goto_0
    return-void

    .line 682
    :cond_1
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a()Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$4;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    const-string/jumbo v2, "game-booster"

    const-string/jumbo v3, ""

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 1447
    new-instance v0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;

    invoke-direct {v0, p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Ljava/lang/String;)V

    .line 1471
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->e:Landroid/os/Handler;

    invoke-virtual {v1, v0, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1473
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 696
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->e:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$5;

    invoke-direct {v1, p0, p1, p2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$5;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 704
    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 935
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 985
    :cond_0
    :goto_0
    return-void

    .line 938
    :cond_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x1

    .line 939
    :goto_1
    if-eqz v1, :cond_2

    .line 940
    new-instance v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$i;

    invoke-direct {v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$i;-><init>()V

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 941
    new-instance v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$l;

    invoke-direct {v2, p3}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$l;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 942
    new-instance v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$m;

    invoke-direct {v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$m;-><init>()V

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 944
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    div-int/lit8 v2, v2, 0x4

    .line 945
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    rem-int/lit8 v3, v3, 0x4

    .line 946
    :goto_2
    if-ge v0, v2, :cond_4

    .line 947
    new-instance v4, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;

    invoke-direct {v4, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    .line 948
    mul-int/lit8 v5, v0, 0x4

    .line 949
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->c:Ljava/lang/Object;

    .line 950
    add-int/lit8 v6, v5, 0x1

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->d:Ljava/lang/Object;

    .line 951
    add-int/lit8 v6, v5, 0x2

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->e:Ljava/lang/Object;

    .line 952
    add-int/lit8 v5, v5, 0x3

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->f:Ljava/lang/Object;

    .line 953
    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 946
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    move v1, v0

    .line 938
    goto :goto_1

    .line 956
    :cond_4
    mul-int/lit8 v0, v2, 0x4

    .line 957
    packed-switch v3, :pswitch_data_0

    .line 982
    :goto_3
    :pswitch_0
    if-eqz v1, :cond_0

    .line 983
    new-instance v0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$a;

    invoke-direct {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$a;-><init>()V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 961
    :pswitch_1
    new-instance v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;

    invoke-direct {v2, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    .line 962
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    .line 963
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 966
    :pswitch_2
    new-instance v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$f;

    invoke-direct {v2, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$f;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    .line 967
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$f;->c:Ljava/lang/Object;

    .line 968
    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$f;->d:Ljava/lang/Object;

    .line 969
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 972
    :pswitch_3
    new-instance v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$g;

    invoke-direct {v2, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$g;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    .line 973
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$g;->c:Ljava/lang/Object;

    .line 974
    add-int/lit8 v3, v0, 0x1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$g;->d:Ljava/lang/Object;

    .line 975
    add-int/lit8 v0, v0, 0x2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$g;->e:Ljava/lang/Object;

    .line 976
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 957
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic b(Lcom/qihoo/security/gamebooster/GameBoosterActivity;I)I
    .locals 0

    .prologue
    .line 90
    iput p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->m:I

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->g()V

    return-void
.end method

.method private static b(Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 906
    instance-of v0, p1, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-eqz v0, :cond_2

    .line 907
    check-cast p1, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 908
    invoke-virtual {p1}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getState()Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->Add:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    if-ne v0, v1, :cond_1

    .line 909
    const v0, 0x7f0c0083

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;->setLocalText(I)V

    .line 917
    :cond_0
    :goto_0
    return-void

    .line 912
    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;->setPackageName(Ljava/lang/String;)V

    goto :goto_0

    .line 913
    :cond_2
    instance-of v0, p1, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_0

    .line 914
    check-cast p1, Lcom/qihoo/security/ui/result/AdvData;

    .line 915
    iget-object v0, p1, Lcom/qihoo/security/ui/result/AdvData;->title:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private static b(Lcom/qihoo/security/widget/ImageView/RemoteImageView;Ljava/lang/Object;)V
    .locals 2

    .prologue
    const v1, 0x7f020044

    .line 920
    instance-of v0, p1, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-eqz v0, :cond_2

    .line 921
    check-cast p1, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 922
    sget-object v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->ADD:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-ne p1, v0, :cond_1

    .line 923
    const v0, 0x7f020085

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageResourceInListView(I)V

    .line 931
    :cond_0
    :goto_0
    return-void

    .line 925
    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->b(Ljava/lang/String;I)V

    goto :goto_0

    .line 927
    :cond_2
    instance-of v0, p1, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_0

    .line 928
    check-cast p1, Lcom/qihoo/security/ui/result/AdvData;

    .line 929
    iget-object v0, p1, Lcom/qihoo/security/ui/result/AdvData;->icon:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->a(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->i:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->d:Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;

    return-object v0
.end method

.method private e()V
    .locals 2

    .prologue
    .line 225
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 226
    const-string/jumbo v1, "com.qihoo.security.gamebooster.LocalGamePackageUpdate"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 227
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->C:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 228
    return-void
.end method

.method static synthetic f(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->j:Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;

    return-object v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 284
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->D:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0087

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 288
    :goto_0
    return-void

    .line 287
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->D:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0086

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_0
.end method

.method static synthetic g(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)I
    .locals 1

    .prologue
    .line 90
    iget v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->l:I

    return v0
.end method

.method private g()V
    .locals 1

    .prologue
    .line 339
    const v0, 0x7f0b013a

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 340
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 341
    return-void
.end method

.method static synthetic h(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->h:Landroid/view/View;

    return-object v0
.end method

.method private h()V
    .locals 14

    .prologue
    const/4 v13, 0x1

    const/4 v12, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0xc8

    const/4 v8, 0x2

    .line 344
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b()V

    .line 345
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->e:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$3;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    const-wide/16 v2, 0x9c4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 352
    const v0, 0x7f0b004a

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 353
    const v0, 0x7f0b013b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 354
    const v0, 0x7f0b013c

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 355
    const v1, 0x7f0b013d

    invoke-virtual {p0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->D:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 356
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f0c0085

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v4, v13, [Ljava/lang/Object;

    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->h()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v12

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 358
    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 360
    invoke-static {v2, v9}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 361
    invoke-static {v3, v9}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 367
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v0

    .line 387
    new-instance v1, Lcom/nineoldandroids/a/c;

    invoke-direct {v1}, Lcom/nineoldandroids/a/c;-><init>()V

    .line 388
    const-string/jumbo v4, "alpha"

    new-array v5, v8, [F

    fill-array-data v5, :array_0

    invoke-static {v2, v4, v5}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v4

    .line 389
    invoke-virtual {v4, v10, v11}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 390
    const-string/jumbo v5, "translationX"

    new-array v6, v8, [F

    fill-array-data v6, :array_1

    invoke-static {v2, v5, v6}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v5

    .line 391
    invoke-virtual {v5, v10, v11}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 392
    invoke-virtual {v1, v4}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    move-result-object v4

    invoke-virtual {v4, v5}, Lcom/nineoldandroids/a/c$b;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    .line 393
    const-wide/16 v4, 0x320

    invoke-virtual {v1, v4, v5}, Lcom/nineoldandroids/a/c;->a(J)V

    .line 394
    invoke-virtual {v1}, Lcom/nineoldandroids/a/c;->a()V

    .line 397
    new-instance v1, Lcom/nineoldandroids/a/c;

    invoke-direct {v1}, Lcom/nineoldandroids/a/c;-><init>()V

    .line 398
    const-string/jumbo v4, "alpha"

    new-array v5, v8, [F

    fill-array-data v5, :array_2

    invoke-static {v2, v4, v5}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v4

    .line 399
    invoke-virtual {v4, v10, v11}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 401
    const-string/jumbo v5, "translationY"

    new-array v6, v8, [F

    aput v9, v6, v12

    neg-int v7, v0

    int-to-float v7, v7

    aput v7, v6, v13

    invoke-static {v2, v5, v6}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v2

    .line 402
    invoke-virtual {v2, v10, v11}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 403
    invoke-virtual {v1, v4}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/nineoldandroids/a/c$b;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    .line 404
    const-wide/16 v4, 0xed8

    invoke-virtual {v1, v4, v5}, Lcom/nineoldandroids/a/c;->a(J)V

    .line 405
    invoke-virtual {v1}, Lcom/nineoldandroids/a/c;->a()V

    .line 408
    new-instance v1, Lcom/nineoldandroids/a/c;

    invoke-direct {v1}, Lcom/nineoldandroids/a/c;-><init>()V

    .line 409
    const-string/jumbo v2, "alpha"

    new-array v4, v8, [F

    fill-array-data v4, :array_3

    invoke-static {v3, v2, v4}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v2

    .line 410
    invoke-virtual {v2, v10, v11}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 411
    const-string/jumbo v4, "translationY"

    new-array v5, v8, [F

    int-to-float v0, v0

    aput v0, v5, v12

    aput v9, v5, v13

    invoke-static {v3, v4, v5}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 412
    invoke-virtual {v0, v10, v11}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 413
    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/nineoldandroids/a/c$b;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    .line 414
    const-wide/16 v2, 0x1004

    invoke-virtual {v1, v2, v3}, Lcom/nineoldandroids/a/c;->a(J)V

    .line 415
    invoke-virtual {v1}, Lcom/nineoldandroids/a/c;->a()V

    .line 417
    return-void

    .line 388
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 390
    :array_1
    .array-data 4
        0x43480000    # 200.0f
        0x0
    .end array-data

    .line 398
    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 409
    :array_3
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private i()V
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 442
    .line 443
    iget v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->B:I

    if-lez v1, :cond_b

    iget v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->B:I

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->j:Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;

    invoke-virtual {v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->getCount()I

    move-result v2

    if-ge v1, v2, :cond_b

    .line 444
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->j:Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;

    iget v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->B:I

    invoke-virtual {v1, v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a(I)Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;

    move-result-object v1

    move-object v5, v1

    .line 447
    :goto_0
    if-eqz v5, :cond_a

    .line 448
    invoke-virtual {v5}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->b()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    .line 451
    :goto_1
    instance-of v0, v5, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    move v2, v3

    .line 452
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 453
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 454
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 455
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 456
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_0
    move v2, v4

    .line 451
    goto :goto_2

    .line 461
    :cond_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 462
    if-eqz v2, :cond_2

    .line 463
    invoke-interface {v7, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 465
    :cond_2
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderAllLikeData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v0, v7}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;)V

    .line 468
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 470
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 471
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 472
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 473
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 477
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 479
    :cond_4
    instance-of v0, v5, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;

    if-eqz v0, :cond_9

    if-eqz v1, :cond_9

    .line 480
    :goto_5
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 481
    if-eqz v3, :cond_5

    .line 482
    invoke-interface {v6, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 484
    :cond_5
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderHotAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v0, v6}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;)V

    .line 486
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 487
    invoke-interface {v7, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 488
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 489
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v0

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Show:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    invoke-virtual {v0, v2, v7}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Ljava/util/List;)V

    .line 490
    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 491
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 493
    :cond_7
    if-eqz v1, :cond_8

    .line 501
    const-string/jumbo v0, "GameBoosterActivity"

    const-string/jumbo v2, "\u65e0\u6392\u9664\u4e0a\u62a5"

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 503
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 505
    :cond_8
    return-void

    :cond_9
    move v3, v4

    .line 479
    goto :goto_5

    :cond_a
    move-object v1, v0

    goto/16 :goto_1

    :cond_b
    move-object v5, v0

    goto/16 :goto_0
.end method

.method private j()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/16 v3, 0xa

    .line 566
    .line 567
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    if-eqz v0, :cond_4

    .line 569
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    .line 570
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1

    .line 585
    :cond_0
    :goto_0
    return-object v1

    .line 574
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lt v1, v3, :cond_2

    .line 575
    const/4 v1, 0x0

    invoke-interface {v0, v1, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 580
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 581
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 582
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    move-object v0, v1

    :goto_2
    move-object v1, v0

    .line 585
    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_2
.end method


# virtual methods
.method public a()V
    .locals 6

    .prologue
    .line 231
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 232
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->f()V

    .line 233
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 234
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 235
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 236
    sget-object v1, Lcom/qihoo/security/gamebooster/LocalGamePkg;->ADD:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->i:Ljava/util/List;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 240
    :cond_0
    const v0, 0x7f0c00a3

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 241
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->y:Ljava/util/List;

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->i:Ljava/util/List;

    invoke-direct {p0, v1, v2, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 242
    const v0, 0x7f0c00a6

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 243
    new-instance v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity$l;

    invoke-direct {v2, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$l;-><init>(Ljava/lang/String;)V

    .line 244
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 245
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 246
    const v0, 0x7f0c0093

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 247
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 248
    if-eqz v0, :cond_1

    .line 251
    iget v1, v0, Lcom/qihoo/security/ui/result/AdvData;->tp:I

    .line 253
    packed-switch v1, :pswitch_data_0

    .line 262
    :pswitch_0
    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;

    invoke-direct {v1, v0, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;-><init>(Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    move-object v0, v1

    .line 265
    :goto_1
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 255
    :pswitch_1
    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$j;

    invoke-direct {v1, v0, v4, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$j;-><init>(Lcom/qihoo/security/ui/result/AdvData;Ljava/lang/String;Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    move-object v0, v1

    .line 256
    goto :goto_1

    .line 258
    :pswitch_2
    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;

    invoke-direct {v1, v0, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;-><init>(Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    move-object v0, v1

    .line 259
    goto :goto_1

    .line 269
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 270
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->i:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 271
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->i:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 274
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$b;

    invoke-direct {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$b;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 275
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->d:Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->getListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_4

    .line 276
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->d:Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->getListView()Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->j:Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 278
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->d:Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->getListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 279
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->j:Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->notifyDataSetChanged()V

    .line 281
    return-void

    .line 253
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public a(Lcom/qihoo/security/gamebooster/LocalGamePkg;)V
    .locals 2

    .prologue
    .line 291
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 292
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 293
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a()V

    .line 294
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/g;)V

    .line 295
    return-void
.end method

.method public a(Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;Landroid/view/View;)V
    .locals 4

    .prologue
    .line 1413
    if-nez p2, :cond_1

    .line 1443
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 1416
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 1417
    instance-of v0, v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-eqz v0, :cond_0

    .line 1420
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 1421
    sget-object v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$8;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 1425
    :pswitch_1
    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/LocalGamePkg;)V

    .line 1426
    const/16 v1, 0x2b63

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "0"

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1429
    :pswitch_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 1430
    new-instance v2, Landroid/content/Intent;

    const-string/jumbo v3, "android.intent.action.DELETE"

    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1432
    :try_start_0
    invoke-virtual {p0, v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1436
    :goto_1
    const/16 v1, 0x2b64

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "0"

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1434
    :catch_0
    move-exception v1

    goto :goto_1

    .line 1421
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public a(Lcom/qihoo/security/gamebooster/g;Ljava/lang/Object;)V
    .locals 8

    .prologue
    const-wide/16 v4, 0x0

    const/4 v3, 0x1

    const/4 v7, 0x0

    const/16 v6, 0x2b60

    .line 509
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 510
    if-nez p1, :cond_1

    .line 511
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 563
    :cond_0
    :goto_0
    return-void

    .line 516
    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    .line 517
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    .line 518
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a()V

    .line 519
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v3, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 520
    if-eqz v0, :cond_3

    .line 521
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 522
    if-eqz v0, :cond_2

    .line 525
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    .line 527
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 530
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 535
    :cond_3
    iget-boolean v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->t:Z

    if-eqz v0, :cond_0

    .line 536
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->j()Ljava/util/List;

    move-result-object v0

    .line 537
    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_6

    .line 541
    const-string/jumbo v1, "last_show_game_boost_folder_time"

    invoke-static {p0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 543
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v2, v2, v4

    if-nez v2, :cond_4

    .line 544
    invoke-static {v6}, Lcom/qihoo/security/support/b;->b(I)V

    .line 555
    :goto_2
    const-string/jumbo v0, "last_show_game_boost_folder_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {p0, v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 561
    :goto_3
    iput-boolean v7, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->t:Z

    goto :goto_0

    .line 546
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    .line 547
    const-wide/32 v4, 0x240c8400

    cmp-long v1, v2, v4

    if-ltz v1, :cond_5

    .line 548
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v1, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 551
    :cond_5
    invoke-static {v6}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_2

    .line 558
    :cond_6
    invoke-static {v6}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_3
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 90
    check-cast p1, Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/g;Ljava/lang/Object;)V

    return-void
.end method

.method public b()V
    .locals 9

    .prologue
    const/4 v5, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v1, 0x0

    .line 298
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->g:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 299
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    move v3, v1

    move v4, v2

    move v7, v5

    move v8, v6

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 301
    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 302
    new-instance v1, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 303
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->g:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 304
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->f:Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a()V

    .line 305
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 308
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->f:Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;

    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$2;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a(Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;)V

    .line 336
    return-void
.end method

.method public d()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 1632
    const/16 v0, 0x2b76

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 1633
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    .line 1634
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->h:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    .line 1635
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    neg-int v1, v1

    int-to-float v1, v1

    invoke-direct {v2, v3, v3, v3, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 1636
    const-wide/16 v4, 0x64

    invoke-virtual {v2, v4, v5}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 1637
    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 1638
    new-instance v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$7;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$7;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;I)V

    invoke-virtual {v2, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1657
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->h:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1658
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 421
    invoke-super {p0}, Lcom/qihoo/security/app/BaseSimpleActivity;->onBackPressed()V

    .line 422
    const/high16 v0, 0x10a0000

    const v1, 0x10a0001

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->overridePendingTransition(II)V

    .line 423
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    .line 590
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 675
    :cond_0
    :goto_0
    :sswitch_0
    return-void

    .line 593
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 608
    :sswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 609
    instance-of v1, v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-eqz v1, :cond_5

    .line 610
    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 612
    sget-object v1, Lcom/qihoo/security/gamebooster/LocalGamePkg;->ADD:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-ne v0, v1, :cond_4

    .line 615
    invoke-static {p0}, Lcom/qihoo360/common/e/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/adv/AdvDataManager;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 616
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v2, v0

    .line 620
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 621
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v1

    .line 622
    if-eqz v1, :cond_0

    .line 625
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 626
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 627
    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 595
    :sswitch_2
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->finish()V

    goto :goto_0

    .line 598
    :sswitch_3
    const/16 v0, 0x2b61

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 599
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c002f

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 618
    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v2, v0

    goto :goto_1

    .line 629
    :cond_3
    const-string/jumbo v1, "packages"

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 630
    const/high16 v1, 0x10000000

    invoke-virtual {v2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 631
    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 632
    const v0, 0x7f040006

    const v1, 0x7f040008

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->overridePendingTransition(II)V

    .line 633
    const/16 v0, 0x2b65

    const-string/jumbo v1, "0"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 637
    :cond_4
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->k:Landroid/content/pm/PackageManager;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 638
    if-eqz v1, :cond_0

    .line 641
    const/high16 v2, 0x10200000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 642
    invoke-virtual {p0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->startActivity(Landroid/content/Intent;)V

    .line 643
    const/16 v1, 0x2b62

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "0"

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 646
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 649
    :cond_5
    instance-of v1, v0, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v1, :cond_0

    .line 650
    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 651
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Landroid/view/View;Lcom/qihoo/security/ui/result/AdvData;)V

    .line 652
    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderAllLikeData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget v2, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    invoke-static {v1, v2}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;I)V

    .line 653
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 654
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 655
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v0

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Click:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    invoke-virtual {v0, v2, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Ljava/util/List;)V

    goto/16 :goto_0

    .line 660
    :sswitch_4
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 661
    instance-of v1, v0, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v1, :cond_0

    .line 662
    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 663
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Landroid/view/View;Lcom/qihoo/security/ui/result/AdvData;)V

    .line 664
    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderHotAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget v2, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    invoke-static {v1, v2}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;I)V

    .line 665
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 666
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 667
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v0

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Click:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    invoke-virtual {v0, v2, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Ljava/util/List;)V

    goto/16 :goto_0

    .line 593
    :sswitch_data_0
    .sparse-switch
        0x7f0b0109 -> :sswitch_1
        0x7f0b010a -> :sswitch_1
        0x7f0b010b -> :sswitch_1
        0x7f0b010c -> :sswitch_1
        0x7f0b0137 -> :sswitch_2
        0x7f0b0138 -> :sswitch_0
        0x7f0b013a -> :sswitch_3
        0x7f0b0140 -> :sswitch_4
    .end sparse-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, -0x1

    .line 147
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseSimpleActivity;->onCreate(Landroid/os/Bundle;)V

    .line 148
    new-instance v0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Lcom/qihoo/security/gamebooster/GameBoosterActivity$1;)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->j:Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;

    .line 149
    iput-boolean v5, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->t:Z

    .line 150
    const/high16 v0, 0x10a0000

    const v1, 0x10a0001

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->overridePendingTransition(II)V

    .line 151
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->k:Landroid/content/pm/PackageManager;

    .line 152
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 153
    invoke-direct {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Landroid/content/Intent;)V

    .line 154
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->e()V

    .line 155
    const-string/jumbo v1, "pkg_name"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 156
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->e:Landroid/os/Handler;

    .line 157
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 158
    const-string/jumbo v2, "pkg_name"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 159
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo/security/gamebooster/b;->f()Z

    move-result v2

    if-nez v2, :cond_0

    .line 160
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v2, "com.qihoo.security.lite.gamebooster.CreateGameShortActivity"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 161
    const/high16 v2, 0x50040000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 163
    const-string/jumbo v2, "pkg_name"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 164
    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->startActivity(Landroid/content/Intent;)V

    .line 165
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->finish()V

    .line 201
    :goto_0
    return-void

    .line 168
    :cond_0
    const-wide/16 v2, 0x5dc

    invoke-direct {p0, v1, v2, v3}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Ljava/lang/String;J)V

    .line 171
    :cond_1
    const-string/jumbo v1, "from"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v4, :cond_2

    .line 172
    const-string/jumbo v0, "Game_booster_last_open"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {p0, v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 174
    :cond_2
    invoke-virtual {p0, v5}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->requestWindowFeature(I)Z

    .line 175
    const v0, 0x7f03005b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->setContentView(I)V

    .line 176
    const v0, 0x7f0b000e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->d:Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;

    .line 177
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->d:Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->setAdapter(Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;)V

    .line 178
    const v0, 0x7f0b0138

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->h:Landroid/view/View;

    .line 179
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->h:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 180
    const v0, 0x7f0b0137

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->s:Landroid/view/View;

    .line 181
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->s:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c:Landroid/view/LayoutInflater;

    .line 183
    const v0, 0x7f0b013e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->g:Landroid/view/View;

    .line 184
    const v0, 0x7f0b013f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->f:Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;

    .line 185
    const v0, 0x7f0b009c

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->A:Landroid/view/View;

    .line 187
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->h()V

    .line 188
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/h;)V

    .line 190
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    invoke-virtual {v0, p0}, Lde/greenrobot/event/EventBus;->register(Ljava/lang/Object;)V

    .line 192
    invoke-static {}, Lcom/qihoo/security/adv/a/a;->a()Lcom/qihoo/security/adv/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->z:Lcom/qihoo/security/adv/a/a;

    .line 195
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/adv/AdvDataManager;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 196
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->A:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    .line 198
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->z:Lcom/qihoo/security/adv/a/a;

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderAllLikeData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 199
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->z:Lcom/qihoo/security/adv/a/a;

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderHotAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    goto/16 :goto_0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 427
    invoke-super {p0}, Lcom/qihoo/security/app/BaseSimpleActivity;->onDestroy()V

    .line 428
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->C:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 429
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 430
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 431
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 432
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->n()V

    goto :goto_0

    .line 434
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 436
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    invoke-virtual {v0, p0}, Lde/greenrobot/event/EventBus;->unregister(Ljava/lang/Object;)V

    .line 437
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->i()V

    .line 439
    return-void
.end method

.method public onEventMainThread(Lcom/qihoo/security/f/a;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1542
    iget-object v0, p1, Lcom/qihoo/security/f/a;->b:Ljava/util/List;

    .line 1543
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->A:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1544
    if-nez v0, :cond_0

    .line 1576
    :goto_0
    return-void

    .line 1550
    :cond_0
    sget-object v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$8;->b:[I

    iget-object v2, p1, Lcom/qihoo/security/f/a;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v2}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 1552
    :pswitch_0
    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->u:Ljava/util/List;

    .line 1553
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->z:Lcom/qihoo/security/adv/a/a;

    iget-object v1, p1, Lcom/qihoo/security/f/a;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a/a;->d(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->w:Ljava/util/List;

    .line 1554
    iget-object v0, p1, Lcom/qihoo/security/f/a;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->w:Ljava/util/List;

    invoke-static {v0, v1, v3}, Lcom/qihoo/security/ui/result/f;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    .line 1555
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->y:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 1556
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1557
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a()V

    goto :goto_0

    .line 1564
    :pswitch_1
    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->v:Ljava/util/List;

    .line 1565
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->z:Lcom/qihoo/security/adv/a/a;

    iget-object v1, p1, Lcom/qihoo/security/f/a;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a/a;->d(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->x:Ljava/util/List;

    .line 1566
    iget-object v0, p1, Lcom/qihoo/security/f/a;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->x:Ljava/util/List;

    invoke-static {v0, v1, v3}, Lcom/qihoo/security/ui/result/f;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a:Ljava/util/List;

    .line 1567
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a()V

    goto :goto_0

    .line 1550
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onEventMainThread(Lcom/qihoo/security/f/b;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1582
    sget-object v0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$8;->b:[I

    iget-object v1, p1, Lcom/qihoo/security/f/b;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1628
    :cond_0
    :goto_0
    return-void

    .line 1584
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->z:Lcom/qihoo/security/adv/a/a;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->u:Ljava/util/List;

    iget-object v2, p1, Lcom/qihoo/security/f/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/adv/a/a;->a(Ljava/util/List;Ljava/lang/String;)I

    move-result v1

    .line 1585
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->w:Ljava/util/List;

    if-eqz v0, :cond_0

    if-ltz v1, :cond_0

    .line 1586
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->u:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 1587
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->z:Lcom/qihoo/security/adv/a/a;

    iget-object v3, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->w:Ljava/util/List;

    invoke-virtual {v2, v0, v3}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/d;Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1588
    invoke-virtual {v0, v4}, Lcom/qihoo/security/adv/d;->a(I)V

    .line 1589
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->w:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v1, :cond_1

    .line 1590
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->w:Ljava/util/List;

    invoke-interface {v2, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 1594
    :goto_1
    iget-object v0, p1, Lcom/qihoo/security/f/b;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->w:Ljava/util/List;

    invoke-static {v0, v1, v4}, Lcom/qihoo/security/ui/result/f;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    .line 1595
    if-eqz v0, :cond_0

    .line 1596
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->y:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 1597
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1598
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a()V

    goto :goto_0

    .line 1592
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->w:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1607
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->z:Lcom/qihoo/security/adv/a/a;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->v:Ljava/util/List;

    iget-object v2, p1, Lcom/qihoo/security/f/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/adv/a/a;->a(Ljava/util/List;Ljava/lang/String;)I

    move-result v1

    .line 1608
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->x:Ljava/util/List;

    if-eqz v0, :cond_0

    if-ltz v1, :cond_0

    .line 1609
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->v:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 1610
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->z:Lcom/qihoo/security/adv/a/a;

    iget-object v3, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->x:Ljava/util/List;

    invoke-virtual {v2, v0, v3}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/d;Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1611
    invoke-virtual {v0, v4}, Lcom/qihoo/security/adv/d;->a(I)V

    .line 1612
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->x:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v1, :cond_2

    .line 1613
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->x:Ljava/util/List;

    invoke-interface {v2, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 1617
    :goto_2
    iget-object v0, p1, Lcom/qihoo/security/f/b;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->x:Ljava/util/List;

    invoke-static {v0, v1, v4}, Lcom/qihoo/security/ui/result/f;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a:Ljava/util/List;

    .line 1618
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a()V

    goto/16 :goto_0

    .line 1615
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->x:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1582
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1400
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    .line 1401
    instance-of v2, v1, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-nez v2, :cond_1

    .line 1408
    :cond_0
    :goto_0
    return v0

    .line 1404
    :cond_1
    if-eqz v1, :cond_0

    sget-object v2, Lcom/qihoo/security/gamebooster/LocalGamePkg;->ADD:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-eq v1, v2, :cond_0

    .line 1407
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->d:Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->a(Landroid/view/View;)V

    .line 1408
    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 205
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseSimpleActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 206
    invoke-direct {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Landroid/content/Intent;)V

    .line 207
    const-string/jumbo v0, "pkg_name"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 208
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 209
    const-string/jumbo v1, "pkg_name"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 210
    const-wide/16 v2, 0x0

    invoke-direct {p0, v0, v2, v3}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Ljava/lang/String;J)V

    .line 212
    :cond_0
    const-string/jumbo v0, "from"

    invoke-virtual {p1, v0, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v4, :cond_1

    .line 213
    const-string/jumbo v0, "Game_booster_last_open"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {p0, v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 215
    :cond_1
    return-void
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 2

    .prologue
    .line 1524
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v0

    iget v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->B:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->B:I

    .line 1525
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 1478
    if-nez p2, :cond_2

    .line 1479
    iget v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->l:I

    if-gez v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->m:I

    if-ltz v0, :cond_2

    .line 1480
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->j:Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;

    iget v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->m:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a(I)Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;

    move-result-object v1

    .line 1481
    if-eqz v1, :cond_2

    iget-object v0, v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    if-eqz v0, :cond_2

    .line 1482
    const/4 v0, 0x0

    .line 1483
    iget v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->l:I

    packed-switch v2, :pswitch_data_0

    .line 1501
    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->n:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1502
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->setFlashPkg(Ljava/lang/String;)V

    .line 1503
    invoke-direct {p0, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;)V

    .line 1505
    :cond_1
    iput v3, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->l:I

    .line 1506
    iput v3, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->m:I

    .line 1511
    :cond_2
    return-void

    .line 1485
    :pswitch_0
    iget-object v0, v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->f(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    move-result-object v0

    goto :goto_0

    .line 1488
    :pswitch_1
    iget-object v0, v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->i(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    move-result-object v0

    goto :goto_0

    .line 1491
    :pswitch_2
    iget-object v0, v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->l(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    move-result-object v0

    goto :goto_0

    .line 1495
    :pswitch_3
    iget-object v0, v1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->o(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    move-result-object v0

    goto :goto_0

    .line 1483
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
