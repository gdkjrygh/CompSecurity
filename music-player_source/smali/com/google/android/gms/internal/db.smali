.class public final Lcom/google/android/gms/internal/db;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final a:Lcom/google/android/gms/internal/el;


# instance fields
.field public final b:I

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/el;

    invoke-direct {v0}, Lcom/google/android/gms/internal/el;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/db;->a:Lcom/google/android/gms/internal/el;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const v3, 0x41f6b8

    const/4 v1, 0x1

    const-string v2, "afma-sdk-a-v4323000.4323000.0"

    move-object v0, p0

    move v4, v3

    move v5, v1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/db;-><init>(ILjava/lang/String;IIZ)V

    return-void
.end method

.method constructor <init>(ILjava/lang/String;IIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/db;->b:I

    iput-object p2, p0, Lcom/google/android/gms/internal/db;->c:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/db;->d:I

    iput p4, p0, Lcom/google/android/gms/internal/db;->e:I

    iput-boolean p5, p0, Lcom/google/android/gms/internal/db;->f:Z

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/el;->a(Lcom/google/android/gms/internal/db;Landroid/os/Parcel;)V

    return-void
.end method
