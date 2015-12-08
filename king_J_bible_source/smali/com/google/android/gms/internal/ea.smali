.class public Lcom/google/android/gms/internal/ea;
.super Landroid/webkit/WebViewClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ea$a;
    }
.end annotation


# instance fields
.field protected final lC:Lcom/google/android/gms/internal/dz;

.field private final li:Ljava/lang/Object;

.field private mF:Lcom/google/android/gms/internal/az;

.field private mP:Lcom/google/android/gms/internal/bc;

.field private oW:Lcom/google/android/gms/internal/ea$a;

.field private final rA:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/bb;",
            ">;"
        }
    .end annotation
.end field

.field private rB:Lcom/google/android/gms/internal/u;

.field private rC:Lcom/google/android/gms/internal/cf;

.field private rD:Z

.field private rE:Z

.field private rF:Lcom/google/android/gms/internal/ci;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/dz;Z)V
    .locals 1

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ea;->rA:Ljava/util/HashMap;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ea;->li:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ea;->rD:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ea;->rE:Z

    return-void
.end method

.method private static c(Landroid/net/Uri;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "https"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d(Landroid/net/Uri;)V
    .locals 6

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/ea;->rA:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/bb;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/internal/dq;->b(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Lcom/google/android/gms/internal/dw;->n(I)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Received GMSG: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/dw;->y(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "  "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/dw;->y(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/bb;->b(Lcom/google/android/gms/internal/dz;Ljava/util/Map;)V

    :goto_1
    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No GMSG handler found for GMSG: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->y(Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/cb;)V
    .locals 6

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bL()Z

    move-result v1

    new-instance v0, Lcom/google/android/gms/internal/ce;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/dz;->R()Lcom/google/android/gms/internal/ak;

    move-result-object v2

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v2, :cond_0

    move-object v2, v3

    :goto_0
    if-eqz v1, :cond_1

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ea;->rF:Lcom/google/android/gms/internal/ci;

    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dz;->bK()Lcom/google/android/gms/internal/dx;

    move-result-object v5

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ce;-><init>(Lcom/google/android/gms/internal/cb;Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/dx;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ea;->a(Lcom/google/android/gms/internal/ce;)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ea;->rB:Lcom/google/android/gms/internal/u;

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ea;->rC:Lcom/google/android/gms/internal/cf;

    goto :goto_1
.end method

.method protected a(Lcom/google/android/gms/internal/ce;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/cc;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ce;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ea$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ea;->oW:Lcom/google/android/gms/internal/ea$a;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/az;Lcom/google/android/gms/internal/ci;ZLcom/google/android/gms/internal/bc;)V
    .locals 2

    const-string v0, "/appEvent"

    new-instance v1, Lcom/google/android/gms/internal/ay;

    invoke-direct {v1, p3}, Lcom/google/android/gms/internal/ay;-><init>(Lcom/google/android/gms/internal/az;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    const-string v0, "/canOpenURLs"

    sget-object v1, Lcom/google/android/gms/internal/ba;->mH:Lcom/google/android/gms/internal/bb;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    const-string v0, "/click"

    sget-object v1, Lcom/google/android/gms/internal/ba;->mI:Lcom/google/android/gms/internal/bb;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    const-string v0, "/close"

    sget-object v1, Lcom/google/android/gms/internal/ba;->mJ:Lcom/google/android/gms/internal/bb;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    const-string v0, "/customClose"

    sget-object v1, Lcom/google/android/gms/internal/ba;->mK:Lcom/google/android/gms/internal/bb;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    const-string v0, "/httpTrack"

    sget-object v1, Lcom/google/android/gms/internal/ba;->mL:Lcom/google/android/gms/internal/bb;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    const-string v0, "/log"

    sget-object v1, Lcom/google/android/gms/internal/ba;->mM:Lcom/google/android/gms/internal/bb;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    const-string v0, "/open"

    new-instance v1, Lcom/google/android/gms/internal/bd;

    invoke-direct {v1, p6}, Lcom/google/android/gms/internal/bd;-><init>(Lcom/google/android/gms/internal/bc;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    const-string v0, "/touch"

    sget-object v1, Lcom/google/android/gms/internal/ba;->mN:Lcom/google/android/gms/internal/bb;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    const-string v0, "/video"

    sget-object v1, Lcom/google/android/gms/internal/ba;->mO:Lcom/google/android/gms/internal/bb;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ea;->rB:Lcom/google/android/gms/internal/u;

    iput-object p2, p0, Lcom/google/android/gms/internal/ea;->rC:Lcom/google/android/gms/internal/cf;

    iput-object p3, p0, Lcom/google/android/gms/internal/ea;->mF:Lcom/google/android/gms/internal/az;

    iput-object p6, p0, Lcom/google/android/gms/internal/ea;->mP:Lcom/google/android/gms/internal/bc;

    iput-object p4, p0, Lcom/google/android/gms/internal/ea;->rF:Lcom/google/android/gms/internal/ci;

    invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/ea;->q(Z)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ea;->rA:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(ZI)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bL()Z

    move-result v1

    new-instance v0, Lcom/google/android/gms/internal/ce;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dz;->R()Lcom/google/android/gms/internal/ak;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ea;->rC:Lcom/google/android/gms/internal/cf;

    iget-object v3, p0, Lcom/google/android/gms/internal/ea;->rF:Lcom/google/android/gms/internal/ci;

    iget-object v4, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    iget-object v5, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/dz;->bK()Lcom/google/android/gms/internal/dx;

    move-result-object v7

    move v5, p1

    move v6, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ce;-><init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/dz;ZILcom/google/android/gms/internal/dx;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ea;->a(Lcom/google/android/gms/internal/ce;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->rB:Lcom/google/android/gms/internal/u;

    goto :goto_0
.end method

.method public final a(ZILjava/lang/String;)V
    .locals 11

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bL()Z

    move-result v3

    new-instance v0, Lcom/google/android/gms/internal/ce;

    if-eqz v3, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dz;->R()Lcom/google/android/gms/internal/ak;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v1, :cond_0

    move-object v1, v2

    :goto_0
    if-eqz v3, :cond_1

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ea;->mF:Lcom/google/android/gms/internal/az;

    iget-object v4, p0, Lcom/google/android/gms/internal/ea;->rF:Lcom/google/android/gms/internal/ci;

    iget-object v5, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    iget-object v6, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/dz;->bK()Lcom/google/android/gms/internal/dx;

    move-result-object v9

    iget-object v10, p0, Lcom/google/android/gms/internal/ea;->mP:Lcom/google/android/gms/internal/bc;

    move v6, p1

    move v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ce;-><init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/az;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/dz;ZILjava/lang/String;Lcom/google/android/gms/internal/dx;Lcom/google/android/gms/internal/bc;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ea;->a(Lcom/google/android/gms/internal/ce;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->rB:Lcom/google/android/gms/internal/u;

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ea;->rC:Lcom/google/android/gms/internal/cf;

    goto :goto_1
.end method

.method public final a(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 12

    iget-object v0, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bL()Z

    move-result v2

    new-instance v0, Lcom/google/android/gms/internal/ce;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dz;->R()Lcom/google/android/gms/internal/ak;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ea;->mF:Lcom/google/android/gms/internal/az;

    iget-object v4, p0, Lcom/google/android/gms/internal/ea;->rF:Lcom/google/android/gms/internal/ci;

    iget-object v5, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    iget-object v6, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/dz;->bK()Lcom/google/android/gms/internal/dx;

    move-result-object v10

    iget-object v11, p0, Lcom/google/android/gms/internal/ea;->mP:Lcom/google/android/gms/internal/bc;

    move v6, p1

    move v7, p2

    move-object v8, p3

    move-object/from16 v9, p4

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/ce;-><init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/az;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/dz;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/dx;Lcom/google/android/gms/internal/bc;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ea;->a(Lcom/google/android/gms/internal/ce;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->rB:Lcom/google/android/gms/internal/u;

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ea;->rC:Lcom/google/android/gms/internal/cf;

    goto :goto_1
.end method

.method public final aM()V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->li:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ea;->rD:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ea;->rE:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bH()Lcom/google/android/gms/internal/cc;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/dv;->bD()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/google/android/gms/internal/dv;->rp:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/ea$1;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ea$1;-><init>(Lcom/google/android/gms/internal/ea;Lcom/google/android/gms/internal/cc;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/cc;->aM()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bP()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->li:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ea;->rE:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3
    .param p1, "webView"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Loading resource: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->y(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "gmsg"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "mobileads.google.com"

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ea;->d(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .param p1, "webView"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ea;->oW:Lcom/google/android/gms/internal/ea$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ea;->oW:Lcom/google/android/gms/internal/ea$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ea$a;->a(Lcom/google/android/gms/internal/dz;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ea;->oW:Lcom/google/android/gms/internal/ea$a;

    :cond_0
    return-void
.end method

.method public final q(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ea;->rD:Z

    return-void
.end method

.method public final reset()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->li:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ea;->rA:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ea;->rB:Lcom/google/android/gms/internal/u;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ea;->rC:Lcom/google/android/gms/internal/cf;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ea;->oW:Lcom/google/android/gms/internal/ea$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ea;->mF:Lcom/google/android/gms/internal/az;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ea;->rD:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ea;->rE:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ea;->mP:Lcom/google/android/gms/internal/bc;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ea;->rF:Lcom/google/android/gms/internal/ci;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 8
    .param p1, "webView"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AdWebView shouldOverrideUrlLoading: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->y(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "gmsg"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "mobileads.google.com"

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ea;->d(Landroid/net/Uri;)V

    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ea;->rD:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    if-ne p1, v1, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/ea;->c(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dz;->willNotDraw()Z

    move-result v1

    if-nez v1, :cond_3

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dz;->bJ()Lcom/google/android/gms/internal/l;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/l;->a(Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ea;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/dz;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/l;->a(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;
    :try_end_0
    .catch Lcom/google/android/gms/internal/m; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_2
    move-object v2, v0

    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/cb;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/cb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ea;->a(Lcom/google/android/gms/internal/cb;)V

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to append parameter to URL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    move-object v2, v0

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AdWebView unable to handle URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    goto :goto_0
.end method
