.class public final Lcom/kik/view/adapters/au;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"

# interfaces
.implements Lcom/kik/view/adapters/ar$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/au$1;,
        Lcom/kik/view/adapters/au$b;,
        Lcom/kik/view/adapters/au$a;
    }
.end annotation


# static fields
.field private static final e:Landroid/os/Handler;


# instance fields
.field private A:Lcom/kik/view/adapters/au$b;

.field private B:Ljava/util/HashSet;

.field private C:Ljava/util/HashSet;

.field private final D:Lkik/android/e/f;

.field private E:Ljava/util/HashSet;

.field private F:Ljava/util/HashSet;

.field private G:Z

.field private final a:Landroid/view/LayoutInflater;

.field private b:Z

.field private c:Z

.field private final d:I

.field private f:I

.field private final g:Ljava/util/Vector;

.field private final h:Landroid/view/View$OnClickListener;

.field private final i:Landroid/view/View$OnClickListener;

.field private final j:Ljava/util/ArrayList;

.field private final k:Lkik/a/e/r;

.field private final l:Lcom/kik/view/adapters/be;

.field private final m:Lcom/kik/view/adapters/e;

.field private final n:Lcom/kik/view/adapters/az;

.field private final o:Lcom/kik/view/adapters/n;

.field private final p:Lcom/kik/view/adapters/m;

.field private final q:Lcom/kik/view/adapters/h;

.field private final r:Lcom/kik/view/adapters/z;

.field private final s:Lcom/kik/view/adapters/ac;

.field private final t:Lcom/kik/view/adapters/i;

.field private final u:Lcom/kik/view/adapters/w;

.field private final v:Lcom/kik/view/adapters/ad;

.field private final w:Lcom/kik/android/a;

.field private final x:Lkik/android/chat/b/d;

.field private final y:Lcom/kik/view/adapters/af;

