.class final Lcom/arist/activity/u;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/u;->a:Lcom/arist/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/u;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->j(Lcom/arist/activity/MainActivity;)Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->f()V

    return-void
.end method
