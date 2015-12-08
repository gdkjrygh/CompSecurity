.class public Lcom/kik/cache/SmileyImageView;
.super Lkik/android/widget/KikNetworkedImageView;
.source "SourceFile"


# static fields
.field private static final a:Lcom/android/volley/r$a;

.field private static final b:Lcom/android/volley/r$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    new-instance v0, Lcom/kik/cache/ax;

    invoke-direct {v0}, Lcom/kik/cache/ax;-><init>()V

    sput-object v0, Lcom/kik/cache/SmileyImageView;->a:Lcom/android/volley/r$a;

    .line 31
    new-instance v0, Lcom/kik/cache/ay;

    invoke-direct {v0}, Lcom/kik/cache/ay;-><init>()V

    sput-object v0, Lcom/kik/cache/SmileyImageView;->b:Lcom/android/volley/r$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1, p2, p3}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    return-void
.end method


# virtual methods
.method protected final a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;
    .locals 1

    .prologue
    .line 131
    new-instance v0, Lkik/android/widget/cs;

    invoke-direct {v0, p1, p2}, Lkik/android/widget/cs;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Lcom/kik/android/c/e;Lcom/kik/cache/ad;)V
    .locals 7

    .prologue
    const/4 v5, 0x1

    const/4 v3, 0x0

    .line 85
    if-nez p1, :cond_1

    .line 103
    :cond_0
    :goto_0
    return-void

    .line 88
    :cond_1
    instance-of v0, p1, Lcom/kik/android/c/c;

    if-eqz v0, :cond_2

    .line 89
    check-cast p1, Lcom/kik/android/c/c;

    invoke-virtual {p1}, Lcom/kik/android/c/c;->a()I

    move-result v0

    .line 90
    if-eqz v0, :cond_0

    .line 92
    :try_start_0
    invoke-virtual {p0}, Lcom/kik/cache/SmileyImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 93
    invoke-virtual {p0, v0}, Lcom/kik/cache/SmileyImageView;->b(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 95
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 101
    :cond_2
    invoke-virtual {p1}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    sget-object v1, Lcom/kik/cache/SmileyImageView;->b:Lcom/android/volley/r$b;

    sget-object v2, Lcom/kik/cache/SmileyImageView;->a:Lcom/android/volley/r$a;

    invoke-static {v0, v1, v2}, Lcom/kik/cache/aj;->a(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)Lcom/kik/cache/aj;

    move-result-object v1

    :cond_3
    move-object v0, p0

    move-object v2, p2

    move v4, v3

    move v6, v5

    invoke-virtual/range {v0 .. v6}, Lcom/kik/cache/SmileyImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;IIZZ)V

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 80
    invoke-virtual {p0}, Lcom/kik/cache/SmileyImageView;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
