.class Lcom/qihoo/security/adv/AdvDataManager$4;
.super Lcom/android/volley/toolbox/l;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/adv/AdvDataManager;


# direct methods
.method constructor <init>(Lcom/qihoo/security/adv/AdvDataManager;ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/k$b;Lcom/android/volley/k$a;)V
    .locals 6

    .prologue
    .line 1293
    iput-object p1, p0, Lcom/qihoo/security/adv/AdvDataManager$4;->a:Lcom/qihoo/security/adv/AdvDataManager;

    move-object v0, p0

    move v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/android/volley/toolbox/l;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/k$b;Lcom/android/volley/k$a;)V

    return-void
.end method


# virtual methods
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
    .line 1296
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1297
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager$4;->a:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-static {v1}, Lcom/qihoo/security/adv/AdvDataManager;->d(Lcom/qihoo/security/adv/AdvDataManager;)Ljava/lang/String;

    move-result-object v1

    .line 1298
    const-string/jumbo v2, "ADAPPINFO"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1302
    return-object v0
.end method
