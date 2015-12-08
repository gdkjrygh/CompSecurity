.class public final Lcom/bumptech/glide/g/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/g/b/h;
.implements Lcom/bumptech/glide/g/c;
.implements Lcom/bumptech/glide/g/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        "Z:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/g/b/h;",
        "Lcom/bumptech/glide/g/c;",
        "Lcom/bumptech/glide/g/f;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/bumptech/glide/g/a",
            "<****>;>;"
        }
    .end annotation
.end field


# instance fields
.field private A:Lcom/bumptech/glide/load/b/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/b/x",
            "<*>;"
        }
    .end annotation
.end field

.field private B:Lcom/bumptech/glide/load/b/i;

.field private C:J

.field private D:I

.field private final b:Ljava/lang/String;

.field private c:Lcom/bumptech/glide/load/c;

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:I

.field private f:I

.field private g:I

.field private h:Landroid/content/Context;

.field private i:Lcom/bumptech/glide/load/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/g",
            "<TZ;>;"
        }
    .end annotation
.end field

.field private j:Lcom/bumptech/glide/f/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/f/f",
            "<TA;TT;TZ;TR;>;"
        }
    .end annotation
.end field

.field private k:Lcom/bumptech/glide/g/d;

.field private l:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field

.field private m:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TR;>;"
        }
    .end annotation
.end field

.field private n:Z

.field private o:I

.field private p:Lcom/bumptech/glide/g/b/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g/b/k",
            "<TR;>;"
        }
    .end annotation
.end field

.field private q:Lcom/bumptech/glide/g/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g/e",
            "<-TA;TR;>;"
        }
    .end annotation
.end field

.field private r:F

.field private s:Lcom/bumptech/glide/load/b/f;

.field private t:Lcom/bumptech/glide/g/a/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g/a/f",
            "<TR;>;"
        }
    .end annotation
.end field

.field private u:I

.field private v:I

.field private w:Lcom/bumptech/glide/load/b/e;

.field private x:Landroid/graphics/drawable/Drawable;

.field private y:Landroid/graphics/drawable/Drawable;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/bumptech/glide/i/h;->a(I)Ljava/util/Queue;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/g/a;->a:Ljava/util/Queue;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/g/a;->b:Ljava/lang/String;

    .line 149
    return-void
.end method

