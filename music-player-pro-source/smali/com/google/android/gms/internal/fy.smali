.class public final Lcom/google/android/gms/internal/fy;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/fy$a;
    }
.end annotation


# instance fields
.field public final errorCode:I

.field public final orientation:I

.field public final qA:J

.field public final qP:Lcom/google/android/gms/internal/cq;

.field public final qQ:Lcom/google/android/gms/internal/cz;

.field public final qR:Ljava/lang/String;

.field public final qS:Lcom/google/android/gms/internal/ct;

.field public final qw:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final qx:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final se:Lcom/google/android/gms/internal/gu;

.field public final tL:Lcom/google/android/gms/internal/av;

.field public final tO:Ljava/lang/String;

.field public final tV:J

.field public final tW:Z

.field public final tX:J

.field public final tY:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final ub:Ljava/lang/String;

.field public final vD:Lorg/json/JSONObject;

.field public final vE:Lcom/google/android/gms/internal/cr;

.field public final vF:Lcom/google/android/gms/internal/ay;

.field public final vG:J

.field public final vH:J

.field public final vI:Lcom/google/android/gms/internal/bv$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/gu;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/cq;Lcom/google/android/gms/internal/cz;Ljava/lang/String;Lcom/google/android/gms/internal/cr;Lcom/google/android/gms/internal/ct;JLcom/google/android/gms/internal/ay;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/bv$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/av;",
            "Lcom/google/android/gms/internal/gu;",
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
            "Lcom/google/android/gms/internal/cq;",
            "Lcom/google/android/gms/internal/cz;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/cr;",
            "Lcom/google/android/gms/internal/ct;",
            "J",
            "Lcom/google/android/gms/internal/ay;",
            "JJJ",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Lcom/google/android/gms/internal/bv$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/fy;->tL:Lcom/google/android/gms/internal/av;

    iput-object p2, p0, Lcom/google/android/gms/internal/fy;->se:Lcom/google/android/gms/internal/gu;

    if-eqz p3, :cond_0

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/internal/fy;->qw:Ljava/util/List;

    iput p4, p0, Lcom/google/android/gms/internal/fy;->errorCode:I

    if-eqz p5, :cond_1

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Lcom/google/android/gms/internal/fy;->qx:Ljava/util/List;

    if-eqz p6, :cond_2

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_2
    iput-object v2, p0, Lcom/google/android/gms/internal/fy;->tY:Ljava/util/List;

    iput p7, p0, Lcom/google/android/gms/internal/fy;->orientation:I

    iput-wide p8, p0, Lcom/google/android/gms/internal/fy;->qA:J

    iput-object p10, p0, Lcom/google/android/gms/internal/fy;->tO:Ljava/lang/String;

    iput-boolean p11, p0, Lcom/google/android/gms/internal/fy;->tW:Z

    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/google/android/gms/internal/fy;->qP:Lcom/google/android/gms/internal/cq;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/internal/fy;->qQ:Lcom/google/android/gms/internal/cz;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/internal/fy;->qR:Ljava/lang/String;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/internal/fy;->vE:Lcom/google/android/gms/internal/cr;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/internal/fy;->qS:Lcom/google/android/gms/internal/ct;

    move-wide/from16 v0, p17

    iput-wide v0, p0, Lcom/google/android/gms/internal/fy;->tX:J

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/internal/fy;->vF:Lcom/google/android/gms/internal/ay;

    move-wide/from16 v0, p20

    iput-wide v0, p0, Lcom/google/android/gms/internal/fy;->tV:J

    move-wide/from16 v0, p22

    iput-wide v0, p0, Lcom/google/android/gms/internal/fy;->vG:J

    move-wide/from16 v0, p24

    iput-wide v0, p0, Lcom/google/android/gms/internal/fy;->vH:J

    move-object/from16 v0, p26

    iput-object v0, p0, Lcom/google/android/gms/internal/fy;->ub:Ljava/lang/String;

    move-object/from16 v0, p27

    iput-object v0, p0, Lcom/google/android/gms/internal/fy;->vD:Lorg/json/JSONObject;

    move-object/from16 v0, p28

    iput-object v0, p0, Lcom/google/android/gms/internal/fy;->vI:Lcom/google/android/gms/internal/bv$a;

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

