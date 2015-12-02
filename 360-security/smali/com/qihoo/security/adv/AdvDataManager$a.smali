.class public Lcom/qihoo/security/adv/AdvDataManager$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/adv/AdvDataManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/qihoo/security/adv/a;

.field public b:I


# direct methods
.method public constructor <init>(Lcom/qihoo/security/adv/a;I)V
    .locals 0

    .prologue
    .line 1459
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1460
    iput-object p1, p0, Lcom/qihoo/security/adv/AdvDataManager$a;->a:Lcom/qihoo/security/adv/a;

    .line 1461
    iput p2, p0, Lcom/qihoo/security/adv/AdvDataManager$a;->b:I

    .line 1462
    return-void
.end method
