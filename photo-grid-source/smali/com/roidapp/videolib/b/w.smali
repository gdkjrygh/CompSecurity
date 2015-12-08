.class public final Lcom/roidapp/videolib/b/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private A:F

.field private B:F

.field private C:F

.field private D:F

.field private E:F

.field private F:J

.field private G:J

.field private H:J

.field private I:J

.field private J:F

.field private K:F

.field private L:F

.field private M:F

.field private N:F

.field private O:F

.field private P:F

.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:J

.field private h:J

.field private i:Ljp/co/cyberagent/android/a/h;

.field private j:F

.field private k:F

.field private l:F

.field private m:J

.field private n:J

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:F

.field private t:F

.field private u:F

.field private v:J

.field private w:J

.field private x:J

.field private y:J

.field private z:F


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/w;->a:Z

    .line 10
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/w;->b:Z

    .line 11
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/w;->c:Z

    .line 12
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/w;->d:Z

    .line 13
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/w;->e:Z

    .line 14
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/w;->f:Z

    .line 16
    iput-wide v4, p0, Lcom/roidapp/videolib/b/w;->g:J

    .line 17
    iput-wide v4, p0, Lcom/roidapp/videolib/b/w;->h:J

    .line 21
    iput v0, p0, Lcom/roidapp/videolib/b/w;->j:F

    .line 22
    iput v0, p0, Lcom/roidapp/videolib/b/w;->k:F

    .line 34
    iput v0, p0, Lcom/roidapp/videolib/b/w;->o:F

    .line 35
    iput v0, p0, Lcom/roidapp/videolib/b/w;->p:F

    .line 36
    iput v0, p0, Lcom/roidapp/videolib/b/w;->q:F

    .line 53
    iput v1, p0, Lcom/roidapp/videolib/b/w;->r:F

    .line 54
    iput v1, p0, Lcom/roidapp/videolib/b/w;->s:F

    .line 55
    iput v1, p0, Lcom/roidapp/videolib/b/w;->t:F

    .line 56
    iput v1, p0, Lcom/roidapp/videolib/b/w;->u:F

    .line 99
    iput v0, p0, Lcom/roidapp/videolib/b/w;->B:F

    .line 100
    iput v0, p0, Lcom/roidapp/videolib/b/w;->C:F

    .line 101
    iput v0, p0, Lcom/roidapp/videolib/b/w;->D:F

    .line 102
    iput v0, p0, Lcom/roidapp/videolib/b/w;->E:F

    .line 148
    iput v1, p0, Lcom/roidapp/videolib/b/w;->L:F

    .line 149
    iput v1, p0, Lcom/roidapp/videolib/b/w;->M:F

    .line 28
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 270
    iput-boolean v0, p0, Lcom/roidapp/videolib/b/w;->a:Z

    .line 271
    iput-boolean v0, p0, Lcom/roidapp/videolib/b/w;->b:Z

    .line 272
    iput-boolean v0, p0, Lcom/roidapp/videolib/b/w;->c:Z

    .line 273
    iput-boolean v0, p0, Lcom/roidapp/videolib/b/w;->d:Z

    .line 274
    iput-boolean v0, p0, Lcom/roidapp/videolib/b/w;->e:Z

    .line 275
    iput-boolean v0, p0, Lcom/roidapp/videolib/b/w;->f:Z

    .line 276
    iget-object v0, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/h;->e(F)V

    .line 278
    :cond_0
    return-void
.end method

.method public final a(FFJJ)V
    .locals 5

    .prologue
    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/w;->a:Z

    .line 67
    iput p1, p0, Lcom/roidapp/videolib/b/w;->r:F

    .line 68
    iput p2, p0, Lcom/roidapp/videolib/b/w;->s:F

    .line 69
    sub-float v0, p2, p1

    sub-long v2, p5, p3

    long-to-float v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/videolib/b/w;->z:F

    .line 70
    iput-wide p3, p0, Lcom/roidapp/videolib/b/w;->v:J

    .line 71
    iput-wide p5, p0, Lcom/roidapp/videolib/b/w;->w:J

    .line 72
    return-void
.end method

