.class public final Lcom/google/android/gms/internal/gs;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/gt;


# instance fields
.field public final versionCode:I

.field public wS:Ljava/lang/String;

.field public wT:I

.field public wU:I

.field public wV:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/gt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gt;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gs;->CREATOR:Lcom/google/android/gms/internal/gt;

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 6

    const/4 v1, 0x1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "afma-sdk-a-v"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz p3, :cond_0

    const-string v0, "0"

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v0, p0

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/gs;-><init>(ILjava/lang/String;IIZ)V

    return-void

    :cond_0
    const-string v0, "1"

    goto :goto_0
.end method

.method constructor <init>(ILjava/lang/String;IIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/gs;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/internal/gs;->wS:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/gs;->wT:I

    iput p4, p0, Lcom/google/android/gms/internal/gs;->wU:I

    iput-boolean p5, p0, Lcom/google/android/gms/internal/gs;->wV:Z

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/gt;->a(Lcom/google/android/gms/internal/gs;Landroid/os/Parcel;I)V

    return-void
.end method
