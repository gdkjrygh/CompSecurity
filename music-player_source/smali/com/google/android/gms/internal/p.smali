.class public final Lcom/google/android/gms/internal/p;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private final b:Ljava/util/Date;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Ljava/util/Set;

.field private final f:Landroid/location/Location;

.field private final g:Z

.field private final h:Ljava/util/Map;

.field private final i:Ljava/lang/String;

.field private final j:Lcom/google/android/gms/ads/search/a;

.field private final k:I

.field private final l:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "emulator"

    invoke-static {v0}, Lcom/google/android/gms/internal/eh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/p;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/q;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/p;-><init>(Lcom/google/android/gms/internal/q;B)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/q;B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/q;->a(Lcom/google/android/gms/internal/q;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/p;->b:Ljava/util/Date;

    invoke-static {p1}, Lcom/google/android/gms/internal/q;->b(Lcom/google/android/gms/internal/q;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/p;->c:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/q;->c(Lcom/google/android/gms/internal/q;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/p;->d:I

    invoke-static {p1}, Lcom/google/android/gms/internal/q;->d(Lcom/google/android/gms/internal/q;)Ljava/util/HashSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/p;->e:Ljava/util/Set;

    invoke-static {p1}, Lcom/google/android/gms/internal/q;->e(Lcom/google/android/gms/internal/q;)Landroid/location/Location;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/p;->f:Landroid/location/Location;

    invoke-static {p1}, Lcom/google/android/gms/internal/q;->f(Lcom/google/android/gms/internal/q;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/p;->g:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/q;->g(Lcom/google/android/gms/internal/q;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/p;->h:Ljava/util/Map;

    invoke-static {p1}, Lcom/google/android/gms/internal/q;->h(Lcom/google/android/gms/internal/q;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/p;->i:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/p;->j:Lcom/google/android/gms/ads/search/a;

    invoke-static {p1}, Lcom/google/android/gms/internal/q;->i(Lcom/google/android/gms/internal/q;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/p;->k:I

    invoke-static {p1}, Lcom/google/android/gms/internal/q;->j(Lcom/google/android/gms/internal/q;)Ljava/util/HashSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/p;->l:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/android/gms/ads/b/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/p;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/b/a;

    return-object v0
.end method

.method public final a()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/p;->b:Ljava/util/Date;

    return-object v0
.end method

.method public final a(Landroid/content/Context;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/p;->l:Ljava/util/Set;

    invoke-static {p1}, Lcom/google/android/gms/internal/eh;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/p;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/p;->d:I

    return v0
.end method

.method public final d()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/p;->e:Ljava/util/Set;

    return-object v0
.end method

.method public final e()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/p;->f:Landroid/location/Location;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/p;->g:Z

    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/p;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Lcom/google/android/gms/ads/search/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/p;->j:Lcom/google/android/gms/ads/search/a;

    return-object v0
.end method

.method public final i()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/p;->h:Ljava/util/Map;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/p;->k:I

    return v0
.end method
