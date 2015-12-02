.class Lcom/qihoo/security/adv/AdvDataManager$8;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/adv/AdvDataManager;->b(Lcom/qihoo/security/adv/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/qihoo/security/adv/AdvDataManager;


# direct methods
.method constructor <init>(Lcom/qihoo/security/adv/AdvDataManager;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 566
    iput-object p1, p0, Lcom/qihoo/security/adv/AdvDataManager$8;->b:Lcom/qihoo/security/adv/AdvDataManager;

    iput-object p2, p0, Lcom/qihoo/security/adv/AdvDataManager$8;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 571
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager$8;->b:Lcom/qihoo/security/adv/AdvDataManager;

    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager$8;->a:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager;Ljava/util/List;)V

    .line 572
    return-void
.end method
