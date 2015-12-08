.class public final Lcom/google/android/gms/internal/hx;
.super Lcom/google/android/gms/internal/iy;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final a:Lcom/google/android/gms/internal/jf;


# instance fields
.field final b:I

.field private final c:Ljava/lang/String;

.field private final d:Landroid/os/Bundle;

.field private final e:Lcom/google/android/gms/internal/hz;

.field private final f:Lcom/google/android/gms/maps/model/LatLng;

.field private final g:F

.field private final h:Lcom/google/android/gms/maps/model/LatLngBounds;

.field private final i:Ljava/lang/String;

.field private final j:Landroid/net/Uri;

.field private final k:Z

.field private final l:F

.field private final m:I

.field private final n:J

.field private final o:Ljava/util/List;

.field private final p:Ljava/util/Map;

.field private final q:Ljava/util/TimeZone;

.field private r:Ljava/util/Locale;

.field private s:Lcom/google/android/gms/internal/jk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/jf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/hx;->a:Lcom/google/android/gms/internal/jf;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/util/List;Landroid/os/Bundle;Lcom/google/android/gms/internal/hz;Lcom/google/android/gms/maps/model/LatLng;FLcom/google/android/gms/maps/model/LatLngBounds;Ljava/lang/String;Landroid/net/Uri;ZFIJ)V
    .locals 6

    invoke-direct {p0}, Lcom/google/android/gms/internal/iy;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/hx;->b:I

    iput-object p2, p0, Lcom/google/android/gms/internal/hx;->c:Ljava/lang/String;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/hx;->o:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/internal/hx;->d:Landroid/os/Bundle;

    iput-object p5, p0, Lcom/google/android/gms/internal/hx;->e:Lcom/google/android/gms/internal/hz;

    iput-object p6, p0, Lcom/google/android/gms/internal/hx;->f:Lcom/google/android/gms/maps/model/LatLng;

    iput p7, p0, Lcom/google/android/gms/internal/hx;->g:F

    iput-object p8, p0, Lcom/google/android/gms/internal/hx;->h:Lcom/google/android/gms/maps/model/LatLngBounds;

    iput-object p9, p0, Lcom/google/android/gms/internal/hx;->i:Ljava/lang/String;

    move-object/from16 v0, p10

    iput-object v0, p0, Lcom/google/android/gms/internal/hx;->j:Landroid/net/Uri;

    move/from16 v0, p11

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hx;->k:Z

    move/from16 v0, p12

    iput v0, p0, Lcom/google/android/gms/internal/hx;->l:F

    move/from16 v0, p13

    iput v0, p0, Lcom/google/android/gms/internal/hx;->m:I

    move-wide/from16 v0, p14

    iput-wide v0, p0, Lcom/google/android/gms/internal/hx;->n:J

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p4}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/internal/ht;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ht;

    move-result-object v5

    invoke-virtual {p4, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/hx;->p:Ljava/util/Map;

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->i:Ljava/lang/String;

    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/hx;->q:Ljava/util/TimeZone;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/internal/hx;->r:Ljava/util/Locale;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/internal/hx;->s:Lcom/google/android/gms/internal/jk;

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/hx;->s:Lcom/google/android/gms/internal/jk;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hx;->s:Lcom/google/android/gms/internal/jk;

    new-instance v1, Lcom/google/android/gms/internal/je;

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->c:Ljava/lang/String;

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/je;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/jk;->a(Lcom/google/android/gms/internal/je;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "getId"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hx;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hx;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    const-string v0, "getTypes"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hx;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hx;->o:Ljava/util/List;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const-string v0, "getLatLng"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hx;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hx;->f:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public final d()F
    .locals 1

    const-string v0, "getLevelNumber"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hx;->a(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/gms/internal/hx;->g:F

    return v0
.end method

.method public final describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hx;->a:Lcom/google/android/gms/internal/jf;

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 1

    const-string v0, "getViewport"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hx;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hx;->h:Lcom/google/android/gms/maps/model/LatLngBounds;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/hx;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/hx;

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/hx;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->r:Ljava/util/Locale;

    iget-object v3, p1, Lcom/google/android/gms/internal/hx;->r:Ljava/util/Locale;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/gq;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-wide v2, p0, Lcom/google/android/gms/internal/hx;->n:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/hx;->n:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public final f()Landroid/net/Uri;
    .locals 1

    const-string v0, "getWebsiteUri"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hx;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hx;->j:Landroid/net/Uri;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    const-string v0, "isPermanentlyClosed"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hx;->a(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hx;->k:Z

    return v0
.end method

.method public final h()F
    .locals 1

    const-string v0, "getRating"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hx;->a(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/gms/internal/hx;->l:F

    return v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->r:Ljava/util/Locale;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/internal/hx;->n:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 1

    const-string v0, "getPriceLevel"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hx;->a(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/gms/internal/hx;->m:I

    return v0
.end method

.method public final j()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/hx;->n:J

    return-wide v0
.end method

.method public final k()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hx;->d:Landroid/os/Bundle;

    return-object v0
.end method

.method public final l()Lcom/google/android/gms/internal/hz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hx;->e:Lcom/google/android/gms/internal/hz;

    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hx;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/internal/gq;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "id"

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "localization"

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->e:Lcom/google/android/gms/internal/hz;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "locale"

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->r:Ljava/util/Locale;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "latlng"

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->f:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "levelNumber"

    iget v2, p0, Lcom/google/android/gms/internal/hx;->g:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "viewport"

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->h:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "timeZone"

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "websiteUri"

    iget-object v2, p0, Lcom/google/android/gms/internal/hx;->j:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "isPermanentlyClosed"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/hx;->k:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "priceLevel"

    iget v2, p0, Lcom/google/android/gms/internal/hx;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "timestampSecs"

    iget-wide v2, p0, Lcom/google/android/gms/internal/hx;->n:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gr;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hx;->a:Lcom/google/android/gms/internal/jf;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jf;->a(Lcom/google/android/gms/internal/hx;Landroid/os/Parcel;I)V

    return-void
.end method
