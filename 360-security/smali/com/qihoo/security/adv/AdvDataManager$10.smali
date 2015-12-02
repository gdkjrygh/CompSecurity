.class Lcom/qihoo/security/adv/AdvDataManager$10;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/adv/AdvDataManager;->a(JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/ref/WeakReference;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field final synthetic d:J

.field final synthetic e:Lcom/qihoo/security/adv/AdvDataManager;


# direct methods
.method constructor <init>(Lcom/qihoo/security/adv/AdvDataManager;Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/qihoo/security/adv/AdvDataManager$AdvType;J)V
    .locals 1

    .prologue
    .line 912
    iput-object p1, p0, Lcom/qihoo/security/adv/AdvDataManager$10;->e:Lcom/qihoo/security/adv/AdvDataManager;

    iput-object p2, p0, Lcom/qihoo/security/adv/AdvDataManager$10;->a:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/qihoo/security/adv/AdvDataManager$10;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/qihoo/security/adv/AdvDataManager$10;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iput-wide p5, p0, Lcom/qihoo/security/adv/AdvDataManager$10;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/volley/VolleyError;)V
    .locals 6

    .prologue
    .line 916
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$10;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/AdvDataManager$c;

    .line 917
    const/16 v1, 0x2710

    .line 918
    instance-of v2, p1, Lcom/android/volley/ParseError;

    if-eqz v2, :cond_0

    .line 920
    const-wide/16 v2, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    add-long/2addr v2, v4

    .line 921
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager$10;->e:Lcom/qihoo/security/adv/AdvDataManager;

    iget-object v4, p0, Lcom/qihoo/security/adv/AdvDataManager$10;->b:Ljava/lang/String;

    invoke-static {v1, v4, v2, v3}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager;Ljava/lang/String;J)V

    .line 922
    const/16 v1, 0x2713

    .line 927
    :cond_0
    instance-of v2, p1, Lcom/android/volley/TimeoutError;

    if-eqz v2, :cond_1

    .line 928
    const/16 v1, 0x2711

    .line 930
    :cond_1
    if-eqz v0, :cond_2

    .line 931
    iget-object v2, p0, Lcom/qihoo/security/adv/AdvDataManager$10;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-wide v4, p0, Lcom/qihoo/security/adv/AdvDataManager$10;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v2, v3, v1}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 934
    :cond_2
    return-void
.end method
