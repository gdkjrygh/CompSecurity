.class public Lcom/facebook/reflex/r;
.super Ljava/lang/Object;
.source "GestureEvent.java"


# instance fields
.field private a:Lcom/facebook/reflex/s;

.field private b:Lcom/facebook/reflex/t;

.field private c:J

.field private d:J

.field private e:F

.field private f:F

.field private g:F

.field private h:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/reflex/t;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/reflex/r;->b:Lcom/facebook/reflex/t;

    return-object v0
.end method

.method a(Lcom/facebook/reflex/s;Lcom/facebook/reflex/t;JJFFFF)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/facebook/reflex/r;->a:Lcom/facebook/reflex/s;

    .line 98
    iput-object p2, p0, Lcom/facebook/reflex/r;->b:Lcom/facebook/reflex/t;

    .line 99
    iput-wide p3, p0, Lcom/facebook/reflex/r;->c:J

    .line 100
    iput-wide p5, p0, Lcom/facebook/reflex/r;->d:J

    .line 101
    iput p7, p0, Lcom/facebook/reflex/r;->e:F

    .line 102
    iput p8, p0, Lcom/facebook/reflex/r;->f:F

    .line 103
    iput p9, p0, Lcom/facebook/reflex/r;->g:F

    .line 104
    iput p10, p0, Lcom/facebook/reflex/r;->h:F

    .line 105
    return-void
.end method

.method public b()J
    .locals 2

    .prologue
    .line 59
    iget-wide v0, p0, Lcom/facebook/reflex/r;->c:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 67
    iget-wide v0, p0, Lcom/facebook/reflex/r;->d:J

    return-wide v0
.end method

.method public d()F
    .locals 1

    .prologue
    .line 71
    iget v0, p0, Lcom/facebook/reflex/r;->e:F

    return v0
.end method

.method public e()F
    .locals 1

    .prologue
    .line 75
    iget v0, p0, Lcom/facebook/reflex/r;->f:F

    return v0
.end method

.method public f()F
    .locals 1

    .prologue
    .line 79
    iget v0, p0, Lcom/facebook/reflex/r;->g:F

    return v0
.end method

.method public g()F
    .locals 1

    .prologue
    .line 83
    iget v0, p0, Lcom/facebook/reflex/r;->h:F

    return v0
.end method
