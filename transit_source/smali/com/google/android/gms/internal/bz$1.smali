.class final Lcom/google/android/gms/internal/bz$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/bz;->a(Landroid/content/Context;Lcom/google/android/gms/internal/al;Lcom/google/android/gms/internal/bu;)Lcom/google/android/gms/internal/bw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic gO:Landroid/content/Context;

.field final synthetic gP:Lcom/google/android/gms/internal/bu;

.field final synthetic gQ:Lcom/google/android/gms/internal/cb;

.field final synthetic gR:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/bu;Lcom/google/android/gms/internal/cb;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/bz$1;->gO:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/bz$1;->gP:Lcom/google/android/gms/internal/bu;

    iput-object p3, p0, Lcom/google/android/gms/internal/bz$1;->gQ:Lcom/google/android/gms/internal/cb;

    iput-object p4, p0, Lcom/google/android/gms/internal/bz$1;->gR:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    const/4 v4, 0x0

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/bz$1;->gO:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/x;

    invoke-direct {v1}, Lcom/google/android/gms/internal/x;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/bz$1;->gP:Lcom/google/android/gms/internal/bu;

    iget-object v5, v3, Lcom/google/android/gms/internal/bu;->eg:Lcom/google/android/gms/internal/co;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/cq;->a(Landroid/content/Context;Lcom/google/android/gms/internal/x;ZZLcom/google/android/gms/internal/h;Lcom/google/android/gms/internal/co;)Lcom/google/android/gms/internal/cq;

    move-result-object v5

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/cq;->setWillNotDraw(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bz$1;->gQ:Lcom/google/android/gms/internal/cb;

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/cb;->b(Lcom/google/android/gms/internal/cq;)V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/cq;->aw()Lcom/google/android/gms/internal/cr;

    move-result-object v0

    const-string v1, "/invalidRequest"

    iget-object v2, p0, Lcom/google/android/gms/internal/bz$1;->gQ:Lcom/google/android/gms/internal/cb;

    iget-object v2, v2, Lcom/google/android/gms/internal/cb;->gU:Lcom/google/android/gms/internal/ai;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/cr;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ai;)V

    const-string v1, "/loadAdURL"

    iget-object v2, p0, Lcom/google/android/gms/internal/bz$1;->gQ:Lcom/google/android/gms/internal/cb;

    iget-object v2, v2, Lcom/google/android/gms/internal/cb;->gV:Lcom/google/android/gms/internal/ai;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/cr;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ai;)V

    const-string v1, "/log"

    sget-object v2, Lcom/google/android/gms/internal/ah;->eE:Lcom/google/android/gms/internal/ai;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/cr;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ai;)V

    const-string v0, "Getting the ad request URL."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    const-string v6, "http://googleads.g.doubleclick.net"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<!DOCTYPE html><html><head><script src=\"http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.js\"></script><script>AFMA_buildAdURL("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/bz$1;->gR:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ");</script></head><body></body></html>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "text/html"

    const-string v9, "UTF-8"

    move-object v10, v4

    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/cq;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
