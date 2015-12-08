.class final Lcom/jeremyfeinstein/slidingmenu/lib/i;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/jeremyfeinstein/slidingmenu/lib/c;


# instance fields
.field final synthetic a:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;


# direct methods
.method constructor <init>(Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;)V
    .locals 0

    iput-object p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/i;->a:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/i;->a:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->a(Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;)Lcom/jeremyfeinstein/slidingmenu/lib/n;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/i;->a:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->a(Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;)Lcom/jeremyfeinstein/slidingmenu/lib/n;

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/i;->a:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->b(Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;)Lcom/jeremyfeinstein/slidingmenu/lib/l;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/i;->a:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->b(Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;)Lcom/jeremyfeinstein/slidingmenu/lib/l;

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/i;->a:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->c(Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;)Lcom/jeremyfeinstein/slidingmenu/lib/n;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/i;->a:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->c(Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;)Lcom/jeremyfeinstein/slidingmenu/lib/n;

    goto :goto_0
.end method
