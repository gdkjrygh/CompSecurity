.class public final Lcom/google/android/gms/internal/fh;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/fh$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/fi;


# instance fields
.field public final applicationInfo:Landroid/content/pm/ApplicationInfo;

.field public final lL:Ljava/lang/String;

.field public final lO:Lcom/google/android/gms/internal/gs;

.field public final lS:Lcom/google/android/gms/internal/ay;

.field public final mc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final tK:Landroid/os/Bundle;

.field public final tL:Lcom/google/android/gms/internal/av;

.field public final tM:Landroid/content/pm/PackageInfo;

.field public final tN:Ljava/lang/String;

.field public final tO:Ljava/lang/String;

.field public final tP:Ljava/lang/String;

.field public final tQ:Landroid/os/Bundle;

.field public final tR:I

.field public final tS:Landroid/os/Bundle;

.field public final tT:Z

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/fi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fi;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/fh;->CREATOR:Lcom/google/android/gms/internal/fi;

    return-void
.end method

.method constructor <init>(ILandroid/os/Bundle;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gs;Landroid/os/Bundle;ILjava/util/List;Landroid/os/Bundle;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            "Lcom/google/android/gms/internal/av;",
            "Lcom/google/android/gms/internal/ay;",
            "Ljava/lang/String;",
            "Landroid/content/pm/ApplicationInfo;",
            "Landroid/content/pm/PackageInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gs;",
            "Landroid/os/Bundle;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/os/Bundle;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/fh;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/internal/fh;->tK:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/android/gms/internal/fh;->tL:Lcom/google/android/gms/internal/av;

    iput-object p4, p0, Lcom/google/android/gms/internal/fh;->lS:Lcom/google/android/gms/internal/ay;

    iput-object p5, p0, Lcom/google/android/gms/internal/fh;->lL:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/fh;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/fh;->tM:Landroid/content/pm/PackageInfo;

    iput-object p8, p0, Lcom/google/android/gms/internal/fh;->tN:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/fh;->tO:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/internal/fh;->tP:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/internal/fh;->lO:Lcom/google/android/gms/internal/gs;

    iput-object p12, p0, Lcom/google/android/gms/internal/fh;->tQ:Landroid/os/Bundle;

    iput p13, p0, Lcom/google/android/gms/internal/fh;->tR:I

    iput-object p14, p0, Lcom/google/android/gms/internal/fh;->mc:Ljava/util/List;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/internal/fh;->tS:Landroid/os/Bundle;

    move/from16 v0, p16

    iput-boolean v0, p0, Lcom/google/android/gms/internal/fh;->tT:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gs;Landroid/os/Bundle;ILjava/util/List;Landroid/os/Bundle;Z)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lcom/google/android/gms/internal/av;",
            "Lcom/google/android/gms/internal/ay;",
            "Ljava/lang/String;",
            "Landroid/content/pm/ApplicationInfo;",
            "Landroid/content/pm/PackageInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gs;",
            "Landroid/os/Bundle;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/os/Bundle;",
            "Z)V"
        }
    .end annotation

    const/4 v1, 0x4

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    invoke-direct/range {v0 .. v16}, Lcom/google/android/gms/internal/fh;-><init>(ILandroid/os/Bundle;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gs;Landroid/os/Bundle;ILjava/util/List;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/fh$a;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fh$a;->tK:Landroid/os/Bundle;

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/internal/fh$a;->tL:Lcom/google/android/gms/internal/av;

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/internal/fh$a;->lS:Lcom/google/android/gms/internal/ay;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/internal/fh$a;->lL:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v6, v0, Lcom/google/android/gms/internal/fh$a;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/google/android/gms/internal/fh$a;->tM:Landroid/content/pm/PackageInfo;

    move-object/from16 v0, p1

    iget-object v9, v0, Lcom/google/android/gms/internal/fh$a;->tO:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v10, v0, Lcom/google/android/gms/internal/fh$a;->tP:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v11, v0, Lcom/google/android/gms/internal/fh$a;->lO:Lcom/google/android/gms/internal/gs;

    move-object/from16 v0, p1

    iget-object v12, v0, Lcom/google/android/gms/internal/fh$a;->tQ:Landroid/os/Bundle;

    move-object/from16 v0, p1

    iget v13, v0, Lcom/google/android/gms/internal/fh$a;->tR:I

    move-object/from16 v0, p1

    iget-object v14, v0, Lcom/google/android/gms/internal/fh$a;->mc:Ljava/util/List;

    move-object/from16 v0, p1

    iget-object v15, v0, Lcom/google/android/gms/internal/fh$a;->tS:Landroid/os/Bundle;

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/internal/fh$a;->tT:Z

    move/from16 v16, v0

    move-object/from16 v1, p0

    move-object/from16 v8, p2

    invoke-direct/range {v1 .. v16}, Lcom/google/android/gms/internal/fh;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gs;Landroid/os/Bundle;ILjava/util/List;Landroid/os/Bundle;Z)V

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/fi;->a(Lcom/google/android/gms/internal/fh;Landroid/os/Parcel;I)V

    return-void
.end method
