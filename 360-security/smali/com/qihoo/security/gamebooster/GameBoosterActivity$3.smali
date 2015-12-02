.class Lcom/qihoo/security/gamebooster/GameBoosterActivity$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;->h()V
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
    .line 345
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$3;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 349
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$3;->a:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->c()V

    .line 350
    return-void
.end method