.method public static a(Lcom/bumptech/glide/f/f;Ljava/lang/Object;Lcom/bumptech/glide/load/c;Landroid/content/Context;ILcom/bumptech/glide/g/b/k;FLandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILcom/bumptech/glide/g/e;Lcom/bumptech/glide/g/d;Lcom/bumptech/glide/load/b/f;Lcom/bumptech/glide/load/g;Ljava/lang/Class;ZLcom/bumptech/glide/g/a/f;IILcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/g/a;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/f/f",
            "<TA;TT;TZ;TR;>;TA;",
            "Lcom/bumptech/glide/load/c;",
            "Landroid/content/Context;",
            "I",
            "Lcom/bumptech/glide/g/b/k",
            "<TR;>;F",
            "Landroid/graphics/drawable/Drawable;",
            "I",
            "Landroid/graphics/drawable/Drawable;",
            "I",
            "Landroid/graphics/drawable/Drawable;",
            "I",
            "Lcom/bumptech/glide/g/e",
            "<-TA;TR;>;",
            "Lcom/bumptech/glide/g/d;",
            "Lcom/bumptech/glide/load/b/f;",
            "Lcom/bumptech/glide/load/g",
            "<TZ;>;",
            "Ljava/lang/Class",
            "<TR;>;Z",
            "Lcom/bumptech/glide/g/a/f",
            "<TR;>;II",
            "Lcom/bumptech/glide/load/b/e;",
            ")",
            "Lcom/bumptech/glide/g/a",
            "<TA;TT;TZ;TR;>;"
        }
    .end annotation

    .prologue
    .line 117
    sget-object v1, Lcom/bumptech/glide/g/a;->a:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/g/a;

    .line 118
    if-nez v1, :cond_0

    .line 119
    new-instance v1, Lcom/bumptech/glide/g/a;

    invoke-direct {v1}, Lcom/bumptech/glide/g/a;-><init>()V

    .line 1193
    :cond_0
    iput-object p0, v1, Lcom/bumptech/glide/g/a;->j:Lcom/bumptech/glide/f/f;

    .line 1194
    iput-object p1, v1, Lcom/bumptech/glide/g/a;->l:Ljava/lang/Object;

    .line 1195
    iput-object p2, v1, Lcom/bumptech/glide/g/a;->c:Lcom/bumptech/glide/load/c;

    .line 1196
    move-object/from16 v0, p11

    iput-object v0, v1, Lcom/bumptech/glide/g/a;->d:Landroid/graphics/drawable/Drawable;

    .line 1197
    move/from16 v0, p12

    iput v0, v1, Lcom/bumptech/glide/g/a;->e:I

    .line 1198
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iput-object v2, v1, Lcom/bumptech/glide/g/a;->h:Landroid/content/Context;

    .line 1199
    iput p4, v1, Lcom/bumptech/glide/g/a;->o:I

    .line 1200
    iput-object p5, v1, Lcom/bumptech/glide/g/a;->p:Lcom/bumptech/glide/g/b/k;

    .line 1201
    iput p6, v1, Lcom/bumptech/glide/g/a;->r:F

    .line 1202
    iput-object p7, v1, Lcom/bumptech/glide/g/a;->x:Landroid/graphics/drawable/Drawable;

    .line 1203
    iput p8, v1, Lcom/bumptech/glide/g/a;->f:I

    .line 1204
    iput-object p9, v1, Lcom/bumptech/glide/g/a;->y:Landroid/graphics/drawable/Drawable;

    .line 1205
    iput p10, v1, Lcom/bumptech/glide/g/a;->g:I

    .line 1206
    move-object/from16 v0, p13

    iput-object v0, v1, Lcom/bumptech/glide/g/a;->q:Lcom/bumptech/glide/g/e;

    .line 1207
    move-object/from16 v0, p14

    iput-object v0, v1, Lcom/bumptech/glide/g/a;->k:Lcom/bumptech/glide/g/d;

    .line 1208
    move-object/from16 v0, p15

    iput-object v0, v1, Lcom/bumptech/glide/g/a;->s:Lcom/bumptech/glide/load/b/f;

    .line 1209
    move-object/from16 v0, p16

    iput-object v0, v1, Lcom/bumptech/glide/g/a;->i:Lcom/bumptech/glide/load/g;

    .line 1210
    move-object/from16 v0, p17

    iput-object v0, v1, Lcom/bumptech/glide/g/a;->m:Ljava/lang/Class;

    .line 1211
    move/from16 v0, p18

    iput-boolean v0, v1, Lcom/bumptech/glide/g/a;->n:Z

    .line 1212
    move-object/from16 v0, p19

    iput-object v0, v1, Lcom/bumptech/glide/g/a;->t:Lcom/bumptech/glide/g/a/f;

    .line 1213
    move/from16 v0, p20

    iput v0, v1, Lcom/bumptech/glide/g/a;->u:I

    .line 1214
    move/from16 v0, p21

    iput v0, v1, Lcom/bumptech/glide/g/a;->v:I

    .line 1215
    move-object/from16 v0, p22

    iput-object v0, v1, Lcom/bumptech/glide/g/a;->w:Lcom/bumptech/glide/load/b/e;

    .line 1216
    sget v2, Lcom/bumptech/glide/g/b;->a:I

    iput v2, v1, Lcom/bumptech/glide/g/a;->D:I

    .line 1220
    if-eqz p1, :cond_3

    .line 1221
    const-string v2, "ModelLoader"

    invoke-interface {p0}, Lcom/bumptech/glide/f/f;->e()Lcom/bumptech/glide/load/c/s;

    move-result-object v3

    const-string v4, "try .using(ModelLoader)"

    invoke-static {v2, v3, v4}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1222
    const-string v2, "Transcoder"

    invoke-interface {p0}, Lcom/bumptech/glide/f/f;->f()Lcom/bumptech/glide/load/resource/e/c;

    move-result-object v3

    const-string v4, "try .as*(Class).transcode(ResourceTranscoder)"

    invoke-static {v2, v3, v4}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1223
    const-string v2, "Transformation"

    const-string v3, "try .transform(UnitTransformation.get())"

    move-object/from16 v0, p16

    invoke-static {v2, v0, v3}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1224
    invoke-virtual/range {p22 .. p22}, Lcom/bumptech/glide/load/b/e;->a()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1225
    const-string v2, "SourceEncoder"

    invoke-interface {p0}, Lcom/bumptech/glide/f/f;->c()Lcom/bumptech/glide/load/b;

    move-result-object v3

    const-string v4, "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)"

    invoke-static {v2, v3, v4}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1231
    :goto_0
    invoke-virtual/range {p22 .. p22}, Lcom/bumptech/glide/load/b/e;->a()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual/range {p22 .. p22}, Lcom/bumptech/glide/load/b/e;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1235
    :cond_1
    const-string v2, "CacheDecoder"

    invoke-interface {p0}, Lcom/bumptech/glide/f/f;->a()Lcom/bumptech/glide/load/e;

    move-result-object v3

    const-string v4, "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)"

    invoke-static {v2, v3, v4}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1238
    :cond_2
    invoke-virtual/range {p22 .. p22}, Lcom/bumptech/glide/load/b/e;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1239
    const-string v2, "Encoder"

    invoke-interface {p0}, Lcom/bumptech/glide/f/f;->d()Lcom/bumptech/glide/load/f;

    move-result-object v3

    const-string v4, "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)"

    invoke-static {v2, v3, v4}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    :cond_3
    return-object v1

    .line 1228
    :cond_4
    const-string v2, "SourceDecoder"

    invoke-interface {p0}, Lcom/bumptech/glide/f/f;->b()Lcom/bumptech/glide/load/e;

    move-result-object v3

    const-string v4, "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)"

    invoke-static {v2, v3, v4}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 553
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " this: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/g/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 554
    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 246
    if-nez p1, :cond_0

    .line 247
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    const-string v1, " must not be null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 255
    :cond_0
    return-void
