.class final Lcom/google/android/gms/internal/gf;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ga;

.field private final b:Lcom/google/android/gms/internal/gg;

.field private final c:Z

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ga;ZLcom/google/android/gms/internal/gg;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gf;->a:Lcom/google/android/gms/internal/ga;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/google/android/gms/internal/gf;->c:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/gf;->b:Lcom/google/android/gms/internal/gg;

    iput-object p4, p0, Lcom/google/android/gms/internal/gf;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gf;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/gg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gf;->b:Lcom/google/android/gms/internal/gg;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gf;->c:Z

    return v0
.end method
