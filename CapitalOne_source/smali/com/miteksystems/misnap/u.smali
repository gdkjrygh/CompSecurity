.class public final Lcom/miteksystems/misnap/u;
.super Landroid/widget/RelativeLayout;

# interfaces
.implements Lcom/miteksystems/misnap/a;


# static fields
.field static a:Z


# instance fields
.field private A:Z

.field private B:Lcom/miteksystems/misnap/MiSnap;

.field private C:Landroid/app/AlertDialog;

.field private D:I

.field private E:Landroid/os/Handler;

.field private F:Lcom/miteksystems/misnap/MitekAnalyzer;

.field private final G:Landroid/graphics/Paint;

.field private H:F

.field private I:F

.field private J:I

.field private K:I

.field private L:D

.field private M:D

.field private N:Landroid/graphics/Path;

.field private O:Ljava/util/List;

.field private P:Ljava/util/List;

.field private Q:Ljava/util/concurrent/ConcurrentHashMap;

.field private R:Z

.field private S:Z

.field private T:Landroid/graphics/Point;

.field private U:Landroid/widget/TextView;

.field private V:Landroid/graphics/Bitmap;

.field private W:Landroid/widget/ImageView;

.field private Z:Landroid/widget/ImageView;

.field private aA:Z

.field private aB:Z

.field private aC:Z

.field private aD:Z

.field private aE:Ljava/lang/Runnable;

.field private aF:Ljava/lang/Runnable;

.field private aG:I

.field private aH:Ljava/lang/Runnable;

.field private aI:Landroid/graphics/Point;

.field private aa:Landroid/widget/ImageView;

.field private ab:Landroid/widget/ImageView;

.field private ac:Landroid/widget/ImageView;

.field private ad:Landroid/widget/ImageView;

.field private ae:Lcom/miteksystems/misnap/b;

.field private af:Lcom/miteksystems/misnap/b;

.field private ag:Lcom/miteksystems/misnap/b;

.field private ah:Lcom/miteksystems/misnap/b;

.field private ai:Z

.field private aj:Z

.field private ak:Z

.field private al:F

.field private am:F

.field private an:F

.field private ao:J

.field private ap:J

.field private aq:Landroid/view/animation/Animation;

.field private ar:Landroid/view/animation/Animation;

.field private as:Landroid/view/animation/Animation;

.field private at:Landroid/graphics/Matrix;

