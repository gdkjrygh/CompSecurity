.class final Lcom/arist/activity/w;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/view/bo;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/w;->a:Lcom/arist/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    const/4 v4, 0x1

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/arist/activity/w;->a:Lcom/arist/activity/MainActivity;

    iput p1, v1, Lcom/arist/activity/MainActivity;->a:I

    iget-object v1, p0, Lcom/arist/activity/w;->a:Lcom/arist/activity/MainActivity;

    iget v1, v1, Lcom/arist/activity/MainActivity;->a:I

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/arist/activity/w;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->j(Lcom/arist/activity/MainActivity;)Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->a(I)V

    :goto_0
    iget-object v1, p0, Lcom/arist/activity/w;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->k(Lcom/arist/activity/MainActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v2, v1, [I

    :goto_1
    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/arist/activity/w;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0, v1, v2}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;I[I)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/arist/activity/w;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->j(Lcom/arist/activity/MainActivity;)Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->a(I)V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/arist/activity/w;->a:Lcom/arist/activity/MainActivity;

    iget v3, v3, Lcom/arist/activity/MainActivity;->a:I

    if-ne v0, v3, :cond_2

    aput v4, v2, v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public final a(IF)V
    .locals 0

    return-void
.end method

.method public final b(I)V
    .locals 0

    return-void
.end method
