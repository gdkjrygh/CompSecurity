.class Lcom/qihoo/security/ui/result/d$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/d;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/result/d;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/d;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/qihoo/security/ui/result/d$1;->a:Lcom/qihoo/security/ui/result/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 63
    invoke-static {}, Lcom/qihoo/security/gamebooster/d;->a()Landroid/util/Pair;

    move-result-object v1

    .line 64
    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 77
    :goto_0
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d$1;->a:Lcom/qihoo/security/ui/result/d;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/d;->b(Lcom/qihoo/security/ui/result/d;)Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "sp_key_game_booster_card_type"

    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v2, v3, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 78
    return-void

    .line 66
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d$1;->a:Lcom/qihoo/security/ui/result/d;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/d;->a(Lcom/qihoo/security/ui/result/d;)Ljava/util/List;

    move-result-object v2

    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 71
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d$1;->a:Lcom/qihoo/security/ui/result/d;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/d;->a(Lcom/qihoo/security/ui/result/d;)Ljava/util/List;

    move-result-object v2

    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 64
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
