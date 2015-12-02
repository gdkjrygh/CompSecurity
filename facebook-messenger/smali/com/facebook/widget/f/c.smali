.class public Lcom/facebook/widget/f/c;
.super Ljava/lang/Object;
.source "Resampler.java"


# instance fields
.field a:F

.field b:F

.field c:J


# direct methods
.method constructor <init>(FFJ)V
    .locals 0

    .prologue
    .line 232
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 233
    iput p1, p0, Lcom/facebook/widget/f/c;->a:F

    .line 234
    iput p2, p0, Lcom/facebook/widget/f/c;->b:F

    .line 235
    iput-wide p3, p0, Lcom/facebook/widget/f/c;->c:J

    .line 236
    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    .line 251
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/widget/f/c;->c:J

    .line 252
    return-void
.end method

.method a(FFJ)V
    .locals 0

    .prologue
    .line 239
    iput p1, p0, Lcom/facebook/widget/f/c;->a:F

    .line 240
    iput p2, p0, Lcom/facebook/widget/f/c;->b:F

    .line 241
    iput-wide p3, p0, Lcom/facebook/widget/f/c;->c:J

    .line 242
    return-void
.end method

.method public b()F
    .locals 1

    .prologue
    .line 255
    iget v0, p0, Lcom/facebook/widget/f/c;->a:F

    return v0
.end method

.method public c()F
    .locals 1

    .prologue
    .line 259
    iget v0, p0, Lcom/facebook/widget/f/c;->b:F

    return v0
.end method
