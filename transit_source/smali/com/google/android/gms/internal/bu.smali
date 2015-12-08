.class public final Lcom/google/android/gms/internal/bu;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/bu$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/bv;


# instance fields
.field public final adUnitId:Ljava/lang/String;

.field public final applicationInfo:Landroid/content/pm/ApplicationInfo;

.field public final ed:Lcom/google/android/gms/internal/x;

.field public final eg:Lcom/google/android/gms/internal/co;

.field public final gA:Landroid/os/Bundle;

.field public final gB:Lcom/google/android/gms/internal/v;

.field public final gC:Landroid/content/pm/PackageInfo;

.field public final gD:Ljava/lang/String;

.field public final gE:Ljava/lang/String;

.field public final gF:Ljava/lang/String;

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/bv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/bv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/bu;->CREATOR:Lcom/google/android/gms/internal/bv;

    return-void
.end method

.method constructor <init>(ILandroid/os/Bundle;Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/x;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/co;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/bu;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/internal/bu;->gA:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/android/gms/internal/bu;->gB:Lcom/google/android/gms/internal/v;

    iput-object p4, p0, Lcom/google/android/gms/internal/bu;->ed:Lcom/google/android/gms/internal/x;

    iput-object p5, p0, Lcom/google/android/gms/internal/bu;->adUnitId:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/bu;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/bu;->gC:Landroid/content/pm/PackageInfo;

    iput-object p8, p0, Lcom/google/android/gms/internal/bu;->gD:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/bu;->gE:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/internal/bu;->gF:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/internal/bu;->eg:Lcom/google/android/gms/internal/co;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/x;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/co;)V
    .locals 12

    const/4 v1, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/bu;-><init>(ILandroid/os/Bundle;Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/x;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/co;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/bu$a;Ljava/lang/String;)V
    .locals 11

    iget-object v1, p1, Lcom/google/android/gms/internal/bu$a;->gA:Landroid/os/Bundle;

    iget-object v2, p1, Lcom/google/android/gms/internal/bu$a;->gB:Lcom/google/android/gms/internal/v;

    iget-object v3, p1, Lcom/google/android/gms/internal/bu$a;->ed:Lcom/google/android/gms/internal/x;

    iget-object v4, p1, Lcom/google/android/gms/internal/bu$a;->adUnitId:Ljava/lang/String;

    iget-object v5, p1, Lcom/google/android/gms/internal/bu$a;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v6, p1, Lcom/google/android/gms/internal/bu$a;->gC:Landroid/content/pm/PackageInfo;

    iget-object v8, p1, Lcom/google/android/gms/internal/bu$a;->gE:Ljava/lang/String;

    iget-object v9, p1, Lcom/google/android/gms/internal/bu$a;->gF:Ljava/lang/String;

    iget-object v10, p1, Lcom/google/android/gms/internal/bu$a;->eg:Lcom/google/android/gms/internal/co;

    move-object v0, p0

    move-object v7, p2

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/bu;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/x;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/co;)V

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/bv;->a(Lcom/google/android/gms/internal/bu;Landroid/os/Parcel;I)V

    return-void
.end method
