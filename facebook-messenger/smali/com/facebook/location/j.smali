.class public Lcom/facebook/location/j;
.super Lcom/google/common/d/a/a;
.source "GetDeviceLocationExecutor.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/d/a/a",
        "<",
        "Landroid/location/Location;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/location/h;

.field private final b:Lcom/facebook/location/GetDeviceLocationParams;

.field private final c:Lcom/facebook/location/m;

.field private final d:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/facebook/fbservice/service/g;

.field private f:Landroid/location/Location;

.field private g:Landroid/location/Location;

.field private h:Z

.field private i:Z

.field private j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/debug/d/e;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private l:Z


# direct methods
.method constructor <init>(Lcom/facebook/location/h;Lcom/facebook/location/GetDeviceLocationParams;Lcom/facebook/fbservice/service/g;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 75
    iput-object p1, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    invoke-direct {p0}, Lcom/google/common/d/a/a;-><init>()V

    .line 71
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/j;->j:Ljava/util/Map;

    .line 72
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/j;->k:Ljava/util/Map;

    .line 76
    iput-object p2, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    .line 77
    new-instance v0, Lcom/facebook/location/m;

    invoke-direct {v0, p0, v4}, Lcom/facebook/location/m;-><init>(Lcom/facebook/location/j;Lcom/facebook/location/i;)V

    iput-object v0, p0, Lcom/facebook/location/j;->c:Lcom/facebook/location/m;

    .line 78
    iput-object p3, p0, Lcom/facebook/location/j;->e:Lcom/facebook/fbservice/service/g;

    .line 80
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v1

    .line 81
    iget-object v0, p2, Lcom/facebook/location/GetDeviceLocationParams;->j:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 82
    invoke-static {p1}, Lcom/facebook/location/h;->a(Lcom/facebook/location/h;)Landroid/location/LocationManager;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 83
    invoke-virtual {v1, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 86
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/j;->d:Lcom/google/common/a/fi;

    .line 88
    invoke-direct {p0}, Lcom/facebook/location/j;->a()Landroid/location/Location;

    move-result-object v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    invoke-direct {p0, v0}, Lcom/facebook/location/j;->a(Landroid/location/Location;)V

    .line 93
    :cond_2
    iget-boolean v0, p0, Lcom/facebook/location/j;->i:Z

    if-eqz v0, :cond_3

    .line 126
    :goto_1
    return-void

    .line 97
    :cond_3
    iget-wide v0, p2, Lcom/facebook/location/GetDeviceLocationParams;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 98
    iget-object v0, p0, Lcom/facebook/location/j;->g:Landroid/location/Location;

    invoke-direct {p0, v0}, Lcom/facebook/location/j;->d(Landroid/location/Location;)V

    goto :goto_1

    .line 102
    :cond_4
    iget-object v0, p0, Lcom/facebook/location/j;->d:Lcom/google/common/a/fi;

    invoke-virtual {v0}, Lcom/google/common/a/fi;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 103
    invoke-static {}, Lcom/facebook/location/h;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "None of the desired location providers are supported."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 104
    invoke-direct {p0, v4}, Lcom/facebook/location/j;->d(Landroid/location/Location;)V

    goto :goto_1

    .line 108
    :cond_5
    invoke-static {p1}, Lcom/facebook/location/h;->b(Lcom/facebook/location/h;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lcom/facebook/location/k;

    invoke-direct {v1, p0, p1}, Lcom/facebook/location/k;-><init>(Lcom/facebook/location/j;Lcom/facebook/location/h;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 120
    invoke-static {p1}, Lcom/facebook/location/h;->b(Lcom/facebook/location/h;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lcom/facebook/location/l;

    invoke-direct {v1, p0, p1}, Lcom/facebook/location/l;-><init>(Lcom/facebook/location/j;Lcom/facebook/location/h;)V

    iget-wide v2, p2, Lcom/facebook/location/GetDeviceLocationParams;->a:J

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_1
.end method

.method private a()Landroid/location/Location;
    .locals 5

    .prologue
    .line 158
    iget-object v0, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget-boolean v0, v0, Lcom/facebook/location/GetDeviceLocationParams;->k:Z

    if-eqz v0, :cond_1

    .line 159
    const/4 v1, 0x0

    .line 174
    :cond_0
    return-object v1

    .line 164
    :cond_1
    iget-object v0, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    invoke-static {v0}, Lcom/facebook/location/h;->a(Lcom/facebook/location/h;)Landroid/location/LocationManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    move-result-object v1

    .line 166
    iget-object v0, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    invoke-static {v0}, Lcom/facebook/location/h;->c(Lcom/facebook/location/h;)Lcom/facebook/location/r;

    move-result-object v0

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v2, v3}, Lcom/facebook/location/r;->a(J)Landroid/location/Location;

    move-result-object v0

    .line 168
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 169
    iget-object v3, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    invoke-static {v3}, Lcom/facebook/location/h;->a(Lcom/facebook/location/h;)Landroid/location/LocationManager;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0

    .line 170
    iget-object v3, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    iget-object v4, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    invoke-virtual {v3, v0, v1, v4}, Lcom/facebook/location/h;->a(Landroid/location/Location;Landroid/location/Location;Lcom/facebook/location/GetDeviceLocationParams;)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    move-object v1, v0

    .line 173
    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/location/j;)Lcom/google/common/a/fi;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/location/j;->d:Lcom/google/common/a/fi;

    return-object v0
.end method

.method private a(Landroid/location/Location;)V
    .locals 5

    .prologue
    .line 205
    iget-object v0, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    iget-object v1, p0, Lcom/facebook/location/j;->g:Landroid/location/Location;

    iget-object v2, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    invoke-virtual {v0, p1, v1, v2}, Lcom/facebook/location/h;->a(Landroid/location/Location;Landroid/location/Location;Lcom/facebook/location/GetDeviceLocationParams;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    invoke-static {}, Lcom/facebook/location/h;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Got better location: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    invoke-static {v4, p1}, Lcom/facebook/location/h;->a(Lcom/facebook/location/h;Landroid/location/Location;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    iput-object p1, p0, Lcom/facebook/location/j;->g:Landroid/location/Location;

    .line 208
    iget-object v0, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    invoke-static {v0}, Lcom/facebook/location/h;->c(Lcom/facebook/location/h;)Lcom/facebook/location/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/location/r;->a(Landroid/location/Location;)V

    .line 209
    invoke-direct {p0, p1}, Lcom/facebook/location/j;->b(Landroid/location/Location;)V

    .line 211
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/location/j;Landroid/location/Location;)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0, p1}, Lcom/facebook/location/j;->a(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/location/j;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0, p1}, Lcom/facebook/location/j;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 178
    iget-boolean v0, p0, Lcom/facebook/location/j;->i:Z

    if-eqz v0, :cond_0

    .line 191
    :goto_0
    return-void

    .line 181
    :cond_0
    const-string v0, "tracer for %s provider"

    new-array v1, v6, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 184
    iget-object v1, p0, Lcom/facebook/location/j;->j:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    iget-object v0, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    invoke-static {v0}, Lcom/facebook/location/h;->a(Lcom/facebook/location/h;)Landroid/location/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget-wide v2, v1, Lcom/facebook/location/GetDeviceLocationParams;->d:J

    iget-object v1, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget v4, v1, Lcom/facebook/location/GetDeviceLocationParams;->e:F

    iget-object v5, p0, Lcom/facebook/location/j;->c:Lcom/facebook/location/m;

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 190
    iput-boolean v6, p0, Lcom/facebook/location/j;->h:Z

    goto :goto_0
.end method

.method private b()V
    .locals 5

    .prologue
    .line 194
    invoke-static {}, Lcom/facebook/location/h;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Unregistering location updates"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    invoke-static {v0}, Lcom/facebook/location/h;->a(Lcom/facebook/location/h;)Landroid/location/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/location/j;->c:Lcom/facebook/location/m;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 196
    iget-object v0, p0, Lcom/facebook/location/j;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 197
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 198
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/debug/d/e;

    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    move-result-wide v3

    .line 199
    iget-object v0, p0, Lcom/facebook/location/j;->k:Ljava/util/Map;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 201
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/location/j;->h:Z

    .line 202
    return-void
.end method

.method private b(Landroid/location/Location;)V
    .locals 1

    .prologue
    .line 222
    invoke-direct {p0, p1}, Lcom/facebook/location/j;->e(Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    invoke-direct {p0, p1}, Lcom/facebook/location/j;->c(Landroid/location/Location;)V

    .line 225
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/location/j;->h(Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 226
    invoke-direct {p0, p1}, Lcom/facebook/location/j;->d(Landroid/location/Location;)V

    .line 228
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/facebook/location/j;)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/facebook/location/j;->e()V

    return-void
.end method

.method private c(Landroid/location/Location;)V
    .locals 2

    .prologue
    .line 234
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    iget-object v0, p0, Lcom/facebook/location/j;->e:Lcom/facebook/fbservice/service/g;

    if-nez v0, :cond_0

    .line 240
    :goto_0
    return-void

    .line 238
    :cond_0
    iput-object p1, p0, Lcom/facebook/location/j;->f:Landroid/location/Location;

    .line 239
    iget-object v0, p0, Lcom/facebook/location/j;->e:Lcom/facebook/fbservice/service/g;

    invoke-static {p1}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/service/g;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    goto :goto_0
.end method

.method private d(Landroid/location/Location;)V
    .locals 1

    .prologue
    .line 247
    iget-boolean v0, p0, Lcom/facebook/location/j;->h:Z

    if-eqz v0, :cond_0

    .line 248
    invoke-direct {p0}, Lcom/facebook/location/j;->b()V

    .line 250
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/location/j;->i:Z

    .line 251
    invoke-virtual {p0, p1}, Lcom/facebook/location/j;->a_(Ljava/lang/Object;)Z

    .line 252
    return-void
.end method

.method private e()V
    .locals 1

    .prologue
    .line 214
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/location/j;->l:Z

    .line 215
    iget-object v0, p0, Lcom/facebook/location/j;->g:Landroid/location/Location;

    invoke-direct {p0, v0}, Lcom/facebook/location/j;->d(Landroid/location/Location;)V

    .line 216
    return-void
.end method

.method private e(Landroid/location/Location;)Z
    .locals 1

    .prologue
    .line 258
    invoke-direct {p0, p1}, Lcom/facebook/location/j;->f(Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/facebook/location/j;->g(Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private f(Landroid/location/Location;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 266
    if-nez p1, :cond_1

    .line 273
    :cond_0
    :goto_0
    return v0

    .line 269
    :cond_1
    iget-object v1, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget-wide v1, v1, Lcom/facebook/location/GetDeviceLocationParams;->b:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    invoke-static {v1, p1}, Lcom/facebook/location/h;->b(Lcom/facebook/location/h;Landroid/location/Location;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget-wide v3, v3, Lcom/facebook/location/GetDeviceLocationParams;->b:J

    cmp-long v1, v1, v3

    if-gtz v1, :cond_0

    .line 273
    :cond_2
    iget-object v1, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget v1, v1, Lcom/facebook/location/GetDeviceLocationParams;->c:F

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Landroid/location/Location;->hasAccuracy()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    iget-object v2, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget v2, v2, Lcom/facebook/location/GetDeviceLocationParams;->c:F

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_0

    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private g(Landroid/location/Location;)Z
    .locals 4

    .prologue
    .line 282
    iget-object v0, p0, Lcom/facebook/location/j;->f:Landroid/location/Location;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/location/j;->f:Landroid/location/Location;

    invoke-virtual {p1, v0}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v0

    iget-object v1, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget v1, v1, Lcom/facebook/location/GetDeviceLocationParams;->e:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/location/j;->f:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget-wide v2, v2, Lcom/facebook/location/GetDeviceLocationParams;->d:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private h(Landroid/location/Location;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 291
    if-nez p1, :cond_1

    .line 298
    :cond_0
    :goto_0
    return v0

    .line 294
    :cond_1
    iget-object v1, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget-wide v1, v1, Lcom/facebook/location/GetDeviceLocationParams;->f:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/location/j;->a:Lcom/facebook/location/h;

    invoke-static {v1, p1}, Lcom/facebook/location/h;->b(Lcom/facebook/location/h;Landroid/location/Location;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget-wide v3, v3, Lcom/facebook/location/GetDeviceLocationParams;->f:J

    cmp-long v1, v1, v3

    if-gtz v1, :cond_0

    .line 298
    :cond_2
    iget-object v1, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget v1, v1, Lcom/facebook/location/GetDeviceLocationParams;->g:F

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Landroid/location/Location;->hasAccuracy()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    iget-object v2, p0, Lcom/facebook/location/j;->b:Lcom/facebook/location/GetDeviceLocationParams;

    iget v2, v2, Lcom/facebook/location/GetDeviceLocationParams;->g:F

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_0

    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method
