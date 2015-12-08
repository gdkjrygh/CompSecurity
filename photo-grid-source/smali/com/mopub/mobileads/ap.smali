.class final Lcom/mopub/mobileads/ap;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private b:F

.field private c:I

.field private d:Z

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Landroid/graphics/drawable/Drawable;

.field private h:Landroid/view/View$OnTouchListener;

.field private i:I

.field private j:I

.field private k:I


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/mopub/mobileads/ap;->a:Landroid/content/Context;

    .line 44
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/mopub/mobileads/ap;->b:F

    .line 45
    const/16 v0, 0x11

    iput v0, p0, Lcom/mopub/mobileads/ap;->c:I

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lcom/mopub/mobileads/ap;->i:I

    .line 49
    const/16 v0, 0x9

    iput v0, p0, Lcom/mopub/mobileads/ap;->j:I

    .line 50
    const/16 v0, 0xb

    iput v0, p0, Lcom/mopub/mobileads/ap;->k:I

    .line 51
    return-void
.end method

.method static synthetic a(Lcom/mopub/mobileads/ap;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/mopub/mobileads/ap;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/mopub/mobileads/ap;)F
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/mopub/mobileads/ap;->b:F

    return v0
.end method

.method static synthetic c(Lcom/mopub/mobileads/ap;)I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/mopub/mobileads/ap;->c:I

    return v0
.end method

.method static synthetic d(Lcom/mopub/mobileads/ap;)I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/mopub/mobileads/ap;->i:I

    return v0
.end method

.method static synthetic e(Lcom/mopub/mobileads/ap;)Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lcom/mopub/mobileads/ap;->f:Z

    return v0
.end method

.method static synthetic f(Lcom/mopub/mobileads/ap;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/mopub/mobileads/ap;->g:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static synthetic g(Lcom/mopub/mobileads/ap;)I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/mopub/mobileads/ap;->k:I

    return v0
.end method

.method static synthetic h(Lcom/mopub/mobileads/ap;)Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lcom/mopub/mobileads/ap;->d:Z

    return v0
.end method

.method static synthetic i(Lcom/mopub/mobileads/ap;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/mopub/mobileads/ap;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lcom/mopub/mobileads/ap;)I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/mopub/mobileads/ap;->j:I

    return v0
.end method

.method static synthetic k(Lcom/mopub/mobileads/ap;)Landroid/view/View$OnTouchListener;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/mopub/mobileads/ap;->h:Landroid/view/View$OnTouchListener;

    return-object v0
.end method


# virtual methods
.method final a()Lcom/mopub/mobileads/ap;
    .locals 1

    .prologue
    .line 64
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/ap;->d:Z

    .line 65
    return-object p0
.end method

.method final a(F)Lcom/mopub/mobileads/ap;
    .locals 0

    .prologue
    .line 54
    iput p1, p0, Lcom/mopub/mobileads/ap;->b:F

    .line 55
    return-object p0
.end method

.method final a(I)Lcom/mopub/mobileads/ap;
    .locals 0

    .prologue
    .line 59
    iput p1, p0, Lcom/mopub/mobileads/ap;->c:I

    .line 60
    return-object p0
.end method

.method final a(Landroid/graphics/drawable/Drawable;)Lcom/mopub/mobileads/ap;
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/ap;->f:Z

    .line 81
    iput-object p1, p0, Lcom/mopub/mobileads/ap;->g:Landroid/graphics/drawable/Drawable;

    .line 82
    return-object p0
.end method

.method final a(Ljava/lang/String;)Lcom/mopub/mobileads/ap;
    .locals 1

    .prologue
    .line 69
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/ap;->d:Z

    .line 70
    iput-object p1, p0, Lcom/mopub/mobileads/ap;->e:Ljava/lang/String;

    .line 71
    return-object p0
.end method

.method final b()Lcom/mopub/mobileads/ap;
    .locals 1

    .prologue
    .line 86
    const/16 v0, 0x9

    iput v0, p0, Lcom/mopub/mobileads/ap;->j:I

    .line 87
    return-object p0
.end method

.method final b(I)Lcom/mopub/mobileads/ap;
    .locals 0

    .prologue
    .line 96
    iput p1, p0, Lcom/mopub/mobileads/ap;->i:I

    .line 97
    return-object p0
.end method

.method final c()Lcom/mopub/mobileads/an;
    .locals 2

    .prologue
    .line 106
    new-instance v0, Lcom/mopub/mobileads/an;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mopub/mobileads/an;-><init>(Lcom/mopub/mobileads/ap;B)V

    return-object v0
.end method
