.class public Lcom/qihoo/security/v7/ColorChangeBackgroundView;
.super Landroid/view/View;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/a$a;
.implements Lcom/nineoldandroids/a/o$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/v7/ColorChangeBackgroundView$1;,
        Lcom/qihoo/security/v7/ColorChangeBackgroundView$a;
    }
.end annotation


# instance fields
.field private a:Lcom/nineoldandroids/a/o;

.field private b:[I

.field private c:Lcom/qihoo/security/v7/ColorChangeBackgroundView$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 28
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 37
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    iput-object v1, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a:Lcom/nineoldandroids/a/o;

    .line 38
    new-instance v0, Lcom/qihoo/security/v7/ColorChangeBackgroundView$a;

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/v7/ColorChangeBackgroundView$a;-><init>(Lcom/qihoo/security/v7/ColorChangeBackgroundView;Lcom/qihoo/security/v7/ColorChangeBackgroundView$1;)V

    iput-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->c:Lcom/qihoo/security/v7/ColorChangeBackgroundView$a;

    .line 39
    return-void
.end method

.method private a(IF)V
    .locals 2

    .prologue
    .line 107
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->b:[I

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->b:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    .line 109
    if-eqz v0, :cond_0

    .line 110
    int-to-float v1, p1

    add-float/2addr v1, p2

    int-to-float v0, v0

    div-float v0, v1, v0

    .line 111
    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 112
    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a(J)V

    .line 115
    :cond_0
    return-void
.end method

.method private a(J)V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a:Lcom/nineoldandroids/a/o;

    if-nez v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->b:[I

    invoke-direct {p0, v0}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->b([I)V

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a:Lcom/nineoldandroids/a/o;

    invoke-virtual {v0, p1, p2}, Lcom/nineoldandroids/a/o;->e(J)V

    .line 46
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/v7/ColorChangeBackgroundView;IF)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a(IF)V

    return-void
.end method

.method private varargs b([I)V
    .locals 4

    .prologue
    .line 58
    if-nez p1, :cond_0

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "ColorChangeBackgroundView colors can not null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->b:[I

    .line 62
    const-string/jumbo v0, "backgroundColor"

    iget-object v1, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->b:[I

    invoke-static {p0, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[I)Lcom/nineoldandroids/a/k;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a:Lcom/nineoldandroids/a/o;

    .line 63
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a:Lcom/nineoldandroids/a/o;

    new-instance v1, Lcom/nineoldandroids/a/d;

    invoke-direct {v1}, Lcom/nineoldandroids/a/d;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/n;)V

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a:Lcom/nineoldandroids/a/o;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 65
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a:Lcom/nineoldandroids/a/o;

    invoke-virtual {v0, p0}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 66
    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 71
    return-void
.end method

.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 0

    .prologue
    .line 89
    invoke-virtual {p0}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->invalidate()V

    .line 90
    return-void
.end method

.method public varargs a(Lcom/qihoo/security/widget/c;[I)V
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->c:Lcom/qihoo/security/v7/ColorChangeBackgroundView$a;

    invoke-virtual {p1, v0}, Lcom/qihoo/security/widget/c;->a(Landroid/support/v4/view/ViewPager$e;)V

    .line 24
    invoke-direct {p0, p2}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->b([I)V

    .line 25
    return-void
.end method

.method public varargs a([I)V
    .locals 2

    .prologue
    .line 49
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a:Lcom/nineoldandroids/a/o;

    if-nez v0, :cond_0

    .line 50
    invoke-direct {p0, p1}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->b([I)V

    .line 52
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->b:[I

    .line 53
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a:Lcom/nineoldandroids/a/o;

    iget-object v1, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->b:[I

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a([I)V

    .line 54
    invoke-virtual {p0}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->invalidate()V

    .line 55
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 75
    return-void
.end method

.method public c(Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 80
    return-void
.end method

.method public d(Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 85
    return-void
.end method

.method public getCurrentColor()I
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a:Lcom/nineoldandroids/a/o;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 103
    return v0
.end method

.method public setCurrentItem(I)V
    .locals 1

    .prologue
    .line 98
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a(IF)V

    .line 99
    return-void
.end method
