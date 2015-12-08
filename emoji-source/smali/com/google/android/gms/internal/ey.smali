.class public Lcom/google/android/gms/internal/ey;
.super Landroid/webkit/WebViewClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ey$a;
    }
.end annotation


# instance fields
.field protected final lN:Lcom/google/android/gms/internal/ex;

.field private final ls:Ljava/lang/Object;

.field private mS:Lcom/google/android/gms/internal/ba;

.field private nc:Lcom/google/android/gms/internal/bf;

.field private nd:Lcom/google/android/gms/internal/bd;

.field private pN:Lcom/google/android/gms/internal/ey$a;

.field private final sH:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/bc;",
            ">;"
        }
    .end annotation
.end field

.field private sI:Lcom/google/android/gms/internal/t;

.field private sJ:Lcom/google/android/gms/internal/ci;

.field private sK:Z

.field private sL:Z

.field private sM:Lcom/google/android/gms/internal/cl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ex;Z)V
    .locals 1

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ey;->sH:Ljava/util/HashMap;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ey;->ls:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ey;->sK:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ey;->sL:Z

    return-void
.end method

.method private static d(Landroid/net/Uri;)Z
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

.method private e(Landroid/net/Uri;)V
    .locals 6

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/ey;->sH:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/bc;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/internal/eo;->c(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Lcom/google/android/gms/internal/eu;->p(I)Z

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

    invoke-static {v1}, Lcom/google/android/gms/internal/eu;->C(Ljava/lang/String;)V

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

    invoke-static {v1}, Lcom/google/android/gms/internal/eu;->C(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/bc;->b(Lcom/google/android/gms/internal/ex;Ljava/util/Map;)V

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

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->C(Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ce;)V
    .locals 6

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->ce()Z

    move-result v1

    new-instance v0, Lcom/google/android/gms/internal/ch;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ex;->V()Lcom/google/android/gms/internal/al;

    move-result-object v2

    iget-boolean v2, v2, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v2, :cond_0

    move-object v2, v3

    :goto_0
    if-eqz v1, :cond_1

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ey;->sM:Lcom/google/android/gms/internal/cl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ex;->cd()Lcom/google/android/gms/internal/ev;

    move-result-object v5

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ch;-><init>(Lcom/google/android/gms/internal/ce;Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/ev;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/ch;)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ey;->sI:Lcom/google/android/gms/internal/t;

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ey;->sJ:Lcom/google/android/gms/internal/ci;

    goto :goto_1
.end method

.method protected a(Lcom/google/android/gms/internal/ch;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/cf;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ch;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ey$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ey;->pN:Lcom/google/android/gms/internal/ey$a;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/cl;ZLcom/google/android/gms/internal/bd;)V
    .locals 2

    const-string v0, "/appEvent"

    new-instance v1, Lcom/google/android/gms/internal/az;

    invoke-direct {v1, p3}, Lcom/google/android/gms/internal/az;-><init>(Lcom/google/android/gms/internal/ba;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    const-string v0, "/canOpenURLs"

    sget-object v1, Lcom/google/android/gms/internal/bb;->mU:Lcom/google/android/gms/internal/bc;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    const-string v0, "/click"

    sget-object v1, Lcom/google/android/gms/internal/bb;->mV:Lcom/google/android/gms/internal/bc;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    const-string v0, "/close"

    sget-object v1, Lcom/google/android/gms/internal/bb;->mW:Lcom/google/android/gms/internal/bc;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    const-string v0, "/customClose"

    sget-object v1, Lcom/google/android/gms/internal/bb;->mX:Lcom/google/android/gms/internal/bc;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    const-string v0, "/httpTrack"

    sget-object v1, Lcom/google/android/gms/internal/bb;->mY:Lcom/google/android/gms/internal/bc;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    const-string v0, "/log"

    sget-object v1, Lcom/google/android/gms/internal/bb;->mZ:Lcom/google/android/gms/internal/bc;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    const-string v0, "/open"

    new-instance v1, Lcom/google/android/gms/internal/bg;

    invoke-direct {v1, p6}, Lcom/google/android/gms/internal/bg;-><init>(Lcom/google/android/gms/internal/bd;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    const-string v0, "/touch"

    sget-object v1, Lcom/google/android/gms/internal/bb;->na:Lcom/google/android/gms/internal/bc;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    const-string v0, "/video"

    sget-object v1, Lcom/google/android/gms/internal/bb;->nb:Lcom/google/android/gms/internal/bc;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ey;->sI:Lcom/google/android/gms/internal/t;

    iput-object p2, p0, Lcom/google/android/gms/internal/ey;->sJ:Lcom/google/android/gms/internal/ci;

    iput-object p3, p0, Lcom/google/android/gms/internal/ey;->mS:Lcom/google/android/gms/internal/ba;

    iput-object p6, p0, Lcom/google/android/gms/internal/ey;->nd:Lcom/google/android/gms/internal/bd;

    iput-object p4, p0, Lcom/google/android/gms/internal/ey;->sM:Lcom/google/android/gms/internal/cl;

    invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/ey;->r(Z)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/cl;ZLcom/google/android/gms/internal/bd;Lcom/google/android/gms/internal/bf;)V
    .locals 2

    invoke-virtual/range {p0 .. p6}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/cl;ZLcom/google/android/gms/internal/bd;)V

    const-string v0, "/setInterstitialProperties"

    new-instance v1, Lcom/google/android/gms/internal/be;

    invoke-direct {v1, p7}, Lcom/google/android/gms/internal/be;-><init>(Lcom/google/android/gms/internal/bf;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    iput-object p7, p0, Lcom/google/android/gms/internal/ey;->nc:Lcom/google/android/gms/internal/bf;

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ey;->sH:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(ZI)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->ce()Z

    move-result v1

    new-instance v0, Lcom/google/android/gms/internal/ch;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ex;->V()Lcom/google/android/gms/internal/al;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ey;->sJ:Lcom/google/android/gms/internal/ci;

    iget-object v3, p0, Lcom/google/android/gms/internal/ey;->sM:Lcom/google/android/gms/internal/cl;

    iget-object v4, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    iget-object v5, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ex;->cd()Lcom/google/android/gms/internal/ev;

    move-result-object v7

    move v5, p1

    move v6, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ch;-><init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/ex;ZILcom/google/android/gms/internal/ev;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/ch;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->sI:Lcom/google/android/gms/internal/t;

    goto :goto_0
.end method

.method public final a(ZILjava/lang/String;)V
    .locals 11

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->ce()Z

    move-result v3

    new-instance v0, Lcom/google/android/gms/internal/ch;

    if-eqz v3, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ex;->V()Lcom/google/android/gms/internal/al;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v1, :cond_0

    move-object v1, v2

    :goto_0
    if-eqz v3, :cond_1

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ey;->mS:Lcom/google/android/gms/internal/ba;

    iget-object v4, p0, Lcom/google/android/gms/internal/ey;->sM:Lcom/google/android/gms/internal/cl;

    iget-object v5, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    iget-object v6, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ex;->cd()Lcom/google/android/gms/internal/ev;

    move-result-object v9

    iget-object v10, p0, Lcom/google/android/gms/internal/ey;->nd:Lcom/google/android/gms/internal/bd;

    move v6, p1

    move v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ch;-><init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/ex;ZILjava/lang/String;Lcom/google/android/gms/internal/ev;Lcom/google/android/gms/internal/bd;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/ch;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->sI:Lcom/google/android/gms/internal/t;

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ey;->sJ:Lcom/google/android/gms/internal/ci;

    goto :goto_1
.end method

.method public final a(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 12

    iget-object v0, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->ce()Z

    move-result v2

    new-instance v0, Lcom/google/android/gms/internal/ch;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ex;->V()Lcom/google/android/gms/internal/al;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ey;->mS:Lcom/google/android/gms/internal/ba;

    iget-object v4, p0, Lcom/google/android/gms/internal/ey;->sM:Lcom/google/android/gms/internal/cl;

    iget-object v5, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    iget-object v6, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ex;->cd()Lcom/google/android/gms/internal/ev;

    move-result-object v10

    iget-object v11, p0, Lcom/google/android/gms/internal/ey;->nd:Lcom/google/android/gms/internal/bd;

    move v6, p1

    move v7, p2

    move-object v8, p3

    move-object/from16 v9, p4

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/ch;-><init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/ex;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ev;Lcom/google/android/gms/internal/bd;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/ch;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->sI:Lcom/google/android/gms/internal/t;

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ey;->sJ:Lcom/google/android/gms/internal/ci;

    goto :goto_1
.end method

.method public final aS()V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->ls:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ey;->sK:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ey;->sL:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->ca()Lcom/google/android/gms/internal/cf;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/et;->bW()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/google/android/gms/internal/et;->sv:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/ey$1;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ey$1;-><init>(Lcom/google/android/gms/internal/ey;Lcom/google/android/gms/internal/cf;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/cf;->aS()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public cj()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->ls:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ey;->sL:Z

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

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->C(Ljava/lang/String;)V

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

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ey;->e(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .param p1, "webView"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ey;->pN:Lcom/google/android/gms/internal/ey$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ey;->pN:Lcom/google/android/gms/internal/ey$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ey$a;->a(Lcom/google/android/gms/internal/ex;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ey;->pN:Lcom/google/android/gms/internal/ey$a;

    :cond_0
    return-void
.end method

.method public final r(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ey;->sK:Z

    return-void
.end method

.method public final reset()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->ls:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ey;->sH:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ey;->sI:Lcom/google/android/gms/internal/t;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ey;->sJ:Lcom/google/android/gms/internal/ci;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ey;->pN:Lcom/google/android/gms/internal/ey$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ey;->mS:Lcom/google/android/gms/internal/ba;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ey;->sK:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ey;->sL:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ey;->nd:Lcom/google/android/gms/internal/bd;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ey;->sM:Lcom/google/android/gms/internal/cl;

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

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->C(Ljava/lang/String;)V

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

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ey;->e(Landroid/net/Uri;)V

    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ey;->sK:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    if-ne p1, v1, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/ey;->d(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ex;->willNotDraw()Z

    move-result v1

    if-nez v1, :cond_3

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ex;->cc()Lcom/google/android/gms/internal/k;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/k;->b(Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ey;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ex;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/k;->a(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;
    :try_end_0
    .catch Lcom/google/android/gms/internal/l; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_2
    move-object v2, v0

    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/ce;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ce;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/ce;)V

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

    invoke-static {v1}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

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

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_0
.end method
