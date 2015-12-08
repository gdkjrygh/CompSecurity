.class public final Lcom/google/android/gms/internal/dh;
.super Ljava/lang/Object;


# instance fields
.field public final errorCode:I

.field public final nA:Lcom/google/android/gms/internal/bl;

.field public final ne:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final nf:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final ni:J

.field public final nx:Lcom/google/android/gms/internal/bi;

.field public final ny:Lcom/google/android/gms/internal/br;

.field public final nz:Ljava/lang/String;

.field public final oj:Lcom/google/android/gms/internal/dz;

.field public final orientation:I

.field public final pg:Lcom/google/android/gms/internal/ah;

.field public final pj:Ljava/lang/String;

.field public final pn:J

.field public final po:Z

.field public final pp:J

.field public final pq:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final pt:Ljava/lang/String;

.field public final qs:Lorg/json/JSONObject;

.field public final qt:Lcom/google/android/gms/internal/bj;

.field public final qu:Lcom/google/android/gms/internal/ak;

.field public final qv:J

.field public final qw:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ah;Lcom/google/android/gms/internal/dz;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/bi;Lcom/google/android/gms/internal/br;Ljava/lang/String;Lcom/google/android/gms/internal/bj;Lcom/google/android/gms/internal/bl;JLcom/google/android/gms/internal/ak;JJJLjava/lang/String;Lorg/json/JSONObject;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ah;",
            "Lcom/google/android/gms/internal/dz;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;IJ",
            "Ljava/lang/String;",
            "Z",
            "Lcom/google/android/gms/internal/bi;",
            "Lcom/google/android/gms/internal/br;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/bj;",
            "Lcom/google/android/gms/internal/bl;",
            "J",
            "Lcom/google/android/gms/internal/ak;",
            "JJJ",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/dh;->pg:Lcom/google/android/gms/internal/ah;

    iput-object p2, p0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    if-eqz p3, :cond_0

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/internal/dh;->ne:Ljava/util/List;

    iput p4, p0, Lcom/google/android/gms/internal/dh;->errorCode:I

    if-eqz p5, :cond_1

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Lcom/google/android/gms/internal/dh;->nf:Ljava/util/List;

    if-eqz p6, :cond_2

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_2
    iput-object v2, p0, Lcom/google/android/gms/internal/dh;->pq:Ljava/util/List;

    iput p7, p0, Lcom/google/android/gms/internal/dh;->orientation:I

    iput-wide p8, p0, Lcom/google/android/gms/internal/dh;->ni:J

    iput-object p10, p0, Lcom/google/android/gms/internal/dh;->pj:Ljava/lang/String;

    iput-boolean p11, p0, Lcom/google/android/gms/internal/dh;->po:Z

    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/google/android/gms/internal/dh;->nx:Lcom/google/android/gms/internal/bi;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/internal/dh;->ny:Lcom/google/android/gms/internal/br;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/internal/dh;->nz:Ljava/lang/String;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/internal/dh;->nA:Lcom/google/android/gms/internal/bl;

    move-wide/from16 v0, p17

    iput-wide v0, p0, Lcom/google/android/gms/internal/dh;->pp:J

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/internal/dh;->qu:Lcom/google/android/gms/internal/ak;

    move-wide/from16 v0, p20

    iput-wide v0, p0, Lcom/google/android/gms/internal/dh;->pn:J

    move-wide/from16 v0, p22

    iput-wide v0, p0, Lcom/google/android/gms/internal/dh;->qv:J

    move-wide/from16 v0, p24

    iput-wide v0, p0, Lcom/google/android/gms/internal/dh;->qw:J

    move-object/from16 v0, p26

    iput-object v0, p0, Lcom/google/android/gms/internal/dh;->pt:Ljava/lang/String;

    move-object/from16 v0, p27

    iput-object v0, p0, Lcom/google/android/gms/internal/dh;->qs:Lorg/json/JSONObject;

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
