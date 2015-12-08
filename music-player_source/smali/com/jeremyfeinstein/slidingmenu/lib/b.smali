.class final Lcom/jeremyfeinstein/slidingmenu/lib/b;
.super Lcom/jeremyfeinstein/slidingmenu/lib/d;


# instance fields
.field final synthetic a:Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;


# direct methods
.method constructor <init>(Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;)V
    .locals 0

    iput-object p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/b;->a:Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;

    invoke-direct {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/b;->a:Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;->a(Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;)Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;

    move-result-object v0

    if-eqz v0, :cond_0

    packed-switch p1, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/b;->a:Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;->a(Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;)Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->a(Z)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/b;->a:Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;

    invoke-static {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;->a(Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;)Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->a(Z)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