.end method

.method private b(Lcom/bumptech/glide/load/b/x;)V
    .locals 1

    .prologue
    .line 341
    invoke-static {p1}, Lcom/bumptech/glide/load/b/f;->a(Lcom/bumptech/glide/load/b/x;)V

    .line 342
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/g/a;->A:Lcom/bumptech/glide/load/b/x;

    .line 343
    return-void
.end method

.method private i()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 415
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->x:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/bumptech/glide/g/a;->f:I

    if-lez v0, :cond_0

    .line 416
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/bumptech/glide/g/a;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/g/a;->x:Landroid/graphics/drawable/Drawable;

    .line 418
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->x:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method private j()Z
    .locals 1

    .prologue
    .line 462
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->k:Lcom/bumptech/glide/g/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/g/a;->k:Lcom/bumptech/glide/g/d;

    invoke-interface {v0, p0}, Lcom/bumptech/glide/g/d;->b(Lcom/bumptech/glide/g/c;)Z

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

.method private k()Z
    .locals 1

    .prologue
    .line 466
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->k:Lcom/bumptech/glide/g/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/g/a;->k:Lcom/bumptech/glide/g/d;

    invoke-interface {v0}, Lcom/bumptech/glide/g/d;->i()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 153
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->j:Lcom/bumptech/glide/f/f;

    .line 154
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->l:Ljava/lang/Object;

    .line 155
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->h:Landroid/content/Context;

    .line 156
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->p:Lcom/bumptech/glide/g/b/k;

    .line 157
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->x:Landroid/graphics/drawable/Drawable;

    .line 158
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->y:Landroid/graphics/drawable/Drawable;

    .line 159
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->d:Landroid/graphics/drawable/Drawable;

    .line 160
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->q:Lcom/bumptech/glide/g/e;

    .line 161
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->k:Lcom/bumptech/glide/g/d;

    .line 162
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->i:Lcom/bumptech/glide/load/g;

    .line 163
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->t:Lcom/bumptech/glide/g/a/f;

    .line 164
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/g/a;->z:Z

    .line 165
    iput-object v1, p0, Lcom/bumptech/glide/g/a;->B:Lcom/bumptech/glide/load/b/i;

    .line 166
    sget-object v0, Lcom/bumptech/glide/g/a;->a:Ljava/util/Queue;

    invoke-interface {v0, p0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 167
    return-void
.end method

.method public final a(II)V
    .locals 12

    .prologue
    .line 426
    const-string v0, "GenericRequest"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 427
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Got onSizeReady in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/bumptech/glide/g/a;->C:J

    invoke-static {v2, v3}, Lcom/bumptech/glide/i/d;->a(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;)V

    .line 429
    :cond_0
    iget v0, p0, Lcom/bumptech/glide/g/a;->D:I

    sget v1, Lcom/bumptech/glide/g/b;->c:I

    if-eq v0, v1, :cond_2

    .line 455
    :cond_1
    :goto_0
    return-void

    .line 432
    :cond_2
    sget v0, Lcom/bumptech/glide/g/b;->b:I

    iput v0, p0, Lcom/bumptech/glide/g/a;->D:I

    .line 434
    iget v0, p0, Lcom/bumptech/glide/g/a;->r:F

    int-to-float v1, p1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 435
    iget v0, p0, Lcom/bumptech/glide/g/a;->r:F

    int-to-float v1, p2

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 437
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->j:Lcom/bumptech/glide/f/f;

    invoke-interface {v0}, Lcom/bumptech/glide/f/f;->e()Lcom/bumptech/glide/load/c/s;

    move-result-object v0

    .line 438
    iget-object v1, p0, Lcom/bumptech/glide/g/a;->l:Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, Lcom/bumptech/glide/load/c/s;->a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/a/c;

    move-result-object v4

    .line 440
    if-nez v4, :cond_3

    .line 441
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to load model: \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/bumptech/glide/g/a;->l:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/Exception;)V

    goto :goto_0

    .line 444
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->j:Lcom/bumptech/glide/f/f;

    invoke-interface {v0}, Lcom/bumptech/glide/f/f;->f()Lcom/bumptech/glide/load/resource/e/c;

    move-result-object v7

    .line 445
    const-string v0, "GenericRequest"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 446
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "finished setup for calling load in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v8, p0, Lcom/bumptech/glide/g/a;->C:J

    invoke-static {v8, v9}, Lcom/bumptech/glide/i/d;->a(J)D

    move-result-wide v8

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;)V

    .line 448
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/g/a;->z:Z

    .line 449
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->s:Lcom/bumptech/glide/load/b/f;

    iget-object v1, p0, Lcom/bumptech/glide/g/a;->c:Lcom/bumptech/glide/load/c;

    iget-object v5, p0, Lcom/bumptech/glide/g/a;->j:Lcom/bumptech/glide/f/f;

    iget-object v6, p0, Lcom/bumptech/glide/g/a;->i:Lcom/bumptech/glide/load/g;

    iget v8, p0, Lcom/bumptech/glide/g/a;->o:I

    iget-boolean v9, p0, Lcom/bumptech/glide/g/a;->n:Z

    iget-object v10, p0, Lcom/bumptech/glide/g/a;->w:Lcom/bumptech/glide/load/b/e;

    move-object v11, p0

    invoke-virtual/range {v0 .. v11}, Lcom/bumptech/glide/load/b/f;->a(Lcom/bumptech/glide/load/c;IILcom/bumptech/glide/load/a/c;Lcom/bumptech/glide/f/b;Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/resource/e/c;IZLcom/bumptech/glide/load/b/e;Lcom/bumptech/glide/g/f;)Lcom/bumptech/glide/load/b/i;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/g/a;->B:Lcom/bumptech/glide/load/b/i;

    .line 451
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->A:Lcom/bumptech/glide/load/b/x;

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lcom/bumptech/glide/g/a;->z:Z

    .line 452
    const-string v0, "GenericRequest"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 453
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "finished onSizeReady in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/bumptech/glide/g/a;->C:J

    invoke-static {v2, v3}, Lcom/bumptech/glide/i/d;->a(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 451
    :cond_5
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a(Lcom/bumptech/glide/load/b/x;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/x",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 481
    if-nez p1, :cond_1

    .line 482
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected to receive a Resource<R> with an object of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/bumptech/glide/g/a;->m:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " inside, but instead got null."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/Exception;)V

    .line 508
    :cond_0
    :goto_0
    return-void

    .line 487
    :cond_1
    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v1

    .line 488
    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/bumptech/glide/g/a;->m:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 489
    :cond_2
    invoke-direct {p0, p1}, Lcom/bumptech/glide/g/a;->b(Lcom/bumptech/glide/load/b/x;)V

    .line 490
    new-instance v2, Ljava/lang/Exception;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Expected to receive an object of "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/bumptech/glide/g/a;->m:Ljava/lang/Class;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " but instead got "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "{"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "} inside Resource{"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "}."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    if-eqz v1, :cond_4

    const-string v0, ""

    :goto_2
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_3
    const-string v0, ""

    goto :goto_1

    :cond_4
    const-string v0, " To indicate failure return a null Resource object, rather than a Resource object containing null data."

    goto :goto_2

    .line 2458
    :cond_5
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->k:Lcom/bumptech/glide/g/d;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/bumptech/glide/g/a;->k:Lcom/bumptech/glide/g/d;

    invoke-interface {v0, p0}, Lcom/bumptech/glide/g/d;->a(Lcom/bumptech/glide/g/c;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    const/4 v0, 0x1

    .line 500
    :goto_3
    if-nez v0, :cond_8

    .line 501
    invoke-direct {p0, p1}, Lcom/bumptech/glide/g/a;->b(Lcom/bumptech/glide/load/b/x;)V

    .line 503
    sget v0, Lcom/bumptech/glide/g/b;->d:I

    iput v0, p0, Lcom/bumptech/glide/g/a;->D:I

    goto :goto_0

    .line 2458
    :cond_7
    const/4 v0, 0x0

    goto :goto_3

    .line 2518
    :cond_8
    invoke-direct {p0}, Lcom/bumptech/glide/g/a;->k()Z

    move-result v0

    .line 2519
    sget v2, Lcom/bumptech/glide/g/b;->d:I

    iput v2, p0, Lcom/bumptech/glide/g/a;->D:I

    .line 2520
    iput-object p1, p0, Lcom/bumptech/glide/g/a;->A:Lcom/bumptech/glide/load/b/x;

    .line 2522
    iget-object v2, p0, Lcom/bumptech/glide/g/a;->q:Lcom/bumptech/glide/g/e;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/bumptech/glide/g/a;->q:Lcom/bumptech/glide/g/e;

    invoke-interface {v2}, Lcom/bumptech/glide/g/e;->b()Z

    move-result v2

    if-nez v2, :cond_a

    .line 2524
    :cond_9
    iget-object v2, p0, Lcom/bumptech/glide/g/a;->t:Lcom/bumptech/glide/g/a/f;

    iget-boolean v3, p0, Lcom/bumptech/glide/g/a;->z:Z

    invoke-interface {v2, v3, v0}, Lcom/bumptech/glide/g/a/f;->a(ZZ)Lcom/bumptech/glide/g/a/d;

    move-result-object v0

    .line 2525
    iget-object v2, p0, Lcom/bumptech/glide/g/a;->p:Lcom/bumptech/glide/g/b/k;

    invoke-interface {v2, v1, v0}, Lcom/bumptech/glide/g/b/k;->a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/d;)V

    .line 3470
    :cond_a
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->k:Lcom/bumptech/glide/g/d;

    if-eqz v0, :cond_b

    .line 3471
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->k:Lcom/bumptech/glide/g/d;

    invoke-interface {v0, p0}, Lcom/bumptech/glide/g/d;->c(Lcom/bumptech/glide/g/c;)V

    .line 2530
    :cond_b
    const-string v0, "GenericRequest"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2531
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Resource ready in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/bumptech/glide/g/a;->C:J

    invoke-static {v2, v3}, Lcom/bumptech/glide/i/d;->a(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->c()I

    move-result v1

    int-to-double v2, v1

    const-wide/high16 v4, 0x3eb0000000000000L    # 9.5367431640625E-7

    mul-double/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " fromCache: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/bumptech/glide/g/a;->z:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 2

    .prologue
    .line 541
    const-string v0, "GenericRequest"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 545
    sget v0, Lcom/bumptech/glide/g/b;->e:I

    iput v0, p0, Lcom/bumptech/glide/g/a;->D:I

    .line 547
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->q:Lcom/bumptech/glide/g/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/g/a;->q:Lcom/bumptech/glide/g/e;

    invoke-direct {p0}, Lcom/bumptech/glide/g/a;->k()Z

    invoke-interface {v0}, Lcom/bumptech/glide/g/e;->a()Z

    move-result v0

    if-nez v0, :cond_5

    .line 4393
    :cond_0
    invoke-direct {p0}, Lcom/bumptech/glide/g/a;->j()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4397
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->l:Ljava/lang/Object;

    if-nez v0, :cond_6

    .line 5386
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->d:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    iget v0, p0, Lcom/bumptech/glide/g/a;->e:I

    if-lez v0, :cond_1

    .line 5387
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/bumptech/glide/g/a;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/g/a;->d:Landroid/graphics/drawable/Drawable;

    .line 5389
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->d:Landroid/graphics/drawable/Drawable;

    .line 4398
    :goto_0
    if-nez v0, :cond_3

    .line 5408
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->y:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_2

    iget v0, p0, Lcom/bumptech/glide/g/a;->g:I

    if-lez v0, :cond_2

    .line 5409
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/bumptech/glide/g/a;->g:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/g/a;->y:Landroid/graphics/drawable/Drawable;

    .line 5411
    :cond_2
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->y:Landroid/graphics/drawable/Drawable;

    .line 4401
    :cond_3
    if-nez v0, :cond_4

    .line 4402
    invoke-direct {p0}, Lcom/bumptech/glide/g/a;->i()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 4404
    :cond_4
    iget-object v1, p0, Lcom/bumptech/glide/g/a;->p:Lcom/bumptech/glide/g/b/k;

    invoke-interface {v1, p1, v0}, Lcom/bumptech/glide/g/b/k;->a(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V

    .line 550
    :cond_5
    return-void

    .line 4397
    :cond_6
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 262
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bumptech/glide/g/a;->C:J

    .line 263
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->l:Ljava/lang/Object;

    if-nez v0, :cond_1

    .line 264
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/Exception;)V

    .line 281
    :cond_0
    :goto_0
    return-void

    .line 268
    :cond_1
    sget v0, Lcom/bumptech/glide/g/b;->c:I

    iput v0, p0, Lcom/bumptech/glide/g/a;->D:I

    .line 269
    iget v0, p0, Lcom/bumptech/glide/g/a;->u:I

    iget v1, p0, Lcom/bumptech/glide/g/a;->v:I

    invoke-static {v0, v1}, Lcom/bumptech/glide/i/h;->a(II)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 270
    iget v0, p0, Lcom/bumptech/glide/g/a;->u:I

    iget v1, p0, Lcom/bumptech/glide/g/a;->v:I

    invoke-virtual {p0, v0, v1}, Lcom/bumptech/glide/g/a;->a(II)V

    .line 275
    :goto_1
    invoke-virtual {p0}, Lcom/bumptech/glide/g/a;->f()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1382
    iget v0, p0, Lcom/bumptech/glide/g/a;->D:I

    sget v1, Lcom/bumptech/glide/g/b;->e:I

    if-ne v0, v1, :cond_4

    const/4 v0, 0x1

    .line 275
    :goto_2
    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/bumptech/glide/g/a;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 276
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->p:Lcom/bumptech/glide/g/b/k;

    invoke-direct {p0}, Lcom/bumptech/glide/g/a;->i()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/bumptech/glide/g/b/k;->c(Landroid/graphics/drawable/Drawable;)V

    .line 278
    :cond_2
    const-string v0, "GenericRequest"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "finished run method in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/bumptech/glide/g/a;->C:J

    invoke-static {v2, v3}, Lcom/bumptech/glide/i/d;->a(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bumptech/glide/g/a;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 272
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->p:Lcom/bumptech/glide/g/b/k;

    invoke-interface {v0, p0}, Lcom/bumptech/glide/g/b/k;->a(Lcom/bumptech/glide/g/b/h;)V

    goto :goto_1

    .line 1382
    :cond_4
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 313
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 314
    iget v0, p0, Lcom/bumptech/glide/g/a;->D:I

    sget v1, Lcom/bumptech/glide/g/b;->g:I

    if-ne v0, v1, :cond_0

    .line 327
    :goto_0
    return-void

    .line 2294
    :cond_0
    sget v0, Lcom/bumptech/glide/g/b;->f:I

    iput v0, p0, Lcom/bumptech/glide/g/a;->D:I

    .line 2295
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->B:Lcom/bumptech/glide/load/b/i;

    if-eqz v0, :cond_1

    .line 2296
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->B:Lcom/bumptech/glide/load/b/i;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/i;->a()V

    .line 2297
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/g/a;->B:Lcom/bumptech/glide/load/b/i;

    .line 319
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->A:Lcom/bumptech/glide/load/b/x;

    if-eqz v0, :cond_2

    .line 320
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->A:Lcom/bumptech/glide/load/b/x;

    invoke-direct {p0, v0}, Lcom/bumptech/glide/g/a;->b(Lcom/bumptech/glide/load/b/x;)V

    .line 322
    :cond_2
    invoke-direct {p0}, Lcom/bumptech/glide/g/a;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 323
    iget-object v0, p0, Lcom/bumptech/glide/g/a;->p:Lcom/bumptech/glide/g/b/k;

    invoke-direct {p0}, Lcom/bumptech/glide/g/a;->i()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/bumptech/glide/g/b/k;->b(Landroid/graphics/drawable/Drawable;)V

    .line 326
    :cond_3
    sget v0, Lcom/bumptech/glide/g/b;->g:I

    iput v0, p0, Lcom/bumptech/glide/g/a;->D:I

    goto :goto_0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 336
    invoke-virtual {p0}, Lcom/bumptech/glide/g/a;->c()V

    .line 337
    sget v0, Lcom/bumptech/glide/g/b;->h:I

    iput v0, p0, Lcom/bumptech/glide/g/a;->D:I

    .line 338
    return-void
.end method

.method public final e()Z
    .locals 2

    .prologue
    .line 350
    iget v0, p0, Lcom/bumptech/glide/g/a;->D:I

    sget v1, Lcom/bumptech/glide/g/b;->b:I

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/bumptech/glide/g/a;->D:I

    sget v1, Lcom/bumptech/glide/g/b;->c:I

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()Z
    .locals 2

    .prologue
    .line 358
    iget v0, p0, Lcom/bumptech/glide/g/a;->D:I

    sget v1, Lcom/bumptech/glide/g/b;->d:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 366
    invoke-virtual {p0}, Lcom/bumptech/glide/g/a;->f()Z

    move-result v0

    return v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    .line 374
    iget v0, p0, Lcom/bumptech/glide/g/a;->D:I

    sget v1, Lcom/bumptech/glide/g/b;->f:I

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/bumptech/glide/g/a;->D:I

    sget v1, Lcom/bumptech/glide/g/b;->g:I

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
