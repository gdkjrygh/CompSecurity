.class public Lcom/bumptech/glide/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ModelType:",
        "Ljava/lang/Object;",
        "DataType:",
        "Ljava/lang/Object;",
        "ResourceType:",
        "Ljava/lang/Object;",
        "TranscodeType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Landroid/graphics/drawable/Drawable;

.field private C:I

.field protected final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TModelType;>;"
        }
    .end annotation
.end field

.field protected final b:Landroid/content/Context;

.field protected final c:Lcom/bumptech/glide/h;

.field protected final d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TTranscodeType;>;"
        }
    .end annotation
.end field

.field protected final e:Lcom/bumptech/glide/d/p;

.field protected final f:Lcom/bumptech/glide/d/i;

.field private g:Lcom/bumptech/glide/f/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/f/a",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TModelType;"
        }
    .end annotation
.end field

.field private i:Lcom/bumptech/glide/load/c;

.field private j:Z

.field private k:I

.field private l:I

.field private m:Lcom/bumptech/glide/g/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g/e",
            "<-TModelType;TTranscodeType;>;"
        }
    .end annotation
.end field

.field private n:Ljava/lang/Float;

.field private o:Lcom/bumptech/glide/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/e",
            "<***TTranscodeType;>;"
        }
    .end annotation
.end field

.field private p:Ljava/lang/Float;

.field private q:Landroid/graphics/drawable/Drawable;

.field private r:Landroid/graphics/drawable/Drawable;

.field private s:I

.field private t:Z

.field private u:Lcom/bumptech/glide/g/a/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g/a/f",
            "<TTranscodeType;>;"
        }
    .end annotation
.end field

.field private v:I

.field private w:I

.field private x:Lcom/bumptech/glide/load/b/e;

.field private y:Lcom/bumptech/glide/load/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/g",
            "<TResourceType;>;"
        }
    .end annotation
.end field

.field private z:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/Class;Lcom/bumptech/glide/f/f;Ljava/lang/Class;Lcom/bumptech/glide/h;Lcom/bumptech/glide/d/p;Lcom/bumptech/glide/d/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<TModelType;>;",
            "Lcom/bumptech/glide/f/f",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;",
            "Ljava/lang/Class",
            "<TTranscodeType;>;",
            "Lcom/bumptech/glide/h;",
            "Lcom/bumptech/glide/d/p;",
            "Lcom/bumptech/glide/d/i;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v1, -0x1

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    invoke-static {}, Lcom/bumptech/glide/h/b;->a()Lcom/bumptech/glide/h/b;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/e;->i:Lcom/bumptech/glide/load/c;

    .line 68
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/e;->p:Ljava/lang/Float;

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lcom/bumptech/glide/e;->s:I

    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/e;->t:Z

    .line 73
    invoke-static {}, Lcom/bumptech/glide/g/a/g;->a()Lcom/bumptech/glide/g/a/f;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/e;->u:Lcom/bumptech/glide/g/a/f;

    .line 74
    iput v1, p0, Lcom/bumptech/glide/e;->v:I

    .line 75
    iput v1, p0, Lcom/bumptech/glide/e;->w:I

    .line 76
    sget-object v0, Lcom/bumptech/glide/load/b/e;->d:Lcom/bumptech/glide/load/b/e;

    iput-object v0, p0, Lcom/bumptech/glide/e;->x:Lcom/bumptech/glide/load/b/e;

    .line 77
    invoke-static {}, Lcom/bumptech/glide/load/resource/d;->b()Lcom/bumptech/glide/load/resource/d;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/e;->y:Lcom/bumptech/glide/load/g;

    .line 97
    iput-object p1, p0, Lcom/bumptech/glide/e;->b:Landroid/content/Context;

    .line 98
    iput-object p2, p0, Lcom/bumptech/glide/e;->a:Ljava/lang/Class;

    .line 99
    iput-object p4, p0, Lcom/bumptech/glide/e;->d:Ljava/lang/Class;

    .line 100
    iput-object p5, p0, Lcom/bumptech/glide/e;->c:Lcom/bumptech/glide/h;

    .line 101
    iput-object p6, p0, Lcom/bumptech/glide/e;->e:Lcom/bumptech/glide/d/p;

    .line 102
    iput-object p7, p0, Lcom/bumptech/glide/e;->f:Lcom/bumptech/glide/d/i;

    .line 103
    if-eqz p3, :cond_0

    new-instance v0, Lcom/bumptech/glide/f/a;

    invoke-direct {v0, p3}, Lcom/bumptech/glide/f/a;-><init>(Lcom/bumptech/glide/f/f;)V

    :goto_0
    iput-object v0, p0, Lcom/bumptech/glide/e;->g:Lcom/bumptech/glide/f/a;

    .line 106
    if-nez p1, :cond_1

    .line 107
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Context can\'t be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 103
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 109
    :cond_1
    if-eqz p2, :cond_2

    if-nez p3, :cond_2

    .line 110
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "LoadProvider must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 112
    :cond_2
    return-void
