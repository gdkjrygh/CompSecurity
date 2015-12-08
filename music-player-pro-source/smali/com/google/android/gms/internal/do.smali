.class public final Lcom/google/android/gms/internal/do;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/dn;


# instance fields
.field public final mimeType:Ljava/lang/String;

.field public final packageName:Ljava/lang/String;

.field public final rG:Ljava/lang/String;

.field public final rH:Ljava/lang/String;

.field public final rI:Ljava/lang/String;

.field public final rJ:Ljava/lang/String;

.field public final rK:Ljava/lang/String;

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/dn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/dn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/do;->CREATOR:Lcom/google/android/gms/internal/dn;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/do;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/internal/do;->rG:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/do;->rH:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/do;->mimeType:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/do;->packageName:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/do;->rI:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/do;->rJ:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/do;->rK:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const/4 v1, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/do;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/dn;->a(Lcom/google/android/gms/internal/do;Landroid/os/Parcel;I)V

    return-void
.end method
