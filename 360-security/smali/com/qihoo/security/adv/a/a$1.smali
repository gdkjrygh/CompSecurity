.class Lcom/qihoo/security/adv/a/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/adv/AdvDataManager$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/adv/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/qihoo/security/adv/AdvDataManager$c",
        "<",
        "Lcom/qihoo/security/adv/AdvDataManager$a;",
        "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/adv/a/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/adv/a/a;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/qihoo/security/adv/a/a$1;->a:Lcom/qihoo/security/adv/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/Long;)V
    .locals 0

    .prologue
    .line 94
    invoke-static {p1}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 95
    return-void
.end method

.method public a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/Long;I)V
    .locals 6

    .prologue
    .line 122
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/f/a;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v1, p1, v2}, Lcom/qihoo/security/f/a;-><init>(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    .line 123
    const/4 v0, 0x1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {p1, v0, p3, v2, v3}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;IIJ)V

    .line 125
    return-void
.end method

.method public a(Lcom/qihoo/security/adv/AdvDataManager$a;Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/Long;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 99
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 101
    if-eqz p1, :cond_2

    iget-object v1, p1, Lcom/qihoo/security/adv/AdvDataManager$a;->a:Lcom/qihoo/security/adv/a;

    if-eqz v1, :cond_2

    .line 102
    iget-object v0, p1, Lcom/qihoo/security/adv/AdvDataManager$a;->a:Lcom/qihoo/security/adv/a;

    .line 103
    invoke-virtual {p2}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->isShouldCache()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 104
    invoke-virtual {v0}, Lcom/qihoo/security/adv/a;->e()Lcom/qihoo/security/adv/a;

    move-result-object v0

    .line 106
    :cond_0
    invoke-virtual {v0}, Lcom/qihoo/security/adv/a;->c()Ljava/util/List;

    move-result-object v1

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a$1;->a:Lcom/qihoo/security/adv/a/a;

    invoke-static {v0}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/a/a;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {p2}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a$1;->a:Lcom/qihoo/security/adv/a/a;

    iget-object v2, p1, Lcom/qihoo/security/adv/AdvDataManager$a;->a:Lcom/qihoo/security/adv/a;

    invoke-virtual {v2}, Lcom/qihoo/security/adv/a;->c()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2, p2}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/a/a;Ljava/util/List;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a$1;->a:Lcom/qihoo/security/adv/a/a;

    invoke-static {v0}, Lcom/qihoo/security/adv/a/a;->b(Lcom/qihoo/security/adv/a/a;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {p2}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p1, Lcom/qihoo/security/adv/AdvDataManager$a;->a:Lcom/qihoo/security/adv/a;

    invoke-virtual {v0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    :cond_1
    iget-object v0, p1, Lcom/qihoo/security/adv/AdvDataManager$a;->a:Lcom/qihoo/security/adv/a;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/a;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {p2, v6, v0, v2, v3}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;IIJ)V

    move-object v0, v1

    .line 117
    :goto_0
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/f/a;

    invoke-direct {v2, p2, v0}, Lcom/qihoo/security/f/a;-><init>(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    .line 118
    return-void

    .line 114
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {p2, v6, v6, v2, v3}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;IIJ)V

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 91
    check-cast p1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/adv/a/a$1;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/Long;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .prologue
    .line 91
    check-cast p1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2, p3}, Lcom/qihoo/security/adv/a/a$1;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/Long;I)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 91
    check-cast p1, Lcom/qihoo/security/adv/AdvDataManager$a;

    check-cast p2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2, p3}, Lcom/qihoo/security/adv/a/a$1;->a(Lcom/qihoo/security/adv/AdvDataManager$a;Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/Long;)V

    return-void
.end method
