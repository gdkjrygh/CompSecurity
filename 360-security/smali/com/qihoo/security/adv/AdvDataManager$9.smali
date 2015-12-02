.class Lcom/qihoo/security/adv/AdvDataManager$9;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/k$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/adv/AdvDataManager;->a(JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/volley/k$b",
        "<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field final synthetic b:Ljava/lang/ref/WeakReference;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:J

.field final synthetic e:Lcom/qihoo/security/adv/AdvDataManager;


# direct methods
.method constructor <init>(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/ref/WeakReference;Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 862
    iput-object p1, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->e:Lcom/qihoo/security/adv/AdvDataManager;

    iput-object p2, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iput-object p3, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->b:Ljava/lang/ref/WeakReference;

    iput-object p4, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->c:Ljava/lang/String;

    iput-wide p5, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 862
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/adv/AdvDataManager$9;->a(Lorg/json/JSONObject;)V

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 7

    .prologue
    .line 869
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/adv/AdvDataManager$c;

    .line 870
    if-eqz p1, :cond_1

    .line 872
    :try_start_0
    const-string/jumbo v0, "responseTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 875
    :goto_0
    const-string/jumbo v0, "result"

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 879
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->d()Ljava/util/Map;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 880
    const-string/jumbo v2, "expired"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    .line 881
    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    add-long/2addr v2, v4

    .line 882
    iget-object v4, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->e:Lcom/qihoo/security/adv/AdvDataManager;

    iget-object v5, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->c:Ljava/lang/String;

    invoke-static {v4, v5, v2, v3}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager;Ljava/lang/String;J)V

    .line 887
    if-eqz v1, :cond_0

    .line 888
    iget-object v4, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v4, v2, v0}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 910
    :cond_0
    :goto_1
    return-void

    .line 895
    :cond_1
    invoke-static {p1}, Lcom/qihoo/security/adv/b;->a(Lorg/json/JSONObject;)Lcom/qihoo/security/adv/a;

    move-result-object v6

    .line 896
    if-eqz v6, :cond_2

    .line 897
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 898
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->e:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v0}, Lcom/qihoo/security/adv/AdvDataManager;->b(Lcom/qihoo/security/adv/AdvDataManager;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 901
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->e:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v0, v6}, Lcom/qihoo/security/adv/AdvDataManager;->c(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/a;)V

    .line 902
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->e:Lcom/qihoo/security/adv/AdvDataManager;

    new-instance v2, Lcom/qihoo/security/adv/AdvDataManager$a;

    const/4 v3, 0x1

    invoke-direct {v2, v6, v3}, Lcom/qihoo/security/adv/AdvDataManager$a;-><init>(Lcom/qihoo/security/adv/a;I)V

    iget-object v3, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-wide v4, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->d:J

    invoke-virtual/range {v0 .. v5}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$c;Lcom/qihoo/security/adv/AdvDataManager$a;Lcom/qihoo/security/adv/AdvDataManager$AdvType;J)V

    .line 903
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/security/adv/AdvDataManager$b;-><init>(Lcom/qihoo/security/adv/AdvDataManager$1;)V

    .line 904
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iput-object v1, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 905
    iget-wide v2, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->d:J

    iput-wide v2, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->b:J

    .line 906
    iput-object p1, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->d:Lorg/json/JSONObject;

    .line 907
    iput-object v6, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->e:Lcom/qihoo/security/adv/a;

    .line 908
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->e:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v1}, Lcom/qihoo/security/adv/AdvDataManager;->c(Lcom/qihoo/security/adv/AdvDataManager;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/adv/AdvDataManager$9;->e:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v2}, Lcom/qihoo/security/adv/AdvDataManager;->c(Lcom/qihoo/security/adv/AdvDataManager;)Landroid/os/Handler;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_1

    .line 873
    :catch_0
    move-exception v0

    goto/16 :goto_0
.end method
