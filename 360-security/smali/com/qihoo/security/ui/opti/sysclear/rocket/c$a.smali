.class Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/rocket/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

.field private b:F

.field private c:I

.field private d:I

.field private e:J


# direct methods
.method private constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)V
    .locals 2

    .prologue
    .line 74
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->b:F

    .line 80
    const/16 v0, 0xff

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->c:I

    .line 83
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->d:I

    .line 86
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->e:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;-><init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->b:F

    return v0
.end method

.method public a(F)V
    .locals 0

    .prologue
    .line 89
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->b:F

    .line 90
    return-void
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 97
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->c:I

    .line 98
    return-void
.end method

.method public a(J)V
    .locals 2

    .prologue
    .line 113
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->e:J

    .line 114
    return-void
.end method

.method public b()I
    .locals 1

    .prologue
    .line 101
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->c:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 109
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->d:I

    .line 110
    return-void
.end method

.method public b(J)Z
    .locals 9

    .prologue
    const/4 v2, 0x0

    const v8, 0x461c4000    # 10000.0f

    .line 124
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->d:I

    const/16 v1, 0x2710

    if-lt v0, v1, :cond_0

    .line 146
    :goto_0
    return v2

    .line 128
    :cond_0
    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->b:F

    .line 129
    iget v4, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->c:I

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->b()Landroid/view/animation/Interpolator;

    move-result-object v5

    .line 131
    if-eqz v5, :cond_3

    .line 133
    iget-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->e:J

    const-wide/16 v6, 0x0

    cmp-long v0, v0, v6

    if-nez v0, :cond_1

    .line 134
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->e:J

    .line 137
    :cond_1
    iget-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->e:J

    sub-long v0, p1, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    .line 138
    iget-object v6, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v6}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)I

    move-result v6

    int-to-long v6, v6

    cmp-long v6, v0, v6

    if-lez v6, :cond_2

    .line 139
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)I

    move-result v0

    int-to-long v0, v0

    .line 141
    :cond_2
    long-to-float v0, v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 142
    invoke-interface {v5, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    mul-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->d:I

    .line 143
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->b(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)F

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->c(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)F

    move-result v1

    iget-object v5, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v5}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->b(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)F

    move-result v5

    sub-float/2addr v1, v5

    iget v5, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->d:I

    int-to-float v5, v5

    mul-float/2addr v1, v5

    div-float/2addr v1, v8

    add-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->b:F

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->d(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    iget v5, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->d:I

    int-to-float v5, v5

    div-float/2addr v5, v8

    sub-float/2addr v1, v5

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->c:I

    .line 146
    :cond_3
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->b:F

    cmpl-float v0, v3, v0

    if-nez v0, :cond_4

    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->c:I

    if-eq v4, v0, :cond_5

    :cond_4
    const/4 v0, 0x1

    :goto_1
    move v2, v0

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_1
.end method

.method public c()F
    .locals 1

    .prologue
    .line 105
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->d:I

    int-to-float v0, v0

    return v0
.end method
