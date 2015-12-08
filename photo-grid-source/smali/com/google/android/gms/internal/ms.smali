.class public final Lcom/google/android/gms/internal/ms;
.super Lcom/google/android/gms/internal/mj;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field protected g:Lcom/google/android/gms/internal/ij;

.field private h:Lcom/google/android/gms/internal/ip;

.field private i:Lcom/google/android/gms/internal/ic;

.field private j:Lcom/google/android/gms/internal/ie;

.field private final k:Lcom/google/android/gms/internal/dm;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/internal/mo;Lcom/google/android/gms/internal/dm;)V
    .locals 1

    invoke-direct {p0, p1, p2, p4}, Lcom/google/android/gms/internal/mj;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/mo;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ms;->h:Lcom/google/android/gms/internal/ip;

    iget-object v0, p2, Lcom/google/android/gms/internal/pb;->c:Lcom/google/android/gms/internal/ie;

    iput-object v0, p0, Lcom/google/android/gms/internal/ms;->j:Lcom/google/android/gms/internal/ie;

    iput-object p5, p0, Lcom/google/android/gms/internal/ms;->k:Lcom/google/android/gms/internal/dm;

    return-void
.end method


# virtual methods
.method protected final a(I)Lcom/google/android/gms/internal/pa;
    .locals 31

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/ms;->e:Lcom/google/android/gms/internal/pb;

    iget-object v6, v2, Lcom/google/android/gms/internal/pb;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    new-instance v2, Lcom/google/android/gms/internal/pa;

    iget-object v3, v6, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEn:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/internal/ms;->f:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzyY:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/internal/ms;->f:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v7, v7, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzyZ:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/ms;->f:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v8, v8, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEM:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/google/android/gms/internal/ms;->f:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget v9, v9, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->orientation:I

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/internal/ms;->f:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-wide v10, v10, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzzc:J

    iget-object v12, v6, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEq:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->f:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-boolean v13, v6, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEK:Z

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->g:Lcom/google/android/gms/internal/ij;

    if-eqz v6, :cond_0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->g:Lcom/google/android/gms/internal/ij;

    iget-object v14, v6, Lcom/google/android/gms/internal/ij;->b:Lcom/google/android/gms/internal/id;

    :goto_0
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->g:Lcom/google/android/gms/internal/ij;

    if-eqz v6, :cond_1

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->g:Lcom/google/android/gms/internal/ij;

    iget-object v15, v6, Lcom/google/android/gms/internal/ij;->c:Lcom/google/android/gms/internal/is;

    :goto_1
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->g:Lcom/google/android/gms/internal/ij;

    if-eqz v6, :cond_2

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->g:Lcom/google/android/gms/internal/ij;

    iget-object v0, v6, Lcom/google/android/gms/internal/ij;->d:Ljava/lang/String;

    move-object/from16 v16, v0

    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/ms;->j:Lcom/google/android/gms/internal/ie;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->g:Lcom/google/android/gms/internal/ij;

    if-eqz v6, :cond_3

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->g:Lcom/google/android/gms/internal/ij;

    iget-object v0, v6, Lcom/google/android/gms/internal/ij;->e:Lcom/google/android/gms/internal/ig;

    move-object/from16 v18, v0

    :goto_3
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->f:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-wide v0, v6, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEL:J

    move-wide/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->e:Lcom/google/android/gms/internal/pb;

    iget-object v0, v6, Lcom/google/android/gms/internal/pb;->d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-object/from16 v21, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->f:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-wide v0, v6, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEJ:J

    move-wide/from16 v22, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->e:Lcom/google/android/gms/internal/pb;

    iget-wide v0, v6, Lcom/google/android/gms/internal/pb;->f:J

    move-wide/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->f:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-wide v0, v6, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEO:J

    move-wide/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->f:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v0, v6, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEP:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/internal/ms;->e:Lcom/google/android/gms/internal/pb;

    iget-object v0, v6, Lcom/google/android/gms/internal/pb;->h:Lorg/json/JSONObject;

    move-object/from16 v29, v0

    const/16 v30, 0x0

    move/from16 v6, p1

    invoke-direct/range {v2 .. v30}, Lcom/google/android/gms/internal/pa;-><init>(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/ry;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/id;Lcom/google/android/gms/internal/is;Ljava/lang/String;Lcom/google/android/gms/internal/ie;Lcom/google/android/gms/internal/ig;JLcom/google/android/gms/ads/internal/client/AdSizeParcel;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/ads/internal/formats/zzh$zza;)V

    return-object v2

    :cond_0
    const/4 v14, 0x0

    goto :goto_0

    :cond_1
    const/4 v15, 0x0

    goto :goto_1

    :cond_2
    const-class v6, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v16

    goto :goto_2

    :cond_3
    const/16 v18, 0x0

    goto :goto_3
.end method

.method protected final a(J)V
    .locals 13

    .prologue
    .line 0
    iget-object v11, p0, Lcom/google/android/gms/internal/ms;->d:Ljava/lang/Object;

    monitor-enter v11

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/im;

    iget-object v1, p0, Lcom/google/android/gms/internal/ms;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ms;->e:Lcom/google/android/gms/internal/pb;

    iget-object v2, v2, Lcom/google/android/gms/internal/pb;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v3, p0, Lcom/google/android/gms/internal/ms;->h:Lcom/google/android/gms/internal/ip;

    iget-object v4, p0, Lcom/google/android/gms/internal/ms;->j:Lcom/google/android/gms/internal/ie;

    iget-object v5, p0, Lcom/google/android/gms/internal/ms;->f:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-boolean v5, v5, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzth:Z

    sget-object v6, Lcom/google/android/gms/internal/cy;->am:Lcom/google/android/gms/internal/cq;

    .line 1000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbE()Lcom/google/android/gms/internal/cx;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cq;)Ljava/lang/Object;

    move-result-object v6

    .line 0
    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    iget-object v10, p0, Lcom/google/android/gms/internal/ms;->k:Lcom/google/android/gms/internal/dm;

    move-wide v6, p1

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/im;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/internal/ie;ZJJLcom/google/android/gms/internal/dm;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ms;->i:Lcom/google/android/gms/internal/ic;

    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ms;->i:Lcom/google/android/gms/internal/ic;

    iget-object v1, p0, Lcom/google/android/gms/internal/ms;->j:Lcom/google/android/gms/internal/ie;

    iget-object v1, v1, Lcom/google/android/gms/internal/ie;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ic;->a(Ljava/util/List;)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ms;->g:Lcom/google/android/gms/internal/ij;

    iget-object v0, p0, Lcom/google/android/gms/internal/ms;->g:Lcom/google/android/gms/internal/ij;

    iget v0, v0, Lcom/google/android/gms/internal/ij;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/gms/internal/mm;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected mediation result: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ms;->g:Lcom/google/android/gms/internal/ij;

    iget v2, v2, Lcom/google/android/gms/internal/ij;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/mm;-><init>(Ljava/lang/String;I)V

    throw v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_0
    new-instance v0, Lcom/google/android/gms/internal/mm;

    const-string v1, "No fill from any mediation ad networks."

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/mm;-><init>(Ljava/lang/String;I)V

    throw v0

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onStop()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ms;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-super {p0}, Lcom/google/android/gms/internal/mj;->onStop()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ms;->i:Lcom/google/android/gms/internal/ic;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ms;->i:Lcom/google/android/gms/internal/ic;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ic;->a()V

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
