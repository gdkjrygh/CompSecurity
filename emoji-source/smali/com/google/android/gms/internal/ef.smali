.class public final Lcom/google/android/gms/internal/ef;
.super Ljava/lang/Object;


# instance fields
.field public final errorCode:I

.field public final nM:Lcom/google/android/gms/internal/bl;

.field public final nN:Lcom/google/android/gms/internal/bu;

.field public final nO:Ljava/lang/String;

.field public final nP:Lcom/google/android/gms/internal/bo;

.field public final nt:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final nu:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final nx:J

.field public final orientation:I

.field public final oy:Lcom/google/android/gms/internal/ex;

.field public final pX:Lcom/google/android/gms/internal/ai;

.field public final qa:Ljava/lang/String;

.field public final qf:J

.field public final qg:Z

.field public final qh:J

.field public final qi:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final ql:Ljava/lang/String;

.field public final rA:Lcom/google/android/gms/internal/al;

.field public final rB:J

.field public final rC:J

.field public final ry:Lorg/json/JSONObject;

.field public final rz:Lcom/google/android/gms/internal/bm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ai;Lcom/google/android/gms/internal/ex;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/bl;Lcom/google/android/gms/internal/bu;Ljava/lang/String;Lcom/google/android/gms/internal/bm;Lcom/google/android/gms/internal/bo;JLcom/google/android/gms/internal/al;JJJLjava/lang/String;Lorg/json/JSONObject;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ai;",
            "Lcom/google/android/gms/internal/ex;",
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
            "Lcom/google/android/gms/internal/bl;",
            "Lcom/google/android/gms/internal/bu;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/bm;",
            "Lcom/google/android/gms/internal/bo;",
            "J",
            "Lcom/google/android/gms/internal/al;",
            "JJJ",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ef;->pX:Lcom/google/android/gms/internal/ai;

    iput-object p2, p0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    if-eqz p3, :cond_0

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/internal/ef;->nt:Ljava/util/List;

    iput p4, p0, Lcom/google/android/gms/internal/ef;->errorCode:I

    if-eqz p5, :cond_1

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Lcom/google/android/gms/internal/ef;->nu:Ljava/util/List;

    if-eqz p6, :cond_2

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_2
    iput-object v2, p0, Lcom/google/android/gms/internal/ef;->qi:Ljava/util/List;

    iput p7, p0, Lcom/google/android/gms/internal/ef;->orientation:I

    iput-wide p8, p0, Lcom/google/android/gms/internal/ef;->nx:J

    iput-object p10, p0, Lcom/google/android/gms/internal/ef;->qa:Ljava/lang/String;

    iput-boolean p11, p0, Lcom/google/android/gms/internal/ef;->qg:Z

    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/google/android/gms/internal/ef;->nM:Lcom/google/android/gms/internal/bl;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/internal/ef;->nN:Lcom/google/android/gms/internal/bu;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/internal/ef;->nO:Ljava/lang/String;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/internal/ef;->nP:Lcom/google/android/gms/internal/bo;

    move-wide/from16 v0, p17

    iput-wide v0, p0, Lcom/google/android/gms/internal/ef;->qh:J

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/internal/ef;->rA:Lcom/google/android/gms/internal/al;

    move-wide/from16 v0, p20

    iput-wide v0, p0, Lcom/google/android/gms/internal/ef;->qf:J

    move-wide/from16 v0, p22

    iput-wide v0, p0, Lcom/google/android/gms/internal/ef;->rB:J

    move-wide/from16 v0, p24

    iput-wide v0, p0, Lcom/google/android/gms/internal/ef;->rC:J

    move-object/from16 v0, p26

    iput-object v0, p0, Lcom/google/android/gms/internal/ef;->ql:Ljava/lang/String;

    move-object/from16 v0, p27

    iput-object v0, p0, Lcom/google/android/gms/internal/ef;->ry:Lorg/json/JSONObject;

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