.field private au:[F

.field private av:Landroid/widget/RelativeLayout;

.field private aw:Landroid/widget/RelativeLayout;

.field private ax:Landroid/widget/Button;

.field private ay:Landroid/widget/Button;

.field private az:Z

.field b:Landroid/graphics/drawable/Drawable;

.field c:Landroid/widget/ImageButton;

.field d:Landroid/widget/ImageButton;

.field e:Landroid/widget/ImageButton;

.field f:Landroid/widget/ImageButton;

.field g:Landroid/widget/ImageButton;

.field h:Landroid/widget/TextView;

.field i:Landroid/content/res/Resources;

.field j:Landroid/os/Handler;

.field k:Lcom/miteksystems/misnap/s;

.field l:Lcom/miteksystems/misnap/i;

.field m:Ljava/lang/Runnable;

.field n:Ljava/lang/Runnable;

.field o:Ljava/lang/Runnable;

.field p:Ljava/lang/Runnable;

.field q:Ljava/lang/Runnable;

.field final r:Ljava/lang/Runnable;

.field s:Ljava/lang/Runnable;

.field private t:F

.field private u:F

.field private v:Z

.field private w:Landroid/graphics/Matrix;

.field private x:I

.field private y:[I

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/miteksystems/misnap/u;->a:Z

    return-void
.end method

.method private constructor <init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;Lcom/miteksystems/misnap/s;Lcom/miteksystems/misnap/i;)V
    .locals 9

    const/4 v8, 0x4

    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v6, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput v7, p0, Lcom/miteksystems/misnap/u;->t:F

    iput v7, p0, Lcom/miteksystems/misnap/u;->u:F

    iput-boolean v2, p0, Lcom/miteksystems/misnap/u;->v:Z

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->w:Landroid/graphics/Matrix;

    iput v2, p0, Lcom/miteksystems/misnap/u;->x:I

    const/16 v0, 0x15

    new-array v0, v0, [I

    sget v3, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_00:I

    aput v3, v0, v2

    sget v3, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_05:I

    aput v3, v0, v1

    const/4 v3, 0x2

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_10:I

    aput v4, v0, v3

    const/4 v3, 0x3

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_15:I

    aput v4, v0, v3

    sget v3, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_20:I

    aput v3, v0, v8

    const/4 v3, 0x5

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_25:I

    aput v4, v0, v3

    const/4 v3, 0x6

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_30:I

    aput v4, v0, v3

    const/4 v3, 0x7

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_35:I

    aput v4, v0, v3

    const/16 v3, 0x8

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_40:I

    aput v4, v0, v3

    const/16 v3, 0x9

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_45:I

    aput v4, v0, v3

    const/16 v3, 0xa

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_50:I

    aput v4, v0, v3

    const/16 v3, 0xb

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_55:I

    aput v4, v0, v3

    const/16 v3, 0xc

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_60:I

    aput v4, v0, v3

    const/16 v3, 0xd

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_65:I

    aput v4, v0, v3

    const/16 v3, 0xe

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_70:I

    aput v4, v0, v3

    const/16 v3, 0xf

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_75:I

    aput v4, v0, v3

    const/16 v3, 0x10

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_80:I

    aput v4, v0, v3

    const/16 v3, 0x11

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_85:I

    aput v4, v0, v3

    const/16 v3, 0x12

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_90:I

    aput v4, v0, v3

    const/16 v3, 0x13

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_95:I

    aput v4, v0, v3

    const/16 v3, 0x14

    sget v4, Lcom/miteksystems/misnap/R$drawable;->gauge_fill_100:I

    aput v4, v0, v3

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->y:[I

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/miteksystems/misnap/u;->z:J

    iput-boolean v2, p0, Lcom/miteksystems/misnap/u;->A:Z

    iput v2, p0, Lcom/miteksystems/misnap/u;->D:I

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/miteksystems/misnap/u;->L:D

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/miteksystems/misnap/u;->M:D

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->O:Ljava/util/List;

    iput-boolean v2, p0, Lcom/miteksystems/misnap/u;->R:Z

    iput-boolean v1, p0, Lcom/miteksystems/misnap/u;->S:Z

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->T:Landroid/graphics/Point;

    iput-object v6, p0, Lcom/miteksystems/misnap/u;->V:Landroid/graphics/Bitmap;

    iput-object v6, p0, Lcom/miteksystems/misnap/u;->W:Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/miteksystems/misnap/u;->ad:Landroid/widget/ImageView;

    iput v7, p0, Lcom/miteksystems/misnap/u;->al:F

    iput v7, p0, Lcom/miteksystems/misnap/u;->am:F

    iput v7, p0, Lcom/miteksystems/misnap/u;->an:F

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/miteksystems/misnap/u;->ao:J

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/miteksystems/misnap/u;->ap:J

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->at:Landroid/graphics/Matrix;

    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->au:[F

    iput-boolean v1, p0, Lcom/miteksystems/misnap/u;->az:Z

    iput-boolean v2, p0, Lcom/miteksystems/misnap/u;->aA:Z

    iput-boolean v2, p0, Lcom/miteksystems/misnap/u;->aB:Z

    iput-boolean v2, p0, Lcom/miteksystems/misnap/u;->aC:Z

    iput-boolean v2, p0, Lcom/miteksystems/misnap/u;->aD:Z

    iput-object v6, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    iput-object v6, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    iput-object v6, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    new-instance v0, Lcom/miteksystems/misnap/v;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/v;-><init>(Lcom/miteksystems/misnap/u;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->m:Ljava/lang/Runnable;

    new-instance v0, Lcom/miteksystems/misnap/ae;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/ae;-><init>(Lcom/miteksystems/misnap/u;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->n:Ljava/lang/Runnable;

    new-instance v0, Lcom/miteksystems/misnap/af;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/af;-><init>(Lcom/miteksystems/misnap/u;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->o:Ljava/lang/Runnable;

    new-instance v0, Lcom/miteksystems/misnap/ag;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/ag;-><init>(Lcom/miteksystems/misnap/u;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->p:Ljava/lang/Runnable;

    new-instance v0, Lcom/miteksystems/misnap/ah;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/ah;-><init>(Lcom/miteksystems/misnap/u;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->aE:Ljava/lang/Runnable;

    new-instance v0, Lcom/miteksystems/misnap/ai;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/ai;-><init>(Lcom/miteksystems/misnap/u;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->q:Ljava/lang/Runnable;

    new-instance v0, Lcom/miteksystems/misnap/aj;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/aj;-><init>(Lcom/miteksystems/misnap/u;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->r:Ljava/lang/Runnable;

    new-instance v0, Lcom/miteksystems/misnap/ak;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/ak;-><init>(Lcom/miteksystems/misnap/u;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->aF:Ljava/lang/Runnable;

    iput v2, p0, Lcom/miteksystems/misnap/u;->aG:I

    new-instance v0, Lcom/miteksystems/misnap/al;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/al;-><init>(Lcom/miteksystems/misnap/u;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->aH:Ljava/lang/Runnable;

    new-instance v0, Lcom/miteksystems/misnap/w;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/w;-><init>(Lcom/miteksystems/misnap/u;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->s:Ljava/lang/Runnable;

    iput-object v6, p0, Lcom/miteksystems/misnap/u;->aI:Landroid/graphics/Point;

    iput-object p1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sput-boolean v2, Lcom/miteksystems/misnap/u;->a:Z

    iput-object p2, p0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    iput-object p3, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    iput-object p4, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->n()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "license"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/miteksystems/misnap/u;->aB:Z

    :try_start_0
    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    new-instance v5, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->x()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/util/Locale;

    iget-object v6, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v6, v6, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v6}, Lcom/miteksystems/misnap/MiSnapAPI;->x()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    iput-object v0, v5, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    new-instance v0, Landroid/content/res/Resources;

    invoke-direct {v0, v3, v4, v5}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->N:Landroid/graphics/Path;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->Q:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->G:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->G:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->G:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->G:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->G:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->G:Landroid/graphics/Paint;

    new-instance v3, Landroid/graphics/CornerPathEffect;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->q()I

    move-result v4

    int-to-float v4, v4

    invoke-direct {v3, v4}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->G:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->G:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->p()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->r()I

    move-result v0

    const/high16 v1, -0x1000000

    or-int/2addr v0, v1

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->G:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    sget v0, Lcom/miteksystems/misnap/R$layout;->lib_overlay:I

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lcom/miteksystems/misnap/R$id;->overlay_flash_toggle:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    sget v0, Lcom/miteksystems/misnap/R$id;->misnap_overlay_mitek_logo:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->c:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->c:Landroid/widget/ImageButton;

    const/16 v1, 0xc0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setAlpha(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->c:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;)V

    sget v0, Lcom/miteksystems/misnap/R$id;->misnap_overlay_help_button:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->d:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->d:Landroid/widget/ImageButton;

    new-instance v1, Lcom/miteksystems/misnap/x;

    invoke-direct {v1, p0}, Lcom/miteksystems/misnap/x;-><init>(Lcom/miteksystems/misnap/u;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, Lcom/miteksystems/misnap/R$id;->misnap_check_text:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->U:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->ay()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->ak()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->misnap_check_front_text:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    iget-object v1, p0, Lcom/miteksystems/misnap/u;->U:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_3
    sget v0, Lcom/miteksystems/misnap/R$id;->misnap_overlay_capture_button:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->e:Landroid/widget/ImageButton;

    sget v0, Lcom/miteksystems/misnap/R$id;->overlay_cancel_button:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->f:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$drawable;->misnap_doc_center:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->b:Landroid/graphics/drawable/Drawable;

    sget v0, Lcom/miteksystems/misnap/R$id;->misnap_overlay_gauge:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    sget v0, Lcom/miteksystems/misnap/R$id;->misnap_balloon:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    sget v0, Lcom/miteksystems/misnap/R$id;->misnap_bug:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->W:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->W:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    sget v0, Lcom/miteksystems/misnap/R$id;->misnap_tutorial_overlay:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v0, Lcom/miteksystems/misnap/R$id;->misnap_vignette:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->ad:Landroid/widget/ImageView;

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->w()V

    sget v0, Lcom/miteksystems/misnap/R$id;->misnap_ghost_image:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$anim;->fadeout:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->aq:Landroid/view/animation/Animation;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$anim;->fadein:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->ar:Landroid/view/animation/Animation;

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->x()V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$anim;->misnap_balloon_animation:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->as:Landroid/view/animation/Animation;

    sget v0, Lcom/miteksystems/misnap/R$id;->misnap_overlay_test_text:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->h:Landroid/widget/TextView;

    sget-boolean v0, Lcom/miteksystems/misnap/r;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_2
    invoke-virtual {p0, v2}, Lcom/miteksystems/misnap/u;->setWillNotDraw(Z)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->e()I

    move-result v0

    iget-boolean v1, p0, Lcom/miteksystems/misnap/u;->aB:Z

    if-eqz v1, :cond_a

    const/4 v1, 0x3

    if-ne v0, v1, :cond_9

    sget v0, Lcom/miteksystems/misnap/R$drawable;->icon_flash_on:I

    :goto_4
    iget-object v1, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    sget v0, Lcom/miteksystems/misnap/R$id;->dialog_help_buttons:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->av:Landroid/widget/RelativeLayout;

    sget v0, Lcom/miteksystems/misnap/R$id;->rl_dialog_help:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    sget v0, Lcom/miteksystems/misnap/R$id;->btn_try_again:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    sget v1, Lcom/miteksystems/misnap/R$string;->dialog_mitek_manual_capture:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    sget v2, Lcom/miteksystems/misnap/R$string;->dialog_mitek_manual_capture:I

    invoke-virtual {v0, v1, v2}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;I)V

    :cond_3
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    new-instance v1, Lcom/miteksystems/misnap/y;

    invoke-direct {v1, p0}, Lcom/miteksystems/misnap/y;-><init>(Lcom/miteksystems/misnap/u;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, Lcom/miteksystems/misnap/R$id;->btn_cancel:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    new-instance v1, Lcom/miteksystems/misnap/z;

    invoke-direct {v1, p0}, Lcom/miteksystems/misnap/z;-><init>(Lcom/miteksystems/misnap/u;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->postInvalidate()V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->n:Ljava/lang/Runnable;

    const-wide/16 v2, 0x708

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_4
    move v0, v2

    goto/16 :goto_0

    :cond_5
    :try_start_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    goto/16 :goto_1

    :cond_6
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->Z()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2

    :cond_7
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->az()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->al()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->misnap_check_back_text:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_5
    iget-object v1, p0, Lcom/miteksystems/misnap/u;->U:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    :cond_8
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->Y()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_9
    sget v0, Lcom/miteksystems/misnap/R$drawable;->icon_flash_off:I

    goto/16 :goto_4

    :cond_a
    const/4 v1, 0x2

    if-ne v0, v1, :cond_b

    sget v0, Lcom/miteksystems/misnap/R$drawable;->icon_flash_on:I

    goto/16 :goto_4

    :cond_b
    sget v0, Lcom/miteksystems/misnap/R$drawable;->icon_flash_off:I

    goto/16 :goto_4
.end method

.method private constructor <init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;Lcom/miteksystems/misnap/s;Lcom/miteksystems/misnap/i;B)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/miteksystems/misnap/u;-><init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;Lcom/miteksystems/misnap/s;Lcom/miteksystems/misnap/i;)V

    return-void
.end method

.method constructor <init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;Lcom/miteksystems/misnap/s;Lcom/miteksystems/misnap/i;C)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/miteksystems/misnap/u;-><init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;Lcom/miteksystems/misnap/s;Lcom/miteksystems/misnap/i;B)V

    return-void
.end method

.method static synthetic A(Lcom/miteksystems/misnap/u;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private A()V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->aj:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aq:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aq:Landroid/view/animation/Animation;

    new-instance v1, Lcom/miteksystems/misnap/ac;

    invoke-direct {v1, p0}, Lcom/miteksystems/misnap/ac;-><init>(Lcom/miteksystems/misnap/u;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_0
    return-void
.end method

.method static synthetic B(Lcom/miteksystems/misnap/u;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->av:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic C(Lcom/miteksystems/misnap/u;)I
    .locals 1

    const/16 v0, 0x30

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->d(I)I

    move-result v0

    return v0
.end method

.method static synthetic D(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic E(Lcom/miteksystems/misnap/u;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic F(Lcom/miteksystems/misnap/u;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic G(Lcom/miteksystems/misnap/u;)V
    .locals 0

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->v()V

    return-void
.end method

.method static synthetic H(Lcom/miteksystems/misnap/u;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->b(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method static synthetic I(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic J(Lcom/miteksystems/misnap/u;)Ljava/lang/String;
    .locals 2

    iget v0, p0, Lcom/miteksystems/misnap/u;->x:I

    sget v1, Lcom/miteksystems/misnap/R$drawable;->error_more_light:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->more_light:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget v0, p0, Lcom/miteksystems/misnap/u;->x:I

    sget v1, Lcom/miteksystems/misnap/R$drawable;->error_center:I

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->hold_center:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/miteksystems/misnap/u;->x:I

    sget v1, Lcom/miteksystems/misnap/R$drawable;->error_getcloser:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->get_close:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/miteksystems/misnap/u;->x:I

    sget v1, Lcom/miteksystems/misnap/R$drawable;->error_hold_steady:I

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->hold_steady:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic K(Lcom/miteksystems/misnap/u;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->v:Z

    return v0
.end method

.method static synthetic L(Lcom/miteksystems/misnap/u;)V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/miteksystems/misnap/u;->ap:J

    return-void
.end method

.method private static a(FF)F
    .locals 2

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float v0, v1, p1

    mul-float/2addr v1, p0

    add-float/2addr v0, v1

    return v0
.end method

.method private a(Ljava/lang/String;)I
    .locals 3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    const-string v1, "drawable"

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/miteksystems/misnap/u;Ljava/util/List;F)Ljava/util/List;
    .locals 6

    invoke-static {p1}, Lcom/miteksystems/misnap/u;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/miteksystems/misnap/u;->c(Ljava/util/List;)Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->T:Landroid/graphics/Point;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v3, v0, Landroid/graphics/Point;->x:I

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->T:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    sub-int/2addr v3, v4

    iget v4, v0, Landroid/graphics/Point;->y:I

    iget-object v5, p0, Lcom/miteksystems/misnap/u;->T:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->y:I

    sub-int/2addr v4, v5

    int-to-float v3, v3

    mul-float/2addr v3, p2

    iget-object v5, p0, Lcom/miteksystems/misnap/u;->T:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->x:I

    int-to-float v5, v5

    add-float/2addr v3, v5

    float-to-int v3, v3

    iput v3, v0, Landroid/graphics/Point;->x:I

    int-to-float v3, v4

    mul-float/2addr v3, p2

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->T:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    add-float/2addr v3, v4

    float-to-int v3, v3

    iput v3, v0, Landroid/graphics/Point;->y:I

    goto :goto_0
.end method

.method static synthetic a(Lcom/miteksystems/misnap/u;I)V
    .locals 0

    iput p1, p0, Lcom/miteksystems/misnap/u;->x:I

    return-void
.end method

.method static synthetic a(Lcom/miteksystems/misnap/u;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/u;->P:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/miteksystems/misnap/u;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/miteksystems/misnap/u;->aD:Z

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->N:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-gt v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->N:Landroid/graphics/Path;

    invoke-virtual {v0, v2, v2}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->N:Landroid/graphics/Path;

    invoke-virtual {v0, v2, v2}, Landroid/graphics/Path;->lineTo(FF)V

    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/miteksystems/misnap/u;->N:Landroid/graphics/Path;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v2, v0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Path;->moveTo(FF)V

    const/4 v0, 0x1

    move v1, v0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->N:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->N:Landroid/graphics/Path;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v3, v0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    invoke-virtual {v2, v3, v0}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method

.method static synthetic a(Lcom/miteksystems/misnap/u;)Z
    .locals 1

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->p()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/b;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ae:Lcom/miteksystems/misnap/b;

    return-object v0
.end method

.method private static b(Ljava/util/List;)Ljava/util/List;
    .locals 5

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v0, 0x4

    if-lt v1, v0, :cond_0

    return-object v2

    :cond_0
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    new-instance v3, Landroid/graphics/Point;

    iget v4, v0, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-direct {v3, v4, v0}, Landroid/graphics/Point;-><init>(II)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/miteksystems/misnap/u;I)V
    .locals 0

    iput p1, p0, Lcom/miteksystems/misnap/u;->D:I

    return-void
.end method

.method static synthetic b(Lcom/miteksystems/misnap/u;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/miteksystems/misnap/u;->c(Z)V

    return-void
.end method

.method private c(Ljava/util/List;)Landroid/graphics/Point;
    .locals 7

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aI:Landroid/graphics/Point;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->aI:Landroid/graphics/Point;

    :cond_0
    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aI:Landroid/graphics/Point;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v2, v0, Landroid/graphics/Point;->x:I

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    add-int/2addr v2, v0

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    add-int/2addr v2, v0

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    add-int/2addr v0, v2

    shr-int/lit8 v0, v0, 0x2

    iput v0, v1, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aI:Landroid/graphics/Point;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v2, v0, Landroid/graphics/Point;->y:I

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    add-int/2addr v2, v0

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    add-int/2addr v2, v0

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    add-int/2addr v0, v2

    shr-int/lit8 v0, v0, 0x2

    iput v0, v1, Landroid/graphics/Point;->y:I

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aI:Landroid/graphics/Point;

    return-object v0
.end method

.method private c(I)V
    .locals 4

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method static synthetic c(Lcom/miteksystems/misnap/u;)V
    .locals 2

    const/4 v1, 0x0

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->A:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->t()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->p()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->ak:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/u;->ak:Z

    iput-object v1, p0, Lcom/miteksystems/misnap/u;->ae:Lcom/miteksystems/misnap/b;

    iput-object v1, p0, Lcom/miteksystems/misnap/u;->af:Lcom/miteksystems/misnap/b;

    iput-object v1, p0, Lcom/miteksystems/misnap/u;->ag:Lcom/miteksystems/misnap/b;

    iput-object v1, p0, Lcom/miteksystems/misnap/u;->ah:Lcom/miteksystems/misnap/b;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->i()V

    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/miteksystems/misnap/u;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/miteksystems/misnap/u;->aj:Z

    return-void
.end method

.method private c(Z)V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->d:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setClickable(Z)V

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->f:Landroid/widget/ImageButton;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->f:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setClickable(Z)V

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->e:Landroid/widget/ImageButton;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->e:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setClickable(Z)V

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    if-eqz v0, :cond_3

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setClickable(Z)V

    :cond_3
    if-nez p1, :cond_4

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->f:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->e:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;)V

    :goto_0
    return-void

    :cond_4
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->b(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->b(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->f:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->b(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->e:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->b(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->b(Landroid/view/View;)V

    goto :goto_0
.end method

.method private d(I)I
    .locals 3

    const/4 v0, 0x1

    int-to-float v1, p1

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method static synthetic d(Lcom/miteksystems/misnap/u;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/u;->az:Z

    return-void
.end method

.method static synthetic d(Lcom/miteksystems/misnap/u;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/miteksystems/misnap/u;->ai:Z

    return-void
.end method

.method static synthetic e(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MitekAnalyzer;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    return-object v0
.end method

.method static synthetic f(Lcom/miteksystems/misnap/u;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/u;->v:Z

    return-void
.end method

.method static synthetic g(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/b;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->af:Lcom/miteksystems/misnap/b;

    return-object v0
.end method

.method static synthetic h(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/b;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ag:Lcom/miteksystems/misnap/b;

    return-object v0
.end method

.method static synthetic i(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic j(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/b;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ah:Lcom/miteksystems/misnap/b;

    return-object v0
.end method

.method static synthetic k(Lcom/miteksystems/misnap/u;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->A:Z

    return v0
.end method

.method static synthetic l(Lcom/miteksystems/misnap/u;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->az:Z

    return v0
.end method

.method static synthetic m(Lcom/miteksystems/misnap/u;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    return-object v0
.end method

.method static synthetic o(Lcom/miteksystems/misnap/u;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Q:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method static synthetic p(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    return-object v0
.end method

.method private p()Z
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ae:Lcom/miteksystems/misnap/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ae:Lcom/miteksystems/misnap/b;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private q()Z
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->af:Lcom/miteksystems/misnap/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->af:Lcom/miteksystems/misnap/b;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic q(Lcom/miteksystems/misnap/u;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->aj:Z

    return v0
.end method

.method static synthetic r(Lcom/miteksystems/misnap/u;)J
    .locals 2

    iget-wide v0, p0, Lcom/miteksystems/misnap/u;->z:J

    return-wide v0
.end method

.method private r()Z
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ag:Lcom/miteksystems/misnap/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ag:Lcom/miteksystems/misnap/b;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic s(Lcom/miteksystems/misnap/u;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aF:Ljava/lang/Runnable;

    return-object v0
.end method

.method private s()Z
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ah:Lcom/miteksystems/misnap/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ah:Lcom/miteksystems/misnap/b;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic t(Lcom/miteksystems/misnap/u;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/u;->R:Z

    return-void
.end method

.method private t()Z
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->ai:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->q()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->s()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private u()I
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->S:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/u;->S:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->L()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->k()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    goto :goto_0
.end method

.method static synthetic u(Lcom/miteksystems/misnap/u;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->O:Ljava/util/List;

    return-object v0
.end method

.method private declared-synchronized v()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/s;->a()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->b(Z)V

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->aD:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/u;->aD:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->j()V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_timeout_help_end:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->aA:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method static synthetic v(Lcom/miteksystems/misnap/u;)V
    .locals 4

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->r()Z

    move-result v0

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lcom/miteksystems/misnap/u;->v:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-static {}, Lcom/miteksystems/misnap/j;->a()Lcom/miteksystems/misnap/j;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/j;->e(Landroid/widget/ImageView;)Lcom/miteksystems/misnap/b;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->ag:Lcom/miteksystems/misnap/b;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ag:Lcom/miteksystems/misnap/b;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->b()V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aE:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2ee

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method static synthetic w(Lcom/miteksystems/misnap/u;)I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/u;->D:I

    return v0
.end method

.method private w()V
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->u()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->v()Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    const-string v2, "REMITTANCE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v0, "mitek_vignette_remittance"

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/String;)I

    move-result v0

    :goto_0
    if-nez v0, :cond_2

    const-string v0, "mitek_vignette"

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/String;)I

    move-result v0

    :cond_2
    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ad:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ad:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_3
    :goto_1
    return-void

    :cond_4
    const-string v2, "CheckBack"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v0, "mitek_vignette_checkback"

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_5
    const-string v2, "CheckFront"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    const-string v2, "ACH"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    const-string v0, "mitek_vignette_checkfront"

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_7
    const-string v2, "BALANCE_TRANSFER"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v0, "mitek_vignette_balance_transfer"

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_8
    const-string v2, "DRIVER_LICENSE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v0, "mitek_vignette_driver_license"

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_9
    const-string v2, "BUSINESS_CARD"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v0, "mitek_vignette_business_card"

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_a
    const-string v2, "AUTO_INSURANCE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    const-string v0, "mitek_vignette_auto_insurance"

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_b
    const-string v2, "VIN"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    const-string v0, "mitek_vignette_vin"

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/String;)I

    move-result v0

    goto/16 :goto_0

    :cond_c
    const-string v2, "W2"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    const-string v0, "mitek_vignette_w2"

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/String;)I

    move-result v0

    goto/16 :goto_0

    :cond_d
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ad:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    :cond_e
    move v0, v1

    goto/16 :goto_0
.end method

.method static synthetic x(Lcom/miteksystems/misnap/u;)Landroid/app/AlertDialog;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->C:Landroid/app/AlertDialog;

    return-object v0
.end method

.method private x()V
    .locals 7

    const/16 v5, 0x32

    const/16 v4, 0x3c

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->y()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->B()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->n()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/16 v1, 0x28

    invoke-direct {p0, v1}, Lcom/miteksystems/misnap/u;->d(I)I

    move-result v1

    const-string v3, "REMITTANCE"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    sget v1, Lcom/miteksystems/misnap/R$drawable;->ghost_remittance:I

    :goto_0
    invoke-direct {p0, v5}, Lcom/miteksystems/misnap/u;->d(I)I

    move-result v2

    move v6, v2

    move v2, v1

    move v1, v6

    :goto_1
    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getId()I

    move-result v3

    if-eq v3, v2, :cond_1

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->y()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->z()V

    :cond_3
    return-void

    :cond_4
    sget v1, Lcom/miteksystems/misnap/R$drawable;->manual_ghost_remittance:I

    goto :goto_0

    :cond_5
    const-string v3, "CheckBack"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v1

    if-eqz v1, :cond_6

    sget v1, Lcom/miteksystems/misnap/R$drawable;->ghost_checkback:I

    :goto_2
    invoke-direct {p0, v4}, Lcom/miteksystems/misnap/u;->d(I)I

    move-result v2

    move v6, v2

    move v2, v1

    move v1, v6

    goto :goto_1

    :cond_6
    sget v1, Lcom/miteksystems/misnap/R$drawable;->manual_ghost_checkback:I

    goto :goto_2

    :cond_7
    const-string v3, "CheckFront"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_8

    const-string v3, "ACH"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    :cond_8
    iget-object v1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v1

    if-eqz v1, :cond_9

    sget v1, Lcom/miteksystems/misnap/R$drawable;->ghost_checkfront:I

    :goto_3
    invoke-direct {p0, v4}, Lcom/miteksystems/misnap/u;->d(I)I

    move-result v2

    move v6, v2

    move v2, v1

    move v1, v6

    goto :goto_1

    :cond_9
    sget v1, Lcom/miteksystems/misnap/R$drawable;->manual_ghost_checkfront:I

    goto :goto_3

    :cond_a
    const-string v3, "BALANCE_TRANSFER"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v1

    if-eqz v1, :cond_b

    sget v1, Lcom/miteksystems/misnap/R$drawable;->ghost_balance_transfer:I

    :goto_4
    invoke-direct {p0, v5}, Lcom/miteksystems/misnap/u;->d(I)I

    move-result v2

    move v6, v2

    move v2, v1

    move v1, v6

    goto/16 :goto_1

    :cond_b
    sget v1, Lcom/miteksystems/misnap/R$drawable;->manual_ghost_balance_transfer:I

    goto :goto_4

    :cond_c
    const-string v3, "DRIVER_LICENSE"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v2

    if-eqz v2, :cond_d

    sget v2, Lcom/miteksystems/misnap/R$drawable;->ghost_driver_license_landscape:I

    goto/16 :goto_1

    :cond_d
    sget v2, Lcom/miteksystems/misnap/R$drawable;->manual_ghost_driver_license_landscape:I

    goto/16 :goto_1

    :cond_e
    const-string v3, "BUSINESS_CARD"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    sget v2, Lcom/miteksystems/misnap/R$drawable;->ghost_business_card:I

    goto/16 :goto_1

    :cond_f
    const-string v3, "AUTO_INSURANCE"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_10

    sget v2, Lcom/miteksystems/misnap/R$drawable;->ghost_auto_insurance_card:I

    goto/16 :goto_1

    :cond_10
    const-string v3, "VIN"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_11

    sget v2, Lcom/miteksystems/misnap/R$drawable;->manual_ghost_vin:I

    goto/16 :goto_1

    :cond_11
    const-string v3, "W2"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v2

    if-eqz v2, :cond_12

    sget v2, Lcom/miteksystems/misnap/R$drawable;->ghost_w2:I

    goto/16 :goto_1

    :cond_12
    sget v2, Lcom/miteksystems/misnap/R$drawable;->manual_ghost_w2:I

    goto/16 :goto_1

    :cond_13
    sget v2, Lcom/miteksystems/misnap/R$drawable;->ghost_check_blank:I

    invoke-direct {p0, v4}, Lcom/miteksystems/misnap/u;->d(I)I

    move-result v1

    goto/16 :goto_1
.end method

.method static synthetic y(Lcom/miteksystems/misnap/u;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aH:Ljava/lang/Runnable;

    return-object v0
.end method

.method private y()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->n()Ljava/lang/String;

    move-result-object v1

    const-string v2, "REMITTANCE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_remittance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->T()I

    move-result v1

    if-nez v1, :cond_f

    :goto_1
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_remittance_manual:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v2, "CheckBack"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_check:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_check_manual:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_4
    const-string v2, "CheckFront"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "ACH"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_5
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_check:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_check_manual:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_7
    const-string v2, "BALANCE_TRANSFER"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_remittance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_remittance_manual:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_9
    const-string v2, "DRIVER_LICENSE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_drivers_license:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_a
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_drivers_license_manual:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_b
    const-string v2, "AUTO_INSURANCE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_insurance_card:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_c
    const-string v2, "VIN"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_vin_manual:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_d
    const-string v2, "W2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_w2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_e
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v1, Lcom/miteksystems/misnap/R$string;->ghost_image_w2_manual:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_f
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1
.end method

.method static synthetic z(Lcom/miteksystems/misnap/u;)I
    .locals 1

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->u()I

    move-result v0

    return v0
.end method

.method private z()V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->y()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->aj:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->ar:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ar:Landroid/view/animation/Animation;

    new-instance v1, Lcom/miteksystems/misnap/ab;

    invoke-direct {v1, p0}, Lcom/miteksystems/misnap/ab;-><init>(Lcom/miteksystems/misnap/u;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/miteksystems/misnap/MitekAnalyzer;)I
    .locals 10

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    if-nez v0, :cond_1

    iput-object p1, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->d()Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->c(I)V

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-boolean v0, v0, Lcom/miteksystems/misnap/MiSnap;->p:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->aB:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->F()I

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->aB:Z

    if-eqz v0, :cond_5

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->F()I

    move-result v1

    if-ne v0, v1, :cond_5

    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/miteksystems/misnap/u;->ao:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_12

    iput-wide v0, p0, Lcom/miteksystems/misnap/u;->ao:J

    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->l()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_14

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_14

    const/4 v0, 0x1

    move v1, v0

    :goto_3
    const/4 v0, 0x0

    if-eqz v1, :cond_7

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->g()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MitekAnalyzer;->m()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const v1, 0x3d4ccccd    # 0.05f

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MitekAnalyzer;->h()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->n()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    const v2, 0x3d4ccccd    # 0.05f

    sub-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v3

    iget v0, p0, Lcom/miteksystems/misnap/u;->H:F

    float-to-double v0, v0

    iget v2, p0, Lcom/miteksystems/misnap/u;->J:I

    int-to-double v6, v2

    div-double/2addr v0, v6

    iput-wide v0, p0, Lcom/miteksystems/misnap/u;->L:D

    iget v0, p0, Lcom/miteksystems/misnap/u;->I:F

    float-to-double v0, v0

    iget v2, p0, Lcom/miteksystems/misnap/u;->K:I

    int-to-double v6, v2

    div-double/2addr v0, v6

    iput-wide v0, p0, Lcom/miteksystems/misnap/u;->M:D

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_16

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_15

    :cond_6
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->O:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->c(Ljava/util/List;)Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->T:Landroid/graphics/Point;

    move v0, v3

    :cond_7
    iget v1, p0, Lcom/miteksystems/misnap/u;->t:F

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->a(FF)F

    move-result v0

    iput v0, p0, Lcom/miteksystems/misnap/u;->t:F

    iget v0, p0, Lcom/miteksystems/misnap/u;->t:F

    iget v1, p0, Lcom/miteksystems/misnap/u;->t:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/miteksystems/misnap/u;->u:F

    iget v0, p0, Lcom/miteksystems/misnap/u;->u:F

    float-to-double v0, v0

    const-wide v2, 0x3fee666666666666L    # 0.95

    cmpl-double v0, v0, v2

    if-lez v0, :cond_18

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/miteksystems/misnap/u;->u:F

    :cond_8
    :goto_5
    sget-boolean v0, Lcom/miteksystems/misnap/r;->a:Z

    if-eqz v0, :cond_9

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/Integer;)V

    :cond_9
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->z()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v1, v0, v1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->j()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v1

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->g()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_19

    const/4 v0, 0x1

    :goto_6
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->s()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->h()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1a

    const/4 v1, 0x1

    :goto_7
    iget-boolean v2, p0, Lcom/miteksystems/misnap/u;->az:Z

    if-nez v2, :cond_1c

    if-nez v0, :cond_a

    if-eqz v1, :cond_1c

    :cond_a
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-nez v0, :cond_1b

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->y()Z

    move-result v0

    if-nez v0, :cond_1b

    :cond_b
    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->t()Z

    move-result v0

    if-nez v0, :cond_1b

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->y()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->A()V

    :cond_c
    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->q()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-static {}, Lcom/miteksystems/misnap/j;->a()Lcom/miteksystems/misnap/j;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/j;->c(Landroid/widget/ImageView;)Lcom/miteksystems/misnap/b;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->af:Lcom/miteksystems/misnap/b;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->af:Lcom/miteksystems/misnap/b;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->b()V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->p:Ljava/lang/Runnable;

    const-wide/16 v2, 0x4e2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_d
    :goto_8
    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->postInvalidate()V

    const/4 v0, 0x1

    goto/16 :goto_0

    :cond_e
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->l()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->t()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->a()Z

    move-result v1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->b()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->c()Z

    move-result v0

    if-nez v0, :cond_11

    const/4 v0, 0x0

    :goto_9
    if-nez v1, :cond_f

    const/4 v2, 0x1

    invoke-direct {p0, v2}, Lcom/miteksystems/misnap/u;->c(I)V

    :cond_f
    if-nez v0, :cond_10

    const/4 v2, 0x2

    invoke-direct {p0, v2}, Lcom/miteksystems/misnap/u;->c(I)V

    :cond_10
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->e()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->c(I)V

    goto/16 :goto_1

    :cond_11
    const/4 v0, 0x1

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->E()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/miteksystems/misnap/MitekAnalyzer;->a(I)Z

    move-result v2

    if-nez v2, :cond_5

    iget-wide v2, p0, Lcom/miteksystems/misnap/u;->ao:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->D()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->e()Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/l;->b(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    sget v1, Lcom/miteksystems/misnap/R$drawable;->icon_flash_on:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_flash_auto_on:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_13
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/miteksystems/misnap/MiSnap;->p:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    goto/16 :goto_2

    :cond_14
    const/4 v0, 0x0

    move v1, v0

    goto/16 :goto_3

    :cond_15
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->O:Ljava/util/List;

    new-instance v4, Landroid/graphics/Point;

    iget v5, v0, Landroid/graphics/Point;->x:I

    int-to-double v6, v5

    iget-wide v8, p0, Lcom/miteksystems/misnap/u;->L:D

    mul-double/2addr v6, v8

    double-to-int v5, v6

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-double v6, v0

    iget-wide v8, p0, Lcom/miteksystems/misnap/u;->M:D

    mul-double/2addr v6, v8

    double-to-int v0, v6

    invoke-direct {v4, v5, v0}, Landroid/graphics/Point;-><init>(II)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    :cond_16
    const/4 v0, 0x0

    move v4, v0

    :goto_a
    const/4 v0, 0x4

    if-ge v4, v0, :cond_6

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    if-eqz v1, :cond_17

    iget v1, v0, Landroid/graphics/Point;->y:I

    if-eqz v1, :cond_17

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->O:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Point;

    iget v2, v0, Landroid/graphics/Point;->x:I

    int-to-double v6, v2

    iget-wide v8, p0, Lcom/miteksystems/misnap/u;->L:D

    mul-double/2addr v6, v8

    double-to-float v6, v6

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->O:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    invoke-static {v6, v2}, Lcom/miteksystems/misnap/u;->a(FF)F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->O:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-double v6, v0

    iget-wide v8, p0, Lcom/miteksystems/misnap/u;->M:D

    mul-double/2addr v6, v8

    double-to-float v2, v6

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->O:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    invoke-static {v2, v0}, Lcom/miteksystems/misnap/u;->a(FF)F

    move-result v0

    float-to-int v0, v0

    iput v0, v1, Landroid/graphics/Point;->y:I

    :cond_17
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_a

    :cond_18
    iget v0, p0, Lcom/miteksystems/misnap/u;->u:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_8

    const/4 v0, 0x0

    iput v0, p0, Lcom/miteksystems/misnap/u;->u:F

    goto/16 :goto_5

    :cond_19
    const/4 v0, 0x0

    goto/16 :goto_6

    :cond_1a
    const/4 v1, 0x0

    goto/16 :goto_7

    :cond_1b
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/miteksystems/misnap/u;->ap:J

    goto/16 :goto_8

    :cond_1c
    iget v2, p0, Lcom/miteksystems/misnap/u;->u:F

    const v3, 0x3dcccccd    # 0.1f

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_1f

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/miteksystems/misnap/u;->v:Z

    :cond_1d
    :goto_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/miteksystems/misnap/u;->ap:J

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-eqz v4, :cond_21

    iget-wide v4, p0, Lcom/miteksystems/misnap/u;->ap:J

    sub-long v4, v2, v4

    iget-object v6, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v6, v6, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v6}, Lcom/miteksystems/misnap/MiSnapAPI;->A()I

    move-result v6

    int-to-long v6, v6

    cmp-long v4, v4, v6

    if-lez v4, :cond_20

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->t()Z

    move-result v4

    if-nez v4, :cond_20

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->isShown()Z

    move-result v4

    if-nez v4, :cond_20

    iget-boolean v4, p0, Lcom/miteksystems/misnap/u;->aj:Z

    if-nez v4, :cond_20

    if-nez v0, :cond_20

    if-nez v1, :cond_20

    iput-wide v2, p0, Lcom/miteksystems/misnap/u;->ap:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/u;->v:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->ai:Z

    if-nez v0, :cond_1e

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aq:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aq:Landroid/view/animation/Animation;

    new-instance v1, Lcom/miteksystems/misnap/ad;

    invoke-direct {v1, p0}, Lcom/miteksystems/misnap/ad;-><init>(Lcom/miteksystems/misnap/u;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_1e
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->y()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->z()V

    goto/16 :goto_8

    :cond_1f
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->isShown()Z

    move-result v2

    if-nez v2, :cond_1d

    iget v2, p0, Lcom/miteksystems/misnap/u;->u:F

    const v3, 0x3dcccccd    # 0.1f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_1d

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/miteksystems/misnap/u;->v:Z

    goto :goto_b

    :cond_20
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-nez v0, :cond_21

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->aj:Z

    if-eqz v0, :cond_d

    :cond_21
    iput-wide v2, p0, Lcom/miteksystems/misnap/u;->ap:J

    goto/16 :goto_8
.end method

.method final a()V
    .locals 5

    const/4 v4, 0x0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/u;->A:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aH:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->r:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->C:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    const-string v0, "MiSnapUI"

    const-string v1, "auto-dismissing tutorial due to snapshotGood() call"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->C:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->O:Ljava/util/List;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->P:Ljava/util/List;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/miteksystems/misnap/u;->z:J

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aF:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->s()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-static {}, Lcom/miteksystems/misnap/j;->a()Lcom/miteksystems/misnap/j;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/j;->d(Landroid/widget/ImageView;)Lcom/miteksystems/misnap/b;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->ah:Lcom/miteksystems/misnap/b;

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ah:Lcom/miteksystems/misnap/b;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->b()V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->q:Ljava/lang/Runnable;

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    :goto_0
    iput-boolean v4, p0, Lcom/miteksystems/misnap/u;->v:Z

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->p()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->W:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->m:Ljava/lang/Runnable;

    const-wide/16 v2, 0x640

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/miteksystems/misnap/j;->a()Lcom/miteksystems/misnap/j;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->W:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/j;->a(Landroid/widget/ImageView;)Lcom/miteksystems/misnap/b;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->ae:Lcom/miteksystems/misnap/b;

    :goto_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ae:Lcom/miteksystems/misnap/b;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->b()V

    :cond_2
    return-void

    :cond_3
    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->A()V

    goto :goto_0

    :cond_4
    invoke-static {}, Lcom/miteksystems/misnap/j;->a()Lcom/miteksystems/misnap/j;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->W:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/j;->b(Landroid/widget/ImageView;)Lcom/miteksystems/misnap/b;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->ae:Lcom/miteksystems/misnap/b;

    goto :goto_1
.end method

.method final a(I)V
    .locals 2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->c:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->c:Landroid/widget/ImageButton;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method final a(II)V
    .locals 0

    iput p1, p0, Lcom/miteksystems/misnap/u;->J:I

    iput p2, p0, Lcom/miteksystems/misnap/u;->K:I

    return-void
.end method

.method final a(Ljava/lang/Integer;)V
    .locals 12

    const/high16 v11, 0x41200000    # 10.0f

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v9, 0x1

    const/4 v8, 0x0

    if-eqz p1, :cond_d

    const/4 v0, 0x3

    iput v0, p0, Lcom/miteksystems/misnap/u;->aG:I

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-boolean v1, Lcom/miteksystems/misnap/r;->c:Z

    if-nez v1, :cond_1

    iget v1, p0, Lcom/miteksystems/misnap/u;->al:F

    cmpg-float v1, v10, v1

    if-gez v1, :cond_2

    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    long-to-float v1, v2

    iget v4, p0, Lcom/miteksystems/misnap/u;->an:F

    sub-float/2addr v1, v4

    float-to-int v1, v1

    int-to-float v1, v1

    iget v4, p0, Lcom/miteksystems/misnap/u;->am:F

    add-float/2addr v1, v4

    iput v1, p0, Lcom/miteksystems/misnap/u;->am:F

    iget v1, p0, Lcom/miteksystems/misnap/u;->am:F

    iget v4, p0, Lcom/miteksystems/misnap/u;->al:F

    div-float/2addr v1, v4

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "FPS="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "%.02f"

    new-array v6, v9, [Ljava/lang/Object;

    const v7, 0x4e6e6b28    # 1.0E9f

    div-float v1, v7, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v6, v8

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/miteksystems/misnap/u;->al:F

    add-float/2addr v1, v10

    iput v1, p0, Lcom/miteksystems/misnap/u;->al:F

    long-to-float v1, v2

    iput v1, p0, Lcom/miteksystems/misnap/u;->an:F

    :cond_2
    sget-boolean v1, Lcom/miteksystems/misnap/r;->d:Z

    if-eqz v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "line.separator"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "Light (target "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->E()I

    move-result v2

    div-int/lit8 v2, v2, 0x64

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%.01f"

    new-array v3, v9, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MitekAnalyzer;->j()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    sget-boolean v1, Lcom/miteksystems/misnap/r;->e:Z

    if-nez v1, :cond_4

    sget-boolean v1, Lcom/miteksystems/misnap/r;->f:Z

    if-eqz v1, :cond_5

    :cond_4
    const-string v1, "line.separator"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    sget-boolean v1, Lcom/miteksystems/misnap/r;->e:Z

    if-eqz v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fill %: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "%.01f"

    new-array v3, v9, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MitekAnalyzer;->g()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v11

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    sget-boolean v1, Lcom/miteksystems/misnap/r;->e:Z

    if-nez v1, :cond_7

    sget-boolean v1, Lcom/miteksystems/misnap/r;->f:Z

    if-eqz v1, :cond_8

    :cond_7
    const-string v1, "\t"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    sget-boolean v1, Lcom/miteksystems/misnap/r;->f:Z

    if-eqz v1, :cond_9

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Horiz Fill %: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "%.01f"

    new-array v3, v9, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MitekAnalyzer;->h()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v11

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    sget-boolean v1, Lcom/miteksystems/misnap/r;->e:Z

    if-nez v1, :cond_a

    sget-boolean v1, Lcom/miteksystems/misnap/r;->f:Z

    if-eqz v1, :cond_b

    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "line.separator"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "MetricAvg: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%.01f"

    new-array v3, v9, [Ljava/lang/Object;

    iget v4, p0, Lcom/miteksystems/misnap/u;->u:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    if-eqz p1, :cond_c

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " Focus: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_c
    iget-object v1, p0, Lcom/miteksystems/misnap/u;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    :cond_d
    iget v0, p0, Lcom/miteksystems/misnap/u;->aG:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/miteksystems/misnap/u;->aG:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/miteksystems/misnap/u;->aG:I

    goto :goto_0
.end method

.method final a(Z)V
    .locals 3

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setClickable(Z)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->d:Landroid/widget/ImageButton;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setClickable(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0
.end method

.method final b()V
    .locals 5

    const/4 v4, 0x0

    iget v0, p0, Lcom/miteksystems/misnap/u;->H:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget-boolean v1, p0, Lcom/miteksystems/misnap/u;->v:Z

    if-eqz v1, :cond_0

    iget v0, p0, Lcom/miteksystems/misnap/u;->u:F

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getRight()I

    move-result v1

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getLeft()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x3fe199999999999aL    # 0.55

    mul-double/2addr v0, v2

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getLeft()I

    move-result v2

    int-to-double v2, v2

    add-double/2addr v0, v2

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-double v2, v2

    sub-double/2addr v0, v2

    double-to-float v0, v0

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v4, v4}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_0
    move v1, v0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    iget v2, p0, Lcom/miteksystems/misnap/u;->x:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    float-to-int v1, v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->as:Landroid/view/animation/Animation;

    new-instance v1, Lcom/miteksystems/misnap/aa;

    invoke-direct {v1, p0}, Lcom/miteksystems/misnap/aa;-><init>(Lcom/miteksystems/misnap/u;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->as:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->as:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    return-void
.end method

.method final b(I)V
    .locals 6

    const/4 v2, 0x1

    const/16 v4, 0x8

    const/high16 v1, -0x1000000

    const/4 v5, 0x0

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->i()V

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->A:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->h()V

    invoke-virtual {p0, v2}, Lcom/miteksystems/misnap/u;->b(Z)V

    invoke-direct {p0, v5}, Lcom/miteksystems/misnap/u;->c(Z)V

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    :goto_1
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->av:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    invoke-virtual {v1, v0}, Lcom/miteksystems/misnap/s;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_timeout_help_begin:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->postInvalidate()V

    goto :goto_0

    :pswitch_0
    iput-boolean v2, p0, Lcom/miteksystems/misnap/u;->aA:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->W()I

    move-result v0

    or-int/2addr v1, v0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->R()I

    move-result v0

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->aA()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v3, Lcom/miteksystems/misnap/R$drawable;->failover_check_tutorial_pic:I

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v2, Lcom/miteksystems/misnap/R$string;->help_failover_check:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v2, v3, v0}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    :goto_3
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->au()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setVisibility(I)V

    :goto_4
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->as()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    sget v3, Lcom/miteksystems/misnap/R$string;->dialog_mitek_capture:I

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    sget v4, Lcom/miteksystems/misnap/R$string;->dialog_mitek_capture:I

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;I)V

    goto/16 :goto_1

    :cond_3
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v3, Lcom/miteksystems/misnap/R$drawable;->failover_tutorial_pic:I

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v2, Lcom/miteksystems/misnap/R$string;->help_failover_document:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_5
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v2, v3, v0}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_6
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->ae()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->ae()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->af()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->af()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->X()I

    move-result v0

    or-int/2addr v1, v0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->aA:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->Q()I

    move-result v0

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->aA()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v3, Lcom/miteksystems/misnap/R$drawable;->check_tutorial_pic:I

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v2, Lcom/miteksystems/misnap/R$string;->help_check:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_6
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v2, v3, v0}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    :goto_7
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->ao()Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setVisibility(I)V

    :goto_8
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->an()Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    sget v3, Lcom/miteksystems/misnap/R$string;->dialog_mitek_capture:I

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    sget v4, Lcom/miteksystems/misnap/R$string;->dialog_mitek_capture:I

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;I)V

    goto/16 :goto_1

    :cond_8
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_9
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v3, Lcom/miteksystems/misnap/R$drawable;->tutorial_pic:I

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v2, Lcom/miteksystems/misnap/R$string;->help_document:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_9
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v2, v3, v0}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_7

    :cond_a
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_b
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->am()Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    sget v3, Lcom/miteksystems/misnap/R$string;->dialog_mitek_cancel:I

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    sget v4, Lcom/miteksystems/misnap/R$string;->dialog_mitek_cancel:I

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;I)V

    goto :goto_8

    :cond_c
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->aa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->aa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_8

    :cond_d
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->ab()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->ab()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_e
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->S()I

    move-result v0

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->aA()Z

    move-result v2

    if-eqz v2, :cond_10

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v3, Lcom/miteksystems/misnap/R$drawable;->manual_check_tutorial_pic:I

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v2, Lcom/miteksystems/misnap/R$string;->help_manual_check:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_a
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v2, v3, v0}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    :goto_b
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->ax()Z

    move-result v2

    if-eqz v2, :cond_12

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setVisibility(I)V

    :goto_c
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->aw()Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    sget v3, Lcom/miteksystems/misnap/R$string;->dialog_mitek_manual_capture:I

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    sget v4, Lcom/miteksystems/misnap/R$string;->dialog_mitek_manual_capture:I

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;I)V

    goto/16 :goto_1

    :cond_f
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_a

    :cond_10
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v3, Lcom/miteksystems/misnap/R$drawable;->manual_tutorial_pic:I

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    if-nez v0, :cond_11

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v2, Lcom/miteksystems/misnap/R$string;->help_manual_document:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_d
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v2, v3, v0}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_b

    :cond_11
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_d

    :cond_12
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->av()Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    sget v3, Lcom/miteksystems/misnap/R$string;->dialog_mitek_cancel:I

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    sget v4, Lcom/miteksystems/misnap/R$string;->dialog_mitek_cancel:I

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;I)V

    goto :goto_c

    :cond_13
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->ag()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->ag()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_c

    :cond_14
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->ah()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->ah()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_2
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->U()I

    move-result v0

    or-int/2addr v1, v0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->Q()I

    move-result v0

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->aA()Z

    move-result v2

    if-eqz v2, :cond_16

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v3, Lcom/miteksystems/misnap/R$drawable;->check_tutorial_pic:I

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    if-nez v0, :cond_15

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v2, Lcom/miteksystems/misnap/R$string;->help_check:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_e
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v2, v3, v0}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    :goto_f
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->ar()Z

    move-result v2

    if-eqz v2, :cond_18

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setVisibility(I)V

    :goto_10
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->aq()Z

    move-result v2

    if-eqz v2, :cond_1a

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    sget v3, Lcom/miteksystems/misnap/R$string;->dialog_mitek_try_again:I

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    sget v4, Lcom/miteksystems/misnap/R$string;->dialog_mitek_try_again:I

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;I)V

    goto/16 :goto_1

    :cond_15
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_e

    :cond_16
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v3, Lcom/miteksystems/misnap/R$drawable;->tutorial_pic:I

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    if-nez v0, :cond_17

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    sget v2, Lcom/miteksystems/misnap/R$string;->help_document:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_11
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v2, v3, v0}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_f

    :cond_17
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_11

    :cond_18
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->ap()Z

    move-result v2

    if-eqz v2, :cond_19

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    sget v3, Lcom/miteksystems/misnap/R$string;->dialog_mitek_cancel:I

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    sget v4, Lcom/miteksystems/misnap/R$string;->dialog_mitek_cancel:I

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;I)V

    goto :goto_10

    :cond_19
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->ac()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->ac()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_10

    :cond_1a
    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->ad()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    iget-object v4, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->ad()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method final b(Z)V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setClickable(Z)V

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setClickable(Z)V

    :cond_1
    if-nez p1, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;)V

    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->ay:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->b(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->ax:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/i;->b(Landroid/view/View;)V

    goto :goto_0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/u;->D:I

    return v0
.end method

.method public final d()V
    .locals 2

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->w()V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method protected final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->k()F

    move-result v0

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->at:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->at:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->au:[F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    aput v1, v0, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    aput v1, v0, v3

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnap;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    aget v1, v0, v2

    aget v0, v0, v3

    invoke-virtual {p1, v1, v0}, Landroid/view/MotionEvent;->setLocation(FF)V

    :goto_0
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->getWidth()I

    move-result v1

    int-to-float v1, v1

    aget v2, v0, v2

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->getHeight()I

    move-result v2

    int-to-float v2, v2

    aget v0, v0, v3

    sub-float v0, v2, v0

    invoke-virtual {p1, v1, v0}, Landroid/view/MotionEvent;->setLocation(FF)V

    goto :goto_0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v0

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->aA:Z

    return v0
.end method

.method final g()V
    .locals 5

    const/4 v4, -0x1

    const/4 v3, 0x0

    invoke-direct {p0, v3}, Lcom/miteksystems/misnap/u;->c(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/s;->a()V

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->aA()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v1, Lcom/miteksystems/misnap/R$drawable;->check_tutorial_first_time_user_pic:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    sget v0, Lcom/miteksystems/misnap/R$string;->misnap_tutorial_check:I

    :goto_0
    iget-object v1, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    iget-object v1, v1, Lcom/miteksystems/misnap/s;->b:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->P()I

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    invoke-virtual {v1, v0}, Lcom/miteksystems/misnap/s;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v1, v2, v0}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    :cond_1
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v4, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->av:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->V()I

    move-result v1

    const/high16 v2, -0x1000000

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->s:Ljava/lang/Runnable;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->M()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x1

    sput-boolean v0, Lcom/miteksystems/misnap/u;->a:Z

    return-void

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v1, Lcom/miteksystems/misnap/R$drawable;->tutorial_first_time_user_pic:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    sget v0, Lcom/miteksystems/misnap/R$string;->misnap_tutorial_document:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->aA()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v1, Lcom/miteksystems/misnap/R$drawable;->manual_check_tutorial_first_time_user_pic:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    sget v0, Lcom/miteksystems/misnap/R$string;->help_failover_check:I

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    sget v1, Lcom/miteksystems/misnap/R$drawable;->manual_tutorial_first_time_user_pic:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    sget v0, Lcom/miteksystems/misnap/R$string;->help_failover_document:I

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->i:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    iget-object v1, v1, Lcom/miteksystems/misnap/s;->b:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->P()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method final h()V
    .locals 2

    const/4 v1, 0x4

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->av:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->c(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method

.method final i()V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->r:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aH:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method final j()V
    .locals 4

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->k()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->aH:Ljava/lang/Runnable;

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->u()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    sget-boolean v0, Lcom/miteksystems/misnap/u;->a:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->c(Z)V

    :cond_2
    return-void
.end method

.method final k()V
    .locals 4

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->r:Ljava/lang/Runnable;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->J()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method final l()V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x4

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->x()V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->e:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->e:Landroid/widget/ImageButton;

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setClickable(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->r:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iput-boolean v2, p0, Lcom/miteksystems/misnap/u;->v:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/miteksystems/misnap/u;->t:F

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->B()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->C()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    sget-boolean v0, Lcom/miteksystems/misnap/u;->a:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aw:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_1
    invoke-direct {p0, v4}, Lcom/miteksystems/misnap/u;->c(Z)V

    :cond_2
    return-void

    :cond_3
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public final m()V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->y()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->k:Lcom/miteksystems/misnap/s;

    invoke-virtual {v1, v0}, Lcom/miteksystems/misnap/s;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method final n()V
    .locals 4

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->postInvalidate()V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/miteksystems/misnap/MitekAnalyzer;->i:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->o:Ljava/lang/Runnable;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->w()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method final o()V
    .locals 4

    const/4 v3, 0x0

    sput-boolean v3, Lcom/miteksystems/misnap/u;->a:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->B:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v0, Lcom/miteksystems/misnap/MiSnap;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->aH:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->r:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->p:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->aE:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->n:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->aF:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->E:Landroid/os/Handler;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->s:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ab:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->destroyDrawingCache()V

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ad:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ad:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ad:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->destroyDrawingCache()V

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->ac:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->destroyDrawingCache()V

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->aa:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->destroyDrawingCache()V

    :cond_3
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->destroyDrawingCache()V

    :cond_4
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->destroyDrawingCache()V

    :cond_5
    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method protected final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    const/4 v2, 0x0

    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/miteksystems/misnap/u;->H:F

    invoke-virtual {p0}, Lcom/miteksystems/misnap/u;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/miteksystems/misnap/u;->I:F

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->V:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/miteksystems/misnap/u;->H:F

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v2, v2, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/u;->V:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->V:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/u;->F:Lcom/miteksystems/misnap/MitekAnalyzer;

    if-nez v0, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->R:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->P:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/u;->a(Ljava/util/List;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->N:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->G:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_3
    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->v:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->w:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->w:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->T:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->V:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->T:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    iget-object v3, p0, Lcom/miteksystems/misnap/u;->V:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object v0, p0, Lcom/miteksystems/misnap/u;->V:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->w:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->G:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    :cond_4
    iget-boolean v0, p0, Lcom/miteksystems/misnap/u;->v:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/miteksystems/misnap/u;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/miteksystems/misnap/u;->u:F

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, Lcom/miteksystems/misnap/u;->Z:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/miteksystems/misnap/u;->y:[I

    aget v0, v2, v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0
.end method
