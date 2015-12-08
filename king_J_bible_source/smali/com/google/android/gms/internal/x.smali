.class public final Lcom/google/android/gms/internal/x;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/x$a;
    }
.end annotation


# instance fields
.field private final kV:Lcom/google/android/gms/internal/x$a;

.field private final kW:Ljava/lang/Runnable;

.field private kX:Lcom/google/android/gms/internal/ah;

.field private kY:Z

.field private kZ:Z

.field private la:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/v;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/x$a;

    sget-object v1, Lcom/google/android/gms/internal/dv;->rp:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/x$a;-><init>(Landroid/os/Handler;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/x;-><init>(Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/x$a;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/x$a;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/x;->kY:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/x;->kZ:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/x;->la:J

    iput-object p2, p0, Lcom/google/android/gms/internal/x;->kV:Lcom/google/android/gms/internal/x$a;

    new-instance v0, Lcom/google/android/gms/internal/x$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/x$1;-><init>(Lcom/google/android/gms/internal/x;Lcom/google/android/gms/internal/v;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/x;->kW:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/x;)Lcom/google/android/gms/internal/ah;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/x;->kX:Lcom/google/android/gms/internal/ah;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/x;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/x;->kY:Z

    return p1
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ah;J)V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/x;->kY:Z

    if-eqz v0, :cond_1

    const-string v0, "An ad refresh is already scheduled."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/internal/x;->kX:Lcom/google/android/gms/internal/ah;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/x;->kY:Z

    iput-wide p2, p0, Lcom/google/android/gms/internal/x;->la:J

    iget-boolean v0, p0, Lcom/google/android/gms/internal/x;->kZ:Z

    if-nez v0, :cond_0

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

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->x(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/x;->kV:Lcom/google/android/gms/internal/x$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/x;->kW:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p2, p3}, Lcom/google/android/gms/internal/x$a;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public cancel()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/x;->kY:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/x;->kV:Lcom/google/android/gms/internal/x$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/x;->kW:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/x$a;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(Lcom/google/android/gms/internal/ah;)V
    .locals 2

    const-wide/32 v0, 0xea60

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/internal/x;->a(Lcom/google/android/gms/internal/ah;J)V

    return-void
.end method

.method public pause()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/x;->kZ:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/x;->kY:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/x;->kV:Lcom/google/android/gms/internal/x$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/x;->kW:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/x$a;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public resume()V
    .locals 4

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/x;->kZ:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/x;->kY:Z

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/x;->kY:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/x;->kX:Lcom/google/android/gms/internal/ah;

    iget-wide v2, p0, Lcom/google/android/gms/internal/x;->la:J

    invoke-virtual {p0, v0, v2, v3}, Lcom/google/android/gms/internal/x;->a(Lcom/google/android/gms/internal/ah;J)V

    :cond_0
    return-void
.end method
