.class public Lcom/google/android/gms/ads/internal/request/zzb;
.super Lcom/google/android/gms/internal/pj;

# interfaces
.implements Lcom/google/android/gms/ads/internal/request/zzc$zza;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field a:Lcom/google/android/gms/internal/pj;

.field b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

.field c:Lcom/google/android/gms/internal/ie;

.field private final d:Lcom/google/android/gms/ads/internal/request/zza$zza;

.field private final e:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;

.field private final f:Ljava/lang/Object;

.field private final g:Landroid/content/Context;

.field private final h:Lcom/google/android/gms/internal/ad;

.field private i:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

.field private j:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;Lcom/google/android/gms/internal/ad;Lcom/google/android/gms/ads/internal/request/zza$zza;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/pj;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->f:Ljava/lang/Object;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/request/zzb;->d:Lcom/google/android/gms/ads/internal/request/zza$zza;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->g:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->e:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/request/zzb;->h:Lcom/google/android/gms/internal/ad;

    return-void
.end method

.method private a(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    .locals 11

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEN:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/request/c;

    const-string v1, "The ad response must specify one of the supported ad sizes."

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/ads/internal/request/c;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEN:Ljava/lang/String;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    new-instance v0, Lcom/google/android/gms/ads/internal/request/c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid ad size format from the ad response: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEN:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/ads/internal/request/c;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    const/4 v1, 0x0

    :try_start_0
    aget-object v1, v0, v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v6, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztg:[Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    array-length v7, v6

    move v2, v3

    :goto_0
    if-ge v2, v7, :cond_5

    aget-object v8, v6, v2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    iget v0, v8, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->width:I

    const/4 v9, -0x1

    if-ne v0, v9, :cond_2

    iget v0, v8, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->widthPixels:I

    int-to-float v0, v0

    div-float/2addr v0, v1

    float-to-int v0, v0

    :goto_1
    iget v9, v8, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->height:I

    const/4 v10, -0x2

    if-ne v9, v10, :cond_3

    iget v9, v8, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->heightPixels:I

    int-to-float v9, v9

    div-float v1, v9, v1

    float-to-int v1, v1

    :goto_2
    if-ne v4, v0, :cond_4

    if-ne v5, v1, :cond_4

    new-instance v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztg:[Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-direct {v0, v8, v1}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;-><init>(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;[Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V

    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/android/gms/ads/internal/request/c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid ad size number from the ad response: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEN:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/ads/internal/request/c;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    iget v0, v8, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->width:I

    goto :goto_1

    :cond_3
    iget v1, v8, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->height:I

    goto :goto_2

    :cond_4
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_5
    new-instance v0, Lcom/google/android/gms/ads/internal/request/c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The ad size from the ad response was not one of the requested sizes: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEN:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/ads/internal/request/c;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/request/zzb;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->f:Ljava/lang/Object;

    return-object v0
.end method

.method private a(ILjava/lang/String;)V
    .locals 11

    const/4 v4, 0x0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    :cond_0
    invoke-static {p2}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    :goto_1
    new-instance v0, Lcom/google/android/gms/internal/pb;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->i:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/request/zzb;->c:Lcom/google/android/gms/internal/ie;

    const-wide/16 v6, -0x1

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-wide v8, v5, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEO:J

    move v5, p1

    move-object v10, v4

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/pb;-><init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Lcom/google/android/gms/internal/ie;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;IJJLorg/json/JSONObject;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->d:Lcom/google/android/gms/ads/internal/request/zza$zza;

    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/request/zza$zza;->zza(Lcom/google/android/gms/internal/pb;)V

    return-void

    :cond_1
    invoke-static {p2}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-wide v2, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzzc:J

    invoke-direct {v0, p1, v2, v3}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(IJ)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/request/zzb;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/ads/internal/request/zzb;->a(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onStop()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->a:Lcom/google/android/gms/internal/pj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->a:Lcom/google/android/gms/internal/pj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/pj;->cancel()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzb(Lcom/google/android/gms/ads/internal/request/AdResponseParcel;)V
    .locals 11

    .prologue
    const/4 v5, -0x2

    const/4 v3, -0x3

    const/4 v0, 0x0

    .line 0
    const-string v1, "Received ad response."

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaF(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbz()Lcom/google/android/gms/internal/wg;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/wg;->b()J

    move-result-wide v6

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->f:Ljava/lang/Object;

    monitor-enter v1

    const/4 v2, 0x0

    :try_start_0
    iput-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->a:Lcom/google/android/gms/internal/pj;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->errorCode:I

    if-eq v1, v5, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->errorCode:I

    if-eq v1, v3, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/request/c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "There was a problem getting an ad response. ErrorCode: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->errorCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->errorCode:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/ads/internal/request/c;-><init>(Ljava/lang/String;I)V

    throw v0
    :try_end_1
    .catch Lcom/google/android/gms/ads/internal/request/c; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/request/c;->a()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/request/c;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/ads/internal/request/zzb;->a(ILjava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 3000
    :cond_0
    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->errorCode:I

    if-eq v1, v3, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->body:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Lcom/google/android/gms/ads/internal/request/c;

    const-string v1, "No fill from ad server."

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/ads/internal/request/c;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzby()Lcom/google/android/gms/internal/pe;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->g:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-boolean v3, v3, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEv:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/pe;->a(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEK:Z
    :try_end_3
    .catch Lcom/google/android/gms/ads/internal/request/c; {:try_start_3 .. :try_end_3} :catch_0

    if-eqz v1, :cond_2

    :try_start_4
    new-instance v1, Lcom/google/android/gms/internal/ie;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->body:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ie;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->c:Lcom/google/android/gms/internal/ie;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lcom/google/android/gms/ads/internal/request/c; {:try_start_4 .. :try_end_4} :catch_0

    .line 0
    :cond_2
    :try_start_5
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->i:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztg:[Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->i:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    invoke-direct {p0, v1}, Lcom/google/android/gms/ads/internal/request/zzb;->a(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    :try_end_5
    .catch Lcom/google/android/gms/ads/internal/request/c; {:try_start_5 .. :try_end_5} :catch_0

    move-result-object v4

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEU:Z

    .line 4000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzby()Lcom/google/android/gms/internal/pe;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/pe;->a(Z)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzby()Lcom/google/android/gms/internal/pe;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->g:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/pe;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/by;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/by;->isAlive()Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "start fetching content..."

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaF(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/by;->a()V

    .line 0
    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzES:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    :try_start_6
    new-instance v10, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzES:Ljava/lang/String;

    invoke-direct {v10, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/pb;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->i:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/request/zzb;->c:Lcom/google/android/gms/internal/ie;

    iget-object v8, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-wide v8, v8, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEO:J

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/pb;-><init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Lcom/google/android/gms/internal/ie;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;IJJLorg/json/JSONObject;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->d:Lcom/google/android/gms/ads/internal/request/zza$zza;

    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/request/zza$zza;->zza(Lcom/google/android/gms/internal/pb;)V

    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 3000
    :catch_1
    move-exception v0

    :try_start_7
    new-instance v0, Lcom/google/android/gms/ads/internal/request/c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not parse mediation config: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->body:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/ads/internal/request/c;-><init>(Ljava/lang/String;I)V

    throw v0
    :try_end_7
    .catch Lcom/google/android/gms/ads/internal/request/c; {:try_start_7 .. :try_end_7} :catch_0

    .line 0
    :catch_2
    move-exception v1

    const-string v2, "Error parsing the JSON for Active View."

    invoke-static {v2, v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    move-object v10, v0

    goto :goto_2

    :cond_5
    move-object v4, v0

    goto :goto_1
.end method

.method public zzbn()V
    .locals 6

    .prologue
    .line 0
    const-string v0, "AdLoaderBackgroundTask started."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaF(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->h:Lcom/google/android/gms/internal/ad;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ad;->a()Lcom/google/android/gms/internal/w;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->g:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/ads/internal/request/b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/internal/request/b;-><init>(Lcom/google/android/gms/ads/internal/request/zzb;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->j:Ljava/lang/Runnable;

    sget-object v2, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/request/zzb;->j:Ljava/lang/Runnable;

    sget-object v0, Lcom/google/android/gms/internal/cy;->al:Lcom/google/android/gms/internal/cq;

    .line 1000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbE()Lcom/google/android/gms/internal/cx;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cq;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbz()Lcom/google/android/gms/internal/wg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/wg;->b()J

    move-result-wide v2

    new-instance v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/request/zzb;->e:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;Ljava/lang/String;J)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->i:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzb;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->i:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    .line 2000
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->g:Landroid/content/Context;

    invoke-static {v2, v0, p0}, Lcom/google/android/gms/ads/internal/request/zzc;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/zzc$zza;)Lcom/google/android/gms/internal/pj;

    move-result-object v0

    .line 0
    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->a:Lcom/google/android/gms/internal/pj;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb;->a:Lcom/google/android/gms/internal/pj;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const-string v2, "Could not start the ad request service."

    invoke-direct {p0, v0, v2}, Lcom/google/android/gms/ads/internal/request/zzb;->a(ILjava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
