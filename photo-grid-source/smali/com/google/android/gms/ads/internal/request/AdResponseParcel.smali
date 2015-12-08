.class public final Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/ads/internal/request/zzh;


# instance fields
.field private a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

.field public body:Ljava/lang/String;

.field public final errorCode:I

.field public final orientation:I

.field public final versionCode:I

.field public final zzBF:Ljava/lang/String;

.field public final zzEJ:J

.field public final zzEK:Z

.field public final zzEL:J

.field public final zzEM:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final zzEN:Ljava/lang/String;

.field public final zzEO:J

.field public final zzEP:Ljava/lang/String;

.field public final zzEQ:Z

.field public final zzER:Ljava/lang/String;

.field public final zzES:Ljava/lang/String;

.field public final zzET:Z

.field public final zzEU:Z

.field public final zzEV:Z

.field public final zzEW:I

.field public zzEX:Lcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;

.field public zzEY:Ljava/lang/String;

.field public zzEZ:Ljava/lang/String;

.field public final zzEv:Z

.field public final zzth:Z

.field public zzti:Z

.field public final zzyY:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final zzyZ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final zzzc:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/request/zzh;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/request/zzh;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->CREATOR:Lcom/google/android/gms/ads/internal/request/zzh;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 34

    const/16 v2, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, -0x1

    const/4 v10, 0x0

    const-wide/16 v11, -0x1

    const/4 v13, 0x0

    const-wide/16 v14, -0x1

    const/16 v16, -0x1

    const/16 v17, 0x0

    const-wide/16 v18, -0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v1, p0

    move/from16 v6, p1

    invoke-direct/range {v1 .. v33}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZILcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 34

    const/16 v2, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, -0x1

    const/4 v10, 0x0

    const-wide/16 v11, -0x1

    const/4 v13, 0x0

    const/16 v16, -0x1

    const/16 v17, 0x0

    const-wide/16 v18, -0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v1, p0

    move/from16 v6, p1

    move-wide/from16 v14, p2

    invoke-direct/range {v1 .. v33}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZILcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZILcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;JZJ",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;JI",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZZZI",
            "Lcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzBF:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->body:Ljava/lang/String;

    if-eqz p4, :cond_1

    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzyY:Ljava/util/List;

    iput p5, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->errorCode:I

    if-eqz p6, :cond_2

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzyZ:Ljava/util/List;

    iput-wide p7, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEJ:J

    iput-boolean p9, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEK:Z

    iput-wide p10, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEL:J

    if-eqz p12, :cond_3

    invoke-static/range {p12 .. p12}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_2
    iput-object v2, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEM:Ljava/util/List;

    move-wide/from16 v0, p13

    iput-wide v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzzc:J

    move/from16 v0, p15

    iput v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->orientation:I

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEN:Ljava/lang/String;

    move-wide/from16 v0, p17

    iput-wide v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEO:J

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEP:Ljava/lang/String;

    move/from16 v0, p20

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEQ:Z

    move-object/from16 v0, p21

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzER:Ljava/lang/String;

    move-object/from16 v0, p22

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzES:Ljava/lang/String;

    move/from16 v0, p23

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzET:Z

    move/from16 v0, p24

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzth:Z

    move/from16 v0, p25

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEv:Z

    move/from16 v0, p26

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEU:Z

    move/from16 v0, p27

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEV:Z

    move/from16 v0, p28

    iput v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEW:I

    move-object/from16 v0, p29

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEX:Lcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;

    move-object/from16 v0, p30

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEY:Ljava/lang/String;

    move-object/from16 v0, p31

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEZ:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->body:Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEX:Lcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEX:Lcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;

    sget-object v3, Lcom/google/android/gms/ads/internal/request/StringParcel;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;->zza(Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/internal/request/StringParcel;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/request/StringParcel;->zzfP()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/request/StringParcel;->zzfP()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->body:Ljava/lang/String;

    :cond_0
    move/from16 v0, p32

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzti:Z

    return-void

    :cond_1
    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_2
    const/4 v2, 0x0

    goto/16 :goto_1

    :cond_3
    const/4 v2, 0x0

    goto :goto_2
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZZILjava/lang/String;Z)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;JZJ",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;JI",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZZZI",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const/16 v4, 0xe

    const/4 v8, -0x2

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v3, p0

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v9, p5

    move-wide/from16 v10, p6

    move/from16 v12, p8

    move-wide/from16 v13, p9

    move-object/from16 v15, p11

    move-wide/from16 v16, p12

    move/from16 v18, p14

    move-object/from16 v19, p15

    move-wide/from16 v20, p16

    move-object/from16 v22, p18

    move-object/from16 v25, p19

    move/from16 v26, p20

    move/from16 v27, p21

    move/from16 v28, p22

    move/from16 v29, p23

    move/from16 v30, p24

    move/from16 v31, p25

    move-object/from16 v34, p26

    move/from16 v35, p27

    invoke-direct/range {v3 .. v35}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZILcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZILjava/lang/String;Z)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;JZJ",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;JI",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZZZI",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const/16 v4, 0xe

    const/4 v8, -0x2

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v3, p0

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v9, p5

    move-wide/from16 v10, p6

    move/from16 v12, p8

    move-wide/from16 v13, p9

    move-object/from16 v15, p11

    move-wide/from16 v16, p12

    move/from16 v18, p14

    move-object/from16 v19, p15

    move-wide/from16 v20, p16

    move-object/from16 v22, p18

    move/from16 v23, p19

    move-object/from16 v24, p20

    move-object/from16 v25, p21

    move/from16 v26, p22

    move/from16 v27, p23

    move/from16 v28, p24

    move/from16 v29, p25

    move/from16 v30, p26

    move/from16 v31, p27

    move-object/from16 v34, p28

    move/from16 v35, p29

    invoke-direct/range {v3 .. v35}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZILcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget v0, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->versionCode:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->body:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;

    new-instance v1, Lcom/google/android/gms/ads/internal/request/StringParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->body:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/request/StringParcel;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;-><init>(Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEX:Lcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->body:Ljava/lang/String;

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/ads/internal/request/zzh;->a(Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Landroid/os/Parcel;I)V

    return-void
.end method
