.class public Lcom/google/android/gms/drive/query/Query;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/query/Query$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/query/Query;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final KE:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

.field final KF:Ljava/lang/String;

.field final KG:Lcom/google/android/gms/drive/query/SortOrder;

.field final xM:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/query/a;

    invoke-direct {v0}, Lcom/google/android/gms/drive/query/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/query/Query;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "clause"    # Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    .param p3, "pageToken"    # Ljava/lang/String;
    .param p4, "sortOrder"    # Lcom/google/android/gms/drive/query/SortOrder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/query/Query;->xM:I

    iput-object p2, p0, Lcom/google/android/gms/drive/query/Query;->KE:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    iput-object p3, p0, Lcom/google/android/gms/drive/query/Query;->KF:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/drive/query/Query;->KG:Lcom/google/android/gms/drive/query/SortOrder;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;)V
    .locals 1
    .param p1, "clause"    # Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    .param p2, "pageToken"    # Ljava/lang/String;
    .param p3, "sortOrder"    # Lcom/google/android/gms/drive/query/SortOrder;

    .prologue
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/drive/query/Query;-><init>(ILcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getFilter()Lcom/google/android/gms/drive/query/Filter;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->KE:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    return-object v0
.end method

.method public getPageToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->KF:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()Lcom/google/android/gms/drive/query/SortOrder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->KG:Lcom/google/android/gms/drive/query/SortOrder;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/a;->a(Lcom/google/android/gms/drive/query/Query;Landroid/os/Parcel;I)V

    return-void
.end method
