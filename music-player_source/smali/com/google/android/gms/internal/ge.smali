.class final Lcom/google/android/gms/internal/ge;
.super Ljava/lang/Object;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/gd;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/gf;

.field private final d:Ljava/util/HashSet;

.field private e:I

.field private f:Z

.field private g:Landroid/os/IBinder;

.field private h:Landroid/content/ComponentName;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gd;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ge;->a:Lcom/google/android/gms/internal/gd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ge;->b:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/gf;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/gf;-><init>(Lcom/google/android/gms/internal/ge;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ge;->c:Lcom/google/android/gms/internal/gf;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ge;->d:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ge;->e:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ge;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ge;->e:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ge;Landroid/content/ComponentName;)Landroid/content/ComponentName;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ge;->h:Landroid/content/ComponentName;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ge;Landroid/os/IBinder;)Landroid/os/IBinder;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ge;->g:Landroid/os/IBinder;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ge;)Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ge;->d:Ljava/util/HashSet;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/gf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ge;->c:Lcom/google/android/gms/internal/gf;

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/fw;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ge;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ge;->f:Z

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ge;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b(Lcom/google/android/gms/internal/fw;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ge;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ge;->f:Z

    return v0
.end method

.method public final c(Lcom/google/android/gms/internal/fw;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ge;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ge;->e:I

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ge;->d:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final f()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ge;->g:Landroid/os/IBinder;

    return-object v0
.end method

.method public final g()Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ge;->h:Landroid/content/ComponentName;

    return-object v0
.end method
