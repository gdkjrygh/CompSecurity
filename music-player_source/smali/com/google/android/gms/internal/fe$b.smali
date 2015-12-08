.class public Lcom/google/android/gms/internal/fe$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final a:Lcom/google/android/gms/internal/hy;


# instance fields
.field final b:I

.field final c:Ljava/lang/String;

.field final d:Lcom/google/android/gms/internal/fb$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/hy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hy;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/fe$b;->a:Lcom/google/android/gms/internal/hy;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Lcom/google/android/gms/internal/fb$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/fe$b;->b:I

    iput-object p2, p0, Lcom/google/android/gms/internal/fe$b;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/fe$b;->d:Lcom/google/android/gms/internal/fb$a;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/fb$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/fe$b;->b:I

    iput-object p1, p0, Lcom/google/android/gms/internal/fe$b;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/fe$b;->d:Lcom/google/android/gms/internal/fb$a;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/fe$b;->a:Lcom/google/android/gms/internal/hy;

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/fe$b;->a:Lcom/google/android/gms/internal/hy;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hy;->a(Lcom/google/android/gms/internal/fe$b;Landroid/os/Parcel;I)V

    return-void
.end method
