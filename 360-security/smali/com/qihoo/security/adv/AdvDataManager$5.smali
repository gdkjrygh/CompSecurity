.class Lcom/qihoo/security/adv/AdvDataManager$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$c;Lcom/qihoo/security/adv/AdvDataManager$a;Lcom/qihoo/security/adv/AdvDataManager$AdvType;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/adv/AdvDataManager$c;

.field final synthetic b:Lcom/qihoo/security/adv/AdvDataManager$a;

.field final synthetic c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field final synthetic d:J

.field final synthetic e:Lcom/qihoo/security/adv/AdvDataManager;


# direct methods
.method constructor <init>(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$c;Lcom/qihoo/security/adv/AdvDataManager$a;Lcom/qihoo/security/adv/AdvDataManager$AdvType;J)V
    .locals 1

    .prologue
    .line 1428
    iput-object p1, p0, Lcom/qihoo/security/adv/AdvDataManager$5;->e:Lcom/qihoo/security/adv/AdvDataManager;

    iput-object p2, p0, Lcom/qihoo/security/adv/AdvDataManager$5;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    iput-object p3, p0, Lcom/qihoo/security/adv/AdvDataManager$5;->b:Lcom/qihoo/security/adv/AdvDataManager$a;

    iput-object p4, p0, Lcom/qihoo/security/adv/AdvDataManager$5;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iput-wide p5, p0, Lcom/qihoo/security/adv/AdvDataManager$5;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 1432
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$5;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager$5;->b:Lcom/qihoo/security/adv/AdvDataManager$a;

    iget-object v2, p0, Lcom/qihoo/security/adv/AdvDataManager$5;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-wide v4, p0, Lcom/qihoo/security/adv/AdvDataManager$5;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1433
    return-void
.end method
