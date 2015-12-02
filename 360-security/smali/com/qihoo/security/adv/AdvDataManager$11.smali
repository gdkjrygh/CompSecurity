.class Lcom/qihoo/security/adv/AdvDataManager$11;
.super Lcom/android/volley/toolbox/i;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/adv/AdvDataManager;->a(JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/qihoo/security/adv/AdvDataManager;


# direct methods
.method constructor <init>(Lcom/qihoo/security/adv/AdvDataManager;ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/k$b;Lcom/android/volley/k$a;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 935
    iput-object p1, p0, Lcom/qihoo/security/adv/AdvDataManager$11;->b:Lcom/qihoo/security/adv/AdvDataManager;

    iput-object p7, p0, Lcom/qihoo/security/adv/AdvDataManager$11;->a:Ljava/lang/String;

    move-object v0, p0

    move v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/android/volley/toolbox/i;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/k$b;Lcom/android/volley/k$a;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/android/volley/i;)Lcom/android/volley/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/i;",
            ")",
            "Lcom/android/volley/k",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 949
    if-eqz p1, :cond_0

    .line 950
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->e()Ljava/util/Map;

    move-result-object v0

    iget v1, p1, Lcom/android/volley/i;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 951
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->e()Ljava/util/Map;

    move-result-object v0

    iget v1, p1, Lcom/android/volley/i;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 952
    int-to-long v0, v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v0, v2

    .line 956
    iget-object v2, p0, Lcom/qihoo/security/adv/AdvDataManager$11;->b:Lcom/qihoo/security/adv/AdvDataManager;

    iget-object v3, p0, Lcom/qihoo/security/adv/AdvDataManager$11;->a:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager;Ljava/lang/String;J)V

    .line 960
    :cond_0
    invoke-super {p0, p1}, Lcom/android/volley/toolbox/i;->a(Lcom/android/volley/i;)Lcom/android/volley/k;

    move-result-object v0

    .line 961
    return-object v0
.end method

.method public i()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/volley/AuthFailureError;
        }
    .end annotation

    .prologue
    .line 938
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 939
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager$11;->b:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v1}, Lcom/qihoo/security/adv/AdvDataManager;->d(Lcom/qihoo/security/adv/AdvDataManager;)Ljava/lang/String;

    move-result-object v1

    .line 940
    const-string/jumbo v2, "ADAPPINFO"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 944
    return-object v0
.end method
