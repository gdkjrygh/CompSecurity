.class public final Lcom/roidapp/videolib/b/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:J

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method public constructor <init>(IJJFF)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput p1, p0, Lcom/roidapp/videolib/b/x;->a:I

    .line 30
    iput-wide p2, p0, Lcom/roidapp/videolib/b/x;->b:J

    .line 31
    iput-wide p4, p0, Lcom/roidapp/videolib/b/x;->c:J

    .line 32
    iput p6, p0, Lcom/roidapp/videolib/b/x;->d:F

    .line 33
    iput p7, p0, Lcom/roidapp/videolib/b/x;->e:F

    .line 34
    return-void
.end method

.method public constructor <init>(JJFFFF)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, 0x7

    iput v0, p0, Lcom/roidapp/videolib/b/x;->a:I

    .line 38
    iput-wide p1, p0, Lcom/roidapp/videolib/b/x;->b:J

    .line 39
    iput-wide p3, p0, Lcom/roidapp/videolib/b/x;->c:J

    .line 40
    iput p5, p0, Lcom/roidapp/videolib/b/x;->d:F

    .line 41
    iput p6, p0, Lcom/roidapp/videolib/b/x;->e:F

    .line 42
    iput p7, p0, Lcom/roidapp/videolib/b/x;->f:F

    .line 43
    iput p8, p0, Lcom/roidapp/videolib/b/x;->g:F

    .line 44
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/videolib/b/x;->h:F

    .line 45
    return-void
.end method
