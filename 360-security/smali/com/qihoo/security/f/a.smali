.class public Lcom/qihoo/security/f/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field public a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/qihoo/security/f/a;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 24
    iput-object p2, p0, Lcom/qihoo/security/f/a;->b:Ljava/util/List;

    .line 25
    return-void
.end method
