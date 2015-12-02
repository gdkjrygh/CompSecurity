.class public Lcom/facebook/ads/internal/f/g;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/ads/internal/f/g$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private final d:Lcom/facebook/ads/internal/f/g$a;

.field private final e:Lcom/facebook/ads/internal/f/g$a;

.field private f:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xc8

    iput v0, p0, Lcom/facebook/ads/internal/f/g;->a:I

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/facebook/ads/internal/f/g;->b:I

    const/16 v0, 0xfa0

    iput v0, p0, Lcom/facebook/ads/internal/f/g;->c:I

    new-instance v0, Lcom/facebook/ads/internal/f/g$a;

    invoke-direct {v0, p0, p1}, Lcom/facebook/ads/internal/f/g$a;-><init>(Lcom/facebook/ads/internal/f/g;Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/ads/internal/f/g;->d:Lcom/facebook/ads/internal/f/g$a;

    new-instance v0, Lcom/facebook/ads/internal/f/g$a;

    invoke-direct {v0, p0, p2}, Lcom/facebook/ads/internal/f/g$a;-><init>(Lcom/facebook/ads/internal/f/g;Landroid/view/View;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/f/g$a;->a(Z)Lcom/facebook/ads/internal/f/g$a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ads/internal/f/g;->e:Lcom/facebook/ads/internal/f/g$a;

    const-string/jumbo v0, "4.1.2"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ads/internal/f/g;->f:Z

    return-void
.end method

.method static synthetic a(Lcom/facebook/ads/internal/f/g;)I
    .locals 1

    iget v0, p0, Lcom/facebook/ads/internal/f/g;->a:I

    return v0
.end method

.method static synthetic b(Lcom/facebook/ads/internal/f/g;)I
    .locals 1

    iget v0, p0, Lcom/facebook/ads/internal/f/g;->b:I

    return v0
.end method

.method static synthetic c(Lcom/facebook/ads/internal/f/g;)I
    .locals 1

    iget v0, p0, Lcom/facebook/ads/internal/f/g;->c:I

    return v0
.end method

.method static synthetic d(Lcom/facebook/ads/internal/f/g;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/ads/internal/f/g;->f:Z

    return v0
.end method


# virtual methods
.method public a()Lcom/facebook/ads/internal/f/g;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/f/g;->d:Lcom/facebook/ads/internal/f/g$a;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/f/g$a;->a()V

    iget-object v0, p0, Lcom/facebook/ads/internal/f/g;->e:Lcom/facebook/ads/internal/f/g$a;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/f/g$a;->a()V

    return-object p0
.end method

.method public a(I)Lcom/facebook/ads/internal/f/g;
    .locals 1

    mul-int/lit8 v0, p1, 0x2

    iput v0, p0, Lcom/facebook/ads/internal/f/g;->a:I

    return-object p0
.end method
