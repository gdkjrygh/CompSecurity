.class public final Lcom/google/android/gms/internal/ce;
.super Ljava/lang/Object;


# instance fields
.field public final eW:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final eX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final errorCode:I

.field public final fU:Lcom/google/android/gms/internal/cq;

.field public final fa:J

.field public final fm:Lcom/google/android/gms/internal/ao;

.field public final fn:Lcom/google/android/gms/internal/ax;

.field public final fo:Ljava/lang/String;

.field public final fp:Lcom/google/android/gms/internal/ar;

.field public final gB:Lcom/google/android/gms/internal/v;

.field public final gE:Ljava/lang/String;

.field public final gH:J

.field public final gI:Z

.field public final gJ:J

.field public final gK:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final hA:Lcom/google/android/gms/internal/ap;

.field public final orientation:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/cq;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/ao;Lcom/google/android/gms/internal/ax;Ljava/lang/String;Lcom/google/android/gms/internal/ap;Lcom/google/android/gms/internal/ar;JJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/v;",
            "Lcom/google/android/gms/internal/cq;",
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
            "Lcom/google/android/gms/internal/ao;",
            "Lcom/google/android/gms/internal/ax;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ap;",
            "Lcom/google/android/gms/internal/ar;",
            "JJ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ce;->gB:Lcom/google/android/gms/internal/v;

    iput-object p2, p0, Lcom/google/android/gms/internal/ce;->fU:Lcom/google/android/gms/internal/cq;

    if-eqz p3, :cond_0

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/internal/ce;->eW:Ljava/util/List;

    iput p4, p0, Lcom/google/android/gms/internal/ce;->errorCode:I

    if-eqz p5, :cond_1

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Lcom/google/android/gms/internal/ce;->eX:Ljava/util/List;

    if-eqz p6, :cond_2

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_2
    iput-object v2, p0, Lcom/google/android/gms/internal/ce;->gK:Ljava/util/List;

    iput p7, p0, Lcom/google/android/gms/internal/ce;->orientation:I

    iput-wide p8, p0, Lcom/google/android/gms/internal/ce;->fa:J

    iput-object p10, p0, Lcom/google/android/gms/internal/ce;->gE:Ljava/lang/String;

    iput-boolean p11, p0, Lcom/google/android/gms/internal/ce;->gI:Z

    iput-object p12, p0, Lcom/google/android/gms/internal/ce;->fm:Lcom/google/android/gms/internal/ao;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->fn:Lcom/google/android/gms/internal/ax;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->fo:Ljava/lang/String;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->fp:Lcom/google/android/gms/internal/ar;

    move-wide/from16 v0, p17

    iput-wide v0, p0, Lcom/google/android/gms/internal/ce;->gJ:J

    move-wide/from16 v0, p19

    iput-wide v0, p0, Lcom/google/android/gms/internal/ce;->gH:J

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