.end method

.method constructor <init>(Lcom/bumptech/glide/f/f;Ljava/lang/Class;Lcom/bumptech/glide/e;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/f/f",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;",
            "Ljava/lang/Class",
            "<TTranscodeType;>;",
            "Lcom/bumptech/glide/e",
            "<TModelType;***>;)V"
        }
    .end annotation

    .prologue
    .line 85
    iget-object v1, p3, Lcom/bumptech/glide/e;->b:Landroid/content/Context;

    iget-object v2, p3, Lcom/bumptech/glide/e;->a:Ljava/lang/Class;

    iget-object v5, p3, Lcom/bumptech/glide/e;->c:Lcom/bumptech/glide/h;

    iget-object v6, p3, Lcom/bumptech/glide/e;->e:Lcom/bumptech/glide/d/p;

    iget-object v7, p3, Lcom/bumptech/glide/e;->f:Lcom/bumptech/glide/d/i;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v7}, Lcom/bumptech/glide/e;-><init>(Landroid/content/Context;Ljava/lang/Class;Lcom/bumptech/glide/f/f;Ljava/lang/Class;Lcom/bumptech/glide/h;Lcom/bumptech/glide/d/p;Lcom/bumptech/glide/d/i;)V

    .line 87
    iget-object v0, p3, Lcom/bumptech/glide/e;->h:Ljava/lang/Object;

    iput-object v0, p0, Lcom/bumptech/glide/e;->h:Ljava/lang/Object;

    .line 88
    iget-boolean v0, p3, Lcom/bumptech/glide/e;->j:Z

    iput-boolean v0, p0, Lcom/bumptech/glide/e;->j:Z

    .line 89
    iget-object v0, p3, Lcom/bumptech/glide/e;->i:Lcom/bumptech/glide/load/c;

    iput-object v0, p0, Lcom/bumptech/glide/e;->i:Lcom/bumptech/glide/load/c;

    .line 90
    iget-object v0, p3, Lcom/bumptech/glide/e;->x:Lcom/bumptech/glide/load/b/e;

    iput-object v0, p0, Lcom/bumptech/glide/e;->x:Lcom/bumptech/glide/load/b/e;

    .line 91
    iget-boolean v0, p3, Lcom/bumptech/glide/e;->t:Z

    iput-boolean v0, p0, Lcom/bumptech/glide/e;->t:Z

    .line 92
    return-void
.end method

.method private a()I
    .locals 2

    .prologue
    .line 776
    iget v0, p0, Lcom/bumptech/glide/e;->s:I

    sget v1, Lcom/bumptech/glide/o;->d:I

    if-ne v0, v1, :cond_0

    .line 777
    sget v0, Lcom/bumptech/glide/o;->c:I

    .line 783
    :goto_0
    return v0

    .line 778
    :cond_0
    iget v0, p0, Lcom/bumptech/glide/e;->s:I

    sget v1, Lcom/bumptech/glide/o;->c:I

    if-ne v0, v1, :cond_1

    .line 779
    sget v0, Lcom/bumptech/glide/o;->b:I

    goto :goto_0

    .line 781
    :cond_1
    sget v0, Lcom/bumptech/glide/o;->a:I

    goto :goto_0
.end method

