.class public final Lcom/google/android/gms/ads/internal/zzq;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private A:Z

.field final a:Ljava/lang/String;

.field final b:Lcom/google/android/gms/internal/ad;

.field c:Lcom/google/android/gms/ads/internal/zzq$zza;

.field public final context:Landroid/content/Context;

.field d:Lcom/google/android/gms/ads/internal/client/zzn;

.field e:Lcom/google/android/gms/ads/internal/client/zzo;

.field f:Lcom/google/android/gms/ads/internal/client/zzu;

.field g:Lcom/google/android/gms/ads/internal/client/zzv;

.field h:Lcom/google/android/gms/internal/li;

.field i:Lcom/google/android/gms/internal/lu;

.field j:Lcom/google/android/gms/internal/es;

.field k:Lcom/google/android/gms/internal/ev;

.field l:Lcom/google/android/gms/internal/wb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/wb",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ey;",
            ">;"
        }
    .end annotation
.end field

.field m:Lcom/google/android/gms/internal/wb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/wb",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/fb;",
            ">;"
        }
    .end annotation
.end field

.field n:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

.field o:Lcom/google/android/gms/internal/ds;

.field p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field q:Lcom/google/android/gms/ads/internal/purchase/zzk;

.field r:Landroid/view/View;

.field s:Z

.field t:Z

.field private u:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/pc;",
            ">;"
        }
    .end annotation
.end field

.field private v:I

.field private w:I

.field private x:Lcom/google/android/gms/internal/rc;

.field private y:Z

.field private z:Z

.field public zzqF:Lcom/google/android/gms/internal/ph;

.field public zzqH:I

.field public zzqh:Ljava/lang/String;

.field public final zzqj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field public zzql:Lcom/google/android/gms/internal/pj;

.field public zzqm:Lcom/google/android/gms/internal/mp;

.field public zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

.field public zzqo:Lcom/google/android/gms/internal/pa;

.field public zzqp:Lcom/google/android/gms/internal/pb;

