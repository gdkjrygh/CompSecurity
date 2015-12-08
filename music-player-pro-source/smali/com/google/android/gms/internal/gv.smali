.class public Lcom/google/android/gms/internal/gv;
.super Landroid/webkit/WebViewClient;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/gv$a;
    }
.end annotation


# instance fields
.field private final mH:Ljava/lang/Object;

.field protected final mo:Lcom/google/android/gms/internal/gu;

.field private pP:Lcom/google/android/gms/internal/cb;

.field private qa:Lcom/google/android/gms/internal/cg;

.field private qc:Lcom/google/android/gms/internal/ce;

.field private qd:Lcom/google/android/gms/internal/v;

.field private tu:Lcom/google/android/gms/internal/gv$a;

.field private final xe:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/cd;",
            ">;"
        }
    .end annotation
.end field

.field private xf:Lcom/google/android/gms/internal/t;

.field private xg:Lcom/google/android/gms/internal/ds;

.field private xh:Z

.field private xi:Z

.field private xj:Lcom/google/android/gms/internal/dv;

.field private final xk:Lcom/google/android/gms/internal/dl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gu;Z)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/dl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gu;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/bl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gu;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/bl;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/dl;-><init>(Lcom/google/android/gms/internal/gu;Landroid/content/Context;Lcom/google/android/gms/internal/bl;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/gv;-><init>(Lcom/google/android/gms/internal/gu;ZLcom/google/android/gms/internal/dl;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/gu;ZLcom/google/android/gms/internal/dl;)V
    .locals 1

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/gv;->xe:Ljava/util/HashMap;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/gv;->mH:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gv;->xh:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/gv;->xi:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/gv;->xk:Lcom/google/android/gms/internal/dl;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->xe:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cd;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/internal/gi;->c(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Lcom/google/android/gms/internal/gr;->v(I)Z

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

    invoke-static {v1}, Lcom/google/android/gms/internal/gr;->V(Ljava/lang/String;)V

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

    invoke-static {v1}, Lcom/google/android/gms/internal/gr;->V(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/cd;->a(Lcom/google/android/gms/internal/gu;Ljava/util/Map;)V

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

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->V(Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public final A(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/gv;->xh:Z

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/do;)V
    .locals 6

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dH()Z

    move-result v1

    new-instance v0, Lcom/google/android/gms/internal/dr;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/gu;->ac()Lcom/google/android/gms/internal/ay;

    move-result-object v2

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ay;->oq:Z

    if-nez v2, :cond_0

    move-object v2, v3

    :goto_0
    if-eqz v1, :cond_1

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/gv;->xj:Lcom/google/android/gms/internal/dv;

    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gu;->dG()Lcom/google/android/gms/internal/gs;

    move-result-object v5

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/dr;-><init>(Lcom/google/android/gms/internal/do;Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dv;Lcom/google/android/gms/internal/gs;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/dr;)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/gv;->xf:Lcom/google/android/gms/internal/t;

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/gv;->xg:Lcom/google/android/gms/internal/ds;

    goto :goto_1
.end method

.method protected a(Lcom/google/android/gms/internal/dr;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/dp;->a(Landroid/content/Context;Lcom/google/android/gms/internal/dr;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/gv$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gv;->tu:Lcom/google/android/gms/internal/gv$a;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/cb;Lcom/google/android/gms/internal/dv;ZLcom/google/android/gms/internal/ce;Lcom/google/android/gms/internal/cg;Lcom/google/android/gms/internal/v;)V
    .locals 8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    move-object/from16 v7, p8

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/cb;Lcom/google/android/gms/internal/dv;ZLcom/google/android/gms/internal/ce;Lcom/google/android/gms/internal/v;)V

    const-string v0, "/setInterstitialProperties"

    new-instance v1, Lcom/google/android/gms/internal/cf;

    invoke-direct {v1, p7}, Lcom/google/android/gms/internal/cf;-><init>(Lcom/google/android/gms/internal/cg;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    iput-object p7, p0, Lcom/google/android/gms/internal/gv;->qa:Lcom/google/android/gms/internal/cg;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/cb;Lcom/google/android/gms/internal/dv;ZLcom/google/android/gms/internal/ce;Lcom/google/android/gms/internal/v;)V
    .locals 2

    if-nez p7, :cond_0

    new-instance p7, Lcom/google/android/gms/internal/v;

    const/4 v0, 0x0

    invoke-direct {p7, v0}, Lcom/google/android/gms/internal/v;-><init>(Z)V

    :cond_0
    const-string v0, "/appEvent"

    new-instance v1, Lcom/google/android/gms/internal/ca;

    invoke-direct {v1, p3}, Lcom/google/android/gms/internal/ca;-><init>(Lcom/google/android/gms/internal/cb;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v0, "/canOpenURLs"

    sget-object v1, Lcom/google/android/gms/internal/cc;->pR:Lcom/google/android/gms/internal/cd;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v0, "/canOpenIntents"

    sget-object v1, Lcom/google/android/gms/internal/cc;->pS:Lcom/google/android/gms/internal/cd;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v0, "/click"

    sget-object v1, Lcom/google/android/gms/internal/cc;->pT:Lcom/google/android/gms/internal/cd;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v0, "/close"

    sget-object v1, Lcom/google/android/gms/internal/cc;->pU:Lcom/google/android/gms/internal/cd;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v0, "/customClose"

    sget-object v1, Lcom/google/android/gms/internal/cc;->pV:Lcom/google/android/gms/internal/cd;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v0, "/httpTrack"

    sget-object v1, Lcom/google/android/gms/internal/cc;->pW:Lcom/google/android/gms/internal/cd;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v0, "/log"

    sget-object v1, Lcom/google/android/gms/internal/cc;->pX:Lcom/google/android/gms/internal/cd;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v0, "/open"

    new-instance v1, Lcom/google/android/gms/internal/ci;

    invoke-direct {v1, p6, p7}, Lcom/google/android/gms/internal/ci;-><init>(Lcom/google/android/gms/internal/ce;Lcom/google/android/gms/internal/v;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v0, "/touch"

    sget-object v1, Lcom/google/android/gms/internal/cc;->pY:Lcom/google/android/gms/internal/cd;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v0, "/video"

    sget-object v1, Lcom/google/android/gms/internal/cc;->pZ:Lcom/google/android/gms/internal/cd;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v0, "/mraid"

    new-instance v1, Lcom/google/android/gms/internal/ch;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ch;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/gv;->xf:Lcom/google/android/gms/internal/t;

    iput-object p2, p0, Lcom/google/android/gms/internal/gv;->xg:Lcom/google/android/gms/internal/ds;

    iput-object p3, p0, Lcom/google/android/gms/internal/gv;->pP:Lcom/google/android/gms/internal/cb;

    iput-object p6, p0, Lcom/google/android/gms/internal/gv;->qc:Lcom/google/android/gms/internal/ce;

    iput-object p4, p0, Lcom/google/android/gms/internal/gv;->xj:Lcom/google/android/gms/internal/dv;

    iput-object p7, p0, Lcom/google/android/gms/internal/gv;->qd:Lcom/google/android/gms/internal/v;

    invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/gv;->A(Z)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->xe:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(ZI)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dH()Z

    move-result v1

    new-instance v0, Lcom/google/android/gms/internal/dr;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gu;->ac()Lcom/google/android/gms/internal/ay;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ay;->oq:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/gv;->xg:Lcom/google/android/gms/internal/ds;

    iget-object v3, p0, Lcom/google/android/gms/internal/gv;->xj:Lcom/google/android/gms/internal/dv;

    iget-object v4, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    iget-object v5, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/gu;->dG()Lcom/google/android/gms/internal/gs;

    move-result-object v7

    move v5, p1

    move v6, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/dr;-><init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dv;Lcom/google/android/gms/internal/gu;ZILcom/google/android/gms/internal/gs;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/dr;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->xf:Lcom/google/android/gms/internal/t;

    goto :goto_0
.end method

.method public final a(ZILjava/lang/String;)V
    .locals 11

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dH()Z

    move-result v3

    new-instance v0, Lcom/google/android/gms/internal/dr;

    if-eqz v3, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gu;->ac()Lcom/google/android/gms/internal/ay;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ay;->oq:Z

    if-nez v1, :cond_0

    move-object v1, v2

    :goto_0
    if-eqz v3, :cond_1

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/gv;->pP:Lcom/google/android/gms/internal/cb;

    iget-object v4, p0, Lcom/google/android/gms/internal/gv;->xj:Lcom/google/android/gms/internal/dv;

    iget-object v5, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    iget-object v6, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/gu;->dG()Lcom/google/android/gms/internal/gs;

    move-result-object v9

    iget-object v10, p0, Lcom/google/android/gms/internal/gv;->qc:Lcom/google/android/gms/internal/ce;

    move v6, p1

    move v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/dr;-><init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/cb;Lcom/google/android/gms/internal/dv;Lcom/google/android/gms/internal/gu;ZILjava/lang/String;Lcom/google/android/gms/internal/gs;Lcom/google/android/gms/internal/ce;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/dr;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->xf:Lcom/google/android/gms/internal/t;

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/gv;->xg:Lcom/google/android/gms/internal/ds;

    goto :goto_1
.end method

.method public final a(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 12

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dH()Z

    move-result v2

    new-instance v0, Lcom/google/android/gms/internal/dr;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gu;->ac()Lcom/google/android/gms/internal/ay;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ay;->oq:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/gv;->pP:Lcom/google/android/gms/internal/cb;

    iget-object v4, p0, Lcom/google/android/gms/internal/gv;->xj:Lcom/google/android/gms/internal/dv;

    iget-object v5, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    iget-object v6, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/gu;->dG()Lcom/google/android/gms/internal/gs;

    move-result-object v10

    iget-object v11, p0, Lcom/google/android/gms/internal/gv;->qc:Lcom/google/android/gms/internal/ce;

    move v6, p1

    move v7, p2

    move-object v8, p3

    move-object/from16 v9, p4

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/dr;-><init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/cb;Lcom/google/android/gms/internal/dv;Lcom/google/android/gms/internal/gu;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gs;Lcom/google/android/gms/internal/ce;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/dr;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->xf:Lcom/google/android/gms/internal/t;

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/gv;->xg:Lcom/google/android/gms/internal/ds;

    goto :goto_1
.end method

.method public final cg()V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mH:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/gv;->xh:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gv;->xi:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dC()Lcom/google/android/gms/internal/dp;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/gq;->dB()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/google/android/gms/internal/gq;->wR:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/gv$1;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/gv$1;-><init>(Lcom/google/android/gms/internal/gv;Lcom/google/android/gms/internal/dp;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/dp;->cg()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public dM()Lcom/google/android/gms/internal/v;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->qd:Lcom/google/android/gms/internal/v;

    return-object v0
.end method

.method public dN()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/gv;->xi:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public dO()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gv;->dN()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->xk:Lcom/google/android/gms/internal/dl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dl;->bY()V

    :cond_0
    return-void
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

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->V(Ljava/lang/String;)V

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

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/gv;->e(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .param p1, "webView"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->tu:Lcom/google/android/gms/internal/gv$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->tu:Lcom/google/android/gms/internal/gv$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/gv$a;->a(Lcom/google/android/gms/internal/gu;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gv;->tu:Lcom/google/android/gms/internal/gv$a;

    :cond_0
    return-void
.end method

.method public final reset()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->xe:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gv;->xf:Lcom/google/android/gms/internal/t;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gv;->xg:Lcom/google/android/gms/internal/ds;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gv;->tu:Lcom/google/android/gms/internal/gv$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gv;->pP:Lcom/google/android/gms/internal/cb;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gv;->xh:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gv;->xi:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gv;->qc:Lcom/google/android/gms/internal/ce;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gv;->xj:Lcom/google/android/gms/internal/dv;

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

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->V(Ljava/lang/String;)V

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

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/gv;->e(Landroid/net/Uri;)V

    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/gv;->xh:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    if-ne p1, v1, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/gv;->d(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gu;->willNotDraw()Z

    move-result v1

    if-nez v1, :cond_5

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gu;->dF()Lcom/google/android/gms/internal/k;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/k;->b(Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/gv;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/gu;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/k;->a(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;
    :try_end_0
    .catch Lcom/google/android/gms/internal/l; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_2
    move-object v2, v0

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->qd:Lcom/google/android/gms/internal/v;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->qd:Lcom/google/android/gms/internal/v;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/v;->az()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/do;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/do;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/do;)V

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

    invoke-static {v1}, Lcom/google/android/gms/internal/gr;->W(Ljava/lang/String;)V

    move-object v2, v0

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->qd:Lcom/google/android/gms/internal/v;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/v;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AdWebView unable to handle URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->W(Ljava/lang/String;)V

    goto/16 :goto_0
.end method
