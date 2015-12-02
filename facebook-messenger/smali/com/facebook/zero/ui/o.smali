.class public Lcom/facebook/zero/ui/o;
.super Ljava/lang/Object;
.source "ExtraChargesDialogVisibilityHelper.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Lcom/facebook/zero/d/a;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/zero/d/a;Ljavax/inject/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/zero/d/a;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->m:Lcom/facebook/prefs/shared/ae;

    const-string v2, "promo_banner"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->k:Lcom/facebook/prefs/shared/ae;

    const-string v2, "url_interstitial"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->j:Lcom/facebook/prefs/shared/ae;

    const-string v2, "image_search_interstitial"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->g:Lcom/facebook/prefs/shared/ae;

    const-string v2, "timeline_interstitial"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->i:Lcom/facebook/prefs/shared/ae;

    const-string v2, "map_interstitial"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->h:Lcom/facebook/prefs/shared/ae;

    const-string v2, "map_interstitial"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->l:Lcom/facebook/prefs/shared/ae;

    const-string v2, "voip_interstitial"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/ui/o;->d:Lcom/google/common/a/ev;

    .line 48
    iput-object p1, p0, Lcom/facebook/zero/ui/o;->a:Lcom/facebook/prefs/shared/d;

    .line 49
    iput-object p2, p0, Lcom/facebook/zero/ui/o;->b:Lcom/facebook/zero/d/a;

    .line 50
    iput-object p3, p0, Lcom/facebook/zero/ui/o;->c:Ljavax/inject/a;

    .line 51
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/ae;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 54
    iget-object v0, p0, Lcom/facebook/zero/ui/o;->d:Lcom/google/common/a/ev;

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 55
    invoke-static {v0}, Lcom/google/common/base/Strings;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 59
    :goto_0
    return v2

    :cond_0
    iget-object v3, p0, Lcom/facebook/zero/ui/o;->c:Ljavax/inject/a;

    invoke-interface {v3}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-ne v3, v4, :cond_1

    iget-object v3, p0, Lcom/facebook/zero/ui/o;->b:Lcom/facebook/zero/d/a;

    invoke-virtual {v3}, Lcom/facebook/zero/d/a;->f()Lcom/google/common/a/fi;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/zero/ui/o;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0, p1, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    move v2, v0

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method
