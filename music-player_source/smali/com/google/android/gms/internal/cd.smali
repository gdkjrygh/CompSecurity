.class public final Lcom/google/android/gms/internal/cd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final a:Lcom/google/android/gms/internal/cz;


# instance fields
.field public final b:I

.field public final c:Landroid/os/Bundle;

.field public final d:Lcom/google/android/gms/internal/z;

.field public final e:Lcom/google/android/gms/internal/ab;

.field public final f:Ljava/lang/String;

.field public final g:Landroid/content/pm/ApplicationInfo;

.field public final h:Landroid/content/pm/PackageInfo;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Lcom/google/android/gms/internal/db;

.field public final m:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/cz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/cz;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/cd;->a:Lcom/google/android/gms/internal/cz;

    return-void
.end method

.method constructor <init>(ILandroid/os/Bundle;Lcom/google/android/gms/internal/z;Lcom/google/android/gms/internal/ab;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/db;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/cd;->b:I

    iput-object p2, p0, Lcom/google/android/gms/internal/cd;->c:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/android/gms/internal/cd;->d:Lcom/google/android/gms/internal/z;

    iput-object p4, p0, Lcom/google/android/gms/internal/cd;->e:Lcom/google/android/gms/internal/ab;

    iput-object p5, p0, Lcom/google/android/gms/internal/cd;->f:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/cd;->g:Landroid/content/pm/ApplicationInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/cd;->h:Landroid/content/pm/PackageInfo;

    iput-object p8, p0, Lcom/google/android/gms/internal/cd;->i:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/cd;->j:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/internal/cd;->k:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/internal/cd;->l:Lcom/google/android/gms/internal/db;

    iput-object p12, p0, Lcom/google/android/gms/internal/cd;->m:Landroid/os/Bundle;

    return-void
.end method

.method private constructor <init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/z;Lcom/google/android/gms/internal/ab;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/db;Landroid/os/Bundle;)V
    .locals 13

    const/4 v1, 0x2

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v0 .. v12}, Lcom/google/android/gms/internal/cd;-><init>(ILandroid/os/Bundle;Lcom/google/android/gms/internal/z;Lcom/google/android/gms/internal/ab;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/db;Landroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/cy;Ljava/lang/String;)V
    .locals 12

    iget-object v1, p1, Lcom/google/android/gms/internal/cy;->a:Landroid/os/Bundle;

    iget-object v2, p1, Lcom/google/android/gms/internal/cy;->b:Lcom/google/android/gms/internal/z;

    iget-object v3, p1, Lcom/google/android/gms/internal/cy;->c:Lcom/google/android/gms/internal/ab;

    iget-object v4, p1, Lcom/google/android/gms/internal/cy;->d:Ljava/lang/String;

    iget-object v5, p1, Lcom/google/android/gms/internal/cy;->e:Landroid/content/pm/ApplicationInfo;

    iget-object v6, p1, Lcom/google/android/gms/internal/cy;->f:Landroid/content/pm/PackageInfo;

    iget-object v8, p1, Lcom/google/android/gms/internal/cy;->g:Ljava/lang/String;

    iget-object v9, p1, Lcom/google/android/gms/internal/cy;->h:Ljava/lang/String;

    iget-object v10, p1, Lcom/google/android/gms/internal/cy;->j:Lcom/google/android/gms/internal/db;

    iget-object v11, p1, Lcom/google/android/gms/internal/cy;->i:Landroid/os/Bundle;

    move-object v0, p0

    move-object v7, p2

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/cd;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/z;Lcom/google/android/gms/internal/ab;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/db;Landroid/os/Bundle;)V

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

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/cz;->a(Lcom/google/android/gms/internal/cd;Landroid/os/Parcel;I)V

    return-void
.end method
