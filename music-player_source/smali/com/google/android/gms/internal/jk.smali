.class public final Lcom/google/android/gms/internal/jk;
.super Ljava/lang/Object;


# static fields
.field private static a:I

.field private static b:I


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Ljava/util/concurrent/BlockingQueue;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2710

    sput v0, Lcom/google/android/gms/internal/jk;->a:I

    const/16 v0, 0x3e8

    sput v0, Lcom/google/android/gms/internal/jk;->b:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/je;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jk;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/je;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/je;

    iget v0, p0, Lcom/google/android/gms/internal/jk;->d:I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/je;->a(I)Lcom/google/android/gms/internal/je;

    iget-object v0, p0, Lcom/google/android/gms/internal/jk;->e:Ljava/util/concurrent/BlockingQueue;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/je;->a()Lcom/google/android/gms/internal/hx$a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    return-void
.end method
