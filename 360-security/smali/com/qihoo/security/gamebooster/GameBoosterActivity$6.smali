.class Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Ljava/lang/String;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1447
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iput-object p2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 1451
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1469
    :cond_0
    :goto_0
    return-void

    .line 1454
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->e(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1457
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->f(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->getCount()I

    move-result v1

    .line 1458
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v1, :cond_0

    .line 1459
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->f(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$c;->a(I)Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;

    move-result-object v2

    .line 1460
    iget-object v3, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iget-object v4, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->a:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->a(Ljava/lang/String;)I

    move-result v2

    invoke-static {v3, v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;I)I

    .line 1461
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->g(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)I

    move-result v2

    if-ltz v2, :cond_2

    .line 1462
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->e(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->a(I)V

    .line 1463
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1, v0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity;I)I

    .line 1464
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->b:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$6;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 1458
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method
