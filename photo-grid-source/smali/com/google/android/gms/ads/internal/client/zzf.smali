.class public final Lcom/google/android/gms/ads/internal/client/zzf;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private a:J

.field private b:Landroid/os/Bundle;

.field private c:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:I

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;

.field private j:Landroid/location/Location;

.field private k:Ljava/lang/String;

.field private l:Landroid/os/Bundle;

.field private m:Landroid/os/Bundle;

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, -0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->a:J

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->b:Landroid/os/Bundle;

    iput v3, p0, Lcom/google/android/gms/ads/internal/client/zzf;->c:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->d:Ljava/util/List;

    iput-boolean v4, p0, Lcom/google/android/gms/ads/internal/client/zzf;->e:Z

    iput v3, p0, Lcom/google/android/gms/ads/internal/client/zzf;->f:I

    iput-boolean v4, p0, Lcom/google/android/gms/ads/internal/client/zzf;->g:Z

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzf;->h:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzf;->i:Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzf;->j:Landroid/location/Location;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzf;->k:Ljava/lang/String;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->l:Landroid/os/Bundle;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->m:Landroid/os/Bundle;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->n:Ljava/util/List;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzf;->o:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzf;->p:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsB:J

    iput-wide v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->a:J

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->extras:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->b:Landroid/os/Bundle;

    iget v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsC:I

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->c:I

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsD:Ljava/util/List;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->d:Ljava/util/List;

    iget-boolean v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsE:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->e:Z

    iget v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsF:I

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->f:I

    iget-boolean v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsG:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->g:Z

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsH:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->h:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsI:Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->i:Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsJ:Landroid/location/Location;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->j:Landroid/location/Location;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsK:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->k:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsL:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->l:Landroid/os/Bundle;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsM:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->m:Landroid/os/Bundle;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsN:Ljava/util/List;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->n:Ljava/util/List;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsO:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->o:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsP:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzf;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Landroid/location/Location;)Lcom/google/android/gms/ads/internal/client/zzf;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/zzf;->j:Landroid/location/Location;

    return-object p0
.end method

.method public final zzcA()Lcom/google/android/gms/ads/internal/client/AdRequestParcel;
    .locals 21

    new-instance v2, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    const/4 v3, 0x6

    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/google/android/gms/ads/internal/client/zzf;->a:J

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/ads/internal/client/zzf;->b:Landroid/os/Bundle;

    move-object/from16 v0, p0

    iget v7, v0, Lcom/google/android/gms/ads/internal/client/zzf;->c:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/ads/internal/client/zzf;->d:Ljava/util/List;

    move-object/from16 v0, p0

    iget-boolean v9, v0, Lcom/google/android/gms/ads/internal/client/zzf;->e:Z

    move-object/from16 v0, p0

    iget v10, v0, Lcom/google/android/gms/ads/internal/client/zzf;->f:I

    move-object/from16 v0, p0

    iget-boolean v11, v0, Lcom/google/android/gms/ads/internal/client/zzf;->g:Z

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/android/gms/ads/internal/client/zzf;->h:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/android/gms/ads/internal/client/zzf;->i:Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/android/gms/ads/internal/client/zzf;->j:Landroid/location/Location;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/ads/internal/client/zzf;->k:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/zzf;->l:Landroid/os/Bundle;

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/zzf;->m:Landroid/os/Bundle;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/zzf;->n:Ljava/util/List;

    move-object/from16 v18, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/zzf;->o:Ljava/lang/String;

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/zzf;->p:Ljava/lang/String;

    move-object/from16 v20, v0

    invoke-direct/range {v2 .. v20}, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method