.method public final a(FFJJFFF)V
    .locals 9

    .prologue
    .line 38
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/videolib/b/w;->e:Z

    .line 39
    iput p1, p0, Lcom/roidapp/videolib/b/w;->j:F

    .line 40
    iput p2, p0, Lcom/roidapp/videolib/b/w;->k:F

    .line 41
    iput-wide p3, p0, Lcom/roidapp/videolib/b/w;->m:J

    .line 42
    iput-wide p5, p0, Lcom/roidapp/videolib/b/w;->n:J

    .line 43
    sub-float v2, p2, p1

    iget-wide v4, p0, Lcom/roidapp/videolib/b/w;->n:J

    iget-wide v6, p0, Lcom/roidapp/videolib/b/w;->m:J

    sub-long/2addr v4, v6

    long-to-float v3, v4

    div-float/2addr v2, v3

    iput v2, p0, Lcom/roidapp/videolib/b/w;->l:F

    .line 44
    move/from16 v0, p7

    iput v0, p0, Lcom/roidapp/videolib/b/w;->o:F

    .line 45
    move/from16 v0, p8

    iput v0, p0, Lcom/roidapp/videolib/b/w;->p:F

    .line 46
    move/from16 v0, p9

    iput v0, p0, Lcom/roidapp/videolib/b/w;->q:F

    .line 47
    return-void
.end method