.method public constructor <init>(Lcom/google/android/gms/internal/fy$a;Lcom/google/android/gms/internal/gu;Lcom/google/android/gms/internal/cq;Lcom/google/android/gms/internal/cz;Ljava/lang/String;Lcom/google/android/gms/internal/ct;Lcom/google/android/gms/internal/bv$a;)V
    .locals 31

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fy$a;->vJ:Lcom/google/android/gms/internal/fh;

    iget-object v3, v2, Lcom/google/android/gms/internal/fh;->tL:Lcom/google/android/gms/internal/av;

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fy$a;->vK:Lcom/google/android/gms/internal/fj;

    iget-object v5, v2, Lcom/google/android/gms/internal/fj;->qw:Ljava/util/List;

    move-object/from16 v0, p1

    iget v6, v0, Lcom/google/android/gms/internal/fy$a;->errorCode:I

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fy$a;->vK:Lcom/google/android/gms/internal/fj;

    iget-object v7, v2, Lcom/google/android/gms/internal/fj;->qx:Ljava/util/List;

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fy$a;->vK:Lcom/google/android/gms/internal/fj;

    iget-object v8, v2, Lcom/google/android/gms/internal/fj;->tY:Ljava/util/List;

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fy$a;->vK:Lcom/google/android/gms/internal/fj;

    iget v9, v2, Lcom/google/android/gms/internal/fj;->orientation:I

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fy$a;->vK:Lcom/google/android/gms/internal/fj;

    iget-wide v10, v2, Lcom/google/android/gms/internal/fj;->qA:J

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fy$a;->vJ:Lcom/google/android/gms/internal/fh;

    iget-object v12, v2, Lcom/google/android/gms/internal/fh;->tO:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fy$a;->vK:Lcom/google/android/gms/internal/fj;

    iget-boolean v13, v2, Lcom/google/android/gms/internal/fj;->tW:Z

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/internal/fy$a;->vE:Lcom/google/android/gms/internal/cr;

    move-object/from16 v17, v0

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fy$a;->vK:Lcom/google/android/gms/internal/fj;

    iget-wide v0, v2, Lcom/google/android/gms/internal/fj;->tX:J

    move-wide/from16 v19, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/internal/fy$a;->lS:Lcom/google/android/gms/internal/ay;

    move-object/from16 v21, v0

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fy$a;->vK:Lcom/google/android/gms/internal/fj;

    iget-wide v0, v2, Lcom/google/android/gms/internal/fj;->tV:J

    move-wide/from16 v22, v0

    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/google/android/gms/internal/fy$a;->vG:J

    move-wide/from16 v24, v0

    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/google/android/gms/internal/fy$a;->vH:J

    move-wide/from16 v26, v0

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fy$a;->vK:Lcom/google/android/gms/internal/fj;

    iget-object v0, v2, Lcom/google/android/gms/internal/fj;->ub:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/internal/fy$a;->vD:Lorg/json/JSONObject;

    move-object/from16 v29, v0

    move-object/from16 v2, p0

    move-object/from16 v4, p2

    move-object/from16 v14, p3

    move-object/from16 v15, p4

    move-object/from16 v16, p5

    move-object/from16 v18, p6

    move-object/from16 v30, p7

    invoke-direct/range {v2 .. v30}, Lcom/google/android/gms/internal/fy;-><init>(Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/gu;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/cq;Lcom/google/android/gms/internal/cz;Ljava/lang/String;Lcom/google/android/gms/internal/cr;Lcom/google/android/gms/internal/ct;JLcom/google/android/gms/internal/ay;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/bv$a;)V

    return-void
.end method