.method private a(Lcom/bumptech/glide/g/b/k;FILcom/bumptech/glide/g/d;)Lcom/bumptech/glide/g/c;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/g/b/k",
            "<TTranscodeType;>;FI",
            "Lcom/bumptech/glide/g/d;",
            ")",
            "Lcom/bumptech/glide/g/c;"
        }
    .end annotation

    .prologue
    .line 838
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/e;->g:Lcom/bumptech/glide/f/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/bumptech/glide/e;->h:Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/e;->i:Lcom/bumptech/glide/load/c;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/bumptech/glide/e;->b:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/bumptech/glide/e;->q:Landroid/graphics/drawable/Drawable;

    move-object/from16 v0, p0

    iget v9, v0, Lcom/bumptech/glide/e;->k:I

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/bumptech/glide/e;->r:Landroid/graphics/drawable/Drawable;

    move-object/from16 v0, p0

    iget v11, v0, Lcom/bumptech/glide/e;->l:I

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/bumptech/glide/e;->B:Landroid/graphics/drawable/Drawable;

    move-object/from16 v0, p0

    iget v13, v0, Lcom/bumptech/glide/e;->C:I

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/bumptech/glide/e;->m:Lcom/bumptech/glide/g/e;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/bumptech/glide/e;->c:Lcom/bumptech/glide/h;

    invoke-virtual {v5}, Lcom/bumptech/glide/h;->b()Lcom/bumptech/glide/load/b/f;

    move-result-object v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/e;->y:Lcom/bumptech/glide/load/g;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/e;->d:Ljava/lang/Class;

    move-object/from16 v18, v0

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/bumptech/glide/e;->t:Z

    move/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/e;->u:Lcom/bumptech/glide/g/a/f;

    move-object/from16 v20, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/bumptech/glide/e;->w:I

    move/from16 v21, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/bumptech/glide/e;->v:I

    move/from16 v22, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/e;->x:Lcom/bumptech/glide/load/b/e;

    move-object/from16 v23, v0

    move/from16 v5, p3

    move-object/from16 v6, p1

    move/from16 v7, p2

    move-object/from16 v15, p4

    invoke-static/range {v1 .. v23}, Lcom/bumptech/glide/g/a;->a(Lcom/bumptech/glide/f/f;Ljava/lang/Object;Lcom/bumptech/glide/load/c;Landroid/content/Context;ILcom/bumptech/glide/g/b/k;FLandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILcom/bumptech/glide/g/e;Lcom/bumptech/glide/g/d;Lcom/bumptech/glide/load/b/f;Lcom/bumptech/glide/load/g;Ljava/lang/Class;ZLcom/bumptech/glide/g/a/f;IILcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/g/a;

    move-result-object v1

    return-object v1
.end method

.method private a(Lcom/bumptech/glide/g/b/k;Lcom/bumptech/glide/g/g;)Lcom/bumptech/glide/g/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/g/b/k",
            "<TTranscodeType;>;",
            "Lcom/bumptech/glide/g/g;",
            ")",
            "Lcom/bumptech/glide/g/c;"
        }
    .end annotation

    .prologue
    .line 794
    iget-object v0, p0, Lcom/bumptech/glide/e;->o:Lcom/bumptech/glide/e;

    if-eqz v0, :cond_4

    .line 795
    iget-boolean v0, p0, Lcom/bumptech/glide/e;->A:Z

    if-eqz v0, :cond_0

    .line 796
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 800
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/e;->o:Lcom/bumptech/glide/e;

    iget-object v0, v0, Lcom/bumptech/glide/e;->u:Lcom/bumptech/glide/g/a/f;

    invoke-static {}, Lcom/bumptech/glide/g/a/g;->a()Lcom/bumptech/glide/g/a/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 801
    iget-object v0, p0, Lcom/bumptech/glide/e;->o:Lcom/bumptech/glide/e;

    iget-object v1, p0, Lcom/bumptech/glide/e;->u:Lcom/bumptech/glide/g/a/f;

    iput-object v1, v0, Lcom/bumptech/glide/e;->u:Lcom/bumptech/glide/g/a/f;

    .line 804
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/e;->o:Lcom/bumptech/glide/e;

    iget v0, v0, Lcom/bumptech/glide/e;->s:I

    if-nez v0, :cond_2

    .line 805
    iget-object v0, p0, Lcom/bumptech/glide/e;->o:Lcom/bumptech/glide/e;

    invoke-direct {p0}, Lcom/bumptech/glide/e;->a()I

    move-result v1

    iput v1, v0, Lcom/bumptech/glide/e;->s:I

    .line 808
    :cond_2
    iget v0, p0, Lcom/bumptech/glide/e;->w:I

    iget v1, p0, Lcom/bumptech/glide/e;->v:I

    invoke-static {v0, v1}, Lcom/bumptech/glide/i/h;->a(II)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/bumptech/glide/e;->o:Lcom/bumptech/glide/e;

    iget v0, v0, Lcom/bumptech/glide/e;->w:I

    iget-object v1, p0, Lcom/bumptech/glide/e;->o:Lcom/bumptech/glide/e;

    iget v1, v1, Lcom/bumptech/glide/e;->v:I

    invoke-static {v0, v1}, Lcom/bumptech/glide/i/h;->a(II)Z

    move-result v0

    if-nez v0, :cond_3

    .line 811
    iget-object v0, p0, Lcom/bumptech/glide/e;->o:Lcom/bumptech/glide/e;

    iget v1, p0, Lcom/bumptech/glide/e;->w:I

    iget v2, p0, Lcom/bumptech/glide/e;->v:I

    invoke-virtual {v0, v1, v2}, Lcom/bumptech/glide/e;->a(II)Lcom/bumptech/glide/e;

    .line 814
    :cond_3
    new-instance v0, Lcom/bumptech/glide/g/g;

    invoke-direct {v0, p2}, Lcom/bumptech/glide/g/g;-><init>(Lcom/bumptech/glide/g/d;)V

    .line 815
    iget-object v1, p0, Lcom/bumptech/glide/e;->p:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget v2, p0, Lcom/bumptech/glide/e;->s:I

    invoke-direct {p0, p1, v1, v2, v0}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/g/b/k;FILcom/bumptech/glide/g/d;)Lcom/bumptech/glide/g/c;

    move-result-object v1

    .line 817
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/bumptech/glide/e;->A:Z

    .line 819
    iget-object v2, p0, Lcom/bumptech/glide/e;->o:Lcom/bumptech/glide/e;

    invoke-direct {v2, p1, v0}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/g/b/k;Lcom/bumptech/glide/g/g;)Lcom/bumptech/glide/g/c;

    move-result-object v2

    .line 820
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/bumptech/glide/e;->A:Z

    .line 821
    invoke-virtual {v0, v1, v2}, Lcom/bumptech/glide/g/g;->a(Lcom/bumptech/glide/g/c;Lcom/bumptech/glide/g/c;)V

    .line 832
    :goto_0
    return-object v0

    .line 823
    :cond_4
    iget-object v0, p0, Lcom/bumptech/glide/e;->n:Ljava/lang/Float;

    if-eqz v0, :cond_5

    .line 825
    new-instance v0, Lcom/bumptech/glide/g/g;

    invoke-direct {v0, p2}, Lcom/bumptech/glide/g/g;-><init>(Lcom/bumptech/glide/g/d;)V

    .line 826
    iget-object v1, p0, Lcom/bumptech/glide/e;->p:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget v2, p0, Lcom/bumptech/glide/e;->s:I

    invoke-direct {p0, p1, v1, v2, v0}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/g/b/k;FILcom/bumptech/glide/g/d;)Lcom/bumptech/glide/g/c;

    move-result-object v1

    .line 827
    iget-object v2, p0, Lcom/bumptech/glide/e;->n:Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-direct {p0}, Lcom/bumptech/glide/e;->a()I

    move-result v3

    invoke-direct {p0, p1, v2, v3, v0}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/g/b/k;FILcom/bumptech/glide/g/d;)Lcom/bumptech/glide/g/c;

    move-result-object v2

    .line 828
    invoke-virtual {v0, v1, v2}, Lcom/bumptech/glide/g/g;->a(Lcom/bumptech/glide/g/c;Lcom/bumptech/glide/g/c;)V

    goto :goto_0

    .line 832
    :cond_5
    iget-object v0, p0, Lcom/bumptech/glide/e;->p:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, p0, Lcom/bumptech/glide/e;->s:I

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/g/b/k;FILcom/bumptech/glide/g/d;)Lcom/bumptech/glide/g/c;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/bumptech/glide/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 434
    iput p1, p0, Lcom/bumptech/glide/e;->k:I

    .line 436
    return-object p0
