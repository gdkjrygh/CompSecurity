.class public final Lcom/google/android/gms/internal/kg;
.super Lcom/google/android/gms/internal/kp;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# static fields
.field static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Ljava/lang/String;

.field private c:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private final j:Ljava/lang/Object;

.field private final k:Lcom/google/android/gms/internal/ry;

.field private final l:Landroid/app/Activity;

.field private m:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/LinearLayout;

.field private p:Lcom/google/android/gms/internal/kq;

.field private q:Landroid/widget/PopupWindow;

.field private r:Landroid/widget/RelativeLayout;

.field private s:Landroid/view/ViewGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "top-left"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "top-right"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "top-center"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "center"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "bottom-left"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "bottom-right"

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const-string v3, "bottom-center"

    aput-object v3, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/google/android/gms/internal/kg;->a:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/kq;)V
    .locals 3

    const/4 v2, -0x1

    const/4 v1, 0x0

    const-string v0, "resize"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/kp;-><init>(Lcom/google/android/gms/internal/ry;Ljava/lang/String;)V

    const-string v0, "top-right"

    iput-object v0, p0, Lcom/google/android/gms/internal/kg;->b:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/kg;->c:Z

    iput v1, p0, Lcom/google/android/gms/internal/kg;->d:I

    iput v1, p0, Lcom/google/android/gms/internal/kg;->e:I

    iput v2, p0, Lcom/google/android/gms/internal/kg;->f:I

    iput v1, p0, Lcom/google/android/gms/internal/kg;->g:I

    iput v1, p0, Lcom/google/android/gms/internal/kg;->h:I

    iput v2, p0, Lcom/google/android/gms/internal/kg;->i:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/kg;->j:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ry;->e()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    iput-object p2, p0, Lcom/google/android/gms/internal/kg;->p:Lcom/google/android/gms/internal/kq;

    return-void
.end method

