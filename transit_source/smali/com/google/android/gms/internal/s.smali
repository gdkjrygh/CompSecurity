.class public final Lcom/google/android/gms/internal/s;
.super Ljava/lang/Object;


# instance fields
.field private final el:Ljava/lang/Runnable;

.field private em:Lcom/google/android/gms/internal/v;

.field private en:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/s;->en:Z

    new-instance v0, Lcom/google/android/gms/internal/s$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/s$1;-><init>(Lcom/google/android/gms/internal/s;Lcom/google/android/gms/internal/r;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/s;->el:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/s;)Lcom/google/android/gms/internal/v;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/s;->em:Lcom/google/android/gms/internal/v;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/s;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/s;->en:Z

    return p1
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/v;J)V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/s;->en:Z

    if-eqz v0, :cond_0

    const-string v0, "An ad refresh is already scheduled."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scheduling ad refresh "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " milliseconds from now."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/s;->em:Lcom/google/android/gms/internal/v;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/s;->en:Z

    sget-object v0, Lcom/google/android/gms/internal/cm;->hO:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/s;->el:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public cancel()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/cm;->hO:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/s;->el:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(Lcom/google/android/gms/internal/v;)V
    .locals 2

    const-wide/32 v0, 0xea60

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/internal/s;->a(Lcom/google/android/gms/internal/v;J)V

    return-void
.end method
