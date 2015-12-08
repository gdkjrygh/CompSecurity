.class Lcom/google/android/gms/analytics/x$b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/analytics/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic zQ:Lcom/google/android/gms/analytics/x;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/analytics/x;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/x$b;->zQ:Lcom/google/android/gms/analytics/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/analytics/x;Lcom/google/android/gms/analytics/x$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/x$b;-><init>(Lcom/google/android/gms/analytics/x;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/x$b;->zQ:Lcom/google/android/gms/analytics/x;

    invoke-static {v0}, Lcom/google/android/gms/analytics/x;->d(Lcom/google/android/gms/analytics/x;)Lcom/google/android/gms/analytics/ak;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/analytics/ak;->dispatch()V

    return-void
.end method
