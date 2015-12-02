.class public Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field a:I

.field public b:Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 1009
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1010
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->a:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 1015
    iget v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->a:I

    return v0
.end method

.method public a(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 1024
    const/4 v0, -0x1

    return v0
.end method

.method public a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V
    .locals 0

    .prologue
    .line 1019
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;

    .line 1021
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1028
    const/4 v0, 0x0

    return-object v0
.end method
