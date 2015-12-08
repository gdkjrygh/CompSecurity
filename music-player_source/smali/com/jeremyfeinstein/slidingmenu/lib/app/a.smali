.class public final Lcom/jeremyfeinstein/slidingmenu/lib/app/a;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:Z

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->e:Z

    iput-boolean v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->f:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->g:Z

    iput-object p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->a:Landroid/app/Activity;

    return-void
.end method

.method static synthetic a(Lcom/jeremyfeinstein/slidingmenu/lib/app/a;)Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;
    .locals 1

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->b:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    return-object v0
.end method


# virtual methods
.method public final a(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->b:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->b:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-virtual {v0, p1}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->a:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/jeremyfeinstein/slidingmenu/lib/g;->a:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    iput-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->b:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->d:Landroid/view/View;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->c:Landroid/view/View;

    if-nez v2, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Both setBehindContentView must be called in onCreate in addition to setContentView."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-boolean v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->f:Z

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->b:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    iget-object v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->a:Landroid/app/Activity;

    iget-boolean v4, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->g:Z

    if-eqz v4, :cond_2

    move v0, v1

    :cond_2
    invoke-virtual {v2, v3, v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->a(Landroid/app/Activity;I)V

    if-eqz p1, :cond_3

    const-string v0, "SlidingActivityHelper.open"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    const-string v0, "SlidingActivityHelper.secondary"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    :goto_0
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/jeremyfeinstein/slidingmenu/lib/app/b;

    invoke-direct {v3, p0, v1, v0}, Lcom/jeremyfeinstein/slidingmenu/lib/app/b;-><init>(Lcom/jeremyfeinstein/slidingmenu/lib/app/a;ZZ)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public final a(Landroid/view/View;)V
    .locals 1

    iget-boolean v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->e:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->c:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "SlidingActivityHelper.open"

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->b:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-virtual {v1}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->g()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "SlidingActivityHelper.secondary"

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->b:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-virtual {v1}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->h()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    iput-object p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->d:Landroid/view/View;

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->b:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->a(Landroid/view/View;)V

    return-void
.end method

.method public final b(I)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->b:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-virtual {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->b:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-virtual {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->e()V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