.field private z:Lkik/android/util/bw$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 66
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    sput-object v0, Lcom/kik/view/adapters/au;->e:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/util/Vector;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkik/android/util/bw$a;Ljava/util/ArrayList;Lkik/a/e/r;Lcom/kik/cache/ad;Lkik/android/e/f;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V
    .locals 18

    .prologue
    .line 105
    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v3, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 43
    const/4 v3, 0x0

    move-object/from16 v0, p0

    iput-boolean v3, v0, Lcom/kik/view/adapters/au;->b:Z

    .line 44
    const/4 v3, 0x0

    move-object/from16 v0, p0

    iput-boolean v3, v0, Lcom/kik/view/adapters/au;->c:Z

    .line 64
    invoke-static {}, Lcom/kik/view/adapters/au$a;->values()[Lcom/kik/view/adapters/au$a;

    move-result-object v3

    array-length v3, v3

    move-object/from16 v0, p0

    iput v3, v0, Lcom/kik/view/adapters/au;->d:I

    .line 92
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->B:Ljava/util/HashSet;

    .line 93
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->C:Ljava/util/HashSet;

    .line 95
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->E:Ljava/util/HashSet;

    .line 96
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->F:Ljava/util/HashSet;

    .line 98
    const/4 v3, 0x1

    move-object/from16 v0, p0

    iput-boolean v3, v0, Lcom/kik/view/adapters/au;->G:Z

    .line 106
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lcom/kik/view/adapters/au;->f:I

    .line 107
    move-object/from16 v0, p8

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kik/view/adapters/au;->k:Lkik/a/e/r;

    .line 108
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    .line 109
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kik/view/adapters/au;->g:Ljava/util/Vector;

    .line 110
    move-object/from16 v0, p4

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    .line 111
    move-object/from16 v0, p6

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kik/view/adapters/au;->z:Lkik/android/util/bw$a;

    .line 112
    move-object/from16 v0, p11

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    .line 113
    move-object/from16 v0, p14

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kik/view/adapters/au;->x:Lkik/android/chat/b/d;

    .line 115
    move-object/from16 v0, p7

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kik/view/adapters/au;->j:Ljava/util/ArrayList;

    .line 116
    move-object/from16 v0, p5

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kik/view/adapters/au;->i:Landroid/view/View$OnClickListener;

    .line 117
    move-object/from16 v0, p10

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kik/view/adapters/au;->D:Lkik/android/e/f;

    .line 119
    new-instance v17, Lkik/android/i/b;

    invoke-direct/range {v17 .. v17}, Lkik/android/i/b;-><init>()V

    .line 120
    new-instance v3, Lcom/kik/view/adapters/aj;

    invoke-direct {v3}, Lcom/kik/view/adapters/aj;-><init>()V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->y:Lcom/kik/view/adapters/af;

    .line 122
    new-instance v3, Lcom/kik/view/adapters/e;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/view/adapters/au;->z:Lkik/android/util/bw$a;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/view/adapters/au;->D:Lkik/android/e/f;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    move-object/from16 v5, p1

    move-object/from16 v8, p0

    move-object/from16 v9, p9

    move-object/from16 v12, p12

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    invoke-direct/range {v3 .. v14}, Lcom/kik/view/adapters/e;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lkik/android/util/bw$a;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lkik/android/e/f;Lcom/kik/android/a;Lkik/a/e/n;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->m:Lcom/kik/view/adapters/e;

    .line 123
    new-instance v3, Lcom/kik/view/adapters/be;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/view/adapters/au;->z:Lkik/android/util/bw$a;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    move-object/from16 v5, p1

    move-object/from16 v8, p0

    move-object/from16 v9, p9

    move-object/from16 v11, p12

    move-object/from16 v12, p15

    invoke-direct/range {v3 .. v12}, Lcom/kik/view/adapters/be;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lkik/android/util/bw$a;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lcom/kik/e/a;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->l:Lcom/kik/view/adapters/be;

    .line 124
    new-instance v3, Lcom/kik/view/adapters/az;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/view/adapters/au;->z:Lkik/android/util/bw$a;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    move-object/from16 v5, p1

    move-object/from16 v8, p0

    move-object/from16 v9, p9

    move-object/from16 v11, p12

    move-object/from16 v12, p14

    move-object/from16 v13, p15

    invoke-direct/range {v3 .. v13}, Lcom/kik/view/adapters/az;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lkik/android/util/bw$a;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->n:Lcom/kik/view/adapters/az;

    .line 125
    new-instance v3, Lcom/kik/view/adapters/l;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/view/adapters/au;->i:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    move-object/from16 v5, p1

    move-object/from16 v8, p0

    move-object/from16 v9, p9

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    invoke-direct/range {v3 .. v14}, Lcom/kik/view/adapters/l;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->o:Lcom/kik/view/adapters/n;

    .line 126
    new-instance v3, Lcom/kik/view/adapters/h;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/view/adapters/au;->i:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    move-object/from16 v5, p1

    move-object/from16 v8, p0

    move-object/from16 v9, p9

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    invoke-direct/range {v3 .. v14}, Lcom/kik/view/adapters/h;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->q:Lcom/kik/view/adapters/h;

    .line 127
    new-instance v3, Lcom/kik/view/adapters/z;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/view/adapters/au;->i:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    move-object/from16 v5, p1

    move-object/from16 v8, p0

    move-object/from16 v9, p9

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    invoke-direct/range {v3 .. v14}, Lcom/kik/view/adapters/z;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->r:Lcom/kik/view/adapters/z;

    .line 128
    new-instance v3, Lcom/kik/view/adapters/m;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/view/adapters/au;->i:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    move-object/from16 v5, p1

    move-object/from16 v8, p0

    move-object/from16 v9, p9

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    invoke-direct/range {v3 .. v14}, Lcom/kik/view/adapters/m;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->p:Lcom/kik/view/adapters/m;

    .line 129
    new-instance v3, Lcom/kik/view/adapters/ac;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/view/adapters/au;->i:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/kik/view/adapters/au;->y:Lcom/kik/view/adapters/af;

    move-object/from16 v5, p1

    move-object/from16 v8, p0

    move-object/from16 v9, p9

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p15

    move-object/from16 v14, v17

    invoke-direct/range {v3 .. v15}, Lcom/kik/view/adapters/ac;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lcom/kik/e/a;Lkik/android/i/b;Lcom/kik/view/adapters/af;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->s:Lcom/kik/view/adapters/ac;

    .line 130
    new-instance v3, Lcom/kik/view/adapters/i;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/view/adapters/au;->i:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kik/view/adapters/au;->y:Lcom/kik/view/adapters/af;

    move-object/from16 v16, v0

    move-object/from16 v5, p1

    move-object/from16 v8, p0

    move-object/from16 v9, p9

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    move-object/from16 v15, v17

    invoke-direct/range {v3 .. v16}, Lcom/kik/view/adapters/i;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;Lkik/android/i/b;Lcom/kik/view/adapters/af;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->t:Lcom/kik/view/adapters/i;

    .line 131
    new-instance v3, Lcom/kik/view/adapters/ad;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/view/adapters/au;->i:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    move-object/from16 v5, p1

    move-object/from16 v8, p0

    move-object/from16 v9, p9

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    invoke-direct/range {v3 .. v14}, Lcom/kik/view/adapters/ad;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->v:Lcom/kik/view/adapters/ad;

    .line 132
    new-instance v3, Lcom/kik/view/adapters/w;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->a:Landroid/view/LayoutInflater;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/view/adapters/au;->h:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/kik/view/adapters/au;->w:Lcom/kik/android/a;

    move-object/from16 v5, p1

    move-object/from16 v7, p0

    move-object/from16 v8, p9

    move-object/from16 v10, p12

    move-object/from16 v11, p15

    invoke-direct/range {v3 .. v11}, Lcom/kik/view/adapters/w;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lcom/kik/e/a;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kik/view/adapters/au;->u:Lcom/kik/view/adapters/w;

    .line 135
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->q:Lcom/kik/view/adapters/h;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->B:Ljava/util/HashSet;

    invoke-virtual {v3, v4}, Lcom/kik/view/adapters/h;->a(Ljava/util/HashSet;)V

    .line 136
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->q:Lcom/kik/view/adapters/h;

    invoke-virtual {v3}, Lcom/kik/view/adapters/h;->b()V

    .line 137
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->o:Lcom/kik/view/adapters/n;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->C:Ljava/util/HashSet;

    invoke-virtual {v3, v4}, Lcom/kik/view/adapters/n;->a(Ljava/util/HashSet;)V

    .line 138
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->o:Lcom/kik/view/adapters/n;

    invoke-virtual {v3}, Lcom/kik/view/adapters/n;->b()V

    .line 139
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->r:Lcom/kik/view/adapters/z;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->E:Ljava/util/HashSet;

    invoke-virtual {v3, v4}, Lcom/kik/view/adapters/z;->a(Ljava/util/HashSet;)V

    .line 140
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->r:Lcom/kik/view/adapters/z;

    invoke-virtual {v3}, Lcom/kik/view/adapters/z;->b()V

    .line 141
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->s:Lcom/kik/view/adapters/ac;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->E:Ljava/util/HashSet;

    invoke-virtual {v3, v4}, Lcom/kik/view/adapters/ac;->a(Ljava/util/HashSet;)V

    .line 142
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->s:Lcom/kik/view/adapters/ac;

    invoke-virtual {v3}, Lcom/kik/view/adapters/ac;->b()V

    .line 143
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->t:Lcom/kik/view/adapters/i;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->E:Ljava/util/HashSet;

    invoke-virtual {v3, v4}, Lcom/kik/view/adapters/i;->a(Ljava/util/HashSet;)V

    .line 144
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->t:Lcom/kik/view/adapters/i;

    invoke-virtual {v3}, Lcom/kik/view/adapters/i;->b()V

    .line 145
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->p:Lcom/kik/view/adapters/m;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->F:Ljava/util/HashSet;

    invoke-virtual {v3, v4}, Lcom/kik/view/adapters/m;->a(Ljava/util/HashSet;)V

    .line 146
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->p:Lcom/kik/view/adapters/m;

    invoke-virtual {v3}, Lcom/kik/view/adapters/m;->b()V

    .line 147
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->v:Lcom/kik/view/adapters/ad;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/view/adapters/au;->B:Ljava/util/HashSet;

    invoke-virtual {v3, v4}, Lcom/kik/view/adapters/ad;->a(Ljava/util/HashSet;)V

    .line 148
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/view/adapters/au;->v:Lcom/kik/view/adapters/ad;

    invoke-virtual {v3}, Lcom/kik/view/adapters/ad;->b()V

    .line 149
    return-void
.end method

.method static synthetic a(Lcom/kik/view/adapters/au;)Lcom/kik/view/adapters/au$b;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/kik/view/adapters/au;->A:Lcom/kik/view/adapters/au$b;

    return-object v0
.end method

.method private c(I)Lcom/kik/view/adapters/ar;
    .locals 3

    .prologue
    .line 221
    invoke-direct {p0, p1}, Lcom/kik/view/adapters/au;->d(I)Lcom/kik/view/adapters/au$a;

    move-result-object v1

    .line 222
    const/4 v0, 0x0

    .line 224
    sget-object v2, Lcom/kik/view/adapters/au$1;->a:[I

    invoke-virtual {v1}, Lcom/kik/view/adapters/au$a;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    .line 260
    :goto_0
    return-object v0

    .line 226
    :pswitch_0
    iget-object v0, p0, Lcom/kik/view/adapters/au;->n:Lcom/kik/view/adapters/az;

    goto :goto_0

    .line 229
    :pswitch_1
    iget-object v0, p0, Lcom/kik/view/adapters/au;->m:Lcom/kik/view/adapters/e;

    goto :goto_0

    .line 232
    :pswitch_2
    iget-object v0, p0, Lcom/kik/view/adapters/au;->l:Lcom/kik/view/adapters/be;

    goto :goto_0

    .line 235
    :pswitch_3
    iget-object v0, p0, Lcom/kik/view/adapters/au;->o:Lcom/kik/view/adapters/n;

    goto :goto_0

    .line 238
    :pswitch_4
    iget-object v0, p0, Lcom/kik/view/adapters/au;->q:Lcom/kik/view/adapters/h;

    goto :goto_0

    .line 241
    :pswitch_5
    iget-object v0, p0, Lcom/kik/view/adapters/au;->u:Lcom/kik/view/adapters/w;

    goto :goto_0

    .line 244
    :pswitch_6
    iget-object v0, p0, Lcom/kik/view/adapters/au;->r:Lcom/kik/view/adapters/z;

    goto :goto_0

    .line 247
    :pswitch_7
    iget-object v0, p0, Lcom/kik/view/adapters/au;->s:Lcom/kik/view/adapters/ac;

    goto :goto_0

    .line 250
    :pswitch_8
    iget-object v0, p0, Lcom/kik/view/adapters/au;->t:Lcom/kik/view/adapters/i;

    goto :goto_0

    .line 253
    :pswitch_9
    iget-object v0, p0, Lcom/kik/view/adapters/au;->p:Lcom/kik/view/adapters/m;

    goto :goto_0

    .line 256
    :pswitch_a
    iget-object v0, p0, Lcom/kik/view/adapters/au;->v:Lcom/kik/view/adapters/ad;

    goto :goto_0

    .line 224
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method private d(I)Lcom/kik/view/adapters/au$a;
    .locals 3

    .prologue
    .line 283
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/au;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 284
    const-class v1, Lkik/a/d/a/l;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    if-nez v1, :cond_0

    const-class v1, Lkik/a/d/a/m;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    if-nez v1, :cond_0

    const-class v1, Lkik/a/d/a/b;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 287
    :cond_0
    sget-object v0, Lcom/kik/view/adapters/au$a;->a:Lcom/kik/view/adapters/au$a;

    .line 332
    :goto_0
    return-object v0

    .line 289
    :cond_1
    invoke-virtual {v0}, Lkik/a/d/s;->d()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/kik/view/adapters/au;->g:Ljava/util/Vector;

    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Vector;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 290
    sget-object v0, Lcom/kik/view/adapters/au$a;->d:Lcom/kik/view/adapters/au$a;

    goto :goto_0

    .line 292
    :cond_2
    const-class v1, Lkik/a/d/a/a;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    if-eqz v1, :cond_c

    .line 293
    const-class v1, Lkik/a/d/a/a;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 294
    invoke-static {v0}, Lkik/android/util/t;->a(Lkik/a/d/a/a;)Lkik/a/d/a/a$b;

    move-result-object v1

    sget-object v2, Lkik/a/d/a/a$b;->c:Lkik/a/d/a/a$b;

    invoke-virtual {v1, v2}, Lkik/a/d/a/a$b;->a(Lkik/a/d/a/a$b;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 295
    sget-object v0, Lcom/kik/view/adapters/au$a;->c:Lcom/kik/view/adapters/au$a;

    goto :goto_0

    .line 297
    :cond_3
    invoke-static {v0}, Lkik/android/util/t;->a(Lkik/a/d/a/a;)Lkik/a/d/a/a$b;

    move-result-object v1

    sget-object v2, Lkik/a/d/a/a$b;->f:Lkik/a/d/a/a$b;

    invoke-virtual {v1, v2}, Lkik/a/d/a/a$b;->a(Lkik/a/d/a/a$b;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 298
    sget-object v0, Lcom/kik/view/adapters/au$a;->j:Lcom/kik/view/adapters/au$a;

    goto :goto_0

    .line 300
    :cond_4
    invoke-static {v0}, Lkik/android/util/t;->a(Lkik/a/d/a/a;)Lkik/a/d/a/a$b;

    move-result-object v1

    sget-object v2, Lkik/a/d/a/a$b;->d:Lkik/a/d/a/a$b;

    invoke-virtual {v1, v2}, Lkik/a/d/a/a$b;->a(Lkik/a/d/a/a$b;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 301
    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/t;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 304
    sget-object v0, Lcom/kik/view/adapters/au$a;->g:Lcom/kik/view/adapters/au$a;

    goto :goto_0

    .line 307
    :cond_5
    sget-object v0, Lcom/kik/view/adapters/au$a;->e:Lcom/kik/view/adapters/au$a;

    goto :goto_0

    .line 310
    :cond_6
    invoke-static {v0}, Lkik/android/util/t;->a(Lkik/a/d/a/a;)Lkik/a/d/a/a$b;

    move-result-object v1

    sget-object v2, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    invoke-virtual {v1, v2}, Lkik/a/d/a/a$b;->a(Lkik/a/d/a/a$b;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 311
    const-string v1, "com.kik.ext.gif"

    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {v0}, Lkik/android/gifs/a;->a(Lkik/a/d/a/a;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 312
    sget-object v0, Lcom/kik/view/adapters/au$a;->k:Lcom/kik/view/adapters/au$a;

    goto :goto_0

    .line 314
    :cond_7
    invoke-static {v0}, Lkik/android/util/ae;->b(Lkik/a/d/a/a;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/t;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 315
    :cond_8
    sget-object v0, Lcom/kik/view/adapters/au$a;->h:Lcom/kik/view/adapters/au$a;

    goto/16 :goto_0

    .line 317
    :cond_9
    sget-object v0, Lcom/kik/view/adapters/au$a;->h:Lcom/kik/view/adapters/au$a;

    goto/16 :goto_0

    .line 320
    :cond_a
    const-string v1, "png-preview"

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 321
    sget-object v0, Lcom/kik/view/adapters/au$a;->f:Lcom/kik/view/adapters/au$a;

    goto/16 :goto_0

    .line 324
    :cond_b
    sget-object v0, Lcom/kik/view/adapters/au$a;->e:Lcom/kik/view/adapters/au$a;

    goto/16 :goto_0

    .line 328
    :cond_c
    const-class v1, Lkik/a/d/a/d;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 329
    sget-object v0, Lcom/kik/view/adapters/au$a;->a:Lcom/kik/view/adapters/au$a;

    goto/16 :goto_0

    .line 332
    :cond_d
    sget-object v0, Lcom/kik/view/adapters/au$a;->b:Lcom/kik/view/adapters/au$a;

    goto/16 :goto_0
.end method


# virtual methods
.method public final a(Lkik/a/d/s;)Lkik/a/d/k;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 355
    if-nez p1, :cond_0

    .line 356
    const/4 v0, 0x0

    .line 363
    :goto_0
    return-object v0

    .line 358
    :cond_0
    const-class v0, Lkik/a/d/a/l;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/l;

    .line 359
    if-eqz v0, :cond_1

    .line 361
    iget-object v1, p0, Lcom/kik/view/adapters/au;->k:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/a/l;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    goto :goto_0

    .line 363
    :cond_1
    iget-object v0, p0, Lcom/kik/view/adapters/au;->k:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 344
    iget-object v0, p0, Lcom/kik/view/adapters/au;->y:Lcom/kik/view/adapters/af;

    invoke-interface {v0}, Lcom/kik/view/adapters/af;->a()V

    .line 345
    return-void
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 394
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lcom/kik/view/adapters/au;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 395
    invoke-direct {p0, p1}, Lcom/kik/view/adapters/au;->c(I)Lcom/kik/view/adapters/ar;

    move-result-object v0

    .line 396
    if-eqz v0, :cond_0

    .line 397
    invoke-virtual {v0, p1}, Lcom/kik/view/adapters/ar;->b(I)V

    .line 400
    :cond_0
    return-void
.end method

.method public final a(Lcom/kik/view/adapters/au$b;)V
    .locals 0

    .prologue
    .line 349
    iput-object p1, p0, Lcom/kik/view/adapters/au;->A:Lcom/kik/view/adapters/au$b;

    .line 350
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 47
    iput-boolean p1, p0, Lcom/kik/view/adapters/au;->c:Z

    .line 48
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 433
    iget-object v0, p0, Lcom/kik/view/adapters/au;->s:Lcom/kik/view/adapters/ac;

    invoke-virtual {v0}, Lcom/kik/view/adapters/ac;->c()V

    .line 434
    iget-object v0, p0, Lcom/kik/view/adapters/au;->t:Lcom/kik/view/adapters/i;

    invoke-virtual {v0}, Lcom/kik/view/adapters/i;->c()V

    .line 435
    return-void
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 407
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lcom/kik/view/adapters/au;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 408
    invoke-direct {p0, p1}, Lcom/kik/view/adapters/au;->c(I)Lcom/kik/view/adapters/ar;

    move-result-object v0

    .line 409
    if-eqz v0, :cond_0

    .line 410
    invoke-virtual {v0, p1}, Lcom/kik/view/adapters/ar;->a(I)V

    .line 413
    :cond_0
    return-void
.end method

.method public final b(Lkik/a/d/s;)V
    .locals 1

    .prologue
    .line 376
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/au;->getPosition(Ljava/lang/Object;)I

    move-result v0

    .line 377
    invoke-virtual {p0, v0}, Lcom/kik/view/adapters/au;->a(I)V

    .line 378
    return-void
.end method

.method public final c(Lkik/a/d/s;)V
    .locals 2

    .prologue
    .line 417
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/au;->getPosition(Ljava/lang/Object;)I

    move-result v0

    .line 418
    if-ltz v0, :cond_0

    .line 419
    invoke-direct {p0, v0}, Lcom/kik/view/adapters/au;->c(I)Lcom/kik/view/adapters/ar;

    move-result-object v1

    .line 420
    if-eqz v1, :cond_0

    .line 421
    invoke-virtual {v1, v0}, Lcom/kik/view/adapters/ar;->c(I)V

    .line 424
    :cond_0
    return-void
.end method

.method public final getItemViewType(I)I
    .locals 1

    .prologue
    .line 278
    invoke-direct {p0, p1}, Lcom/kik/view/adapters/au;->d(I)Lcom/kik/view/adapters/au$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/view/adapters/au$a;->ordinal()I

    move-result v0

    return v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 154
    invoke-direct {p0, p1}, Lcom/kik/view/adapters/au;->c(I)Lcom/kik/view/adapters/ar;

    move-result-object v0

    .line 156
    if-nez v0, :cond_0

    .line 157
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid view type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/kik/view/adapters/au;->d(I)Lcom/kik/view/adapters/au$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 160
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/au;->getItem(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkik/a/d/s;

    .line 161
    instance-of v1, v0, Lcom/kik/view/adapters/aq;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Lcom/kik/view/adapters/aq;

    invoke-interface {v1, v4}, Lcom/kik/view/adapters/aq;->a(Lkik/a/d/s;)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, v0

    .line 164
    check-cast v1, Lcom/kik/view/adapters/aq;

    .line 165
    new-instance v6, Lcom/kik/view/adapters/av;

    invoke-direct {v6, p0, v1, v4, p1}, Lcom/kik/view/adapters/av;-><init>(Lcom/kik/view/adapters/au;Lcom/kik/view/adapters/aq;Lkik/a/d/s;I)V

    .line 203
    :goto_0
    iget v1, p0, Lcom/kik/view/adapters/au;->f:I

    invoke-virtual {p0}, Lcom/kik/view/adapters/au;->getCount()I

    move-result v3

    if-ge v1, v3, :cond_3

    move v1, v5

    .line 204
    :goto_1
    if-eqz v1, :cond_1

    .line 205
    iget v1, p0, Lcom/kik/view/adapters/au;->f:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/kik/view/adapters/au;->f:I

    .line 207
    sget-object v1, Lcom/kik/view/adapters/au;->e:Landroid/os/Handler;

    new-instance v3, Lcom/kik/view/adapters/ax;

    invoke-direct {v3, p0, v4}, Lcom/kik/view/adapters/ax;-><init>(Lcom/kik/view/adapters/au;Lkik/a/d/s;)V

    const-wide/16 v8, 0x12c

    invoke-virtual {v1, v3, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 216
    :cond_1
    iget-object v1, p0, Lcom/kik/view/adapters/au;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_4

    iget-object v1, p0, Lcom/kik/view/adapters/au;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_2
    move v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v6}, Lcom/kik/view/adapters/ar;->a(ILandroid/view/View;Landroid/view/ViewGroup;Lkik/a/d/s;ZLcom/kik/view/adapters/au$b;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 183
    :cond_2
    new-instance v6, Lcom/kik/view/adapters/aw;

    invoke-direct {v6, p0, p1}, Lcom/kik/view/adapters/aw;-><init>(Lcom/kik/view/adapters/au;I)V

    goto :goto_0

    :cond_3
    move v1, v2

    .line 203
    goto :goto_1

    :cond_4
    move v5, v2

    .line 216
    goto :goto_2
.end method

.method public final getViewTypeCount()I
    .locals 1

    .prologue
    .line 339
    iget v0, p0, Lcom/kik/view/adapters/au;->d:I

    return v0
.end method

.method public final hasStableIds()Z
    .locals 1

    .prologue
    .line 272
    const/4 v0, 0x1

    return v0
.end method

.method public final notifyDataSetChanged()V
    .locals 1

    .prologue
    .line 444
    iget-boolean v0, p0, Lcom/kik/view/adapters/au;->c:Z

    if-nez v0, :cond_0

    .line 445
    invoke-super {p0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 447
    :cond_0
    return-void
.end method
