.class public Lcom/google/android/gms/drive/query/internal/InFilter;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
.implements Lcom/google/android/gms/drive/query/a;


# static fields
.field public static final a:Lcom/google/android/gms/drive/query/internal/e;


# instance fields
.field final b:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

.field final c:I

.field private final d:Lcom/google/android/gms/drive/metadata/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/query/internal/e;

    invoke-direct {v0}, Lcom/google/android/gms/drive/query/internal/e;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/query/internal/InFilter;->a:Lcom/google/android/gms/drive/query/internal/e;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/query/internal/InFilter;->c:I

    iput-object p2, p0, Lcom/google/android/gms/drive/query/internal/InFilter;->b:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    invoke-static {p2}, Lcom/google/android/gms/drive/query/internal/d;->a(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)Lcom/google/android/gms/drive/metadata/b;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/metadata/a;

    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/InFilter;->d:Lcom/google/android/gms/drive/metadata/a;

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

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/e;->a(Lcom/google/android/gms/drive/query/internal/InFilter;Landroid/os/Parcel;I)V

    return-void
.end method
