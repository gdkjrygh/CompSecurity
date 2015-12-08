.class public Lcom/google/android/gms/internal/gj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/internal/gj;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AP:D

.field private AQ:Z

.field private BR:I

.field private final xM:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/gk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gj;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x1

    const-wide/high16 v2, 0x7ff8000000000000L    # NaN

    const/4 v4, 0x0

    const/4 v5, -0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/gj;-><init>(IDZI)V

    return-void
.end method

.method constructor <init>(IDZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/gj;->xM:I

    iput-wide p2, p0, Lcom/google/android/gms/internal/gj;->AP:D

    iput-boolean p4, p0, Lcom/google/android/gms/internal/gj;->AQ:Z

    iput p5, p0, Lcom/google/android/gms/internal/gj;->BR:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public eh()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/gj;->AP:D

    return-wide v0
.end method

.method public en()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gj;->AQ:Z

    return v0
.end method

.method public eo()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/gj;->BR:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    .end local p1    # "obj":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "obj":Ljava/lang/Object;
    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/gj;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/gj;

    .end local p1    # "obj":Ljava/lang/Object;
    iget-wide v2, p0, Lcom/google/android/gms/internal/gj;->AP:D

    iget-wide v4, p1, Lcom/google/android/gms/internal/gj;->AP:D

    cmpl-double v2, v2, v4

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lcom/google/android/gms/internal/gj;->AQ:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/gj;->AQ:Z

    if-ne v2, v3, :cond_3

    iget v2, p0, Lcom/google/android/gms/internal/gj;->BR:I

    iget v3, p1, Lcom/google/android/gms/internal/gj;->BR:I

    if-eq v2, v3, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/gj;->xM:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/internal/gj;->AP:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/gj;->AQ:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget v2, p0, Lcom/google/android/gms/internal/gj;->BR:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/hk;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/gk;->a(Lcom/google/android/gms/internal/gj;Landroid/os/Parcel;I)V

    return-void
.end method