.field public zzqq:Lcom/google/android/gms/internal/pc;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/zzq;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;B)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;B)V
    .locals 4

    const/4 v3, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqF:Lcom/google/android/gms/internal/ph;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->r:Landroid/view/View;

    iput v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqH:I

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->s:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->t:Z

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->u:Ljava/util/HashSet;

    iput v1, p0, Lcom/google/android/gms/ads/internal/zzq;->v:I

    iput v1, p0, Lcom/google/android/gms/ads/internal/zzq;->w:I

    iput-boolean v3, p0, Lcom/google/android/gms/ads/internal/zzq;->y:Z

    iput-boolean v3, p0, Lcom/google/android/gms/ads/internal/zzq;->z:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->A:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/cy;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzby()Lcom/google/android/gms/internal/pe;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/pe;->d()Lcom/google/android/gms/internal/dc;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/cy;->a()Ljava/util/List;

    move-result-object v0

    iget v1, p4, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzJv:I

    if-eqz v1, :cond_0

    iget v1, p4, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzJv:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzby()Lcom/google/android/gms/internal/pe;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/pe;->d()Lcom/google/android/gms/internal/dc;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/dc;->a(Ljava/util/List;)V

    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->a:Ljava/lang/String;

    iget-boolean v0, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    if-nez v0, :cond_2

    iget-boolean v0, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzth:Z

    if-eqz v0, :cond_3

    :cond_2
    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqh:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    new-instance v0, Lcom/google/android/gms/internal/ad;

    new-instance v1, Lcom/google/android/gms/ads/internal/g;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/internal/g;-><init>(Lcom/google/android/gms/ads/internal/zzq;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ad;-><init>(Lcom/google/android/gms/internal/w;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->b:Lcom/google/android/gms/internal/ad;

    new-instance v0, Lcom/google/android/gms/internal/rc;

    const-wide/16 v2, 0xc8

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/rc;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->x:Lcom/google/android/gms/internal/rc;

    new-instance v0, Lcom/google/android/gms/internal/wb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wb;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->m:Lcom/google/android/gms/internal/wb;

    return-void

    :cond_3
    new-instance v0, Lcom/google/android/gms/ads/internal/zzq$zza;

    invoke-direct {v0, p1, p0, p0}, Lcom/google/android/gms/ads/internal/zzq$zza;-><init>(Landroid/content/Context;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    iget v1, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->widthPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzq$zza;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    iget v1, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->heightPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzq$zza;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzq$zza;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 0
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v2, v2, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-eqz p1, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->x:Lcom/google/android/gms/internal/rc;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/rc;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v2, v2, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzja;->zzbY()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x2

    new-array v2, v2, [I

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/ads/internal/zzq$zza;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    aget v5, v2, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v3

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    aget v2, v2, v0

    invoke-virtual {v4, v5, v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v2

    iget v4, p0, Lcom/google/android/gms/ads/internal/zzq;->v:I

    if-ne v3, v4, :cond_3

    iget v4, p0, Lcom/google/android/gms/ads/internal/zzq;->w:I

    if-eq v2, v4, :cond_4

    :cond_3
    iput v3, p0, Lcom/google/android/gms/ads/internal/zzq;->v:I

    iput v2, p0, Lcom/google/android/gms/ads/internal/zzq;->w:I

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v2, v2, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/ads/internal/zzq;->v:I

    iget v4, p0, Lcom/google/android/gms/ads/internal/zzq;->w:I

    if-nez p1, :cond_6

    :goto_1
    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/internal/zzja;->zza(IIZ)V

    .line 1000
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq$zza;->getRootView()Landroid/view/View;

    move-result-object v0

    const v2, 0x1020002

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    invoke-virtual {v4, v2}, Lcom/google/android/gms/ads/internal/zzq$zza;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    invoke-virtual {v0, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    iget v0, v2, Landroid/graphics/Rect;->top:I

    iget v4, v3, Landroid/graphics/Rect;->top:I

    if-eq v0, v4, :cond_5

    iput-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzq;->y:Z

    :cond_5
    iget v0, v2, Landroid/graphics/Rect;->bottom:I

    iget v2, v3, Landroid/graphics/Rect;->bottom:I

    if-eq v0, v2, :cond_0

    iput-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzq;->z:Z

    goto/16 :goto_0

    :cond_6
    move v0, v1

    .line 0
    goto :goto_1
.end method


# virtual methods
.method public final destroy()V
    .locals 2

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzq;->zzbP()V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->e:Lcom/google/android/gms/ads/internal/client/zzo;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->f:Lcom/google/android/gms/ads/internal/client/zzu;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->i:Lcom/google/android/gms/internal/lu;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->h:Lcom/google/android/gms/internal/li;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->o:Lcom/google/android/gms/internal/ds;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->g:Lcom/google/android/gms/ads/internal/client/zzv;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zzq;->zzf(Z)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq$zza;->removeAllViews()V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzq;->zzbK()V

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzq;->zzbM()V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    return-void
.end method

.method public final onGlobalLayout()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/zzq;->a(Z)V

    return-void
.end method

.method public final onScrollChanged()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/zzq;->a(Z)V

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->A:Z

    return-void
.end method

.method public final zza(Ljava/util/HashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/pc;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzq;->u:Ljava/util/HashSet;

    return-void
.end method

.method public final zzbJ()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/pc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->u:Ljava/util/HashSet;

    return-object v0
.end method

.method public final zzbK()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->destroy()V

    :cond_0
    return-void
.end method

.method public final zzbL()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->stopLoading()V

    :cond_0
    return-void
.end method

.method public final zzbM()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/internal/pa;->m:Lcom/google/android/gms/internal/is;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/internal/pa;->m:Lcom/google/android/gms/internal/is;

    invoke-interface {v0}, Lcom/google/android/gms/internal/is;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not destroy mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final zzbN()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqH:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final zzbO()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqH:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final zzbP()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq$zza;->zzbP()V

    :cond_0
    return-void
.end method

.method public final zzbR()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->y:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->z:Z

    if-eqz v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->y:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->A:Z

    if-eqz v0, :cond_1

    const-string v0, "top-scrollable"

    goto :goto_0

    :cond_1
    const-string v0, "top-locked"

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->z:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzq;->A:Z

    if-eqz v0, :cond_3

    const-string v0, "bottom-scrollable"

    goto :goto_0

    :cond_3
    const-string v0, "bottom-locked"

    goto :goto_0

    :cond_4
    const-string v0, ""

    goto :goto_0
.end method

.method public final zzbS()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqq:Lcom/google/android/gms/internal/pc;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-wide v2, v1, Lcom/google/android/gms/internal/pa;->t:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/pc;->a(J)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqq:Lcom/google/android/gms/internal/pc;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-wide v2, v1, Lcom/google/android/gms/internal/pa;->u:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/pc;->b(J)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqq:Lcom/google/android/gms/internal/pc;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/pc;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqq:Lcom/google/android/gms/internal/pc;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/pa;->k:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/pc;->b(Z)V

    return-void
.end method

.method public final zzf(Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqH:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzq;->zzbL()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzql:Lcom/google/android/gms/internal/pj;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzql:Lcom/google/android/gms/internal/pj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/pj;->cancel()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqm:Lcom/google/android/gms/internal/mp;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqm:Lcom/google/android/gms/internal/mp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/mp;->cancel()V

    :cond_2
    if-eqz p1, :cond_3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    :cond_3
    return-void
.end method
