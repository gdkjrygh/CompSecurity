.class public final Lcom/google/android/gms/internal/lk;
.super Lcom/google/android/gms/internal/h;

# interfaces
.implements Lcom/google/android/gms/internal/ar;
.implements Lcom/google/android/gms/internal/bv;
.implements Lcom/google/android/gms/internal/ca;
.implements Lcom/google/android/gms/internal/cm;
.implements Lcom/google/android/gms/internal/lj;
.implements Lcom/google/android/gms/internal/v;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ba;

.field private final b:Lcom/google/android/gms/internal/ll;

.field private final c:Lcom/google/android/gms/internal/lm;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ab;Ljava/lang/String;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/db;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/h;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ll;

    invoke-direct {v0, p1, p2, p3, p5}, Lcom/google/android/gms/internal/ll;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ab;Ljava/lang/String;Lcom/google/android/gms/internal/db;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iput-object p4, p0, Lcom/google/android/gms/internal/lk;->a:Lcom/google/android/gms/internal/ba;

    new-instance v0, Lcom/google/android/gms/internal/lm;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/lm;-><init>(Lcom/google/android/gms/internal/lk;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/lk;->c:Lcom/google/android/gms/internal/lm;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Use AdRequest.Builder.addTestDevice(\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/eh;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\") to get test ads on this device."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->b(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ea;->b(Landroid/content/Context;)V

    return-void
.end method

.method private a(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to load ad: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/d;->a(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdFailedToLoad()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    const/4 v1, -0x2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v1, p1, v0}, Landroid/widget/ViewSwitcher;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private a(Z)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging Impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->j:Lcom/google/android/gms/internal/dp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dp;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->e:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    iget-object v1, v1, Lcom/google/android/gms/internal/db;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v2, v2, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v2, v2, Lcom/google/android/gms/internal/do;->e:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ea;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    iget-object v0, v0, Lcom/google/android/gms/internal/aq;->d:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    iget-object v1, v1, Lcom/google/android/gms/internal/db;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v2, v2, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v4, v4, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v4, v4, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    iget-object v5, v4, Lcom/google/android/gms/internal/aq;->d:Ljava/util/List;

    move v4, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ay;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/do;Ljava/lang/String;ZLjava/util/List;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->k:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->k:Lcom/google/android/gms/internal/ap;

    iget-object v0, v0, Lcom/google/android/gms/internal/ap;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    iget-object v1, v1, Lcom/google/android/gms/internal/db;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v2, v2, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v4, v4, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v4, v4, Lcom/google/android/gms/internal/do;->k:Lcom/google/android/gms/internal/ap;

    iget-object v5, v4, Lcom/google/android/gms/internal/ap;->e:Ljava/util/List;

    move v4, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ay;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/do;Ljava/lang/String;ZLjava/util/List;)V

    goto/16 :goto_0
.end method

.method private b(Lcom/google/android/gms/internal/do;)Z
    .locals 5

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/do;->j:Z

    if-eqz v0, :cond_5

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/do;->l:Lcom/google/android/gms/internal/bd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->a()Lcom/google/android/gms/a/c;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/a/f;->a(Lcom/google/android/gms/a/c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v3}, Landroid/widget/ViewSwitcher;->getNextView()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v4, v4, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v4, v3}, Landroid/widget/ViewSwitcher;->removeView(Landroid/view/View;)V

    :cond_0
    :try_start_1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/lk;->a(Landroid/view/View;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->getChildCount()I

    move-result v0

    if-le v0, v2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->showNext()V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->getNextView()Landroid/view/View;

    move-result-object v0

    instance-of v3, v0, Lcom/google/android/gms/internal/em;

    if-eqz v3, :cond_6

    check-cast v0, Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v4, v4, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/em;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ab;)V

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->l:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_4

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->l:Lcom/google/android/gms/internal/bd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->c()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0, v1}, Landroid/widget/ViewSwitcher;->setVisibility(I)V

    move v0, v2

    :goto_3
    return v0

    :catch_0
    move-exception v0

    const-string v2, "Could not get View from mediation adapter."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    goto :goto_3

    :catch_1
    move-exception v0

    const-string v2, "Could not add mediation view to view hierarchy."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    goto :goto_3

    :cond_5
    iget-object v0, p1, Lcom/google/android/gms/internal/do;->q:Lcom/google/android/gms/internal/ab;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    iget-object v3, p1, Lcom/google/android/gms/internal/do;->q:Lcom/google/android/gms/internal/ab;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/ab;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->removeAllViews()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    iget-object v3, p1, Lcom/google/android/gms/internal/do;->q:Lcom/google/android/gms/internal/ab;

    iget v3, v3, Lcom/google/android/gms/internal/ab;->h:I

    invoke-virtual {v0, v3}, Landroid/widget/ViewSwitcher;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    iget-object v3, p1, Lcom/google/android/gms/internal/do;->q:Lcom/google/android/gms/internal/ab;

    iget v3, v3, Lcom/google/android/gms/internal/ab;->e:I

    invoke-virtual {v0, v3}, Landroid/widget/ViewSwitcher;->setMinimumHeight(I)V

    iget-object v0, p1, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/lk;->a(Landroid/view/View;)V

    goto/16 :goto_0

    :cond_6
    if-eqz v0, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v3, v0}, Landroid/widget/ViewSwitcher;->removeView(Landroid/view/View;)V

    goto :goto_1

    :catch_2
    move-exception v0

    const-string v0, "Could not destroy previous mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    goto :goto_2
