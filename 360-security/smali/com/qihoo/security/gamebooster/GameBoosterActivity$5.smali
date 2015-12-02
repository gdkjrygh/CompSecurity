.class Lcom/qihoo/security/gamebooster/GameBoosterActivity$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/qihoo/security/gamebooster/GameBoosterActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 696
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$5;->c:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iput-object p2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$5;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$5;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 700
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$5;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(Ljava/lang/CharSequence;)V

    .line 701
    const/16 v0, 0x2b68

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$5;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 702
    return-void
.end method