.end method

.method public a(II)Lcom/bumptech/glide/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 563
    invoke-static {p1, p2}, Lcom/bumptech/glide/i/h;->a(II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 564
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Width and height must be Target#SIZE_ORIGINAL or > 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 566
    :cond_0
    iput p1, p0, Lcom/bumptech/glide/e;->w:I

    .line 567
    iput p2, p0, Lcom/bumptech/glide/e;->v:I

    .line 569
    return-object p0
.end method

.method public a(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 447
    iput-object p1, p0, Lcom/bumptech/glide/e;->q:Landroid/graphics/drawable/Drawable;

    .line 449
    return-object p0
.end method

.method public a(Lcom/bumptech/glide/e;)Lcom/bumptech/glide/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/e",
            "<***TTranscodeType;>;)",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 131
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You cannot set a request as a thumbnail for itself. Consider using clone() on the request you are passing to thumbnail()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 135
    :cond_0
    iput-object p1, p0, Lcom/bumptech/glide/e;->o:Lcom/bumptech/glide/e;

    .line 137
    return-object p0
.end method

.method final a(Lcom/bumptech/glide/g/a/f;)Lcom/bumptech/glide/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/g/a/f",
            "<TTranscodeType;>;)",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 417
    if-nez p1, :cond_0

    .line 418
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Animation factory must not be null!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 420
    :cond_0
    iput-object p1, p0, Lcom/bumptech/glide/e;->u:Lcom/bumptech/glide/g/a/f;

    .line 422
    return-object p0
.end method

.method public a(Lcom/bumptech/glide/load/b;)Lcom/bumptech/glide/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b",
            "<TDataType;>;)",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 246
    iget-object v0, p0, Lcom/bumptech/glide/e;->g:Lcom/bumptech/glide/f/a;

    if-eqz v0, :cond_0

    .line 247
    iget-object v0, p0, Lcom/bumptech/glide/e;->g:Lcom/bumptech/glide/f/a;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/f/a;->a(Lcom/bumptech/glide/load/b;)V

    .line 250
    :cond_0
    return-object p0
.end method

.method public a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/c;",
            ")",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 587
    if-nez p1, :cond_0

    .line 588
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Signature must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 590
    :cond_0
    iput-object p1, p0, Lcom/bumptech/glide/e;->i:Lcom/bumptech/glide/load/c;

    .line 591
    return-object p0
.end method

.method public a(Lcom/bumptech/glide/load/e;)Lcom/bumptech/glide/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/e",
            "<TDataType;TResourceType;>;)",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 207
    iget-object v0, p0, Lcom/bumptech/glide/e;->g:Lcom/bumptech/glide/f/a;

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/bumptech/glide/e;->g:Lcom/bumptech/glide/f/a;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/f/a;->a(Lcom/bumptech/glide/load/e;)V

    .line 211
    :cond_0
    return-object p0
.end method

.method public a(Ljava/lang/Object;)Lcom/bumptech/glide/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModelType;)",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 606
    iput-object p1, p0, Lcom/bumptech/glide/e;->h:Ljava/lang/Object;

    .line 607
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/e;->j:Z

    .line 608
    return-object p0
.end method

.method public a(Z)Lcom/bumptech/glide/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 548
    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/bumptech/glide/e;->t:Z

    .line 550
    return-object p0

    .line 548
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public varargs a([Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/bumptech/glide/load/g",
            "<TResourceType;>;)",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 322
    iput-boolean v1, p0, Lcom/bumptech/glide/e;->z:Z

    .line 323
    array-length v0, p1

    if-ne v0, v1, :cond_0

    .line 324
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iput-object v0, p0, Lcom/bumptech/glide/e;->y:Lcom/bumptech/glide/load/g;

    .line 329
    :goto_0
    return-object p0

    .line 326
    :cond_0
    new-instance v0, Lcom/bumptech/glide/load/d;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/load/d;-><init>([Lcom/bumptech/glide/load/g;)V

    iput-object v0, p0, Lcom/bumptech/glide/e;->y:Lcom/bumptech/glide/load/g;

    goto :goto_0
.end method

.method public a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            ")",
            "Lcom/bumptech/glide/g/b/k",
            "<TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 676
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 677
    if-nez p1, :cond_0

    .line 678
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You must pass in a non null View"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 681
    :cond_0
    iget-boolean v0, p0, Lcom/bumptech/glide/e;->z:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 682
    sget-object v0, Lcom/bumptech/glide/f;->a:[I

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 697
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/bumptech/glide/e;->d:Ljava/lang/Class;

    .line 3017
    const-class v1, Lcom/bumptech/glide/load/resource/a/b;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3018
    new-instance v0, Lcom/bumptech/glide/g/b/d;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/g/b/d;-><init>(Landroid/widget/ImageView;)V

    .line 697
    :goto_1
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    move-result-object v0

    return-object v0

    .line 684
    :pswitch_0
    invoke-virtual {p0}, Lcom/bumptech/glide/e;->c()V

    goto :goto_0

    .line 689
    :pswitch_1
    invoke-virtual {p0}, Lcom/bumptech/glide/e;->b()V

    goto :goto_0

    .line 3019
    :cond_2
    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 3020
    new-instance v0, Lcom/bumptech/glide/g/b/b;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/g/b/b;-><init>(Landroid/widget/ImageView;)V

    goto :goto_1

    .line 3021
    :cond_3
    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 3022
    new-instance v0, Lcom/bumptech/glide/g/b/c;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/g/b/c;-><init>(Landroid/widget/ImageView;)V

    goto :goto_1

    .line 3024
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unhandled class: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", try .as*(Class).transcode(ResourceTranscoder)"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 682
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Lcom/bumptech/glide/g/b/k",
            "<TTranscodeType;>;>(TY;)TY;"
        }
    .end annotation

    .prologue
    .line 642
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 643
    if-nez p1, :cond_0

    .line 644
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You must pass in a non null Target"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 646
    :cond_0
    iget-boolean v0, p0, Lcom/bumptech/glide/e;->j:Z

    if-nez v0, :cond_1

    .line 647
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You must first set a model (try #load())"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 650
    :cond_1
    invoke-interface {p1}, Lcom/bumptech/glide/g/b/k;->e()Lcom/bumptech/glide/g/c;

    move-result-object v0

    .line 652
    if-eqz v0, :cond_2

    .line 653
    invoke-interface {v0}, Lcom/bumptech/glide/g/c;->c()V

    .line 654
    iget-object v1, p0, Lcom/bumptech/glide/e;->e:Lcom/bumptech/glide/d/p;

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/d/p;->b(Lcom/bumptech/glide/g/c;)V

    .line 655
    invoke-interface {v0}, Lcom/bumptech/glide/g/c;->a()V

    .line 1787
    :cond_2
    iget v0, p0, Lcom/bumptech/glide/e;->s:I

    if-nez v0, :cond_3

    .line 1788
    sget v0, Lcom/bumptech/glide/o;->c:I

    iput v0, p0, Lcom/bumptech/glide/e;->s:I

    .line 1790
    :cond_3
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/g/b/k;Lcom/bumptech/glide/g/g;)Lcom/bumptech/glide/g/c;

    move-result-object v0

    .line 659
    invoke-interface {p1, v0}, Lcom/bumptech/glide/g/b/k;->a(Lcom/bumptech/glide/g/c;)V

    .line 660
    iget-object v1, p0, Lcom/bumptech/glide/e;->f:Lcom/bumptech/glide/d/i;

    invoke-interface {v1, p1}, Lcom/bumptech/glide/d/i;->a(Lcom/bumptech/glide/d/j;)V

    .line 661
    iget-object v1, p0, Lcom/bumptech/glide/e;->e:Lcom/bumptech/glide/d/p;

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/d/p;->a(Lcom/bumptech/glide/g/c;)V

    .line 663
    return-object p1
.end method

.method public b(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/e;",
            ")",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 271
    iput-object p1, p0, Lcom/bumptech/glide/e;->x:Lcom/bumptech/glide/load/b/e;

    .line 273
    return-object p0
.end method

.method b()V
    .locals 0

    .prologue
    .line 772
    return-void
.end method

.method c()V
    .locals 0

    .prologue
    .line 768
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 49
    invoke-virtual {p0}, Lcom/bumptech/glide/e;->d()Lcom/bumptech/glide/e;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/bumptech/glide/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 624
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/e;

    .line 626
    iget-object v1, p0, Lcom/bumptech/glide/e;->g:Lcom/bumptech/glide/f/a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/e;->g:Lcom/bumptech/glide/f/a;

    invoke-virtual {v1}, Lcom/bumptech/glide/f/a;->g()Lcom/bumptech/glide/f/a;

    move-result-object v1

    :goto_0
    iput-object v1, v0, Lcom/bumptech/glide/e;->g:Lcom/bumptech/glide/f/a;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 627
    return-object v0

    .line 626
    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 628
    :catch_0
    move-exception v0

    .line 629
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public e()Lcom/bumptech/glide/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/e",
            "<TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 367
    invoke-static {}, Lcom/bumptech/glide/g/a/g;->a()Lcom/bumptech/glide/g/a/f;

    move-result-object v0

    .line 368
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/g/a/f;)Lcom/bumptech/glide/e;

    move-result-object v0

    return-object v0
.end method
