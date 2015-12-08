.class final Lcom/jeremyfeinstein/slidingmenu/lib/app/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/jeremyfeinstein/slidingmenu/lib/app/a;

.field private final synthetic b:Z

.field private final synthetic c:Z


# direct methods
.method constructor <init>(Lcom/jeremyfeinstein/slidingmenu/lib/app/a;ZZ)V
    .locals 0

    iput-object p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/b;->a:Lcom/jeremyfeinstein/slidingmenu/lib/app/a;

    iput-boolean p2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/b;->b:Z

    iput-boolean p3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/b;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    const/4 v1, 0x0

    iget-boolean v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/b;->b:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/b;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/b;->a:Lcom/jeremyfeinstein/slidingmenu/lib/app/a;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->a(Lcom/jeremyfeinstein/slidingmenu/lib/app/a;)Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->d()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/b;->a:Lcom/jeremyfeinstein/slidingmenu/lib/app/a;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->a(Lcom/jeremyfeinstein/slidingmenu/lib/app/a;)Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->a(Z)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/app/b;->a:Lcom/jeremyfeinstein/slidingmenu/lib/app/a;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/app/a;->a(Lcom/jeremyfeinstein/slidingmenu/lib/app/a;)Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->b(Z)V

    goto :goto_0
.end method
