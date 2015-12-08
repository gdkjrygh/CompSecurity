.class public final Lcom/google/android/gms/internal/do;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lcom/google/android/gms/internal/z;

.field public final b:Lcom/google/android/gms/internal/em;

.field public final c:Ljava/util/List;

.field public final d:I

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:I

.field public final h:J

.field public final i:Ljava/lang/String;

.field public final j:Z

.field public final k:Lcom/google/android/gms/internal/ap;

.field public final l:Lcom/google/android/gms/internal/bd;

.field public final m:Ljava/lang/String;

.field public final n:Lcom/google/android/gms/internal/aq;

.field public final o:Lcom/google/android/gms/internal/at;

.field public final p:J

.field public final q:Lcom/google/android/gms/internal/ab;

.field public final r:J

.field public final s:J

.field public final t:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/z;Lcom/google/android/gms/internal/em;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/ap;Lcom/google/android/gms/internal/bd;Ljava/lang/String;Lcom/google/android/gms/internal/aq;Lcom/google/android/gms/internal/at;JLcom/google/android/gms/internal/ab;JJJ)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/do;->a:Lcom/google/android/gms/internal/z;

    iput-object p2, p0, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    if-eqz p3, :cond_0

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/internal/do;->c:Ljava/util/List;

    iput p4, p0, Lcom/google/android/gms/internal/do;->d:I

    if-eqz p5, :cond_1

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Lcom/google/android/gms/internal/do;->e:Ljava/util/List;

    if-eqz p6, :cond_2

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_2
    iput-object v2, p0, Lcom/google/android/gms/internal/do;->f:Ljava/util/List;

    iput p7, p0, Lcom/google/android/gms/internal/do;->g:I

    iput-wide p8, p0, Lcom/google/android/gms/internal/do;->h:J

    iput-object p10, p0, Lcom/google/android/gms/internal/do;->i:Ljava/lang/String;

    iput-boolean p11, p0, Lcom/google/android/gms/internal/do;->j:Z

    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/google/android/gms/internal/do;->k:Lcom/google/android/gms/internal/ap;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/internal/do;->l:Lcom/google/android/gms/internal/bd;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/internal/do;->m:Ljava/lang/String;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/internal/do;->o:Lcom/google/android/gms/internal/at;

    move-wide/from16 v0, p17

    iput-wide v0, p0, Lcom/google/android/gms/internal/do;->p:J

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/internal/do;->q:Lcom/google/android/gms/internal/ab;

    move-wide/from16 v0, p20

    iput-wide v0, p0, Lcom/google/android/gms/internal/do;->r:J

    move-wide/from16 v0, p22

    iput-wide v0, p0, Lcom/google/android/gms/internal/do;->s:J

    move-wide/from16 v0, p24

    iput-wide v0, p0, Lcom/google/android/gms/internal/do;->t:J

    return-void

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    goto :goto_2
.end method