.end method

.method private c(Lcom/google/android/gms/internal/z;)Lcom/google/android/gms/internal/cy;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v5

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v4, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v3, v4, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/ab;->f:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v3}, Landroid/widget/ViewSwitcher;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v3, v0}, Landroid/widget/ViewSwitcher;->getLocationOnScreen([I)V

    aget v3, v0, v2

    aget v4, v0, v1

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v7, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v7, v7, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v7}, Landroid/widget/ViewSwitcher;->getWidth()I

    move-result v7

    iget-object v8, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v8, v8, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v8}, Landroid/widget/ViewSwitcher;->getHeight()I

    move-result v8

    iget-object v9, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v9, v9, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v9}, Landroid/widget/ViewSwitcher;->isShown()Z

    move-result v9

    if-eqz v9, :cond_0

    add-int v9, v3, v7

    if-lez v9, :cond_0

    add-int v9, v4, v8

    if-lez v9, :cond_0

    iget v9, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    if-gt v3, v9, :cond_0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    if-gt v4, v0, :cond_0

    move v0, v1

    :goto_1
    new-instance v1, Landroid/os/Bundle;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(I)V

    const-string v2, "x"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "y"

    invoke-virtual {v1, v2, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "width"

    invoke-virtual {v1, v2, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "height"

    invoke-virtual {v1, v2, v8}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "visible"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/dr;->a()Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    new-instance v2, Lcom/google/android/gms/internal/dp;

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->b:Ljava/lang/String;

    invoke-direct {v2, v7, v3}, Lcom/google/android/gms/internal/dp;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/google/android/gms/internal/ll;->j:Lcom/google/android/gms/internal/dp;

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->j:Lcom/google/android/gms/internal/dp;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/dp;->a(Lcom/google/android/gms/internal/z;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v2, v2, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    invoke-static {v0, v7, v2}, Lcom/google/android/gms/internal/dr;->a(Lcom/google/android/gms/internal/ll;Ljava/lang/String;Landroid/content/Context;)Landroid/os/Bundle;

    move-result-object v10

    new-instance v0, Lcom/google/android/gms/internal/cy;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v2, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v4, v2, Lcom/google/android/gms/internal/ll;->b:Ljava/lang/String;

    sget-object v8, Lcom/google/android/gms/internal/dr;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v9, v2, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    move-object v2, p1

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/cy;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/z;Lcom/google/android/gms/internal/ab;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/db;Landroid/os/Bundle;)V

    return-object v0

    :catch_0
    move-exception v3

    move-object v6, v0

    goto/16 :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    move-object v1, v0

    goto :goto_2
.end method

.method private s()V
    .locals 2

    const-string v0, "Ad finished loading."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    invoke-interface {v0}, Lcom/google/android/gms/internal/d;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdLoaded()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private t()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->destroy()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/a/c;
    .locals 1

    const-string v0, "getAdFrame must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-static {v0}, Lcom/google/android/gms/a/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/c;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ab;)V
    .locals 2

    const-string v0, "setAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iput-object p1, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/ab;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v1}, Landroid/widget/ViewSwitcher;->getNextView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ViewSwitcher;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    iget v1, p1, Lcom/google/android/gms/internal/ab;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewSwitcher;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    iget v1, p1, Lcom/google/android/gms/internal/ab;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewSwitcher;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->requestLayout()V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/d;)V
    .locals 1

    const-string v0, "setAdListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iput-object p1, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/do;)V
    .locals 8

    const-wide/16 v2, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x3

    const/4 v6, -0x2

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iput-object v7, v0, Lcom/google/android/gms/internal/ll;->g:Lcom/google/android/gms/internal/dv;

    iget v0, p1, Lcom/google/android/gms/internal/do;->d:I

    if-eq v0, v6, :cond_0

    iget v0, p1, Lcom/google/android/gms/internal/do;->d:I

    if-eq v0, v5, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    invoke-static {v0}, Lcom/google/android/gms/internal/dr;->a(Lcom/google/android/gms/internal/ll;)V

    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/do;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/internal/do;->a:Lcom/google/android/gms/internal/z;

    iget-object v0, v0, Lcom/google/android/gms/internal/z;->d:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    iget-object v0, p1, Lcom/google/android/gms/internal/do;->a:Lcom/google/android/gms/internal/z;

    iget-object v0, v0, Lcom/google/android/gms/internal/z;->d:Landroid/os/Bundle;

    const-string v1, "_noRefresh"

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ab;->f:Z

    if-eqz v1, :cond_5

    iget-object v0, p1, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    invoke-static {v0}, Lcom/google/android/gms/internal/ea;->a(Landroid/webkit/WebView;)V

    :cond_2
    :goto_2
    iget v0, p1, Lcom/google/android/gms/internal/do;->d:I

    if-ne v0, v5, :cond_3

    iget-object v0, p1, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    iget-object v0, v0, Lcom/google/android/gms/internal/aq;->e:Ljava/util/List;

    if-eqz v0, :cond_3

    const-string v0, "Pinging no fill URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    iget-object v1, v1, Lcom/google/android/gms/internal/db;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v2, Lcom/google/android/gms/internal/ll;->b:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    iget-object v5, v2, Lcom/google/android/gms/internal/aq;->e:Ljava/util/List;

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ay;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/do;Ljava/lang/String;ZLjava/util/List;)V

    :cond_3
    iget v0, p1, Lcom/google/android/gms/internal/do;->d:I

    if-eq v0, v6, :cond_8

    iget v0, p1, Lcom/google/android/gms/internal/do;->d:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/lk;->a(I)V

    goto :goto_0

    :cond_4
    move v0, v4

    goto :goto_1

    :cond_5
    if-nez v0, :cond_2

    iget-wide v0, p1, Lcom/google/android/gms/internal/do;->h:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->c:Lcom/google/android/gms/internal/lm;

    iget-object v1, p1, Lcom/google/android/gms/internal/do;->a:Lcom/google/android/gms/internal/z;

    iget-wide v2, p1, Lcom/google/android/gms/internal/do;->h:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/lm;->a(Lcom/google/android/gms/internal/z;J)V

    goto :goto_2

    :cond_6
    iget-object v0, p1, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_7

    iget-object v0, p1, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    iget-wide v0, v0, Lcom/google/android/gms/internal/aq;->g:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->c:Lcom/google/android/gms/internal/lm;

    iget-object v1, p1, Lcom/google/android/gms/internal/do;->a:Lcom/google/android/gms/internal/z;

    iget-object v2, p1, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    iget-wide v2, v2, Lcom/google/android/gms/internal/aq;->g:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/lm;->a(Lcom/google/android/gms/internal/z;J)V

    goto :goto_2

    :cond_7
    iget-boolean v0, p1, Lcom/google/android/gms/internal/do;->j:Z

    if-nez v0, :cond_2

    iget v0, p1, Lcom/google/android/gms/internal/do;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->c:Lcom/google/android/gms/internal/lm;

    iget-object v1, p1, Lcom/google/android/gms/internal/do;->a:Lcom/google/android/gms/internal/z;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/lm;->a(Lcom/google/android/gms/internal/z;)V

    goto :goto_2

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ab;->f:Z

    if-nez v0, :cond_9

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/lk;->b(Lcom/google/android/gms/internal/do;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/lk;->a(I)V

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->o:Lcom/google/android/gms/internal/at;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->o:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/at;->a(Lcom/google/android/gms/internal/ar;)V

    :cond_a
    iget-object v0, p1, Lcom/google/android/gms/internal/do;->o:Lcom/google/android/gms/internal/at;

    if-eqz v0, :cond_b

    iget-object v0, p1, Lcom/google/android/gms/internal/do;->o:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/at;->a(Lcom/google/android/gms/internal/ar;)V

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iput-object p1, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, p1, Lcom/google/android/gms/internal/do;->q:Lcom/google/android/gms/internal/ab;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, p1, Lcom/google/android/gms/internal/do;->q:Lcom/google/android/gms/internal/ab;

    iput-object v1, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->j:Lcom/google/android/gms/internal/dp;

    iget-wide v2, p1, Lcom/google/android/gms/internal/do;->s:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/dp;->a(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->j:Lcom/google/android/gms/internal/dp;

    iget-wide v2, p1, Lcom/google/android/gms/internal/do;->t:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/dp;->b(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->j:Lcom/google/android/gms/internal/dp;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ab;->f:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/dp;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->j:Lcom/google/android/gms/internal/dp;

    iget-boolean v1, p1, Lcom/google/android/gms/internal/do;->j:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/dp;->b(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ab;->f:Z

    if-nez v0, :cond_d

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/lk;->a(Z)V

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->l:Lcom/google/android/gms/internal/dt;

    if-nez v0, :cond_e

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    new-instance v1, Lcom/google/android/gms/internal/dt;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v2, v2, Lcom/google/android/gms/internal/ll;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/dt;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/ll;->l:Lcom/google/android/gms/internal/dt;

    :cond_e
    iget-object v0, p1, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_f

    iget-object v0, p1, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    iget v0, v0, Lcom/google/android/gms/internal/aq;->h:I

    iget-object v1, p1, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    iget v4, v1, Lcom/google/android/gms/internal/aq;->i:I

    :goto_3
    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->l:Lcom/google/android/gms/internal/dt;

    invoke-virtual {v1, v0, v4}, Lcom/google/android/gms/internal/dt;->a(II)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/lk;->s()V

    goto/16 :goto_0

    :cond_f
    move v0, v4

    goto :goto_3
.end method

.method public final a(Lcom/google/android/gms/internal/m;)V
    .locals 1

    const-string v0, "setAppEventListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iput-object p1, v0, Lcom/google/android/gms/internal/ll;->k:Lcom/google/android/gms/internal/m;

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->k:Lcom/google/android/gms/internal/m;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->k:Lcom/google/android/gms/internal/m;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/m;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call the AppEventListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final a(Lcom/google/android/gms/internal/z;)Z
    .locals 11

    const/4 v9, 0x1

    const/4 v2, 0x0

    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->g:Lcom/google/android/gms/internal/dv;

    if-eqz v0, :cond_1

    const-string v0, "An ad request is already in progress. Aborting."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return v2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ab;->f:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_2

    const-string v0, "An interstitial is already loading. Aborting."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "android.permission.INTERNET"

    invoke-static {v0, v1, v3}, Lcom/google/android/gms/internal/ea;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ab;->f:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    const-string v3, "Missing internet permission in AndroidManifest.xml."

    const-string v4, "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />"

    invoke-static {v0, v1, v3, v4}, Lcom/google/android/gms/internal/eh;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ab;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    move v0, v2

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/internal/ea;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ab;->f:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    const-string v3, "Missing AdActivity with android:configChanges in AndroidManifest.xml."

    const-string v4, "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />"

    invoke-static {v0, v1, v3, v4}, Lcom/google/android/gms/internal/eh;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ab;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    move v0, v2

    :cond_5
    if-nez v0, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ab;->f:Z

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v1, v2}, Landroid/widget/ViewSwitcher;->setVisibility(I)V

    :cond_6
    if-eqz v0, :cond_0

    const-string v0, "Starting ad request."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->c:Lcom/google/android/gms/internal/lm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lm;->a()V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/lk;->c(Lcom/google/android/gms/internal/z;)Lcom/google/android/gms/internal/cy;

    move-result-object v10

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ab;->f:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v4, v3, Lcom/google/android/gms/internal/ll;->d:Lcom/google/android/gms/internal/kz;

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v5, v3, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/em;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ab;ZZLcom/google/android/gms/internal/kz;Lcom/google/android/gms/internal/db;)Lcom/google/android/gms/internal/em;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/em;->e()Lcom/google/android/gms/internal/eo;

    move-result-object v0

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p0

    move-object v4, p0

    move v5, v9

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/eo;->a(Lcom/google/android/gms/internal/lj;Lcom/google/android/gms/internal/bv;Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/ca;Z)V

    move-object v4, v6

    :goto_2
    iget-object v7, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v0, Lcom/google/android/gms/internal/ll;->d:Lcom/google/android/gms/internal/kz;

    iget-object v5, p0, Lcom/google/android/gms/internal/lk;->a:Lcom/google/android/gms/internal/ba;

    new-instance v0, Lcom/google/android/gms/internal/cn;

    move-object v2, v10

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/cn;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/cy;Lcom/google/android/gms/internal/kz;Lcom/google/android/gms/internal/em;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/cm;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cn;->e()V

    iput-object v0, v7, Lcom/google/android/gms/internal/ll;->g:Lcom/google/android/gms/internal/dv;

    move v2, v9

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->getNextView()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/em;

    if-eqz v1, :cond_9

    check-cast v0, Lcom/google/android/gms/internal/em;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/em;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ab;)V

    :cond_8
    :goto_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->e()Lcom/google/android/gms/internal/eo;

    move-result-object v3

    move-object v4, p0

    move-object v5, p0

    move-object v6, p0

    move-object v7, p0

    move v8, v2

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/eo;->a(Lcom/google/android/gms/internal/lj;Lcom/google/android/gms/internal/bv;Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/ca;Z)V

    move-object v4, v0

    goto :goto_2

    :cond_9
    if-eqz v0, :cond_a

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v1, v0}, Landroid/widget/ViewSwitcher;->removeView(Landroid/view/View;)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v4, v3, Lcom/google/android/gms/internal/ll;->d:Lcom/google/android/gms/internal/kz;

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v5, v3, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/em;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ab;ZZLcom/google/android/gms/internal/kz;Lcom/google/android/gms/internal/db;)Lcom/google/android/gms/internal/em;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-object v1, v1, Lcom/google/android/gms/internal/ab;->i:[Lcom/google/android/gms/internal/ab;

    if-nez v1, :cond_8

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/lk;->a(Landroid/view/View;)V

    goto :goto_3

    :cond_b
    move v0, v9

    goto/16 :goto_1
.end method

.method public final b()V
    .locals 2

    const/4 v1, 0x0

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iput-object v1, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iput-object v1, v0, Lcom/google/android/gms/internal/ll;->k:Lcom/google/android/gms/internal/m;

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->c:Lcom/google/android/gms/internal/lm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lm;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lk;->g()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->removeAllViews()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->destroy()V

    :cond_1
    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/z;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ea;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lk;->a(Lcom/google/android/gms/internal/z;)Z

    :goto_0
    return-void

    :cond_0
    const-string v0, "Ad is not visible. Not refreshing ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->c:Lcom/google/android/gms/internal/lm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lm;->a(Lcom/google/android/gms/internal/z;)V

    goto :goto_0
.end method

.method public final c()Z
    .locals 1

    const-string v0, "isLoaded must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->g:Lcom/google/android/gms/internal/dv;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()V
    .locals 1

    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    invoke-static {v0}, Lcom/google/android/gms/internal/ea;->a(Landroid/webkit/WebView;)V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 1

    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    invoke-static {v0}, Lcom/google/android/gms/internal/ea;->b(Landroid/webkit/WebView;)V

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 7

    const-string v0, "showInterstitial must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ab;->f:Z

    if-nez v0, :cond_0

    const-string v0, "Cannot call showInterstitial on a banner ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-nez v0, :cond_1

    const-string v0, "The interstitial has not loaded."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "The interstitial is already showing."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/do;->j:Z

    if-eqz v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->l:Lcom/google/android/gms/internal/bd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/lk;->t()V

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/bq;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v4, v1, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget v5, v1, Lcom/google/android/gms/internal/do;->g:I

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v6, v1, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    move-object v1, p0

    move-object v2, p0

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/bq;-><init>(Lcom/google/android/gms/internal/lj;Lcom/google/android/gms/internal/bv;Lcom/google/android/gms/internal/ca;Lcom/google/android/gms/internal/em;ILcom/google/android/gms/internal/db;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/bp;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bq;)V

    goto :goto_0
.end method

.method public final g()V
    .locals 2

    const-string v0, "stopLoading must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->b:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->stopLoading()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->g:Lcom/google/android/gms/internal/dv;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->g:Lcom/google/android/gms/internal/dv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dv;->f()V

    :cond_1
    return-void
.end method

.method public final h()V
    .locals 3

    const-string v0, "recordManualImpression must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping manual tracking URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging manual tracking URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    iget-object v1, v1, Lcom/google/android/gms/internal/db;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v2, v2, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v2, v2, Lcom/google/android/gms/internal/do;->f:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ea;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0
.end method

.method public final i()Lcom/google/android/gms/internal/ab;
    .locals 1

    const-string v0, "getAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    return-object v0
.end method

.method public final j()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lk;->r()V

    return-void
.end method

.method public final k()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lk;->o()V

    return-void
.end method

.method public final l()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lk;->q()V

    return-void
.end method

.method public final m()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lk;->p()V

    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Mediation adapter "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v1, v1, Lcom/google/android/gms/internal/do;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " refreshed, but mediation adapters should never refresh."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/lk;->a(Z)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/lk;->s()V

    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ab;->f:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/lk;->t()V

    :cond_0
    const-string v0, "Ad closing."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    invoke-interface {v0}, Lcom/google/android/gms/internal/d;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->j:Lcom/google/android/gms/internal/dp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dp;->c()V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdClosed()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ab;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/lk;->a(Z)V

    :cond_0
    const-string v0, "Ad opening."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    invoke-interface {v0}, Lcom/google/android/gms/internal/d;->d()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdOpened()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final q()V
    .locals 2

    const-string v0, "Ad leaving application."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->f:Lcom/google/android/gms/internal/d;

    invoke-interface {v0}, Lcom/google/android/gms/internal/d;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdLeftApplication()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final r()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping click URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging click URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->j:Lcom/google/android/gms/internal/dp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dp;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->c:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    iget-object v1, v1, Lcom/google/android/gms/internal/db;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v2, v2, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v2, v2, Lcom/google/android/gms/internal/do;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ea;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v0, v0, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    iget-object v0, v0, Lcom/google/android/gms/internal/aq;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v0, v0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v1, v1, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    iget-object v1, v1, Lcom/google/android/gms/internal/db;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v2, v2, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v3, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v3, v3, Lcom/google/android/gms/internal/ll;->b:Ljava/lang/String;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/internal/lk;->b:Lcom/google/android/gms/internal/ll;

    iget-object v5, v5, Lcom/google/android/gms/internal/ll;->i:Lcom/google/android/gms/internal/do;

    iget-object v5, v5, Lcom/google/android/gms/internal/do;->n:Lcom/google/android/gms/internal/aq;

    iget-object v5, v5, Lcom/google/android/gms/internal/aq;->c:Ljava/util/List;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ay;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/do;Ljava/lang/String;ZLjava/util/List;)V

    goto :goto_0
.end method
