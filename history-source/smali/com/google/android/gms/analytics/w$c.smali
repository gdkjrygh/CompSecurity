.class Lcom/google/android/gms/analytics/w$c;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/analytics/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic zv:Lcom/google/android/gms/analytics/w;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/analytics/w;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/w$c;->zv:Lcom/google/android/gms/analytics/w;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/analytics/w;Lcom/google/android/gms/analytics/w$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/w$c;-><init>(Lcom/google/android/gms/analytics/w;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/w$c;->zv:Lcom/google/android/gms/analytics/w;

    invoke-static {v0}, Lcom/google/android/gms/analytics/w;->b(Lcom/google/android/gms/analytics/w;)Lcom/google/android/gms/analytics/w$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/w$a;->zx:Lcom/google/android/gms/analytics/w$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/w$c;->zv:Lcom/google/android/gms/analytics/w;

    invoke-static {v0}, Lcom/google/android/gms/analytics/w;->c(Lcom/google/android/gms/analytics/w;)V

    :cond_0
    return-void
.end method
