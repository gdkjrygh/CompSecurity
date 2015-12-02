.class Lcom/qihoo/security/gamebooster/GamesBoostFragment$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Landroid/app/Activity;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/i;

.field final synthetic b:Lcom/qihoo/security/gamebooster/GamesBoostFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/GamesBoostFragment;Lcom/qihoo/security/dialog/i;)V
    .locals 0

    .prologue
    .line 221
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$3;->b:Lcom/qihoo/security/gamebooster/GamesBoostFragment;

    iput-object p2, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$3;->a:Lcom/qihoo/security/dialog/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$3;->a:Lcom/qihoo/security/dialog/i;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->b(Landroid/app/Dialog;)V

    .line 225
    return-void
.end method
