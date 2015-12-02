.class Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Landroid/app/Activity;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/i;

.field final synthetic b:Lcom/qihoo/security/gamebooster/GamesBoostFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/GamesBoostFragment;Lcom/qihoo/security/dialog/i;)V
    .locals 0

    .prologue
    .line 204
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;->b:Lcom/qihoo/security/gamebooster/GamesBoostFragment;

    iput-object p2, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;->a:Lcom/qihoo/security/dialog/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 207
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;->b:Lcom/qihoo/security/gamebooster/GamesBoostFragment;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Lcom/qihoo/security/gamebooster/GamesBoostFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 208
    const/16 v0, 0x2b6b

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 209
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;->b:Lcom/qihoo/security/gamebooster/GamesBoostFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Lcom/qihoo/security/gamebooster/GamesBoostFragment;Z)Z

    .line 210
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c009b

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    .line 216
    :goto_0
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "game_booster_show_toast"

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;->b:Lcom/qihoo/security/gamebooster/GamesBoostFragment;

    invoke-static {v2}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Lcom/qihoo/security/gamebooster/GamesBoostFragment;)Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 218
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;->b:Lcom/qihoo/security/gamebooster/GamesBoostFragment;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;->b:Lcom/qihoo/security/gamebooster/GamesBoostFragment;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->b(Lcom/qihoo/security/gamebooster/GamesBoostFragment;)Landroid/view/Menu;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Lcom/qihoo/security/gamebooster/GamesBoostFragment;Landroid/view/Menu;)V

    .line 219
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;->a:Lcom/qihoo/security/dialog/i;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->b(Landroid/app/Dialog;)V

    .line 220
    return-void

    .line 212
    :cond_0
    const/16 v0, 0x2b6d

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 213
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;->b:Lcom/qihoo/security/gamebooster/GamesBoostFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Lcom/qihoo/security/gamebooster/GamesBoostFragment;Z)Z

    .line 214
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c009d

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0
.end method