.method public final a(J)V
    .locals 11

    .prologue
    const/16 v2, 0x10

    const v10, 0x3727c5ac    # 1.0E-5f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v1, 0x0

    .line 168
    iget-object v0, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    if-nez v0, :cond_0

    .line 268
    :goto_0
    return-void

    .line 170
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->n()[F

    move-result-object v0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 171
    new-array v7, v2, [F

    .line 172
    new-array v0, v2, [F

    .line 173
    invoke-static {v7, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 174
    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 175
    iget-object v0, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    .line 1357
    iget-object v0, v0, Ljp/co/cyberagent/android/a/h;->n:[F

    .line 175
    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 177
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/w;->f:Z

    if-eqz v0, :cond_2

    .line 179
    long-to-float v0, p1

    iget v2, p0, Lcom/roidapp/videolib/b/w;->O:F

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_5

    .line 180
    iget v0, p0, Lcom/roidapp/videolib/b/w;->L:F

    .line 187
    :goto_1
    cmpg-float v2, v0, v10

    if-gez v2, :cond_1

    move v0, v6

    .line 190
    :cond_1
    iget-object v2, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v2, v0}, Ljp/co/cyberagent/android/a/h;->e(F)V

    .line 193
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/w;->e:Z

    if-eqz v0, :cond_3

    .line 195
    iget-wide v2, p0, Lcom/roidapp/videolib/b/w;->m:J

    cmp-long v0, p1, v2

    if-gtz v0, :cond_7

    .line 196
    iget v2, p0, Lcom/roidapp/videolib/b/w;->B:F

    .line 203
    :goto_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    .line 2357
    iget-object v0, v0, Ljp/co/cyberagent/android/a/h;->n:[F

    .line 203
    iget v3, p0, Lcom/roidapp/videolib/b/w;->o:F

    iget v4, p0, Lcom/roidapp/videolib/b/w;->p:F

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 208
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/w;->a:Z

    if-eqz v0, :cond_15

    .line 210
    iget-wide v2, p0, Lcom/roidapp/videolib/b/w;->v:J

    cmp-long v0, p1, v2

    if-gtz v0, :cond_9

    .line 211
    iget v0, p0, Lcom/roidapp/videolib/b/w;->r:F

    .line 218
    :goto_3
    iget-boolean v2, p0, Lcom/roidapp/videolib/b/w;->c:Z

    if-eqz v2, :cond_14

    .line 219
    iget-wide v2, p0, Lcom/roidapp/videolib/b/w;->x:J

    cmp-long v2, p1, v2

    if-gtz v2, :cond_b

    .line 220
    iget v2, p0, Lcom/roidapp/videolib/b/w;->t:F

    .line 227
    :goto_4
    iget-object v3, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v3}, Ljp/co/cyberagent/android/a/h;->o()F

    move-result v3

    mul-float/2addr v3, v0

    .line 228
    iget-object v0, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->o()F

    move-result v0

    mul-float/2addr v0, v2

    .line 229
    cmpg-float v2, v3, v10

    if-gez v2, :cond_13

    move v2, v6

    .line 231
    :goto_5
    cmpg-float v3, v0, v10

    if-gez v3, :cond_4

    move v0, v6

    .line 233
    :cond_4
    iget-object v3, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    .line 3357
    iget-object v3, v3, Ljp/co/cyberagent/android/a/h;->n:[F

    .line 233
    invoke-static {v3, v1, v2, v0, v5}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 237
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/w;->b:Z

    if-eqz v0, :cond_12

    .line 238
    iget-wide v2, p0, Lcom/roidapp/videolib/b/w;->F:J

    cmp-long v0, p1, v2

    if-gtz v0, :cond_d

    .line 239
    iget v0, p0, Lcom/roidapp/videolib/b/w;->B:F

    .line 248
    :goto_6
    iget-boolean v2, p0, Lcom/roidapp/videolib/b/w;->d:Z

    if-eqz v2, :cond_11

    .line 249
    iget-wide v2, p0, Lcom/roidapp/videolib/b/w;->H:J

    cmp-long v2, p1, v2

    if-gtz v2, :cond_f

    .line 250
    iget v2, p0, Lcom/roidapp/videolib/b/w;->D:F

    .line 259
    :goto_7
    invoke-static {v7, v1, v0, v2, v6}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 260
    iget-object v0, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    .line 4357
    iget-object v0, v0, Ljp/co/cyberagent/android/a/h;->n:[F

    .line 260
    iget-object v2, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    .line 5357
    iget-object v4, v2, Ljp/co/cyberagent/android/a/h;->n:[F

    move-object v2, v7

    move v3, v1

    move v5, v1

    .line 260
    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 264
    iget-object v0, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->n()[F

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    .line 6354
    iget-object v2, v2, Ljp/co/cyberagent/android/a/h;->m:[F

    .line 264
    iget-object v3, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    .line 6357
    iget-object v4, v3, Ljp/co/cyberagent/android/a/h;->n:[F

    move v3, v1

    move v5, v1

    .line 264
    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 266
    iget-object v0, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->n()[F

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    .line 7351
    iget-object v2, v2, Ljp/co/cyberagent/android/a/h;->l:[F

    .line 266
    iget-object v3, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v3}, Ljp/co/cyberagent/android/a/h;->n()[F

    move-result-object v4

    move v3, v1

    move v5, v1

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    goto/16 :goto_0

    .line 181
    :cond_5
    long-to-float v0, p1

    iget v2, p0, Lcom/roidapp/videolib/b/w;->P:F

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_6

    .line 182
    iget v0, p0, Lcom/roidapp/videolib/b/w;->M:F

    goto/16 :goto_1

    .line 184
    :cond_6
    iget v0, p0, Lcom/roidapp/videolib/b/w;->L:F

    iget v2, p0, Lcom/roidapp/videolib/b/w;->N:F

    long-to-float v3, p1

    iget v4, p0, Lcom/roidapp/videolib/b/w;->O:F

    sub-float/2addr v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v0, v2

    goto/16 :goto_1

    .line 197
    :cond_7
    iget-wide v2, p0, Lcom/roidapp/videolib/b/w;->n:J

    cmp-long v0, p1, v2

    if-ltz v0, :cond_8

    .line 198
    iget v2, p0, Lcom/roidapp/videolib/b/w;->C:F

    goto/16 :goto_2

    .line 200
    :cond_8
    iget v0, p0, Lcom/roidapp/videolib/b/w;->j:F

    iget v2, p0, Lcom/roidapp/videolib/b/w;->l:F

    iget-wide v8, p0, Lcom/roidapp/videolib/b/w;->m:J

    sub-long v8, p1, v8

    long-to-float v3, v8

    mul-float/2addr v2, v3

    add-float/2addr v2, v0

    goto/16 :goto_2

    .line 212
    :cond_9
    iget-wide v2, p0, Lcom/roidapp/videolib/b/w;->w:J

    cmp-long v0, p1, v2

    if-ltz v0, :cond_a

    .line 213
    iget v0, p0, Lcom/roidapp/videolib/b/w;->s:F

    goto/16 :goto_3

    .line 215
    :cond_a
    iget v0, p0, Lcom/roidapp/videolib/b/w;->r:F

    iget v2, p0, Lcom/roidapp/videolib/b/w;->z:F

    iget-wide v8, p0, Lcom/roidapp/videolib/b/w;->v:J

    sub-long v8, p1, v8

    long-to-float v3, v8

    mul-float/2addr v2, v3

    add-float/2addr v0, v2

    goto/16 :goto_3

    .line 221
    :cond_b
    iget-wide v2, p0, Lcom/roidapp/videolib/b/w;->y:J

    cmp-long v2, p1, v2

    if-ltz v2, :cond_c

    .line 222
    iget v2, p0, Lcom/roidapp/videolib/b/w;->u:F

    goto/16 :goto_4

    .line 224
    :cond_c
    iget v2, p0, Lcom/roidapp/videolib/b/w;->t:F

    iget v3, p0, Lcom/roidapp/videolib/b/w;->A:F

    iget-wide v8, p0, Lcom/roidapp/videolib/b/w;->x:J

    sub-long v8, p1, v8

    long-to-float v4, v8

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    goto/16 :goto_4

    .line 240
    :cond_d
    iget-wide v2, p0, Lcom/roidapp/videolib/b/w;->G:J

    cmp-long v0, p1, v2

    if-ltz v0, :cond_e

    .line 241
    iget v0, p0, Lcom/roidapp/videolib/b/w;->C:F

    goto/16 :goto_6

    .line 243
    :cond_e
    iget v0, p0, Lcom/roidapp/videolib/b/w;->B:F

    iget v2, p0, Lcom/roidapp/videolib/b/w;->J:F

    iget-wide v4, p0, Lcom/roidapp/videolib/b/w;->F:J

    sub-long v4, p1, v4

    long-to-float v3, v4

    mul-float/2addr v2, v3

    add-float/2addr v0, v2

    goto/16 :goto_6

    .line 251
    :cond_f
    iget-wide v2, p0, Lcom/roidapp/videolib/b/w;->I:J

    cmp-long v2, p1, v2

    if-ltz v2, :cond_10

    .line 252
    iget v2, p0, Lcom/roidapp/videolib/b/w;->E:F

    goto/16 :goto_7

    .line 254
    :cond_10
    iget v2, p0, Lcom/roidapp/videolib/b/w;->D:F

    iget v3, p0, Lcom/roidapp/videolib/b/w;->K:F

    iget-wide v4, p0, Lcom/roidapp/videolib/b/w;->H:J

    sub-long v4, p1, v4

    long-to-float v4, v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    goto/16 :goto_7

    :cond_11
    move v2, v6

    goto/16 :goto_7

    :cond_12
    move v0, v6

    goto/16 :goto_6

    :cond_13
    move v2, v3

    goto/16 :goto_5

    :cond_14
    move v2, v5

    goto/16 :goto_4

    :cond_15
    move v0, v5

    goto/16 :goto_3
.end method

.method public final a(Ljp/co/cyberagent/android/a/h;)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lcom/roidapp/videolib/b/w;->i:Ljp/co/cyberagent/android/a/h;

    .line 165
    return-void
.end method

.method public final b(FFJJ)V
    .locals 5

    .prologue
    .line 75
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/w;->a:Z

    .line 76
    iput p1, p0, Lcom/roidapp/videolib/b/w;->t:F

    .line 77
    iput p2, p0, Lcom/roidapp/videolib/b/w;->u:F

    .line 78
    iput-wide p3, p0, Lcom/roidapp/videolib/b/w;->x:J

    .line 79
    iput-wide p5, p0, Lcom/roidapp/videolib/b/w;->y:J

    .line 80
    sub-float v0, p2, p1

    sub-long v2, p5, p3

    long-to-float v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/videolib/b/w;->A:F

    .line 81
    return-void
.end method

.method public final c(FFJJ)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 84
    iput-boolean v4, p0, Lcom/roidapp/videolib/b/w;->c:Z

    .line 85
    iput p1, p0, Lcom/roidapp/videolib/b/w;->t:F

    .line 86
    iput p2, p0, Lcom/roidapp/videolib/b/w;->u:F

    .line 87
    iput-wide p3, p0, Lcom/roidapp/videolib/b/w;->x:J

    .line 88
    iput-wide p5, p0, Lcom/roidapp/videolib/b/w;->y:J

    .line 89
    sub-float v0, p2, p1

    sub-long v2, p5, p3

    long-to-float v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/videolib/b/w;->A:F

    .line 91
    iput-boolean v4, p0, Lcom/roidapp/videolib/b/w;->a:Z

    .line 92
    iput p1, p0, Lcom/roidapp/videolib/b/w;->r:F

    .line 93
    iput p2, p0, Lcom/roidapp/videolib/b/w;->s:F

    .line 94
    iget v0, p0, Lcom/roidapp/videolib/b/w;->A:F

    iput v0, p0, Lcom/roidapp/videolib/b/w;->z:F

    .line 95
    iput-wide p3, p0, Lcom/roidapp/videolib/b/w;->v:J

    .line 96
    iput-wide p5, p0, Lcom/roidapp/videolib/b/w;->w:J

    .line 97
    return-void
.end method

.method public final d(FFJJ)V
    .locals 5

    .prologue
    .line 112
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/w;->b:Z

    .line 113
    iput p1, p0, Lcom/roidapp/videolib/b/w;->B:F

    .line 114
    iput p2, p0, Lcom/roidapp/videolib/b/w;->C:F

    .line 115
    iput-wide p3, p0, Lcom/roidapp/videolib/b/w;->F:J

    .line 116
    iput-wide p5, p0, Lcom/roidapp/videolib/b/w;->G:J

    .line 117
    sub-float v0, p2, p1

    sub-long v2, p5, p3

    long-to-float v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/videolib/b/w;->J:F

    .line 118
    return-void
.end method

.method public final e(FFJJ)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 121
    iput-boolean v4, p0, Lcom/roidapp/videolib/b/w;->b:Z

    .line 122
    iput p1, p0, Lcom/roidapp/videolib/b/w;->B:F

    .line 123
    iput p2, p0, Lcom/roidapp/videolib/b/w;->C:F

    .line 124
    iput-wide p3, p0, Lcom/roidapp/videolib/b/w;->F:J

    .line 125
    iput-wide p5, p0, Lcom/roidapp/videolib/b/w;->G:J

    .line 126
    sub-float v0, p2, p1

    sub-long v2, p5, p3

    long-to-float v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/videolib/b/w;->J:F

    .line 128
    iput-boolean v4, p0, Lcom/roidapp/videolib/b/w;->d:Z

    .line 129
    iput p1, p0, Lcom/roidapp/videolib/b/w;->D:F

    .line 130
    iput p2, p0, Lcom/roidapp/videolib/b/w;->E:F

    .line 131
    iput-wide p3, p0, Lcom/roidapp/videolib/b/w;->H:J

    .line 132
    iput-wide p5, p0, Lcom/roidapp/videolib/b/w;->I:J

    .line 133
    iget v0, p0, Lcom/roidapp/videolib/b/w;->J:F

    iput v0, p0, Lcom/roidapp/videolib/b/w;->K:F

    .line 135
    return-void
.end method

.method public final f(FFJJ)V
    .locals 5

    .prologue
    .line 138
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/w;->d:Z

    .line 139
    iput p1, p0, Lcom/roidapp/videolib/b/w;->D:F

    .line 140
    iput p2, p0, Lcom/roidapp/videolib/b/w;->E:F

    .line 141
    iput-wide p3, p0, Lcom/roidapp/videolib/b/w;->H:J

    .line 142
    iput-wide p5, p0, Lcom/roidapp/videolib/b/w;->I:J

    .line 143
    sub-float v0, p2, p1

    sub-long v2, p5, p3

    long-to-float v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/videolib/b/w;->K:F

    .line 144
    return-void
.end method

.method public final g(FFJJ)V
    .locals 3

    .prologue
    .line 155
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/w;->f:Z

    .line 156
    iput p1, p0, Lcom/roidapp/videolib/b/w;->L:F

    .line 157
    iput p2, p0, Lcom/roidapp/videolib/b/w;->M:F

    .line 158
    long-to-float v0, p3

    iput v0, p0, Lcom/roidapp/videolib/b/w;->O:F

    .line 159
    long-to-float v0, p5

    iput v0, p0, Lcom/roidapp/videolib/b/w;->P:F

    .line 160
    sub-float v0, p2, p1

    iget v1, p0, Lcom/roidapp/videolib/b/w;->P:F

    iget v2, p0, Lcom/roidapp/videolib/b/w;->O:F

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/videolib/b/w;->N:F

    .line 161
    return-void
.end method
