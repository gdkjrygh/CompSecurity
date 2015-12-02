.class Lcom/qihoo/security/adv/AdvDataManager$13;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/adv/AdvDataManager;->a(Lorg/json/JSONArray;Lcom/qihoo/security/adv/AdvDataManager$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/adv/AdvDataManager$c;

.field final synthetic b:Lcom/qihoo/security/adv/AdvDataManager;


# direct methods
.method constructor <init>(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$c;)V
    .locals 0

    .prologue
    .line 1217
    iput-object p1, p0, Lcom/qihoo/security/adv/AdvDataManager$13;->b:Lcom/qihoo/security/adv/AdvDataManager;

    iput-object p2, p0, Lcom/qihoo/security/adv/AdvDataManager$13;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/volley/VolleyError;)V
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    .line 1224
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$13;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    if-eqz v0, :cond_0

    .line 1225
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$13;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x2710

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1227
    :cond_0
    return-void
.end method
