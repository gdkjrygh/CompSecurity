.class public final Lcom/google/android/gms/internal/av;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/aw;


# instance fields
.field public final extras:Landroid/os/Bundle;

.field public final od:J

.field public final oe:I

.field public final of:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final og:Z

.field public final oh:I

.field public final oi:Z

.field public final oj:Ljava/lang/String;

.field public final ok:Lcom/google/android/gms/internal/bj;

.field public final ol:Landroid/location/Location;

.field public final om:Ljava/lang/String;

.field public final on:Landroid/os/Bundle;

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/aw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/aw;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/av;->CREATOR:Lcom/google/android/gms/internal/aw;

    return-void
.end method

.method public constructor <init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/internal/bj;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Landroid/os/Bundle;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;ZIZ",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/bj;",
            "Landroid/location/Location;",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/av;->versionCode:I

    iput-wide p2, p0, Lcom/google/android/gms/internal/av;->od:J

    iput-object p4, p0, Lcom/google/android/gms/internal/av;->extras:Landroid/os/Bundle;

    iput p5, p0, Lcom/google/android/gms/internal/av;->oe:I

    iput-object p6, p0, Lcom/google/android/gms/internal/av;->of:Ljava/util/List;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/av;->og:Z

    iput p8, p0, Lcom/google/android/gms/internal/av;->oh:I

    iput-boolean p9, p0, Lcom/google/android/gms/internal/av;->oi:Z

    iput-object p10, p0, Lcom/google/android/gms/internal/av;->oj:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/internal/av;->ok:Lcom/google/android/gms/internal/bj;

    iput-object p12, p0, Lcom/google/android/gms/internal/av;->ol:Landroid/location/Location;

    iput-object p13, p0, Lcom/google/android/gms/internal/av;->om:Ljava/lang/String;

    iput-object p14, p0, Lcom/google/android/gms/internal/av;->on:Landroid/os/Bundle;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/aw;->a(Lcom/google/android/gms/internal/av;Landroid/os/Parcel;I)V

    return-void
.end method