.method private b(II)V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/internal/qa;->c(Landroid/app/Activity;)[I

    move-result-object v0

    const/4 v1, 0x0

    aget v0, v0, v1

    sub-int v0, p2, v0

    iget v1, p0, Lcom/google/android/gms/internal/kg;->i:I

    iget v2, p0, Lcom/google/android/gms/internal/kg;->f:I

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/kg;->a(IIII)V

    return-void
.end method

.method private b()[I
    .locals 8

    .prologue
    const/16 v7, 0x32

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 0
    .line 4000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/internal/qa;->b(Landroid/app/Activity;)[I

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    invoke-static {v2}, Lcom/google/android/gms/internal/qa;->c(Landroid/app/Activity;)[I

    move-result-object v5

    aget v6, v0, v1

    aget v0, v0, v4

    iget v2, p0, Lcom/google/android/gms/internal/kg;->i:I

    if-lt v2, v7, :cond_0

    iget v2, p0, Lcom/google/android/gms/internal/kg;->i:I

    if-le v2, v6, :cond_1

    :cond_0
    const-string v0, "Width is too small or too large."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    move v0, v1

    .line 0
    :goto_0
    if-nez v0, :cond_8

    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 4000
    :cond_1
    iget v2, p0, Lcom/google/android/gms/internal/kg;->f:I

    if-lt v2, v7, :cond_2

    iget v2, p0, Lcom/google/android/gms/internal/kg;->f:I

    if-le v2, v0, :cond_3

    :cond_2
    const-string v0, "Height is too small or too large."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    :cond_3
    iget v2, p0, Lcom/google/android/gms/internal/kg;->f:I

    if-ne v2, v0, :cond_4

    iget v0, p0, Lcom/google/android/gms/internal/kg;->i:I

    if-ne v0, v6, :cond_4

    const-string v0, "Cannot resize to a full-screen ad."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    :cond_4
    iget-boolean v0, p0, Lcom/google/android/gms/internal/kg;->c:Z

    if-eqz v0, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->b:Ljava/lang/String;

    const/4 v0, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    :cond_5
    :goto_2
    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lcom/google/android/gms/internal/kg;->d:I

    iget v2, p0, Lcom/google/android/gms/internal/kg;->g:I

    add-int/2addr v0, v2

    iget v2, p0, Lcom/google/android/gms/internal/kg;->i:I

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x32

    iget v2, p0, Lcom/google/android/gms/internal/kg;->e:I

    iget v7, p0, Lcom/google/android/gms/internal/kg;->h:I

    add-int/2addr v2, v7

    :goto_3
    if-ltz v0, :cond_6

    add-int/lit8 v0, v0, 0x32

    if-gt v0, v6, :cond_6

    aget v0, v5, v1

    if-lt v2, v0, :cond_6

    add-int/lit8 v0, v2, 0x32

    aget v2, v5, v4

    if-le v0, v2, :cond_7

    :cond_6
    move v0, v1

    goto :goto_0

    :sswitch_0
    const-string v7, "top-left"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move v0, v1

    goto :goto_2

    :sswitch_1
    const-string v7, "top-center"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move v0, v4

    goto :goto_2

    :sswitch_2
    const-string v7, "center"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move v0, v3

    goto :goto_2

    :sswitch_3
    const-string v7, "bottom-left"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v0, 0x3

    goto :goto_2

    :sswitch_4
    const-string v7, "bottom-center"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v0, 0x4

    goto :goto_2

    :sswitch_5
    const-string v7, "bottom-right"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v0, 0x5

    goto :goto_2

    :pswitch_0
    iget v0, p0, Lcom/google/android/gms/internal/kg;->d:I

    iget v2, p0, Lcom/google/android/gms/internal/kg;->g:I

    add-int/2addr v0, v2

    iget v2, p0, Lcom/google/android/gms/internal/kg;->e:I

    iget v7, p0, Lcom/google/android/gms/internal/kg;->h:I

    add-int/2addr v2, v7

    goto :goto_3

    :pswitch_1
    iget v0, p0, Lcom/google/android/gms/internal/kg;->d:I

    iget v2, p0, Lcom/google/android/gms/internal/kg;->g:I

    add-int/2addr v0, v2

    iget v2, p0, Lcom/google/android/gms/internal/kg;->i:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x19

    iget v2, p0, Lcom/google/android/gms/internal/kg;->e:I

    iget v7, p0, Lcom/google/android/gms/internal/kg;->h:I

    add-int/2addr v2, v7

    goto :goto_3

    :pswitch_2
    iget v0, p0, Lcom/google/android/gms/internal/kg;->d:I

    iget v2, p0, Lcom/google/android/gms/internal/kg;->g:I

    add-int/2addr v0, v2

    iget v2, p0, Lcom/google/android/gms/internal/kg;->i:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x19

    iget v2, p0, Lcom/google/android/gms/internal/kg;->e:I

    iget v7, p0, Lcom/google/android/gms/internal/kg;->h:I

    add-int/2addr v2, v7

    iget v7, p0, Lcom/google/android/gms/internal/kg;->f:I

    div-int/lit8 v7, v7, 0x2

    add-int/2addr v2, v7

    add-int/lit8 v2, v2, -0x19

    goto/16 :goto_3

    :pswitch_3
    iget v0, p0, Lcom/google/android/gms/internal/kg;->d:I

    iget v2, p0, Lcom/google/android/gms/internal/kg;->g:I

    add-int/2addr v0, v2

    iget v2, p0, Lcom/google/android/gms/internal/kg;->e:I

    iget v7, p0, Lcom/google/android/gms/internal/kg;->h:I

    add-int/2addr v2, v7

    iget v7, p0, Lcom/google/android/gms/internal/kg;->f:I

    add-int/2addr v2, v7

    add-int/lit8 v2, v2, -0x32

    goto/16 :goto_3

    :pswitch_4
    iget v0, p0, Lcom/google/android/gms/internal/kg;->d:I

    iget v2, p0, Lcom/google/android/gms/internal/kg;->g:I

    add-int/2addr v0, v2

    iget v2, p0, Lcom/google/android/gms/internal/kg;->i:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x19

    iget v2, p0, Lcom/google/android/gms/internal/kg;->e:I

    iget v7, p0, Lcom/google/android/gms/internal/kg;->h:I

    add-int/2addr v2, v7

    iget v7, p0, Lcom/google/android/gms/internal/kg;->f:I

    add-int/2addr v2, v7

    add-int/lit8 v2, v2, -0x32

    goto/16 :goto_3

    :pswitch_5
    iget v0, p0, Lcom/google/android/gms/internal/kg;->d:I

    iget v2, p0, Lcom/google/android/gms/internal/kg;->g:I

    add-int/2addr v0, v2

    iget v2, p0, Lcom/google/android/gms/internal/kg;->i:I

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x32

    iget v2, p0, Lcom/google/android/gms/internal/kg;->e:I

    iget v7, p0, Lcom/google/android/gms/internal/kg;->h:I

    add-int/2addr v2, v7

    iget v7, p0, Lcom/google/android/gms/internal/kg;->f:I

    add-int/2addr v2, v7

    add-int/lit8 v2, v2, -0x32

    goto/16 :goto_3

    :cond_7
    move v0, v4

    goto/16 :goto_0

    .line 0
    :cond_8
    iget-boolean v0, p0, Lcom/google/android/gms/internal/kg;->c:Z

    if-eqz v0, :cond_9

    new-array v0, v3, [I

    iget v2, p0, Lcom/google/android/gms/internal/kg;->d:I

    iget v3, p0, Lcom/google/android/gms/internal/kg;->g:I

    add-int/2addr v2, v3

    aput v2, v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/kg;->e:I

    iget v2, p0, Lcom/google/android/gms/internal/kg;->h:I

    add-int/2addr v1, v2

    aput v1, v0, v4

    goto/16 :goto_1

    :cond_9
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/internal/qa;->b(Landroid/app/Activity;)[I

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    invoke-static {v2}, Lcom/google/android/gms/internal/qa;->c(Landroid/app/Activity;)[I

    move-result-object v5

    aget v6, v0, v1

    iget v0, p0, Lcom/google/android/gms/internal/kg;->d:I

    iget v2, p0, Lcom/google/android/gms/internal/kg;->g:I

    add-int/2addr v0, v2

    iget v2, p0, Lcom/google/android/gms/internal/kg;->e:I

    iget v7, p0, Lcom/google/android/gms/internal/kg;->h:I

    add-int/2addr v2, v7

    if-gez v0, :cond_c

    move v0, v1

    :cond_a
    :goto_4
    aget v6, v5, v1

    if-ge v2, v6, :cond_d

    aget v2, v5, v1

    :cond_b
    :goto_5
    new-array v3, v3, [I

    aput v0, v3, v1

    aput v2, v3, v4

    move-object v0, v3

    goto/16 :goto_1

    :cond_c
    iget v7, p0, Lcom/google/android/gms/internal/kg;->i:I

    add-int/2addr v7, v0

    if-le v7, v6, :cond_a

    iget v0, p0, Lcom/google/android/gms/internal/kg;->i:I

    sub-int v0, v6, v0

    goto :goto_4

    :cond_d
    iget v6, p0, Lcom/google/android/gms/internal/kg;->f:I

    add-int/2addr v6, v2

    aget v7, v5, v4

    if-le v6, v7, :cond_b

    aget v2, v5, v4

    iget v5, p0, Lcom/google/android/gms/internal/kg;->f:I

    sub-int/2addr v2, v5

    goto :goto_5

    .line 4000
    nop

    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_2
        -0x3c587281 -> :sswitch_0
        -0x27103597 -> :sswitch_3
        0x455fe3fa -> :sswitch_5
        0x4ccee637 -> :sswitch_4
        0x68a23bcd -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public final a(II)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/kg;->d:I

    iput p2, p0, Lcom/google/android/gms/internal/kg;->e:I

    return-void
.end method

.method public final a(IIZ)V
    .locals 7

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/kg;->d:I

    iput p2, p0, Lcom/google/android/gms/internal/kg;->e:I

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    if-eqz p3, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/kg;->b()[I

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    const/4 v5, 0x0

    aget v5, v0, v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/content/Context;I)I

    move-result v3

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    const/4 v6, 0x1

    aget v6, v0, v6

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/content/Context;I)I

    move-result v4

    iget-object v5, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v5

    iget-object v6, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    invoke-virtual {v6}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v6

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/widget/PopupWindow;->update(IIII)V

    const/4 v2, 0x0

    aget v2, v0, v2

    const/4 v3, 0x1

    aget v0, v0, v3

    invoke-direct {p0, v2, v0}, Lcom/google/android/gms/internal/kg;->b(II)V

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/kg;->a(Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, -0x1

    const/4 v5, 0x1

    const/4 v3, 0x0

    .line 0
    iget-object v6, p0, Lcom/google/android/gms/internal/kg;->j:Ljava/lang/Object;

    monitor-enter v6

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    if-nez v1, :cond_0

    const-string v1, "Not an activity context. Cannot resize."

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/kg;->a(Ljava/lang/String;)V

    monitor-exit v6

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "Webview is not yet available, size is not set."

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/kg;->a(Ljava/lang/String;)V

    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    if-eqz v1, :cond_2

    const-string v1, "Is interstitial. Cannot resize an interstitial."

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/kg;->a(Ljava/lang/String;)V

    monitor-exit v6

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->o()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "Cannot resize an expanded banner."

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/kg;->a(Ljava/lang/String;)V

    monitor-exit v6

    goto :goto_0

    .line 1000
    :cond_3
    const-string v1, "width"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    const-string v1, "width"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/qa;->b(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/kg;->i:I

    :cond_4
    const-string v1, "height"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    const-string v1, "height"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/qa;->b(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/kg;->f:I

    :cond_5
    const-string v1, "offsetX"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    const-string v1, "offsetX"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/qa;->b(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/kg;->g:I

    :cond_6
    const-string v1, "offsetY"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    const-string v1, "offsetY"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/qa;->b(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/kg;->h:I

    :cond_7
    const-string v1, "allowOffscreen"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    const-string v1, "allowOffscreen"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/kg;->c:Z

    :cond_8
    const-string v1, "customClosePosition"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    iput-object v1, p0, Lcom/google/android/gms/internal/kg;->b:Ljava/lang/String;

    .line 2000
    :cond_9
    iget v1, p0, Lcom/google/android/gms/internal/kg;->i:I

    if-ltz v1, :cond_a

    iget v1, p0, Lcom/google/android/gms/internal/kg;->f:I

    if-ltz v1, :cond_a

    move v1, v5

    .line 0
    :goto_1
    if-nez v1, :cond_b

    const-string v1, "Invalid width and height options. Cannot resize."

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/kg;->a(Ljava/lang/String;)V

    monitor-exit v6

    goto/16 :goto_0

    :cond_a
    move v1, v3

    .line 2000
    goto :goto_1

    .line 0
    :cond_b
    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_d

    :cond_c
    const-string v1, "Activity context is not ready, cannot get window or decor view."

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/kg;->a(Ljava/lang/String;)V

    monitor-exit v6

    goto/16 :goto_0

    :cond_d
    invoke-direct {p0}, Lcom/google/android/gms/internal/kg;->b()[I

    move-result-object v8

    if-nez v8, :cond_e

    const-string v1, "Resize location out of screen or close button is not visible."

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/kg;->a(Ljava/lang/String;)V

    monitor-exit v6

    goto/16 :goto_0

    :cond_e
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    iget v9, p0, Lcom/google/android/gms/internal/kg;->i:I

    invoke-virtual {v1, v2, v9}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/content/Context;I)I

    move-result v9

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    iget v10, p0, Lcom/google/android/gms/internal/kg;->f:I

    invoke-virtual {v1, v2, v10}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/content/Context;I)I

    move-result v10

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_12

    instance-of v1, v2, Landroid/view/ViewGroup;

    if-eqz v1, :cond_12

    move-object v0, v2

    check-cast v0, Landroid/view/ViewGroup;

    move-object v1, v0

    iget-object v11, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v11}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v11

    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    if-nez v1, :cond_11

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/google/android/gms/internal/kg;->s:Landroid/view/ViewGroup;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/qa;->a(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v1

    new-instance v2, Landroid/widget/ImageView;

    iget-object v11, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    invoke-direct {v2, v11}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/kg;->n:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->n:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/kg;->m:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->s:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->n:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :goto_2
    new-instance v1, Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/kg;->r:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->r:Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->r:Landroid/widget/RelativeLayout;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v9, v10}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->r:Landroid/widget/RelativeLayout;

    invoke-static {v1, v9, v10}, Lcom/google/android/gms/internal/qa;->a(Landroid/view/View;II)Landroid/widget/PopupWindow;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/kg;->c:Z

    if-nez v1, :cond_13

    move v1, v5

    :goto_3
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->r:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v2

    const/4 v9, -0x1

    const/4 v10, -0x1

    invoke-virtual {v1, v2, v9, v10}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    new-instance v1, Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/kg;->o:Landroid/widget/LinearLayout;

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v1

    iget-object v9, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    const/16 v10, 0x32

    invoke-virtual {v1, v9, v10}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/content/Context;I)I

    move-result v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v9

    iget-object v10, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    const/16 v11, 0x32

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/content/Context;I)I

    move-result v9

    invoke-direct {v2, v1, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v9

    sparse-switch v9, :sswitch_data_0

    :cond_f
    move v1, v4

    :goto_4
    packed-switch v1, :pswitch_data_0

    const/16 v1, 0xa

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0xb

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    :goto_5
    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->o:Landroid/widget/LinearLayout;

    new-instance v3, Lcom/google/android/gms/internal/kh;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/kh;-><init>(Lcom/google/android/gms/internal/kg;)V

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->o:Landroid/widget/LinearLayout;

    const-string v3, "Close button"

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->r:Landroid/widget/RelativeLayout;

    iget-object v3, p0, Lcom/google/android/gms/internal/kg;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    invoke-virtual {v7}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    const/4 v7, 0x0

    aget v7, v8, v7

    invoke-virtual {v4, v5, v7}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/content/Context;I)I

    move-result v4

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v5

    iget-object v7, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    const/4 v9, 0x1

    aget v9, v8, v9

    invoke-virtual {v5, v7, v9}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, 0x0

    :try_start_3
    aget v1, v8, v1

    const/4 v2, 0x1

    aget v2, v8, v2

    .line 3000
    iget-object v3, p0, Lcom/google/android/gms/internal/kg;->p:Lcom/google/android/gms/internal/kq;

    if-eqz v3, :cond_10

    iget-object v3, p0, Lcom/google/android/gms/internal/kg;->p:Lcom/google/android/gms/internal/kq;

    iget v4, p0, Lcom/google/android/gms/internal/kg;->i:I

    iget v5, p0, Lcom/google/android/gms/internal/kg;->f:I

    invoke-interface {v3, v1, v2, v4, v5}, Lcom/google/android/gms/internal/kq;->zza(IIII)V

    .line 0
    :cond_10
    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    new-instance v2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v3, p0, Lcom/google/android/gms/internal/kg;->l:Landroid/app/Activity;

    new-instance v4, Lcom/google/android/gms/ads/AdSize;

    iget v5, p0, Lcom/google/android/gms/internal/kg;->i:I

    iget v7, p0, Lcom/google/android/gms/internal/kg;->f:I

    invoke-direct {v4, v5, v7}, Lcom/google/android/gms/ads/AdSize;-><init>(II)V

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ry;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V

    const/4 v1, 0x0

    aget v1, v8, v1

    const/4 v2, 0x1

    aget v2, v8, v2

    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/kg;->b(II)V

    const-string v1, "resized"

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/kg;->c(Ljava/lang/String;)V

    monitor-exit v6

    goto/16 :goto_0

    :cond_11
    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    goto/16 :goto_2

    :cond_12
    const-string v1, "Webview is detached, probably in the middle of a resize or expand."

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/kg;->a(Ljava/lang/String;)V

    monitor-exit v6

    goto/16 :goto_0

    :cond_13
    move v1, v3

    goto/16 :goto_3

    :sswitch_0
    const-string v5, "top-left"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    move v1, v3

    goto/16 :goto_4

    :sswitch_1
    const-string v3, "top-center"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    move v1, v5

    goto/16 :goto_4

    :sswitch_2
    const-string v3, "center"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    const/4 v1, 0x2

    goto/16 :goto_4

    :sswitch_3
    const-string v3, "bottom-left"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    const/4 v1, 0x3

    goto/16 :goto_4

    :sswitch_4
    const-string v3, "bottom-center"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    const/4 v1, 0x4

    goto/16 :goto_4

    :sswitch_5
    const-string v3, "bottom-right"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    const/4 v1, 0x5

    goto/16 :goto_4

    :pswitch_0
    const/16 v1, 0xa

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0x9

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto/16 :goto_5

    :pswitch_1
    const/16 v1, 0xa

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0xe

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto/16 :goto_5

    :pswitch_2
    const/16 v1, 0xd

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto/16 :goto_5

    :pswitch_3
    const/16 v1, 0xc

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0x9

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto/16 :goto_5

    :pswitch_4
    const/16 v1, 0xc

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0xe

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto/16 :goto_5

    :pswitch_5
    const/16 v1, 0xc

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0xb

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto/16 :goto_5

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot show popup window: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/kg;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->r:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->s:Landroid/view/ViewGroup;

    if-eqz v1, :cond_14

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->s:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->n:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->s:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->m:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ry;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V

    :cond_14
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_2
        -0x3c587281 -> :sswitch_0
        -0x27103597 -> :sswitch_3
        0x455fe3fa -> :sswitch_5
        0x4ccee637 -> :sswitch_4
        0x68a23bcd -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final a(Z)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->r:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->s:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->s:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->s:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->k:Lcom/google/android/gms/internal/ry;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->m:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ry;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V

    :cond_0
    if-eqz p1, :cond_1

    const-string v0, "default"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/kg;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->p:Lcom/google/android/gms/internal/kq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->p:Lcom/google/android/gms/internal/kq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/kq;->zzbc()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/kg;->r:Landroid/widget/RelativeLayout;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/kg;->s:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/kg;->o:Landroid/widget/LinearLayout;

    :cond_2
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->q:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
