.class Lcom/qihoo/security/gamebooster/GameBoosterActivity$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V
    .locals 0

    .prologue
    .line 682
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$4;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 686
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c0084

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->h()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 688
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$4;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1, v0, p2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 689
    return-void
.end method
