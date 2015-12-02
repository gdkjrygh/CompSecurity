.class public Lcom/facebook/ui/touch/a;
.super Ljava/lang/Object;
.source "DragMotionDetector.java"


# static fields
.field private static final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field a:Z

.field b:Z

.field private d:F

.field private e:F

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:F

.field private k:[F

.field private l:[F

.field private m:I

.field private n:F

.field private o:F

.field private p:Lcom/facebook/ui/touch/d;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private r:F

.field private s:F

.field private t:F

.field private u:F

.field private v:Lcom/facebook/ui/touch/c;

.field private w:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/ui/touch/a;

    sput-object v0, Lcom/facebook/ui/touch/a;->c:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/ui/touch/d;Ljava/util/List;FF)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/ui/touch/d;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;FF)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x6

    const/4 v1, 0x0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/facebook/ui/touch/a;->f:F

    .line 64
    iput-boolean v1, p0, Lcom/facebook/ui/touch/a;->a:Z

    .line 65
    iput-boolean v1, p0, Lcom/facebook/ui/touch/a;->b:Z

    .line 80
    sget-object v0, Lcom/facebook/ui/touch/c;->MONITORING:Lcom/facebook/ui/touch/c;

    iput-object v0, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    .line 81
    iput v1, p0, Lcom/facebook/ui/touch/a;->w:I

    .line 131
    iput-object p1, p0, Lcom/facebook/ui/touch/a;->p:Lcom/facebook/ui/touch/d;

    .line 133
    iget-object v0, p0, Lcom/facebook/ui/touch/a;->p:Lcom/facebook/ui/touch/d;

    invoke-static {v0}, Lcom/facebook/debug/b/a;->a(Ljava/lang/Object;)V

    .line 135
    new-array v0, v2, [F

    iput-object v0, p0, Lcom/facebook/ui/touch/a;->k:[F

    .line 136
    new-array v0, v2, [F

    iput-object v0, p0, Lcom/facebook/ui/touch/a;->l:[F

    .line 138
    iput-object p2, p0, Lcom/facebook/ui/touch/a;->q:Ljava/util/List;

    .line 142
    iput p3, p0, Lcom/facebook/ui/touch/a;->d:F

    .line 143
    iput p4, p0, Lcom/facebook/ui/touch/a;->e:F

    .line 144
    return-void
.end method

.method private a(FF)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 316
    iget v1, p0, Lcom/facebook/ui/touch/a;->r:F

    iget v2, p0, Lcom/facebook/ui/touch/a;->s:F

    cmpg-float v1, v1, v2

    if-gez v1, :cond_3

    .line 317
    iget v1, p0, Lcom/facebook/ui/touch/a;->t:F

    iget v2, p0, Lcom/facebook/ui/touch/a;->u:F

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    .line 318
    iget v1, p0, Lcom/facebook/ui/touch/a;->r:F

    cmpl-float v1, p1, v1

    if-lez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->s:F

    cmpg-float v1, p1, v1

    if-gez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->t:F

    cmpl-float v1, p2, v1

    if-lez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->u:F

    cmpg-float v1, p2, v1

    if-gez v1, :cond_2

    .line 341
    :cond_0
    :goto_0
    return v0

    .line 323
    :cond_1
    iget v1, p0, Lcom/facebook/ui/touch/a;->r:F

    cmpl-float v1, p1, v1

    if-lez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->s:F

    cmpg-float v1, p1, v1

    if-gez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->t:F

    cmpg-float v1, p2, v1

    if-gez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->u:F

    cmpl-float v1, p2, v1

    if-gtz v1, :cond_0

    .line 341
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 329
    :cond_3
    iget v1, p0, Lcom/facebook/ui/touch/a;->t:F

    iget v2, p0, Lcom/facebook/ui/touch/a;->u:F

    cmpg-float v1, v1, v2

    if-gez v1, :cond_4

    .line 330
    iget v1, p0, Lcom/facebook/ui/touch/a;->r:F

    cmpg-float v1, p1, v1

    if-gez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->s:F

    cmpl-float v1, p1, v1

    if-lez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->t:F

    cmpl-float v1, p2, v1

    if-lez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->u:F

    cmpg-float v1, p2, v1

    if-gez v1, :cond_2

    goto :goto_0

    .line 335
    :cond_4
    iget v1, p0, Lcom/facebook/ui/touch/a;->r:F

    cmpg-float v1, p1, v1

    if-gez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->s:F

    cmpl-float v1, p1, v1

    if-lez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->t:F

    cmpg-float v1, p2, v1

    if-gez v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/touch/a;->u:F

    cmpl-float v1, p2, v1

    if-lez v1, :cond_2

    goto :goto_0
.end method

.method private b(F)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 306
    iget v1, p0, Lcom/facebook/ui/touch/a;->f:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    .line 307
    iget v1, p0, Lcom/facebook/ui/touch/a;->f:F

    cmpg-float v1, p1, v1

    if-gtz v1, :cond_1

    .line 310
    :cond_0
    :goto_0
    return v0

    .line 307
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 151
    iget-object v1, p0, Lcom/facebook/ui/touch/a;->q:Ljava/util/List;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/ui/touch/a;->q:Ljava/util/List;

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d()Z
    .locals 2

    .prologue
    .line 155
    iget-object v0, p0, Lcom/facebook/ui/touch/a;->q:Ljava/util/List;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ui/touch/a;->q:Ljava/util/List;

    const/16 v1, -0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e()I
    .locals 6

    .prologue
    const/4 v0, -0x1

    const/16 v3, -0xa

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 482
    iget v4, p0, Lcom/facebook/ui/touch/a;->w:I

    if-ne v4, v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/ui/touch/a;->a()F

    move-result v4

    cmpl-float v4, v4, v5

    if-lez v4, :cond_1

    move v1, v0

    .line 492
    :cond_0
    :goto_0
    return v1

    .line 484
    :cond_1
    iget v0, p0, Lcom/facebook/ui/touch/a;->w:I

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/facebook/ui/touch/a;->a()F

    move-result v0

    cmpg-float v0, v0, v5

    if-ltz v0, :cond_0

    .line 486
    :cond_2
    iget v0, p0, Lcom/facebook/ui/touch/a;->w:I

    const/16 v4, 0xa

    if-ne v0, v4, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {p0}, Lcom/facebook/ui/touch/a;->b()F

    move-result v4

    cmpg-float v4, v4, v5

    if-gez v4, :cond_4

    move v4, v1

    :goto_2
    and-int/2addr v0, v4

    if-eqz v0, :cond_5

    .line 487
    const/16 v1, 0xa

    goto :goto_0

    :cond_3
    move v0, v2

    .line 486
    goto :goto_1

    :cond_4
    move v4, v2

    goto :goto_2

    .line 488
    :cond_5
    iget v0, p0, Lcom/facebook/ui/touch/a;->w:I

    if-ne v0, v3, :cond_6

    move v0, v1

    :goto_3
    invoke-virtual {p0}, Lcom/facebook/ui/touch/a;->b()F

    move-result v4

    cmpl-float v4, v4, v5

    if-lez v4, :cond_7

    :goto_4
    and-int/2addr v0, v1

    if-eqz v0, :cond_8

    move v1, v3

    .line 489
    goto :goto_0

    :cond_6
    move v0, v2

    .line 488
    goto :goto_3

    :cond_7
    move v1, v2

    goto :goto_4

    :cond_8
    move v1, v2

    .line 492
    goto :goto_0
.end method


# virtual methods
.method public a()F
    .locals 1

    .prologue
    .line 463
    iget v0, p0, Lcom/facebook/ui/touch/a;->n:F

    return v0
.end method

.method public a(F)V
    .locals 0

    .prologue
    .line 395
    iput p1, p0, Lcom/facebook/ui/touch/a;->f:F

    .line 396
    return-void
.end method

.method public a(FFFF)V
    .locals 1

    .prologue
    .line 407
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/ui/touch/a;->a:Z

    .line 408
    iput p1, p0, Lcom/facebook/ui/touch/a;->r:F

    .line 409
    iput p3, p0, Lcom/facebook/ui/touch/a;->s:F

    .line 410
    iput p2, p0, Lcom/facebook/ui/touch/a;->t:F

    .line 411
    iput p4, p0, Lcom/facebook/ui/touch/a;->u:F

    .line 412
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 147
    iput-boolean p1, p0, Lcom/facebook/ui/touch/a;->b:Z

    .line 148
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 13

    .prologue
    const/4 v12, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v11, 0x0

    .line 168
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 169
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    .line 171
    iget-boolean v4, p0, Lcom/facebook/ui/touch/a;->b:Z

    if-eqz v4, :cond_0

    .line 172
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    .line 173
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    .line 176
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 302
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    sget-object v1, Lcom/facebook/ui/touch/c;->INTERCEPTING:Lcom/facebook/ui/touch/c;

    if-ne v0, v1, :cond_c

    move v0, v2

    :goto_1
    return v0

    .line 178
    :pswitch_0
    iput v1, p0, Lcom/facebook/ui/touch/a;->g:F

    .line 179
    iput v0, p0, Lcom/facebook/ui/touch/a;->h:F

    .line 180
    iget v0, p0, Lcom/facebook/ui/touch/a;->g:F

    iput v0, p0, Lcom/facebook/ui/touch/a;->i:F

    .line 181
    iget v0, p0, Lcom/facebook/ui/touch/a;->h:F

    iput v0, p0, Lcom/facebook/ui/touch/a;->j:F

    .line 182
    sget-object v0, Lcom/facebook/ui/touch/c;->MONITORING:Lcom/facebook/ui/touch/c;

    iput-object v0, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    .line 185
    iput v11, p0, Lcom/facebook/ui/touch/a;->n:F

    .line 186
    iput v11, p0, Lcom/facebook/ui/touch/a;->o:F

    .line 187
    iget-object v0, p0, Lcom/facebook/ui/touch/a;->k:[F

    invoke-static {v0, v11}, Ljava/util/Arrays;->fill([FF)V

    .line 188
    iget-object v0, p0, Lcom/facebook/ui/touch/a;->l:[F

    invoke-static {v0, v11}, Ljava/util/Arrays;->fill([FF)V

    .line 191
    iget-boolean v0, p0, Lcom/facebook/ui/touch/a;->a:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/facebook/ui/touch/a;->g:F

    iget v1, p0, Lcom/facebook/ui/touch/a;->h:F

    invoke-direct {p0, v0, v1}, Lcom/facebook/ui/touch/a;->a(FF)Z

    move-result v0

    if-nez v0, :cond_1

    .line 192
    sget-object v0, Lcom/facebook/ui/touch/c;->DEFERRING:Lcom/facebook/ui/touch/c;

    iput-object v0, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    goto :goto_0

    .line 198
    :pswitch_1
    sget-object v4, Lcom/facebook/ui/touch/b;->a:[I

    iget-object v5, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    invoke-virtual {v5}, Lcom/facebook/ui/touch/c;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_1

    .line 283
    :cond_2
    :goto_2
    :pswitch_2
    iput v1, p0, Lcom/facebook/ui/touch/a;->i:F

    .line 284
    iput v0, p0, Lcom/facebook/ui/touch/a;->j:F

    goto :goto_0

    .line 207
    :pswitch_3
    iget v4, p0, Lcom/facebook/ui/touch/a;->g:F

    sub-float v4, v1, v4

    .line 208
    iget v5, p0, Lcom/facebook/ui/touch/a;->h:F

    sub-float v5, v0, v5

    .line 209
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v6

    .line 210
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v7

    .line 212
    invoke-static {v12}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 213
    sget-object v8, Lcom/facebook/ui/touch/a;->c:Ljava/lang/Class;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "abs_dx="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " dx="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 214
    sget-object v8, Lcom/facebook/ui/touch/a;->c:Ljava/lang/Class;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "abs_dy="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 218
    :cond_3
    sget-object v8, Lcom/facebook/ui/touch/c;->INTERCEPTING:Lcom/facebook/ui/touch/c;

    iput-object v8, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    .line 219
    invoke-direct {p0}, Lcom/facebook/ui/touch/a;->d()Z

    move-result v8

    if-eqz v8, :cond_6

    iget v8, p0, Lcom/facebook/ui/touch/a;->d:F

    cmpl-float v8, v7, v8

    if-lez v8, :cond_6

    invoke-direct {p0, v6}, Lcom/facebook/ui/touch/a;->b(F)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 221
    cmpl-float v4, v5, v11

    if-lez v4, :cond_5

    .line 222
    const/16 v4, 0xa

    iput v4, p0, Lcom/facebook/ui/touch/a;->w:I

    .line 251
    :cond_4
    :goto_3
    iget-object v4, p0, Lcom/facebook/ui/touch/a;->q:Ljava/util/List;

    iget v5, p0, Lcom/facebook/ui/touch/a;->w:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 254
    sget-object v4, Lcom/facebook/ui/touch/c;->INTERCEPTING:Lcom/facebook/ui/touch/c;

    iput-object v4, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    .line 255
    iget-object v4, p0, Lcom/facebook/ui/touch/a;->p:Lcom/facebook/ui/touch/d;

    iget v5, p0, Lcom/facebook/ui/touch/a;->g:F

    iget v6, p0, Lcom/facebook/ui/touch/a;->h:F

    invoke-interface {v4, v5, v6}, Lcom/facebook/ui/touch/d;->a(FF)V

    goto/16 :goto_2

    .line 225
    :cond_5
    const/16 v4, -0xa

    iput v4, p0, Lcom/facebook/ui/touch/a;->w:I

    goto :goto_3

    .line 229
    :cond_6
    invoke-direct {p0}, Lcom/facebook/ui/touch/a;->c()Z

    move-result v5

    if-eqz v5, :cond_8

    iget v5, p0, Lcom/facebook/ui/touch/a;->e:F

    cmpl-float v5, v6, v5

    if-lez v5, :cond_8

    invoke-direct {p0, v7}, Lcom/facebook/ui/touch/a;->b(F)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 232
    cmpl-float v4, v4, v11

    if-lez v4, :cond_7

    .line 233
    const/4 v4, -0x1

    iput v4, p0, Lcom/facebook/ui/touch/a;->w:I

    .line 239
    :goto_4
    invoke-static {v12}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 240
    sget-object v4, Lcom/facebook/ui/touch/a;->c:Ljava/lang/Class;

    const-string v5, "setting drag type to: %s abs_dx=%f"

    new-array v7, v12, [Ljava/lang/Object;

    iget v8, p0, Lcom/facebook/ui/touch/a;->w:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    aput-object v6, v7, v2

    invoke-static {v4, v5, v7}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 236
    :cond_7
    iput v2, p0, Lcom/facebook/ui/touch/a;->w:I

    goto :goto_4

    .line 246
    :cond_8
    sget-object v4, Lcom/facebook/ui/touch/c;->MONITORING:Lcom/facebook/ui/touch/c;

    iput-object v4, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    .line 247
    iput v3, p0, Lcom/facebook/ui/touch/a;->w:I

    goto :goto_3

    .line 257
    :cond_9
    iget-object v4, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    sget-object v5, Lcom/facebook/ui/touch/c;->INTERCEPTING:Lcom/facebook/ui/touch/c;

    if-ne v4, v5, :cond_2

    .line 260
    sget-object v4, Lcom/facebook/ui/touch/c;->DEFERRING:Lcom/facebook/ui/touch/c;

    iput-object v4, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    goto/16 :goto_2

    .line 266
    :pswitch_4
    iget-object v4, p0, Lcom/facebook/ui/touch/a;->p:Lcom/facebook/ui/touch/d;

    invoke-interface {v4, v1, v0}, Lcom/facebook/ui/touch/d;->b(FF)V

    .line 268
    iget v4, p0, Lcom/facebook/ui/touch/a;->i:F

    sub-float v4, v1, v4

    .line 269
    iget v5, p0, Lcom/facebook/ui/touch/a;->j:F

    sub-float v5, v0, v5

    .line 271
    iget v6, p0, Lcom/facebook/ui/touch/a;->n:F

    iget-object v7, p0, Lcom/facebook/ui/touch/a;->k:[F

    iget v8, p0, Lcom/facebook/ui/touch/a;->m:I

    aget v7, v7, v8

    sub-float v7, v4, v7

    add-float/2addr v6, v7

    iput v6, p0, Lcom/facebook/ui/touch/a;->n:F

    .line 272
    iget-object v6, p0, Lcom/facebook/ui/touch/a;->k:[F

    iget v7, p0, Lcom/facebook/ui/touch/a;->m:I

    aput v4, v6, v7

    .line 273
    iget v4, p0, Lcom/facebook/ui/touch/a;->m:I

    add-int/lit8 v4, v4, 0x1

    iget-object v6, p0, Lcom/facebook/ui/touch/a;->k:[F

    array-length v6, v6

    rem-int/2addr v4, v6

    iput v4, p0, Lcom/facebook/ui/touch/a;->m:I

    .line 275
    iget v4, p0, Lcom/facebook/ui/touch/a;->o:F

    iget-object v6, p0, Lcom/facebook/ui/touch/a;->l:[F

    iget v7, p0, Lcom/facebook/ui/touch/a;->m:I

    aget v6, v6, v7

    sub-float v6, v5, v6

    add-float/2addr v4, v6

    iput v4, p0, Lcom/facebook/ui/touch/a;->o:F

    .line 276
    iget-object v4, p0, Lcom/facebook/ui/touch/a;->l:[F

    iget v6, p0, Lcom/facebook/ui/touch/a;->m:I

    aput v5, v4, v6

    .line 277
    iget v4, p0, Lcom/facebook/ui/touch/a;->m:I

    add-int/lit8 v4, v4, 0x1

    iget-object v5, p0, Lcom/facebook/ui/touch/a;->l:[F

    array-length v5, v5

    rem-int/2addr v4, v5

    iput v4, p0, Lcom/facebook/ui/touch/a;->m:I

    goto/16 :goto_2

    .line 289
    :pswitch_5
    iget-object v4, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    sget-object v5, Lcom/facebook/ui/touch/c;->DEFERRING:Lcom/facebook/ui/touch/c;

    if-eq v4, v5, :cond_b

    iget v4, p0, Lcom/facebook/ui/touch/a;->w:I

    if-eqz v4, :cond_b

    .line 290
    iget-object v4, p0, Lcom/facebook/ui/touch/a;->p:Lcom/facebook/ui/touch/d;

    invoke-direct {p0}, Lcom/facebook/ui/touch/a;->e()I

    move-result v5

    invoke-interface {v4, v1, v0, v5}, Lcom/facebook/ui/touch/d;->a(FFI)V

    .line 296
    :cond_a
    :goto_5
    sget-object v0, Lcom/facebook/ui/touch/c;->MONITORING:Lcom/facebook/ui/touch/c;

    iput-object v0, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    .line 298
    iput v3, p0, Lcom/facebook/ui/touch/a;->w:I

    goto/16 :goto_0

    .line 292
    :cond_b
    iget-object v4, p0, Lcom/facebook/ui/touch/a;->v:Lcom/facebook/ui/touch/c;

    sget-object v5, Lcom/facebook/ui/touch/c;->DEFERRING:Lcom/facebook/ui/touch/c;

    if-eq v4, v5, :cond_a

    .line 293
    iget-object v4, p0, Lcom/facebook/ui/touch/a;->p:Lcom/facebook/ui/touch/d;

    invoke-interface {v4, v1, v0}, Lcom/facebook/ui/touch/d;->c(FF)V

    goto :goto_5

    :cond_c
    move v0, v3

    .line 302
    goto/16 :goto_1

    .line 176
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_5
        :pswitch_1
        :pswitch_5
    .end packed-switch

    .line 198
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public b()F
    .locals 1

    .prologue
    .line 473
    iget v0, p0, Lcom/facebook/ui/touch/a;->o:F

    return v0
.end method
