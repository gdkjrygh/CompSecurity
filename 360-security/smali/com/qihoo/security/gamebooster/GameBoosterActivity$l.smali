.class public Lcom/qihoo/security/gamebooster/GameBoosterActivity$l;
.super Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# instance fields
.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1241
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;-><init>()V

    .line 1242
    const/4 v0, 0x4

    iput v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$l;->a:I

    .line 1243
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$l;->c:Ljava/lang/String;

    .line 1244
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V
    .locals 2

    .prologue
    .line 1248
    invoke-super {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V

    .line 1249
    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->q(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1250
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->q(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$l;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1252
    :cond_0
    return-void
.end method
