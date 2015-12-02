.class Lcom/qihoo/security/adv/AdvDataManager$12;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/k$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/adv/AdvDataManager;->a(Lorg/json/JSONArray;Lcom/qihoo/security/adv/AdvDataManager$c;)V
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
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/adv/AdvDataManager$c;

.field final synthetic b:Lcom/qihoo/security/adv/AdvDataManager;


# direct methods
.method constructor <init>(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$c;)V
    .locals 0

    .prologue
    .line 1188
    iput-object p1, p0, Lcom/qihoo/security/adv/AdvDataManager$12;->b:Lcom/qihoo/security/adv/AdvDataManager;

    iput-object p2, p0, Lcom/qihoo/security/adv/AdvDataManager$12;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1188
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/adv/AdvDataManager$12;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 8

    .prologue
    const-wide/16 v6, -0x1

    .line 1192
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$12;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    if-nez v0, :cond_0

    .line 1216
    :goto_0
    return-void

    .line 1195
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1197
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1198
    const-string/jumbo v1, "result"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    .line 1199
    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1200
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$12;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1208
    :catch_0
    move-exception v0

    .line 1209
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$12;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x2713

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    .line 1206
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager$12;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    const-wide/16 v2, -0x1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-wide/16 v4, -0x1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 1213
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$12;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x2710

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0
.end method
