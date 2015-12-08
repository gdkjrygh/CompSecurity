.class final Lcom/google/android/gms/internal/nk;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ha;

.field final synthetic b:Lcom/google/android/gms/internal/nt;

.field final synthetic c:Lcom/google/android/gms/internal/dm;

.field final synthetic d:Lcom/google/android/gms/internal/dk;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ha;Lcom/google/android/gms/internal/nt;Lcom/google/android/gms/internal/dm;Lcom/google/android/gms/internal/dk;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/nk;->a:Lcom/google/android/gms/internal/ha;

    iput-object p2, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nt;

    iput-object p3, p0, Lcom/google/android/gms/internal/nk;->c:Lcom/google/android/gms/internal/dm;

    iput-object p4, p0, Lcom/google/android/gms/internal/nk;->d:Lcom/google/android/gms/internal/dk;

    iput-object p5, p0, Lcom/google/android/gms/internal/nk;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->a:Lcom/google/android/gms/internal/ha;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ha;->b()Lcom/google/android/gms/internal/ho;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nt;

    .line 1000
    iput-object v0, v1, Lcom/google/android/gms/internal/nt;->b:Lcom/google/android/gms/internal/ho;

    .line 0
    iget-object v1, p0, Lcom/google/android/gms/internal/nk;->c:Lcom/google/android/gms/internal/dm;

    iget-object v2, p0, Lcom/google/android/gms/internal/nk;->d:Lcom/google/android/gms/internal/dk;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "rwc"

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/dm;->a(Lcom/google/android/gms/internal/dk;[Ljava/lang/String;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/nk;->c:Lcom/google/android/gms/internal/dm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dm;->a()Lcom/google/android/gms/internal/dk;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/nl;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/nl;-><init>(Lcom/google/android/gms/internal/nk;Lcom/google/android/gms/internal/dk;)V

    new-instance v1, Lcom/google/android/gms/internal/nm;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/nm;-><init>(Lcom/google/android/gms/internal/nk;)V

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/ho;->a(Lcom/google/android/gms/internal/rq;Lcom/google/android/gms/internal/ro;)V

    return-void
.end method
