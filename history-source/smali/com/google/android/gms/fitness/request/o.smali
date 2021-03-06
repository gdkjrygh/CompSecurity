.class public Lcom/google/android/gms/fitness/request/o;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/o;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final CK:I

.field private final TM:Lcom/google/android/gms/fitness/data/DataType;

.field private final TN:Lcom/google/android/gms/fitness/data/DataSource;

.field private final UQ:J

.field private final UR:I

.field private VW:Lcom/google/android/gms/fitness/data/k;

.field VX:I

.field VY:I

.field private final VZ:J

.field private final Wa:J

.field private final Wb:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;"
        }
    .end annotation
.end field

.field private final Wc:J

.field private final Wd:Ljava/util/List;

.field private final mPendingIntent:Landroid/app/PendingIntent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/p;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/p;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/o;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Landroid/os/IBinder;IIJJLandroid/app/PendingIntent;JILjava/util/List;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            "Landroid/os/IBinder;",
            "IIJJ",
            "Landroid/app/PendingIntent;",
            "JI",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/o;->CK:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/o;->TN:Lcom/google/android/gms/fitness/data/DataSource;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/o;->TM:Lcom/google/android/gms/fitness/data/DataType;

    if-nez p4, :cond_2

    const/4 v2, 0x0

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/fitness/request/o;->VW:Lcom/google/android/gms/fitness/data/k;

    const-wide/16 v2, 0x0

    cmp-long v2, p7, v2

    if-nez v2, :cond_0

    int-to-long p7, p5

    :cond_0
    iput-wide p7, p0, Lcom/google/android/gms/fitness/request/o;->UQ:J

    move-wide/from16 v0, p12

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->Wa:J

    const-wide/16 v2, 0x0

    cmp-long v2, p9, v2

    if-nez v2, :cond_1

    int-to-long p9, p6

    :cond_1
    iput-wide p9, p0, Lcom/google/android/gms/fitness/request/o;->VZ:J

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/o;->Wb:Ljava/util/List;

    iput-object p11, p0, Lcom/google/android/gms/fitness/request/o;->mPendingIntent:Landroid/app/PendingIntent;

    move/from16 v0, p14

    iput v0, p0, Lcom/google/android/gms/fitness/request/o;->UR:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/fitness/request/o;->Wd:Ljava/util/List;

    move-wide/from16 v0, p16

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->Wc:J

    return-void

    :cond_2
    invoke-static {p4}, Lcom/google/android/gms/fitness/data/k$a;->aq(Landroid/os/IBinder;)Lcom/google/android/gms/fitness/data/k;

    move-result-object v2

    goto :goto_0
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/fitness/data/k;Landroid/app/PendingIntent;JJJILjava/util/List;Ljava/util/List;J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/fitness/request/o;->CK:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/o;->TN:Lcom/google/android/gms/fitness/data/DataSource;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/o;->TM:Lcom/google/android/gms/fitness/data/DataType;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/o;->VW:Lcom/google/android/gms/fitness/data/k;

    iput-object p4, p0, Lcom/google/android/gms/fitness/request/o;->mPendingIntent:Landroid/app/PendingIntent;

    iput-wide p5, p0, Lcom/google/android/gms/fitness/request/o;->UQ:J

    iput-wide p7, p0, Lcom/google/android/gms/fitness/request/o;->Wa:J

    iput-wide p9, p0, Lcom/google/android/gms/fitness/request/o;->VZ:J

    iput p11, p0, Lcom/google/android/gms/fitness/request/o;->UR:I

    iput-object p12, p0, Lcom/google/android/gms/fitness/request/o;->Wb:Ljava/util/List;

    iput-object p13, p0, Lcom/google/android/gms/fitness/request/o;->Wd:Ljava/util/List;

    iput-wide p14, p0, Lcom/google/android/gms/fitness/request/o;->Wc:J

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/SensorRequest;Lcom/google/android/gms/fitness/data/k;Landroid/app/PendingIntent;)V
    .locals 17

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SensorRequest;->getDataSource()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SensorRequest;->getDataType()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v3

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/request/SensorRequest;->getSamplingRate(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v6

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/request/SensorRequest;->getFastestRate(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v8

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/request/SensorRequest;->getMaxDeliveryLatency(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v10

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SensorRequest;->getAccuracyMode()I

    move-result v12

    const/4 v13, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SensorRequest;->kh()J

    move-result-wide v15

    move-object/from16 v1, p0

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    invoke-direct/range {v1 .. v16}, Lcom/google/android/gms/fitness/request/o;-><init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/fitness/data/k;Landroid/app/PendingIntent;JJJILjava/util/List;Ljava/util/List;J)V

    return-void
.end method

.method private a(Lcom/google/android/gms/fitness/request/o;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->TN:Lcom/google/android/gms/fitness/data/DataSource;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/o;->TN:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/jv;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->TM:Lcom/google/android/gms/fitness/data/DataType;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/o;->TM:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/jv;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->UQ:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/o;->UQ:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->Wa:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/o;->Wa:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->VZ:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/o;->VZ:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/fitness/request/o;->UR:I

    iget v1, p1, Lcom/google/android/gms/fitness/request/o;->UR:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->Wb:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/o;->Wb:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/jv;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "that"    # Ljava/lang/Object;

    .prologue
    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/o;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/o;

    .end local p1    # "that":Ljava/lang/Object;
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/o;->a(Lcom/google/android/gms/fitness/request/o;)Z

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

.method public getAccuracyMode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/o;->UR:I

    return v0
.end method

.method public getDataSource()Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->TN:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method public getDataType()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->TM:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/o;->CK:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/o;->TN:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/o;->TM:Lcom/google/android/gms/fitness/data/DataType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/o;->VW:Lcom/google/android/gms/fitness/data/k;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/o;->UQ:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/o;->Wa:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/o;->VZ:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget v2, p0, Lcom/google/android/gms/fitness/request/o;->UR:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/o;->Wb:Ljava/util/List;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/jv;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public jI()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->UQ:J

    return-wide v0
.end method

.method public kb()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->mPendingIntent:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public kc()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->Wa:J

    return-wide v0
.end method

.method public kd()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->VZ:J

    return-wide v0
.end method

.method public ke()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->Wb:Ljava/util/List;

    return-object v0
.end method

.method public kf()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->Wc:J

    return-wide v0
.end method

.method kg()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->VW:Lcom/google/android/gms/fitness/data/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->VW:Lcom/google/android/gms/fitness/data/k;

    invoke-interface {v0}, Lcom/google/android/gms/fitness/data/k;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    const-string v0, "SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/o;->TM:Lcom/google/android/gms/fitness/data/DataType;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/o;->TN:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-wide v3, p0, Lcom/google/android/gms/fitness/request/o;->UQ:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-wide v3, p0, Lcom/google/android/gms/fitness/request/o;->Wa:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-wide v3, p0, Lcom/google/android/gms/fitness/request/o;->VZ:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/p;->a(Lcom/google/android/gms/fitness/request/o;Landroid/os/Parcel;I)V

    return-void
.end method
